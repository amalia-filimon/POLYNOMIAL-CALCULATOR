package model;

public class Monom {
    private int coefficient;
    private int polynomialDegree;

    public Monom(int coefficient, int polynomialDegree){
        this.coefficient = coefficient;
        this.polynomialDegree = polynomialDegree;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getPolynomialDegree() {
        return polynomialDegree;
    }

}