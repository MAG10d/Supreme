package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SimpleCard {

  /**
   * MUSIC_DISC_STRAD       1 branco MUSIC_DISC_13          2 amarelo/branco MUSIC_DISC_MELLOHI     3 rosa/branco
   * MUSIC_DISC_FAR         4 verdeclaro MUSIC_DISC_CAT         5 verde MUSIC_DISC_WARD        6 verde/verdeclaro
   * MUSIC_DISC_WAIT        7 azul
   */

  // cards basicos
  public static final SlimefunItemStack CARD_STONE = new SupremeItemStack("SUPREME_CARD_STONE",
      Material.MUSIC_DISC_STRAD, "&b石頭卡片", "", "&f改為生產石頭", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GRANITE = new SupremeItemStack("SUPREME_CARD_GRANITE",
      Material.MUSIC_DISC_STRAD, "&b花崗岩卡片", "", "&f改為生產花崗岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_DIORITE = new SupremeItemStack("SUPREME_CARD_DIORITE",
      Material.MUSIC_DISC_STRAD, "&b閃長岩卡片", "", "&f改為生產閃長岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ANDESITE = new SupremeItemStack("SUPREME_CARD_ANDESITE",
      Material.MUSIC_DISC_STRAD, "&b安山岩卡片", "", "&f改為生產安山岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GRAVEL = new SupremeItemStack("SUPREME_CARD_GRAVEL",
      Material.MUSIC_DISC_STRAD, "&b沙礫卡片", "", "&f改為生產沙礫", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SAND = new SupremeItemStack("SUPREME_CARD_SAND", Material.MUSIC_DISC_STRAD,
      "&b沙子卡片", "", "&f改為生產沙子", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ENDSTONE = new SupremeItemStack("SUPREME_CARD_ENDSTONE",
      Material.MUSIC_DISC_STRAD, "&b末地石卡片", "", "&f改為生產末地石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_CLAY = new SupremeItemStack("SUPREME_CARD_CLAY", Material.MUSIC_DISC_STRAD,
      "&b黏土卡片", "", "&f改為生產黏土", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SNOW = new SupremeItemStack("SUPREME_CARD_SNOW", Material.MUSIC_DISC_STRAD,
      "&b雪卡片", "", "&f改為生產雪", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_APPLE = new SupremeItemStack("SUPREME_CARD_APPLE", Material.MUSIC_DISC_STRAD,
      "&b蘋果卡片", "", "&f改為生產蘋果", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_NETHER_STAR = new SupremeItemStack("SUPREME_CARD_NETHER_STAR", Material.MUSIC_DISC_STRAD,
          "&b下界之星卡片", "", "&f改為生產下界之星", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_WITHER_ROSE = new SupremeItemStack("SUPREME_CARD_WITHER_ROSE", Material.MUSIC_DISC_STRAD,
          "&b凋零玫瑰卡片", "", "&f改為生產凋零玫瑰", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_SLIME_BALL = new SupremeItemStack("SUPREME_CARD_SLIME_BALL", Material.MUSIC_DISC_STRAD,
          "&b黏液球卡片", "", "&f改為生產黏液球", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_INK_SAC = new SupremeItemStack("SUPREME_CARD_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&b墨囊卡片", "", "&f改為生產墨囊", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_GLOW_INK_SAC = new SupremeItemStack("SUPREME_CARD_GLOW_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&b發光墨囊卡片", "", "&f改為生產發光墨囊", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_HONEY_BOTTLE = new SupremeItemStack("SUPREME_CARD_HONEY_BOTTLE", Material.MUSIC_DISC_STRAD,
          "&b蜂蜜瓶卡片", "", "&f改為生產蜂蜜瓶", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_COAL = new SupremeItemStack("SUPREME_CARD_COAL", Material.MUSIC_DISC_13,
      "&b煤卡片", "", "&f改為生產煤", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_IRON = new SupremeItemStack("SUPREME_CARD_IRON", Material.MUSIC_DISC_13,
      "&b鐵卡片", "", "&f改為生產鐵", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_COPPER = new SupremeItemStack("SUPREME_CARD_COPPER",
      Material.MUSIC_DISC_13, "&b銅卡片", "", "&f改為生產銅", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GOLD = new SupremeItemStack("SUPREME_CARD_GOLD", Material.MUSIC_DISC_13,
      "&b金卡片", "", "&f改為生產金", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_QUARTZ = new SupremeItemStack("SUPREME_CARD_QUARTZ",
      Material.MUSIC_DISC_13, "&b下界石英卡片", "", "&f改為生產下界石英", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SupremeItemStack("SUPREME_CARD_QUARTZ_BLOCK",
      Material.MUSIC_DISC_13, "&b石英塊卡片", "", "&f改為生產石英塊", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_LAPIS = new SupremeItemStack("SUPREME_CARD_LAPIS", Material.MUSIC_DISC_13,
      "&b青金石卡片", "", "&f改為生產青金石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_REDSTONE = new SupremeItemStack("SUPREME_CARD_REDSTONE",
      Material.MUSIC_DISC_13, "&b紅石卡片", "", "&f改為生產紅石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_DIAMOND = new SupremeItemStack("SUPREME_CARD_DIAMOND",
      Material.MUSIC_DISC_FAR, "&b鑽石卡片", "", "&f改為生產鑽石", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_EMERALD = new SupremeItemStack("SUPREME_CARD_EMERALD",
      Material.MUSIC_DISC_FAR, "&b綠寶石卡片", "", "&f改為生產綠寶石", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_BLAZE_ROD = new SupremeItemStack("SUPREME_CARD_BLAZE_ROD",
      Material.MUSIC_DISC_FAR, "&b烈焰棒卡片", "", "&f改為生產烈焰棒", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_NETHERITE = new SupremeItemStack("SUPREME_CARD_NETHERITE",
      Material.MUSIC_DISC_FAR, "&b下界合金卡片", "", "&f改為生產下界合金", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_AMETHYST = new SupremeItemStack("SUPREME_CARD_AMETHYST",
      Material.MUSIC_DISC_FAR, "&b紫水晶卡片", "", "&f改為生產紫水晶", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_IRON_DUST = new SupremeItemStack("SUPREME_CARD_IRON_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b鐵粉卡片", "", "&f改為生產鐵粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_LEAD_DUST = new SupremeItemStack("SUPREME_CARD_LEAD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b鉛粉卡片", "", "&f改為生產鉛粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GOLD_DUST = new SupremeItemStack("SUPREME_CARD_GOLD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b金粉卡片", "", "&f改為生產金粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_COPPER_DUST = new SupremeItemStack("SUPREME_CARD_COPPER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b銅粉卡片", "", "&f改為生產銅粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SupremeItemStack("SUPREME_CARD_MAGNESIUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b鎂粉卡片", "", "&f改為生產鎂粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SupremeItemStack("SUPREME_CARD_ALUMINUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b鋁粉卡片", "", "&f改為生產鋁粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SILVER_DUST = new SupremeItemStack("SUPREME_CARD_SILVER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b銀粉卡片 ", "", "&f改為生產銀粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_TIN_DUST = new SupremeItemStack("SUPREME_CARD_TIN_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b錫粉卡片", "", "&f改為生產錫粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ZINC_DUST = new SupremeItemStack("SUPREME_CARD_ZINC_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b鋅粉卡片", "", "&f改為生產鋅粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");

}
