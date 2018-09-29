package com.robot.http.client.bean;

public class RobotRequest implements java.io.Serializable {
	private UserAttribute[] attributes;

	private int maxReturn;

	private java.lang.String[] modules;

	private java.lang.String question;

	private java.lang.String sessionId;

	private java.lang.String[] tags;

	private java.lang.String userId;

	public RobotRequest() {
	}

	public RobotRequest(UserAttribute[] attributes, int maxReturn, java.lang.String[] modules, java.lang.String question,
			java.lang.String sessionId, java.lang.String[] tags, java.lang.String userId) {
		this.attributes = attributes;
		this.maxReturn = maxReturn;
		this.modules = modules;
		this.question = question;
		this.sessionId = sessionId;
		this.tags = tags;
		this.userId = userId;
	}

	/**
	 * Gets the attributes value for this RobotRequest.
	 * 
	 * @return attributes
	 */
	public UserAttribute[] getAttributes() {
		return attributes;
	}

	/**
	 * Sets the attributes value for this RobotRequest.
	 * 
	 * @param attributes
	 */
	public void setAttributes(UserAttribute[] attributes) {
		this.attributes = attributes;
	}

	public UserAttribute getAttributes(int i) {
		return this.attributes[i];
	}

	public void setAttributes(int i, UserAttribute _value) {
		this.attributes[i] = _value;
	}

	/**
	 * Gets the maxReturn value for this RobotRequest.
	 * 
	 * @return maxReturn
	 */
	public int getMaxReturn() {
		return maxReturn;
	}

	/**
	 * Sets the maxReturn value for this RobotRequest.
	 * 
	 * @param maxReturn
	 */
	public void setMaxReturn(int maxReturn) {
		this.maxReturn = maxReturn;
	}

	/**
	 * Gets the modules value for this RobotRequest.
	 * 
	 * @return modules
	 */
	public java.lang.String[] getModules() {
		return modules;
	}

	/**
	 * Sets the modules value for this RobotRequest.
	 * 
	 * @param modules
	 */
	public void setModules(java.lang.String[] modules) {
		this.modules = modules;
	}

	public java.lang.String getModules(int i) {
		return this.modules[i];
	}

	public void setModules(int i, java.lang.String _value) {
		this.modules[i] = _value;
	}

	/**
	 * Gets the question value for this RobotRequest.
	 * 
	 * @return question
	 */
	public java.lang.String getQuestion() {
		return question;
	}

	/**
	 * Sets the question value for this RobotRequest.
	 * 
	 * @param question
	 */
	public void setQuestion(java.lang.String question) {
		this.question = question;
	}

	/**
	 * Gets the sessionId value for this RobotRequest.
	 * 
	 * @return sessionId
	 */
	public java.lang.String getSessionId() {
		return sessionId;
	}

	/**
	 * Sets the sessionId value for this RobotRequest.
	 * 
	 * @param sessionId
	 */
	public void setSessionId(java.lang.String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Gets the tags value for this RobotRequest.
	 * 
	 * @return tags
	 */
	public java.lang.String[] getTags() {
		return tags;
	}

	/**
	 * Sets the tags value for this RobotRequest.
	 * 
	 * @param tags
	 */
	public void setTags(java.lang.String[] tags) {
		this.tags = tags;
	}

	public java.lang.String getTags(int i) {
		return this.tags[i];
	}

	public void setTags(int i, java.lang.String _value) {
		this.tags[i] = _value;
	}

	/**
	 * Gets the userId value for this RobotRequest.
	 * 
	 * @return userId
	 */
	public java.lang.String getUserId() {
		return userId;
	}

	/**
	 * Sets the userId value for this RobotRequest.
	 * 
	 * @param userId
	 */
	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
}