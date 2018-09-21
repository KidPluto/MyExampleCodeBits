# Elevators

## Requirements
* There is a building with two or more elevators
* People can request an elevator
* After boarding elevator, a floor is selected

## Assumptions
* No limit for the number of people which an elevator can hold
* All people on the floor, going in the direction of the elevator, will board the elevator
* The first person requesting an elevator will not have priority over others on other floors, who requested it later.  
* An elevator can only change direction if empty
* The closest elevator will be used to pick up a person

## Use cases
* Person requests an elevator to go up
* Person requests an elevator to go down
* Person selects desired floor, after entering elevator
* Person on floor 4 selects down elevator, person on floor 5 selects down elevator - while the elevator is still on floor 7

## Classes

### Controller

##### Methods
* elevatorRequested(floor, direction)
* floorRequested(floor)

### Building
* This class just contains the Elevator instances.

### Elevator
* A double linked list will be used to represent the Elevator

##### Methods
* inUse()
    * will return true if person is on the elevator, or it is going to pick up a person
* direction() 
    * will return up or down   
* nextFloorToDropOff()
* nextFloorToPickup()
* moveUp()
* moveDown()

### Person

##### Methods
* requestElevator(direction up/down)
    * person on the bottom floor can only select up
    * person on the top floor can only select down
    * Call Controller::elevatorRequested(floor, direction)
* requestFloor(floor)
    * will only allow selections, in the direction for which the elevator was selected
    * Call Controller::floorRquested(floor)
* status() 
     * will return "waiting for elevator" or "on elevator"
* floor() 
     * will return what floor the person is currently on
    
    
    