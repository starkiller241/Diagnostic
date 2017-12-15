package org.usfirst.frc.team2473.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2473.robot.subsystems.MotorSubsystem;
import org.usfirst.frc.team2473.test.Instances;

/**
 *
 */
public class Type1AutoCommand extends Command {
	private MotorSubsystem sub;
	
	public Type1AutoCommand() {
		sub = (MotorSubsystem)Instances.getInstanceOf(MotorSubsystem.class);
		requires(sub);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		sub.run();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		sub.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}