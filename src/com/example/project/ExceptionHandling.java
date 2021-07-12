package com.example.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args)  {
        BufferedReader reader=null;
        int total=0;
        String filePath="C:\\Users\\cimbo\\Desktop\\Java\\exceptionHandlingExamples\\src\\number.txt";
        try {
            System.out.println("tet");
            reader=new BufferedReader(new FileReader(filePath));
            String line=null;
                while ((line= reader.readLine())!=null){
                    total+=Integer.valueOf(line);

                }
            System.out.println(total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            }catch (Exception exception){

            }

        }

    }
}
