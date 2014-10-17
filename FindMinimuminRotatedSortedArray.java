public class Solution {
	
      //剑指offer原题 	
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


对原题做的一个扩展，即数组中可以包含重复的数字
 public class Solution {
	public static void main(String[] args) {
		int[] num = { 1, 1, 1, 0, 1 };
		System.out.println(findMin(num));
	}

	public static int findMin(int[] num) {
		if (num == null || num.length == 0)
			return 0;
		int low = 0, high = num.length - 1;
		int mid = low;
		while (num[low] >= num[high]) {

			if (high - low == 1) {
				mid = high;
				break;
			}
			mid = low + (high - low) / 2;
			if (num[mid] == num[high] && num[mid] == num[low]) {
				return findInOrder(num, low, high);
			}
			if (num[mid] >= num[low]) {
				low = mid;
			} else if (num[mid] < num[high]) {
				high = mid;
			}
		}
		return num[mid];
	}

	public static int findInOrder(int[] num, int low, int high) {
		int min = Integer.MAX_VALUE;
		for (int i = low + 1; i < high; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}

}
