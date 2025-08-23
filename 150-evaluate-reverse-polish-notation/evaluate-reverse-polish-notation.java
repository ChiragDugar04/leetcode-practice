class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token: tokens){
            switch(token){
                case "+" -> {
                int first=stack.pop();
                int second=stack.pop();
                int ans=first+second;
                stack.push(ans);
                }
                case "-"->{
                int first=stack.pop();
                int second=stack.pop();
                int ans=second-first;
                stack.push(ans);
                }
                case "*"->{
                int first=stack.pop();
                int second=stack.pop();
                int ans=second*first;
                stack.push(ans);
                }
                case "/"->{
                int first=stack.pop();
                int second=stack.pop();
                int ans=(int)(second/first);
                stack.push(ans);
                }
                default -> stack.push(Integer.parseInt(token));
            }
           
        }
        return stack.pop();
    }
}