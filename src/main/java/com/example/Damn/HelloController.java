package com.example.Damn;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloController {
    private final HelloServiceInterface helloService;
    public  HelloController(HelloServiceInterface helloService){
        this.helloService = helloService;
    }
    @GetMapping()
    public String hello(){
        return helloService.hello();
    }
    @GetMapping(path = "/calculator")
    public String calculator(){
        return helloService.calculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(int num1, int num2){
        return helloService.calculatorPlus(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(int num1, int num2){
        return helloService.calculatorPlus(num1,num2);
    }
}
