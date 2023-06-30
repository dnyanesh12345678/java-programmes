enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}
public class days
{
	Day x;
	public days(Day x)
	{
		this.x=x;
	}
	public void dayIsLike()
	{
		switch(x)
		{

			case MONDAY:
				System.out.println("MONDAY are bad");
				break;
			case FRIDAY:
				System.out.println("FRIDAY are better");
				break;
			case  SATURDAY:
			case SUNDAY:
				System.out.println("weekends are best");
				break;
			default:
				System.out.println("midweek is testing days");
				break;
		}
	}
	public static void main(String[] args)
	{
		String str="MONDAY";
		days t1 = new days(Day.valueOf(str));
		t1.dayIsLike();
	}
}

