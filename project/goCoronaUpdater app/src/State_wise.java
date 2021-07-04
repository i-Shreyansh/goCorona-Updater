import java.util.Arrays;

public class State_wise {

	
	 int[] splitter1(String ans[],String data,String State)
	 {
		 
		 
		if (State.equals("null"))
		{	int value[]= {-1,-1,-1};
			return value;
		}
		else {
			
		
		 int L=data.length(); 
		 int i=data.indexOf(State);
		 data=data.substring(i);
		 int e=data.indexOf("},{");
		 String s="\"loc\":\""+State;
		 
		 String l[]= {};
		 data=data.substring(0, e);
		 l=data.split(",");
		 
		 
		 
		 ans[0]=l[1];//confirmed cases
		 ans[1]=l[3];//recovered
		 ans[2]=l[4];//deaths
	
		
		return splitter2(ans);
		}
				
		
	 }
	
int[] splitter2(String ans[])
 {
	 
	 ans[0]=ans[0].substring(23);
	 ans[1]=ans[1].substring(13);
	 ans[2]=ans[2].toString();
	 String l1[]= {};
	 l1=ans[2].split(":");
	 ans[2]=l1[1];
	
	 
	 int value[]=new int[3];
	 value[0]=Integer.parseInt(ans[0]);
	 value[1]=Integer.parseInt(ans[1]);
	 value[2]=Integer.parseInt(ans[2]);
	 return value;
	 
	 	 
	 
			
	
 }

/*
 String[] maharashtra(String data)
 {	
	 int i=
	 c=data.substring(108815, 110000);
	 return splitter(c);
 }

 String[] kerala(String data)
 {
	 c=data.substring(109740, 110050);
	 return splitter(c);
 }
 String[] karnataka(String data)
 {
	 c=data.substring(110240, 110600);
	 return splitter(c);
 }
 String[] Andhra_Pradesh(String data)
 {
	 c=data.substring(110570, 110900);
	 return splitter(c);
 }
 String[] Tamil_Nadu(String data)
 {
	 c=data.substring(110900, 111500);
	 return splitter(c);
 }
 String[] Delhi(String data)
 {
	 c=data.substring(111492, 112000);
	 return splitter(c);
 }
 String[] Uttar_Pradesh(String data)
 {
	 c=data.substring(111991, 112500);
	 return splitter(c);
 }
 String[] West_Bengal(String data)
 {
	 c=data.substring(112475, 112900);
	 return splitter(c);
 }
 String[] Odisha(String data)
 {
	 c=data.substring(112801, 113200);
	 return splitter(c);
 }
 String[] Rajasthan(String data)
 {
	 c=data.substring(113215, 113600);
	 return splitter(c);
 }
 String[] Chhattisgarh(String data)
 {
	 c=data.substring(113539, 113900);
	 return splitter(c);
 }
 String[] Telangana(String data)
 {
	 c=data.substring(113871, 114300);
	 return splitter(c);
 }
 String[] Haryana(String data)
 {
	 c=data.substring(114402, 114800);
	 return splitter(c);
 }
 String[] Gujrat(String data)
 {
	 c=data.substring(114725, 115100);
	 return splitter(c);
 }
 String[] Bihar(String data)
 {
	 c=data.substring(115050, 115400);
	 return splitter(c);
 }
 String[] Madhya_Pradesh(String data)
 {
	 c=data.substring(115370, 115700);
	 return splitter(c);
 }
 String[] Assam(String data)
 {
	 c=data.substring(115820, 116300);
	 return splitter(c);
 }
 String[] Punjab(String data)
 {
	 c=data.substring(116248, 116600);
	 return splitter(c);
 }
 String[] Jammu_Kashmir(String data)
 {
	 c=data.substring(116569, 116900);
	 return splitter(c);
 }
 String[] Jharkhand(String data)
 {
	 c=data.substring(116900, 117300);
	 return splitter(c);
 }
 String[] Uttarakhand(String data)
 {
	 c=data.substring(117221, 117700);
	 return splitter(c);
 }
 String[] Himachal_Pradesh(String data)
 {
	 c=data.substring(117221, 117700);
	 return splitter(c);
 }
 String[] Goa(String data)
 {
	 c=data.substring(117988, 118300);
	 return splitter(c);
 }
 String[] Puducherry(String data)
 {
	 c=data.substring(118300, 118700);
	 return splitter(c);
 }
 String[] Tripura(String data)
 {
	 c=data.substring(118615, 118990);
	 return splitter(c);
 }
 String[] Manipur(String data)
 {
	 c=data.substring(119132, 119500);
	 return splitter(c);
 }

 String[] Chandigarh(String data)
 {
	 c=data.substring(119750, 120090);
	 return splitter(c);
 }*/
}
