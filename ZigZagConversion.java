public class Solution {
 public static String convert(String s,int nRows){
		if(s==null||s.length()==0){
			
	     return  ""; 		
			
		}
		if (nRows==1){
		
		return   s;  	
			
		}
		StringBuffer sb = new StringBuffer();
		int borderRowStep = 2 * nRows - 2;
		for (int i = 0; i < nRows; i++) {
			if (i == 0 || i == nRows - 1) {
				for (int j = i; j < s.length(); j = j + borderRowStep) {
					sb.append(s.charAt(j));
				}
			} else {
				int j = i;
				boolean flag = true;
				int insideRowLargeStep = 2 * (nRows - 1 - i);
				int insideRowSmallStep = borderRowStep - insideRowLargeStep;
				while (j < s.length()) {
					sb.append(s.charAt(j));
					if (flag)
						j = j + insideRowLargeStep;
					else
						j = j + insideRowSmallStep;
					flag = !flag;
				}
			}
