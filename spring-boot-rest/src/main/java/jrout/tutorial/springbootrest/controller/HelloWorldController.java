package jrout.tutorial.springbootrest.controller;

import jrout.tutorial.springbootrest.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

//    @RequestMapping("/world")
    @GetMapping("/world/{name}")
//    public String helloWorld(@RequestParam(value = "name" , defaultValue = "Peter") String name){
    public String helloWorld(@PathVariable(value = "name") String name){
        return String.format("Get Hello %s "+ new java.util.Date() , name);
    }

    @PostMapping(value = "/world/{name}")
//    public String helloWorld(@RequestParam(value = "name" , defaultValue = "Peter") String name){
    public String xyz(@PathVariable(value = "name") String name){
        return String.format(" Post Hello %s "+ new java.util.Date() , name);
    }


    @GetMapping(value = "/student")
    @ResponseBody
    public Student returnStudent(){
        Student student = new Student();
        student.setName("Peter");
        student.setPlace("NY");
        student.setAddress("Some street");
        return student;
    }

}
