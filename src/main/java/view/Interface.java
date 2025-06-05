package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private JPanel contentPane;
    private JLabel title;
    private JLabel labelFirstPolynomial;
    private JLabel labelSecondPolynomial;
    private JLabel labelResult;
    private JLabel result;
    private JTextField fieldFirstPolynomial;
    private JTextField fieldSecondPolynomial;
    private JButton additionButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton derivativeButton;
    private JButton integrationButton;

    public Interface(){
        setTitle("Polynom Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.YELLOW);

        title = new JLabel("Polynomial Calculator");
        title.setFont(new Font("Tahoma", Font.ITALIC, 25));
        title.setForeground(Color.RED);
        title.setBounds(170, 10, 400, 50);
        contentPane.add(title);

        labelFirstPolynomial = new JLabel("First Polynomial  = ");
        labelFirstPolynomial.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelFirstPolynomial.setForeground(Color.RED);
        labelFirstPolynomial.setBounds(130, 75, 200, 25);
        contentPane.add(labelFirstPolynomial);

        labelSecondPolynomial = new JLabel("Second Polynomial  = ");
        labelSecondPolynomial.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelSecondPolynomial.setForeground(Color.RED);
        labelSecondPolynomial.setBounds(110, 105, 200, 25);
        contentPane.add(labelSecondPolynomial);

        labelResult = new JLabel("Result: ");
        labelResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelResult.setForeground(Color.RED);
        labelResult.setBounds(30, 150, 100, 25);
        contentPane.add(labelResult);

        result = new JLabel();
        result.setBounds(100, 150, 450, 30);
        result.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        contentPane.add(result);

        fieldFirstPolynomial = new JTextField();
        fieldFirstPolynomial.setBounds(280, 80, 200, 25);
        contentPane.add(fieldFirstPolynomial);

        fieldSecondPolynomial = new JTextField();
        fieldSecondPolynomial.setBounds(280, 110, 200, 25);
        contentPane.add(fieldSecondPolynomial);

        additionButton = new JButton("Add");
        additionButton.setBounds(80, 200, 200, 30);
        contentPane.add(additionButton);

        subtractionButton = new JButton("Subtract");
        subtractionButton.setBounds(300, 200, 200, 30);
        contentPane.add(subtractionButton);

        multiplicationButton = new JButton("Multiplicate");
        multiplicationButton.setBounds(80, 250, 200, 30);
        contentPane.add(multiplicationButton);

        divisionButton = new JButton("Divide");
        divisionButton.setBounds(300, 250, 200, 30);
        contentPane.add(divisionButton);

        derivativeButton = new JButton("Derivate");
        derivativeButton.setBounds(80, 300, 200, 30);
        contentPane.add(derivativeButton);

        integrationButton = new JButton("Integrate");
        integrationButton.setBounds(300, 300, 200, 30);
        contentPane.add(integrationButton);
    }

    public String getFirstPolynomial(){
        return this.fieldFirstPolynomial.getText();
    }

    public String getSecondPolynomial(){
        return this.fieldSecondPolynomial.getText();
    }

    public void setResultLabel(String s){
        this.result.setText(s);
    }

    public void additionButtonListener(ActionListener actionListener){
        this.additionButton.addActionListener(actionListener);
    }

    public void subtractionButtonListener(ActionListener actionListener){
        this.subtractionButton.addActionListener(actionListener);
    }

    public void multiplicationButtonListener(ActionListener actionListener){
        this.multiplicationButton.addActionListener(actionListener);
    }

    public void divisionButtonListener(ActionListener actionListener){
        this.divisionButton.addActionListener(actionListener);
    }

    public void derivationButtonListener(ActionListener actionListener){
        this.derivativeButton.addActionListener(actionListener);
    }

    public void integrationButtonListener(ActionListener actionListener){
        this.integrationButton.addActionListener(actionListener);
    }

}