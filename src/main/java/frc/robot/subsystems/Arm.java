package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Arm extends SubsystemBase {
    private VictorSP motorController;

    public Arm() {
        motorController = new VictorSP(2); // TODO: fix port number
    }

    public void rotate(double speed) {
        motorController.set(speed); // can be between -1 and 1
    }
}
