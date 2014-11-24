public class QuickSort {

	private static final int CUTOFF = 11;

	public static <T extends Comparable<? super T>> void quickSort(T[] A) {

		quickSort(A, 0, A.length);

	}

	public static <T extends Comparable<? super T>> T median(T[] arr, int left,
			int right) {
		int mid = left + (right - left) / 2;
		if (arr[left].compareTo(arr[mid]) > 0) {
			swapRef(arr, left, mid);
		}
		if (arr[left].compareTo(arr[right]) > 0) {

			swapRef(arr, left, right);
		}

		if (arr[mid].compareTo(arr[right]) > 0) {

			swapRef(arr, mid, right);

		}
		swapRef(arr, mid, right - 1);
		return arr[right - 1];
	}

	public static <T extends Comparable<? super T>> void quickSort(T[] arr,
			int left, int right) {

		if (left + CUTOFF < right) {

			T pivot = median(arr, left, right);
			int i = left, j = right - 1;
			for (;;) {
				while (arr[++i].compareTo(pivot) < 0)
					;

				while (arr[--j].compareTo(pivot) > 0)
					;

				if (i < j)

					swapRef(arr, i, j);

				else
					break;

			}
			swapRef(arr, i, right - 1);

			quickSort(arr, left, i - 1);
			quickSort(arr, i + 1, right);

		} else {

			insertSort(arr, 0, arr.length);

		}

	}

	public static <T> void swapRef(T[] A, int idx1, int idx2) {
		T tmp = A[idx1];
		A[idx1] = A[idx2];
		A[idx2] = tmp;
	}

	public static <T extends Comparable<? super T>> void insertSort(T[] arr,
			int start, int end) {
		for (int i = start + 1; i <= end; i++) {

			T tmp = arr[i];

			for (int j = i; j > start && tmp.compareTo(arr[j - 1]) < 0; j--) {

				swapRef(arr, j, j - 1);

			}

			arr[i] = tmp;

		}

	}
}
