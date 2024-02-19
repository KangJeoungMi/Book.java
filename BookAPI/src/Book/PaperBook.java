package Book;

public class PaperBook extends Book{
	private int size;

	public PaperBook(String Title, String author,String publlisher, int price, int size) {
		super(Title,author,publlisher, price);
		this.size = size;
	}

	
	

    @Override
    public String toString() {
        return super.toString() + "\n**페이지 수:** " + size + "쪽";
    }

    public String sizeInfo() {
        String sizeDescriptor;
        if (size < 100) {
            sizeDescriptor = "짧은 (소설, 만화 등)";
        } else if (size < 300) {
            sizeDescriptor = "보통 (일반 서적 등)";
        } else {
            sizeDescriptor = "긴 (전문 서적, 사전 등)";
        }
        return "**책 크기:** " + size + "쪽 (" + sizeDescriptor + ")";
    }
	 public int getSize() {
			return size;
		}
	 public void setSize(int size) {
			this.size = size;
		}

	 
}
