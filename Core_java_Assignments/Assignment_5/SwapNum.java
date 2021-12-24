package exchangeposition;

import java.util.*;

public class SwapNum{
	
	public static void main(String[] args) {
		
		String s1,s2;
		List<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(20);

		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next()+" ");
		}
		System.out.println("After swapping ");

		Collections.swap(list, 0 , 1);
		System.out.print(" "+list);

		}

        }
