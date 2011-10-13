package oie;

public class Board 
{
	protected final int nbOfCells;
	protected Cell theCells[];
	
	public Board(int noc)
	{
		this.nbOfCells = noc;
		theCells = new Cell[noc];
		initBoard();
	}
	
	protected void initBoard()
	{
		for (int i = 0 ; i<  nbOfCells;i++)
		{
			if ( i%9 == 0 && i != 0)
				theCells[i] = new GooseCell(i);
			/*
			else if (i == 31 || i == 52 )
				theCells[i] = new TrapCell(i);
			
			else if (i == 19)
				theCells[i] = new WaitCell(i);
			
			else if (i == 6  || i == 42 || i == 58 )
				theCells[i] = new TeleportCell(i);
			*/
			else theCells[i] = new NormalCell(i);
		}
	}
	
	public Cell getCell(int num)
	{
		return this.theCells[num];
	}
	
	public int getNbOfCells()
	{
		return this.nbOfCells;
	}
	
	public String toString()
	{
		String CellsPrint = "";
		for (int i=0 ; i<nbOfCells;i++)
		{
			if (theCells[i].getPlayer() != null)
			{
				CellsPrint += "[" + theCells[i].getPlayer().toString() + "] ";
			}
			else
			{
				CellsPrint += "[] ";
			}	
		}
		return CellsPrint;
	}
}
