
public class Nail extends Fastener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 842566931209392045L;
	private String size;
	private double guage;
	private double length;
	
	// size, length, gauge, finish, price/unit, unit size
	public Nail(String siz, double l,double gua, String fin, double up, int us) throws IllegalFastener{
		super("steel", fin, up, us);
		setSize(siz);
		setGuage(gua);
		setLength(l);
	}
	
	private void setSize(String siz) throws IllegalFastener{
		if(siz ==null
			|| !(siz.equalsIgnoreCase("6d")
			|| siz.equalsIgnoreCase("8d")
			|| siz.equalsIgnoreCase("12d")
			|| siz.equalsIgnoreCase("16d")
			|| siz.equalsIgnoreCase("60d")
			|| siz.equalsIgnoreCase("10d")))
			throw new IllegalFastener("illegal size");
		this.size=siz;
	}
	
	private void setGuage(double gua) throws IllegalFastener{
		if(!( gua==2||gua==8||gua==9||gua==10.25||gua==11.5))
			throw new IllegalFastener("illegal guage");
		this.guage=gua;
	}
	
	private void setLength(double l) throws IllegalFastener {
		if (!( l==2||l==2.5||l==3
 			 ||l==6||l==3.5||l==3.25))
			throw new IllegalFastener("illegal length");
		this.length=l;			
	}
	// string to used by extension of Nail
	public String nailString() {
		return this.size + "size, " + this.length + "\" long, " + this.guage + " guage, ";
	}
}
