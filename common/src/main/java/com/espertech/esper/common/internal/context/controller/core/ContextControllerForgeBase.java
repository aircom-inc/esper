/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.context.controller.core;

public abstract class ContextControllerForgeBase implements ContextControllerFactoryForge {
    private final ContextControllerFactoryEnv ctx;

    public ContextControllerForgeBase(ContextControllerFactoryEnv ctx) {
        this.ctx = ctx;
    }

    public ContextControllerFactoryEnv getFactoryEnv() {
        return ctx;
    }
}
