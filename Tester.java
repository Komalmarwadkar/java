public class Tester
{
   public static void main(String[] args)
   {
      if(args.length == 1)
      {
	     String name = args[0];
         System.out.println("Welcome " + name + "!");
      }
      else
      {
         System.out.println("Invalid Command line argument(s) passed.");
      }
   }
}
