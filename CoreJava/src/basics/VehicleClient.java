package basics;
import jrout.tutorial.vehicle.service.VehicleService;

/**
 * Created by jrout on 7/8/19.
 */
public class VehicleClient {

    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.doService("honda");

        String json = "";
    } // who is dependent on whom ?
}
