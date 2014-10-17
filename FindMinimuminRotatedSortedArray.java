public class Solution {
	public static void main(String[] args) {
		int[] num = { 2, 3, 1 };
		System.out.println(findMin(num));
	}

	public static int findMin(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int low = 0, high = num.length - 1;
		int mid = low;
		while (num[low] > num[high]) {
			if (high - low == 1) {
				mid = high;
				break;
			}
			mid = low + (high - low) / 2;
			if (num[mid] > num[low])
				low = mid;
			else if (num[mid] < num[high])
				high = mid;
		}
		return num[mid];
	}
}
