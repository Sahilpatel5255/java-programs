import java.util.Scanner;
class sub{
    int x,y;
    sub(int x, int y){
        this.x=x;
        this.y=y;}
        void show1(){
            System.out.println("the subtraction of two numbers is :"+ (x-y));
        }

    }

class sum{
        int x,y;
        sum(int x, int y){
            this.x=x;
            this.y=y;}
            void show2(){
                System.out.println("the summation of two numbers is :"+ (x+y));
            }
}
class div{
    int x,y;
    div(int x, int y){
        this.x=x;
        this.y=y;}
        void show3(){
            System.out.println("the division of two numbers is :"+ (x/y));
        }
}
class mul{
    int x,y;
    mul(int x, int y){
        this.x=x;
        this.y=y;}
        void show4(){
            System.out.println("the multiplication of two numbers is :"+ (x*y));
        }
}


public class demo17_3 {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    int a,b,i;
    
    System.out.println("enter number of calculations");
    int n=s.nextInt();
    
    for(i=0;i<=n;i++){
        System.out.println("enter the opertor:");
        System.out.println("+:sum, -:subtraction, *:multiplication, /:1division");
        char cal=s.next().charAt(0);
        if(cal=='+'){
            System.out.println("enter your first number:");
            a=s.nextInt();
            System.out.println("enter your second  number:");
            b=s.nextInt();
            sum x=new sum(a,b);
            x.show2();

        }
        else if(cal=='-'){
            System.out.println("enter your first number:");
            a=s.nextInt();
            System.out.println("enter your second  number:");
            b=s.nextInt();
            sub x=new sub(a,b);
            x.show1();

        }
        else if(cal=='*'){
            System.out.println("enter your first number:");
            a=s.nextInt();
            System.out.println("enter your second  number:");
            b=s.nextInt();
            mul x=new mul(a,b);
            x.show4();
        }
        else{
            System.out.println("enter your first number:");
            a=s.nextInt();
            System.out.println("enter your second  number:");
            b=s.nextInt();
            div x=new div(a,b);
            x.show3();
        }
      
    }



    
  }
}
