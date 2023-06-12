class runner
{
	public static void main(String[] args)
	{
		stack nums = new stack();
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();
		nums.push(10);
		nums.show();
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
	}
}
