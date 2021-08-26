package Day27;

public class RecursiveSubSeq {
    public static String[] subSeq(String str){
        if(str.length()==0){
            return new String[]{" "};
        }
        String smallAns[] = subSeq(str.substring(1));
        String finalAns[] = new String[2*smallAns.length];
        for(int i=0;i<smallAns.length;i++){
            finalAns[i] = smallAns[i];
        }
        for (int i=0;i<smallAns.length;i++){
            finalAns[i+ smallAns.length] = str.charAt(0)+smallAns[i];
        }
        return finalAns;
    }
    public static void main(String[] args) {
        String[] ans = subSeq("XYZ");
        for (String s:ans){
            System.out.println(s);
        }
    }
}
