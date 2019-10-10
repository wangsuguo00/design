package algorithm.proxy;

import algorithm.sort.Sort;

import java.util.Random;

public class ProxyHandler {
    private Sort sort;

    public ProxyHandler(Sort sort){
        this.sort = sort;
    }


    public void sort(){
        int[] a = new int[10];
        int index = 0;
        Random random = new Random();
        random.setSeed(2l);
        for(int i = 0; i < 10; i++){
            a[i] = random.nextInt(1000);
        }
        sort.sort(a);

        for(int s : a){
            index++;
            if(index == 30){
                index =0;
                System.out.println();
            }
            System.out.print(s+" ");
        }
    }
}
