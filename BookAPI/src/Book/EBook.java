package Book;

public class EBook extends Book{
	private String[] supperDevices;
	
	public EBook(String Title, String author,String publlisher, int price, String[] supperDevices) {
		super(Title,author,publlisher, price);
		this.supperDevices = supperDevices;
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
        return super.toString() + "\n**호환 기기:** " + deviceList.substring(0, deviceList.length() - 2);
    }
}
