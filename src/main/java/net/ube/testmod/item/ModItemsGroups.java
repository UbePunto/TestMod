package net.ube.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModItemsGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY_STAFF);
                        entries.add(ModItems.SWORD3);
                        entries.add(ModItems.SHIELD);

                    }).build());

    public static void registerItemGroups(){
        TestMod.LOGGER.info("Registering Item Groups for " +TestMod.MOD_ID);
    }
    public static final ItemGroup SWORD3_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "sword3"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SWORD3);

                    }).build());

    }