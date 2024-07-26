import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator extends JFrame implements ActionListener
{
    private String s="";
    private int i;
    private int result;
    private JButton x0;
    private JButton x1;
    private JButton x2;
    private JButton x3;
    private JButton x4;
    private JButton x5;
    private JButton x6;
    private JButton x7;
    private JButton x8;
    private JButton x9;
    private JButton x11;
    private JButton x12;
    private JButton x13;
    private JButton x14;
    private JButton x15;
    private JButton x16;
    private JButton xc;
    private JTextField xt;
    public calculator()
    {
        setLayout(new FlowLayout());
        xt=new JTextField(10);
        add(xt);
        x1=new JButton("1");
        add(x1);
        x2=new JButton("2");
        add(x2);
        x3=new JButton("3");
        add(x3);
        x4=new JButton("4");
        add(x4);
        x5=new JButton("5");
        add(x5);
        x6=new JButton("6");
        add(x6);
        x7=new JButton("7");
        add(x7);
        x8=new JButton("8");
        add(x8);
        x9=new JButton("9");
        add(x9);
        x0=new JButton("0");
        add(x0);
        x11=new JButton("+");
        add(x11);
        x12=new JButton("-");
        add(x12);
        x13=new JButton("*");
        add(x13);
        x14=new JButton("/");
        add(x14);
        x15=new JButton("%");
        add(x15);
        x16=new JButton("=");
        add(x16);
        xc=new JButton("C");
        add(xc);
        x1.addActionListener(this);
        x2.addActionListener(this);
        x3.addActionListener(this);
        x4.addActionListener(this);
        x5.addActionListener(this);
        x6.addActionListener(this);
        x7.addActionListener(this);
        x8.addActionListener(this);
        x9.addActionListener(this);
        x0.addActionListener(this);
        x11.addActionListener(this);
        x12.addActionListener(this);
        x13.addActionListener(this);
        x14.addActionListener(this);
        x15.addActionListener(this);
        x16.addActionListener(this);
        xc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==x1)
        {
            s=s+"1";
            xt.setText(s);
        }
        if(e.getSource()==x2)
        {
            s=s+"2";
            xt.setText(s);
        }
        if(e.getSource()==x3)
        {
            s=s+"3";
            xt.setText(s);
        }
        if(e.getSource()==x4)
        {
            s=s+"4";
            xt.setText(s);
        }
        if(e.getSource()==x5)
        {
            s=s+"5";
            xt.setText(s);
        }
        if(e.getSource()==x6)
        {
            s=s+"6";
            xt.setText(s);
        }
        if(e.getSource()==x7)
        {
            s=s+"7";
            xt.setText(s);
        }
        if(e.getSource()==x8)
        {
            s=s+"8";
            xt.setText(s);
        }
        if(e.getSource()==x9)
        {
            s=s+"9";
            xt.setText(s);
        }
        if(e.getSource()==x0)
        {
            s=s+"0";
            xt.setText(s);
        }
        if(e.getSource()==xc)
        {
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x11)
        {
            int a=Integer.parseInt(xt.getText());
            result=a;
            i=1;
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x12)
        {
            int a=Integer.parseInt(xt.getText());
            result=a;
            i=2;
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x13)
        {
            int a=Integer.parseInt(xt.getText());
            result=a;
            i=3;
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x14)
        {
            int a=Integer.parseInt(xt.getText());
            result=a;
            i=4;
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x15)
        {
            int a=Integer.parseInt(xt.getText());
            result=a;
            i=5;
            s="";
            xt.setText(s);
        }
        if(e.getSource()==x16)
        {
            int b=Integer.parseInt(xt.getText());
            if(i==1)
                result=result+b;
            if(i==2)
                result=result-b;
            if(i==3)
                result=result*b;
            if(i==4)
                result=result/b;
            if(i==5)
                result=result%b;
            xt.setText(""+result);
        }
    }
    public static void main(String args[])
    {
        calculator x=new calculator();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setSize(500,500);
        x.setVisible(true);
    }
}
