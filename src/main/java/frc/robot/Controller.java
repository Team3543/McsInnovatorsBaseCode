package frc.robot;
import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    public static XboxController mainController = new XboxController(Constants.controllerConstants.Xbox_Port);
    public static double rightTrigger, leftTrigger;
    public static double Xnum1 (double imputXnum){
        if (Math.abs(imputXnum) < Constants.controllerConstants.Xbox_Deadzone){
            return 0;
        }
        else {
            return 0.8 * imputXnum;
        }

}
}
