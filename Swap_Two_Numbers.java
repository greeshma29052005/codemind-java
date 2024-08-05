import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int a,b;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(temp);
    }
}