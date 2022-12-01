// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Arm;
import frc.robot.commands.Drive;
import frc.robot.commands.BasicAuto;
import frc.robot.commands.RotateArm;

public class Robot extends TimedRobot {
  private Joystick m_leftStick;
  private Joystick m_rightStick;
  JoystickButton upButton;
  JoystickButton downButton;

  Drivetrain drivetrain = new Drivetrain();
  Arm arm = new Arm();
  Drive drive = new Drive(drivetrain, m_leftStick, m_rightStick);
  BasicAuto basicauto = new BasicAuto(drivetrain);

  @Override
  public void robotInit() {
    /* TEMPLATE CODE: "We need to invert one side of the drivetrain so that positive voltages
    result in both sides moving forward. Depending on how your robot's
    gearbox is constructed, you might have to invert the left side instead."
    m_rightMotor.setInverted(true); */

    m_leftStick = new Joystick(0); //USB PORTS
    m_rightStick = new Joystick(1);

    upButton = new JoystickButton(m_leftStick, 1);
    downButton = new JoystickButton(m_rightStick, 1);

    upButton.whileActiveOnce(new RotateArm(arm, 1));
    downButton.whileActiveOnce(new RotateArm(arm, -0.75));
  }

  @Override
  public void teleopPeriodic() {
    drive.execute();
  }

  @Override
  public void teleopInit() {
    basicauto.end(false);
    drive.schedule();
    drive.initialize();
  }

  @Override
  public void autonomousInit() {
    drive.end(true);
    basicauto.schedule();
  }

  @Override
  public void autonomousPeriodic() {
    basicauto.execute();
  }
}
