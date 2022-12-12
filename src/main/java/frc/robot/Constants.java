package frc.robot;

public final class Constants {
    //1678 citrus circutis
    // public static final double kJoystickThreshold = 0.2;
    // public static final int kMainTurnJoystickPort = 0;
    // public static final int kMainThrottleJoystickPort = 1;
    // public static final int kButtonGamepadPort = 2;
    // public static final double kDriveWheelTrackWidthInches = 31.170; //change this
    // public static final double kTrackScrubFactor = 1.0; // Tune me!

    //can spark and drive
    public static final int kLeftDriveMasterId = 4; //all ids are prone to change
    public static final int kLeftDriveSlaveId1 = 5;
    public static final int kLeftDriveSlaveId2 = 6;
    public static final int kRightDriveMasterId = 1;
    public static final int kRightDriveSlaveId1 = 2;
    public static final int kRightDriveSlaveId2 = 3;
    public static final double kDriveVoltageRampRate = 0.0;

    //control board
    public static final boolean kUseDriveGamepad = false; //prone to change
    public static final double kJoystickThreshold = 0.2;
    public static final int kButtonGamepadPort = 2;//prone to change
    public static final int kMainTurnJoystickPort = 1; //prone to change
    public static final int kMainThrottleJoystickPort = 0; //prone to change
    public static final int kDriveGamepadPort = 0;
   

    //kinematics
    public static final double kTrackScrubFactor = 1.0469745223;
    public static final double kDriveWheelTrackWidthInches = 25.54; //prone to change

    //dayum a lot of stuff is prone to change 
}
