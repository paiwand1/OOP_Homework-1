 
package oop_homework.pkg1;
 
import javax.swing.JOptionPane;

public class OOP_Homework1 {

    
    public static void main(String[] args) {
       String name= JOptionPane.showInputDialog("enter your name :");
                     try {
                        String firstnum= JOptionPane.showInputDialog("enter first num :");
                        String secondnum= JOptionPane.showInputDialog("enter second num :");
                        int fnum=Integer.parseInt(firstnum);
                        int snum=Integer.parseInt(secondnum);
                        int re=fnum+snum;
                        JOptionPane.showMessageDialog(null, "hellow "+name+"  sum= "+re);
                        } 
      catch (NumberFormatException e) {
            String firstnum= JOptionPane.showInputDialog(e+" int format pleas :");
         String secondnum= JOptionPane.showInputDialog(e+"  in int format pleas :");
         int fnum=Integer.parseInt(firstnum);
         int snum=Integer.parseInt(secondnum);
         int re=fnum+snum;
          JOptionPane.showMessageDialog(null, "hellow "+name+"  sum= "+re);
        }
       
       
    }
    
}
