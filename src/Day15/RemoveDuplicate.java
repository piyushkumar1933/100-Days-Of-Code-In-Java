package Day15;

public class RemoveDuplicate {
    public static String removeDuplicate(String s){
        if(s.length()<=1)
            return s;
        String temp = removeDuplicate(s.substring(1));
        if(s.charAt(0)==temp.charAt(0))
            return temp;
        return s.charAt(0)+temp;
    }
    public static String addPair(String s){
        if(s.length()<=1){
            return s;
        }
        String temp = addPair(s.substring(1));
        if(s.charAt(0) == temp.charAt(0)){
            return s.charAt(0)+"*"+temp;
        }
        else
            return s.charAt(0)+temp;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("abbccddd"));
        System.out.println(addPair("ccaaaaddll0"));
    }
}
