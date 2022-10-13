/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController


public class HolaController {
    
    @GetMapping("/")
    public String primerendpoint (){
        return "<h1>Hola a todos!, este es mi primer servicio</h1>";
    } 
    
}
