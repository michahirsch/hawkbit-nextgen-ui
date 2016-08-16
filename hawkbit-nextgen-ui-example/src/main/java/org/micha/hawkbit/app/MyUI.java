package org.micha.hawkbit.app;

import org.micha.hawkbit.ui.targets.TargetTable;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.shared.ui.ui.Transport;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/login")
@Title("hawkBit NextGen UI")
@Push(value = PushMode.AUTOMATIC, transport = Transport.WEBSOCKET)
@Theme(ValoTheme.THEME_NAME)
public class MyUI extends UI {

    private static final long serialVersionUID = 1L;

    @Override
    protected void init(final VaadinRequest request) {
        setContent(new TargetTable());
    }

}
