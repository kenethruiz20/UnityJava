import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener{
  private Container container;
  private JLabel lblName;
  private JButton n1;
  private JButton n2;
  private JButton n3;
  private JButton n4;
  private JButton n5;
  private JButton n6;
  private JButton n7;
  private JButton n8;
  private JButton n9;
  private JButton n0;
  private JButton puntito;
  private JButton sum;
  private JButton rest;
  private JButton div;
  private JButton mult;
  private JButton equal;
  private JButton del;
  private JButton dele;
  private JTextArea paneltxt;

public MyWindow(){

  setTitle("Calculadora");
  setSize(500,500);
  setLocation(100,100);
  setDefaultCloseOperation(EXIT_ON_CLOSE);

  container = getContentPane();
  container.setLayout(null);

  n1 = new JButton("1");
  n1.setSize(40,40);
  n1.setLocation(50,50);
  n1.addActionListener(this);
  container.add(n1);

  n2 = new JButton("2");
  n2.setSize(40,40);
  n2.setLocation(95,50);
  n2.addActionListener(this);
  container.add(n2);

  n3 = new JButton("3");
  n3.setSize(40,40);
  n3.setLocation(140,50);
  n3.addActionListener(this);
  container.add(n3);

  n4 = new JButton("4");
  n4.setSize(40,40);
  n4.setLocation(50,95);
  n4.addActionListener(this);
  container.add(n4);

  n5 = new JButton("5");
  n5.setSize(40,40);
  n5.setLocation(95,95);
  n5.addActionListener(this);
  container.add(n5);

  n6 = new JButton("6");
  n6.setSize(40,40);
  n6.setLocation(140,95);
  n6.addActionListener(this);
  container.add(n6);

  n7 = new JButton("7");
  n7.setSize(40,40);
  n7.setLocation(50,140);
  n7.addActionListener(this);
  container.add(n7);

  n8 = new JButton("8");
  n8.setSize(40,40);
  n8.setLocation(95,140);
  n8.addActionListener(this);
  container.add(n8);

  n9 = new JButton("9");
  n9.setSize(40,40);
  n9.setLocation(140,140);
  n9.addActionListener(this);
  container.add(n9);

  n0 = new JButton("0");
  n0.setSize(40,40);
  n0.setLocation(95,195);
  n0.addActionListener(this);
  container.add(n0);

  sum = new JButton("+");
  sum.setSize(41,40);
  sum.setLocation(195,50);
  sum.addActionListener(this);
  container.add(sum);

  rest = new JButton("-");
  rest.setSize(40,40);
  rest.setLocation(195,95);
  rest.addActionListener(this);
  container.add(rest);

  mult = new JButton("*");
  mult.setSize(40,40);
  mult.setLocation(195,140);
  mult.addActionListener(this);
  container.add(mult);

  div = new JButton("/");
  div.setSize(40,40);
  div.setLocation(50,195);
  div.addActionListener(this);
  container.add(div);

  equal = new JButton("=");
  equal.setSize(95,40);
  equal.setLocation(140,195);
  equal.addActionListener(this);
  container.add(equal);

  del = new JButton("C");
  del.setSize(45,40);
  del.setLocation(50,250);
  del.addActionListener(this);
  container.add(del);

  dele = new JButton("CE");
  dele.setSize(45,40);
  dele.setLocation(100,250);
  dele.addActionListener(this);
  container.add(dele);

  puntito = new JButton(".");
  puntito.setSize(40,40);
  puntito.setLocation(150,250);
  puntito.addActionListener(this);
  container.add(puntito);

  paneltxt = new JTextArea();
  paneltxt.setFont( new Font("Arial", Font.PLAIN,15) );
  paneltxt.setSize(135,45);
  paneltxt.setLocation(50,2);
  container.add(paneltxt);

  setVisible(true);
}
double numero1;
String flag;
public void actionPerformed(ActionEvent e){
  if(e.getSource()==n1){
    paneltxt.setText(paneltxt.getText()+"1");
  }
  if(e.getSource()==n2){
    paneltxt.setText(paneltxt.getText()+"2");
  }
  if(e.getSource()==n3){
    paneltxt.setText(paneltxt.getText()+"3");
  }
  if(e.getSource()==n4){
    paneltxt.setText(paneltxt.getText()+"4");
  }
  if(e.getSource()==n5){
    paneltxt.setText(paneltxt.getText()+"5");
  }
  if(e.getSource()==n6){
    paneltxt.setText(paneltxt.getText()+"6");
  }
  if(e.getSource()==n7){
    paneltxt.setText(paneltxt.getText()+"7");
  }
  if(e.getSource()==n8){
    paneltxt.setText(paneltxt.getText()+"8");
  }
  if(e.getSource()==n9){
    paneltxt.setText(paneltxt.getText()+"9");
  }
  if(e.getSource()==n0){
    paneltxt.setText(paneltxt.getText()+"0");
  }
  if(e.getSource()==puntito){
    paneltxt.setText(paneltxt.getText()+".");
  }

  if(e.getSource()==sum){
    if(flag=="sumar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1+tempo;
      paneltxt.setText("");
      flag="sumar";
    }
    else if(flag=="restar")
    {
      double tempo =new Double(paneltxt.getText());
      numero1=numero1-tempo;
      paneltxt.setText("");
      flag="sumar";
    }
    else if(flag=="multiplicar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1*tempo;
      paneltxt.setText("");
      flag="sumar";
    }
    else if(flag=="dividir")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1/tempo;
      paneltxt.setText("");
      flag="sumar";
    }
    else
    {
      numero1=new Double(paneltxt.getText());
      flag="sumar";
      paneltxt.setText("");
    }

  }

  if(e.getSource()==equal)
  {
    if(flag=="sumar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1+tempo;
      paneltxt.setText("");
    }
    else if(flag=="restar")
    {
      double tempo =new Double(paneltxt.getText());
      numero1=numero1-tempo;
      paneltxt.setText("");
    }
    else if(flag=="multiplicar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1*tempo;
      paneltxt.setText("");
    }
    else if(flag=="dividir")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1/tempo;
      paneltxt.setText("");
    }
    paneltxt.setText(Double.toString(numero1));
    flag="";
  }
  if(e.getSource()==rest){
    if(flag=="sumar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1+tempo;
      paneltxt.setText("");
    }
    else if(flag=="restar")
    {
      double tempo =new Double(paneltxt.getText());
      numero1=numero1-tempo;
      paneltxt.setText("");
    }
    else if(flag=="multiplicar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1*tempo;
      paneltxt.setText("");
    }
    else if(flag=="dividir")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1/tempo;
      paneltxt.setText("");
    }
    else
    {
      numero1=new Double(paneltxt.getText());

      paneltxt.setText("");
    }
    flag="restar";
  }

  if(e.getSource()==mult)
  {
    if(flag=="sumar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1+tempo;
      paneltxt.setText("");
    }
    else if(flag=="restar")
    {
      double tempo =new Double(paneltxt.getText());
      numero1=numero1-tempo;
      paneltxt.setText("");
    }
    else if(flag=="multiplicar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1*tempo;
      paneltxt.setText("");
    }
    else if(flag=="dividir")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1/tempo;
      paneltxt.setText("");
    }
    else
    {
      numero1=new Double(paneltxt.getText());

      paneltxt.setText("");
    }
    flag="multiplicar";
  }
  if(e.getSource()==div)
  {
    if(flag=="sumar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1+tempo;
      paneltxt.setText("");
    }
    else if(flag=="restar")
    {
      double tempo =new Double(paneltxt.getText());
      numero1=numero1-tempo;
      paneltxt.setText("");
    }
    else if(flag=="multiplicar")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1*tempo;
      paneltxt.setText("");
    }
    else if(flag=="dividir")
    {
      double tempo = new Double(paneltxt.getText());
      numero1=numero1/tempo;
      paneltxt.setText("");
    }
    else
    {
      numero1=new Double(paneltxt.getText());

      paneltxt.setText("");
    }
    flag="dividir";
  }

  if(e.getSource()==dele)
  {
    paneltxt.setText("");
    flag="";
    numero1=0;
  }
  if(e.getSource()==del)
  {
    paneltxt.setText(paneltxt.getText().substring(0,paneltxt.getText().length()-1));
  }
}
}
