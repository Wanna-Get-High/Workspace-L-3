package oie;

/**
 * Interface for the cells of the "jeu de l'oie" game. <br/> Note that there can be only  one player by cell, the starting cell (index 0) excepted.
 */
public abstract class Cell 
{
	/**
	 * @uml.property  name="index"
	 */
	protected int index;
	/**
	 * @uml.property  name="player"
	 * @uml.associationEnd  
	 */
	protected Player player;

	public Cell(int ind)
	{
		this.index = ind;
	}
	/**
	 * returns the index of this cell
	 * @uml.property  name="index"
	 */
	public int getIndex()
	{
		return this.index;
	}

	/** returns <tt>true</tt> if a player is in this cell */
	public boolean isBusy()
	{
		return this.player != null;
	}

	/**
	 * sets a player in this cell
	 * @uml.property  name="player"
	 */
	public void setPlayer(Player player)
	{
		this.player = player;
	}
	/**
	 * gets the player in this cell <tt>null</tt> if none
	 * @uml.property  name="player"
	 */
	public Player getPlayer()
	{
		return this.player;
	}
	
	/**
	 * @return <tt>true</tt> if and only if the player in this cell can freely leaves the cell, else
	 * he must wait for another player to reach this cell or wait a given number of turns
	 */
	public abstract boolean canBeLeft();
	/**
	 * returns the index of the cell really reached by a player when he reaches this cell
	 * @param diceThrow the result of the dices when the player reaches this cell
	 * @return the index of the cell effectively reached when a player reaches this cell after the
	 *         given throw of dices
	 */
	public abstract int consequence(int diceThrow);
	
}// Cell
