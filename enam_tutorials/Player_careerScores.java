 /*
     * Created enumeration players with the field.
     * Declared a constructor and a method to return
     * the number of runs scored by the players.
     */
     
    enum players {
        dravid(10889), 
        sachin(18426), 
        ganguly(11363), 
        virat(11867), 
        dhoni(10773)
        ;
         
        private int runs;       
                players(int r) {
        runs = r;
    }   
 
                int getRuns() {
        return runs;
    }
}
     
    /*
     * Used values() method to get the enumerators and a for each loop
     * to get the number of runs scored by each player 
     */
     
     public class Player_careerScores {
           public static void main(String args[]) {
 
           for (players a : players.values())
                   System.out.println(a + " has scored " + a.getRuns() + " ODI runs ");
           }
         
} 
