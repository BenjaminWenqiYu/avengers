package observer.strategy;

import java.util.List;

public class BubbleSortStrategy implements Strategy {
	@Override
	public void sort() {
		System.out.println("冒泡排序");
	}
}
