// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5509.Delta;

import org.usfirst.frc5509.Delta.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc5509.Delta.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joystick1;
    public JoystickButton joystickButton1;
    public JoystickButton joystickButton2;
    public JoystickButton joystickButton3;
    public JoystickButton joystickButton4;
    public JoystickButton joystickButton5;
    public JoystickButton joystickButton6;
    public Joystick joystick2;
    public Joystick joystick3;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public SendableChooser driveMode;

	public OI() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick3 = new Joystick(2);
        
        joystick2 = new Joystick(1);
        
        joystickButton6 = new JoystickButton(joystick2, 2);
        joystickButton6.whileHeld(new EndGameBackwards());
        joystickButton5 = new JoystickButton(joystick2, 3);
        joystickButton5.whileHeld(new EndGameForwards());
        joystickButton4 = new JoystickButton(joystick2, 4);
        joystickButton4.whileHeld(new OuttakeMove());
        joystickButton3 = new JoystickButton(joystick2, 1);
        joystickButton3.whileHeld(new IntakeMove());
        joystickButton2 = new JoystickButton(joystick2, 6);
        joystickButton2.whileHeld(new OuttakeMove());
        joystickButton1 = new JoystickButton(joystick2, 5);
        joystickButton1.whileHeld(new IntakeMove());
        joystick1 = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("HaloDrive", new HaloDrive());
        SmartDashboard.putData("ClaytonDrive", new ClaytonDrive());
        SmartDashboard.putData("DriveXFeetTimed: fiveFeet", new DriveXFeetTimed(5));
        SmartDashboard.putData("DriveXFeetTimed: tenFeet", new DriveXFeetTimed(10));
        SmartDashboard.putData("turnNDegreesTimed: ninety", new turnNDegreesTimed(90));
        SmartDashboard.putData("turnNDegreesTimed: oneEighty", new turnNDegreesTimed(180));
        SmartDashboard.putData("turnNDegreesTimed: negativeNinety", new turnNDegreesTimed(-90));
        SmartDashboard.putData("LeftStart", new LeftStart());
        SmartDashboard.putData("RightStart", new RightStart());
        SmartDashboard.putData("LeftRunSame", new LeftRunSame());
        SmartDashboard.putData("LeftRunOpposite", new LeftRunOpposite());
        SmartDashboard.putData("RightRunSame", new RightRunSame());
        SmartDashboard.putData("RightRunOpposite", new RightRunOpposite());
        SmartDashboard.putData("strafeXFeetTimed: FiveFeet", new strafeXFeetTimed(5));
        SmartDashboard.putData("OuttakeMove", new OuttakeMove());
        SmartDashboard.putData("IntakeMove", new IntakeMove());
        SmartDashboard.putData("UpDown", new UpDown());
        SmartDashboard.putData("TriggerIntake", new TriggerIntake());
        SmartDashboard.putData("TurnNDegreesBangBang: ninety", new TurnNDegreesBangBang(90));
        SmartDashboard.putData("TurnNDegreesPID: ninety", new TurnNDegreesPID(90));
        SmartDashboard.putData("DriveXFeetPID: five", new DriveXFeetPID(5));
        SmartDashboard.putData("TankDrive", new TankDrive());
        SmartDashboard.putData("DriveCG", new DriveCG());
        SmartDashboard.putData("LeftForwards", new LeftForwards());
        SmartDashboard.putData("RightForwards", new RightForwards());
        SmartDashboard.putData("RunForwards", new RunForwards());
        SmartDashboard.putData("UpTimed: upXInches", new UpTimed(0));
        SmartDashboard.putData("UpTimed: upTenInches", new UpTimed(10));
        SmartDashboard.putData("CenterStart", new CenterStart());
        SmartDashboard.putData("CenterSame", new CenterSame());
        SmartDashboard.putData("EndGameForwards", new EndGameForwards());
        SmartDashboard.putData("OuttakeTimed: startOutTime", new OuttakeTimed(0));
        SmartDashboard.putData("EndGameBackwards", new EndGameBackwards());
        SmartDashboard.putData("EndGameStick", new EndGameStick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		SmartDashboard.putData(Robot.driveTrain);
		driveMode = new SendableChooser();
		driveMode.addDefault("HaloDrive", "halo");
		driveMode.addObject("TankDrive", "tank");
		driveMode.addObject("ClaytonDrive", "clayton");

		SmartDashboard.putData("Drive Mode", driveMode);
		
		SmartDashboard.putNumber("xfeettimedfast", 2.4);
		SmartDashboard.putNumber("xfeettimedspeed", 0.42);
		
		SmartDashboard.putNumber("x percent voltage speed, intake", 1);
		SmartDashboard.putNumber("x percent voltage speed, outake", -1);
		
		SmartDashboard.putNumber("preset lift speed", .5);
		
		SmartDashboard.putNumber(LiftDrive.AUTONOMOUS_LIFT_SPEED_KEY, LiftDrive.AUTONOMOUS_LIFT_SPEED_DEFAULT);
		SmartDashboard.putNumber(LiftDrive.AUTONOMOUS_LIFT_SECONDSPERINCHES_KEY, LiftDrive.AUTONOMOUS_LIFT_SECONDSPERINCHES_DEFAULT);
		
		SmartDashboard.putNumber(DriveTrain.AUTONOMOUS_DRIVE_SPEED_KEY, DriveTrain.AUTONOMOUS_DRIVE_SPEED_DEFAULT);
		SmartDashboard.putNumber(DriveTrain.AUTONOMOUS_DRIVE_SECONDSPERFOOT_KEY, DriveTrain.AUTONOMOUS_DRIVE_SECONDSPERFOOT_DEFAULT);
	}

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }

    public Joystick getJoystick3() {
        return joystick3;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
