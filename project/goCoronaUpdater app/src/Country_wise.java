import java.util.Arrays;

public class Country_wise {

	
	int[] Splitter(String data,String Country) {
		
		if (Country.equals("null"))
		{	int value[]= {-1,-1,-1};
			return value;
		}
		else {
			String[] ans=data.split("\"value\":");
			String[][] l=new String[3][];
			l[0]=ans[1].split(",");
			l[1]=ans[2].split(",");
			l[2]=ans[3].split(",");
			int[] value=new int[3]; 
			value[0]=Integer.parseInt(l[0][0]);
			value[1]=Integer.parseInt(l[1][0]);
			value[2]=Integer.parseInt(l[2][0]);
			
			
			return value;
		}
			
	}
	
}
