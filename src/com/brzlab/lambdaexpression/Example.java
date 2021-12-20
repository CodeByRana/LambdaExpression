package com.brzlab.lambdaexpression;

public class Example {
    public static void main(String[] args) {
        System.out.println("Welcome to lambda expression");
//
//        Drawable b = new Drawable(){
//            @Override
//            public void draw(){
//                System.out.println("draw");
//            }
//        };
//        D.draw();

        Drawable b = ()->{
            System.out.println("draw");
        };

        Drawable d = () -> System.out.println("draw");
        b.draw();
    }
}
