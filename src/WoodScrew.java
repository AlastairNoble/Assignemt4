
public class WoodScrew extends Screw{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2179852128888486868L;
	private String point;

	// length, thread,  material, finish, head, drive, point, price/unit, unit size
	public WoodScrew(double l,String di, String m, String f, String h, String dr, String p, double up, int npu) throws IllegalFastener{
		super(l,di,m,f,h,dr,up,npu);
		setPoint(p);
	}

	private void setPoint(String p) throws IllegalFastener{
		if( p==null 
			|| !( p.equalsIgnoreCase("double cut")
			|| p.equalsIgnoreCase("sharp")
			|| p.equalsIgnoreCase("type 17")))
				throw new IllegalFastener("illegal point");
		this.point=p;
	}
	// string to summarize instance 
	public String toString() {
		return "Wood Screw, " + this.point + " point, " + this.screwString() + this.threadString() + this.fastenerString();
	}
	
}