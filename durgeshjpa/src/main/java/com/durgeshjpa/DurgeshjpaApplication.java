package com.durgeshjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DurgeshjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DurgeshjpaApplication.class, args);

		userRepository urep=context.getBean(userRepository.class);

		Users u1=new Users();

//		For saving single user, we can use save with single object

//		u1.setName("Abrar");
//		u1.setAge(22);
//		u1.setCity("Kurnool");
//		urep.save(u1);

//		u1.setName("Kalam");
//		u1.setAge(20);
//		u1.setCity("Panchalingala");
//
//		Users u2=new Users();
//		u2.setName("Chand");
//		u2.setAge(21);
//		u2.setCity("Gadivemula");
//
//		Users u3=new Users();
//		u3.setName("Raheem");
//		u3.setAge(19);
//		u3.setCity("Kadapa");
//
//		List<Users> ls= Arrays.asList(u1,u2,u3);
//
//		//for adding more than one user at a time, we can use saveAll with an iterator
//		urep.saveAll(ls);


		//to update the data
//		Optional<Users> user = urep.findById(4);
//
//		Users temp=user.get();
//		temp.setName("Gokula Kishore");
//
//		Users save = urep.save(temp);
//		System.out.println(save);

		//to select and print all the data
//		Iterable<Users> allusers = urep.findAll();
//		allusers.forEach(obj-> System.out.println(obj));

		//to delete a single user
//		urep.deleteById(4);
//		System.out.println("Deleted successfully !!");

		//to custom finder method
		//to find by name and city
		//declare methods in userRepository interface

		Users abrar = urep.findByName("Abrar");
		System.out.println(abrar);

		Users byAge = urep.findByAge(21);
		System.out.println(byAge);
	}

}
