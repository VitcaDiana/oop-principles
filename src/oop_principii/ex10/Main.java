package oop_principii.ex10;

public class Main {
    public static void main(String[] args) throws InvalidSeatException {


        CinemaHall cinemaHall = new CinemaHall(10, 7);
        cinemaHall.printGrid();
        cinemaHall.initializeGridWithEmptySeats();
        cinemaHall.printGrid();

        try {
            cinemaHall.buyTicket(2, 3);
            System.out.println(cinemaHall.getPrice(2, 3));
            cinemaHall.printGrid();
            cinemaHall.buyTicket(6, 5);
            System.out.println(cinemaHall.getPrice(6,5));
            cinemaHall.buyTicket(10,7);
            System.out.println(cinemaHall.getPrice(10,7));
            cinemaHall.printGrid();
            cinemaHall.buyTicket(6, 5);
            System.out.println(cinemaHall.getPrice(6, 5));



        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }

    }
}


