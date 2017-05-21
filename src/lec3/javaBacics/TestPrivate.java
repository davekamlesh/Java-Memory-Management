package lec3.javaBacics;

public class TestPrivate {

	private String name;
	
	public static void main(String[] args) {
		TestPrivate tp = new TestPrivate();
		//tp.name = "abc";
		tp.setName("Vishal");
		System.out.println(tp.getName());
		
		tp.setName("Kanhaiya");
		System.out.println(tp.getName());
		
		new TestPrivate().setName("Rohit");
		System.out.println(new TestPrivate().getName());
	}
	
	public void setName(String myName){
		name = myName;
	}
	
	public String getName()
	{
		return name;
	}
}
