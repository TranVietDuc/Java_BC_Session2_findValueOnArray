import java.util.Scanner;
public class findValueOnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name’s student:");
        String input_name = input.nextLine();
        boolean isExit = false;
        for (int i =0; i<students.length ; i++){
            if(students[i].equals(input_name)){
                isExit = true;
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                break;

            }
        }
        if (!isExit)
            System.out.println("Not found on list!");
    }
}
