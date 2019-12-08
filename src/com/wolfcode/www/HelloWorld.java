package com.wolfcode.www;

import java.util.ArrayList;

public class HelloWorld {

    private static final long NUM = 12L;
    public static final  int num = 12;
    public static final int num1 = 21;
    public static final String string = "huang";

    public static void main(String[] args) {
        System.out.println("世界那么大，我想去看看！！！");
        ArrayList list = new ArrayList<>();
        list.add(2);
        if (list != null) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("HelloWorld.main");
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }

    private void add() {
        Integer a = 122;
        if (a == null) {
            System.out.println(a);
        }
        System.out.println("");
    }

    private void delete() {
        System.out.println();
    }
    
    public void testUpdate(){
        System.out.println("HelloWorld.testUpdate");
    }
}
