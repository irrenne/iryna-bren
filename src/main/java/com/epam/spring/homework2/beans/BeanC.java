package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.validation.MyValidator;
import org.springframework.beans.factory.annotation.Value;

public class BeanC implements MyValidator {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    @Override
    public String toString() {
        return name + ' ' + value;
    }

    private void customInitMethod() {
        System.out.println("custom init beanC method");
    }

    private void customDestroyMethod() {
        System.out.println("custom destroy beanC method");
    }

    @Override
    public void validate() {
        if (name != null && value > 0) {
            System.out.println("bean "+this.getClass()+" is valid");
        } else {
            System.out.println("bean "+this.getClass()+" is NOT valid");
        }
    }
}