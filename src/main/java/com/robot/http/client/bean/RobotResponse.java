package com.robot.http.client.bean;

public class RobotResponse implements java.io.Serializable {
	private RobotCommand[] commands;

	private java.lang.String content;

	private java.lang.String moduleId;

	private java.lang.String nodeId;

	private java.lang.String[] relatedQuestions;

	private float similarity;

	private java.lang.String[] tags;

	private int type;

	public RobotResponse() {
	}

	public RobotResponse(RobotCommand[] commands, java.lang.String content, java.lang.String moduleId,
			java.lang.String nodeId, java.lang.String[] relatedQuestions, float similarity, java.lang.String[] tags,
			int type) {
		this.commands = commands;
		this.content = content;
		this.moduleId = moduleId;
		this.nodeId = nodeId;
		this.relatedQuestions = relatedQuestions;
		this.similarity = similarity;
		this.tags = tags;
		this.type = type;
	}

	/**
	 * Gets the commands value for this RobotResponse.
	 * 
	 * @return commands
	 */
	public RobotCommand[] getCommands() {
		return commands;
	}

	/**
	 * Sets the commands value for this RobotResponse.
	 * 
	 * @param commands
	 */
	public void setCommands(RobotCommand[] commands) {
		this.commands = commands;
	}

	public RobotCommand getCommands(int i) {
		return this.commands[i];
	}

	public void setCommands(int i, RobotCommand _value) {
		this.commands[i] = _value;
	}

	/**
	 * Gets the content value for this RobotResponse.
	 * 
	 * @return content
	 */
	public java.lang.String getContent() {
		return content;
	}

	/**
	 * Sets the content value for this RobotResponse.
	 * 
	 * @param content
	 */
	public void setContent(java.lang.String content) {
		this.content = content;
	}

	/**
	 * Gets the moduleId value for this RobotResponse.
	 * 
	 * @return moduleId
	 */
	public java.lang.String getModuleId() {
		return moduleId;
	}

	/**
	 * Sets the moduleId value for this RobotResponse.
	 * 
	 * @param moduleId
	 */
	public void setModuleId(java.lang.String moduleId) {
		this.moduleId = moduleId;
	}

	/**
	 * Gets the nodeId value for this RobotResponse.
	 * 
	 * @return nodeId
	 */
	public java.lang.String getNodeId() {
		return nodeId;
	}

	/**
	 * Sets the nodeId value for this RobotResponse.
	 * 
	 * @param nodeId
	 */
	public void setNodeId(java.lang.String nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * Gets the relatedQuestions value for this RobotResponse.
	 * 
	 * @return relatedQuestions
	 */
	public java.lang.String[] getRelatedQuestions() {
		return relatedQuestions;
	}

	/**
	 * Sets the relatedQuestions value for this RobotResponse.
	 * 
	 * @param relatedQuestions
	 */
	public void setRelatedQuestions(java.lang.String[] relatedQuestions) {
		this.relatedQuestions = relatedQuestions;
	}

	public java.lang.String getRelatedQuestions(int i) {
		return this.relatedQuestions[i];
	}

	public void setRelatedQuestions(int i, java.lang.String _value) {
		this.relatedQuestions[i] = _value;
	}

	/**
	 * Gets the similarity value for this RobotResponse.
	 * 
	 * @return similarity
	 */
	public float getSimilarity() {
		return similarity;
	}

	/**
	 * Sets the similarity value for this RobotResponse.
	 * 
	 * @param similarity
	 */
	public void setSimilarity(float similarity) {
		this.similarity = similarity;
	}

	/**
	 * Gets the tags value for this RobotResponse.
	 * 
	 * @return tags
	 */
	public java.lang.String[] getTags() {
		return tags;
	}

	/**
	 * Sets the tags value for this RobotResponse.
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
	 * Gets the type value for this RobotResponse.
	 * 
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * Sets the type value for this RobotResponse.
	 * 
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
}