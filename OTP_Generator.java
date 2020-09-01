package OTP;
import java.util.*;
public class OTP_Generator
{
	static char[] OTP(int len) 
	{
             String numbers = "0123456789";
             Random random_method = new Random();
             char[] otp = new char[len];
             for (int i = 0; i < len; i++) {
                    otp[i] = numbers.charAt(random_method.nextInt(numbers.length()));
             }
             return otp;
       }
	public static void main(String[] args)
	{
		int length=6;
		System.out.print("\nOTP is : ");
		System.out.print(OTP(length));
	}
}