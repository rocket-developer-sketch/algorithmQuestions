package math;

public class KeypadNuReKi {

	public static void main(String[] args) {
		// int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		String hand = "right";
		System.out.println("키패드 누른 손가락 위치? " + solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		int rightIndex = 0;
		int leftIndex = 0;

		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) { // 왼쪽
				leftIndex = number;
				answer.append("L");
			} else if (number == 3 || number == 6 || number == 9) { // 오른쪽
				rightIndex = number;
				answer.append("R");
			} else {
				int distanceToLeft = getDistanceFromMiddle(number, leftIndex);
				int distanceToRight = getDistanceFromMiddle(number, rightIndex);

				if (distanceToLeft == distanceToRight) {
					if(hand.equals("right")) {
						rightIndex = number;
						answer.append("R");
					} 
					else if(hand.equals("left")) {
						leftIndex = number;
						answer.append("L");
					}
				}
				else if (distanceToLeft > distanceToRight) {
					rightIndex = number;
					answer.append("R");
				} else if (distanceToLeft < distanceToRight) {
					leftIndex = number;
					answer.append("L");
				}
			}
		}
		return answer.toString();
	}

	// 대각선으로 움직이는 것을 계산하는 것이 아니라
	// x 축, y 축으로 몇 번 움직였는 지가 거리 계산 포인트
	public static int getDistanceFromMiddle(int middleNumber, int prevNumber) {
		//return Math.abs(prevIndex) - Math.abs(number); // 그냥 이렇게 하면, 숫자 끼리 차이가 거리 값으로 리턴 됨
		if(middleNumber == 0) { // *, # 제외하고, 0으로 가기 위해서는 오른쪽이던 왼쪽이던 2번 씩 이동해야 함. 
			middleNumber += 11; //왼쪽 최대값 7, 오른쪽 최대값 9
		}
		
		return (Math.abs(middleNumber - prevNumber) / 3) + (Math.abs(middleNumber-prevNumber) % 3) ;
	}

}
