package stack;

import java.util.LinkedList;
import java.util.Queue;

/*다리를 지나는 트럭 
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class DariReoJiNaNeonTruck {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println("모든 트럭이 다리를 건너는 데 최소 " + solution2(bridge_length, weight, truck_weights) + "초가 걸림");

	}

	public static int solution1(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0; // 초
		Queue<Integer> bridge = new LinkedList<Integer>();
		int truckWeightsOnBiridge = 0;

		for (int truckWeight : truck_weights) {
			while (true) {
				if (bridge.isEmpty()) {
					bridge.offer(truckWeight);
					truckWeightsOnBiridge += truckWeight;
					answer++;
					break;
				} else if (bridge.size() == bridge_length) { // 큐 (bridge) 가 다리 길이와 같다 == 큐 가 꽉 찼다.
					truckWeightsOnBiridge -= bridge.poll();
				} else { // 큐 에 더 들어갈 수 있는 상태
					if (truckWeightsOnBiridge + truckWeight > weight) { // 들어갈 순서의 트럭 무게 + 다리 위에 있는 트럭 무게 가 다리가 버틸 수 있는
																		// 무게 보다 크면
						bridge.offer(0);
						answer++; // 기다리는 동안에도 초는 흐르니까
					} else { // 다리가 버틸 수 있는 무게에 여유가 있다면
						bridge.offer(truckWeight);
						truckWeightsOnBiridge += truckWeight;
						answer++;
						break;
					}
				}
			}
		}

		// answer 에는 트럭이 다리 위에 오르기 까지 걸린 시간에 담겨있고,
		// bridge_length 를 더하는 이유는 다리 위에 올라가서 다리 끝까지 간 시간을 더하기 위함
		return answer + bridge_length;
	}

	public static int solution2(int bridge_length, int weight, int[] truck_weights) {
		/*
		 * 큐 : 선입선출 poll : 원소 삭제하면서 객체 반환. 가장 먼저 보관한 값 peek : 원소 삭제 안 하고 객체 반환. 가장 먼저
		 * 보관한 값
		 */

		Queue<Truck> bridge = new LinkedList<Truck>();
		int time = 0;
		int lastEnterTruckIndex = 0;
		int totalWeight = 0;
		
		while (lastEnterTruckIndex < truck_weights.length) {
			time++;

			if (!bridge.isEmpty()) { // 다리 위에 트럭이 있을 경우
				Truck firstTruck = bridge.peek(); // 가장 끝에 있는 트럭 ( 가장 먼저 큐에 들어간 트럭 )
				if (time - firstTruck.entry == bridge_length) { // 다리가 꽉 차있으면, 트럭이 빠져나오기 까지 있는다.
					// 트럭이 들어갔을 때 시간에서 그 이후로도 계속 흐르고 있는 시간을 뺀 값 이 다리 ( 큐 ) 의 길이 ( 다리 위에 있는 트럭 수 ) 보다
					// 크다.
					// 다리 길이: 트럭이 다리 위에 있는 개수에 따라 달라짐.
					// 트럭이 다리 위에 있으면, 길이가 줄어들고, 없으면 늘어남
					// 1초에 트럭이 한 번씩 움직인다.
					totalWeight -= bridge.poll().weight; // 다리위에 있는 트럭들의 무게를 빼고, 트럭이 나오도록 한다.
				}
			}

			int compareTruck = truck_weights[lastEnterTruckIndex]; // 다리 위로 올라갈 차례의 트럭

			if (totalWeight + compareTruck <= weight) { // 다리 위의 총 트럭 무게와 들어올 트럭의 무게를 더한 값이 다리가 버틸 수 있는 무게 보다 작으면,
														// 다리에 올라간다.
				bridge.offer(new Truck(compareTruck, time));
				totalWeight += compareTruck;
				lastEnterTruckIndex++;
				// 트럭 무게 , 트럭이 들어간 시간
			}
		}
		time += bridge_length; // 트럭이 지나가는 동안의 시간 더하기
		return time;
	}

	static class Truck {
		int weight;
		int entry;

		Truck(int weight, int entry) {
			this.weight = weight;
			this.entry = entry;
		}
	}
}
