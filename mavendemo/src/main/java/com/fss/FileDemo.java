package com.fss;

import java.io.File;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        try {
            File file = new File("./anup.txt");
            // file.createNewFile();
            // FileWriter fr = new FileWriter(file);
            // fr.append("Anup Kumar Roy A");
            // fr.close();
            Scanner sc = new Scanner(file);
            if (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("");
        }
    }

}
