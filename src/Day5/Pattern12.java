/*
"C:\Program Files\Java\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.4\lib\idea_rt.jar=62337:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Projects\100 Days Code in java\100-Days-Of-Code-In-Java\out\production\100-Days-Of-Code-In-Java" Day5.Pattern12
11
*										*
*										*
*										*
*										*
*										*
*					*					*
*				*		*				*
*			*				*			*
*		*						*		*
*	*								*	*
*										*

Process finished with exit code 0

 */
package Day5;

import utilities.Basic;

public class Pattern12 {
    public static void printPattern(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1; j<=n;j++){
                if(j==1 || j ==n || (i>n/2 && (i+j == n+1 || j-i == 0))){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(Basic.oneIntInput());
    }
}
