/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc151.DeepSpace2019.subsystems;
import edu.wpi.cscore.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * Add your docs here.
 */
public class USBCamera extends Subsystem{
    
    public void cameraSwitch (UsbCamera cam, MjpegServer server){

        //server.setSource(cam);
        NetworkTableEntry entry = NetworkTableInstance.getDefault().getTable("").getEntry("Camera Selection");
        entry.setValue(cam.getName());

    }   
@Override
    public void initDefaultCommand() {

    }
}  