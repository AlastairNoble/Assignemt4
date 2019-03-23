
public class ThreadedFastener extends Fastener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3957426517170801538L;
	private String diameter;
	
	// thread,  material, finish, price/unit, unit size
	public ThreadedFastener(String di, String mat, String fin, double up, int us) throws IllegalFastener{
		super(mat, fin, up, us);
		setDiameter(di);
		checkFinish(fin, mat);
	}
	
	
	private void checkFinish(String fin, String mat) throws IllegalFastener{
		if(mat==null)
			throw new IllegalFastener("illegal finish null");
		if(( mat.equalsIgnoreCase("brass")
			||mat.equalsIgnoreCase("stainless steel"))
			&& !(fin.equalsIgnoreCase("plain")))
			throw new IllegalFastener("illegal finish with" + mat);
		
		if(mat.equalsIgnoreCase("steel")) {
			if (fin.equalsIgnoreCase("Chrome")
				|| fin.equalsIgnoreCase("Plain")
				|| fin.equalsIgnoreCase("Hot Dipped Galvanized")
				|| fin.equalsIgnoreCase("Yellow Zinc")
				|| fin.equalsIgnoreCase("Zinc")
				|| (this instanceof Screw 
				&& (fin.equalsIgnoreCase("ACQ 1000 Hour")
				|| fin.equalsIgnoreCase("Lubricated")
				|| fin.equalsIgnoreCase("Black Phosphate"))	)) {
				//do nothing
			}
			else throw new IllegalFastener("illegal Finish with" + mat);
					
		}			
	}
	
	
	private void setDiameter(String di) throws IllegalFastener{
		if(di==null)
			throw new IllegalFastener("illegal diameter null");
		if(!(di.equalsIgnoreCase("#8-13")
			|| di.equalsIgnoreCase("#8-15")
			|| di.equalsIgnoreCase("#8-32")
			|| di.equalsIgnoreCase("#10-13")
			|| di.equalsIgnoreCase("#10-24")
			|| di.equalsIgnoreCase("#10-32")
			|| di.equalsIgnoreCase("1/4-20")
			|| di.equalsIgnoreCase("5/16-18")
			|| di.equalsIgnoreCase("3/8-16")
			|| di.equalsIgnoreCase("7/16-14")
			|| di.equalsIgnoreCase("1/2-13")
			|| di.equalsIgnoreCase("5/8-11")
			|| di.equalsIgnoreCase("3/4-10")
			))
			throw new IllegalFastener("illegal diameter");
		this.diameter=di;
	}
	
	public String threadString() {
		return this.diameter + " thread, ";
	}
		
}
