package net.my.test.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UsefulFood implements ModInitializer {
    public static final String MODID = "UsefulFood";

    public static final Item MeatBall = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(14).saturationModifier(8f).meat().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,20*20),1f).build()));
    public static final Item Sashimi = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,20*5),0.4f).build()));
    public static final Item Ration = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).snack().saturationModifier(6f).alwaysEdible().build()));
    public static final Item Suspicious_Meat = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6f).meat().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20*5), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,20), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE), 0.2f).build()));
    public static final Item Ratatouille = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(4f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*60), 0.5f).build()));
    public static final Item Raw_Turkey_Feast =  new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).meat().saturationModifier(2f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*2), 0.5f).build()));
    public static final Item Turkey_Feast =  new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(16).meat().saturationModifier(10f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*300), 1f).build()));
    public static final Item Popping_Candy =  new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).snack().saturationModifier(2f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20*300), 1f).build()));
    public static final Item Hero_stew =  new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(20).saturationModifier(20f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20*300), 1f).build()));
    public static final Item Chewing_Gum = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).snack().saturationModifier(2f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20*300), 1f).build()));
    public static final Item Chew_Bones = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*60), 0.5f).build()));
    public static final Item Seafood_Feast = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(20).saturationModifier(20f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*3000), 1f).build()));
    public static final Item Destiny_Carrot = new FoodBase(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).snack().saturationModifier(4f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*60), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 20*60), 0.5f).build()));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_meatball"), MeatBall);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_sashimi"), Sashimi);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_ration"), Ration);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_suspiciousmeat"),Suspicious_Meat);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_ratatouille"),Ratatouille);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_rawturkeyfeast"),Raw_Turkey_Feast);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_turkeyfeast"),Turkey_Feast);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_poppingcandy"),Popping_Candy);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_herostew"),Hero_stew);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_chewinggum"),Chewing_Gum);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_chewbones"),Chew_Bones);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_seafoodfeast"),Seafood_Feast);
        Registry.register(Registry.ITEM, new Identifier(MODID,"fabric_destinycarrot"),Destiny_Carrot);
    }

}