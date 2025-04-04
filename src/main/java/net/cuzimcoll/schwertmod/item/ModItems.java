package net.cuzimcoll.schwertmod.item;

import net.cuzimcoll.schwertmod.SchwertMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import net.minecraft.item.SwordItem;
import static net.cuzimcoll.schwertmod.item.ModToolsMaterials.SAPPHIRE_TOOL_MATERIAL;


public class ModItems {
    public static final RegistryKey<ItemGroup> SCHWERT_MOD_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(SchwertMod.MOD_ID, "item_group"));
    public static final ItemGroup SCHWERT_MOD_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SAPPHIRE_SWORD))
            .displayName(Text.translatable("itemGroup.schwertmod"))
            .build();

    //Items
    public static final Item SAPPHIRE_GEM = register("sapphire_gem", Item::new, new Item.Settings());
    public static final Item SAPPHIRE_SWORD = register("sapphire_sword", Item::new, new Item.Settings());

    //Tools
    public static final Item SAPPHIRE_AXE = register(
            "sapphire_axe",
            settings -> new AxeItem(SAPPHIRE_TOOL_MATERIAL, 5.5f, -3f, settings),
            new Item.Settings());

    public static final Item SAPPHIRE_SWORD = register(
            "sapphire_sword",
            settings -> new SwordItem(SAPPHIRE_TOOL_MATERIAL, 5.5f, -3f, settings),
            new Item.Settings());

    //Armor


    private static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SchwertMod.MOD_ID, name));

        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }



    public static void registerModItems() {
        Registry.register(Registries.ITEM_GROUP, SCHWERT_MOD_GROUP_KEY, SCHWERT_MOD_GROUP);

        ItemGroupEvents.modifyEntriesEvent(SCHWERT_MOD_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SAPPHIRE_GEM);
            itemGroup.add(ModItems.SAPPHIRE_SWORD);
            itemGroup.add(ModItems.SAPPHIRE_AXE);
        });
    }
}
