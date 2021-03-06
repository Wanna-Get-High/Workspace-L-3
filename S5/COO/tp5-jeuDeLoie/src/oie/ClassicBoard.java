package oie;


public class ClassicBoard extends Board
{
	public ClassicBoard(int noc)
	{
		super(noc);
	}
	
	@Override
	public void initBoard()
	{
		for (int i = 0 ; i<  this.nbOfCells;i++)
		{
			if (i == 0)
				theCells[i] = new StartCell(i);
			
			else if ( i%9 == 0 && i != 63) theCells[i] = new GooseCell(i,this);
			
			else if (i == 31 || i == 52 ) theCells[i] = new TrapCell(i,this);
			
			else if (i == 19) theCells[i] = new WaitCell(i,2,this);
			
			else if (i == 6) theCells[i] = new TeleportCell(i,12,this);
			
			else if (i == 42) theCells[i] = new TeleportCell(i,30,this);
				
			else if (i == 58) theCells[i] = new TeleportCell(i,1,this);
			
			else theCells[i] = new BasicCell(i,this);
		}
		
	}
	
	public String toString()
	{
		String CellsPrint = "[" + theCells[0].toString() + "] ";
		
		for (int i=1 ; i<nbOfCells;i++)
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
