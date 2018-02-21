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

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class DriveTrain extends Subsystem {
	public static final String AUTONOMOUS_DRIVE_SPEED_KEY = "Drive Train Autonomous speed" ;
	public static final Double AUTONOMOUS_DRIVE_SPEED_DEFAULT = .50 ; 
	
	public static final String AUTONOMOUS_DRIVE_SECONDSPERFOOT_KEY = "Drive Train Autonomous seconds per foot" ;
	public static final Double AUTONOMOUS_DRIVE_SECONDSPERFOOT_DEFAULT = .16 ; 
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX backLeftMotor = RobotMap.driveTrainbackLeftMotor;
    private final WPI_TalonSRX frontLeftMotor = RobotMap.driveTrainfrontLeftMotor;
    private final WPI_TalonSRX frontRightMotor = RobotMap.driveTrainfrontRightMotor;
    private final WPI_TalonSRX backRightMotor = RobotMap.driveTrainbackRightMotor;
    private final MecanumDrive mecanumDrive = RobotMap.driveTrainmecanumDrive;
    private final AnalogGyro dONOTUSE = RobotMap.driveTrainDONOTUSE;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    private final ADXRS450_Gyro gyro = RobotMap.gyro;

	@Override
	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new HaloDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        
        
        
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	@Override
	public void periodic() {
		// Put code here to be run every loop

	}

	public void DriveMecanum(double forward, double turn, double strafe) {
		mecanumDrive.driveCartesian(strafe, forward, turn, 0);//gyro.getAngle());
		//mecanumDrive.setDeadband(.4);
		//mecanumDrive.setMaxOutput(.7);
		
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void drive(double power) {
		DriveMecanum(power, 0, 0);
	}

	public void turn(double power) {
		DriveMecanum(0, power, 0);
	}
	public void strafe(double power) {
		DriveMecanum(0, 0, power);
	}
	public void stop() {
		DriveMecanum(0, 0, 0);
	}
	
	public double getAngle() {
		double angle = gyro.getAngle();
		angle = angle % 360;
		if(angle < 0) {
			angle = 360 + angle;
		}
		return angle;
	}

}
