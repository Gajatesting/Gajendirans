package org.cts;

import java.util.ArrayList;

public class ArrayListSample {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
System.out.println("ArrayList Size is " +al.size());
al.add("APPLE");
al.add("BALL");
al.add(5);
System.out.println("Now size "+al.size());
System.out.println(al);
al.add('A');
al.lastIndexOf("BALL ");
System.out.println(al);
al.remove("BALL");
System.out.println(al);
boolean adding = al.addAll(al);
System.out.println(adding);
System.out.println(al);
Object oi = al.get(4);
System.out.println("Display Third Method Name  "+oi);
System.out.println(al);
Object remove = al.remove(3);
System.out.println(remove);
System.out.println(al);
al.add(3,"Gaja");
System.out.println(al);
}
}
