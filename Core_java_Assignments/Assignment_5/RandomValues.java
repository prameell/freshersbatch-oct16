package holdvalues;

import java.util.HashMap;
import java.util.Map;

public class RandomValues {
	public static void main(String[] args) {
	
		HashMap<Integer,Double> map=new HashMap<Integer,Double>();
		map.put(1,1000.0);
		map.put(2,2000.0);
		map.put(3,3000.0);
		map.put(4,4000.0);
		map.put(5,5000.0);
		map.put(6,6000.0);
		map.put(7,7000.0);
		map.put(8,8000.0);
		map.put(9,9000.0);
		map.put(10,10000.0);

		for(Map.Entry m:map.entrySet() )
		{
		System.out.println("key -->"+m.getKey()+" value-->"+m.getValue());
		}

		}



}
