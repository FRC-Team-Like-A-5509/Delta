# Delta Commands 2018

## Autonomous Commands
1. RunForwards
    1. Command Group
    2. Crosses the line
#### Center Autons
1. CenterSwitchStart
    1. Autonomous Chooser
    2. Chooses either CenterRight or CenterLeft
2. CenterRight
    1. Command Group
    2. Goes for right side of home switch if chosen
3. CenterLeft
    1. Command Group
    2. Goes for left side of home switch if chosen
4. CenterSame
    1. Deprecated class
    2. Command Group
    3. Originally meant to run right into switch and drop if the right side. Deprecated in favor of CenterRight and CenterLeft
5. CenterStartLeft
    1. Deprecated Class
    2. Autonomous Chooser
    3. Originally meant to go for left switch starting on left switch side. Deprecated in favor of CenterSwitchStart
6. CenterStartRight
    1. Deprecated Class
    2. Autonomous Chooser
    3. Originally meant to go for right switch starting on right switch side. Deprecated in favor of CenterSwitchStart
#### Left Autons
1. LeftForwards
    1. Autonomous Chooser
    2. Starts on left side, goes for switch. If not correct switch, crosses line.
    3. Chooses either LeftRunSame or Runforwards
2. LeftRunOpposite
    1. Command Group
    2. Goes for right side of switch if chosen
3. LeftRunSame
    1. Command Group
    2. Goes for left side of the switch if chosen
4. LeftRunScale
    1. Command Group
    2. Goes for left side of scale if chosen
5. LeftStart
    1. Autonomous Chooser
    2. Starts on left, goes for either side of the switch
    3. Chooses either LeftRunSame or LeftRunOpposite
6. LeftStartScale
    1. Autonomous Chooser
    2. Starts on left, can choose to go for scale
    3. Chooses either LeftRunScale or LeftSwitchStart
7. LeftSwitchStart
    1. Autonomous Chooser
    2. Starts on left, chooses to either go for switch or not
    3. Chooses either LeftRunSame or RunForwards
#### Right Autons
1. RightForwards
    1. Autonomous Chooser
    2. Starts on right, goes either for switch or not
    3. Chooses either RightRunSame or RunForwards
2. RightRunOpposite
    1. Command Group
    2. Goes for left side of switch if chosen
3. RightRunSame
    1. Command Group
    2. Goes for right side of switch, starting on right side if chosen
4. RightRunScale
    1. Command Group
    2. Goes for right side of scale, starting on right side.
5. Right Start
    1. Autonomous Chooser
    2. Starts on right, goes for either side of switch
    3. Chooses either RightRunSame or RightRunOpposite
6. RightStartScale
    1. Autonomous Chooser
    2. Starts on right, goes for either switch or scale
    3. Chooses either RightRunScale or RightSwitchStart
7. RightSwitchScale
    1. Autonomous Chooser
    2. goes for same side of switch or cross line
    3. Chooses either RightRunSame or RunForwards
### Autonomous Teleop Commands
#### Driving Auton Commands
1. turnNDegreesTimed
    1. Command Group
    2. Turns n degrees
2. TurnNDegreesBangBang
    1. Command Group
    2. Turns n degrees, if overturns tries to correct itself
3. DriveXFeetTimed
    1. Command Group
    2. Drives x feet
4. DriveWait
    1. Command Group
    2. Pauses drive
5. strafeXFeetTimed
    1. Command
    2. Strafes x feet
#### Other Auton Commands
1. UpTimed
    1. Command
    2. Raises lift some amount
 2. OuttakeTimed
    1. Command
    2. Spins outtake motors



