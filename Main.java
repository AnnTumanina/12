package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        String[] m = ip.split(" ");
        try(BufferedWriter f = new BufferedWriter(new FileWriter("ip.txt"))){
            for (String w : m) {

                boolean r = w.matches("(((25[0-5]\\.)|(2[0-4]\\d\\.)|(1[0-9]{2}\\.)|([1-9][0-9]\\.)|([0-9]\\.)){3})((25[0-5])|(2[0-4]\\d)|(1[0-9]{2})|([1-9][0-9])|([0-9]))");
                if (r) {
                    f.write(w + " ");
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(BufferedReader read = new BufferedReader(new FileReader("ip.txt"))){
            String s;
            while((s = read.readLine())!=null){
                System.out.println(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
