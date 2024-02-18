package net.ube.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModItemsGroups2 {
    public static final ItemGroup SWORD2_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID,  "sword2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup2.sword2"))
                    .icon(() -> new ItemStack(ModItems.SWORD2)).entries((displayContext, entries) -> {
        entries.add(ModItems.SWORD2);
        entries.add(ModItems.RAW_SWORD2);
    }).build());

    public static void registerItemGroups(){
        TestMod.LOGGER.info("Registering Item Groups for " +TestMod.MOD_ID);
    }
}
