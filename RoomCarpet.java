class RoomCarpet{
    void calculatePrice(double area, double desirePrice){
        double price = area * desirePrice;
        System.out.printf("The final price is $" + "%.2f \n------ Thank you! ------", price);
    }
}
