package ex0228.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String a = "Z@S.ME";
		String b = "Z@RN.E";
		
		if(a.hashCode() == b.hashCode()) {
		    System.out.println("same hashcode");
		} else {
		    System.out.println("different hashcode");
		}
		
		
		
		
		System.out.println("------------------");
		if(a.equals(b) ) {
		    System.out.println("same ");
		} else {
		    System.out.println("different");
		}
		
	}

}
