/*
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2018 Ricardo Mariaca and the Dynamic Reports Contributors
 * http://www.dynamicreports.org
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.dynamicreports.report.builder.datatype;

import net.sf.dynamicreports.report.base.datatype.AbstractDataType;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.defaults.Defaults;
import net.sf.dynamicreports.report.exception.DRException;

import java.util.Locale;

/**
 * <p>BooleanType class.</p>
 *
 * @author Ricardo Mariaca
 * 
 */
public class BooleanType extends AbstractDataType<Boolean, Boolean> {
    private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

    /** {@inheritDoc} */
    @Override
    public String getPattern() {
        return Defaults.getDefaults().getBooleanType().getPattern();
    }

    /** {@inheritDoc} */
    @Override
    public HorizontalTextAlignment getHorizontalTextAlignment() {
        return Defaults.getDefaults().getBooleanType().getHorizontalTextAlignment();
    }

    /** {@inheritDoc} */
    @Override
    public Boolean stringToValue(String value, Locale locale) throws DRException {
        return new Boolean(value);
    }
}
