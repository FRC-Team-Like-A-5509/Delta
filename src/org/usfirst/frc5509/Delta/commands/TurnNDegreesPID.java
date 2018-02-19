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

import edu.wpi.first.wpilibj.command.PIDCommand;
import org.usfirst.frc5509.Delta.Robot;
import org.usfirst.frc5509.Delta.RobotMap;

/**
 *
 */
public class TurnNDegreesPID extends PIDCommand {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private double m_degrees;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public TurnNDegreesPID(double degrees) {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("TurnNDegreesPID", 0.0025, 0.0, 0.0, 0.02);
        getPIDController().setInputRange(0.0, 360.0);
        getPIDController().setOutputRange(-0.7, 0.7);
        getPIDController().setContinuous(true);
        getPIDController().setAbsoluteTolerance(7.0);
      

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		m_degrees = degrees;

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	@Override
	protected double returnPIDInput() {
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;

		return Robot.driveTrain.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);

		Robot.driveTrain.turn(output);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		double desiredDegrees = Robot.driveTrain.getAngle() + m_degrees;
		desiredDegrees %= 360;
		if (desiredDegrees < 0) {
			desiredDegrees += 360;
		}
		this.setSetpoint(desiredDegrees);
		this.setTimeout(2.5);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return this.getPIDController().onTarget() || this.isTimedOut();
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
