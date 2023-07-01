interface family
{
	enum myfamily
	{
		mother("megha"),
		father("mahesh"),
		sister("mayuri"),
		grandmother("vimalbai"),
		wife("tejaswini");

		private String family_member;
		
		public String getfamily_member()
		{
			return family_member;
		}
		myfamily(String family_member)
		{
			this.family_member=family_member;
		}
	}
}
class members_Name implements family
{
	public static void main(String[] args)
	{
		for (family.myfamily a : family.myfamily.values())
		{
			System.out.println( a.getfamily_member()+ " is my " + a );
		}
	}
}
