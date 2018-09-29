package com.robot.http.client.bean;

public class RobotCommand implements java.io.Serializable {
	private java.lang.String[] argNames;

	private java.lang.String[] args;

	private java.lang.String name;

	private int state;

	public RobotCommand() {
	}

	public RobotCommand(java.lang.String[] argNames, java.lang.String[] args, java.lang.String name, int state) {
		this.argNames = argNames;
		this.args = args;
		this.name = name;
		this.state = state;
	}

	/**
	 * Gets the argNames value for this RobotCommand.
	 * 
	 * @return argNames
	 */
	public java.lang.String[] getArgNames() {
		return argNames;
	}

	/**
	 * Sets the argNames value for this RobotCommand.
	 * 
	 * @param argNames
	 */
	public void setArgNames(java.lang.String[] argNames) {
		this.argNames = argNames;
	}

	public java.lang.String getArgNames(int i) {
		return this.argNames[i];
	}

	public void setArgNames(int i, java.lang.String _value) {
		this.argNames[i] = _value;
	}

	/**
	 * Gets the args value for this RobotCommand.
	 * 
	 * @return args
	 */
	public java.lang.String[] getArgs() {
		return args;
	}

	/**
	 * Sets the args value for this RobotCommand.
	 * 
	 * @param args
	 */
	public void setArgs(java.lang.String[] args) {
		this.args = args;
	}

	public java.lang.String getArgs(int i) {
		return this.args[i];
	}

	public void setArgs(int i, java.lang.String _value) {
		this.args[i] = _value;
	}

	/**
	 * Gets the name value for this RobotCommand.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this RobotCommand.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the state value for this RobotCommand.
	 * 
	 * @return state
	 */
	public int getState() {
		return state;
	}

	/**
	 * Sets the state value for this RobotCommand.
	 * 
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
	}
}