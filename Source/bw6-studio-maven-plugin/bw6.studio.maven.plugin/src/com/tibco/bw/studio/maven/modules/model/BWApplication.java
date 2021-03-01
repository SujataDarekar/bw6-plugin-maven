package com.tibco.bw.studio.maven.modules.model;

import com.tibco.bw.studio.maven.pom.builders.ApplicationPOMBuilder;
import com.tibco.bw.studio.maven.pom.builders.IPOMBuilder;

public class BWApplication extends BWModule 
{

	private BWDeploymentInfo deploymentInfo = new BWDeploymentInfo();
	private TCIDeploymentInfo tciDeploymentInfo = new TCIDeploymentInfo();
	private BWTestInfo testInfo = new BWTestInfo();
	
	public BWModuleType getType() 
	{
		return BWModuleType.Application;
	}

	public IPOMBuilder getPOMBuilder()
	{
		return new ApplicationPOMBuilder();
	}

	public BWDeploymentInfo getDeploymentInfo()
	{
		return deploymentInfo;
	}

	public void setDeploymentInfo(BWDeploymentInfo deploymentInfo)
	{
		this.deploymentInfo = deploymentInfo;
	}
	
	public TCIDeploymentInfo getTCIDeploymentInfo()
	{
		return tciDeploymentInfo;
	}

	public void setTCIDeploymentInfo(TCIDeploymentInfo tciDeploymentInfo)
	{
		this.tciDeploymentInfo = tciDeploymentInfo;
	}
	
	public BWTestInfo getTestInfo() 
	{
		return testInfo;
	}
	public void setTestInfo(BWTestInfo testInfo) 
	{
		this.testInfo = testInfo;
	}
}
