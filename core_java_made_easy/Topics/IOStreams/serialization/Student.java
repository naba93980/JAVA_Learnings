package IOStreams.serialization;

import java.io.Serializable;

public class Student implements Serializable {

    int roll;
    String name;
    transient int ssn;  // transient means this variable is not serialized

    // methods are not serialzed only data(state of an object is serialized)
    public void print(){
        System.out.println("HI");
    }

    public Student(int roll, String name, int ssn) {
        this.roll = roll;
        this.name = name;
        this.ssn = ssn;
    }
}
