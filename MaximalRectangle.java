public class Solution {
 public static int maximalRectangle(char[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
		{
			return 0;
		}
		int rLen = matrix.length;
		int cLen = matrix[0].length;
		int maxArea = 0;
		int[] h = new int[cLen+1];
         
		for (int row = 0; row < rLen; row++) {
			ArrayDeque<Integer> stack = new ArrayDeque<>();
			for (int j = 0; j < cLen + 1; j++) {
				if (j < cLen) {
					if (matrix[row][j] == '1') {
						h[j]++;

					} else {
						h[j] = 0;
					}

				}
				if (stack.isEmpty() || h[stack.peek()] <=h[j]) {

					stack.push(j);

				} else {
					while (!stack.isEmpty() && h[j] <h[stack.peek()]) {

						int top = stack.pop();
						int area = h[top]
								* (stack.isEmpty() ? j : (j - stack.peek() - 1));
						if (area > maxArea)
							maxArea = area;
					}
                stack.push(j);
				}

			}
		}
		return maxArea;
	}
}
