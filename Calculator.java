import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;
class claculatorHelper extends Frame implements WindowAdapter,ActionListener{
    TextField t1;
    Button One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Add,Sub,Mul,Devide,Clear,Point,Equal;
    Panel p1,p2,p3,p4,p5;
   
    public claculatorHelper(){ 
        t1=new TextField(40);
        One=new Button("1");
        Two=new Button("2");
        Three=new Button("3");
        Four=new Button("4");
        Five=new Button("5");
        Six=new Button("6");
        Seven=new Button("7");
        Eight=new Button("8");
        Nine=new Button("9");
        Zero=new Button("0");
        Add=new Button("+");
        Sub=new Button("-");
        Mul=new Button("*");
        Devide=new Button("/");
        Equal=new Button("=");
        Clear=new Button("C");
        setLayout(new GridLayout(5,1));
        p1=new Panel(new GridLayout(1,1));
        p1.add(t1);
        p2=new Panel(new GridLayout(1,4));
        p2.add(One);
        p2.add(Two);
        p2.add(Three);
        p2.add(Clear);
        p3=new Panel(new GridLayout(1,4));
        p3.add(Four);
        p3.add(Five);
        p3.add(Six);
        p3.add(Add);
        p4=new Panel(new GridLayout(1,4));
        p4.add(Seven);
        p4.add(Eight);
        p4.add(Nine);
        p4.add(Sub);
        p5=new Panel(new GridLayout(1,4));
        p5.add(Equal);
        p5.add(Zero);
        p5.add(Mul);
        p5.add(Devide);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        
        Clear.setBackground(Color.red);
        Clear.setFont(new Font("Arial",Font.BOLD,18));
        Add.setBackground(Color.GRAY);
        Mul.setFont(new Font("Arial",Font.BOLD,18));
        Sub.setFont(new Font("Arial",Font.BOLD,18));
        Devide.setFont(new Font("Arial",Font.BOLD,18));
        Add.setFont(new Font("Arial",Font.BOLD,18));
        One.setFont(new Font("Arial",Font.BOLD,18));
        Two.setFont(new Font("Arial",Font.BOLD,18));
        Three.setFont(new Font("Arial",Font.BOLD,18));
        Four.setFont(new Font("Arial",Font.BOLD,18));
        Five.setFont(new Font("Arial",Font.BOLD,18));
        Six.setFont(new Font("Arial",Font.BOLD,18));
        Seven.setFont(new Font("Arial",Font.BOLD,18));
        Eight.setFont(new Font("Arial",Font.BOLD,18));
        Nine.setFont(new Font("Arial",Font.BOLD,18));
        Zero.setFont(new Font("Arial",Font.BOLD,18));
        Equal.setFont(new Font("Arial",Font.BOLD,18));
        t1.setFont(new Font("Arial",Font.BOLD,18));

        
        Sub.setBackground(Color.GRAY);
        Mul.setBackground(Color.GRAY);
        Devide.setBackground(Color.GRAY);
        //adding action Lsitener
        t1.addActionListener(this);
        One.addActionListener(this);
        Two.addActionListener(this);
        Three.addActionListener(this);
        Four.addActionListener(this);
        Five.addActionListener(this);
        Six.addActionListener(this);
        Seven.addActionListener(this);
        Eight.addActionListener(this);
        Nine.addActionListener(this);
        Zero.addActionListener(this);
        Add.addActionListener(this);
        Sub.addActionListener(this);
        Mul.addActionListener(this);
        Devide.addActionListener(this);
        Equal.addActionListener(this);
        Clear.addActionListener(this);
        t1.setText("0");
        

    } 
    public void windowClosing (WindowEvent e) {    
        this.dispose();    
    } 
    public long s1=0,s2=0;
    public int j = 0,tens=10;
    public char c = '\0';
    public void actionPerformed(ActionEvent e){  
        
        if(e.getSource()==One){
            if(j==0){
                s1=s1*tens;
            s1=s1+1;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+1;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        }
        if(e.getSource()==Two){
            if(j==0){
                s1=s1*tens;
            s1=s1+2;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+2;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } 
        if(e.getSource()==Three){
            if(j==0){
                s1=s1*tens;
            s1=s1+3;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+3;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } if(e.getSource()==Four){
            if(j==0){
                s1=s1*tens;
            s1=s1+4;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+4;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } if(e.getSource()==Five){
            if(j==0){
                s1=s1*tens;
            s1=s1+5;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+5;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } if(e.getSource()==Six){
            if(j==0){
                s1=s1*tens;
            s1=s1+6;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+6;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } if(e.getSource()==Seven){
            if(j==0){
                s1=s1*tens;
            s1=s1+7;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+7;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } if(e.getSource()==Eight){
            if(j==0){
                s1=s1*tens;
            s1=s1+8;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+8;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } 
        if(e.getSource()==Nine){
            if(j==0){
                s1=s1*tens;
                s1=s1+9;
                t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+9;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } 
        if(e.getSource()==Zero){
            if(j==0){
                s1=s1*tens;
                s1=s1+0;
            t1.setText(Long.toString(s1));
            }
            else{
                s2=s2*tens;
                s2=s2+0;
                t1.setText(Long.toString(s1)+c+Long.toString(s2));
            }
        } 
        if(e.getSource()==Add){
            c='+';
            j=1;
            tens=10;
            s2=0;
            t1.setText(Long.toString(s1)+c);
        }
        if(e.getSource()==Sub){
            c='-';
            j=1;
            tens=10;
            s2=0;
            t1.setText(Long.toString(s1)+c);

        }if(e.getSource()==Mul){
            c='*';
            j=1;
            tens=10;
            s2=0;
            t1.setText(Long.toString(s1)+c);
        }if(e.getSource()==Devide){
            c='/';
            j=1;
            tens=10;
            s2=0;
            t1.setText(Long.toString(s1)+c);
        } 
        if(e.getSource()==Equal){
            if (c=='+') {
                s1+=s2;
                t1.setText(Long.toString(s1));
            }
            else if(c=='-'){
                s1-=s2;
                t1.setText(Long.toString(s1));
            }
            else if(c=='*'){
                s1*=s2;
                t1.setText(Long.toString(s1));
            }
            else if(c=='/'){
                float f = s1/s2;
                t1.setText(Float.toString(f));
                s1=(int)f;
            }
            
        } 
        if (e.getSource()==Clear) {
            s1=0;
            s2=0;
            c='\0';
            j=0;
            t1.setText("0");
        } 
    }   
       
}
public class Calculator {
    public static void main(String[] args) {
        claculatorHelper c = new claculatorHelper();
        c.setSize(400,500);
       c.show();;
    }
    
}
