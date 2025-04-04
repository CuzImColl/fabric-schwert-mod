package net.cuzimcoll.schwertmod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class ModToolsMaterials implements ToolMaterial {

    public static final ModToolsMaterials SAPPHIRE = new ModToolsMaterials();

    @Override
    public int getDurability() {
        return 1850;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5f;
    }

    @Override
    public float getAttackDamage() {
        return 4f;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SAPPHIRE_GEM);
    }
}

