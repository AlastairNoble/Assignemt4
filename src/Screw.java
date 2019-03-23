
public class Screw extends ThreadedFastener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4349657912644595373L;
	private String head;
	private String drive;
	private double length;
	

				//length, thread,  material, finish, head, drive, price/unit, unit size
	public Screw(double l, String di, String mat, String fin, String h, String dr, double up, int us) throws IllegalFastener{
		super(di, mat, fin, up, us);
		setHead(h);
		setDrive(dr);
		setLength(l);
	}
	
	
	private void setHead(String h) throws IllegalFastener {
		if(h==null)
			throw new IllegalFastener("illegal head null");
		if(!(h.equalsIgnoreCase("Bulge")
			|| h.equalsIgnoreCase("flat")
			|| h.equalsIgnoreCase("oval")
			|| h.equalsIgnoreCase("round")
			|| h.equalsIgnoreCase("pan")))
			throw new IllegalFastener("illegal head");
		this.head=h;
	}
	private void setDrive(String dr) throws IllegalFastener {
		if(dr==null)
			throw new IllegalFastener("illegal drive null");
		if(!(dr.equalsIgnoreCase("6-lobe")
			|| dr.equalsIgnoreCase("philips")
			|| dr.equalsIgnoreCase("slotted")
			|| dr.equalsIgnoreCase("square")))
			throw new IllegalFastener("illegal drive");
		this.drive=dr;
	}
	
	private void setLength(double l) throws IllegalFastener{
		double temp = l;
		if (temp>=.5 && temp<=6) {
			temp *= 100;
			if (temp%25 != 0) 
				throw new IllegalFastener("illegal length  (found between 1/2\" and 6\")");
		}else if (temp>6 && temp<=11) {
			temp *= 10;
			if (temp%5 != 0) 
				throw new IllegalFastener("illegal length (found between 6\" and 11\")");
		}else if (temp>11 && temp <=20) {
			if (temp%1 != 0)
				throw new IllegalFastener("illegal length (found between 11\" and 20\")");
		}else if (temp<.5 || temp>20)
			throw new IllegalFastener("Illegal lenget (outside 1/2\" - 20\")");
		
		this.length=l;			
	}
	// string used by extensions of Screw
	public String screwString() {
		 return this.head + " head, "+  this.drive + " drive, " + this.length + " long, ";
	}
	
}
	