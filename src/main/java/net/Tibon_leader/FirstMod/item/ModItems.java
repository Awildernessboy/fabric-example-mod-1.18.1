package net.Tibon_leader.FirstMod.item;

import net.Tibon_leader.FirstMod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item Black_Iron_Ingot = registerItem("black_iron_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item Black_Iron_Nugget = registerItem("black_iron_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item Raw_Black_Iron = registerItem("raw_black_iron",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.Mod_ID, name ), item);
    }

    public static void registerModItems(){
        FirstMod.LOGGER.info("Registering MOd Items for " + FirstMod.Mod_ID);
    }
}
