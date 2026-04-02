class Solution {
    public String interpret(String command) {
        String s = "";
        for(int i = 0; i < command.length();i++)
        {
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {
                s += "o"; 
                i = i + 1;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a')
            {
                s += "al";
                i = i + 3;
            }
            else
            {
                s += String.valueOf(command.charAt(i));
            }
        }
        return s;
    }
}