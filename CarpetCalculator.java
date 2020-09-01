/*
Name: Liyuan Wang
CptS 233: MicroAssignment #1
Date: 8/31/2020
gitRepo url: https://github.com/liyuanboo/CarpetCalculater.git
* */

public class CarpetCalculator {
    public static void main(String[] args) {
        RoomDimension getArea = new RoomDimension();
        double theArea = getArea.area();
        double desiredPrice = getArea.desiredPrice();

        RoomCarpet getCost = new RoomCarpet();
        getCost.calculatePrice(theArea, desiredPrice);
    }
}

