package medium;

import medium.person.HouseOwner;
import medium.person.Tenant;

public class Main {
    public static void main(String[] args) {
        Medium medium = new HouseMedium();

        HouseOwner houseOwner = new HouseOwner();
        Tenant tenant = new Tenant();

        medium.register(houseOwner,tenant);


        tenant.contact("老板 有房吗");

        houseOwner.contact("有 你要买啊");
    }
}
