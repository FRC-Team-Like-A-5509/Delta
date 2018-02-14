// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5509.Delta.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc5509.Delta.Robot;

/**
 *
 */
public class HaloDrive extends Command {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public HaloDrive() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

		SmartDashboard.putNumber("leftbumperfiness", 0.5);
		SmartDashboard.putNumber("rightbumperfiness", 1);
		SmartDashboard.putNumber("nobumperfiness", .75);
		SmartDashboard.putNumber("allbumperfiness", .375);

	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double forward;
		double turn;
		double strafe;

		forward = Robot.oi.getJoystick1().getRawAxis(1);
		strafe = Robot.oi.getJoystick1().getRawAxis(0);
		turn = Robot.oi.getJoystick1().getRawAxis(4);

		if (Math.abs(forward) < .2) {
			forward = 0;
		}
		if (Math.abs(turn) < .2) {
			turn = 0;
		}
		if (Math.abs(strafe) < .2) {
			strafe = 0;
		}
		double multiplier = SmartDashboard.getNumber("nobumberfiness", 0.75);
		
		
		
		if (Robot.oi.joystick1.getRawButton(5)) {
			multiplier = SmartDashboard.getNumber("leftbumperfiness", 0.5);
		}

		if (Robot.oi.joystick1.getRawButton(6)) {
			multiplier = SmartDashboard.getNumber("rightbumperfiness", 1);
		}
		
		if(Robot.oi.joystick1.getRawButton(5) &&Robot.oi.joystick1.getRawButton(6)) {
			multiplier = SmartDashboard.getNumber("allbumperfiness", .375);
		}

		forward *= multiplier;
		strafe *= multiplier;
		turn *= multiplier;

		Robot.driveTrain.DriveMecanum(-forward, -turn, strafe);
	
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		//return  Robot.oi.driveMode.getSelected().equals("halo");
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.driveTrain.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
