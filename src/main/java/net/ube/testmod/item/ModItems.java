package net.ube.testmod.item;

import joptsimple.internal.Rows;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SWORD3 = registerItem("sword3",
            new SwordItem(ModToolMaterial.SWORD3, 50, 20f, new FabricItemSettings()));
    public static final Item SHIELD = registerItem("shield",
            new ShieldItem(new FabricItemSettings().maxCount(1)));

    private static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(SWORD3);
        entries.add(RUBY_STAFF);
        entries.add(SHIELD);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.info("Registering Mod Items for "+ TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);

    }

}
