package Book;

public class EBook extends Book{

	    private String[] supperDevices = {"안드로이드", "아이폰", "태블릿"};

	    public EBook(String title, String author, String publisher, int price) {
	        super(title, author, publisher, price);
	    }

	    public String[] getSupperDevices() {
	        return supperDevices;
	    }

	    public void setSupperDevices(String[] supperDevices) {
	        this.supperDevices = supperDevices;
	    }

	    @Override
	    public String toString() {
	        String deviceList = "";
	        for (String device : supperDevices) {
	            deviceList += device + ", ";
	        }

	        if (deviceList.length() > 0) {
	            deviceList = deviceList.substring(0, deviceList.length() - 2);
	        }

	        return super.toString() + "\n**호환 기기:** " + deviceList;
	    }
	}


