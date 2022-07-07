package com.javacore.tinhdonggoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) {
        File file = new File("D:\\file.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        Scanner sc;

        {
            try {
                sc = new Scanner(file);
                while(sc.hasNext()){
                    var line =sc.next();
                    System.out.print(line+" ");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

}
