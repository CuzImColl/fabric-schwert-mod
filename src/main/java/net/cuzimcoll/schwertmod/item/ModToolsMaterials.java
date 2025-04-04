package net.cuzimcoll.schwertmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import static net.cuzimcoll.schwertmod.item.ModItems.SCHWERT_MOD_GROUP;
import static net.cuzimcoll.schwertmod.item.ModItems.SCHWERT_MOD_GROUP_KEY;
import static net.minecraft.item.Items.register;

public class ModToolsMaterials {
    public static final ToolMaterial SAPPHIRE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1800,
            8.0F,
            3.0F,
            10,
            ItemTags.DIAMOND_TOOL_MATERIALS);
}


