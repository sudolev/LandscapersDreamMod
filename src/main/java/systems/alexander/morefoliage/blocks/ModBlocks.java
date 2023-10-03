package systems.alexander.morefoliage.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import systems.alexander.morefoliage.MoreFoliage;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreFoliage.MODID);

    public static final RegistryObject<BerryBushBlock> DEWBERRY_BUSH = BLOCKS.register("dewberry_bush",
            () -> new BerryBushBlock(BlockBehaviour.Properties.of(Material.PLANT)));

}
