package com.learning.java.classobj;

/* Java: добавление пользовательской логики в getter/setter методы с присваиванием полей? */

public class User {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		/* логика: метода-синглтона... */
		if(this.id==null || this.id.isEmpty())
			this.id = id;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId("001");
		System.out.println("before - " + user.getId());

		user.setId("002");
		System.out.println("after - " + user.getId());
	}
}
