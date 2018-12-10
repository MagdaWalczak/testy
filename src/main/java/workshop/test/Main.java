package workshop.test;

import service.MathService;

public class Main {
    public static void main(String[] args) {
        System.out.println(new MathService().multiply(5,6));

        String a= "hello";
        String b= "World";
        String c=a.substring(1)+b.substring(1);
        System.out.println(c);
    }
}
