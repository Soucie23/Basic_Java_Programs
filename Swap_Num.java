package basic_programs;

//Java Program to Swap Two Numbers
public class Swap_Num {
    public static void main(String[] args) {
        int a = 32;
        int b = 52;
        int temp;
        System.out.println("Number before swapping A: "+a+" "+"Number before swapping B: "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swapping A: "+a+" "+"Number after swapping B: "+b);

    }
}
