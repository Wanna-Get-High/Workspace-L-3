package action;

import ressource.*;

public class LiberateRessource<R extends Ressource> extends RessourceAction<R> 
{
	public LiberateRessource(String msg, RessourceManager<R> manager,RessourceUser<R> user) 
	{
		super(msg, manager, user);
	}

	@Override
	public void inToDo()
	{
		if (user.getRessource() != null)
		{
			this.manager.libRessource(user.getRessource());
			this.canStop = true;
		}
		System.out.print(this.msg);
	}

	@Override
	protected boolean stopCondition() 
	{
		return this.canStop;
	}
}
