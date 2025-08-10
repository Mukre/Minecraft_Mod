package net.mauricio.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mauricio.tutorialmod.TutorialMod;
import net.mauricio.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup TEQUE_TEQUE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(TutorialMod.MOD_ID, "teque_teque_items"),
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TEQUE_TEQUE))
            .displayName(Text.translatable("itemGroup.tutorialmod.teque_teque_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.TEQUE_TEQUE);
                entries.add(ModItems.TEQUE_TEQUE_PILL);
            })
            .build()
    );
    
    public static final ItemGroup TEQUE_TEQUE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(TutorialMod.MOD_ID, "teque_teque_blocks"),
        FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.TEQUE_TEQUE_BLOCK))
            .displayName(Text.translatable("itemGroup.tutorialmod.teque_teque_blocks"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.TEQUE_TEQUE_BLOCK);
            })
            .build()
    );
    


    
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
