import java.io.IOException;
import java.util.Arrays;

public class MAIN extends Covid19_API{

	public void RUN()  {
		String site1="https://covid19.mathdro.id/api/countries/"/*+country*/,
				site2="https://api.rootnet.in/covid19-in/stats/latest",
				site3="http://ip-api.com/json/24.48.0.1?fields=477",
				site4="https://api.covid19india.org/data.json";
			
	
		input();
		
			try {
				Request(site1+Country);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
		fetch_country(data);
	
			try {
				Request(site2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		fetch_state(data);
		
		
		
		

	}



}
