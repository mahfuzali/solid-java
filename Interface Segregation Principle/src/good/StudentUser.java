package good;

public class StudentUser implements IStudentUser {

	@Override
	public double studentSubcription(int years) {
		return ONE_YEAR_SUBSCRIPTION_FEE * years;		
	}

}
