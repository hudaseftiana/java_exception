/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author acr
 */
public class exception1 {
    public static void main(String[] args) {
try{  
//code that may raise exception  
int data=100/0;  
}catch(ArithmeticException e){System.out.println(e);}  
//rest code of the program   
System.out.println("rest of the code...");  
    }
}
