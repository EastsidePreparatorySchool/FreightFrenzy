
package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.RevIMU;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {

    HardwareMap hMap;
    public YellowJacket19_2 leftFront = null;
    public YellowJacket19_2 rightFront = null;
    public YellowJacket19_2 leftBack = null;
    public YellowJacket19_2 rightBack = null;
    RevIMU revIMU;

    public RobotHardware() {
    }

    public void init(HardwareMap hMap) {
        leftFront = new YellowJacket19_2(hMap, "LF");
        rightFront = new YellowJacket19_2(hMap, "RF");
        leftBack = new YellowJacket19_2(hMap, "LB");
        rightBack = new YellowJacket19_2(hMap, "RB");

        revIMU = new RevIMU(hMap);
        revIMU.init();
    }

}
