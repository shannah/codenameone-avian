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
 * Descriptive information about the JTabbedPane class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTabbedPane properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTabbedPaneBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTabbedPane = javax.swing.JTabbedPane.class;

    /**
     * @return a JTabbedPane BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTabbedPane,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which provides a tab folder metaphor for displaying one component from a set of components."
        });
    }


    /**
     * Create a JTabbedPane PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTabbedPane.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTabbedPane PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTabbedPane, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTabbedPane.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTabbedPane
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] tabLayoutPolicyEnumeration = new Object[] { 
			"WRAP_TAB_LAYOUT" ,   new Integer(JTabbedPane.WRAP_TAB_LAYOUT), "JTabbedPane.WRAP_TAB_LAYOUT",
			"SCROLL_TAB_LAYOUT" ,   new Integer(JTabbedPane.SCROLL_TAB_LAYOUT), "JTabbedPane.SCROLL_TAB_LAYOUT"
		};

		Object[] tabPlacementEnumeration = new Object[] { 
			"BOTTOM" ,   new Integer(JTabbedPane.BOTTOM), "JTabbedPane.BOTTOM",
			"RIGHT" ,   new Integer(JTabbedPane.RIGHT), "JTabbedPane.RIGHT",
			"TOP" ,   new Integer(JTabbedPane.TOP), "JTabbedPane.TOP",
			"LEFT" ,   new Integer(JTabbedPane.LEFT), "JTabbedPane.LEFT"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the tabbedpane's LookAndFeel",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("changeListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "changeListeners",
               }
             ),
             
             createPropertyDescriptor("model", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tabbedpane's SingleSelectionModel.",
               }
             ),
             
             createPropertyDescriptor("selectedComponent", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tabbedpane's selected component.",
               }
             ),
             
             createPropertyDescriptor("selectedIndex", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tabbedpane's selected tab index.",
               }
             ),
             
             createPropertyDescriptor("tabCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "tabCount",
               }
             ),
             
             createPropertyDescriptor("tabLayoutPolicy", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", tabLayoutPolicyEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tabbedpane's policy for laying out the tabs",
               }
             ),
             
             createPropertyDescriptor("tabPlacement", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", tabPlacementEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tabbedpane's tab placement.",
               }
             ),
             
             createPropertyDescriptor("tabRunCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "tabRunCount",
               }
             ),
             
        };
    }


    /**
     * @return an icon of the specified kind for JTabbedPane
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTabbedPaneColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTabbedPaneColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTabbedPaneMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTabbedPaneMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


