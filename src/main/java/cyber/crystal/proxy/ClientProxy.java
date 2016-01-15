package cyber.crystal.proxy;

import cyber.crystal.init.CrystalBlocks;
import cyber.crystal.init.CrystalItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		CrystalBlocks.registerRenders();
		CrystalItems.registerRenders();
	}

}
