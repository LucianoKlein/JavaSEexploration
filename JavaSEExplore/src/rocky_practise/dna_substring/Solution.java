package rocky_practise.dna_substring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * I use much less memory
 * 4^10 * 4Byte is 4MB
 * I can manage this with 4Byte
 * 
 * @author Anonymous
 *
 */
public class Solution {
	
	private int[] _bucket;
	private List<String> _output;
	private StringBuilder _buffer;
	
	public Solution() {
		_bucket = new int[4];
		_buffer = new StringBuilder();
		_output = new LinkedList<>();
	}
	
	public List<String> generateDNASubstringInOrder(String sequenceDNA) throws IllegalArgumentException {
		if (sequenceDNA.length() < 10) {
			throw new IllegalArgumentException();
		}
		//bucket sort
		// A     T
		// A   G T
		// A C G T
		// 0 1 2 3
		//then bucket[0] == 3
		//     bucket[1] == 1
		//     bucket[2] == 2
		//
		char[] dnaArray = sequenceDNA.toCharArray();
		int n = sequenceDNA.length();
		
		for (int i = 0; i < n; i++) {
			//add me to the index
			_bucket[toIndex(dnaArray[i])]++;
			
			//remove [i-10]
			if (i >= 10) {
				_bucket[toIndex(dnaArray[i - 10])]--;
			}
			
			//output this substring
			if (i >= 9) {
				output();
			}
		}
		
		return _output;
	}
	
	private int toIndex(char elementDNA) throws IllegalArgumentException {
		switch (elementDNA) {
			case 'A' : return 0;
			case 'C' : return 1;
			case 'G' : return 2;
			case 'T' : return 3;
			
		}
		throw new IllegalArgumentException("not a valid DNA Sequence");
	}
	
	private void output() throws IllegalArgumentException {
				
		for (int i = 0; i < _bucket[0]; i++) {
			_buffer.append('A');
		}
		
		for (int i = 0; i < _bucket[1]; i++) {
			_buffer.append('C');
		}
		
		for (int i = 0; i < _bucket[2]; i++) {
			_buffer.append('G');
		}
		
		for (int i = 0; i < _bucket[3]; i++) {
			_buffer.append('T');
		}
		
		if (_buffer.length() != 10) {
			throw new IllegalArgumentException("");
		}
		
		String res = _buffer.toString();
		_output.add(res);
		_buffer.delete(0, _buffer.length());
	}
}
