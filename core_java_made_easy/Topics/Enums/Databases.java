package Enums;

public enum Databases { // enum class extends Enum class from java.lang

    MYSQL(5), ORACLE(10), SQLSERVER(15);    // instantiate the objects here

    int fee;

    Databases(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }

}

// enum is internally class, and all the constants are objects of that
// particular class and implicitly they are public static final