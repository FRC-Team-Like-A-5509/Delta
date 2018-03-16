// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5509.Delta.subsystems;

import org.usfirst.frc5509.Delta.RobotMap;
import org.usfirst.frc5509.Delta.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class IntakeDrive extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX intakeMotor1 = RobotMap.intakeDriveintakeMotor1;
    private final WPI_TalonSRX intakeMotor2 = RobotMap.intakeDriveintakeMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	private static final double intakeSpeed = -1;
	private static final double outtakeSpeed = 1;

	@Override
	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new TriggerIntake());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	@Override
	public void periodic() {
		// Put code here to be run every loop

	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void intake() {
		intakeMotor1.set(intakeSpeed);
		intakeMotor2.set(intakeSpeed);
	}

	public void intake(double power) {
		intakeMotor1.set(power);
		intakeMotor2.set(power);
	}

	public void outtake() {
		intakeMotor1.set(outtakeSpeed);
		intakeMotor2.set(outtakeSpeed);
	}

	public void outtake(double power) {
		intakeMotor1.set(power);
		intakeMotor2.set(power);
	}

	public void stop() {
		intakeMotor1.set(0);
		intakeMotor2.set(0);
	}

}
