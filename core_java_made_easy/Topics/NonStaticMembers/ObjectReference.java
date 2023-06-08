package NonStaticMembers;

public class ObjectReference {

    static ObjectReference obj = new ObjectReference();

    // return reference to the object it creates
    ObjectReference() {
        System.out.println("creating object");
    } 

    static ObjectReference object;

    static {
        // An object can be created inside any static member
        ObjectReference object = new ObjectReference();

        // only static members can be accessed inside static block
        System.out.println(ObjectReference.obj);
        ObjectReference.obj=ObjectReference.inti(); 
        System.out.println(ObjectReference.obj);
    }

    static ObjectReference inti(){
        return new ObjectReference();
    }

    public static void main(String[] args) {
        ObjectReference.object = new ObjectReference();
        System.out.println(ObjectReference.object);
    }
}
