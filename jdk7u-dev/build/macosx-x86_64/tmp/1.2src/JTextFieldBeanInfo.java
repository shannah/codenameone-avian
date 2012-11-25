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
 * Descriptive information about the JTextField class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTextField properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTextFieldBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTextField = javax.swing.JTextField.class;

    /**
     * @return a JTextField BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTextField,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which allows for the editing of a single line of text."
        });
    }


    /**
     * Create a JTextField PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTextField.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTextField PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTextField, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTextField.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTextField
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] horizontalAlignmentEnumeration = new Object[] { 
			"TRAILING" ,   new Integer(JTextField.TRAILING), "JTextField.TRAILING",
			"RIGHT" ,   new Integer(JTextField.RIGHT), "JTextField.RIGHT",
			"LEFT" ,   new Integer(JTextField.LEFT), "JTextField.LEFT",
			"LEADING" ,   new Integer(JTextField.LEADING), "JTextField.LEADING",
			"CENTER" ,   new Integer(JTextField.CENTER), "JTextField.CENTER"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("action", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the Action instance connected with this ActionEvent source",
               }
             ),
             
             createPropertyDescriptor("actionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actionListeners",
               }
             ),
             
             createPropertyDescriptor("actions", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actions",
               }
             ),
             
             createPropertyDescriptor("columns", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the number of columns preferred for display",
               }
             ),
             
             createPropertyDescriptor("horizontalAlignment", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalAlignmentEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Set the field alignment to LEFT, CENTER, RIGHT, LEADING (the default) or TRAILING ",
               }
             ),
             
             createPropertyDescriptor("horizontalVisibility", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "horizontalVisibility",
               }
             ),
             
             createPropertyDescriptor("preferredSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredSize",
               }
             ),
             
             createPropertyDescriptor("scrollOffset", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "scrollOffset",
               }
             ),
             
             createPropertyDescriptor("validateRoot", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "validateRoot",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTextField
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTextFieldColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTextFieldColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTextFieldMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTextFieldMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


