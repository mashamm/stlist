package edu.samoilenko.strlist;

public class StrangeListMain {

	public static void main(String[] args) {
//		StrangeList<Integer> list =new StrangeList<>();
//		list.add(2);
//		list.print();
//		System.out.println(list.toString());
//		System.out.println("---------------------------------");
//		list.add(4);
//		list.print();
//		System.out.println(list.toString());
//		System.out.println("---------------------------------");
//		list.add(5);
//		list.print();
//		System.out.println("---------------------------------");
//		System.out.println(list.toString());
//		list.add(6);
//		list.print();
//		System.out.println(list.toString());
//		list.add(7);
//		list.print();
//		
//		System.out.println(list.toString());
//		list.add(8);
//		System.out.println("---------------------------------");
//		list.print();
//		System.out.println("---------------------------------");
//	
		//System.out.println("After deleting");
//		list.delete(2);
//		System.out.println(list.toString());
//		System.out.println("Printing for integer list");
//		list.print();
//		
//		StrangeList<Float> list3 =new StrangeList<>();
//		list3.add(3.3f);
//		
		
		StrangeList<Integer> list =new StrangeList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(67);
		
		list.printAll();
		System.out.println(list.toString());
		
		list.delete(1);
		
		list.printAll();
		System.out.println(list.toString());
		
		list.add(34);
		list.add(31);
		list.printAll();
		System.out.println(list.toString());
		list.add(33);
		list.add(45);

		list.printAll();
		System.out.println(list.toString());
		
		list.add(22);
		list.printAll();
		System.out.println(list.toString());
	}

}
