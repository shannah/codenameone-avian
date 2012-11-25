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
 * Descriptive information about the JInternalFrame class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JInternalFrame properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JInternalFrameBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJInternalFrame = javax.swing.JInternalFrame.class;

    /**
     * @return a JInternalFrame BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJInternalFrame,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "containerDelegate", "getContentPane",
                               "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A frame container which is contained within another window."
        });
    }


    /**
     * Create a JInternalFrame PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JInternalFrame.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JInternalFrame PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJInternalFrame, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JInternalFrame.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JInternalFrame
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("JMenuBar", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The menu bar for accessing pulldown menus from this internal frame.",
               }
             ),
             
             createPropertyDescriptor("UI", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the Component's LookAndFeel.",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("closable", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates whether this internal frame can be closed.",
               }
             ),
             
             createPropertyDescriptor("closed", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      sun.swing.BeanInfoUtils.CONSTRAINED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates whether this internal frame has been closed.",
               }
             ),
             
             createPropertyDescriptor("contentPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The client area of the internal frame where child components are normally inserted.",
               }
             ),
             
             createPropertyDescriptor("defaultCloseOperation", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "defaultCloseOperation",
               }
             ),
             
             createPropertyDescriptor("desktopIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The icon shown when this internal frame is minimized.",
               }
             ),
             
             createPropertyDescriptor("desktopPane", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "desktopPane",
               }
             ),
             
             createPropertyDescriptor("focusCycleRoot", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusCycleRoot",
               }
             ),
             
             createPropertyDescriptor("focusCycleRootAncestor", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusCycleRootAncestor",
               }
             ),
             
             createPropertyDescriptor("focusOwner", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusOwner",
               }
             ),
             
             createPropertyDescriptor("frameIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The icon shown in the top-left corner of this internal frame.",
               }
             ),
             
             createPropertyDescriptor("glassPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "A transparent pane used for menu rendering.",
               }
             ),
             
             createPropertyDescriptor("icon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      sun.swing.BeanInfoUtils.CONSTRAINED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The image displayed when this internal frame is minimized.",
               }
             ),
             
             createPropertyDescriptor("iconifiable", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Determines whether this internal frame can be iconified.",
               }
             ),
             
             createPropertyDescriptor("internalFrameListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "internalFrameListeners",
               }
             ),
             
             createPropertyDescriptor("lastCursor", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "lastCursor",
               }
             ),
             
             createPropertyDescriptor("layer", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Specifies what desktop layer is used.",
               }
             ),
             
             createPropertyDescriptor("layeredPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The pane which holds the various desktop layers.",
               }
             ),
             
             createPropertyDescriptor("maximizable", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Determines whether this internal frame can be maximized.",
               }
             ),
             
             createPropertyDescriptor("maximum", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      sun.swing.BeanInfoUtils.CONSTRAINED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates whether this internal frame is maximized.",
               }
             ),
             
             createPropertyDescriptor("menuBar", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "menuBar",
               }
             ),
             
             createPropertyDescriptor("mostRecentFocusOwner", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "mostRecentFocusOwner",
               }
             ),
             
             createPropertyDescriptor("normalBounds", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "normalBounds",
               }
             ),
             
             createPropertyDescriptor("resizable", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Determines whether this internal frame can be resized by the user.",
               }
             ),
             
             createPropertyDescriptor("rootPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The root pane used by this internal frame.",
               }
             ),
             
             createPropertyDescriptor("selected", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      sun.swing.BeanInfoUtils.CONSTRAINED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Indicates whether this internal frame is currently the active frame.",
               }
             ),
             
             createPropertyDescriptor("title", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The text displayed in the title bar.",
               }
             ),
             
             createPropertyDescriptor("warningString", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "warningString",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JInternalFrame
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JInternalFrameColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JInternalFrameColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JInternalFrameMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JInternalFrameMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


