package a03squentialstream;

import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
        Stream.iterate(1, count -> count + 1) // for bat dau tu 1, count++
				.filter(number -> number % 3 == 0) // loc nhung so chia het 3
				.limit(6) // lay 6 so
				.forEach(System.out::println);
    }
}
