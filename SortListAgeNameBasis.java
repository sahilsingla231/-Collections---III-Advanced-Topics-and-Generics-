package generics;
import java.util.*;
/**
*
* @author Sahil
*/

//I have used comparator as have to sort on basis of multiple Properties...  Use collection if only one Property...


public class SortListAgeNameBasis {

	
	public static void main(String args[])
	
   {

		ArrayList array=new ArrayList();
		array.add(new Chitkarian(1,"Sahil",21)); //rollno,name,age.......
		array.add(new Chitkarian(2,"Radha",25));
		array.add(new Chitkarian(3,"Aman",22));
		array.add(new Chitkarian(4,"Amit",92));

		System.out.println("Sorted on age basis");
		Collections.sort(array,new Age());
		Iterator itr1=array.iterator();
		while(itr1.hasNext())
		{
			Chitkarian st=(Chitkarian)itr1.next();
			System.out.println(st.rn+" "+st.name+" "+st.age);
		}
		
		System.out.println("*******************************");
		System.out.println("Sorted on name basis");
		Collections.sort(array,new Name());
		Iterator itr=array.iterator();
		while(itr.hasNext())
		{
			Chitkarian st=(Chitkarian)itr.next();
			System.out.println(st.rn+" "+st.name+" "+st.age);
		}

	}
}
class Chitkarian
{
	String name;
	int rn,age;	

	Chitkarian(int rn , String name, int age)
	{
		this.rn = rn;
		this.name = name;
		this.age = age;
	}
}

class Name implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Chitkarian s1=(Chitkarian)o1;
		Chitkarian s2=(Chitkarian)o2;

		return s1.name.compareTo(s2.name);
	}
}
class Age implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Chitkarian s1=(Chitkarian)o1;
		Chitkarian s2=(Chitkarian)o2;

		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
	
}
