package singleton.e;

import java.util.ArrayList;
import java.util.List;

public enum Facebook {
	INSTANCE;
	
	private List<Usuario> list;
	
	Facebook() {
		list = new ArrayList<Usuario>();
	}
	
	public synchronized void insertUser(String name) {
		Usuario user = new Usuario();
		user.setName(name);
		
		list.add(user);
	}
	
	public synchronized void listUser() {
		if(!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("User " + (i + 1) + ": " + list.get(i).getName());
			}
		}
	}
}
