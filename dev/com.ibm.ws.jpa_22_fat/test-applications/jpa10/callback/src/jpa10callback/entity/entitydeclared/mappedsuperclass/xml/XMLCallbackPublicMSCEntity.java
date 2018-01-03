/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package jpa10callback.entity.entitydeclared.mappedsuperclass.xml;

public class XMLCallbackPublicMSCEntity extends XMLCallbackPublicMSC {
    public XMLCallbackPublicMSCEntity() {
        super();
    }

    @Override
    public String toString() {
        return "XMLCallbackPublicMSCEntity [id=" + getId() + ", name=" + getName() + "]";
    }
}
