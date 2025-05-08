class Tras
{
Tras()
{
System.out.println("rupees transferred to likky");
}
Tras(double transfer, long phonenumber)
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
Tras t2=new Tras();
}
}