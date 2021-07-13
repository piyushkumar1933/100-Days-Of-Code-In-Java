package Day13;

import java.util.Arrays;

public class PairSumArray {
    public static void pairSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int numpair = 0;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < sum) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > sum) {
                endIndex--;
            } else {
                int startElement = arr[startIndex];
                int lastElement = arr[endIndex];
                if (startElement == lastElement) {
                    int totalElement = endIndex - startIndex + 1;
                    numpair += (totalElement * (totalElement - 1)) / 2;
                    System.out.println(numpair);
                    return;
                }
                int tempstartindex = startIndex + 1;
                int tempendindex = endIndex - 1;
                while (tempstartindex <= tempendindex && arr[tempstartindex] == startElement) {
                    tempstartindex++;
                }
                while (tempendindex >= tempstartindex && arr[tempendindex] == lastElement) {
                    tempendindex--;
                }
                int totalelementFromStart = tempstartindex = startIndex;
                int totalelementFromLast = endIndex - tempendindex;
                numpair += totalelementFromLast * totalelementFromStart;
                startIndex = tempstartindex;
                endIndex = tempendindex;

            }

        }
        System.out.println(numpair);
    }

    public static void main(String[] args) {
        int[] testcase1 = new int[]{2, 8, 10, 5, -2, 5};
        int[] testcase2 = new int[]{1, 3, 6, 2, 5, 4, 3, 2, 4};
        pairSum(testcase1,10);
        pairSum(testcase2,10);

    }
}
