package controller;

import model.Operation;
import model.Polynom;
import view.Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Interface mainView;
    private Operation op = new Operation();
    private Polynom p;
    private Polynom q;

    public Controller(Interface mainView){
        this.mainView = mainView;

        this.mainView.additionButtonListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p = new Polynom();
                q = new Polynom();
                String firstP = mainView.getFirstPolynomial();
                String secondP = mainView.getSecondPolynomial();
                String additionResult = op.addition(p.selectPolynomials(firstP), q.selectPolynomials(secondP));
                mainView.setResultLabel(additionResult);
                p.clearLists();
                q.clearLists();
            }
        });

        this.mainView.subtractionButtonListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                p = new Polynom();
                q = new Polynom();
                String firstP = mainView.getFirstPolynomial();
                String secondP = mainView.getSecondPolynomial();
                String subtractionResult = op.subtraction(p.selectPolynomials(firstP), q.selectPolynomials(secondP));
                mainView.setResultLabel(subtractionResult);
                p.clearLists();
                q.clearLists();
            }
        });

        this.mainView.multiplicationButtonListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                p = new Polynom();
                q = new Polynom();
                String firstP = mainView.getFirstPolynomial();
                String secondP = mainView.getSecondPolynomial();
                String multiplicationResult = op.multiplication(p.selectPolynomials(firstP), q.selectPolynomials(secondP));
                mainView.setResultLabel(multiplicationResult);
                p.clearLists();
                q.clearLists();
            }
        });

        this.mainView.derivationButtonListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                p = new Polynom();
                String firstP = mainView.getFirstPolynomial();
                String derivationResult = op.derivation(p.selectPolynomials(firstP));
                mainView.setResultLabel(derivationResult);
                p.clearLists();
            }
        });

        this.mainView.integrationButtonListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                p = new Polynom();
                String firstP = mainView.getFirstPolynomial();
                String integrationResult = op.integration(p.selectPolynomials(firstP));
                mainView.setResultLabel(integrationResult);
                p.clearLists();
            }
        });

    }
}