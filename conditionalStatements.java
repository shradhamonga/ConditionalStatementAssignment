import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your marks in Maths");
		int math = sc.nextInt();
		System.out.print("Enter your marks in Science");
		int science= sc.nextInt();
		System.out.print("Enter your marks in English");
		int english = sc.nextInt();
		
		 int average = (math + science + english) / 3;
	        System.out.println("\nYour average is: " + average);
		
		boolean hasSubjectFail = (math < 35 || science < 35 || english < 35);

        if (hasSubjectFail) {
            System.out.println("Failed due to low score in at least one subject.");
            System.out.println("Please work harder next time.");
        } else {
            if (average >= 90 && average <= 100) {
                System.out.println("Your Grade is A+");
                System.out.println("Excellent Performance!");
            } else if (average >= 75 && average <= 89) {
                System.out.println("Your Grade is A");
                System.out.println("Excellent Performance!");
            } else if (average >= 60 && average <= 74) {
                System.out.println("Your Grade is B");
                System.out.println("Keep Improving!");
            } else if (average >= 40 && average <= 59) {
                System.out.println("Your Grade is C");
                System.out.println("Keep Improving!");
            } else {
                System.out.println("Fail");
                System.out.println("Please work harder next time.");
            }
        }
		sc.close();
	}

}
