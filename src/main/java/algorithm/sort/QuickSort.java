package algorithm.sort;

/**
 * @author wsg
 */
public class QuickSort implements Sort {
    public static int count = 0;
    public static void sort(int[] a,int start,int end){
        if(start < end){
            count++;
            int left = start,right = end;
            int temp = a[left];
            while(left < right){
                while(left < right && temp <= a[right]){
                    right--;
                }
                a[left] = a[right];
                while(left < right && temp >= a[left]){
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = temp;
            //左递归
            sort(a,start,left-1);
            //右递归

            sort(a,left+1,end);
        }
    }

    @Override
    public void sort(int[] a) {
        this.sort(a,0,a.length-1);
    }
}
