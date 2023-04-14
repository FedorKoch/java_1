import java.util.Scanner;

/**
 * zadacha1
 */
public class zadacha1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input;
    int sum = 0;
    int fac = 1;
    input = sc.nextLine();
    String[] s = input.split(" ");
    for (int i=0; i < s.length; i++){
    sum += Integer.parseInt(s[i]);
    fac = fac * Integer.parseInt(s[i]);
    }
    
    System.out.println(sum);
    System.out.println(fac);
}
    
}