import java.util.Scanner;

void main() {
    var input = new Scanner(System.in);
    System.out.print("What is your grade? ");
    var grade = input.nextInt();

    if (grade == 100) {
        System.out.println("Great!");
        System.out.println("You have passed my expectations!");
    } else if (grade < 100) {
        System.out.println("You are not my son anymore!");
    } else {
        System.out.println("Study more!? Why are you not a doctor yet!??");
    }

//    if (grade != 100) {
//        System.out.println("You are not my son anymore!");
//    }
}