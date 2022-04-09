package a04parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	public static void main(String[] args) {
	      List<String> strings = Arrays.asList("code", "learn", "...");
	      String streamString = strings.stream().reduce(" I'm-", String::concat);
	      String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
	      System.out.println("Stream: " + streamString); 			//Stream:  I'm-codelearn...
	      System.out.println("ParallelStream: " + parallelString); 	//ParallelStream:  I'm-code I'm-learn I'm-...
	}
	
	// sequential - xu li tuan tu tung phan tu
	// parallel - chia list thanh nhieu phan nho roi thuc hien sequential voi tung phan no do
	
}
