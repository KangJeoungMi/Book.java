package Book;

public class PaperBook extends Book{
	private int size;

	public PaperBook(String Title, String author,String publlisher, int price, int size) {
		super(Title,author,publlisher, price);
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

    @Override
    public String toString() {
        return super.toString() + "\n**페이지 수:** " + size + "쪽";
    }

    public String sizeInfo() {
        
        return "\n**페이지 수:** " + size + "쪽";
    }
	 

	  
}
