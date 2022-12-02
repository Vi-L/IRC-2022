package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
// import frc.robot.commands.AutoDrive;

public class BasicAuto extends SequentialCommandGroup {
    private Drivetrain drivetrain;
    
    public BasicAuto(Drivetrain dt) {
        drivetrain = dt;
        // to turn, make one value positive and the other negative
        addCommands(
            new AutoDrive(drivetrain, -0.4, -0.4).withTimeout(2), // drive forwards for 2 seconds
            new AutoDrive(drivetrain, 0, 0) // stop
        );
    }
}
