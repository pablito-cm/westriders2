package frc.robot.Auto;

import frc.robot.subsystems.Drive;

public class Turnleft {
    Drive mAutoDrive = new Drive();
    

    public void finalStopAction(){
        Drive.AutoChasis(0, 0, 0, 0);
    }
}

