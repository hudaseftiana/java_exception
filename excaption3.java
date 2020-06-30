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
public class excaption3 {
    public static void main(String[] args) {
        try {  
int data=50/0; 
//may throw exception
System.out.println("rest of the code");//Jika kalimat yang ditulis diletakkan 
//sebelum kurung kata catch, maka tidak akan di eksekusi
}catch(ArithmeticException e)  
{  
System.out.println(e);  
}  
  
    }
}
