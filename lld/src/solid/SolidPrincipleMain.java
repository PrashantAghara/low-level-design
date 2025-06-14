package solid;

import solid.lsp_issues.Bicycle;
import solid.lsp_issues.Car;
import solid.lsp_issues.Motorcycle;
import solid.lsp_issues.Vehicle;
import solid.lsp_solution.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class SolidPrincipleMain {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle()); // Null Pointer Exception

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.hasEngine());
        }

        List<Vehicles> vehicles1 = new ArrayList<>();
        vehicles1.add(new solid.lsp_solution.Car());
        vehicles1.add(new solid.lsp_solution.Bicycle());
        for (Vehicles vehicle : vehicles1) {
            System.out.println(vehicle.getWheels());
        }
    }
}
