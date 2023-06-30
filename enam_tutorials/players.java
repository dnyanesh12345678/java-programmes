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
    public static void main(String[] args)
    {
	    System.out.println(runs);
    }
}
 
