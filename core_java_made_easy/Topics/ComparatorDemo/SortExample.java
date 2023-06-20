package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person("John", 23));
        people.add(new Person("Alice", 35));
        people.add(new Person("Bob", 12));

        Collections.sort(people, new AgeComparator());

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
