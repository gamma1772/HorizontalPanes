package com.mdujovic17.horizontalpanes.registry;

import com.mdujovic17.horizontalpanes.HorizontalPanes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HorizontalPanes.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HORIZONTAL_PANES = CREATIVE_MODE_TABS.register("horizontal_panes",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.horizontalpanes.horizontalpanes"))
                    .icon(() -> ModItems.TINTED_GLASS_PANE.get().getDefaultInstance())
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GLASS_PANE.get());
                        output.accept(ModItems.WHITE_STAINED_PANE.get());
                        output.accept(ModItems.RED_STAINED_PANE.get());
                        output.accept(ModItems.ORANGE_STAINED_PANE.get());
                        output.accept(ModItems.PINK_STAINED_PANE.get());
                        output.accept(ModItems.YELLOW_STAINED_PANE.get());
                        output.accept(ModItems.LIME_STAINED_PANE.get());
                        output.accept(ModItems.GREEN_STAINED_PANE.get());
                        output.accept(ModItems.LIGHT_BLUE_STAINED_PANE.get());
                        output.accept(ModItems.CYAN_STAINED_PANE.get());
                        output.accept(ModItems.BLUE_STAINED_PANE.get());
                        output.accept(ModItems.MAGENTA_STAINED_PANE.get());
                        output.accept(ModItems.PURPLE_STAINED_PANE.get());
                        output.accept(ModItems.BROWN_STAINED_PANE.get());
                        output.accept(ModItems.GRAY_STAINED_PANE.get());
                        output.accept(ModItems.LIGHT_GRAY_STAINED_PANE.get());
                        output.accept(ModItems.BLACK_STAINED_PANE.get());
                        output.accept(ModItems.TINTED_GLASS_PANE.get());
                    })
                    .build());
}
