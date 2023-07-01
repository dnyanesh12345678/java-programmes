import java.util.*;
class thought
{
	private String a;
	private String b;
	private String c;
	private String d;
	public void setthought(String a,String b,String c,String d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public String getthought_a()
	{
		return a;
	}
	 public String getthought_b()
        {
                return b;
        }
	public String getthought_c()
        {
                return c;
        }
        public String getthought_d()
        {
                return d;
        }



}
class getthought
{
	public static void main(String[] args)
	{
		thought a = new thought();
		a.setthought("humble","kind","respectOthers","sisters");
		LinkedList<String>put=new LinkedList<>();
		put.add(a.getthought_a());
		put.add(a.getthought_b());
		put.add(a.getthought_c());
		put.add(a.getthought_d());
		System.out.println(put);
	}
}

