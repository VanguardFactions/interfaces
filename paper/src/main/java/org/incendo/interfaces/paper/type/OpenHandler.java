package org.incendo.interfaces.paper.type;

import org.bukkit.event.inventory.InventoryOpenEvent;
import org.incendo.interfaces.core.pane.Pane;
import org.incendo.interfaces.paper.view.PlayerView;

import java.util.function.BiConsumer;

/**
 * A function that handles a open event on an interface.
 *
 * @param <T> the pane type
 */
public interface OpenHandler<T extends Pane> extends BiConsumer<InventoryOpenEvent, PlayerView<T>> {

}
