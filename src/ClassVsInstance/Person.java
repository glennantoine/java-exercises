package ClassVsInstance;

import java.util.*;

public class Person {
	private int age;

	public Person(int initialAge) {
		String invalidAge = "Age is not valid, setting age to 0.";

		// Run some checks on initialAge
		if(initialAge < 0){
			this.age = 0;
			System.out.println(invalidAge);
		}else{
			this.age = initialAge;
		}
	}

	public void amIOld() {
		String youngMsg = "You are young.";
		String teenMsg = "You are a teenager.";
		String oldMsg = "You are old.";

		//Determine if this person's age is old and print the correct statement:
		String msg;
		if(this.age < 13){
			msg = youngMsg;
		}else if(this.age < 18){
			msg = teenMsg;
		}else{
			msg = oldMsg;
		}
		System.out.println(msg);
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}