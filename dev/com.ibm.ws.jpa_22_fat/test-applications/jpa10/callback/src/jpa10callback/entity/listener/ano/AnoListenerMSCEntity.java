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

package jpa10callback.entity.listener.ano;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AnoListenerMSC")
public class AnoListenerMSCEntity extends AnoListenerMappedSuperclass {
    public AnoListenerMSCEntity() {
        super();
    }

    @Override
    public String toString() {
        return "AnoListenerMSCEntity [id=" + getId() + ", name=" + getName() + "]";
    }
}
