/*
 * Copyright (c) 1998, 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.swing;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.awt.Image;

import sun.swing.BeanInfoUtils;

/**
 * Descriptive information about the JFormattedTextField class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JFormattedTextField properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JFormattedTextFieldBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJFormattedTextField = javax.swing.JFormattedTextField.class;

    /**
     * @return a JFormattedTextField BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJFormattedTextField,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                
                    BeanInfoUtils.SHORTDESCRIPTION, "JFormattedTextField"
        });
    }


    /**
     * Create a JFormattedTextField PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JFormattedTextField.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JFormattedTextField PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJFormattedTextField, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JFormattedTextField.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JFormattedTextField
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] focusLostBehaviorEnumeration = new Object[] { 
			"REVERT" ,   new Integer(JFormattedTextField.REVERT), "JFormattedTextField.REVERT",
			"COMMIT" ,   new Integer(JFormattedTextField.COMMIT), "JFormattedTextField.COMMIT",
			"COMMIT_OR_REVERT" ,   new Integer(JFormattedTextField.COMMIT_OR_REVERT), "JFormattedTextField.COMMIT_OR_REVERT",
			"PERSIST" ,   new Integer(JFormattedTextField.PERSIST), "JFormattedTextField.PERSIST"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("actions", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actions",
               }
             ),
             
             createPropertyDescriptor("editValid", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editValid",
               }
             ),
             
             createPropertyDescriptor("focusLostBehavior", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                      "enumerationValues", focusLostBehaviorEnumeration,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Behavior when component loses focus",
               }
             ),
             
             createPropertyDescriptor("formatter", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "TextFormatter, responsible for formatting the current value",
               }
             ),
             
             createPropertyDescriptor("formatterFactory", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "AbstractFormatterFactory, responsible for returning an AbstractFormatter that can format the current value.",
               }
             ),
             
             createPropertyDescriptor("value", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The value to be formatted.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JFormattedTextField
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JFormattedTextFieldColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JFormattedTextFieldColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JFormattedTextFieldMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JFormattedTextFieldMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


