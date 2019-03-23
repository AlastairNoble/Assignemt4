import java.io.Serializable;

public class Fastener implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1431006136224700522L;
	private double unitPrice;
	private int unitSize;
	private String material;
	private String finish;
	
	// constructor 
	public Fastener(String mat, String fin, double up, int us) throws IllegalFastener{
		setUnitPrice(up);
		setUnitSize(us);
		setMaterial(mat);
		setFinish(fin);		
	}
	private void setUnitPrice(double up) throws IllegalFastener{
		if (up<=0) {
			throw new IllegalFastener("illegal Unit Price ");
		}
		this.unitPrice=up;
	}
	private void setUnitSize(int us) throws IllegalFastener{
		if(us<1 || us>10000)
			throw new IllegalFastener("illegal unit size");
		this.unitSize=us;
	}
	
	private void setMaterial(String mat) throws IllegalFastener{
		if(mat==null)
			throw new IllegalFastener("illegal material null");
		if(!(mat.equalsIgnoreCase("Brass")
		|| mat.equalsIgnoreCase("Stainless Steel")
		|| mat.equalsIgnoreCase("Steel")))
			throw new IllegalFastener("illegal material");
		this.material=mat;
	}
	private void setFinish(String fin) throws IllegalFastener{
		this.finish=fin;
	}
	// returns total cost of the order for a certain number of units ordered
	public double getOrderCost(int numUnits) {
		return (double) this.unitPrice*numUnits;
	}
	
	//string used for individual toString methods in extenetions of Fastener
	public String fastenerString() {
		return this.material + ", with a "+this.finish + " finish. " + this.unitSize + 
				" in a unit, $"+this.unitPrice + " per unit";
	}
	
}