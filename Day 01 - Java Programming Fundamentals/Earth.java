public class Earth{
	public static void main(String[] Args){
		int r = 6378;
		double mil = 6378*1.6;
		double volumeinkm = (4.0/3.0)*3.14*Math.pow(r,3);
		double volumeinmil = (4.0/3.0)*3.14*Math.pow(mil,3);
		System.out.println("Volume in km: " + volumeinkm + "\n" + "Volume in Miles: " + volumeinmil); 
	}
}