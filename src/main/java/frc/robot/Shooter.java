package frc.robot;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants.shooterConstants;

public class Shooter {
    static CANSparkMax shooterLeft = new CANSparkMax(shooterConstants.shooterLeft, MotorType.kBrushless);
    static CANSparkMax shooterRight = new CANSparkMax(shooterConstants.shooterRight, MotorType.kBrushless);
    static Joystick mainController = new Joystick(0);
public static void shooterControls(){
    boolean fasterShot = mainController.getTrigger();
    boolean reverseShot = mainController.getTrigger();
    if (fasterShot == true){
        shooterLeft.set(1);
        shooterRight.set(-1);
    } else if (reverseShot == true ) {
        shooterLeft.set(-1);
        shooterRight.set(1);  
    } else {
        shooterLeft.set(0);
        shooterRight.set(0);
    }
}
}
