import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;





public class MapEntry{

	public static void main(String[] args) {
		HashMap<Integer,String> a = new HashMap<>();
		a.put(1, "mahesh");
		a.put(2, "susheel");
		a.put(3, "sai");
		a.put(4, "srikanth");
		a.put(5, "chakri");
		a.put(6, "lavanya");
		a.put(7, "naresh");
		Set<Entry<Integer,String>> s=a.entrySet();
		Iterator it= s.iterator();//using iterator
		while(it.hasNext())
		{
			Map.Entry<Integer,String> m=(Map.Entry)it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("===============================================");
	for(Map.Entry<Integer,String > x:s)
	{
		System.out.println(x.getKey()+"  "+x.getValue());
	}
	}

}
