package rocky_practise.dna_substring.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import rocky_practise.dna_substring.Solution;

public class DNATest {
	@Test
	public void testDNASubString() {
		
		String testingDNAData = "ACGTACGTGTAAAAAATCGTGTGATCGATGCTAGCATCGATGCATCTA";
		char[] temp;
		Solution so           = new Solution();
		
		List<String> dnaSeq   = so.generateDNASubstringInOrder(testingDNAData);
		List<String> jdkSeq   = new LinkedList<>();
		StringBuilder sb      = new StringBuilder();
		
		for (int i = 0; i <= testingDNAData.length() - 10; i++) {
			temp = testingDNAData.substring(i, i + 10).toCharArray();
			Arrays.sort(temp);
			sb.delete(0, sb.length());
			jdkSeq.add(sb.append(temp).toString());
		}
		//assert length of substring
		assertEquals(jdkSeq.size(), dnaSeq.size());
		Iterator<String> it1 = jdkSeq.iterator();
		Iterator<String> it2 = dnaSeq.iterator();
		
		
		//assert the content of every substring
		while (it1.hasNext() && it2.hasNext()) {
			assertEquals(it1.next(), it2.next());
		}
	}
}
