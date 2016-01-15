package cyber.crystal;

import cyber.crystal.init.CrystalItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CrystalTab extends CreativeTabs {

	public CrystalTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return CrystalItems.fire_crystal;
	}

}
