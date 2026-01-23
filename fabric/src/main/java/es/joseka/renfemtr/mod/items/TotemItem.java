package es.joseka.renfemtr.mod.items;

//import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.mapper.BlockItemExtension;

public class TotemItem extends BlockItemExtension {

    public TotemItem(Block block, ItemSettings itemSettings) {
        super(block, itemSettings);
    }
    @Override
    public String getTranslationKey2() {
        // Clave que se usará para mostrar el nombre en inventario y tooltips
        return "item.renfe.cercanias_totem";
    }
}
