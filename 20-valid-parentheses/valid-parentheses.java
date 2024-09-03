class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> left = Arrays.asList('(', '[', '{');
        List<Character> right = Arrays.asList(')', ']', '}');
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();

                if(right.contains(c) && left.indexOf(top) == right.indexOf(c)){
                    stack.pop();
                }else{
                    stack.push(c);
                } 
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}