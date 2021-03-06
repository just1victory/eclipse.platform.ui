/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.ui.css.swt.dom.definition;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;

import org.eclipse.e4.ui.internal.css.swt.definition.IFontDefinitionOverridable;

public class FontDefinitionElement extends ThemeDefinitionElement<IFontDefinitionOverridable> {
	public FontDefinitionElement(IFontDefinitionOverridable definition,
			CSSEngine engine) {
		super(definition, engine);
	}
}
