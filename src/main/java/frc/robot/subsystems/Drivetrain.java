package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Drivetrain extends SubsystemBase {
    private VictorSP leftVictor, rightVictor;

    public Drivetrain() {
        leftVictor = new VictorSP(8); // port 8 is motor controller for left motor
        rightVictor = new VictorSP(7); // port 7 is motor controller for right motor
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