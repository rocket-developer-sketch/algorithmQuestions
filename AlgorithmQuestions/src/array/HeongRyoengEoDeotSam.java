package array;

import java.util.Arrays;

/* 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class HeongRyoengEoDeotSam {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		for (int[] answer : solution(arr1, arr2)) {
			System.out.println("행렬 덧셈의 결과? " + Arrays.toString(answer));
		}

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i<arr1.length; i++) {
	          for(int j = 0; j<arr1[0].length; j++) {
	              answer[i][j] = arr1[i][j] + arr2[i][j];
	          }
	      }
		return answer;
	}
	
	/*
	  public static int[][] solution(int[][] arr1, int[][] arr2) { 
			int[][] answer = new int [arr1.length][arr1.length];
  
			for (int i = 0; i < arr1.length; i++) { 
				for (int j = 0; j < arr1.length; j++){ 
					answer[i][j] = arr1[i][j] + arr2[i][j]; 
				} 
			}
	  
	  		return answer; 
	  }
	 */
}
