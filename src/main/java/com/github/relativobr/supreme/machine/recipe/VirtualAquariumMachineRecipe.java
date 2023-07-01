package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VirtualAquariumMachineRecipe extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public VirtualAquariumMachineRecipe(ItemStack input, ItemStack[] result) {
    super(Supreme.getSupremeOptions().getBaseTimeVirtualAquarium(), new ItemStack[]{input}, result);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f2%機率獲得&b海綿"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f2%機率獲得&b海晶燈"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%機率獲得&b鱈魚"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%機率獲得&b鮭魚"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%機率獲得&b熱帶魚"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%機率獲得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f6%機率獲得&b鸚鵡螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f5%機率獲得&b木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f5%機率獲得&b線"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f10%機率獲得&b海綿"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f10%機率獲得&b海晶燈"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%機率獲得&b鱈魚"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%機率獲得&b鮭魚"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%機率獲得&b熱帶魚"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%機率獲得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%機率獲得&b鸚鵡螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%機率獲得&b木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%機率獲得&b線"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f1%機率獲得&b海綿"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f1%機率獲得&b海晶燈"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f3%機率獲得&b鱈魚"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f3%機率獲得&b鮭魚"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f2%機率獲得&b熱帶魚"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f2%機率獲得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f5%機率獲得&b鸚鵡螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f50%機率獲得&bS木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f33%機率獲得&b線"));
    displayRecipes.add(new ItemStack(Material.STRING));
    return displayRecipes;
  }

}
