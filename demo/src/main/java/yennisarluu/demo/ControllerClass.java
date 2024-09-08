package yennisarluu.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@Autowired
	ServiceClass SC;

//@PostMapping("/register")
@RequestMapping(value = "/register", method = RequestMethod.POST)
public Employee registerUser(@RequestParam("id") int id,@RequestParam("fname") String fname,@RequestParam("lname") String lname) {
	System.out.println("ID: " + id);
    System.out.println("First Name: " + fname);
    System.out.println("Last Name: " + lname);
    
    return SC.reg(id,fname,lname);
}
@GetMapping("/allusers")
public List<Employee> getAll(){
	return SC.getAll();
}

}
