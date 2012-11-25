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
 * Descriptive information about the JList class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JList properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JListBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJList = javax.swing.JList.class;

    /**
     * @return a JList BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJList,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which allows for the selection of one or more objects from a list."
        });
    }


    /**
     * Create a JList PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JList.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JList PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJList, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JList.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JList
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] layoutOrientationEnumeration = new Object[] { 
			"VERTICAL_WRAP" ,   new Integer(JList.VERTICAL_WRAP), "JList.VERTICAL_WRAP",
			"VERTICAL" ,   new Integer(JList.VERTICAL), "JList.VERTICAL",
			"HORIZONTAL_WRAP" ,   new Integer(JList.HORIZONTAL_WRAP), "JList.HORIZONTAL_WRAP"
		};

		Object[] selectionModeEnumeration = new Object[] { 
			"SINGLE_SELECTION" ,   new Integer(ListSelectionModel.SINGLE_SELECTION), "ListSelectionModel.SINGLE_SELECTION",
			"SINGLE_INTERVAL_SELECTION" ,   new Integer(ListSelectionModel.SINGLE_INTERVAL_SELECTION), "ListSelectionModel.SINGLE_INTERVAL_SELECTION",
			"MULTIPLE_INTERVAL_SELECTION" ,   new Integer(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION), "ListSelectionModel.MULTIPLE_INTERVAL_SELECTION"
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
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("anchorSelectionIndex", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "anchorSelectionIndex",
               }
             ),
             
             createPropertyDescriptor("cellRenderer", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The component used to draw the cells.",
               }
             ),
             
             createPropertyDescriptor("dragEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "determines whether automatic drag handling is enabled ",
               }
             ),
             
             createPropertyDescriptor("dropLocation", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "dropLocation",
               }
             ),
             
             createPropertyDescriptor("dropMode", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "dropMode",
               }
             ),
             
             createPropertyDescriptor("firstVisibleIndex", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "firstVisibleIndex",
               }
             ),
             
             createPropertyDescriptor("fixedCellHeight", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Defines a fixed cell height when greater than zero.",
               }
             ),
             
             createPropertyDescriptor("fixedCellWidth", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Defines a fixed cell width when greater than zero.",
               }
             ),
             
             createPropertyDescriptor("lastVisibleIndex", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "lastVisibleIndex",
               }
             ),
             
             createPropertyDescriptor("layoutOrientation", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", layoutOrientationEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Defines the way list cells are layed out. ",
               }
             ),
             
             createPropertyDescriptor("leadSelectionIndex", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The lead selection index.",
               }
             ),
             
             createPropertyDescriptor("listSelectionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "listSelectionListeners",
               }
             ),
             
             createPropertyDescriptor("maxSelectionIndex", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "maxSelectionIndex",
               }
             ),
             
             createPropertyDescriptor("minSelectionIndex", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "minSelectionIndex",
               }
             ),
             
             createPropertyDescriptor("model", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The object that contains the data to be drawn by this JList.",
               }
             ),
             
             createPropertyDescriptor("preferredScrollableViewportSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredScrollableViewportSize",
               }
             ),
             
             createPropertyDescriptor("prototypeCellValue", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The cell prototype value, used to compute cell width and height.",
               }
             ),
             
             createPropertyDescriptor("scrollableTracksViewportHeight", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "scrollableTracksViewportHeight",
               }
             ),
             
             createPropertyDescriptor("scrollableTracksViewportWidth", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "scrollableTracksViewportWidth",
               }
             ),
             
             createPropertyDescriptor("selectedIndex", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The index of the selected cell.",
               }
             ),
             
             createPropertyDescriptor("selectedIndices", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedIndices",
               }
             ),
             
             createPropertyDescriptor("selectedValue", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedValue",
               }
             ),
             
             createPropertyDescriptor("selectedValues", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedValues",
               }
             ),
             
             createPropertyDescriptor("selectedValuesList", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedValuesList",
               }
             ),
             
             createPropertyDescriptor("selectionBackground", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The background color of selected cells.",
               }
             ),
             
             createPropertyDescriptor("selectionEmpty", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionEmpty",
               }
             ),
             
             createPropertyDescriptor("selectionForeground", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The foreground color of selected cells.",
               }
             ),
             
             createPropertyDescriptor("selectionMode", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                      "enumerationValues", selectionModeEnumeration,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The selection mode. ",
               }
             ),
             
             createPropertyDescriptor("selectionModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The selection model, recording which cells are selected.",
               }
             ),
             
             createPropertyDescriptor("valueIsAdjusting", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "valueIsAdjusting",
               }
             ),
             
             createPropertyDescriptor("visibleRowCount", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The preferred number of rows to display without requiring scrolling",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JList
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JListColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JListColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JListMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JListMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


