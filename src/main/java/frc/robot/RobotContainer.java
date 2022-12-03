package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.AutoDrive;
import frc.robot.commands.BasicAuto;
import frc.robot.commands.Drive;
import frc.robot.commands.RotateArm;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {
    private Joystick m_leftStick = new Joystick(0);
    private Joystick m_rightStick = new Joystick(1);
    JoystickButton upButton = new JoystickButton(m_leftStick, 1);;
    JoystickButton downButton = new JoystickButton(m_rightStick, 1);

    Drivetrain drivetrain = new Drivetrain();
    Arm arm = new Arm();
    Drive drive = new Drive(drivetrain, m_leftStick, m_rightStick);
    BasicAuto basicauto = new BasicAuto(drivetrain);
    RotateArm rotateArm = new RotateArm(arm, 0.5);

  public RobotContainer() {
    drivetrain.setDefaultCommand(drive);
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    upButton.whenHeld(new RotateArm(arm, 0.8));
    downButton.whenHeld(new RotateArm(arm, -0.65));
  }

  public Command getAutonomousCommand() {
    return basicauto;
  }
}