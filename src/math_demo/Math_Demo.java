package math_demo;

public class Math_Demo {
	public static void main(String[] args ) {
		

		int x = 3;
        int y = 4;
        
        int c = 9;
        int d = 10;
        
        long a = 2;
        long b = 3;
        
        
        
        double e = Math.E;
        System.out.println("E = "+e);
        
        double pi = Math.PI;
        System.out.println("PI = "+pi);
          
        
        double abs = Math.abs(x);
        System.out.println("Static double abs     : "+abs);
        
 
        
        int abs2 = Math.abs(x);
        System.out.println("Static int abs        : "+abs2);
        
        long abs3 = Math.abs(y);
        System.out.println("Static long abs       : "+abs3);
        
        double acos = Math.acos(x);
        System.out.println("Static double acos    : "+acos);
        
        int addExact = Math.addExact(c, d);
        System.out.println("Static int addExact   : "+addExact);
         
        long addExact1 = Math.addExact(a, b);
        System.out.println("Static long addExact  : "+addExact1);
        
        
        
        double atan = Math.atan(y);
        System.out.println("Static double atan    : "+atan);
        
        
        
        double cbrt = Math.cbrt(x);
        System.out.println("Static double cbrt    : "+cbrt);
        
        double ceil = Math.ceil(d);
        System.out.println("Static double ceil    : "+ceil);
                
        
        
        
        double asin = Math.asin(y);
        System.out.println("Static double asin    : "+asin);
        
        double atan2 = Math.atan2(c, d);
        System.out.println("Static double atan2   : "+atan2);
        
        double copySign = Math.copySign(atan2, asin);
        System.out.println("Static double copySign: "+copySign);
       
        
        
        
        double cos = Math.cos(y);
        System.out.println("Static double cos     : "+cos);
        
        double cosh = Math.cosh(a);
        System.out.println("Static double cos     : "+cosh);
        
        int decrementExact = Math.decrementExact(d);
        System.out.println("Static int decrementExact  : "+decrementExact);
        
        long decrementExact1 = Math.decrementExact(x);
        System.out.println("Static long decrementExact : "+decrementExact1);
        
        
        double exp = Math.exp(d);
        System.out.println("Static double exp     : "+exp);
        
        double expml = Math.expm1(d);
        System.out.println("Static double expml   : "+expml);
        
        double floor = Math.floor(d);
        System.out.println("Static double floor   : "+floor);
        
        int floorDiv = Math.floorDiv(c, y);
        System.out.println("Static int floorDiv   : "+floorDiv);
        
        
         long floorDiv1 = Math.floorDiv(b, y);
        System.out.println("Static long floorDiv  : "+floorDiv1);
        
        int floorMod = Math.floorDiv(x, y);
        System.out.println("Static int floorMod   : "+floorMod);
        
        long floorMod1 = Math.floorDiv(b, b);
        System.out.println("Static long floorMod  : "+floorMod1);
        
        int getExponent = Math.getExponent(d);
        System.out.println("Static int getExponent: "+getExponent);
        
        int getExponent1 = Math.getExponent(e);
        System.out.println("Static int getExponent: "+getExponent1);
        
        double hypot = Math.hypot(a, a);
        System.out.println("Static double hypot   : "+hypot);
        
        
        double IEEEremainder = Math.IEEEremainder(pi, pi);
        System.out.println("Static double IEEEremainder : "+IEEEremainder);
 
        int incrementExact = Math.incrementExact(d);
        System.out.println("Static int incrementExact   : "+incrementExact);
        
        long incrementExact1 = Math.incrementExact(a);
        System.out.println("Static long incrementExact  : "+incrementExact1);
        
        double log = Math.log(d);
        System.out.println("Static double log     : "+log);
        
        double log10 = Math.log10(d);
        System.out.println("Static double log10   : "+log10);
        
        double loglp = Math.log1p(d);
        System.out.println("Static double loglp   : "+loglp);
        
        double max = Math.max(d, d);
        System.out.println("Static double max     : "+max);
        
        
        
        float abs1 = Math.abs(y);
        System.out.println("Static float abs      : "+abs1);
        
        float copySign1 = Math.copySign(abs1, abs1);
        System.out.println("Static float copySign : "+copySign1);
        
        float max1 = Math.max(abs1, abs1);
        System.out.println("Static float max      : "+max1);
        
        int max2 = Math.max(d, d);
        System.out.println("Static int max        : "+max2);
        
        long max3 = Math.max(x, y);
        System.out.println("Static long max       : "+max3);
        
        double min = Math.min(d, d);
        System.out.println("Static double min     : "+min);
        
        
        float min1 = Math.min(max1, abs1);
        System.out.println("Static float min      : "+min1);
        
        int min2 = Math.min(x, y);
        System.out.println("Minimum number is     : "+min2);
        
        long min3 = Math.min(c, d);
        System.out.println("Static long min       : "+min3);
        
        int multiplyExact = Math.multiplyExact(c, d);
        System.out.println("Static int multiplyExact : "+multiplyExact);
        
        long multiplyExact1 = Math.multiplyExact(b, b);
        System.out.println("Static long multiplyExact: "+multiplyExact1);
        
        int negateExact = Math.negateExact(d);
        System.out.println("Static int negateExact   : "+negateExact);
        
        long negateExact1 = Math.negateExact(d);
        System.out.println("Static long negateExact  : "+negateExact1);
        
        double nextAfter = Math.nextAfter(atan2, min);
        System.out.println("Static double nextAfter  : "+nextAfter);
        
        float nextAfter1 = Math.nextAfter(max1, min);
        System.out.println("Static float nextAfter   : "+nextAfter1);
        
        double nextDown = Math.nextDown(e);
        System.out.println("Static double nextDown   : "+nextDown);
       
        float nextDown1 = Math.nextDown(min1);
        System.out.println("Static float nextDown    : "+nextDown1);
        
        double nextUp = Math.nextUp(e);
        System.out.println("Static double nextUp     : "+nextUp);
        
        float nextUp1 = Math.nextUp(min1);
        System.out.println("Static float nextUp      : "+nextUp1);
        
        double pow = Math.pow(d, d);
        System.out.println("Static double pow        : "+pow);
        
        double random = Math.random();
        System.out.println("Static double random     : "+random);
        
        double rint = Math.rint(d);
        System.out.println("Static double rint       : "+rint);
        
        long round = Math.round(d);
        System.out.println("Static long round        : "+round);
        
        int round1 = Math.round(max1);
        System.out.println("Static int round         : "+round1);
        
        double scalb = Math.scalb(e, addExact);
        System.out.println("Static double scalb      : "+scalb);
        
        float scalb1 = Math.scalb(min1, addExact);
        System.out.println("Static float scalb       : "+scalb1);
        
        
        double signum = Math.signum(e);
        System.out.println("Static double signum     : "+signum);
        
        float signum1 = Math.signum(min1);
        System.out.println("Static float signum      : "+signum1);
        
        double sin = Math.sin(e);
        System.out.println("Static double sin        : "+sin);
        
        double sinh = Math.sinh(e);
        System.out.println("Static double sinh       : "+sinh);
        
        double sqrt = Math.sqrt(e);
        System.out.println("Static double sqrt       : "+sqrt);
        
        int subtractExact = Math.subtractExact(c, d);
        System.out.println("Static int subtractExact : "+subtractExact);
        
        long subtractExact1 = Math.subtractExact(a, a);
        System.out.println("Static long subtracExact : "+subtractExact1);
        
        double tan = Math.tan(e);
        System.out.println("Static double tan        : "+tan);
        
        double tanh = Math.tanh(e);
        System.out.println("Static double tanh       : "+tanh);
        
        double toDegrees = Math.toDegrees(atan);
        System.out.println("Static double toDegrees  : "+toDegrees);
        
        int toIntExact = Math.toIntExact(max3);
        System.out.println("Static int toIntExact    : "+toIntExact);
        
        double toRadians = Math.toRadians(random);
        System.out.println("Static double toRadians  : "+toRadians);
        
        double ulp = Math.ulp(e);
        System.out.println("Static double ulp        : "+ulp);
        
        float ulp1 = Math.ulp(min1);
        System.out.println("Static float ulp         : "+ulp1);
	}

}
