package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner sc = new Scanner(input);
        List<Shape> tvary = new ArrayList<Shape>();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            //System.out.println(line);
            String[] s = line.split("\\s+");//rozdeli radek na dve casti
            if (s[0].equals("S")){
                Square sq = new Square(Double.parseDouble(s[1]));
                tvary.add(sq);
            }
            if (s[0].equals("R")){
                Rectangular rec = new Rectangular(Double.parseDouble(s[1]), Double.parseDouble(s[2]));
                tvary.add(rec);
            }
            if (s[0].equals("C")){
                Circle cir = new Circle(Double.parseDouble(s[1]));
                tvary.add(cir);
            }
            if (s[0].equals("T")){
                Triangel tr = new Triangel(Double.parseDouble(s[1]),Double.parseDouble(s[2]),Double.parseDouble(s[3]));
                tvary.add(tr);
            }
        }
        double obsahy = 0;
        double obvody = 0;
        for (int i = 0; i < tvary.size(); i++) {
            Shape shape = tvary.get(i);
            obsahy += shape.obsah();
            obvody += shape.obvod();
            //System.out.println(shape.obsah() + " " + shape.obvod());
        }
        System.out.println("prumer obsah = " + obsahy/ tvary.size() + ", prumerny obvod = " + obvody/ tvary.size() );
        sc.close();
    }
}
