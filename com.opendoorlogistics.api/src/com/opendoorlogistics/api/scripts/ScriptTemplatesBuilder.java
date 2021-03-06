/*******************************************************************************
 * Copyright (c) 2014 Open Door Logistics (www.opendoorlogistics.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/lgpl.txt
 ******************************************************************************/
package com.opendoorlogistics.api.scripts;

import java.io.Serializable;

import com.opendoorlogistics.api.ODLApi;
import com.opendoorlogistics.api.tables.ODLDatastore;
import com.opendoorlogistics.api.tables.ODLTableDefinition;

public interface ScriptTemplatesBuilder {
	public static interface BuildScriptCallback {
		void buildScript(ScriptOption builder);
	}

	ODLApi getApi();

	void registerTemplate(String shortName, String name, String description, ODLDatastore<? extends ODLTableDefinition> expectedDatastore, Serializable config);

	void registerTemplate(String shortName, String name, String description, ODLDatastore<? extends ODLTableDefinition> expectedDatastore, Serializable config, long flags, int executionMode);

	void registerTemplate(String shortName, String name, String description, ODLDatastore<? extends ODLTableDefinition> expectedDatastore, BuildScriptCallback buildScriptCB);

	void registerTemplate(String shortName, String name, String description, ODLDatastore<? extends ODLTableDefinition> expectedDatastore, BuildScriptCallback buildScriptCB, long flags);
}
