/*TreeMap stores the keys in sorted order so that it can retrieve its components in a particular order in the minimum amount of time. Thus, the keySet() method of TreeMap as well returns values in sorted order.

Let us look at an example in which we store states and their capitals in a TreeMap with states as keys and capitals as values in random order.

*/
import java.util.*;


class TreeMap_tutorials
{
    public static void main(String[] args) 
    {
        // Treemap
        TreeMap<String,String> states_capitals = new TreeMap<>();

        // inserting states and their capitals to the treemap
        states_capitals.put("Tamil Nadu","Chennai");
        states_capitals.put("Andhra Pradesh","Amaravati");
        states_capitals.put("Punjab","Chandigarh");
        states_capitals.put("Goa","Panaji");
        states_capitals.put("Meghalaya","Shillong");

        // printing states and capitals using keySet()
        for(String states : states_capitals.keySet()) {
            System.out.println(states);
        }
    }
}

