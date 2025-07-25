package com.furnituremod.items; 
 
import com.furnituremod.FurnitureMod; 
import net.minecraft.world.item.Item; 
import net.minecraftforge.eventbus.api.IEventBus; 
import net.minecraftforge.registries.DeferredRegister; 
import net.minecraftforge.registries.ForgeRegistries; 
import net.minecraftforge.registries.RegistryObject; 
 
public class ModItems { 
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, FurnitureMod.MOD_ID); 
 
    public static final RegistryObject<Item> SINGLE_BED = ITEMS.register("single_bed", 
            () -> new Item(new Item.Properties().tab(FurnitureMod.FURNITURE_TAB))); 
 
    public static final RegistryObject<Item> SMALL_SHELF = ITEMS.register("small_shelf", 
            () -> new Item(new Item.Properties().tab(FurnitureMod.FURNITURE_TAB))); 
 
    public static final RegistryObject<Item> POSTER = ITEMS.register("poster", 
            () -> new Item(new Item.Properties().tab(FurnitureMod.FURNITURE_TAB))); 
 
    public static final RegistryObject<Item> SIX_PLUSHIE = ITEMS.register("six_plushie", 
            () -> new Item(new Item.Properties().tab(FurnitureMod.FURNITURE_TAB))); 
 
    public static final RegistryObject<Item> STRING_LIGHT = ITEMS.register("string_light", 
            () -> new Item(new Item.Properties().tab(FurnitureMod.FURNITURE_TAB))); 
 
    public static void register(IEventBus eventBus) { 
        ITEMS.register(eventBus); 
    } 
} 
