package cyber.crystal;

import cyber.crystal.init.CrystalBlocks;
import cyber.crystal.init.CrystalItems;
import cyber.crystal.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CrystalMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CrystalTab tabCrystal = new CrystalTab("tabCrystal");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CrystalBlocks.init();
		CrystalBlocks.register();
		CrystalItems.init();
		CrystalItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
				
	}
}
