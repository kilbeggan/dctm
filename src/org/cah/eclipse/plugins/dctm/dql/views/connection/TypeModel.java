/*-
 * $Log: TypeModel.java,v $
 * Revision 1.8  2005/12/04 22:14:40  madcook
 * New code formatting settings and all 3.0.0 resources to date added.
 *
 * Revision 1.7  2005/12/04 20:29:12  madcook
 * Version 3.0.0 work started.
 *
 * Revision 1.6  2005/03/25 09:21:38  harpechr
 * Version 2.0.0 code that has implemented the new java 1.5 features.
 *
 * Revision 1.5  2005/02/09 14:01:31  harpechr
 * Version 1.0.5 work started.
 *
 * Revision 1.4  2005/01/24 12:34:54  harpechr
 * Version 1.0.4 work started.
 *
 * Revision 1.3  2005/01/11 14:02:01  harpechr
 * Changed version number from 1.0.2 to 1.0.3.
 *
 * Revision 1.2  2005/01/10 08:22:13  harpechr
 * Changed the copyright statement from my work standard to my name and the 
 * licence to GNU.
 *
 * Revision 1.1  2005/01/07 12:37:49  harpechr
 * Version 1.0.2 code. First CVS commit!
 *
 */

package org.cah.eclipse.plugins.dctm.dql.views.connection;

import com.documentum.fc.common.IDfId;


/**
 * <H4>Model that indicates a Docbase type.</H4>
 * <DL>
 * <DT><B>Copyright (c): </B>
 * <DD>Christopher Harper</DD>
 * </DT>
 * <DT><B>Created : </B>
 * <DD>Nov 25, 2004 1:54:33 PM.</DD>
 * </DT>
 * </DL>
 * <p>
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * </p>
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the <a
 * href="http://www.gnu.org/licenses/gpl.html">GNU General Public License </a>
 * for more details.
 * </p>
 * 
 * @author Christopher Harper account : HARPECHR
 * @version 3.0.0
 * @since 1.0
 */
public class TypeModel
						extends
							AbstractPersistentObjectModel
{

	/**
	 * Constructor where the name and id is given.
	 * <DL>
	 * <DT><B>Created : </B>
	 * <DD>Nov 25, 2004 1:54:33 PM</DD>
	 * </DT>
	 * <DT><B>Author : </B>
	 * <DD>Christopher Harper account : HARPECHR</DD>
	 * </DT>
	 * </DL>
	 * 
	 * @since 1.0
	 * @param aName
	 *            name of the model.
	 * @param anObjectId
	 *            the object id of the type.
	 */
	public TypeModel(final String aName, final IDfId anObjectId)
	{

		super(aName, anObjectId);
	}

}
