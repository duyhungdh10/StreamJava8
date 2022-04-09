package a03squentialstream;

import java.util.Arrays;
import java.util.List;

public class DistinstStream {
	// Loai bo cac phan tu trung lap
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,4,5);
		list.stream().distinct().forEach(System.out::println); // 1,2,3,4,5
	}
}
