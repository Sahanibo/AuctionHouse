package com.company;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        System.out.println("BSR Auction House");

        Subject auctioneer = new Subject();

        Bid b1 = new Bid(auctioneer, "John", "Table");
        Bid b2 = new Bid(auctioneer,"Carla", "Table");
        Bid b3 = new Bid(auctioneer,"Jay","Table");
        Bid b4 = new Bid(auctioneer,"Sean","Table");

        System.out.println("John bid 3");
        b1.BidCall(3);
        System.out.println("Carla bid 1");
        b2.BidCall(1);
        System.out.println("Jay bid 10");
        b3.BidCall(10);
        System.out.println("Sean bid 20");
        b4.BidCall(20);


    }
}