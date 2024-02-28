package frc.robot;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.driveConstants;
import com.ctre.phoenix.motorcontrol;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
public class Drive {
    static WPI_TalonSRX leftMotor = new WPI_TalonSRX(driveConstants.leftMotor);
    static WPI_TalonSRX rightMotor = new WPI_TalonSRX(driveConstants.rightMotor);
    static WPI_TalonSRX followLeftMotor = new WPI_TalonSRX(driveConstants.followLeftMotor);
    static WPI_TalonSRX followRightMotor = new WPI_TalonSRX(driveConstants.followRightMotor);
    static DifferentialDrive m_robotDrive = new DifferentialDrive(leftMotor::set, rightMotor::set);
    static Joystick mainController = new Joystick(0);

public static void prepareDrive(){
    leftMotor.setInverted(true);
    followLeftMotor.follow(leftMotor);
    followRightMotor.follow(rightMotor);
}
public static void differentialStart(){
    SendableRegistry.addChild(m_robotDrive, leftMotor);
    SendableRegistry.addChild(m_robotDrive, rightMotor);
}
public static void startDrive(){
    m_robotDrive.arcadeDrive(-mainController.getRawAxis(2), -mainController.getRawAxis(3));
}
}
