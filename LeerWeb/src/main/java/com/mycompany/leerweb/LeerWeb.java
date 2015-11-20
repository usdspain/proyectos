/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leerweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 *
 * @author formacion
 */
public class LeerWeb {
    public static void main(String [] args) throws MalformedURLException, IOException{
        String mensage="";
     
    System.out.println("que dirección quieres visualizar?");    
    
        URL yahoo = new URL("http://www.yahoo.com/");
        
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            mensage+=inputLine;
        in.close();
        System.out.println(mensage);

          
      
         }
 
    }
   

