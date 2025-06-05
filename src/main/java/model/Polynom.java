package model;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynom {
    private List<Monom> monomList;
    private List<String> list;

    public Polynom() {
        this.monomList = new LinkedList<>();
        this.list = new LinkedList<>();
    }

    public List<Monom> selectPolynomials(String firstP){
        Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
        Matcher matcherFirst = pattern.matcher(firstP);

        while (matcherFirst.find()) {
            list.add(matcherFirst.group());
        }

        Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
        for(String s : list){
            Matcher m = p.matcher(s);
            while (m.find()) {
                int coeff = Integer.parseInt(m.group(1));
                int degree = Integer.parseInt(m.group(2));
                Monom mnm = new Monom(coeff, degree);
                monomList.add(mnm);
            }
        }
        return monomList;
    }

    public void clearLists(){
        this.list.clear();
        this.monomList.clear();
    }

}