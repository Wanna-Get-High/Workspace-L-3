package oie;

public abstract class Board 
{
	/** the cells that compose the board */
	protected Cell theCells[];
	
	/** the number of cells*/
	protected int nbOfCells;
	
	public Board(int noc)
	{
		this.nbOfCells = noc;
		this.theCells = new Cell[noc];
		this.initBoard();
	}
	
	/** Initialize the board */
	public abstract void initBoard();
	
	/**
	 * 
	 * @param index the index of the cell we want to have
	 * @return the cell on this index
	 */
	public Cell getCell(int index)
	{
		return this.theCells[index];
	}
	/**
	 * 
	 * @return the number of cells
	 */
	public int getNbOfCells()
	{
		return this.nbOfCells;
	}
}
