package OOPS;

public class Polynomial {
    private int [] poly;
    public Polynomial(){
        poly = new int[10];
    }
    public void setCofficient(int coff,int degree){
        if(degree>poly.length-1) {
            int[] temp = poly;
            poly = new int[2 * temp.length];
            for (int i = 0; i < temp.length; i++) {
                poly[i] = temp[i];
            }
        }
            poly[degree] = coff;
        }

    public void print(){
        int n = poly.length;
        for(int i = n-1; i>=0;i--){
            if(poly[i]!=0){
                System.out.print(poly[i]+"x"+"^"+i+"+");
            }
        }

    }
    public int getCofficient(int i){
        if(i<poly.length){
            return poly[i];
        }
        return 0;
    }
    public void sub(Polynomial P){
        int n = this.poly.length;
        int m = poly.length;
        int i;
        for( i = 0; i<n&&i<m;i++){
            this.setCofficient( this.poly[i]-P.poly[i],i);
        }
        for(;i<n;i++)
            this.setCofficient(this.poly[i],i);
        for(;i<m;i++)
            this.setCofficient(-P.poly[i],i);
    }

    public  Polynomial multiply(Polynomial p1,Polynomial p2){
        Polynomial ans = new Polynomial();
        for(int x = 0; x<p1.poly.length;x++){
            for(int i = 0; i<p2.poly.length;i++){
                int degree = i+x;
                int coff = p1.poly[x]*p2.poly[i];
                coff +=ans.getCofficient(degree);
                ans.setCofficient(coff,degree);
            }
        }

        return ans;
    }
}
