package cyber.crystal.init;

import com.sun.org.apache.xpath.internal.operations.Variable;

import cyber.crystal.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class CrystalItems {
	
	public static Item fire_crystal;
	public static Item water_crystal;
	public static Item air_crystal;
	public static Item earth_crystal;
	public static Item unstable_crystal;
	
	
	public static void init()
	{
		fire_crystal = new Item().setUnlocalizedName("fire_crystal");
		water_crystal = new Item().setUnlocalizedName("water_crystal");
		air_crystal = new Item().setUnlocalizedName("air_crystal");
		earth_crystal = new Item().setUnlocalizedName("earth_crystal");
		unstable_crystal = new Item().setUnlocalizedName("unstable_crystal");
	}
	public static void register()
	{
		GameRegistry.registerItem(fire_crystal, fire_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(water_crystal, water_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(air_crystal, air_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earth_crystal, earth_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(unstable_crystal, unstable_crystal.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(fire_crystal);
		registerRender(water_crystal);
		registerRender(air_crystal);
		registerRender(earth_crystal);
		registerRender(unstable_crystal);
	}
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}	

