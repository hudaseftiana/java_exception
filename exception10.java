/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.swing.JOptionPane;

/**
 *
 * @author acr
 */
public class exception10 {
    public static void main(String[] args) {
        //Tampilan by JOptionPane
      String angka = JOptionPane.showInputDialog("Masukkan nilai a");
      int a = Integer.parseInt(angka);
      int b= 0;
        try{
      int c =a/b;}
      catch(Exception e)  {
JOptionPane.showMessageDialog(null,"Error, Periksa kembali angka yang anda masukkan karena "+ e);
    }
  }
}

