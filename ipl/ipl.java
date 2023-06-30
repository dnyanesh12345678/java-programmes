import java.util.*;
class ipl
{
	String teamA;
	String teamB;
	String teamC;
	ipl(String teamA,String teamB,String teamC)
	{
		this.teamA=teamA;
		this.teamB=teamB;
		this.teamC=teamC;
	}
}
class teams
{
	public static void main(String[] args)
	{
		ipl list1 = new ipl("MI","RCB","CSK");
		ipl list2 = new ipl("GT","KKR","SRH");
		ipl list3 = new ipl("KXP","DC","RR");
		
		ArrayList<ipl> showlist= new ArrayList<ipl>();
		showlist.add(list1);
		showlist.add(list2);
		showlist.add(list3);
		System.out.println(showlist);
		for(ipl team :showlist)
		{
			System.out.println(team.teamA +" "+team.teamB+" "+team.teamC);
		}
	}
}
