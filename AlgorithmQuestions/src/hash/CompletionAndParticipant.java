package hash;

import java.util.Arrays;

public class CompletionAndParticipant {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant); // eden kiki leo
		Arrays.sort(completion);

		int count = 0;
		for (int i = 0 ; i < completion.length; i ++) {
			if(!participant[i].equals(completion[count])) {
				answer = participant[i];
			} else {
				count++;
			}
		}
		
		return answer.equals("") ? participant[participant.length - 1] : answer;
	}

}
