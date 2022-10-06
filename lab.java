import java.util.Scanner;

//Wrote by  Stefen


public class lab{

    //args the command line arguments

    public static void main(String argu[]) {

        //declare variable
        String Emp_name;
        int Emp_id, Emp_salary, Emp_age;
        float allowence;

        //create scanner
        Scanner input = new Scanner(System.in);

        //input Employee ID
        System.out.print("Please enter the Employee ID : ");
        Emp_id = input.nextInt();

        //input Employee Name
        System.out.print("Please enter the Employee Name: ");
        Emp_name = input.next();

        //input Employee Salary
        System.out.print("Please enter the Employee Salary : ");
        Emp_salary = input.nextInt();

        //input Employee Age
        System.out.print("Please enter the Employee Age : ");
        Emp_age = input.nextInt();

        if (Emp_age > 30) {

            //output
            System.out.println("Employee ID :" + Emp_id);
            System.out.println("Employee Name :" + Emp_name);


            //find the Allowence
            allowence = Emp_salary * 7 / 100;

            //output
            System.out.println("Your Final Salary is :" + (Emp_salary + allowence));
        } else {

            //output
            System.out.println("Employee ID :"+Emp_id );

            //output
            System.out.println("Employee Name :"+ Emp_name);

            //output
            System.out.println("Your Final Salary is :"+ Emp_salary);

        }
    }
}