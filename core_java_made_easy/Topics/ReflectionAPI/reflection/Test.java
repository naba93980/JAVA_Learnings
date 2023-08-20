package ReflectionAPI.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class<Calculator> calClass=Calculator.class; // This can also be used, but it is compile-time
        Class<?> calClass = Class.forName(Calculator.class.getName());
        System.out.println(calClass.getName());

        Constructor<?>[] constructors = calClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        Method[] methods = calClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

    }
}
