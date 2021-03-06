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
import org.usfirst.frc5509.Delta.subsystems.DriveTrain;

/**
 *
 */
public class DriveXFeetTimed extends Command {
	// TODO: Calculate correct seconds per foot
	//private double fast;
	private double speed;
	private double secondsPerFoot;
	//private double powerToDrive;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private double m_distanceInFeet;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public DriveXFeetTimed(double distanceInFeet) {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		m_distanceInFeet = distanceInFeet;

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
		
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		secondsPerFoot = SmartDashboard.getNumber(DriveTrain.AUTONOMOUS_DRIVE_SECONDSPERFOOT_KEY, DriveTrain.AUTONOMOUS_DRIVE_SECONDSPERFOOT_DEFAULT);
		speed = SmartDashboard.getNumber(DriveTrain.AUTONOMOUS_DRIVE_SPEED_KEY, DriveTrain.AUTONOMOUS_DRIVE_SPEED_DEFAULT);
		//secondsPerFoot = .50 / fast;
		//powerToDrive = speed;
		this.setTimeout(secondsPerFoot * Math.abs(m_distanceInFeet));
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.driveTrain.drive(speed * Math.signum(m_distanceInFeet));
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return this.isTimedOut();
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
