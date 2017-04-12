
public class RunSalesPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String SalesPerson1Fname = "Bob";
		String SalesPerson1Lname = "Smith";

		String SalesPerson2Fname = "Bob";
		String SalesPerson2Lname = "Smith";

		float salesCommission = 0.0f;

		// create SalesPerson1
		SalesPerson salesPerson1 = new SalesPerson(SalesPerson1Fname, SalesPerson1Lname);
		salesPerson1.print();

		// create SalesPerson2
		SalesPerson salesPerson2 = new SalesPerson(SalesPerson2Fname, SalesPerson2Lname);
		salesPerson2.print();

		// compare SalesPerson1 to SalesPerson2

		if (salesPerson2.equals(salesPerson1)) {
			System.out.println("SalesPersons are the same!");
		} else {
			System.out.println("SalesPersons aren't the same!");
		}

		salesCommission = salesPerson1.calculateCommission(0.5f, 100);
		System.out.println("The sales commission is " + salesCommission);

		salesCommission = salesPerson1.calculateCommission(0.5f, 100.5f);
		System.out.println("The sales commission is " + salesCommission);

	}

}
