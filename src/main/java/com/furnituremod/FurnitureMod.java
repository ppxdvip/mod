package com.furnituremod; 
 
import net.minecraft.world.item.CreativeModeTab; 
import net.minecraft.world.item.ItemStack; 
import net.minecraftforge.common.MinecraftForge; 
import net.minecraftforge.eventbus.api.IEventBus; 
import net.minecraftforge.fml.common.Mod; 
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext; 
import com.furnituremod.items.ModItems; 
 
@Mod(FurnitureMod.MOD_ID) 
public class FurnitureMod { 
    public static final String MOD_ID = "furnituremod"; 
 
    public static final CreativeModeTab FURNITURE_TAB = new CreativeModeTab("furniture_tab") { 
        @Override 
        public ItemStack makeIcon() { 
            return new ItemStack(ModItems.SINGLE_BED.get()); 
        } 
    }; 
 
    public FurnitureMod() { 
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(); 
        ModItems.register(modEventBus); 
        MinecraftForge.EVENT_BUS.register(this); 
    } 
} 
