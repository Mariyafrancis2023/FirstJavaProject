package FirstPackage;

public class teleVision {
	String brandName;
	String display;
	Float screenSize;
	int hdmi;
	int screenResolution;
	boolean isSmartTV;

void watchMovie() {
	System.out.println("watching movies on "+ brandName +" TV");
}
void watchYoutube() {
	System.out.println("watching Youtube on "+ brandName +"  TV");
}
void casting() {
	System.out.println("direct casting is available if TV is smart. TV is smart:"+isSmartTV);
	}
}
