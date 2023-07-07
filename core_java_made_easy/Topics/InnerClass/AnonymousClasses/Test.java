package InnerClass.AnonymousClasses;

public class Test {
	public static void main(String[] args) {
		Connection con = DriveManager.getConnection();
		con.createConnection();
	}
}
