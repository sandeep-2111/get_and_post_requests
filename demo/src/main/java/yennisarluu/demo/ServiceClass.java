package yennisarluu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
@Autowired
RepoClass RC;
	public Employee reg(int id,String fname,String lname) {
		return RC.save(new Employee(id,fname,lname));
	}
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return RC.findAll();
	}

}
