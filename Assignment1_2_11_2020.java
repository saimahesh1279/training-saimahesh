public class Assignment1_2_11_2020 {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(55);
	ll.add(66);
	ll.add(61);
	ll.add(66);
	ll.add(22);
	ll.add(10);
	int val=66;
	
	
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			if(it.next()==val)
			{
				ll.remove(ll.indexOf(val));
				it=ll.iterator();
			}
		}
	System.out.println(ll);
	
}
}