package oie;

/**
 * @author  lepan
 * the Board on witch we will play
 */
public abstract class Board 
{
	/** the number of cells of the board */
	protected final int nbOfCells;
	
	/** the cells that compose the board */
	protected Cell theCells[];
	
	public Board(int noc)
	{
		this.nbOfCells = noc;
		theCells = new Cell[noc];
		initBoard();
	}
	
	/**
	 * the initialization of the board 
	 */
	protected abstract void initBoard();
	
	/**
	 * @param index the index of the cell you want to get
	 * @return the cell at this index
	 */
	public Cell getCell(int index)
	{
		return this.theCells[index];
	}
	
	/**
	 * @return the number of cells
	 */
	public int getNbOfCells()
	{
		return this.nbOfCells;
	}
}
