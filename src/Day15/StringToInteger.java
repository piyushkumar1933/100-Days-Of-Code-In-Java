package Day15;

public class StringToInteger {
    public static int strInt(String s){
        if(s.length()<=0)
                return 0;
        int smallNo = strInt(s.substring(1));
        int temp = s.charAt(0)-'0';
        return smallNo+temp*(int)Math.pow(10,s.length()-1);
    }
    public static int strInt2(String s){
        if(s.length()<=0)
            return 0;
        int smallNo = strInt(s.substring(0,s.length()-1));
        int temp = s.charAt(s.length()-1)-'0';
        return smallNo*10+temp;
    }
    public static int strInt3(String s){
        if(s.length()<=0)
            return 0;
        int smallNo = strInt(s.substring(1));
        if (s.charAt(0) == '-')
            return -1*smallNo;
        int temp = s.charAt(0)-'0';
        return smallNo+temp*(int)Math.pow(10,s.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(strInt("112345"));
        System.out.println(strInt2("112345"));
        System.out.println(strInt3("-112"));
    }
}
