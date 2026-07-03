package exceptions;




public class MinimumBalanceException extends Exception {
	
	public MinimumBalanceException(double accbalance)
	{
		super("Minimum Balance > 1000  required.Current Balance : ₹ "+String.format("%.2f",accbalance));
	}
}

