package cyber.crystal.init;
import cyber.crystal.CrystalMod;
import cyber.crystal.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CrystalBlocks {
	
	public static Block f_crystal_ore;
	public static Block w_crystal_ore;
	public static Block e_crystal_ore;
	public static Block a_crystal_ore;
	public static Block u_crystal_ore;
	
	
	public static void init()
	{
		f_crystal_ore = new Block(Material.rock).setUnlocalizedName("f_crystal_ore").setCreativeTab(CrystalMod.tabCrystal);
		w_crystal_ore = new Block(Material.rock).setUnlocalizedName("w_crystal_ore").setCreativeTab(CrystalMod.tabCrystal);
		e_crystal_ore = new Block(Material.rock).setUnlocalizedName("e_crystal_ore").setCreativeTab(CrystalMod.tabCrystal);
		a_crystal_ore = new Block(Material.rock).setUnlocalizedName("a_crystal_ore").setCreativeTab(CrystalMod.tabCrystal);
		u_crystal_ore = new Block(Material.rock).setUnlocalizedName("u_crystal_ore").setCreativeTab(CrystalMod.tabCrystal);
	}
	public static void register()
	{
		GameRegistry.registerBlock(f_crystal_ore, f_crystal_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(w_crystal_ore, w_crystal_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(e_crystal_ore, e_crystal_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(a_crystal_ore, a_crystal_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(u_crystal_ore, u_crystal_ore.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(f_crystal_ore);
		registerRender(w_crystal_ore);
		registerRender(e_crystal_ore);
		registerRender(a_crystal_ore);
		registerRender(u_crystal_ore);
	}
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
