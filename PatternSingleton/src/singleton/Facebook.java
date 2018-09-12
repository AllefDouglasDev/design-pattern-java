package singleton;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
	
	private static Facebook INSTANCE;
	
	private List<Usuario> list;
	
	private Facebook() {
		list = new ArrayList<Usuario>();
	}
	
	public static Facebook getInstance() {
		if(INSTANCE == null) {
			synchronized (Facebook.class) {
				if(INSTANCE == null) {
					INSTANCE = new Facebook();
				}
			}
		}
		return INSTANCE;
	}
	
	public synchronized void insertUser(String name) {
		Usuario user = new Usuario();
		user.setName(name);
		
		list.add(user);
	}
	
	public synchronized void listUser() {
		if(!list.isEmpty()){
			for (int i = 0; i < list.size(); i++) {
				System.out.println("User " + (i + 1) + ": " + list.get(i).getName());
			}
		}
	}
}
