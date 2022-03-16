package com.dkit.gd2.johnloane;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private int age;


    static class Sortbyage implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.age - b.age;
        }
    }
    public static void main(String[] args) {
        Student[] arr
                = {new Student(111, "Timmy", 16),
                new Student(131, "Toby", 17),
                new Student(121, "Janice", 18),
                new Student(151, "Clara", 17)};


        Arrays.sort(arr, new Sortbyage());
        System.out.println("Sorted by Age: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
//
        System.out.println("Sorted by Name: ");
//        List<string> arr = Student.Cast<string>().ToList();
        Collections.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
    public Student( int id, String name,int age)
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId ()
        {
            return id;
        }

        public String getName ()
        {
            return name;
        }

        public int getAge ()
        {
            return age;
        }
    }

