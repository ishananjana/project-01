class Book extends LibraryItem{
	String author;
	int numPages;
	
	public Book(String title,String itemId,String author,int numPages,boolean check){
		super(title,itemId,check);
		this.author=author;
		this.numPages=numPages;
		checkOut();
		checkIn();
		getCheck();
	}
	
	public void displayItemDetails(){
		System.out.println("ItemId"+itemId);
		System.out.println("Title"+title);
		System.out.println("Author"+author);
		System.out.println("Number of pages"+numPages);
		System.out.println("Availability"+getCheck());
		System.out.println(" ");
	}
}	