package Day10;

public class BinearySearch {
    public static void searchBi(int arr[],int key){
        int high = arr.length-1;
        int low = 0;
        int mid = (low+high)/2;
        while (arr[mid]!=key && low<=high){
            mid = (low+high)/2;
            if(arr[mid]>key) {
                high = mid-1 ;
            }
            else{
                low = mid+1;
                }
            System.out.println(mid);
        }
        if(arr[mid] == key){
            System.out.println(mid);
        }
        else
            System.out.println("Not Found");
    }
    public static void cielFloor(int[] arr,int value){
        int floor = Integer.MIN_VALUE;
        int ciel = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>value){
                high = mid-1;
                ciel = arr[mid];
            }
            else if(arr[mid] == value){
                 floor = arr[mid];
                ciel = arr[mid];
                break;
            }
            else {
                low = mid+1;
                floor = arr[mid];
            }
        }
        System.out.println(ciel+" " +floor);
    }
    public static void main(String[] args) {
        int[] testcase = new int[]{10,20,30,40,50,60};
        searchBi(testcase,120);
        cielFloor(testcase,9);
    }
}
