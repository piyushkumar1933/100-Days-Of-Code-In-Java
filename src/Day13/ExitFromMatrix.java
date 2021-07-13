package Day13;

public class ExitFromMatrix {
    public static void exitPoint(int[][]A){
        int cs = 0;
        int ce = A[0].length;
        int rs = 0;
        int re = A.length;
        int rotate = 0;
        int tempc = 0;
        int tempr = 0;
        while (true){
            if(rotate == 0){
                for (int i = tempc;i<ce;i++){
                    tempc = i;
                    if(A[tempr][i] == 1) {
                        rotate = 1;
                        break;
                    }
                }
                if(rotate == 0) {
                    System.out.println(tempr + " " + tempc);
                    return;
                }
            }
            else if(rotate == 1){
                for (int i = tempr;i<re;i++){
                    tempr = i;
                    if(A[i][tempc] == 1) {
                        rotate = 2;
                        break;
                    }
                }
                if(rotate == 1) {
                    System.out.println(tempr + " " + tempc);
                    return;
                }
            }
            else if(rotate == 2) {
                for (int i = tempc; i >= cs; i--) {
                    tempc = i;
                    if (A[tempr][i] == 1) {
                        rotate = 3;
                        break;
                    }
                }
                if (rotate == 2) {
                    System.out.println(tempr + " " + tempc);
                    return;
                }
            }
            else  {
                for (int i = tempr; i >= rs; i--) {
                    tempr = i;
                    if (A[i][tempc] == 1) {
                        rotate = 0;
                        break;
                    }
                }
                if (rotate == 3) {
                    System.out.println(tempr + " " + tempc);
                    return;
                }
            }
            //System.out.println(tempr+" "+ tempc);

        }
    }

    public static void exitPoint2(int[][]A){
        int dir = 0;
        int i = 0;
        int j = 0;
        while (true){
            dir = (dir+A[i][j])%4;
            if(dir == 0)
                j++;
            else if(dir == 1)
                i++;
            else if(dir == 2)
                j--;
            else
                i--;
            if(i<0) {
                i++;
                break;
            }
            if(j<0) {
                j++;
                break;
            }
            if(i== A.length){
                i--;
                break;
            }
            if(j==A[0].length){
                j--;
                break;
            }
        }
        System.out.println(i+"\t"+j);
    }

    public static void main(String[] args) {
        int [][]A  = new int[][]{{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,0,1,0}};
        //exitPoint(A);
        exitPoint2(A);
    }
}
