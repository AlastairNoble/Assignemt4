
public class CommonNail extends Nail{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2391464720073466529L;
	// size, length, gauge, finish, price/unit, unit size
	public CommonNail(String siz, double l,double gua, String fin, double up, int us) throws IllegalFastener{
		super(siz, l, gua, fin, up, us);
		checkFinish(fin);
	}
	//test if finish is valid, set it in Fastener class though
	private void checkFinish(String fin) throws IllegalFastener{
		if(fin==null)
			throw new IllegalFastener("illegal finish null");
		if(!( fin.equalsIgnoreCase("bright")
			||fin.equalsIgnoreCase("got-dipped")
			||fin.equalsIgnoreCase("galvinized")))
				throw new IllegalFastener("illegal finish for common nail");
	}
	// string to summarize instance 
	public String toString() {
		return "Common Nail, " + this.nailString() + this.fastenerString();
		}
}
