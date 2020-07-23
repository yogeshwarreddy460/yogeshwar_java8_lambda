package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques2 {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("pqrs");
        list.add("pqqrstu");
        list.add("pqr");
        list.add("ppp");

        list = findStrings(list);

        for(String str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list)
    {
        return list.stream().filter(str -> str.startsWith("p")).filter(str -> str.length()==3).collect(Collectors.toList());
    }
}
