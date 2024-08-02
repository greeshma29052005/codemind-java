import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read = new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        float loss=a-b;
        float per=(loss/a)*100;
        System.out.printf("%.2f",per);
    }
}