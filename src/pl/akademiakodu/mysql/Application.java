package pl.akademiakodu.mysql;

public class Application {

	public static void main(String[] args) {
		
		// AddUser
		User u = new User("Oskar", "Zambrowski", 788848832);
		UserDao uDao = new UserDao(); 
		uDao.addUser(u);

	}

}
