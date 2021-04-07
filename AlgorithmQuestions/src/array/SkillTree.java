package array;

import java.util.ArrayList;

/* 스킬트리 
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * */
public class SkillTree {

	public static void main(String[] args) {

		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println("가능한 스킬트리 개수 ? " + solution1(skill, skill_trees));
	}

	public static int solution1(String skill, String[] skill_trees) {
		int answer = 0;
		int index = 0;

		while (true) {
			String one_skill_tree = skill_trees[index];
			String one_skill_tree_clone = new String(one_skill_tree);
			int size = one_skill_tree.length();
			/* for 문이 실행되면서, length() 함수도 또 호출 되어 길이가 (j 반복문에서) 반복될 때마다 갱신되어 달라짐*/
			// 없어지지 않은 원본의 문자열 길이 만큼 반복해야 모든 문자 비교가 가능 하기 때문에 for문 밖에서 길이 변수 선언
			//System.out.println("for문 밖에서 문자열 길이1 : " +size);
			//System.out.println("for문 밖에서 문자열 길이1 : " +one_skill_tree.length());
			for (int i = 0; i < size; i++) {
				//System.out.println("for문 안에서 문자열 길이2 : " +size);
				//System.out.println("for문 안에서 문자열 길이2 : " +one_skill_tree.length());
				// 없어지지 않은 원본의 문자열 길이 만큼 반복해야 모든 문자 비교가 가능 하기 때문에 clone 만듦
				String one_skill_from_tree = String.valueOf(one_skill_tree_clone.charAt(i));
				
				if (!skill.contains(one_skill_from_tree)) {
					one_skill_tree = one_skill_tree.replace(one_skill_from_tree, "");
				}
			}

			// indexOf(String) 문자열이 들어오면 문자열(문자 한묶음) 과 문자열(문자 한묶음) 비교 인 것임
			if (skill.indexOf(one_skill_tree) == 0) {
				answer++;
			}

			index++;

			if (index == skill_trees.length) {
				break;
			}
		}
		return answer;
	}

}
