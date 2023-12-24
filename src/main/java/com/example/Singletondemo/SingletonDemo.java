package com.example.Singletondemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Esto garantiza que solo existira una instancia de la clase en el contexto de Spring.
//Tener en cuenta que, por defecto, este es el scope en Spring, Si no definimos un scope
//entonces trabajaremos siempre con singletones
//Para fines del ejercicio, lo colocamos explicito
@Scope("singleton")
public class SingletonDemo {
    public void showMessage() {
        System.out.println("Hola desde SingletonDemo!");
    }
}
