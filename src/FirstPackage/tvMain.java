package FirstPackage;

public class tvMain {

	public static void main(String[] args) {
		teleVision rcaTv = new teleVision();
		rcaTv.brandName = "RCA";
		rcaTv.display = "HD";
		rcaTv.screenSize = 150.5f;
		rcaTv.hdmi = 2;
		rcaTv.screenResolution = 8;
		rcaTv.isSmartTV = false;
		rcaTv.watchMovie();
		rcaTv.watchYoutube();
		rcaTv.casting();
	
	}

}
