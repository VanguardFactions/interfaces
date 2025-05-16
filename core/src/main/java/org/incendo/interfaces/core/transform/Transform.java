package org.incendo.interfaces.core.transform;

import org.incendo.interfaces.core.pane.Pane;
import org.incendo.interfaces.core.view.InterfaceView;
import org.incendo.interfaces.core.view.InterfaceViewer;

import java.util.function.BiFunction;

public interface Transform<T extends Pane, U extends InterfaceViewer> extends BiFunction<T, InterfaceView<T, U>, T> {

    /**
     * Returns if this transform should be applied asynchronously.
     *
     * @return true if this transform should be applied asynchronously, false if not
     */
    default boolean async() {
        return false;
    }

}
