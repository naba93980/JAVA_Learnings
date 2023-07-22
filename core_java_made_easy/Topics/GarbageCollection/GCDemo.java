package GarbageCollection;

public class GCDemo {

    int id;
    public GCDemo(int id) {
        this.id=id;
        System.out.println(this.id + " created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.id + " garbage collected");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 500000; i++) {
            new GCDemo(i);
        }
        // System.gc(); // doesnot gurantee, just requests jvm to garbage collect
    }
}
