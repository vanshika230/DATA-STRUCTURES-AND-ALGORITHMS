import java.io.*;
 
import java.util.*;

public class PowerXn {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt(); 
        int ans= PowerXn(x,n);
        System.out.println(ans);

      }
      public static int PowerXn(int x, int n) {
        if(n==0){
            return 1;
        }
        int pnm1= PowerXn(x,n-1);
        int pnm= x*pnm1;
        return pnm;
      }
}
/*
 * Time complexity: O(n)

Since you are recursively calling for a subproblem with n-1 from n, hence n + 1 recursive calls will be made 
(+ 1 when it hits the base case n = 0). You can also count the number of recursive calls in the call stack.
 So the time complexity turns out to be O(n) (which is independent of the value of x).


Space complexity: O(1)

There is no data structure used, thus no auxiliary space is used. 
Hence, space complexity is O(1).
 Note: There are n recursive calls that do take stack space, 
 but we do not account for this space as we are only concerned with space
  used by data structures defined by us.


However, if it is mentioned to give the space complexity which takes into
 account the space taken by recursion call stack also, then, since there are
  n recursive calls, hence O(n) space will be required.
 */

 