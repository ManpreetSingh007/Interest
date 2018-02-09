import java.text.NumberFormat;
public class interest {
	public static void main(String[] args) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		double initialValue, total, interestRate;
		
		initialValue = 19453800;
		interestRate = .08;
		
		total = initialValue + initialValue*interestRate;  //* Calcuations
		
		System.out.println(money.format(total));
	}
}

//* made by Manpreet singh