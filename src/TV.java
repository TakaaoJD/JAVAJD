import java.util.Scanner;

public class TV {

	String stanza;
	int volume;
	int canale;
	
	
	public TV (){ 							//scelta stanza TV
		
		this.stanza="";
		this.volume = 1;
		this.canale = 1;
	
	}	
		
	public String setstanza(String stanza) {
		
		this.stanza = stanza;
		return this.stanza;
	}
	
	public int setcanale(int canale) {
		
		this.canale = canale;
		return this.canale;
	
	}
	
	void display(){
	
	System.out.println("La TV in "+this.stanza+" è impostata a volume: "+this.volume+" e canale #"+ this.canale+" come predefinito");
	
	}
	
	void displayfinale(){
		
		System.out.println("La TV in "+this.stanza+" è impostata a volume: "+this.volume+" e canale #"+ this.canale);
		
		}


	public boolean volumepiu(int volume) {
		
		int tempvolume=this.volume;
		
		this.volume = this.volume + volume;
		
		if(this.volume>10) {
			
			this.volume=tempvolume;
			
			return false;
		}
		
		else {
		
			return true;
		} 
	}
	
	public boolean volumemeno(int volume) {
		
		int tempvolume=this.volume;
		
		this.volume = this.volume - volume;
		
		if(this.volume<0) {
			
			this.volume=tempvolume;
			
			return false;
		}
		
		else {
		
			return true;
		} 
	}
	
	public boolean canalepiu(int canale) {
		
		int tempcanale=this.canale;
		
		this.canale = this.canale + canale;
		
		if(this.canale>20) {
			
			this.canale=tempcanale;
			
			return false;
		}
		
		else {
		
			return true;
		} 
	}
	
	public boolean canalemeno(int canale) {
		
		int tempcanale=this.canale;
		
		this.canale = this.canale - canale;
		
		if(this.canale<0) {
			
			this.canale=tempcanale;
			
			return false;
		}
		
		else {
		
			return true;
		} 
	}

	

	public int getVolume() {
		
		return volume;
	
	}
	
	public int getCanale() {
		
		return canale;
	
	}

}
	
