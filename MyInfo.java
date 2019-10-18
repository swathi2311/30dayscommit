
import java.io.*;

class MyInfo
{
	int age;
	String name;
	String addr;
	void read()throws IOException
	{
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Enter ur name  ");
		name=br.readLine();
		System.out.print("Enter ur Age  ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Enter ur Address  ");
		addr=br.readLine();
	}
	void show()
	{
		System.out.print("\n\t NAME 	  "+name);
		System.out.print("\n\t AGE  	  "+age);
		System.out.print("\n\t ADDRESS 	  "+addr);
	}
	public static void main(String args[])throws IOException
	{
		MyInfo ob=new MyInfo();
		ob.read();
		ob.show();
		System.out.println("\n");
	}

}