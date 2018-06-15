package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BaseException;
import com.example.demo.exception.CustomException1;
import com.example.demo.exception.CustomException2;

/**
 * @author 
 * @since 
 */
@RestController
@RequestMapping({"","/"})
public class HomeController {

    @RequestMapping("/ex1")
    public String ex1(){
        // will be catched by global exception handler method handleBaseException
        throw new BaseException("Base Exception");
    }

    @RequestMapping("/ex2")
    public String ex2(){
        // will be catched by global exception handler method handleBaseException
        throw new CustomException1();
    }

    @RequestMapping("/ex3")
    public String ex3(){
        // will be catched by global exception handler method handleBaseException
        throw new CustomException2();
    }

    @RequestMapping("/ex4")
    public String ex4(){
        // will be catched by global exception handler method handleException
        throw new NullPointerException("null pointer exception");
    }

    @RequestMapping("/ex5")
    public String ex5(){
        // will be catched by controller exception hnadler handler method nfeHandler
        throw new NumberFormatException("number format exception");
    }
    
    @RequestMapping("/ex6")
    public String ex6() throws CloneNotSupportedException {
    	// will be catched by controller exception hnadler handler method nfeHandler
    	throw new CloneNotSupportedException("Clone Not Supported Exception !!");
    }
    
    @RequestMapping("/ex8")
    public String ex8() {
    	// will be catched by controller exception hnadler handler method nfeHandler
    	throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bounds Exception");
    }
    
    @RequestMapping("/ex7")
    public String ex7() throws IOException{
    	// will be catched by controller exception hnadler handler method nfeHandler
    	throw new IOException("IO Exception !!");
    }

    /**
     * This method will handle all the Number Format Exceptions that arise within this controller.
     *
     * */
    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.getMessage();
    }

    public String someMethod() {
        try {
            // do some stuff here
            return "something";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
