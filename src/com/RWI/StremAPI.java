package com.RWI;
import java.util.List;
import java.util.stream.Collectors;

public class StremAPI {
    public static void main(String[] args){
        List<String> l1=List.of("Sneha","Ankit","Sakshi","Siddharth", "Parul","Prit","Pinki","rahul","suresh");

        List<String> names= l1.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
        List<String> names1= l1.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(names1);
    }
}
