package net.cuzimcoll.schwertmod.block;

import net.cuzimcoll.schwertmod.SchwertMod;
import net.cuzimcoll.schwertmod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    @SuppressWarnings("unused")
    // Blocks
    public static final Block SAPPHIRE_BLOCK = register("sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)),
            true);

    public static final Block SAPPHIRE_ORE = register("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)),
            true);


    @SuppressWarnings("SameParameterValue")
    private static <T extends Block> T register(String name, T entry, boolean registerDefaultItem) {
        T registeredBlock = Registry.register(Registries.BLOCK, SchwertMod.getID(name), entry);

        if (registerDefaultItem) {
            BlockItem blockItem = Registry.register(Registries.ITEM, SchwertMod.getID(name), new BlockItem(entry, new Item.Settings()));

            ModItems.ALL_ITEMS.add(blockItem.getDefaultStack());
        }

        return registeredBlock;
    }

    public static void initialize() {
    }
}