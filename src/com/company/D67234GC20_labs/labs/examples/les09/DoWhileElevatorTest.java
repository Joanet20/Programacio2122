package com.company.D67234GC20_labs.labs.examples.les09;

public class DoWhileElevatorTest {

   public static void main(String args[]) {
     
    DoWhileElevator myElevator = new DoWhileElevator();
     
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
     myElevator.setFloor();
     myElevator.openDoor();
   }
}
