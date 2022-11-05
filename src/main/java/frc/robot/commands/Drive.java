import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase; 

public class Drive extends SubsystemBase {
    Drivetrain drivetrain;
    Joystick leftJoyStick;
    Joystick rightJoystick;

    public Drive(Drivetrain dt, Joystick leftJ, Joystick rightJ) {
        drivetrain = dt;
        leftJoyStick = leftJ;
        rightJoystick = rightJ;

        super.addRequirements(drivetrain);
    }

    public void execute() {
        drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
    }

    public void initialize() {
        drivetrain.stop();
    }

    boolean isFinished() {
        return false;
    }
    void end(boolean stop) {
        drivetrain.stop();
    }
}
