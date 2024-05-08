package com.RWI;
interface start{
    public  void show(int x);
}
public class OddEven {
    public static void main(String[] args){
        start s1=x-> {
            System.out.println(x%2==0);
        };
        s1.show(19);
    }
}
