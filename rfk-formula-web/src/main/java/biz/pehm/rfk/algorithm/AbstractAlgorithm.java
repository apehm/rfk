package biz.pehm.rfk.algorithm;

import java.math.BigDecimal;

import biz.pehm.rfk.exceptions.InvalidParameterException;
import biz.pehm.rfk.exceptions.MissingParameterException;

/**
 * Properties and behavior shared by all algorithms
 * @author apehm
 */
public abstract class AbstractAlgorithm {
    
    private String description;
    
    public abstract BigDecimal calculate() throws MissingParameterException, InvalidParameterException;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
