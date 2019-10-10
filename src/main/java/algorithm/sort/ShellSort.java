package algorithm.sort;

public class ShellSort implements Sort{
    public static int count = 0;
    @Override
    public void sort(int[] a) {

        if(a.length < 2){
            return;
        }

        int gap = a.length / 2;
        while(gap > 0 ){
            for(int i = gap; i < a.length; i++){
                int temp = a[i];
                int j = i - gap;
                while(j >= 0 && a[j] > temp){
                    a[j+gap] = a[j];
                    j -= gap;
                }
                a[j+gap] = temp;
            }
           gap/=2;
        }

    }
}
