package lab04;
import java.util.ArrayList;


public class Library{
	private ArrayList<Book> libraryOfBooks;

	public Library(){
		libraryOfBooks = new ArrayList<>();
	}//end of constructor

	public void addBook(Book b){
		if(b!=null){
		libraryOfBooks.add(b);
		}

	}//end of addBook

	public int numBooks(){
		return libraryOfBooks.size();
	}//end of numBooks

	public void printLibrary(){
		for (int i=0; i<libraryOfBooks.size(); i++){
			Book temp =libraryOfBooks.get(i);
			System.out.println(temp.toString());
		}
	}//end of print library

	public double averageLengthOfBooks(){
		double returnValue=0;
		for (int i=0; i<libraryOfBooks.size(); i++){
			Book tempStor =libraryOfBooks.get(i);
			returnValue=returnValue+tempStor.getNumPages();
		}
		returnValue=returnValue/libraryOfBooks.size();
		return returnValue;

	}//end of averageLength

	public Book checkoutBook(int index){
		Book borrowedBook=libraryOfBooks.get(index);
		libraryOfBooks.remove(index);

		return borrowedBook;
	}

	public static void main(String[] args){
		Library test1=new Library();
		Book book1= new Book("Scott Pilgrims Precious Little Life: Volume 1", 100);
		Book book2= new Book("Scott Pilgrim vs. the World: Volume 2",100);
		Book book3= new Book("Scott Pilgrim & the Infinite Sadness: Volume 3",100);
		Book book4= new Book("Scott Pilgrim Gets It Together Volume 4",100);


		test1.addBook(book1);
		test1.addBook(book2);
		test1.addBook(book3);

		System.out.println();
		System.out.println("number of books ="+ test1.numBooks()+" expected ="+3);
		System.out.println();
		System.out.println("current library");
		test1.printLibrary();
		System.out.println();
		System.out.println("average Length ="+ test1.averageLengthOfBooks()+" expected ="+ 100.0);
		System.out.println();
		System.out.println("Checked out:"+test1.checkoutBook(0));
		System.out.println();
		System.out.println("new library");
		test1.printLibrary();
		System.out.println();

	}






	}

