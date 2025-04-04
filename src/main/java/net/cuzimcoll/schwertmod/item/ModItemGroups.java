package net.cuzimcoll.schwertmod.item;

import net.cuzimcoll.schwertmod.SchwertMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> SCHWERT_MOD = register("schwert_mod", FabricItemGroup.builder()
            .icon(ModItems.SAPPHIRE_GEM::getDefaultStack)
            .displayName(Text.translatable("itemGroup.schwertmod.schwert_mod")).build());

    static {
        ItemGroupEvents.modifyEntriesEvent(SCHWERT_MOD).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAll(ModItems.ALL_ITEMS);
        });
    }

    private static RegistryKey<ItemGroup> register (String name, ItemGroup group) {
        Identifier identifier = SchwertMod.getID(name);
        Registry.register(Registries.ITEM_GROUP, identifier, group);

        return RegistryKey.of(Registries.ITEM_GROUP.getKey(), identifier);
    }

    public static void initialize () {

    }
}
