package Annotations.suppresswarning;

import java.util.ArrayList;
import java.util.List;

import Annotations.deprecated.B;

public class A {

    @SuppressWarnings(value = { "deprecation", "unused", "rawtypes"})           
    public static void main(String[] args) {

        B a = new B();
        a.myMethod1();
        a.myMethod2();

        List list=new ArrayList<>();
    }
}

// https://www.ibm.com/docs/en/wdfrhcw/1.4.0?topic=code-excluding-warnings