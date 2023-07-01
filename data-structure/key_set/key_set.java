import java.util.*;

class key_set_1 {
    public static void main(String[] args){
        HashMap<Integer,Character> chars = new HashMap<>();
        
        //mapping ASCII code and characters
        chars.put(65,'A');
        chars.put(66,'B');
        chars.put(67,'C');
        chars.put(68,'D');
        chars.put(69,'E');
        
        // generating a set of all the codes present in the hashmap
        Set<Integer> codes = chars.keySet();
        
        System.out.println("Unicode"+"\tCharacter");
        
        // printing ASCII codes and characters one by one respectively
        for(int un : codes){
            System.out.println(un+"\t\t"+chars.get(un));
        }
    }
}

