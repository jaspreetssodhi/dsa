package jaspreet;


import java.math.BigInteger;
import java.util.Random;
import java.io.*;
public class rsa
{
	public static void main(String[] args) throws IOException
	{ 	BigInteger p,q,N,z,e,d;
		int bitlength = 1024;
		Random r;
		r = new Random();
		p = BigInteger.probablePrime(bitlength, r);
		q = BigInteger.probablePrime(bitlength, r);
		N = p.multiply(q);
		z = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		e = BigInteger.probablePrime(bitlength/2, r);
		while (z.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(z) < 0 )
		{
		e.add(BigInteger.ONE);
		}
		d = e.modInverse(z);
		DataInputStream in=new DataInputStream(System.in);
		String msg ;
		System.out.println("Enter the plain text:");
		msg = in.readLine();
		// encrypt
		int sum=0, rem=0;
		byte[] encrypted = new BigInteger(msg.getBytes()).modPow(e, N).toByteArray();
		//12
		for(int i=0; i<encrypted.length; i++)
		{
			sum +=(int)(Math.abs(encrypted[i]));
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<String.valueOf(sum).length(); i++)
		{
			rem = sum%10;
			sum/=10;
			sb.append((char)(rem+97));
		}
		System.out.println("Encrypted text is: "+sb);
		// decrypt
		byte[] decrypted = new BigInteger(encrypted).modPow(d, N).toByteArray();
		System.out.println("Decrypted String: " + new String(decrypted));
	}
}