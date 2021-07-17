package Day10;

public class PermutaionOfString {
    public static void permute(String s){
        int n = fact(s.length());
        for (int i = 0;i<n;i++){
            int temp = i;
            StringBuilder sb = new StringBuilder(s);
            for (int j = s.length();j>=1;j--){
                int ind = temp%j;
                temp /=j;
                System.out.print(sb.charAt(ind));
                sb.deleteCharAt(ind);
            }
            System.out.println();
        }
    }
    public static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++)
            fact*=i;
        return fact;
    }

    public static void main(String[] args) {
        permute("abcd");
    }
}
