class Tras
{
Tras(double transfer, int accountnumber)
{
System.out.println(transfer+"rupees transferred to"+accountnumber);
}
Tras(double transfer, int phonenumber)
{
System.out.println(transfer+"rupees transferred to"+phonenumber);
}
Tras(double transfer, String qrcode)
{
System.out.println(transfer+"rupees transferred to"+qrcode);
}
public static void main(String args[])
{
Tras t1=new Tras(1212.7,"likky");
}
}