public class Main{
	public static void main(String args[]){
		Book p1=new Book("The Catcher in the Rye","B001","J.D.Sailinger",240,true);
		Book p2=new Book("To Kill a Mockingbird","B002","Harpages",281,true);
		Book p3=new Book("1998","B003","George Orwell",328,true);
		Book p4=new Book("Pride and perjudice","B004","Jane Austin",432,true);
		Book p5=new Book("The Hobbit","B005","J.R.R.Tolkien",320,true);
		
		Magazine n1=new Magazine("National Geographic","M001","August 2023","National Geographic Society",true);
        Magazine n2=new Magazine("Time","M002","September 2023","Time USA LLC",true);
        Magazine n3=new Magazine("Forbes","M003","June 2023","Forbes Media",true);
        Magazine n4=new Magazine("Vogue","M004","July 2023","Conde Nast",true);
        Magazine n5=new Magazine("Sports illustrated","M005","July 2023","Maven Coalition",true);

		
        LibraryMember L3=new LibraryMember("L003","David Johnson");

        LibraryMember L4=new LibraryMember("L004","Sarah Williams");

        
	    LibraryMember L5=new LibraryMember("L005","Michael Brown");
	}
}
