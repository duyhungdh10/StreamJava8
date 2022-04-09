package a01createstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CreateStreamFromPrimitiveType {
	 public static void main(String[] args) {
		 // Su dung cac doi tuong Stream danh cho nhung kieu primitive nay, 
		 // vi du IntStream, LongStream hay DoubleStream
		 
		 IntStream.range(1, 4).forEach(System.out::println); // 1 2 3
		 
		 IntStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3
		 
		 DoubleStream.of(1, 2, 3).forEach(System.out::println); // 1.0 2.0 3.0
 
		 LongStream.range(1, 4).forEach(System.out::println); // 1 2 3
 
		 LongStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3
		 
    }
}
