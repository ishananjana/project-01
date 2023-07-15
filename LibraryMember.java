class LibraryMember{
	String memberId;
	String name;
	
	public LibraryMember(String memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	public void setmemberId(String memberId){
		this.memberId=memberId;
	}
	public String getMemberId(){
		return memberId;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void displayMemberDetails(){
		System.out.println("memberId"+memberId);
		System.out.println("Name"+name);
		System.out.println(" ");
	}
}