abstract  class LibraryItem{
String title;
String itemId;
boolean check=true;

public LibraryItem(String title,String itemId,boolean check){
this.title=title;
this.itemId=itemId;
this.check=check;
}
public void checkOut(){
	check =false;
}
public void checkIn(){
	check=true;
}
public String getCheck(){
	String Availabiity;
	if(check==true){
		Availabiity="Available";
		return Availabiity;
	}
	else{
		Availabiity="Not Available";
		return Availabiity;
	}
}
public void displayItemDetails(){
}
}
		