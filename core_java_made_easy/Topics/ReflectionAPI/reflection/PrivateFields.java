package ReflectionAPI.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class PrivateFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Class<?> calClass = Class.forName(Calculator.class.getName());
        Constructor<?> constructor = calClass.getConstructor();
        Calculator obj = (Calculator)constructor.newInstance();
        Annotation[] calAnnotations = calClass.getAnnotations();
        System.out.println(Arrays.toString(calAnnotations));
        Field num1Field = calClass.getDeclaredField("num1");
        num1Field.setAccessible(true);
        num1Field.set(obj, 80);
        System.out.println(obj.getNum1());

        MyAnnotation annotation = (MyAnnotation) calAnnotations[0];
        String value1 = annotation.value1();
        String value2 = annotation.value2();
        System.out.println(value1);
        System.out.println(value2);
    }
}
