package com.example.project;

public class Main {

    public static void main(String[] args) {

	try {
        int[] numbers={1,2,3};
        System.out.println(numbers[4]);
    }catch (StringIndexOutOfBoundsException exception){
        System.out.println(exception);
    }catch (ArrayIndexOutOfBoundsException exception){
        System.out.println(exception);
    }

	finally {
        System.out.println("This blog is always working");
    }
    }
}
