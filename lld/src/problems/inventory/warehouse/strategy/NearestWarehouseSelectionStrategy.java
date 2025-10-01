package problems.inventory.warehouse.strategy;

import problems.inventory.warehouse.Warehouse;

import java.util.List;

public class NearestWarehouseSelectionStrategy implements WarehouseSelectionStrategy {
    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        return warehouseList.getFirst();
    }
}
