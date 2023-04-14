import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      num1 = reader.nextDouble();
      System.out.print("Введите второе число: ");
      num2 = reader.nextDouble();
      System.out.print("\nВведите оперцию (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка операции");
            return;
      }
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
    

