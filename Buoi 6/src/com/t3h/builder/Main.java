package com.t3h.builder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        builder.append("Hello World");
        builder.append(" Android");
        builder.insert(6,"Hi ,");
        builder.delete(6,9);

        builder.reverse();
        System.out.println(builder);

        String s= builder.toString();
        System.out.println(s);
    }
}
