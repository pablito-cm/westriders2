package frc.robot.Auto;

import frc.robot.subsystems.Drive;

public class Turnright {
    Drive mAutoDrive = new Drive();
    

    public void finalTurnRightAction(){
        Drive.AutoChasis(0.3, 0.3, -0.3, -0.3);
    }
}

