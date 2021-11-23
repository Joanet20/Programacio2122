package com.company.D67234GC20_labs.labs.examples.les10;

public class ElevatorTest {

   public static void main(String args[]) {
     
    Elevator myElevator = new Elevator();

    // checkDoorStatus somewhere!! (Slide 11)
     
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goUp();
     myElevator.goUp();
     myElevator.goUp();
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goDown();
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goDown();
     
     myElevator.setFloor(myElevator.TOP_FLOOR);
     
     myElevator.openDoor();
   }
}
