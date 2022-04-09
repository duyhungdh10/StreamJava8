package a03squentialstream;

import java.util.Arrays;
import java.util.List;

public class Count {
	
	// Tra ve so luong cac phan tu (thoa man dieu kien) cua stream
	public static void main(String[] args) {
		 
        List<Integer> data = Arrays.asList(2, 3, 5, 4, 6);
 
        long count = data.stream().filter(num -> num % 3 == 0).count();
        System.out.println("Count = " + count);
    }
}
