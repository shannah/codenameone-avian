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

package javax.swing.text;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.awt.Image;

import sun.swing.BeanInfoUtils;

/**
 * Descriptive information about the JTextComponent class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTextComponent properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTextComponentBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTextComponent = javax.swing.text.JTextComponent.class;

    /**
     * @return a JTextComponent BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTextComponent,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "JTextComponent"
        });
    }


    /**
     * Create a JTextComponent PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTextComponent.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTextComponent PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTextComponent, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTextComponent.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTextComponent
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UI",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("actions", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actions",
               }
             ),
             
             createPropertyDescriptor("caret", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the caret used to select/navigate ",
               }
             ),
             
             createPropertyDescriptor("caretColor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the color used to render the caret ",
               }
             ),
             
             createPropertyDescriptor("caretListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "caretListeners",
               }
             ),
             
             createPropertyDescriptor("caretPosition", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the caret position",
               }
             ),
             
             createPropertyDescriptor("disabledTextColor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "color used to render disabled text ",
               }
             ),
             
             createPropertyDescriptor("document", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the text document model ",
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
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "specifies if the text can be edited ",
               }
             ),
             
             createPropertyDescriptor("focusAccelerator", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accelerator character used to grab focus ",
               }
             ),
             
             createPropertyDescriptor("highlighter", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "object responsible for background highlights ",
               }
             ),
             
             createPropertyDescriptor("inputMethodRequests", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "inputMethodRequests",
               }
             ),
             
             createPropertyDescriptor("keymap", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "set of key event to action bindings to use ",
               }
             ),
             
             createPropertyDescriptor("margin", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "desired space between the border and text area ",
               }
             ),
             
             createPropertyDescriptor("navigationFilter", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "navigationFilter",
               }
             ),
             
             createPropertyDescriptor("preferredScrollableViewportSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredScrollableViewportSize",
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
             
             createPropertyDescriptor("selectedText", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedText",
               }
             ),
             
             createPropertyDescriptor("selectedTextColor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "color used to render selected text ",
               }
             ),
             
             createPropertyDescriptor("selectionColor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "color used to render selection background ",
               }
             ),
             
             createPropertyDescriptor("selectionEnd", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "ending location of the selection.",
               }
             ),
             
             createPropertyDescriptor("selectionStart", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "starting location of the selection.",
               }
             ),
             
             createPropertyDescriptor("text", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the text of this component",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTextComponent
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTextComponentColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTextComponentColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTextComponentMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTextComponentMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


