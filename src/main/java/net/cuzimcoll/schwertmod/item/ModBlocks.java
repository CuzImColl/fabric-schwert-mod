package net.cuzimcoll.schwertmod.item;

import net.cuzimcoll.schwertmod.SchwertMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    @SuppressWarnings("unused")
    public static final Block SAPPHIRE_BLOCK = register("sapphire_block", new Block(AbstractBlock.Settings.create()), true);

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