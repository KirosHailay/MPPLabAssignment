package lab3.prob1.prob4;

public class Driver {

	public static void main(String[] args) {

		Properties[] objects = { new House(9000, "1000 N st", "FairFeild", "Iowa", 52557),
				new Condo(2, "1000 N st", "FairFeild", "Iowa", 52557),
				new Trailer("1000 N st", "FairFeild", "Iowa", 52557) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
