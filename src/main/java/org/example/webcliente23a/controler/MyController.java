package org.example.webcliente23a.controler;

import org.example.webcliente23a.model.Student;
import org.example.webcliente23a.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/datax")
    public Mono<String> getDatax() {
        Mono<String> res = myService.fetchHellox();
        return res;
    }

    @GetMapping("/data")
    public String getData() {
        String hej = myService.fetchHello();
        //Mono<String> res = myService.fetchHello();
        return hej;
    }

    @GetMapping("/students")
    public Mono<List<Student>> getStudents() {
        Mono<List<Student>> res = myService.fetchStudents();
        return res;
    }


}

