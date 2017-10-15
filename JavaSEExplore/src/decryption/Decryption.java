package decryption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decryption {
	
	public static void main(String[] args) {
		String cryptograph = "KQXPMZ BMFB QA BPM UMAAIOM NWZUML EPMV I XTIQV BMFB UMAAIOM PIA JMMV MVKZGXBML";
		String key = "cipher";
		System.out.println(descrypt(cryptograph, key));
		
	}
	
	private static List<String> descrypt(String cryptograph, String key) {
		
		List<Integer> candidates = findpattern(cryptograph, key);
		List<String> possibleRes = new ArrayList<>(candidates.size()); 
		
		int[] pivots = new int[candidates.size()];
		int index = 0;
		for (Integer i : candidates) {
			pivots[index++] = key.charAt(0) - cryptograph.charAt(i);
		}
		
		for (int pivot : pivots) {
			possibleRes.add(descryptSentence(cryptograph, pivot));
		}
		return possibleRes;
	}
	
	//KQXPMZBMFBQABPMUMAAIOMNWZUMLEPMVIXTIQVBMFBUMAAIOMPIAJMMVMVKZGXBML
	//CRIMGMEAXSANYITSEEENITASEPPETSFDANMGBNTHXHSOWPTEEECEETEARHLESHERD
	/**
	 * 
	 * @param cryptograph -- the code to be cracked
	 * @param key -- hint
	 * @return
	 */
	private static List<Integer> findpattern(String cryptograph, String key) {
		int[] pattern = new int[key.length() - 1];
		int[] patternCryptograph = new int[cryptograph.length() - 1];
		
		for (int i = 1; i < key.length(); i++) {
			pattern[i - 1] = key.charAt(i) - key.charAt(i - 1);
		}
		
		for (int i = 1; i < cryptograph.length(); i++) {
			patternCryptograph[i - 1] = cryptograph.charAt(i) - cryptograph.charAt(i - 1);
		}
		System.out.println("patternCryptograph=" + Arrays.toString(patternCryptograph));
		return KMP(patternCryptograph, pattern);
		
		
	}
	
	//stuvwxyz abcdefghijklmnopqr
	//ABCDEFGH IJKLMNOPQRSTUVWXYZ
	
	private static String descryptSentence(String cryptograph, int pivot) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < cryptograph.length(); i++) {
			char curr = cryptograph.charAt(i);
			if (curr == ' ') {
				result.append(curr);
				continue;
			}
			char mapping = (char) (curr + pivot);
			if (mapping < 'a' || mapping > 'z') {
				mapping += 26;
			}
			result.append(mapping);
		}
		return result.toString();
	}
	

	private static List<Integer> KMP(int[] source, int[] pattern) {
        int[] N = getN(pattern);
        int res = 0;
        List<Integer> results = new ArrayList<Integer>();
        int sourceLength = source.length;
        int patternLength = pattern.length;
        
        int i = 0;
        while (i <= sourceLength - patternLength) {
        	for(; i <= (sourceLength - patternLength);) {
        		res++;
        		int[] str = new int[patternLength];
        		
        		for (int j = i, index = 0; j < i + patternLength; j++, index++) {
        			str[index] = source[j];
        		}
        		int count = getNext(pattern, str, N);
        		if(count == 0){
        			p("KMP：匹配成功");
        			results.add(res - 1);
        			res += patternLength;
        			i = res;
        			break;
        		}
        		i = i + count;
        	}
        }
        
        p("KMP：一共出现"+ results.size() +"次");
        return results;
    }
	private static int getNext(int[] pattern, int[] str, int[] N) {
        int n = pattern.length;
        int v1[] = str;
        int v2[] = pattern;
        int x = 0;
        while (n-- != 0) {
            if (v1[x] != v2[x]){
                if(x==0){
                    return 1;//如果第一个不相同，移动1步
                }
                return x-N[x-1];//x:第一次出现不同的索引的位置，即j
            }
            x++;
        }
        return 0;
    }
	
    private static int[] getN(int[] pattern) {
        int[] pat = pattern;
        int j = pattern.length - 1;
        int[] N = new int[j+1];
        for(int i = j; i >= 2; i--) {
            N[i-1] = getK(i, pat);
        }

        return N;
    }
    
    private static int getK(int j, int[] pat) {
        int x=j-2;
        int y=1;
        while (x>=0 && compare(pat, 0, x, y, j-1)) {
            x--;
            y++;
        }
        return x+1;
    }
    private static boolean compare(int[] pat, int b1, int e1, int b2, int e2){
        int n = e1-b1+1;
        while (n-- != 0) {
            if (pat[b1] != pat[b2]){
                return true;
            }
            b1++;
            b2++;
        }
        return false;
    }
    
    public static void p(Object obj) {
        System.out.println(obj);
    }
	
}
