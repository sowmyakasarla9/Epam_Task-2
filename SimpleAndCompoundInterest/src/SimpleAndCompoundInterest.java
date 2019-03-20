package interest;
/**
 * 
 * @author SowmyaReddy
 *
 */
public class SimpleAndCompoundInterest {
	double principal,rateofinterest;
	int timeperiod;
	/**
	 * constructor
	 * @param principal
	 * @param timeperiod
	 * @param rateofinterest
	 */
	public SimpleAndCompoundInterest(double principal,int timeperiod,double rateofinterest)
	{
		this.principal=principal;
		this.timeperiod=timeperiod;
		this.rateofinterest=rateofinterest;
	}
	/**
	 * calculates simple interest
	 * @param principal
	 * @param timeperiod
	 * @param rateofinterest
	 * @return
	 */
	public double calculateSimpleInterest()
	{
		return (principal*timeperiod*rateofinterest)/100;
	}
	/**
	 * calculates compound interest
	 * @param principal
	 * @param timeperiod
	 * @param rateofinterest
	 * @return
	 */
	public double calculateCompoundInterest()
	{
		return  principal*Math.pow(((1+rateofinterest/100)),timeperiod);
	}
}
