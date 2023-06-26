package ObjectClassMethods;

class Passenger2 {

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
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + id;
        // return result;
        return this.id;
    }

}

public class HashCode {
    public static void main(String[] args) {
        Passenger2 passenger=new Passenger2();
        passenger.setId(123);
        passenger.setFirstName("Nabajyoti");
        passenger.setLastName("Modak");
        System.out.println(passenger.hashCode());
    }
}
