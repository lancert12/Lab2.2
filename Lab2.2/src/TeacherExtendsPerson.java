
class Teacher extends Person {
	private String Subject;
	private String Title;
	
	public Teacher(String firstName, String familyName, double height, String zodiacSign, String Subject, String Title) {
		super(firstName, familyName, height, zodiacSign);
		this.Subject = Subject;
		this.Title = Title;
	}
	public String getSubject() {
		return Subject; 
	}
	
	public String getTitle() {
		return Title;
	}
	
	public String toString() {
		return(Title + super.getFamilyName());
	}
}
