


import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class House {
    private long id;
    private String address;
    private int room;
    private double price;
    private HouseType houseType;
    private LocalDate builtDate;

    public House() {
    }

    public House(long id, String address, int room, double price, HouseType houseType, LocalDate builtDate) {
        this.id = id;
        this.address = address;
        this.room = room;
        this.price = price;
        this.houseType = houseType;
        this.builtDate = builtDate;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", room=" + room +
                ", price=" + price +
                ", houseType=" + houseType +
                ", builtDate=" + builtDate +
                '}';
    }

    public static House addHouse() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        House house = new House();
        while (true) {
            try {
                System.out.println("Give id:");
                long inputID = scanner1.nextLong();

                house.setId(inputID);


            }
        }

    }

}

