package good;

public class Admin {
	
	public static void main(String[] args) {
		PremiumUser pu = new PremiumUser();
		pu.premiumSubcription(2);
		
		EnterpriseUser eu = new EnterpriseUser();
		eu.premiumSubcription(5);
		eu.technicalSupport();
	}
}
