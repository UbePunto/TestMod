package net.ube.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModBlocks {
    public static final Block ACERO_BLOCK = registerBlock("acero_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block){

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID,name), block);

    }

    public static Item registerBlockItem(String name, Block block){

        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks(){

        TestMod.LOGGER.info("Registrando bloques" + TestMod.MOD_ID);

    }

}
