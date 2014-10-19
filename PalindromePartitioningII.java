public class Solution {
  	public static int minCut(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int len = s.length();
		int[] result = new int[len];
		boolean[][] pair = new boolean[len][len];
		for (int start = len - 1; start >= 0; start--) {
			result[start] = len - start - 1;
			for (int end = start; end < len; end++) {

				if (s.charAt(start) == s.charAt(end)) {
					if (end - start < 2)
						pair[start][end] = true;

					else

						pair[start][end] = pair[start + 1][end - 1];

				}

				if (pair[start][end]) {

					if (end == len - 1)
						result[start] = 0;

					else
						result[start] = Math.min(result[start],
								result[end + 1] + 1);

				}

			}

		}
		return result[0];
	}

}
