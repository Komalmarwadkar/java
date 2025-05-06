import java.util.Scanner;
class Studentdata
{
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter number of students: ");
 		int total = sc.nextInt();sc.nextLine();
 		String[] names = new String[total];
 		int[] rollNo = new int[total];
 		float[] per = new float[total];
 		for (int i = 0; i < total; i++)
 		{
 			System.out.print("Name: ");
 			names[i] = sc.nextLine();
 			System.out.print("Roll No.: ");
 			rollNo[i] = sc.nextInt();
 			System.out.print("percentage: ");
 			per[i] = sc.nextFloat();
 			sc.nextLine();
 		}
	 System.out.println("\nStudent Information:");
 	for (int i = 0; i < total; i++)
 	{
 		System.out.println(names[i] + " " + rollNo[i] + " " + per[i]);
 	}
 sc.close();
 }
}

