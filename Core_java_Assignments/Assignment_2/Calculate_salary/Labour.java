
public class Labour extends Employee2_2{

	public void NetSalary()
	{
		NetSal=basic+(basic*20/200)+(basic*95/100)+1000;
	}
public void GrossSalary()
{
	Gross=basic+(basic*95/100)+(basic*25/100);	
}
public void TaxPay()
{
	TaxVal=(basic*25/100);
	} 
public void OvertimePay()
{
	overtime=(basic*12.00);
}
public void TotalPay() {
	total=(Gross+NetSal+TaxVal+overtime);
}
