package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class LaptopWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner si = new Scanner(System.in);
        // To Create Object: Classname objName = new ClassName();
//        To Create List: List<Type> listName = new ArrayList<Type>();
        List<Laptop> laptopList = new ArrayList<Laptop>();

        String userresult = "Yes";
        do{
            System.out.println("Enter Laptop Name");
            String laptopName = sc.nextLine();

            System.out.println("Enter price");
            double price = sd.nextDouble();

            System.out.println("Enter RAM");
            int ram = si.nextInt();

            System.out.println("Enter Battery backup in hrs");
            double bb = sd.nextDouble();

            Laptop l1 = new Laptop(laptopName, price, ram, bb);
            laptopList.add(l1);
            System.out.println("Do you want to add more laptop? [Yes or No]");
            userresult = sc.nextLine();
        }while (userresult.equals("Yes"));

        System.out.println("You added "+laptopList.size()+ " laptops");
        for(Laptop l: laptopList){
            l.printDetails();
        }
    }
}

class Laptop{
    // Prop
    String name;
    double price;
    int ram;
    double batterycap;

    public Laptop(String name, double price, int ram, double batterycap) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.batterycap = batterycap;
    }

    void printDetails(){
        System.out.println("Laptop name is "+this.name);
        System.out.println("Laptop price is "+this.price);
        System.out.println("Laptop RAM is "+this.ram + "GB");
        System.out.println("Laptop Battery Backup is "+batterycap + "hrs.\n");

    }
}


