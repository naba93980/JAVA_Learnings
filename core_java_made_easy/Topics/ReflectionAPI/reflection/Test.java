package ReflectionAPI.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // Class<Calculator> calClass=Calculator.class; // This can also be used, but it is compile-time
        Class<?> calClass = Class.forName(Calculator.class.getName()); // the Calculator.class object is stored in meta-space of jvm during class loading
        System.out.println(calClass.getName());

        // gets all the constructors
        Constructor<?>[] constructors = calClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        // gets all the methods
        Method[] methods = calClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Constructor<?> constructor = calClass.getConstructor(); // gets the default constructor
        Calculator calClassInstance = (Calculator) constructor.newInstance();
        calClassInstance.setNum1(100);

        Method method1 = calClass.getMethod("getNum1"); // gets the required method
        System.out.println(method1.invoke(calClassInstance));

        Constructor<?> constructor2 = calClass.getConstructor(int.class); // gets the parameterized constructor
        Calculator calClassInstance2 = (Calculator) constructor2.newInstance(5);
        System.out.println(calClassInstance2);

    }
}
