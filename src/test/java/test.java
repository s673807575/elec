import java.util.*;

/**
 * Created by 67380 on 2016/9/28.
 */
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       while(scan.hasNext()){
           int a=scan.nextInt();
           Stack<Integer> stack=new Stack<Integer>();
           for(int i=0;i<a;i++){
               int c=scan.nextInt();
               if(stack.empty())
                   stack.push(c);
               else{
                   Integer b=stack.peek();
                   if(test(b+c)){
                       stack.pop();
                   }
                   else
                       stack.push(c);
               }
           }
           System.out.println(stack.size());
       }
    }
    private static boolean test(Integer a) {
        if(a%2==0)
            return false;
        return true;
    }
}

