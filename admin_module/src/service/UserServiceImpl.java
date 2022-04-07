package service;

import entity.User;
import repository.IUserRepository;
import repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService
	{
		// Step 1: Establishing connection between Service and Repo
		private IUserRepository dao;

		public UserServiceImpl() 
		{
			dao = new UserRepositoryImpl();
		}
		// Step 2: Service calls to perform CRUD Operation
		@Override
		public User addUser(User user) {
			dao.beginTransaction();
			dao.addNewUser(user);
			dao.commitTrasaction();
			return user;
		}

		@Override
		public User updateUser(User user) {
			dao.beginTransaction();
			dao.updateUser(user);
			dao.commitTrasaction();
			return user;
		}

		@SuppressWarnings("unlikely-arg-type")
		public User login(User user) {
			dao.beginTransaction();
			dao.equals(user);
			dao.commitTrasaction();
			return user;
		}

		@Override
		public boolean logOut() {
			dao.beginTransaction();
			dao.commitTrasaction();
			return false;
		}
		@Override
		public User searchUserById(int i) {
			User user = dao.searchUserById(i);

			return user;
				}

}
