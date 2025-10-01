package problems.inventory.warehouse.strategy;

import problems.inventory.warehouse.Warehouse;

import java.util.List;

public interface WarehouseSelectionStrategy {
    public abstract Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
