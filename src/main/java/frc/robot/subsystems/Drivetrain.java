package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Drivetrain extends SubsystemBase {
    private VictorSP leftVictor, rightVictor;

    public Drivetrain() {
        leftVictor = new VictorSP(0); // TODO: fix port numbers
        rightVictor = new VictorSP(1);
        rightVictor.setInverted(true);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftVictor.set(leftSpeed);
        rightVictor.set(rightSpeed);
    }

    public void stop() {
        leftVictor.set(0);
        rightVictor.set(0);
    }
}