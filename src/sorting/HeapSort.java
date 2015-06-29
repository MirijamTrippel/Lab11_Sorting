package sorting;

import sorting.auxiliary.Heap;
import sorting.auxiliary.Sorter;

public class HeapSort<E extends Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(E[] a) {
		Heap<E> h = new Heap<E>(a);
		for (int i = h.size() - 1; i >= 1; i--) {
			// step
			h.exchange(0, i);
			h.removeLastElementFromHeap();
			h.maxHeapify(0);
		}
	}

}
