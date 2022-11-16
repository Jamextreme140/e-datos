public class Main {

	public static String IoS( int n ) {
	    if ( n == 0 ) {
	        return "0";
	    } else if ( n < 0 ) {
	        return "-" + IoS( -n );
	    } else if ( n < 10 ) {
	        return "" + (n%10);
	    } else {
	        return IoS(n/10) + (n%10);
	    }
	}
	
	public static void main(String[] args) {
		int a = 20;
		System.out.println(IoS(a));
	}
}
