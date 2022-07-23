package com.methods;

public class Main {
    public static void main(String[] args) {
        String name = "Harry";
        String hisName = new String("Harry");
        String untrimmedName = "      Harry      ";
        System.out.println("1) " + name);
        int length = name.length();

        System.out.println("2) " + length);

        System.out.println("3) " + name.toLowerCase());
        System.out.println("4) " + name.toUpperCase());

        System.out.println("5) " + name.concat(" is good boy"));

        System.out.println("6) " + name.charAt(3));

        System.out.println("7) " + name.equals(hisName));
        System.out.println("8) " + name.equals("Harry"));
        System.out.println("9) " + hisName.equalsIgnoreCase("harry"));

        System.out.println("10) " + untrimmedName.trim());

        System.out.println("11) " + name.substring(3));

        System.out.println("12) " + name.substring(1, 5));

        System.out.println("13) " + name.replace("ar", "it"));
        System.out.println("14) " + name.replace('r', 't')); // replaces all the 'r' with 't';

        System.out.println("15) " + name.startsWith("tar"));
        System.out.println("16) " + name.startsWith("Har"));
        System.out.println("17) " + name.endsWith("Har"));

        System.out.println("18) " + name.indexOf("ar"));
        System.out.println("19) " + name.indexOf('r', 3));
        System.out.println("20) " + name.indexOf("rry", 3)); // "rry" is found at index starting from 2

        System.out.println("21) " + name.lastIndexOf('r'));
        System.out.println("22) " + name.lastIndexOf('r', 1));
        System.out.println("23) " + name.lastIndexOf('r', 3));

        System.out.println("24) " + untrimmedName.replace(' ', '_'));

    }
}
