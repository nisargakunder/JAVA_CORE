package a.c;

import a.b.*;

public class demo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.l);

        // protected within same pacakage can be accessed without inheting also
        //protected within diff package can be accessed by inherting
        //default can be accessed within package anyhow..not outside pacakge
        //private nly within clas

    }
}
