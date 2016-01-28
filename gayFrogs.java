
public class gayFrogs {
	
	double michaelVick;
	double seanPenn;
	double alexJones;
		
	public gayFrogs(){
		michaelVick = seanPenn = alexJones = 0;
	}
	
	public gayFrogs(double x){
		michaelVick = x;
		seanPenn = alexJones = 0;
	}
	
	public gayFrogs(double x, int y){
		michaelVick = x;
		seanPenn = y;
		alexJones = 0;
	}
	
	public gayFrogs(double x, int y, double z){
		michaelVick = x;
		seanPenn = y;
		alexJones = z;
	}
	
	public double hireMichaelVick(double x){
		return michaelVick;
	}
	
	public double hireSeanPenn(int y){
		return seanPenn;
	}
	
	public double hireAlexJones(double z){
		return alexJones;
	}
		
	public double cloneMichaelVick(double x){
		return michaelVick += x;
	}
	
	public double cloneSeanPenn(int y){
		return seanPenn += y;
	}
	
	public double cloneAlexJones(double z){
		return alexJones += z;
	}
}