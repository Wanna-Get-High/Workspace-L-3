package oie;

/**
 * @author  lepan
 */
public abstract class Board 
{
	/**
	 * @uml.property  name="nbOfCells"
	 */
	protected final int nbOfCells;
	/**
	 * @uml.property  name="theCells"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	protected Cell theCells[];
	
	public Board(int noc)
	{
		this.nbOfCells = noc;
		theCells = new Cell[noc];
		initBoard();
	}
	
	protected abstract void initBoard();
	
	public Cell getCell(int num)
	{
		return this.theCells[num];
	}
	
	/**
	 * @return
	 * @uml.property  name="nbOfCells"
	 */
	public int getNbOfCells()
	{
		return this.nbOfCells;
	}
}
