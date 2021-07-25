import java.awt.*; 
import java.awt.event.*;   
public class CheckboxExample1  
{  
   public static void main(String args[])  
{  
       Frame f= new Frame("Checkbox Example");  
        Checkbox cbox1 = new Checkbox("Java");  
        cbox1.setBounds(100,100, 50,50);  
        Checkbox cbox2 = new Checkbox("Python");  
        cbox2.setBounds(100,150, 50,50);  
        f.add(cbox1);  
        f.add(cbox2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
     }  
    }  