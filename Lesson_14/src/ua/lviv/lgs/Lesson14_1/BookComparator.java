package ua.lviv.lgs.Lesson14_1;

import java.util.Comparator;

public class BookComparator implements Comparator<BookClass>  {


	public int compare(BookClass o1, BookClass o2) {
		if (o1.getNameBook().compareTo(o2.getNameBook())>0) {
			return 1;
		}else if (o1.getNameBook().compareTo(o2.getNameBook())<0) {
			return -1;
		} else {
			return (o1.getYear_issue()>o2.getYear_issue()) ? 1:-1;
		}
	}



}
