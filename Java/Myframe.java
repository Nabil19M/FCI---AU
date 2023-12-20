import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author Nabil
 */
public class Myframe extends JFrame implements ActionListener{
JComboBox combobox;
JLabel combolabel;
JLabel get;
JLabel perlabel;
JLabel arlabel;
JButton Calculate;
JTextField radiusField;
JTextField widthField;
JTextField heightField;
    public Myframe()
    {
         //********** MY FRAME *****************//
       this.setTitle("Geometric objects Area & Parameter calculation");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.getContentPane().setBackground(new Color(255, 243, 81)); // can do it through hexadecimal
       this.setSize(500,500);
       this.setLayout(null);
       Border border = BorderFactory.createLineBorder(Color.black, 2, true);
       //frame.setPack() // to make the components resizable as the frame
       
      //********** MY "Welcome to program" *****************//
             JLabel label = new JLabel();
       label.setText("Perimeter & Area Calculator");
       label.setFont(new Font("Georgia",Font.BOLD,20));
       label.setVisible(true);
       label.setVerticalAlignment(JLabel.CENTER);
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setBounds(0,0 ,500,50);
       this.add(label);
       //********** Choose Combo****************/
       combolabel = new JLabel();
       combolabel.setText("Choose from the available Objects : ");
       combolabel.setFont(new Font("Georgia",Font.ITALIC,15));
       combolabel.setVisible(true);
       combolabel.setVerticalAlignment(JLabel.CENTER);
       combolabel.setHorizontalAlignment(JLabel.CENTER);
       combolabel.setBounds(5,65 ,280,30);
       this.add(combolabel);
       /***************           *////////////////
       get = new JLabel();
       get.setFont(new Font("Georgia",Font.ITALIC,15));
       get.setVisible(true);
       get.setVerticalAlignment(JLabel.CENTER);
       //get.setHorizontalAlignment(JLabel.CENTER);
       get.setBounds(10,110 ,280,30);
       this.add(get);
       
       //************ show result****************/
       perlabel = new JLabel();
       perlabel.setText("  Perimeter = "+ "              cm");
       perlabel.setFont(new Font("Georgia",Font.ITALIC,15));
       perlabel.setVisible(true);
       perlabel.setVerticalAlignment(JLabel.CENTER);
      // perlabel.setHorizontalAlignment(JLabel.EAST);
       perlabel.setBounds(275,400,200,35);
       perlabel.setBorder(border);
       this.add(perlabel);
       //**********show ar label****************/
       arlabel = new JLabel();
       arlabel.setText("  Area = " + "                    cm");
       arlabel.setFont(new Font("Georgia",Font.ITALIC,15));
       arlabel.setVisible(true);
       arlabel.setVerticalAlignment(JLabel.CENTER);
       //arlabel.setHorizontalAlignment(JLabel.CENTER);
       arlabel.setBounds(25,400,200,35);
       arlabel.setBorder(border);
       this.add(arlabel);
       
        /********** MY Combobox ****************/
       String[] geometricobjects = {"Circle","Rectangle","Square"};
       combobox = new JComboBox(geometricobjects);
       combobox.addActionListener(this);
       combobox.setBounds(290,65 ,100,30);
       //combobox.setEditable(); set editable to make it right aht he want TO
       this.add(combobox); 
      
      /************************************/
      radiusField = new JTextField();
      radiusField.setVisible(false);
      radiusField.setBounds(20,150 ,100,30);
      this.add(radiusField);
      /*************************************/
            widthField = new JTextField();
      widthField.setVisible(false);
      widthField.setBounds(20,150 ,100,30);
      this.add(widthField);
      /************************************/
            heightField = new JTextField();
      heightField.setVisible(false);
      heightField.setBounds(20,190 ,100,30);
      this.add(heightField);
      /************************************/
      /***********  CAlculate Button*************/
        Calculate = new JButton();
        Calculate.setBounds(175,350,150,25);
        Calculate.setVisible(true);
        Calculate.addActionListener(this);
        Calculate.setText("Calculate");
        Calculate.setFocusable(false);
        this.add(Calculate);
    }


    
    public void actionPerformed(ActionEvent e) {
        
if (e.getSource() == combobox) {
    switch(combobox.getSelectedIndex()) {
        case 0:
            perlabel.setText("  Perimeter  = 2 π r ");
            arlabel.setText("  Area  = π  sqr(r)");
            radiusField.setVisible(true);
            widthField.setVisible(false);
            heightField.setVisible(false);
            get.setText("Radius of the circle in cm");
            
            break;
        case 1:
            perlabel.setText("  Perimeter  = 2 * (W + H) ");
            arlabel.setText("  Area  = W * H");
            radiusField.setVisible(false);
            widthField.setVisible(true);
            heightField.setVisible(true);
            get.setText("Width & Height of the Rectangle in cm");
           
            break;
            
        case 2:
            perlabel.setText("  Perimeter  = 4 * L ");
            arlabel.setText("  Area  = sqr(L)");
            radiusField.setVisible(true);  
            widthField.setVisible(false);
            heightField.setVisible(false);
            get.setText("Length of square sides in cm");

            break;
    }
    this.revalidate();
    }

    else if(e.getSource() == Calculate){
        switch(combobox.getSelectedIndex())
        {
            case 0:
            Circle mycircle;
             mycircle = new Circle(Double.parseDouble(radiusField.getText()));
            perlabel.setText("  Perimeter ≈ "+mycircle.getPerimeter() /100+" cm");
            arlabel.setText("  Area ≈ " + mycircle.getArea() /100 +" cm");
            break;
            case 1:
            Rectangle myrectangle = new Rectangle(Double.parseDouble(widthField.getText()),Double.parseDouble(heightField.getText()));
            perlabel.setText("  Perimeter = "+myrectangle.getPerimeter() +" cm");
            arlabel.setText("  Area = " + myrectangle.getArea() +" cm");
            break;
            case 2:
                Square mysquare = new Square(Double.parseDouble(radiusField.getText()));
            perlabel.setText("  Perimeter = "+mysquare.getPerimeter() +" cm");
            arlabel.setText("  Area = " + mysquare.getArea() +" cm");
            break;
            
                
        }
    }
//this.revalidate();
   
}
      
}