package algorithm.sort;

public class SelectMinSort implements Sort {
    public static int count = 0;

    @Override
    public void sort(int[] a) {

        for(int i = 0; i < a.length - 1; i++){
            int index = i;
            for(int j = i+1; j < a.length; j++){

                if(a[index] > a[j]){
                    index = j;
                }
            }
            if(i != index){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
    }
}
