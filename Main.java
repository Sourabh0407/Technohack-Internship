import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JFrame frame;
    JTextArea Num1Text,Num2Text,resultt,op;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,Badd,Bsub,Bmul,Bdiv,Bclr,Beql;
    Font fontForTextArea,fontForButtons,fontForButtonsCLR;
    String Num1="0",Num2="0",Operation="";

   Main(){
       Color c = new Color(252, 252, 252);
       Color cCLR = new Color(255, 40, 40);
       Color cOPR = new Color(1, 192, 33);
       c.brighter();

        frame=new JFrame("Calculator");
        frame.setSize(380,550);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);

        fontForTextArea=new Font("Courier", Font.PLAIN, 30);
        fontForButtons=new Font("Courier",Font.BOLD,30);
        fontForButtonsCLR=new Font("Courier",Font.BOLD,20);

        Num1Text=new JTextArea("0");
        Num1Text.setBounds(30,30, 310,45);
        Num1Text.setRows(1);
        Num1Text.setColumns(10);
        Num1Text.setFont(fontForTextArea);
        frame.add(Num1Text);

        //Border border;
       int w=75,h=75,x=30,y=90;

        zero=new Button("0");
        zero.setBackground(c);
        zero.setBounds(x,y+316,w+w+2,h);
        zero.addActionListener(this);
        zero.setFont(fontForButtons);
        zero.setFocusable(false);
        zero.requestFocusInWindow();

        one=new Button("1");
        one.setBackground(c);
        one.setBounds(x,y+237,w,h);
        one.addActionListener(this);
        one.setFont(fontForButtons);
        //one.;
        one.setFocusable(false);
        one.requestFocusInWindow();

        two=new Button("2");
        two.setBackground(c);
        two.setBounds(x+79,y+237,w,h);
        two.addActionListener(this);
        two.setFont(fontForButtons);
        //two.;
        two.setFocusable(false);
        two.requestFocusInWindow();

        three=new Button("3");
        three.setBackground(c);
        three.setBounds(x+158,y+237,w,h);
        three.addActionListener(this);
        three.setFont(fontForButtons);
        //three.;
        three.setFocusable(false);
       three.requestFocusInWindow();

        four=new Button("4");
        four.setBackground(c);
        four.setBounds(x,y+158,w,h);
        four.addActionListener(this);
        four.setFont(fontForButtons);
        //four.;
        four.setFocusable(false);
        four.requestFocusInWindow();

        five=new Button("5");
        five.setBackground(c);
        five.setBounds(x+79,y+158,w,h);
        five.addActionListener(this);
        five.setFont(fontForButtons);
        //five.;
        five.setFocusable(false);
       five.requestFocusInWindow();

        six=new Button("6");
        six.setBackground(c);
        six.setBounds(x+158,y+158,w,h);
        six.addActionListener(this);
        six.setFont(fontForButtons);
        //six.;
        six.setFocusable(false);
       six.requestFocusInWindow();

        seven=new Button("7");
        seven.setBackground(c);
        seven.setBounds(x,y+79,w,h);
        seven.addActionListener(this);
        seven.setFont(fontForButtons);
        //seven.;
        seven.setFocusable(false);
        seven.requestFocusInWindow();

        eight=new Button("8");
        eight.setBackground(c);
        eight.setBounds(x+79,y+79,w,h);
        eight.addActionListener(this);
        eight.setFont(fontForButtons);
        //eight.;
        eight.setFocusable(false);
        eight.requestFocusInWindow();

        nine=new Button("9");
        nine.setBackground(c);
        nine.setBounds(x+158,y+79,w,h);
        nine.addActionListener(this);
        nine.setFont(fontForButtons);
        //nine.;
        nine.setFocusable(false);
       nine.requestFocusInWindow();


        dot=new Button(".");
        dot.setBackground(c);
        dot.setBounds(x+158,y+316,w,h);
        dot.addActionListener(this);
        dot.setFont(fontForButtons);
        //dot.;
        dot.setFocusable(false);
       dot.requestFocusInWindow();

        Badd=new Button("+") ;
        Badd.setBackground(c);
        Badd.setBounds(x+237,y+79,w,h+h+2);
        Badd.addActionListener(this);
        Badd.setFont(fontForButtons);
        Badd.setForeground(cOPR);
        Badd.setFocusable(false);
        //Badd.setPressedIcon(null);
       Badd.requestFocusInWindow();

        Bsub=new Button("-");
        Bsub.setBackground(c);
        Bsub.setBounds(x+237,y,w,h);
        Bsub.addActionListener(this);
        Bsub.setFont(fontForButtons);
        Bsub.setForeground(cOPR);
        Bsub.setFocusable(false);
        //Bsub.setPressedIcon(null);
       Bsub.requestFocusInWindow();

        Bmul=new Button("*");
        Bmul.setBackground(c);
        Bmul.setBounds(x+158,y,w,h);
        Bmul.addActionListener(this);
        Bmul.setFont(fontForButtons);
        Bmul.setForeground(cOPR);
        Bmul.setFocusable(false);
        //Bmul.setPressedIcon(null);
       Bmul.requestFocusInWindow();

        Bdiv=new Button("/");
        Bdiv.setBackground(c);
        Bdiv.setBounds(x+79,y,w,h);
        Bdiv.addActionListener(this);
        Bdiv.setFont(fontForButtons);
        Bdiv.setForeground(cOPR);
        Bdiv.setFocusable(false);
        //Bdiv.setPressedIcon(null);
       Bdiv.requestFocusInWindow();


        Bclr=new Button("CLR");
        Bclr.setBackground(c);
        Bclr.setBounds(x,y,w,h);
        Bclr.addActionListener(this);
        Bclr.setFont(fontForButtonsCLR);
        Bclr.setForeground(cCLR);
        Bclr.setFocusable(false);
        //Bclr.setPressedIcon(null);
        Bclr.requestFocusInWindow();

        Beql=new Button("=");
        Beql.setBackground(c);
        Beql.setBounds(x+237,y+237,w,h+h+2);
        Beql.addActionListener(this);
        Beql.setFont(fontForButtons);
        Beql.setForeground(Color.WHITE);
        Beql.setFocusable(false);
        Beql.setBackground(cOPR);
        Beql.requestFocusInWindow();


        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(Badd);
        frame.add(Bsub);
        frame.add(Bmul);
        frame.add(Bdiv);
        frame.add(Beql);
        frame.add(Bclr);
        frame.add(dot);



        frame.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){


        String button=e.getActionCommand();

        if(button.equals("=")){

           //String strnum1=Num1Text.getText();
           //String strnum2=Num2Text.getText();
//            System.out.println("\nIn =    4");
//            System.out.println("Num1:"+Num1);
//            System.out.println("Num2:"+Num2);

           int n1=Integer.parseInt(Num1);
           int n2=Integer.parseInt(Num2);
            //System.out.println("\nIn =    5");

             int result=0;
           String res="result";
                   if(Operation=="+"){
                       result=n1+n2;

                   } else if (Operation=="-") {
                       result=n1-n2;

                   } else if (Operation=="*") {
                       result=n1*n2;

                   } else if (Operation=="/") {
                      if(n1!=0 && n2!=0){
                            result=n1/n2;}
                      else{
                            result=0;}
                   }
           // System.out.println("result int :");
            //System.out.println(result);


            //System.out.println("\nIn =    6");
               res=Integer.toString(result);
           // System.out.println("Result str=");
            //System.out.println(res);
               Num1=res;
               Num2="0";
               Num1Text.setText(res);
            //System.out.println("\nIn =    7");

        }


        if(button.equals("+") ){
            Operation="+";
            Num1Text.append("+");
        }
        else if(button.equals("-") ){
            Operation="-";
            Num1Text.append("-");
        }
        else if(button.equals("*") ){
            Operation="*";
            Num1Text.append("*");
        }
        else if(button.equals("/") ){
            Operation="/";
            Num1Text.append("/");
        }
        else if(button.equals("CLR") ){
            Num1Text.setText("0");
            Num1="0";
            Num2="0";
            Operation="";

        }
        else if(button.equals(".") ){
            
            
        }
        else if(Operation=="") {

            switch (button) {
                case "0":
                    Num1 = Num1 + "0";
                    Num1Text.setText("");
                    Num1Text.setText(Num1);
                    break;
                case "1":
                    Num1 = Num1 + "1";
                    Num1Text.setText("");
                    Num1Text.setText(Num1);
                    break;
                case "2":
                    Num1 = Num1 + "2";
                    Num1Text.setText(Num1);
                    break;
                case "3":
                    Num1 = Num1 + "3";
                    Num1Text.setText(Num1);
                    break;
                case "4":
                    Num1 = Num1 + "4";
                    Num1Text.setText(Num1);
                    break;
                case "5":
                    Num1 = Num1 + "5";
                    Num1Text.setText(Num1);
                    break;
                case "6":
                    Num1 = Num1 + "6";
                    Num1Text.setText(Num1);
                    break;
                case "7":
                    Num1 = Num1 + "7";
                    Num1Text.setText(Num1);
                    break;
                case "8":
                    Num1 = Num1 + "8";
                    Num1Text.setText(Num1);
                    break;
                case "9":
                    Num1 = Num1 + "9";
                    Num1Text.setText(Num1);
                    break;
            }
        }
        else if(Operation!=""){
            switch (button) {
                case "0":
                    Num2 = Num2 + "0";
                    Num1Text.append("0");
                    break;
                case "1":
                    Num2 = Num2 + "1";
                    Num1Text.append("1");

                    break;
                case "2":
                    Num2 = Num2 + "2";
                    Num1Text.append("2");

                    break;
                case "3":
                    Num2 = Num2 + "3";
                    Num1Text.append("3");

                    break;
                case "4":
                    Num2 = Num2 + "4";
                    Num1Text.append("4");

                    break;
                case "5":
                    Num2 = Num2 + "5";
                    Num1Text.append("5");

                    break;
                case "6":
                    Num2 = Num2 + "6";
                    Num1Text.append("6");

                    break;
                case "7":
                    Num2 = Num2 + "7";
                    Num1Text.append("7");

                    break;
                case "8":
                    Num2 = Num2 + "8";
                    Num1Text.append("8");

                    break;
                case "9":
                    Num2 = Num2 + "9";
                    Num1Text.append("9");

                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();

    }

}