package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ques1 {
    public static void main(String args[])
    {
        IntStream stream = IntStream.of(5,7,74,89,54,268,74,25,7,2);

        OptionalDouble opt = stream.average();
        if(opt.isPresent()) {
            System.out.println("Avg : " + opt.getAsDouble());
        } else {
            System.out.println(-1);
        }
    }
}
