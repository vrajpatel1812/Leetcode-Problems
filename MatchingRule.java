import java.util.List;

public class MatchingRule {
    public static void main(String[] args) {
        
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        if(ruleKey.equals("type")){
            return (int) items.stream().map(a -> a.get(0)).filter(s -> s.equals(ruleValue)).count();
        }
        if(ruleKey.equals("color")){
            return (int) items.stream().map(a -> a.get(1)).filter(s -> s.equals(ruleValue)).count();
        }
        return (int) items.stream().map(a -> a.get(2)).filter(s -> s.equals(ruleValue)).count();
    }
}
