
class person

{
	private String name;
	private int code;
	
	
	public person(String name) {
		this.name = name;
	}
	
	public person(int code) {
		this.code = code;
	}

	

	public String getname()
	{
		return this.name;
	}
	
	public void setname(String name)
	{
		 this.name=name;
	}
	
	public void setcode(int code)
	{
		if(code<0)
		{
		System.out.println("invalid code");
	}
		else
		{
			this.code=code;
		}
	}
	
	public int getcode(){
		if(this.name=="veeresh") {
			return 0;
		}
		else
		{
			return this.code;
		}
	}
		
	}

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person("veeresh");
		System.out.println(p.getname());
		p.setcode(4321);
		System.out.println(p.getcode());
		
	}

}