package com.va.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value="/employee", method=RequestMethod.GET)
public Employee create() {
	
	Employee e1 = new Employee();
	// using static data for example purposes only.. should be avoided.. 
	e1.setEmpId(234);
	e1.setJobTitle("Mgr");
	e1.setEmpName("john");
	e1.setSalary(90000);
	return e1;
}

}
