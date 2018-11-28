//******************************************************

//Instituto Federal de São Paulo - Campus Sertãozinho

//Disciplina......: M3LPBD

//Programação de Computadores e Dispositivos Móveis

//Aluno...........: Camila Maria de Oliveira Lima

//******************************************************

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Camila Lima
 */

/* Esse metodo tem como função restringir para que o campo só aceite valor inteiro*/

public class ValidatorIntFilter extends DocumentFilter {
   
   @Override
   public void insertString(FilterBypass fb, int offset, String string,
         AttributeSet attr) throws BadLocationException {

      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.insert(offset, string);

      if (test(sb.toString())) {
         super.insertString(fb, offset, string, attr);
      } else {
         // warn the user and don't allow the insert
      }
   }

   private boolean test(String text) {
      if ("".equals(text)){
          return true;
      }
      try {
         Integer.parseInt(text);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }

   @Override
   public void replace(FilterBypass fb, int offset, int length, String text,
         AttributeSet attrs) throws BadLocationException {

      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.replace(offset, offset + length, text);

      if (test(sb.toString())) {
         super.replace(fb, offset, length, text, attrs);
      } else {
         // warn the user and don't allow the insert
      }

   }

   @Override
   public void remove(FilterBypass fb, int offset, int length)
         throws BadLocationException {
      Document doc = fb.getDocument();
      StringBuilder sb = new StringBuilder();
      sb.append(doc.getText(0, doc.getLength()));
      sb.delete(offset, offset + length);

      if (test(sb.toString())) {
         super.remove(fb, offset, length);
      } else {
         // warn the user and don't allow the insert
      }

   }
    
}
