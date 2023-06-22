package CollectionFramework.Map;

public class User {

    @Override
    // this method is called automatically when  u try to print an instance of this called
    public String toString() {
        return "Uuuser";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Called");
    }
}
