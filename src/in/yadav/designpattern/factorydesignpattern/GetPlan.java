package in.yadav.designpattern.factorydesignpattern;

public class GetPlan {
	Plan getPlan(String planType) {
		if(planType==null) {
			return null;
		}
		
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("InstituationalPlan")) {
			return new InstituationalPlan();
		}
		return null;
	}
}
