package com.example.Damn;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class HelloService implements HelloServiceInterface {
    public String hello(){
        return "hello";
    }

    public String calculator(){
       return "Добро пожаловать в калькулятор";
    }
    public String calculatorPlus(int num1, int num2){
        int num3 = num1 + num2;
        return num1+"+"+num2+"="+num3;
    }
    public String calculatorMinus(int num1, int num2){
        int num3 = num1 - num2;
        return num1+"-"+num2+"="+num3;
    }
}


