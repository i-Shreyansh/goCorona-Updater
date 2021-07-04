import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.*;




public class Covid19_API  {
	String data="null";
	int Scases,Srecovers,Sdeaths,Ccases,Crecovers,Cdeaths;
	String State="null",Country="null";

	
	@SuppressWarnings("resource")
	void input() {
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter Country here : ");
		//Country =sc.nextLine();
		if (Country.isEmpty())
			Country="null";
		System.out.print(Country);
		//System.out.print("Enter State here : ");
		//State=sc.nextLine();
		if (State.isEmpty())
		State="null";

		
	}
	
	public void Request(String site) throws IOException, InterruptedException {
	
	
	var url= site;
	var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
	var client= HttpClient.newBuilder().build();
	var response = client.send(request, HttpResponse.BodyHandlers.ofString());
	data=response.body();
	
	}
	
	void fetch_country(String data) {
		
		Country_wise COUNTRY=new Country_wise();
		int value[]=COUNTRY.Splitter(data,Country);
	
		Ccases=value[0];
		Crecovers=value[1];
		Cdeaths=value[2];
		
		
		
		
		
	}
	
	void fetch_state(String data) {
		
		
		String ans[]=new String[3];
	
		
		
		
		State_wise STATE=new State_wise();
		int[] value=STATE.splitter1(ans,data,State);
	
		Scases=value[0];
		Srecovers=value[1];
		Sdeaths=value[2];
		
		
	
		
	}
	
	
	
	

}	   
