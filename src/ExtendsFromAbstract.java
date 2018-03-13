import java.util.Scanner;

public class ExtendsFromAbstract extends Abstract{
    int h;

    public ExtendsFromAbstract() {

        input();
    }

    @Override
    public void input() {
        Scanner scaner =new Scanner(System.in);
        System.out.println("input x y");
        System.out.println("x = ");x=scaner.nextInt();
        System.out.println("y = ");y=scaner.nextInt();
        System.out.println("h = ");h=scaner.nextInt();
    }
    public  void show(){
        super.show();
        System.out.println("заначение h = "+h);
    }



}
