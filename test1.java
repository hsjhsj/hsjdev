class Person
{
	private String name;
	private int age;
	private void talk()
	{
		System.out.println("我是:"+name+",今年："+age+"岁");
	}
	public void say()
	{
		talk();
	}
	
	public void setName(String str)
	{
		name=str;
	}
	public void setAge(int a)
	{
		if(a>0)
		age=a;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

}


public class test1 
{
    public static void main(String[] args) 
    {
	    Person p=new Person();
	    p.setName("胡胜杰");
	    p.setAge(26);
	    p.say();

	}

}
