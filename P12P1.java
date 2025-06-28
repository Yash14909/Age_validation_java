// FloydTriangle
//Java program on Floyd Triangle

import java.util.Scanner;

public class P12P1 {
   public P12P1() {}

   public static void main(String[] var0) {
      @SuppressWarnings("resource")
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int var2 = var1.nextInt();

      try {
         if (var2 < 18) {
            throw new AgeException("Invalid age");
         }

         System.out.println("Valid age");
      } catch (AgeException var4) {
         System.out.println(var4.getMessage());
      }
   }
}
