package algorithm.sort;

public class MergeSort implements Sort {

    public void sort(int[] a,int left,int right,int[] temp) {
        if(right > left){
            int middle = (left+right)/2;
            sort(a,left,middle,temp);
            sort(a,middle+1,right,temp);
            merge(a,left,middle,right,temp);
        }
    }

    @Override
    public void sort(int[] a){
        this.sort(a,0,a.length-1,new int[a.length]);
    };

    public void merge(int[] a,int left,int mid,int right,int[] temp){
        int i = left,j = mid+1;
        int index = 0;
        while(i <= mid && j <= right){
            if(a[i] <= a[j]){
                temp[index++] = a[i++];
            }else{
                temp[index++] = a[j++];
            }
        }
        while(i <= mid){
            temp[index++] = a[i++];
        }
        while(j <= right){
            temp[index++] = a[j++];
        }
        index = 0;
        while(left <= right){
            a[left++] = temp[index++];
        }
    }
}
