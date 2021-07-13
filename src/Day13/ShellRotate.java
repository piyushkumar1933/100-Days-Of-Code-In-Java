package Day13;

public class ShellRotate {
    public static void shellRotate(int[][]A,int s, int r){
        int[]onedA = getoned(A,s);
        rotate(onedA,r);
        fillfromoned(A,s,onedA);
    }

    public static int[] getoned(int[][]A,int s){
        int sr =s-1,sc = s-1;
        int er = A.length-s,ec = A[0].length-s;
        int size = 2*(er-sr+ec-sc);
        int arr[] = new int[size];
        int idx = 0;

        for(int i = sr,j=sc;i<=er;i++){
            arr[idx++] = A[i][j];
        }
        for(int i = er,j=sc+1;j<=ec;j++){
            arr[idx++] = A[i][j];
        }
        for(int i = er-1,j=ec;i>=sr;i--){
            arr[idx++] = A[i][j];
        }
        for(int i = sr,j=ec-1;j>=sc+1;j--){
            arr[idx++] = A[i][j];
        }
        return arr;

    }
    public static void fillfromoned(int[][]A,int s,int[]arr){
        int sr =s-1,sc = s-1;
        int er = A.length-s,ec = A[0].length-s;
        int idx = 0;

        for(int i = sr,j=sc;i<=er;i++){
            A[i][j] = arr[idx++];
        }
        for(int i = er,j=sc+1;j<=ec;j++){
            A[i][j] = arr[idx++];
        }
        for(int i = er-1,j=ec;i>=sr;i--){
            A[i][j] = arr[idx++];
        }
        for(int i = sr,j=ec-1;j>=sc+1;j--){
            A[i][j] = arr[idx++];
        }

    }
    public static void rotate(int[]onedA,int r){
        if(r<0){
            r+= onedA.length;
        }
        r = r% onedA.length;
        reverse(onedA,0,onedA.length-1-r);
        reverse(onedA, onedA.length-r, onedA.length-1 );
        reverse(onedA,0, onedA.length-1);
    }
    public static void reverse(int []a, int start,int end){
        while (start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [][]A  = new int[][]{{11,12,13,14,15,16},{21,22,23,24,25,26},{31,32,33,34,35,36},{41,42,43,44,45,46},
                {51,52,53,54,55,56},{61,62,63,64,65,66}};
        shellRotate(A,2,-1);
        Array2D.print2d(A);
    }
}
