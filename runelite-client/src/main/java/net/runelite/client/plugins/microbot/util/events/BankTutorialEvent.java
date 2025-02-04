package net.runelite.client.plugins.microbot.util.events;

import net.runelite.api.annotations.Component;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.microbot.BlockingEvent;
import net.runelite.client.plugins.microbot.BlockingEventPriority;
import net.runelite.client.plugins.microbot.util.widget.Rs2Widget;

import java.util.List;

public class BankTutorialEvent implements BlockingEvent {
    @Component
    private final int BANK_TUTORIAL_BUTTON_COMPONENT_ID = 43515912;

    @Override
    public boolean validate() {
        return Rs2Widget.isWidgetVisible(BANK_TUTORIAL_BUTTON_COMPONENT_ID);
    }

    @Override
    public boolean execute() {
        Widget bankTutorialWidget = Rs2Widget.getWidget(BANK_TUTORIAL_BUTTON_COMPONENT_ID);
        if (bankTutorialWidget == null) return false;
        
        Widget closebankTutorialWidget = Rs2Widget.findWidget("Close", List.of(bankTutorialWidget));
        if (closebankTutorialWidget == null) return false;

        return Rs2Widget.clickWidget(closebankTutorialWidget);
    }

    @Override
    public BlockingEventPriority priority() {
        return BlockingEventPriority.NORMAL;
    }
}
