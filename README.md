# Lamport's Vector Clock Implementation using RMI

## Description
This project implements Lamport's vector clocks using Java RMI (Remote Method Invocation). It allows processes to communicate and maintain synchronized vector clocks, ensuring a logical ordering of events in a distributed system.

## Components
- **VectorClock Interface**: Defines methods for managing vector clocks (get, increment, update).
- **VectorClock Implementation**: Implements the vector clock logic.
- **RemoteProcess Interface**: Defines methods for process communication.
- **RemoteProcess Implementation**: Handles sending events and updating vector clocks.
- **ClockServer**: The RMI server that manages the vector clock.
- **ClockClient**: Simulates process events and updates clocks.

## How to Run
1. **Start the RMI Registry**: `rmiregistry`
2. **Run the Server**: `java ClockServer`
3. **Run the Client**: `java ClockClient`
4. The client will simulate events and print the updated vector clock states.
