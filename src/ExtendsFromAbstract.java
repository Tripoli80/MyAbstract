import java.util.Scanner;

public class ExtendsFromAbstract extends Abstract{
    int h;

    public ExtendsFromAbstract(int h) {
        this.h = h;
        input();
    }

    @Override
    public void input() {
        Scanner scaner =new Scanner(System.in);
        System.out.println("input x y");
        System.out.println("x = ");x=scaner.nextInt();
        System.out.println("y = ");y=scaner.nextInt();
    }
    public  void show(){
        super.show();
        System.out.println("заначение h = "+h);
    }



}
