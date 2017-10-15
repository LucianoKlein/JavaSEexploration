package decryption;

import java.util.HashMap;
import java.util.Map;

public class TranspositionCipher {
	//CRIMGMEAXSANYITSEEENITASEPPETSFDANMGBNTHXHSOWPTEEECEETEARHLESHERD
	//ciphertextisthemessageformedwhenaplaintextmessagehasbeenencrypted
	
	public static void main(String[] args) {
		String cipher = "CRIMGMEAXSANYITSEEENITASEPPETSFDANMGBNTHXHSOWPTEEECEETEARHLESHERD";
		String answer = "ciphertextisthemessageformedwhenaplaintextmessagehasbeenencrypted";
		
		count(cipher, answer);
	}
	
	private static void count(String cipher, String answer) {
		char[] cipherArray = cipher.toCharArray();
		char[] answerArray = answer.toCharArray();
		
		Map<Character, Integer> mapCipher = new HashMap<>();
		Map<Character, Integer> mapAnswer = new HashMap<>();
		
		for (char curr : cipherArray) {
			mapCipher.put(curr, mapCipher.getOrDefault(curr, 0) + 1);
		}
		
		for (char curr : answerArray) {
			mapAnswer.put(curr, mapAnswer.getOrDefault(curr, 0) + 1);
		}
		System.out.println("mapCipher" + mapCipher);
		System.out.println("mapAnswer" + mapAnswer);
	}
}
