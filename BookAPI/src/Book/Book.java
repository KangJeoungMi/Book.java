package Book;


public class Book {
	private String Title;
	private String author;
	private int price;
	private String publisher;
	private float tax = 1.1f;


	public Book(String Title, String author,String publlisher, int price) {
		this.Title = Title;
		this.author = author;
		this.price = price;
		this.publisher = publlisher;
	}
	
	  public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getTax() {
		return tax = 1.1f;
	}
	@Override
	    public String toString() {
	        return String.format("책 제목 : %s | 저자 : %s | 출판사: %s | 가격 :  %d원 ", Title, author, publisher, price);
	    }
	public String deviceInfo() {
		return null;
	}
	
	
	
	
}


