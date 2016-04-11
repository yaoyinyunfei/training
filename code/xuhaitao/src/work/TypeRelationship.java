package work;

public class TypeRelationship {
	public static void main(String[] args){
		//byte类型
		byte b = 1;
		System.out.println("b="+b);
		Byte by = new Byte(b);
		System.out.println("by="+by);
		
		byte b1 = by.byteValue();
		System.out.println("b1="+b1);
		System.out.println("..............");
		
		//short类型
		short s = 10;
		System.out.println("s="+s);
		Short sh = new Short(s);
		System.out.println("sh="+sh);
		
		short s1 = sh.shortValue();
		System.out.println("sl="+s1);
		System.out.println("..............");
		
		//int类型
		int i = 100;
		System.out.println("i="+i);
		Integer inte = new Integer(i);
		System.out.println("inte="+inte);
		
		int i1 = inte.intValue();
		System.out.println("i1="+i1);
		System.out.println("..............");
		
		//long类型
		long l = 1000;
		System.out.println("l="+l);
		Long lo = new Long(l);
		System.out.println("lo="+lo);
		
		long l1 = lo.longValue();
		System.out.println("l1="+l1);
		System.out.println("..............");
		
		//float类型
		float f =  1000.1f;
		System.out.println("f="+f);
		Float flo = new Float(f);
		System.out.println("flo="+flo);
		
		float f1 = flo.floatValue();
		System.out.println("f1="+f1);
		System.out.println("..............");
		
		//double类型
		double d = 10000.11;
		System.out.println("d="+d);
		Double dou = new Double(d);
		System.out.println("dou="+dou);
		
		double d1 = dou.doubleValue();
		System.out.println("d1="+d1);
		System.out.println("..............");
		
		//char类型
		char c = 'c';
		System.out.println("c="+c);
		Character cha = new Character(c);
		System.out.println("cha="+cha);
		
		char c1 = cha.charValue();
		System.out.println(c1);
		System.out.println("..............");
		
		//bool类型
		boolean bool = true;
		System.out.println("bool="+bool);
		Boolean boole = new Boolean(bool);
		System.out.println("boole="+boole);
		
		boolean bool1 = boole.booleanValue();
		System.out.println("bool1="+bool1);
		
		
		
		
		
		}
}
