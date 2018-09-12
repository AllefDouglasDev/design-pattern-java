package singleton.e;

public class TestSingleton {

	public static void main(String[] args) {
		Facebook.INSTANCE.insertUser("Allef");
		Facebook.INSTANCE.insertUser("Douglas");
		Facebook.INSTANCE.insertUser("Parzival");
		
		Facebook.INSTANCE.listUser();
	}
}
