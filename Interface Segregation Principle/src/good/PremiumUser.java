package good;

public class PremiumUser implements IPremiumUser {

	@Override
	public double premiumSubcription(int years) {
		// TODO Auto-generated method stub
		return ONE_YEAR_SUBSCRIPTION_FEE * years;	
	}

}
