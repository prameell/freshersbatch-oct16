import java.util.Scanner;

public class AvgScore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Input student1 marks:" );
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();

		System.out.print("Input student2 marks:" );
		int b1=s.nextInt();
		int b2=s.nextInt();
		int b3=s.nextInt();

		System.out.print("Input student3 marks:" );
		int c1=s.nextInt();
		int c2=s.nextInt();
		int c3=s.nextInt();

		int t1=a1+a2+a3;
		int t2=b1+b2+b3;
		int t3=c1+c2+c3;
		int t=t1+t2+t3;

		int avgt=t/3;
		int avg1=t1/3;
		int avg2=t2/3;
		int avg3=t3/3;
		
		int sub1=a1+b1+c1;
		int sub2=a2+b2+c2;
		int sub3=a3+b3+c3;

		int avgsub1=sub1/3;
		int avgsub2=sub2/3;
		int avgsub3=sub3/3;


		System.out.println("Total marks of student1 :" +t1);
		System.out.println("Total marks of student2 :" +t2);
		System.out.println("Total marks of student3 :" +t3);
		System.out.println("Total Marks of students :" +t);
		System.out.println("Average marks of student1 :" +avg1);
		System.out.println("Average marks of student2 :" +avg2);
		System.out.println("Average marks of student3 :" +avg3);
		System.out.println("Average marks of students :" +avgt);
		System.out.println("Total marks of students in subject1 :" +sub1);
		System.out.println("Total marks of students in subject2 :" +sub2);
		System.out.println("Total marks of students in subject3 :" +sub3);
		System.out.println("Average marks of students in subject1 :" +avgsub1);
		System.out.println("Average marks of students in subject2 :" +avgsub2);
		System.out.println("Average marks of students in subject3 :" +avgsub3);
		
	}
	
}
