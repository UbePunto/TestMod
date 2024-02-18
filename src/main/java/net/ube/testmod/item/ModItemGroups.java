package net.ube.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;
import net.ube.testmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup GRUPO_RUBI = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID,"acero"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.acero"))
                    .icon(() ->new ItemStack(ModItems.ACERO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ACERO);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.ACERO_BLOCK);
                    }).build());


    public static void registerItemGroups(){

        TestMod.LOGGER.info("Registrando items" + TestMod.MOD_ID);

    }

}
