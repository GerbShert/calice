package com.gerbshert.cotv.items;

import com.gerbshert.cotv.Chalice;
import com.gerbshert.cotv.client.ChaliceTab;
import com.gerbshert.cotv.libraries.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gabriel on 14-Dec-16.
 */
public class ChaliceItems {
    //Create Item
    public static Item chaliceSea = new ChaliceSea().setCreativeTab(Chalice.chaliceTab);
    public static Item chaliceVoid = new ChaliceVoid().setCreativeTab(Chalice.chaliceTab);
    public static Item itemSeaPearl = new Item().setUnlocalizedName(Strings.MOD_ID + "." + "itemSeaPearl").setRegistryName(Strings.MOD_ID, "itemSeaPearl").setCreativeTab(Chalice.chaliceTab);
    public static Item itemVoidPearl = new Item().setUnlocalizedName(Strings.MOD_ID + "." + "itemVoidPearl").setRegistryName(Strings.MOD_ID, "itemVoidPearl").setCreativeTab(Chalice.chaliceTab);

    //Register Item
    public static void registerItems() {
        GameRegistry.register(chaliceSea);
        GameRegistry.register(chaliceVoid);
        GameRegistry.register(itemSeaPearl);
        GameRegistry.register(itemVoidPearl);
    }

    //Register Item Recipes
    public static void registerItemsRecipes() {
        GameRegistry.addRecipe(new ItemStack(chaliceSea, 1), "ioi", " i ", "iii", Character.valueOf('i'), Items.GOLD_INGOT, Character.valueOf('o'), itemSeaPearl);
        GameRegistry.addRecipe(new ItemStack(chaliceVoid, 1), "ioi", " i ", "iii", Character.valueOf('i'), Items.GOLD_INGOT, Character.valueOf('o'), itemVoidPearl);
        GameRegistry.addRecipe(new ItemStack(itemSeaPearl, 1), " x ", "xox", " x ", Character.valueOf('x'), Blocks.OBSIDIAN, Character.valueOf('o'), Items.ENDER_PEARL);
        GameRegistry.addRecipe(new ItemStack(itemVoidPearl, 1), " x ", "xox", " x ", Character.valueOf('x'), Blocks.LAPIS_BLOCK, Character.valueOf('o'), Items.ENDER_PEARL);
        //GameRegistry.addRecipe(new ItemStack(toolChalice,1),"ioi"," i ","iii",Character.valueOf('i'), "ingotBrass",Character.valueOf('o'), itemVoidPearl);
    }

    //Render Item
    public static void renderItems() {
        renderMe(chaliceSea);
        renderMe(chaliceVoid);
        renderMe(itemSeaPearl);
        renderMe(itemVoidPearl);
    }

    public static void renderMe(Item myItem) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myItem, 0, new ModelResourceLocation(myItem.getRegistryName(), "inventory"));
    }
}