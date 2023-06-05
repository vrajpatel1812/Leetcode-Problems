package Leetcode;

public class GoalInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        String ans = interpret(command);
        System.out.println(ans);
    }

    public static String interpret(String command){
        return command.replace("()", "o").replace("(al)", "al");
    }
}
