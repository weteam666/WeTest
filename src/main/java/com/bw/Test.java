package com.bw;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var list = List.of("a", "b", "c");
        list.stream().forEach(System.out::println);
    }

}
