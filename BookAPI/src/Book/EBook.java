package Book;

public class EBook extends Book{

	    private String supperDevices;

	    public EBook(String title, String author, String publisher, int price,String supperDevices) {
	        super(title, author, publisher, price);
	        this.supperDevices = supperDevices;
	        
	    }

	  

	    public String getSupperDevices() {
			return supperDevices;
		}



		public void setSupperDevices(String supperDevices) {
			this.supperDevices = supperDevices;
		}

		 @Override
		 public String toString() {
		    return super.toString() + "\n**호환 기기:** " + supperDevices;
		 }

		
	    public String deviceInfo() {
	        return  "\n**호환 기기:** " + supperDevices;
	    }
	}


