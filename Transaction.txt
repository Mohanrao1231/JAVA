class Transaction
{
public void transferAmount(double transferAmount, long phoneNumber)
{
System.out.println(transferAmount+"rupees transferred to phonenumber"+phoneNumber);
}
public void transferAmount(double transferAmount, int accountNumber)
{
System.out.println(transferAmount+"rupees transferred to accountNumber"+accountNumber);
}
public void transferAmount(double transferAmount, string qrCode)
{
System.out.println(transferAmount+"rupees transferred to qrCode"+qrCode);
}
public static void amin(string args[])
{
Transaction t=new Transaction();
t.transferAmount(10000.45,12345);
t.transferAmount(10000.45,"likky");
t.transferAmount(10000.45,12345998l);
}
}