package a03squentialstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterAndFindFirst {
	public static void main(String[] args) {
	    List<String> data = Arrays.asList("C#", "C++","Java",  "PHP", "Javascript");
	 
        data.stream()
        		.filter(e -> e.length() > 3)
	            .forEach(System.out::println); 	// Java, Javascript
        
        System.out.println("----");
        
        Optional<String> opt = data.stream()
    								.filter(e -> e.length() > 3)
									.findFirst();
        if(opt.isPresent()) {
        	System.out.println(opt.get());		// Java
        } else {
        	System.out.println("no one");
        }
	}
}
