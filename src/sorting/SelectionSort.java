package sorting;

import static sorting.auxiliary.SortHelpers.swap;
import sorting.auxiliary.Sorter;

public class SelectionSort<E extends Comparable<E>> implements Sorter<E> {
	@Override
	public void sort(E[] a) {
		int n = a.length;
		for (int j = 0; j < n; j++) {
			// step
			swap(a, minIndex(a, j, n), j);
		}
	}
	private int minIndex(E[] a, int j, int n) {
		E min = a[j];
		int minIndex = j;
		for (int i = j; i < n; i++) {
			if (a[i].compareTo(min) < 0) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
