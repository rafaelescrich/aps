package net.aps.inventory.libs;

import net.aps.inventory.App;
import net.aps.inventory.services.InventoryService;
import net.aps.inventory.services.InventoryServiceHibernate;

public abstract class BaseController {
    public InventoryService inventoryService = new InventoryServiceHibernate(App.getInstance().getSessionFactory());
}