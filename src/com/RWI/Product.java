package com.RWI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1{
    int pid;
    String Name;
    int cost;
    String color;
    public Product1(int pid, String Name, int cost, String color) {
        this.pid = pid;
        this.Name = Name;
        this.cost = cost;
        this.color = color;
    }
}
public class Product {
    public static void main(String[] args){
        List<Product1> pList = new ArrayList<Product1>();
        pList.add(new Product1(1,"aa",1000,"black"));
        pList.add(new Product1(2,"bb",2000,"white"));
        pList.add(new Product1(3,"cc",3000,"pink"));

        List<String>statelist=pList.stream()
                .filter(p->p.cost>=3000)
                .map(m->m.Name).//fetching
                        collect(Collectors.toList());
        System.out.println(statelist);
    }
}
