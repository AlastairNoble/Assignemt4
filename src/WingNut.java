
public class WingNut extends InnerThreaded{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4347416424634481774L;

	// thread,  material, finish, price/unit, unit size
	public WingNut(String di, String mat, String fin, double up, int us) throws IllegalFastener{
		super(di, mat, fin, up, us);
	}
	// string to summarize instance 
	public String toString() {
		return "Wing Nut, " + this.threadString() + this.fastenerString();
	}
}