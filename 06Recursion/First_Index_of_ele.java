import java.io.*;

import java.util.*;

public class First_Index_of_ele {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x= scn.nextInt();
    
        int []a = new int[n];
    
        for (int i = 0; i < n; i++)
        {
          a[i] = scn.nextInt();
        }

        int first_index = FirstIndexofEle(a, 0, x);
        System.out.println(first_index);
    
      }

    public static int FirstIndexofEle(int[] arr, int idx, int x) {
       if(idx==arr.length){
        return -1;
       }

        if(arr[idx]==x){
            return idx;
        }

        int fisa=FirstIndexofEle(arr, idx+1,x); // gives first index in smaller array
        return fisa;
    }
}
