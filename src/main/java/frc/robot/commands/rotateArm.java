package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class RotateArm extends CommandBase{
    Arm arm;
    double speed;

    public RotateArm(Arm a, double s) {
        arm = a;
        speed = s;

        addRequirements(arm);
    }

    public void execute() {
        arm.rotate(speed);
    }
}
