import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase; 

public class Drive extends CommandBase {
    Drivetrain drivetrain;
    Joystick leftJoystick;
    Joystick rightJoystick;

    public Drive(Drivetrain dt, Joystick leftJ, Joystick rightJ) {
        drivetrain = dt;
        leftJoystick = leftJ;
        rightJoystick = rightJ;

        super.addRequirements(drivetrain);
    }

    public void execute() {
        drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
    }

    public void initialize() {
        drivetrain.stop();
    }

    public boolean isFinished() {
        return false;
    }
    public void end(boolean stop) {
        drivetrain.stop();
    }
}
