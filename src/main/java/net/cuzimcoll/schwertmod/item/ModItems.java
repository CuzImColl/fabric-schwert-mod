package net.cuzimcoll.schwertmod.item;

import net.cuzimcoll.schwertmod.SchwertMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
public class ModItems {
    public static final List<ItemStack> ALL_ITEMS = new ArrayList<>();


    //Items
    public static final Item SAPPHIRE_GEM = register("sapphire_gem", new Item(new Item.Settings()));
    public static final Item SAPPHIRE_DUST = register("sapphire_dust", new Item(new Item.Settings()));

    //Tools
    public static final SwordItem SAPPHIRE_SWORD = register(
            "sapphire_sword", new SwordItem(ModToolsMaterials.SAPPHIRE, new Item.Settings().maxCount(1)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolsMaterials.SAPPHIRE,
                            4,
                            -2.4F))));

    public static final AxeItem SAPPHIRE_AXE = register(
            "sapphire_axe", new AxeItem(ModToolsMaterials.SAPPHIRE, new Item.Settings().maxCount(1)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolsMaterials.SAPPHIRE, 6, -2.4F))));


    //Armor Items

    private static <T extends Item> T register(String name, T entry) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SchwertMod.MOD_ID, name));

        Registry.register(Registries.ITEM, itemKey, entry);

        ALL_ITEMS.add(entry.getDefaultStack());

        return entry;
    }

    public static void initialize() {

    }
}
