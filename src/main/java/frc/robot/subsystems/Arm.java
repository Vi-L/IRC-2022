package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Arm extends SubsystemBase {
    private VictorSP motorController;

    public Arm() {
        motorController = new VictorSP(9); // port 9 is motor controller for arm
    }

    public void rotate(double speed) {
        motorController.set(speed); // can be between -1 and 1
    }

    public void stop() {
        motorController.set(0);
    }
}
