class Magazine extends LibraryItem{
	String issueDate;
	String publisher;
	
	public Magazine(String title,String itemId,String issueDate,String publisher,boolean check){
		super(title,itemId,check);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	public void displayItemDetails(){
		System.out.println("ItemId"+itemId);
		System.out.println("Title"+title);
		System.out.println("Issue Date"+issueDate);
		System.out.println("publisher"+publisher);
		System.out.println("Availability"+getCheck());
		System.out.println(" ");
	}
}