package a03squentialstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// Stream.max(). Stream.min() chap nhan doi so la 1 Comparator // tuong tu nhu sort
// sao cho item trong stream co the so sanh duoc voi nhau de tim min, max
public class MinMax {

	public static void main(String[] args) {
        // Find max, min with Array ====================
		Integer []numbers = {1, 8, 3, 4, 5, 7, 9, 6};
        // Max = 9
        Integer maxNumber = Stream.of(numbers)
                .max(Comparator.comparing(Integer::valueOf)).get();
 
        // Min = 1
        Integer minNumber = Stream.of(numbers)
                .min(Comparator.comparing(Integer::valueOf)).get();
         
        // Find max, min with Collection ====================
        List<Integer> listOfIntegers = Arrays.asList(numbers);
        // Max = 9
        Integer max = listOfIntegers.stream()
                .mapToInt(v -> v).max().getAsInt(); 
         
        // Min = 1
        Integer min = listOfIntegers.stream()
                .mapToInt(v -> v).min().getAsInt(); 
        
        
    }
	
}
