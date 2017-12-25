import Request.Response;

import static Request.Socket.*;


public class Main {
	
	String bridgeURL = "http://192.168.1.21:81/api/";
	String username = "FS-NbfhOkoPq2xpX4bKyDkcNji-MNZ4dN7rhb8pN";
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		Response getResponse = GET(bridgeURL + username);
		System.out.println(getResponse.getResponseCode() + ", " + getResponse.getResponseString());
	}
	
	
}
