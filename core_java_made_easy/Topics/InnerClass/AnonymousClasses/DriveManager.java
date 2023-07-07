package InnerClass.AnonymousClasses;

public class DriveManager {

//  Anonymous classes can be defined outside method
//	Connection con = new Connection() {
//
//		@Override
//		public void createConnection() {
//			System.out.println("Connection created");
//		}
//	};
//	
	static Connection getConnection() {
		
		// Anonymous inner class implements Connection interface
		Connection con = new Connection() {

			@Override
			public void createConnection() {
				System.out.println("Connection created");
			}
		};
		
		return con; 
	}
}
