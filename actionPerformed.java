import java.awt.*;
import java.awt.event.*;
class SimpleCalculator extends Frame implements ActionListener
{
Frame f1=new Frame();
Label l1=new Label(&quot;Enter first number&quot;);
Label l2=new Label(&quot;Enter Second number&quot;);
Label l3=new Label(&quot;Result&quot;);
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button(&quot;Add&quot;);
Button b2=new Button(&quot;Sub&quot;);
Button b3=new Button(&quot;Mul&quot;);
Button b4=new Button(&quot;Div&quot;);
Button b5=new Button(&quot;Cancel&quot;);
SimpleCalculator()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
l3.setBounds(50,180,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);

b4.setBounds(230,250,50,20);
b5.setBounds(290,250,50,20);
b1.setBackground(Color.red);
b2.setBackground(Color.green);
b3.setBackground(Color.red);
b4.setBackground(Color.green);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);
f1.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
f1.setLayout(null);
f1.setVisible(true);
f1.setSize(500,500);
l1.setForeground(Color.red);
l2.setForeground(Color.red);
l3.setForeground(Color.red);
f1.setBackground(Color.pink);
}
public void actionPerformed(ActionEvent e)

{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1/n2));
}
if(e.getSource()==b5)
{
System.exit(0);
}
}
public static void main(String args[])
{
new SimpleCalculator();
}
}