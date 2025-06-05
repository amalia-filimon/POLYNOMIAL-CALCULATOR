package model;

import java.util.LinkedList;
import java.util.List;

public class Operation {

    public int maximumPolynomialDegree(List<Monom> firstP, List<Monom> secondP) {
        int maxDegree = -1;
        for (Monom f : firstP) {
            if (f.getPolynomialDegree() >= maxDegree)
                maxDegree = f.getPolynomialDegree();
        }
        for (Monom s : secondP) {
            if (s.getPolynomialDegree() >= maxDegree)
                maxDegree = s.getPolynomialDegree();
        }
        return maxDegree;
    }

    public int maximumDegreeMonomialList(List<Monom> monomList) {
        int maxDegree = -1;
        for (Monom m : monomList) {
            if (m.getPolynomialDegree() >= maxDegree)
                maxDegree = m.getPolynomialDegree();
        }
        return maxDegree;
    }

    public String addition(List<Monom> firstP, List<Monom> secondP) {
        int sum = 0;
        String result = "";
        int maxDegree = this.maximumPolynomialDegree(firstP, secondP);
        while (maxDegree >= 0) {
            sum = 0;
            for (Monom f : firstP) {
                if (f.getPolynomialDegree() == maxDegree) {
                    sum = sum + f.getCoefficient();
                }
            }
            for (Monom s : secondP) {
                if (s.getPolynomialDegree() == maxDegree) {
                    sum = sum + s.getCoefficient();
                }
            }
            if (sum > 0) {
                result = result + "+" + sum + "x^" + maxDegree;
            }
            if (sum < 0) {
                result = result + sum + "x^" + maxDegree;
            }
            maxDegree--;
        }
        return result;
    }

    public String subtraction(List<Monom> firstP, List<Monom> secondP) {
        int diff = 0;
        String result = "";
        int maxDegree = this.maximumPolynomialDegree(firstP, secondP);
        while (maxDegree >= 0) {
            diff = 0;
            for (Monom f : firstP) {
                if (f.getPolynomialDegree() == maxDegree) {
                    diff = f.getCoefficient();
                }
            }
            for (Monom s : secondP) {
                if (s.getPolynomialDegree() == maxDegree) {
                    diff = diff - s.getCoefficient();
                }
            }
            if (diff > 0) {
                result = result + "+" + diff + "x^" + maxDegree;
            }
            if (diff < 0) {
                result = result + diff + "x^" + maxDegree;
            }
            maxDegree--;
        }
        return result;
    }

    public String multiplication(List<Monom> firstP, List<Monom> secondP) {
        List<Monom> monomList = new LinkedList<Monom>();
        int coeff, degree, sum = 0;
        String result = "";
        for (Monom f : firstP) {
            for (Monom s : secondP) {
                coeff = f.getCoefficient() * s.getCoefficient();
                degree = f.getPolynomialDegree() + s.getPolynomialDegree();
                Monom m = new Monom(coeff, degree);
                monomList.add(m);
            }
        }
        int maxDegree = this.maximumDegreeMonomialList(monomList);
        while (maxDegree >= 0) {
            sum = 0;
            for (Monom m : monomList) {
                if(m.getPolynomialDegree() == maxDegree)
                    sum = sum + m.getCoefficient();
            }
            if (sum > 0)
                result = result + "+" + sum + "x^" + maxDegree;
            if (sum < 0)
                result = result + sum + "x^" + maxDegree;
            maxDegree--;
        }
        return result;
    }

    public String derivation(List<Monom> firstP){
        int coeff, degree;
        String result = "";
        for(Monom m : firstP){
            coeff = m.getCoefficient() * m.getPolynomialDegree();
            degree = m.getPolynomialDegree() - 1;

            if(coeff > 0 && degree >= 0)
                result = result + "+" + coeff + "x^" + degree;
            if(coeff < 0  && degree >= 0)
                result = result + coeff + "x^" + degree;
        }
        return result;
    }

    public String integration(List<Monom> firstP){
        int degree;
        String result = "";
        for(Monom m: firstP){
            degree = m.getPolynomialDegree() + 1;
            if(m.getCoefficient() > 0)
                result = result + "+" + m.getCoefficient() + "(x^" + degree + ")/" + degree;
            if(m.getCoefficient() < 0)
                result = result + m.getCoefficient() + "(x^" + degree + ")/" + degree;
        }
        result = result + " + C";
        return result;
    }

}