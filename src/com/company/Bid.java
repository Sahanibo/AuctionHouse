package com.company;

public class Bid extends Observer{

    private String bidderName;
    private String objectName;
    public Bid(Subject subject, String bidderName, String objectName){
        this.subject = subject;
        this.subject.attach(this);
        this.bidderName = bidderName;
        this.objectName = objectName;
    }


    public void BidCall(int Amount){
        if(Amount > subject.getState()){
            subject.setState(Amount);
        }else{
            System.out.println("Bid is below the current bid, bid not accepted");
        }
    }




    @Override
    public void update() {
        System.out.println( "["+bidderName+"] Bid updated to: " + subject.getState() +" for the object " +objectName);
    }
}
