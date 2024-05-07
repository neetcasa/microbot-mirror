package net.runelite.client.plugins.microbot.bankjs.development.BanksShopper;

import net.runelite.client.config.*;

@ConfigGroup("example")
public interface BanksShopperConfig extends Config {

    @ConfigSection(
            name = "Shop Settings",
            description = "Shop Settings",
            position = 0,
            closedByDefault = false
    )
    String shopSection = "shopSection";

    @ConfigSection(
            name = "Item Settings",
            description = "Item Settings",
            position = 0,
            closedByDefault = false
    )
    String itemSection = "itemSection";

    @ConfigSection(
            name = "Action Settings",
            description = "Action Settings",
            position = 0,
            closedByDefault = false
    )
    String actionSection = "actionSection";

    // Object or NPC to trade with
    @ConfigItem(
            keyName = "NPC Name",
            name = "NPC Name",
            description = "Sets NPC to trade with",
            position = 0,
            section = shopSection
    )

    default String npcName() {
        return "";
    }


    @ConfigItem(
            keyName = "Item Name",
            name = "Item Name",
            description = "Sets Item to Buy or Sell",
            position = 0,
            section = itemSection
    )

    default String itemName() {
        return "";
    }

    @ConfigItem(
            keyName = "Minimum Stock",
            name = "Minimum Stock",
            description = "Sets Minimum Stock level, Will not buy anymore stock past this value.",
            position = 1,
            section = itemSection
    )

    default int minimumStock() {
        return 0;
    }

    @ConfigItem(
            position = 1,
            keyName = "Action",
            name = "Action",
            description = "Set Buy/Sell Mode",
            section = actionSection
    )
    default Actions action() {
        return Actions.BUY;
    }

    @ConfigItem(
            position = 2,
            keyName = "Quantity",
            name = "Quantity",
            description = "Set Buy/Sell Quantity",
            section = actionSection
    )
    default Quantities quantity() {
        return Quantities.FIFTY;
    }

}
