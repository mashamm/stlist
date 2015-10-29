package edu.samoilenko.strlist;

public class Adder<T extends Number> {
	@SuppressWarnings("unchecked")
	 public  Number add(T v1, T v2){
		 if (v1 instanceof Byte) {
			    return (T)(new Byte((byte)((Byte)v1 + (Byte)v2)));
			   } else if (v1 instanceof Short) {
			    return (T)(new Short((short)((Short)v1 + (Short)v2)));
			   } else if (v1 instanceof Integer) {
			    return (T)(new Integer((Integer)v1 + (Integer)v2));
			   } else if (v1 instanceof Long) {
			    return (T)(new Long((Long)v1 + (Long)v2));
			   }  else if (v1 instanceof Float) {
			    return (T)(new Float((Float)v1 + (Float)v2));
			   }  else if (v1 instanceof Double) {
			    return (T)(new Double((Double)v1 + (Double)v2));
			   }
			   throw new IllegalArgumentException();

	};
		
	

	
}
