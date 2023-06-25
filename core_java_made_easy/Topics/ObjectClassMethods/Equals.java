package ObjectClassMethods;

class Passenger {

    private int id;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Passenger passenger = (Passenger) obj;
        if (this.id == passenger.id && passenger.getFirstName().equals(this.firstName) && passenger.getLastName().equals(this.lastName))
            return true;
        return false;
    }

}

public class Equals {
    public static void main(String[] args) {

        Passenger p1 = new Passenger();
        p1.setFirstName("Nabajyoti");
        p1.setLastName("Modak");
        p1.setId(001);

        Passenger p2 = new Passenger();
        p2.setFirstName("Nabajyoti");
        p2.setLastName("Modak");
        p2.setId(001);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
