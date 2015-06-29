package sorting;

import sorting.auxiliary.Sorter;

public class InsertionSort<E extends Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(E[] a) {
		int j;
		E t;
		for (int i = 1; i < a.length; i++) {
			// step
			j = i;
			t = (E) a[j];
			while (j > 0 && ((E) a[j - 1]).compareTo(t) > 0) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = t;
		}
	}

}
