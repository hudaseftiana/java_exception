
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
public class exception6 {
    public static void main(String[] args) {
 try  
{  
int data1=50/0; //may throw exception   
}  
catch(Exception e)  
{  
int data2=50/0; }//may throw exception   
System.out.println("rest of the code");  
    }
}

