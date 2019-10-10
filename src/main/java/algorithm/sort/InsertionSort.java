package algorithm.sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] a) {

        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i;
            while(j > 0 && temp < a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            if(j != i){
                a[j] = temp;
            }
        }
    }

}
