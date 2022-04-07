package repository;

import entity.User;

public interface IUserRepository {
	
	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);


	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	User deleteUser(User user);
	public User searchUserById(int i);


}
