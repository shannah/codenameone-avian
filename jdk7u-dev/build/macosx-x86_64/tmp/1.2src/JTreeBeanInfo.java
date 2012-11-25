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
 * Descriptive information about the JTree class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTree properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTreeBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTree = javax.swing.JTree.class;

    /**
     * @return a JTree BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTree,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component that displays a set of hierarchical data as an outline."
        });
    }


    /**
     * Create a JTree PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTree.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTree PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTree, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTree.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTree
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
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
             
             createPropertyDescriptor("anchorSelectionPath", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Anchor selection path",
               }
             ),
             
             createPropertyDescriptor("cellEditor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The cell editor. A null value implies the tree cannot be edited.",
               }
             ),
             
             createPropertyDescriptor("cellRenderer", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The TreeCellRenderer that will be used to draw each cell.",
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
             
             createPropertyDescriptor("editable", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the tree is editable.",
               }
             ),
             
             createPropertyDescriptor("editing", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editing",
               }
             ),
             
             createPropertyDescriptor("editingPath", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "editingPath",
               }
             ),
             
             createPropertyDescriptor("expandsSelectedPaths", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates whether changes to the selection should make the parent of the path visible.",
               }
             ),
             
             createPropertyDescriptor("fixedRowHeight", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "fixedRowHeight",
               }
             ),
             
             createPropertyDescriptor("invokesStopCellEditing", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Determines what happens when editing is interrupted, selecting another node in the tree, a change in the tree's data, or some other means.",
               }
             ),
             
             createPropertyDescriptor("largeModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the UI should use a large model.",
               }
             ),
             
             createPropertyDescriptor("lastSelectedPathComponent", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "lastSelectedPathComponent",
               }
             ),
             
             createPropertyDescriptor("leadSelectionPath", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Lead selection path",
               }
             ),
             
             createPropertyDescriptor("leadSelectionRow", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "leadSelectionRow",
               }
             ),
             
             createPropertyDescriptor("maxSelectionRow", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "maxSelectionRow",
               }
             ),
             
             createPropertyDescriptor("minSelectionRow", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "minSelectionRow",
               }
             ),
             
             createPropertyDescriptor("model", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The TreeModel that will provide the data.",
               }
             ),
             
             createPropertyDescriptor("preferredScrollableViewportSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredScrollableViewportSize",
               }
             ),
             
             createPropertyDescriptor("rootVisible", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether or not the root node from the TreeModel is visible.",
               }
             ),
             
             createPropertyDescriptor("rowCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "rowCount",
               }
             ),
             
             createPropertyDescriptor("rowHeight", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The height of each cell.",
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
             
             createPropertyDescriptor("scrollsOnExpand", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates if a node descendant should be scrolled when expanded.",
               }
             ),
             
             createPropertyDescriptor("selectionCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionCount",
               }
             ),
             
             createPropertyDescriptor("selectionEmpty", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionEmpty",
               }
             ),
             
             createPropertyDescriptor("selectionModel", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tree's selection model.",
               }
             ),
             
             createPropertyDescriptor("selectionPath", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionPath",
               }
             ),
             
             createPropertyDescriptor("selectionPaths", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionPaths",
               }
             ),
             
             createPropertyDescriptor("selectionRows", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectionRows",
               }
             ),
             
             createPropertyDescriptor("showsRootHandles", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the node handles are to be displayed.",
               }
             ),
             
             createPropertyDescriptor("toggleClickCount", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Number of clicks before a node will expand/collapse.",
               }
             ),
             
             createPropertyDescriptor("treeExpansionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "treeExpansionListeners",
               }
             ),
             
             createPropertyDescriptor("treeSelectionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "treeSelectionListeners",
               }
             ),
             
             createPropertyDescriptor("treeWillExpandListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "treeWillExpandListeners",
               }
             ),
             
             createPropertyDescriptor("visibleRowCount", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The number of rows that are to be displayed.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTree
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTreeColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTreeColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTreeMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTreeMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


