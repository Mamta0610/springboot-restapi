package rajkumar;

public class TempAnalysis {

	public static void main(String[] args) {
	//step1
		double[] temps = {34.2,30.1,24,35.6,20.4,31.2,45,28.56, 34,50,44,32,20,19.67};
		
		//step2
		double sum = 0;
		for(double temp : temps) {
			sum +=temp;
		}
		double average = sum/ temps.length;
		
		//step3
		double maxTemp = temps[0];
		double minTemp= temps[0];
		
		for(double temp : temps) {
			if(temp > maxTemp) {
				maxTemp = temp;
			}
			if(temp < minTemp) {
				minTemp = temp;
			}
		}
		
		//step4
		int countAvg = 0;
		
		for(double temp : temps) {
			if(temp > average) {
				countAvg++;
			}
		}
		
		//output on console
		System.out.println("Average temp  : " + average);
		System.out.println("Highest temp : "+ maxTemp);
		System.out.println("Lowest temp : "+minTemp);
		System.out.println("Days above average : " + countAvg);

	}

}
