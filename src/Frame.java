import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label,label1;
    String result;
    String equation = "";
    JButton squareButton;
    JButton percentButton;
    JButton exitButton;
    JButton clearButton;
    JButton plusButton;
    JButton minusButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton equalButton;
    JButton dotButton;
    JButton zeroButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;

    public Frame() {

        zeroButton = new JButton("0");zeroButton.setHorizontalTextPosition(JButton.CENTER);zeroButton.setFont(new Font(null,Font.PLAIN,40));
        zeroButton.addActionListener(this);

        oneButton = new JButton("1");oneButton.setHorizontalTextPosition(JButton.CENTER);oneButton.setFont(new Font(null,Font.PLAIN,40));
        oneButton.addActionListener(this);

        twoButton = new JButton("2");twoButton.setHorizontalTextPosition(JButton.CENTER);twoButton.setFont(new Font(null,Font.PLAIN,40));
        twoButton.addActionListener(this);

        threeButton = new JButton("3");threeButton.setHorizontalTextPosition(JButton.CENTER);threeButton.setFont(new Font(null,Font.PLAIN,40));
        threeButton.addActionListener(this);

        fourButton = new JButton("4");fourButton.setHorizontalTextPosition(JButton.CENTER);fourButton.setFont(new Font(null,Font.PLAIN,40));
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");fiveButton.setHorizontalTextPosition(JButton.CENTER);fiveButton.setFont(new Font(null,Font.PLAIN,40));
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");sixButton.setHorizontalTextPosition(JButton.CENTER);sixButton.setFont(new Font(null,Font.PLAIN,40));
        sixButton.addActionListener(this);

        sevenButton = new JButton("7");sevenButton.setHorizontalTextPosition(JButton.CENTER);sevenButton.setFont(new Font(null,Font.PLAIN,40));
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");eightButton.setHorizontalTextPosition(JButton.CENTER);eightButton.setFont(new Font(null,Font.PLAIN,40));
        eightButton.addActionListener(this);

        nineButton = new JButton("9");nineButton.setHorizontalTextPosition(JButton.CENTER);nineButton.setFont(new Font(null,Font.PLAIN,40));
        nineButton.addActionListener(this);

        plusButton = new JButton("+");plusButton.setHorizontalTextPosition(JButton.CENTER);plusButton.setFont(new Font(null,Font.PLAIN,40));
        plusButton.addActionListener(this);

        minusButton = new JButton("-");minusButton.setHorizontalTextPosition(JButton.CENTER);minusButton.setFont(new Font(null,Font.PLAIN,40));
        minusButton.addActionListener(this);

        multiplyButton = new JButton("x");multiplyButton.setHorizontalTextPosition(JButton.CENTER);multiplyButton.setFont(new Font(null,Font.PLAIN,40));
        multiplyButton.addActionListener(this);

        divideButton = new JButton("/");divideButton.setHorizontalTextPosition(JButton.CENTER);divideButton.setFont(new Font(null,Font.PLAIN,40));
        divideButton.addActionListener(this);

        equalButton = new JButton("=");equalButton.setHorizontalTextPosition(JButton.CENTER);equalButton.setFont(new Font(null,Font.PLAIN,40));
        equalButton.addActionListener(this);

        dotButton = new JButton(".");dotButton.setHorizontalTextPosition(JButton.CENTER);dotButton.setFont(new Font(null,Font.PLAIN,40));
        dotButton.addActionListener(this);

        squareButton = new JButton("√");squareButton.setHorizontalTextPosition(JButton.CENTER);squareButton.setFont(new Font(null,Font.PLAIN,40));
        squareButton.addActionListener(this);

        percentButton = new JButton("%");percentButton.setHorizontalTextPosition(JButton.CENTER);percentButton.setFont(new Font(null,Font.PLAIN,40));
        percentButton.addActionListener(this);

        exitButton = new JButton("EXIT");exitButton.setHorizontalTextPosition(JButton.CENTER);exitButton.setFont(new Font(null,Font.PLAIN,40));
        exitButton.addActionListener(this);

        clearButton = new JButton("AC");clearButton.setHorizontalTextPosition(JButton.CENTER);clearButton.setFont(new Font(null,Font.PLAIN,40));
        clearButton.addActionListener(this);

        label = new JLabel();

        label.setOpaque(true);
        label.setLayout(new GridLayout(5,4));
        label.setBounds(0,200,600,600);

        label.add(squareButton);label.add(percentButton);label.add(clearButton);label.add(exitButton);
        label.add(sevenButton);label.add(eightButton);label.add(nineButton);label.add(divideButton);
        label.add(fourButton);label.add(fiveButton);label.add(sixButton);label.add(multiplyButton);
        label.add(oneButton);label.add(twoButton);label.add(threeButton);label.add(minusButton);
        label.add(zeroButton);label.add(dotButton);label.add(equalButton);label.add(plusButton);

        label1= new JLabel();
        label1.setBounds(0,50,600,100);
        label1.setFont(new Font(null,Font.PLAIN,50));

        frame = new JFrame();

        frame.add(label);
        frame.add(label1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(600,820));
        frame.setTitle("CALCULATOR");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == zeroButton) {equation += "0"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == oneButton) {equation += "1";label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == twoButton) {equation += "2"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == threeButton) {equation += "3"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == fourButton) {equation += "4"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == fiveButton) {equation += "5"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == sixButton) {equation += "6"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == sevenButton) {equation += "7"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == eightButton) {equation += "8"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == nineButton) {equation += "9"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == plusButton) {equation += "+"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == minusButton) {equation += "-"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == multiplyButton) {equation += "x"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == divideButton) {equation += "/"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == dotButton) {equation += "."; label1.setText(equation);frame.add(label1);}
        else if(e.getSource() == equalButton) {
            result = Calc.Calculator(equation);
            equation = result;
            label1.setText(result);
            frame.add(label1);
        } else if(e.getSource()==squareButton) {
            result = String.valueOf(Math.sqrt(Double.parseDouble(equation)));
            equation = result;
            label1.setText(result);
            frame.add(label1);
        } else if(e.getSource()==percentButton) {equation += "%"; label1.setText(equation);frame.add(label1);}
        else if(e.getSource()==clearButton) {equation = ""; label1.setText(equation);frame.add(label1);}
        else if(e.getSource()==exitButton) System.exit(0);

    }
}
