import java.io.*;
import java.util.*;

public class Solution {
    Stack<Integer>stack = new Stack<Integer>();
    int max_element;
    void push(int x){
        if(stack.isEmpty()){
            stack.push(x);
            max_element = x;
        }
        else if(x>max_element){
            stack.push(2*x-max_element);
            max_element = x;
        }
        else{
            stack.push(x);
        }
    }
    void getmax(){
        System.out.println(max_element);
    }
        void pop() {
        if (stack.isEmpty()) {
            System.out.println("stack is already element");
        }
        if (stack.size() != 1) {
            int top = stack.peek();
            stack.pop();
            if (top > max_element) {
                max_element = 2 * max_element - top;
            }
        }
        else{
                max_element = 0;
        }


    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution obj = new Solution();
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for(int i = 0;i<testcase;i++){
             int input = scan.nextInt();
             if(input==1){
                 int x = scan.nextInt();
                 obj.push(x);
             }
             else if(input==2){
                 obj.pop();
             }
             else{
                 obj.getmax();
             }
         }
    }
}

