package com.nitin.demo.myhellowordk8s;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 6/3/2022, Friday
 **/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 What this program snippet doing?
 **/
@RestController
public class HelloworldController {

    @GetMapping
    public String HelloWorld(){

        return "HelloWorld";
    }


    @GetMapping("/home")
    public String HelloWorldHome(){

        return "Hello World Home";
    }

    @GetMapping("/employee")
    public Employee getEmployee(){
        return new Employee("Myra" , 1, "I am in 1st Grade");
    }


}
