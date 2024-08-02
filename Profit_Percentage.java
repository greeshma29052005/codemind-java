import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int x,y;
        Scanner read = new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        float profit=y-x;
        float per=(profit/x)*100;
        System.out.printf("%.2f",per);
    }
}