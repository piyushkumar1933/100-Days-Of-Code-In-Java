package Day15;

public class ReplaceX {
    public static String rmX(String s) {
        if(s.length()<=0) {
            return "";
        }
        String str = "";
        if(s.charAt(0)!='x') {
            str = str + s.charAt(0);
        }
       return str+rmX(s.substring(1));
    }
    public static String replacepi(String s){
        if(s.length()<=2){
            if(s.equals("pi"))
                return "3.14";
            return s;
        }
        String str = "";
        if(s.substring(0,2).equals("pi")){
            str+="3.14"+replacepi(s.substring(2));
            return str;
        }
        str +=s.charAt(0);
        return str+replacepi(s.substring(1));
    }
    public static String replacepi2(String s){
        if(s.length()<=1)
            return s;
        String temp = replacepi2(s.substring(1));
        if(s.charAt(0) == 'p' && temp.charAt(0)=='i'){
            return "3.14"+temp.substring(1);
        }
        return s.charAt(0)+temp;
    }
    public static String replaceChar(String s, char toReplce,char toReplacedWith){
        if(s.length()<=0){
            return "";
        }
        String temp = replaceChar(s.substring(1),toReplce,toReplacedWith);
        if(s.charAt(0) == toReplce){
            return toReplacedWith+temp;
        }
        else
            return s.charAt(0)+temp;
    }
    public static void main(String[] args) {
        System.out.println(rmX("xxxxxxx"));
        System.out.println(replacepi("pipipi"));
        System.out.println(replacepi2("pipipi"));
        System.out.println(replaceChar("aaa",'a' ,'x'));
    }

}
