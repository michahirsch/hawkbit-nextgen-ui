package org.eclipse.hawkbit.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.hawkbit.eventbus.event.Event;

/**
 * The default hawkbit event provider.
 */
public class HawkbitEventProvider implements UIEventProvider {

    private static final Set<Class<? extends Event>> SINGLE_EVENTS = new HashSet<>(9);
    private static final Set<Class<? extends Event>> BULK_EVENTS = new HashSet<>(5);

    static {
    }

    @Override
    public Set<Class<? extends Event>> getSingleEvents() {
        return SINGLE_EVENTS;
    }

    @Override
    public Set<Class<? extends Event>> getBulkEvents() {
        return BULK_EVENTS;
    }

}
