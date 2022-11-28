package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class AutoDrive extends CommandBase{
    private Drivetrain drivetrain;
    private double leftSpeed, rightSpeed;

    public AutoDrive(Drivetrain dt, double ls, double rs) {
        drivetrain = dt;
        leftSpeed = ls;
        rightSpeed = rs;

        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
        drivetrain.stop();
    }

    @Override
    public void execute() {
        drivetrain.drive(leftSpeed, rightSpeed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean stop) {
        drivetrain.stop();
    }
}
