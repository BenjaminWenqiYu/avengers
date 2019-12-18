package observer.strategy;

import java.util.List;

public class QuickSortStrategy implements  Strategy{
	@Override
	public void sort() {
		System.out.println("快速排序");
	}
}
