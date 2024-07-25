
//import package swing&awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class FindIP extends Frame implements  ActionListener{
   
       JTextField tf;
       JLabel la;
       JButton b;
       
       FindIP(){
         tf=new JTextField();
         tf.setBounds(50,50,150,20);
         la=new JLabel();
         la.setBounds(50,100,250,20);
         b =new JButton("Find IP");
         b.setBounds(50,150,95,30);
         
         b.addActionListener(this);
         add(b);
         add(tf);
         add(la);
         
         setSize(400,400);
         setLayout(null);
         setVisible(true);
         
        }
        public void actionPerformed(ActionEvent e){
            try{
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            la.setText("IP of"+host+"is:" + ip);
            }catch(Exception ex){System.out.println(ex);}
        }
        public static void main (String[] args){
            new FindIP();
        
        }}
        
        
   
  