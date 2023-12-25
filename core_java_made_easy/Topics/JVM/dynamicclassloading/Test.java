package JVM.dynamicclassloading;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> x = Class.forName("JVM.dynamicclassloading.User");     // wildcard here is bcoz it is runtime and so  u dont know about class type during compilation
        Class<User> y = User.class; // but this is compile time to u can use class type here i.e Class<User>

        System.out.println(x.getDeclaredMethods().length);

        System.out.println(x.getClassLoader());
        System.out.println(String.class.getClassLoader());  // bootstrap class loader, but since it is in native language so here it shows null
    }
}
