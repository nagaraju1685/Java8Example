package edu.nagaraju.lambda;

public class LambdaFuntion  {
    public static void main(String[] args) {
        FuntionalIner f = () -> System.out.println("Hi Hello");
        f.print();

        Runnable r = ()-> System.out.println("Hi Hello");
        r.run();

        Addinter a = (value1,value2) -> value1+value2;
        System.out.println(a.add(30,30));

        squarInter s = n -> n*n;
        System.out.println(s.square(10));


        System.out.println(1.0/0.0);


    }
}
