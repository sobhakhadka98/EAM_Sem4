package com.va.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student createStudent() {
        Student student = new Student();
        student.setStudentId(101);
        student.setFName("Alice");
        student.setLName("Walker");
        student.setPhone("987-654-3210");
        student.setDob("2000-05-15");
        student.setAddressNo(12);
        student.setCity("Toronto");
        student.setStreet("Maple Street");

        return student;
    }
}
