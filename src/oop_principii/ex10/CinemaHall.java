package oop_principii.ex10;

import java.util.Arrays;

public class CinemaHall {
    private int numberOfRows;
    private int numberOfCols;
    private char[][] grid;
    private int ticketPrice;
    private int totalSeatsSold;
    public int row;
    public int col;

    public CinemaHall(int numberOfRows, int numberOfCols) {
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        this.grid = new char[numberOfRows][numberOfCols];
        this.totalSeatsSold = 0;
        this.ticketPrice = getPrice(row,col);
    }


    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfCols() {
        return numberOfCols;
    }

    public void setNumberofCols(int numberOfCols) {
        this.numberOfCols = numberOfCols;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTotalSeatsSold() {
        return totalSeatsSold;
    }

    public void setTotalSeatsSold(int totalSeatsSold) {
        this.totalSeatsSold = totalSeatsSold;
    }

    public void initializeGridWithEmptySeats() {
        //punem caracterul E in toate celulele din grid
        for (int i=0; i< getNumberOfRows();i++){
            Arrays.fill(getGrid()[i], 'E');
        }
    }
    public void showStatistics() {
        int totalSeats = numberOfRows * numberOfCols;
        double occupancyPercentage = (double) totalSeatsSold / totalSeats * 100; //aici se face casting
        int currentSum = totalSeatsSold * getPrice(row,col);
        int maxSum = totalSeats * getPrice(row,col);

        System.out.println("Bilete vandute: " + totalSeatsSold);
        System.out.println("Procentaj locuri ocupate: " + occupancyPercentage + "%");
        System.out.println("Suma obtinuta din vanzari: " + currentSum + " lei");
        System.out.println("Suma maxima posibila din vanzari: " + maxSum + " lei");
    }
    public void printGrid(){
        {
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfCols; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public int getPrice(int row, int col) {
        int totalSeats = numberOfRows * numberOfCols;
        if (totalSeats <= 60){
            return ticketPrice = 10;
        }else if (row < totalSeats/2){
                return ticketPrice = 10;
            }else {
                return ticketPrice = 20;
            }
        }

    public void buyTicket(int row, int col) throws InvalidSeatException {
        //  daca locul nu exista daca atunci arunc o exceptie
        // daca locul este liber il setam ocupat
           // altfel aruncam o exceptie pentru ca locul este deja ocupat


        if (row < 0 || row > numberOfRows || col < 0 || col > numberOfCols) {
            throw new InvalidSeatException("Locul nu exista in sala");
        }

        if (grid[row-1][col-1] == 'E') {
            grid[row-1][col-1] = 'O'; // Marcam locul ca fiind ocupat
            totalSeatsSold++;
            System.out.println("Bilet cumparat pentru randul " + row + " coloana " + col);
        } else {
            throw new InvalidSeatException("Locul este deja ocupat");
        }
    }
}




