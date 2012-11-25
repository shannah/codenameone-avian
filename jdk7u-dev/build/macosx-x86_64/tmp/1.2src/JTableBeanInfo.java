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
 * Descriptive information about the JTable class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTable properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTableBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTable = javax.swing.JTable.class;

    /**
     * @return a JTable BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTable,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which displays data in a two dimensional grid."
        });
    }


    /**
     * Create a JTable PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTable.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTable PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTable, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTable.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTable
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] autoResizeModeEnumeration = new Object[] { 
			"AUTO_RESIZE_OFF" ,   new Integer(JTable.AUTO_RESIZE_OFF), "JTable.AUTO_RESIZE_OFF",
			"AUTO_RESIZE_SUBSEQUENT_COLUMNS" ,   new Integer(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS), "JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS",
			"AUTO_RESIZE_LAST_COLUMN" ,   new Integer(JTable.AUTO_RESIZE_LAST_COLUMN), "JTable.AUTO_RESIZE_LAST_COLUMN",
			"AUTO_RESIZE_ALL_COLUMNS" ,   new Integer(JTable.AUTO_RESIZE_ALL_COLUMNS), "JTable.AUTO_RESIZE_ALL_COLUMNS",
			"AUTO_RESIZE_NEXT_COLUMN" ,   new Integer(JTable.AUTO_RESIZE_NEXT_COLUMN), "JTable.AUTO_RESIZE_NEXT_COLUMN"
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
             
             createPropertyDescriptor("autoCreateColumnsFromModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Automatically populates the columnModel when a new TableModel is submitted.",
               }
             ),
             
             createPropertyDescriptor("autoCreateRowSorter", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether or not to turn on sorting by default.",
               }
             ),
             
             createPropertyDescriptor("autoResizeMode", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", autoResizeModeEnumeration,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the columns should adjust themselves automatically. ",
               }
             ),
             
             createPropertyDescriptor("cellEditor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The table's active cell editor.",
               }
             ),
             
             createPropertyDescriptor("cellSelectionEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Select a rectangular region of cells rather than rows or columns.",
               }
             ),
             
             createPropertyDescriptor("columnCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "columnCount",
               }
             ),
             
             createPropertyDescriptor("columnModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The object governing the way columns appear in the view.",
               }
             ),
             
             createPropertyDescriptor("columnSelectionAllowed", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "If true, an entire column is selected for each selected cell.",
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
             
             createPropertyDescriptor("editing", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editing",
               }
             ),
             
             createPropertyDescriptor("editingColumn", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editingColumn",
               }
             ),
             
             createPropertyDescriptor("editingRow", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editingRow",
               }
             ),
             
             createPropertyDescriptor("editorComponent", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editorComponent",
               }
             ),
             
             createPropertyDescriptor("fillsViewportHeight", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether or not this table is always made large enough to fill the height of an enclosing viewport",
               }
             ),
             
             createPropertyDescriptor("gridColor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The grid color.",
               }
             ),
             
             createPropertyDescriptor("intercellSpacing", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The spacing between the cells, drawn in the background color of the JTable.",
               }
             ),
             
             createPropertyDescriptor("model", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The model that is the source of the data for this view.",
               }
             ),
             
             createPropertyDescriptor("preferredScrollableViewportSize", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The preferred size of the viewport.",
               }
             ),
             
             createPropertyDescriptor("rowCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "rowCount",
               }
             ),
             
             createPropertyDescriptor("rowMargin", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The amount of space between cells.",
               }
             ),
             
             createPropertyDescriptor("rowSelectionAllowed", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "If true, an entire row is selected for each selected cell.",
               }
             ),
             
             createPropertyDescriptor("rowSorter", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The table's RowSorter",
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
             
             createPropertyDescriptor("selectedColumn", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedColumn",
               }
             ),
             
             createPropertyDescriptor("selectedColumnCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedColumnCount",
               }
             ),
             
             createPropertyDescriptor("selectedColumns", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedColumns",
               }
             ),
             
             createPropertyDescriptor("selectedRow", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedRow",
               }
             ),
             
             createPropertyDescriptor("selectedRowCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedRowCount",
               }
             ),
             
             createPropertyDescriptor("selectedRows", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedRows",
               }
             ),
             
             createPropertyDescriptor("selectionBackground", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "A default background color for selected cells.",
               }
             ),
             
             createPropertyDescriptor("selectionForeground", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "A default foreground color for selected cells.",
               }
             ),
             
             createPropertyDescriptor("selectionModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The selection model for rows.",
               }
             ),
             
             createPropertyDescriptor("showHorizontalLines", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether horizontal lines should be drawn in between the cells.",
               }
             ),
             
             createPropertyDescriptor("showVerticalLines", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether vertical lines should be drawn in between the cells.",
               }
             ),
             
             createPropertyDescriptor("surrendersFocusOnKeystroke", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "surrendersFocusOnKeystroke",
               }
             ),
             
             createPropertyDescriptor("tableHeader", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The JTableHeader instance which renders the column headers.",
               }
             ),
             
             createPropertyDescriptor("updateSelectionOnSort", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether or not to update the selection on sorting",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTable
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTableColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTableColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTableMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTableMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


