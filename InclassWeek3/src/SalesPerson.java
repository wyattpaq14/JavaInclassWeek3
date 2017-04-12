
public class SalesPerson {

	private String FirstName;
	private String LastName;

	public SalesPerson(String FirstName, String LastName) {

		setFirstName(FirstName);
		setLastName(LastName);

	}

	// methods

	public void print() {
		System.out.println("FirstName: " + this.FirstName);
		System.out.println("LastName: " + this.LastName);

	}

	public boolean equals(SalesPerson SalesPerson2) {

		String SalesPerson1Name = this.FirstName + " " + this.LastName;
		String SalesPerson2Name = SalesPerson2.FirstName + " " + SalesPerson2.LastName;
		if (SalesPerson1Name.equals(SalesPerson2Name)) {
			return true;
		}

		return false;

	}

	public float calculateCommission(float commissionRate, int salesAmount) {
		return commissionRate * salesAmount;
	}
	
	public float calculateCommission(float commissionRate, float salesAmount) {
		return commissionRate * salesAmount;
	}
	
	

	// getters and setters
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

}
