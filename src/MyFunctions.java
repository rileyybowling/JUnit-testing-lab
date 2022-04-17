import java.util.ArrayList;
import java.util.Arrays;

public class MyFunctions implements TestingFunctions{

    @Override
    public int greatestCommonDivisor(int a, int b) {
        int finalValue=0;
        int smallValue=0;
        int largeValue=0;
        if (a<0 || b<0){
            finalValue = -1;
        } else if (a==0){
            finalValue = b;
        } else if (b==0){
            finalValue = a;
        } else if (a>b){
            smallValue = b;
            largeValue = a;
        } else {
            smallValue = a;
            largeValue = b;
        }
        for (int i=smallValue; i>0; i--){
            if (largeValue % i == 0 && smallValue % i ==0){
                finalValue = i;
                break;
            }
        }
        return finalValue;
    }

    @Override
    public void reverseWindow(int[] arr, int index1, int index2) throws IndexOutOfBoundsException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<index1; i++){
            list.add(arr[i]);
        }
        for (int j=index2-1; j>=index1; j--){
            list.add(arr[j]);
        }
        for (int k=index2; k<arr.length; k++){
            list.add(arr[k]);
        }
        for (int l=0; l< arr.length; l++){
            arr[l] = list.get(l);
        }
    }
}
