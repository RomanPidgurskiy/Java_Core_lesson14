package ua.lviv.lgs.Lesson14_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application1 {
	public static void main(String[] args) {
		
		Set<BookClass> setBook0 = new LinkedHashSet<>();
		//Set<BookClass> setBook0 = new HashSet<>();
	    setBook0.add(new BookClass("PHP5",2008));
		setBook0.add(new BookClass("Java JDK7", 2007));
		setBook0.add(new BookClass("PHP7", 2018));
		setBook0.add(new BookClass("Java JDK8", 2010));
		setBook0.add(new BookClass("C#", 2017));

		for (BookClass book2 : setBook0) {
			System.out.println(book2);
		}
	
		System.out.println();
		
		
		TreeSet<BookClass> setBook1 = new TreeSet<>();
		
	    setBook1.add(new BookClass("PHP5",2008));
		setBook1.add(new BookClass("Java JDK7", 2007));
		setBook1.add(new BookClass("PHP7", 2018));
		setBook1.add(new BookClass("Java JDK8", 2010));
		setBook1.add(new BookClass("C#", 2017));
	
		
		for (BookClass book1 : setBook1) {
			System.out.println(book1);
		}
	
		System.out.println();

		TreeSet<BookClass> setBook2 = new TreeSet<>(new BookComparator());
	    setBook2.add(new BookClass("PHP5",2008));
		setBook2.add(new BookClass("Java JDK7", 2007));
		setBook2.add(new BookClass("PHP7", 2018));
		setBook2.add(new BookClass("Java JDK8", 2010));
		setBook2.add(new BookClass("C#", 2017));

		for (BookClass book2 : setBook2) {
			System.out.println(book2);
		}

	

		
	}
}
