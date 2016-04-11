package com.tu;
public class TestDemo1 {
	public static void main(String[] args) {
		
		String s="123";
		
		//byte与Byte的转换
		byte bt=1;
		Byte Bt=new Byte(bt);
		System.out.println("Bt="+Bt);
		
		byte bt1=Bt.byteValue();
		System.out.println("bt1="+bt1);
		
		byte bt2=Byte.parseByte(s);
		System.out.println("bt2="+bt2);
		
		//short 与Short的转换
		short sh=100;
		Short Sh=new Short(sh);
		System.out.println("Sh="+Sh);
		
		short sh1=Sh.shortValue();
		System.out.println("sh1="+sh);
		
		short sh2=Short.parseShort(s);
		System.out.println("sh2="+sh2);
		
		//int与interger的转换
		int i=10;
		Integer It=new Integer(i);
		System.out.println("itg="+It);
		
		int i1=It.intValue();
		System.out.println("i1="+i1);
		
		int i2=Integer.parseInt(s);
		System.out.println("i2="+i2);
		
		//long与Long的转换
		long lg=100;
		Long Lg=new Long(lg);
		System.out.println("Lg="+Lg);
		
		long lg1=Lg.longValue();
		System.out.println("lg1="+lg1);
		
		long lg2=Long.parseLong(s);
		System.out.println("lg2="+lg2);
		
		//float 与Float的转换
		float ft=10.01f;
		Float Ft=new Float(ft);
		System.out.println("Ft="+Ft);
		
		float ft1=Ft.floatValue();
		System.out.println("ft1="+ft1);
		
		float ft2=Float.parseFloat(s);
		System.out.println("ft2="+ft2);
		
		//double 与Double的转换
		double db=100.21d;
		Double Db=new Double(db);
		System.out.println("Db="+Db);
		
		double db1=Db.doubleValue();
		System.out.println("db1="+db1);
		
		double db2=Double.parseDouble(s);
		System.out.println("db2="+db2);
		
		//char 与Character的转换
		char c='a';
		char cc=65;
		Character Ch=new Character(c);
		Character Ch1=new Character(cc);
		System.out.println("Ch="+Ch);
		System.out.println("Ch1="+Ch1);
		
		char c1=Ch.charValue();
		char c2=Ch1.charValue();
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		char c3=Character.valueOf(c);
		char c4=Character.valueOf(cc);
		System.out.println("c3="+c3);
		System.out.println("c3="+c4);
		
		//boolean与Boolean之间的转换
		boolean boo=false;
		Boolean Boo=new Boolean(boo);
		System.out.println("Boo="+Boo);
		
		boolean boo1=Boo.booleanValue();
		System.out.println("boo1="+boo1);
		
		boolean boo2=Boolean.parseBoolean(s);
		System.out.println("boo2="+boo2);
		
		
	}

}
