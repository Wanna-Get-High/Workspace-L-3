package action;

import java.util.NoSuchElementException;

import ressource.*;

public class TakeRessource<R extends Ressource> extends RessourceAction<R>
{
	public TakeRessource(String msg, RessourceManager<R> manager,RessourceUser<R> user)
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo()
	{
		R res;
		try{
			res = this.manager.giveRessource();
			this.user.setRessource(res);
			this.canStop = true;
			System.out.println(this.msg);
		} 
		catch(NoSuchElementException e)
		{
			System.out.print(" - no ressource available \n");
		}
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
