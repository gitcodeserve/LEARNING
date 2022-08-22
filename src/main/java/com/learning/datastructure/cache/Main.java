package com.learning.datastructure.cache;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Shantanu 1");
        Employee e2 = new Employee(102, "Shantanu 2");
        Employee e3 = new Employee(103, "Shantanu 3");
        Employee e4 = new Employee(104, "Shantanu 4");
        Employee e5 = new Employee(105, "Shantanu 5");

        Department d1 = new Department(101, "dept 1");
        Department d2 = new Department(102, "dept 2");
        Department d3 = new Department(103, "dept 3");
        Department d4 = new Department(104, "dept 4");

        LRUCache<Employee, Department> lruCache = LRUCache.newInstance(4);
        lruCache.put(e1, d1);
        lruCache.put(e2, d2);
        lruCache.put(e3, d3);
        lruCache.put(e4, d4);
        lruCache.put(e5, d1);



        lruCache.forEach((k,v) -> System.out.println(k.toString() + " " + v.toString()));

    }
}
