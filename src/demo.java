import java.util.Stack;

public class demo {
    public static void main(String[] args) {
       String a = ")(cong";
        System.out.println(check(a));
    }



    static boolean check(String str){
        Stack stack = new Stack();
        String string = str;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='('){
                stack.push("(");
            }
            else if(string.charAt(i)==')'){
                if (stack.empty()){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()){
            return true;
        }
        else return false;
    }
}
