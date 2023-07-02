package Enums;

public class Test {
    public static void main(String[] args) {
        Databases db=Databases.MYSQL;
        System.out.println(db);
        System.out.println(Databases.values());
        System.out.println(Databases.ORACLE.ordinal());
        System.out.println(Databases.ORACLE.getFee());
    }
}
