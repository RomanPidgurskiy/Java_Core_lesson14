package ua.lviv.lgs.Lesson14_1;

public class BookClass implements Comparable<BookClass> {
	
	public String nameBook;
	public int year_issue;
	
	
	public BookClass(String nameBook, int year_issue) {
		super();
		this.nameBook = nameBook;
		this.year_issue = year_issue;
	}


	public String getNameBook() {
		return nameBook;
	}


	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}




	public int getYear_issue() {
		return year_issue;
	}


	public void setYear_issue(int year_issue) {
		this.year_issue = year_issue;
	}


	@Override
	public String toString() {
		return "BookClass [nameBook=" + nameBook + ", year_issue=" + year_issue + "]";
	}


	@Override
	public int compareTo(BookClass arg0) {
		return this.nameBook.compareTo(arg0.getNameBook());
		
	}
}
