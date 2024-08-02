import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int x,y,s;
        Scanner read = new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        s=(2*x)-y;
        System.out.println(s);
    }
}