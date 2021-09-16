package OOPS;

import java.util.ArrayList;

public class PolynominalUse {
    public static void main(String[] args) {
        Polynomial p = new Polynomial();
        p.setCofficient(1,0);
        p.setCofficient(1,1);
        p.setCofficient(2,2);
        //p.print();
        Polynomial s = new Polynomial();
        s.setCofficient(-1,0);
        s.setCofficient(1,1);
        //s.sub(s);
        s.print();
        p.print();
        Polynomial ans = p.multiply(p,s);
        ans.print();
    }
}
