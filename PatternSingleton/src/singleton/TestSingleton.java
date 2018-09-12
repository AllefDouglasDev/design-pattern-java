package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Facebook.getInstance().insertUser("Allef");
		Facebook.getInstance().insertUser("Douglas");
		Facebook.getInstance().insertUser("Parzival");

		Facebook.getInstance().listUser();
	}
}
