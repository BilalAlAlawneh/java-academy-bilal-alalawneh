package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone(9093933, "Iphone 15", "AT&T", "415-917-8022", "Bilal Al Alawneh");
        CellPhone phone2 = new CellPhone(8080808, "Samsung Galaxy S23", "Verizon", "212-555-9090", "Alex Smith");

        //newPhone
        CellPhone phone3 = new CellPhone();
        phone3.setSerialNumber(7070707);
        phone3.setModel("Google Pixel 9");
        phone3.setCarrier("T-Mobile");
        phone3.setPhoneNumber("646-222-3333");
        phone3.setOwner("Ahmad A");

        display(phone);
        display(phone2);
        display(phone3);

        phone.dial(phone2.getPhoneNumber());
    }

    public static void display(CellPhone phone){
            System.out.println("Cell Phone Information:");
            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());
            System.out.println();
        }
}