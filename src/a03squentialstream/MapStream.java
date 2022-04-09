package a03squentialstream;

import java.util.Arrays;
import java.util.List;

public class MapStream {
	// Map anh xa cac phan tu toi gia tri tuong ung
	public static void main(String[] args) {
	    List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
	 
        data.stream()
        		.map(e -> "Hi " + e)
	            .map(String::toUpperCase) // convert each element to upper case // map(e -> e.toUpperCase())
	            .forEach(System.out::println);
        
	}
}
