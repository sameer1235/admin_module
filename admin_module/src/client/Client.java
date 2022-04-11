package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Admin;
import entity.User;
import service.IUserService;
import service.UserServiceImpl;

public class Client {
	public static void main(String[] args) 
	{
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		em.getTransaction().begin();
		
	Admin admin= new Admin();
	
	User user = new User();
	IUserService service = new UserServiceImpl();

// Create
/*
user.setId(114);
user.setName("Shaikh Amer");
user.setType("user");
user.setPassword("12345");
//service.addUser(user);


admin.setId(4);
admin.setName("sam");
admin.setPassword("1234");
admin.setUser(user);
em.persist(admin);
em.getTransaction().commit();
System.out.println("Record added ");
em.close();
fact.close();
*/

// Retrieve

user	= service.searchUserById(111);
System.out.println("ID is:"+user.getId());
System.out.println("NAME is:"+user.getName());
System.out.println("Type is:"+user.getType());

/*
System.out.println("admin id is : "+admin.getId());
System.out.println("admin id is : "+admin.getName());
System.out.println("admin id is : "+admin.toString());
*/

/*

// Update
user	= service.updateUser(user);
user.setId(100);
user.setName("rohit");
user.setPassword("rohit20");
user.setType("admin");
service.updateUser(user);
System.out.println("Update is successful");


user = service.login(user);
admin = service.login(admin);
user.setName("rishab");
user.setPassword("rishab99");

System.out.println("Enter userId :" + admin);

*/

	}
}
