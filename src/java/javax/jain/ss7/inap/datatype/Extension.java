/*
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Copyrights:
 *
 *  Copyright - 1999 Sun Microsystems, Inc. All rights reserved.
 *  901 San Antonio Road, Palo Alto, California 94043, U.S.A.
 *
 *  This product and related documentation are protected by copyright and
 *  distributed under licenses restricting its use, copying, distribution, and
 *  decompilation. No part of this product or related documentation may be
 *  reproduced in any form by any means without prior written authorization of
 *  Sun and its licensors, if any.
 *
 *  RESTRICTED RIGHTS LEGEND: Use, duplication, or disclosure by the United
 *  States Government is subject to the restrictions set forth in DFARS
 *  252.227-7013 (c)(1)(ii) and FAR 52.227-19.
 *
 *  The product described in this manual may be protected by one or more U.S.
 *  patents, foreign patents, or pending applications.
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Author:
 *
 *  Mahindra British Telecom
 *  155 , Bombay - Pune Road 
 *  Pimpri ,
 *  Pune - 411 018.
 *
 *  Module Name   : JAIN INAP API
 *  File Name     : Extension.java
 *  Approver      : Jain Inap Edit Group
 *  Version       : 1.0
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.jain.ss7.inap.datatype;


import java.io.*;
import java.util.*;
import java.lang.*;
import javax.jain.ss7.inap.constants.*;

/**
This class represents the Extension DataType
*/

public class Extension implements Serializable
{ 
	
	private int integerType;

	private boolean booleanType;
	
	private String stringType;
	
	private ExtensionChoice extensionChoice;

//Choice
/**
Constructors For Extension
*/
	public Extension(int integerType)
	{
		setIntegerType(integerType);
	}

	public Extension(boolean booleanType)
	{
		setBooleanType(booleanType);
	}

	public Extension(String stringType)
	{
		setStringType(stringType);
	}

//---------------------------------------------	

/**
Gets Integer Type data
*/
	public int getIntegerType()
    	{
        		return integerType;
    	}
/**
Sets Integer Type data
*/
	public void setIntegerType(int integerType)
    	{
        		this.integerType = integerType;
	      	this.extensionChoice = ExtensionChoice.INTEGER_TYPE;

    	}


//---------------------------------------------	

/**
Gets Boolean Type data
*/
	public boolean getBooleanType()
    	{
        		return booleanType;
    	}
/**
Sets Boolean  Type data
*/
	public void setBooleanType(boolean booleanType)
    	{
        		this.booleanType = booleanType;
				this.extensionChoice = ExtensionChoice.BOOLEAN_TYPE;

    	}


//---------------------------------------------	

/**
Gets String Type data
*/
	public String getStringType()
    	{
        		return stringType;
    	}
/**
Sets String Type data
*/
	public void setStringType(String stringType)
    	{
        		this.stringType = stringType;
	      	this.extensionChoice = ExtensionChoice.STRING_TYPE;

    	}

//-----------------------

/**
Gets the Extension Type
*/

	public ExtensionChoice getExtensionChoice()
	{
		return extensionChoice;
	}
//-----------------------

}