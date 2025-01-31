package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreLife {

  public static final SlimefunItemStack RESOURCE_CORE_POTATO = new SupremeItemStack("SUPREME_CORE_POTATO",
      "cf4624ebf7d419a11e43ed0c2038d32cd09ad1d7a6c6e20f6339cbcfe386fd1c", "&a至尊馬鈴薯", "", "&7超級馬鈴薯",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_POTATO = new CustomCoreRecipe(RESOURCE_CORE_POTATO,
      Material.HONEY_BOTTLE, Material.POTATO);

  public static final SlimefunItemStack RESOURCE_CORE_APPLE = new SupremeItemStack("SUPREME_CORE_APPLE",
      "4abd703e5b8c88d4b1fcfa94a936a0d6a4f6aba44569663d3391d4883223c5", "&a至尊蘋果", "", "&7超級蘋果", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_APPLE = new CustomCoreRecipe(RESOURCE_CORE_APPLE,
      Material.HONEY_BOTTLE, Material.APPLE);

  public static final SlimefunItemStack RESOURCE_CORE_BEETROOT = new SupremeItemStack("SUPREME_CORE_BEETROOT",
      "18f36ea228c4fd9afed5add6d0526de71b7ac0559eabfc2f60de6c4aa733f5", "&a至尊甜菜根", "", "&7超級甜菜根",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BEETROOT = new CustomCoreRecipe(RESOURCE_CORE_BEETROOT,
      Material.HONEY_BOTTLE, Material.BEETROOT);

  public static final SlimefunItemStack RESOURCE_CORE_WHEAT = new SupremeItemStack("SUPREME_CORE_WHEAT",
      "2c680149ad17e46fbbf7606b284cc83a03b1a67cd8a52717b44bfa3ad5914f14", "&a至尊小麥", "", "&7超級小麥", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WHEAT = new CustomCoreRecipe(RESOURCE_CORE_WHEAT,
      Material.HONEY_BOTTLE, Material.WHEAT);

  public static final SlimefunItemStack RESOURCE_CORE_SUGAR_CANE = new SupremeItemStack("SUPREME_CORE_SUGAR_CANE",
      "8624bacb5f1986e6477abce4ae7dca1820a5260b6233b55ba1d9ba936c84b", "&a至尊甘蔗", "",
      "&7超級甘蔗", "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SUGAR_CANE = new CustomCoreRecipe(RESOURCE_CORE_SUGAR_CANE,
      Material.HONEY_BOTTLE, Material.SUGAR_CANE);

  public static final SlimefunItemStack RESOURCE_CORE_SWEET_BERRIES = new SupremeItemStack("SUPREME_CORE_SWEET_BERRIES",
      "b4ec3fcd557269a1a0b9bfa8a02dae1a39fa0ee8ff40e0cb8a96479be04b6609", "&a至尊莓", "", "&7超級莓",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SWEET_BERRIES = new CustomCoreRecipe(
      RESOURCE_CORE_SWEET_BERRIES, Material.HONEY_BOTTLE, Material.SWEET_BERRIES);

  public static final SlimefunItemStack RESOURCE_CORE_MELON = new SupremeItemStack("SUPREME_CORE_MELON",
      "84df0bfe450f0b8623f3accbc0d606f72891a6cfa9667898251ae73ebdd2646a", "&a至尊西瓜", "", "&7超級西瓜", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_MELON = new CustomCoreRecipe(RESOURCE_CORE_MELON,
      Material.HONEY_BOTTLE, Material.MELON);

  public static final SlimefunItemStack RESOURCE_CORE_CARROT = new SupremeItemStack("SUPREME_CORE_CARROT",
      "4d3a6bd98ac1833c664c4909ff8d2dc62ce887bdcf3cc5b3848651ae5af6b", "&a至尊蘿蔔", "", "&7超級蘿蔔", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CARROT = new CustomCoreRecipe(RESOURCE_CORE_CARROT,
      Material.HONEY_BOTTLE, Material.CARROT);

  public static final SlimefunItemStack RESOURCE_CORE_PUMPKIN = new SupremeItemStack("SUPREME_CORE_PUMPKIN",
      "b41ad148e33c81dca3f1a6ce13aa70e4fe6bc2c79e87185d8d176bdda1c98a3", "&a至尊南瓜", "", "&7超級南瓜",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PUMPKIN = new CustomCoreRecipe(RESOURCE_CORE_PUMPKIN,
      Material.HONEY_BOTTLE, Material.PUMPKIN);
}
