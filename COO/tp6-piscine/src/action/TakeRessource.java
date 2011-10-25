package action;

import ressource.RessourceManager;
import ressource.RessourceUser;

public class TakeRessource<R> extends RessourceAction<R>
{
	public TakeRessource(String msg, RessourceManager<R> manager,RessourceUser<R> user)
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo()
	{
		R res  = this.manager.giveRessource();
		if (res != null)
		{
			this.user.setRessource(res);
			this.canStop = true;
		}
		else
			System.out.println("inToDo -> takeRess -> no ressource available");
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
