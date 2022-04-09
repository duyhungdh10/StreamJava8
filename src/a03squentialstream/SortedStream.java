package a03squentialstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedStream {
	// sorted() operation helps sort elements based on certain criteria
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
 
        // sorted according to natural order
        data.stream() //
                .sorted() //
                .forEach(System.out::println);

        System.out.println("---------");
        
        // sorted according to the provided Comparator
        data.stream() //
                .sorted((s1, s2) -> s1.length() - s2.length()) //
                .forEach(System.out::println);
        
        System.out.println("---------");
        
        
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(11, "B"));
        listStudent.add(new Student(5, "A"));
        listStudent.add(new Student(9, "E"));
        listStudent.add(new Student(21, "G"));
        listStudent.add(new Student(15, "H"));
        listStudent.add(new Student(12, "A"));
        
        List<Student> listSorted = listStudent.stream()
        										.sorted((stu1, stu2) -> stu1.name.compareTo(stu2.name))
        										.collect(Collectors.toList());
		
        System.out.println("List original Student - ko bi thay doi");
        listStudent.forEach(p -> System.out.println(p.toString()));
        System.out.println("---------------------");
        
		System.out.println("List sorted Student - new list");
		listSorted.forEach(p -> System.out.println(p.toString()));
		System.out.println("---------------------");
        
    }
}

class Student {
	int id;
	String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return this.id + " - " + this.name;
	}
}
