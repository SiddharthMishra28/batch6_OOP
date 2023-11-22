package com.gyanoholic.oopdemo3;

public abstract class AbstractCompute {
	
	String processId;
	String osEnvironmentVariables;
	MachineSpecification machineSpecification;
	
	public AbstractCompute(MachineSpecification ms) {
		this.machineSpecification = ms;
	}
	
	abstract void startProcessing();
	
	abstract void allocateMemory();
}
