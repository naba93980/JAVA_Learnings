package eventmanagement.com.emc.test;

import eventmanagement.com.emc.dto.Event;
import eventmanagement.com.emc.dto.Organizer;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id = 1231;
        organizer.name = "Apple Inc";
        System.out.println(organizer);
        System.out.println(organizer.name);

        Event event = new Event(561L, "Iphone 100 Launch",  "Grand Launch");
        System.out.println(event.description);
    }
}

