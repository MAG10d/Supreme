package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreAlloy {

  public static final SlimefunItemStack RESOURCE_CORE_COAL = new SupremeItemStack("SUPREME_CORE_COAL",
      "d7f5766d2928dc0df1b3404c3bd073c9476d26c80573b0332e7cce73df15482a", "&a至尊煤", "", "&7超級煤炭", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_COAL = new CustomCoreRecipe(RESOURCE_CORE_COAL,
      Material.COAL);

  public static final SlimefunItemStack RESOURCE_CORE_IRON = new SupremeItemStack("SUPREME_CORE_IRON",
      "126b772329cf32f8643c4928626b6a325233ff61aa9c7725873a4bd66db3d692", "&a至尊鐵", "", "&7超級鐵", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_IRON = new CustomCoreRecipe(RESOURCE_CORE_IRON,
      Material.IRON_INGOT);

  public static final SlimefunItemStack RESOURCE_CORE_GOLD = new SupremeItemStack("SUPREME_CORE_GOLD",
      "54bf893fc6defad218f7836efefbe636f1c2cc1bb650c82fccd99f2c1ee6", "&a至尊金", "", "&7超級金", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GOLD = new CustomCoreRecipe(RESOURCE_CORE_GOLD,
      Material.GOLD_INGOT);

  public static final SlimefunItemStack RESOURCE_CORE_REDSTONE = new SupremeItemStack("SUPREME_CORE_REDSTONE",
      "d08ee6edfa98db5eae9b9c9936e94489b2d4bbbd3d2b4b6b4885a32240613c", "&a至尊紅石", "", "&7超級紅石",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_REDSTONE = new CustomCoreRecipe(RESOURCE_CORE_REDSTONE,
      Material.REDSTONE);

  public static final SlimefunItemStack RESOURCE_CORE_LAPIS = new SupremeItemStack("SUPREME_CORE_LAPIS",
      "55189b379a7880ff9a4bbd588adb4e1b7b9c3341de7d6d006d362ae5450da986", "&a至尊青金石", "", "&7超級青金石", "",
      "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_LAPIS = new CustomCoreRecipe(RESOURCE_CORE_LAPIS,
      Material.LAPIS_LAZULI);

  public static final SlimefunItemStack RESOURCE_CORE_DIAMOND = new SupremeItemStack("SUPREME_CORE_DIAMOND",
      "9631597dce4e4051e8d5a543641966ab54fbf25a0ed6047f11e6140d88bf48f", "&a至尊鑽石", "", "&7超級鑽石",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DIAMOND = new CustomCoreRecipe(RESOURCE_CORE_DIAMOND,
      Material.DIAMOND);

  public static final SlimefunItemStack RESOURCE_CORE_EMERALD = new SupremeItemStack("SUPREME_CORE_EMERALD",
      "bc0e6d9e242735481918c5fd14498bd760bb9f4ff6430ad4696b38e8a883da97", "&a至尊綠寶石", "", "&7超級綠寶石",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_EMERALD = new CustomCoreRecipe(RESOURCE_CORE_EMERALD,
      Material.EMERALD);

  public static final SlimefunItemStack RESOURCE_CORE_QUARTZ = new SupremeItemStack("SUPREME_CORE_QUARTZ",
      "d3b5001a67007a93ade6659175e9054a92976b087fc629f042bcd57e7757646a", "&a至尊石英", "", "&7超級石英",
      "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_QUARTZ = new CustomCoreRecipe(RESOURCE_CORE_QUARTZ,
      Material.QUARTZ_BLOCK);

  public static final SlimefunItemStack RESOURCE_CORE_NETHERITE = new SupremeItemStack("SUPREME_CORE_NETHERITE",
      "27957f895d7bc53423a35aac59d584b41cc30e040269c955e451fe680a1cc049", "&a至尊下界合金", "",
      "&7超級下界合金", "", "&3至尊核心合成材料");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_NETHERITE = new CustomCoreRecipe(RESOURCE_CORE_NETHERITE,
      Material.NETHERITE_INGOT);
}
