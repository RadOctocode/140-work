package lab04;


public class Book{
	private String title;
	private int numPages;

	public Book(String aTitle, int aPage){
		if (aPage<=0)throw new IllegalArgumentException("pages cannot be negative");//exception thrower

		else{
		title = aTitle;
		numPages = aPage;
		}//end of else

	}//end of constructor

	public String getTitle(){
		return title;
	}//end of getTitle

	public int getNumPages(){
		return numPages;
	}//end of getNumPages

	public String toString(){
		String formattedResponse= title+" ("+ numPages +")";
		return formattedResponse;
	}

















}