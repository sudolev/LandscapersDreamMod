package systems.alexander.morefoliage.Items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import systems.alexander.morefoliage.MoreFoliage;
import systems.alexander.morefoliage.blocks.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFoliage.MODID);

    public static final RegistryObject<Item> SOUR_BERRY = ITEMS.register("sour_berry",
            () -> new BlockItem(ModBlocks.SOUR_BERRY_BUSH.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> SOUR_BERRY_JAM = ITEMS.register("sour_berry_jam",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

}
