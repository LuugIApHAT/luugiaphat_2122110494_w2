package com.example.LuuGiaPhat;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/sum")
    public int sumNumbers(@RequestBody SumRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
}

// DTO để nhận dữ liệu từ request body
class SumRequest {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
