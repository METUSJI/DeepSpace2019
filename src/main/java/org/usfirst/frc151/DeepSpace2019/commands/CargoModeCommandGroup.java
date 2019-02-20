/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc151.DeepSpace2019.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CargoModeCommandGroup extends CommandGroup {
  /**
   * Add your docs here.
   */
  public CargoModeCommandGroup() {
    addParallel(new CargoDriveCommand());
    addParallel(new SwitchToCargoCamCommand());
  }
}
