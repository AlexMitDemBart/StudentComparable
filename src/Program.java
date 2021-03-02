import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Alex","Mace"),
				new Student("Zetz","Tut"),
				new Student("Berta","Muh")
				);
		Collections.sort(students);
		System.out.println(students);
	}
}
