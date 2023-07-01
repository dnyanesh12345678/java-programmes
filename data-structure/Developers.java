import java.util.*;

public class Developers {
    public static void main(String[] args) {
        HashMap<String, String> designers = new HashMap<>();
        designers.put("C","Dennis Ritchie");
        designers.put("C++","Bjarne Stroustrup");
        designers.put("Java","James Gosling");
        designers.put("Python","Guido van Rossum");
        designers.put("Pascal","Nicklaus Wirth");

        System.out.println("Languages \t Designers");
        for(String languages : designers.keySet()) {
            System.out.println(languages + "\t-\t" + designers.get(languages));
        }
    }
}

