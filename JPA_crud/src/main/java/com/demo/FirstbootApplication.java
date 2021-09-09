package com.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.UserRepo;
import com.demo.enteties.User;

@SpringBootApplication
public class FirstbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstbootApplication.class, args);

		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		creating user
		
		User u = new User();
		u.setCity("pune");
		u.setName("vaibhav");
		u.setMobile(25485632);
		
		User user = new User();
		user.setCity("jalgav");
		user.setName("aniket");
		user.setMobile(8458632);
		
		
		User save = userRepo.save(u);
//		System.out.println(save);
		
		List<User> listAll = List.of(u,user);
		listAll.forEach(getAll->{
//			System.out.println(getAll);
		});
		
		
//		getting list of all students
		
		Iterable<User> findAll = userRepo.findAll();
		findAll.forEach(get->{
//			System.out.println(get);
		});
		
//		udating
		
		Optional<User> byId = userRepo.findById(17);
		User user2 = byId.get();
		user2.setName("harshal");
//		System.out.println(user2);
		
		
//		delete
		
//		one 
		
//		 userRepo.deleteById(18);
		 System.out.println("deleted");
		 
		 
//		 deleting all 
		 
		 List<User> all = userRepo.findAll();
		 all.forEach(del->{
			 System.out.println(del);
		 });
		 userRepo.deleteAll(all);
	}

}
