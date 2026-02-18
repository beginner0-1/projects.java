import java.util.Scanner;


public class studentgradecalcular {
    public static  void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("enter your name : ");
        String name = sc.nextLine();

        System.out.print("enter your first sub marks : ");
        int sub1 =sc.nextInt();

        System.out.print("enetr your second sub marks : ");
        int sub2 =sc.nextInt();

        System.out.print("enter your third sub marks : ");
        int sub3 =sc.nextInt();

        int total = sub1 +sub2 +  sub3;
        double average = total/3.0;

        char grade;

        if(average >=90){
            grade = 'A';
        } else if (average>=75){
            grade = 'B';
        }else if (average>=50){
            grade = 'C';

        }else {
            grade = 'F';
        }
        System.out.println("\n-------Result ------");
        System.out.println("Student name :" + name );
        System.out.println("Total marks : "+ total);
        System.out.println("Average : "+ average );
        System.out.println("Grade : " + grade);
        sc.close();
    }
    
}
