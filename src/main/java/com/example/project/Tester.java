package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("banana", "Bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"));
        System.out.println(Main.moveBWords(list));
    }
}
