package com.wolfcode.www;

/**
 * @author 2257
 * @date 2019/12/8 - 21:09
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        int add = 22;
        System.out.println(add);
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");
        System.out.println("add = " + add);
        System.out.println(add);
        String[] arr = new String[]{"tom","huang","zhang"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hello.main");
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
    }
}
