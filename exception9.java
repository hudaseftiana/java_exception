/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author acr
 */
public class exception9 {
    public static void main(String[] args) {
        PrintWriter pw;  
 try {  
 pw = new PrintWriter("jtp.txt"); //may throw exception   
 pw.println("saved");  
}  
catch (FileNotFoundException e) {  
System.out.println(e);  
 }         
 System.out.println("File saved successfully");  

    }
}
