package com;

public class Main {
    private static int j = 6;
    private int i = 5;
    Inner inner=new Inner();
    void method(){Inner inner=new Inner();}

    class Inner {
        int q = j;
        int w = i;
        void method() {
            q = j + i;
        }
        final static int l =5;
//        static int e =5;
//        static void method2(){}
//        static{}
    }

    public static void main(String[] args) {
        Inner inner=new Main().new Inner();
    }
}
class OtherClass{
    Main.Inner inner=new Main().new Inner();
}