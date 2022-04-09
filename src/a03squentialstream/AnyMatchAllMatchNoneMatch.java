package a03squentialstream;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchNoneMatch {
	public static void main(String[] args) {
		
		// anyMatch: tra ve true ngay khi co 1 phan tu thoa man dieu kien, cac ptu con lai ko kiem tra nua
		// allMatch: tra ve true khi tat ca phan tu thoa man dieu kien, 
		//				neu 1 phan tu ko thoa man -> false. cac ptu con lai ko kiem tra nua
		
		// noneMatch: tra ve true khi tat ca phan tu KHONG thoa man dieu kien,
		//				neu 1 phan tu thoa man -> true. cac ptu con lai ko kiem tra nua

		
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("Java"));
        System.out.println(result); // true
    }
}
