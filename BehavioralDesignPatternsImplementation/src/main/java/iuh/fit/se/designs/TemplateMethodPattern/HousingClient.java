package iuh.fit.se.designs.TemplateMethodPattern;

public class HousingClient {
	public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();
        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
