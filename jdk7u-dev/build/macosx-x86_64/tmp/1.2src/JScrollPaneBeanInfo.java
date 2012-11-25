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
 * Descriptive information about the JScrollPane class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JScrollPane properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JScrollPaneBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJScrollPane = javax.swing.JScrollPane.class;

    /**
     * @return a JScrollPane BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJScrollPane,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "containerDelegate", "getViewport",
                               "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A specialized container that manages a viewport, optional scrollbars and headers"
        });
    }


    /**
     * Create a JScrollPane PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JScrollPane.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JScrollPane PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJScrollPane, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JScrollPane.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JScrollPane
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] horizontalScrollBarPolicyEnumeration = new Object[] { 
			"HORIZONTAL_SCROLLBAR_ALWAYS" ,   new Integer(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS), "ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS",
			"HORIZONTAL_SCROLLBAR_NEVER" ,   new Integer(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER), "ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER",
			"HORIZONTAL_SCROLLBAR_AS_NEEDED" ,   new Integer(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED), "ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED"
		};

		Object[] verticalScrollBarPolicyEnumeration = new Object[] { 
			"VERTICAL_SCROLLBAR_NEVER" ,   new Integer(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER), "ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER",
			"VERTICAL_SCROLLBAR_AS_NEEDED" ,   new Integer(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED), "ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED",
			"VERTICAL_SCROLLBAR_ALWAYS" ,   new Integer(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS), "ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the Component's LookAndFeel.",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("columnHeader", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The column header child for this scrollpane ",
               }
             ),
             
             createPropertyDescriptor("horizontalScrollBar", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The horizontal scrollbar.",
               }
             ),
             
             createPropertyDescriptor("horizontalScrollBarPolicy", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalScrollBarPolicyEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The scrollpane scrollbar policy ",
               }
             ),
             
             createPropertyDescriptor("rowHeader", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The row header child for this scrollpane",
               }
             ),
             
             createPropertyDescriptor("validateRoot", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "validateRoot",
               }
             ),
             
             createPropertyDescriptor("verticalScrollBar", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The vertical scrollbar.",
               }
             ),
             
             createPropertyDescriptor("verticalScrollBarPolicy", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", verticalScrollBarPolicyEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The scrollpane vertical scrollbar policy ",
               }
             ),
             
             createPropertyDescriptor("viewport", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The viewport child for this scrollpane",
               }
             ),
             
             createPropertyDescriptor("viewportBorder", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The border around the viewport.",
               }
             ),
             
             createPropertyDescriptor("viewportBorderBounds", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "viewportBorderBounds",
               }
             ),
             
             createPropertyDescriptor("wheelScrollingEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Flag for enabling/disabling mouse wheel scrolling",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JScrollPane
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JScrollPaneColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JScrollPaneColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JScrollPaneMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JScrollPaneMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


