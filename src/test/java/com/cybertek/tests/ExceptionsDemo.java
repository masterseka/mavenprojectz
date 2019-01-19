package com.cybertek.tests;

public class ExceptionsDemo {
    public static void main(String[] args) {
        //I teach on Tuesdays       -> normal flow
        //if I get sick             -> problem, issue
        //Someone will replace me   -> alternative flow

        try{
            System.out.println("MAruf is teaching on tue");
        }catch (Exception e){
            System.out.println("Akbar will take over");
        }
    }
}
