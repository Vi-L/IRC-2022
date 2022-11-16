package frc.robot.commands;

public class AutoDrive {
    private Drivetrain drivetrain;

    private double leftSpeed, rightSpeed;

    public AutoDrive(Drivetrain dt, double ls, double rs) {
        drivetrain = dt;
        leftSpeed = ls;
        rightSpeed = rs;

        addRequirements(drivetrain);
    }

    
}
