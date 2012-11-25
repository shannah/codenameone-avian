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
 * Descriptive information about the JOptionPane class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JOptionPane properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JOptionPaneBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJOptionPane = javax.swing.JOptionPane.class;

    /**
     * @return a JOptionPane BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJOptionPane,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which implements standard dialog box controls."
        });
    }


    /**
     * Create a JOptionPane PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JOptionPane.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JOptionPane PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJOptionPane, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JOptionPane.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JOptionPane
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the optionpane's LookAndFeel",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The AccessibleContext associated with this option pane",
               }
             ),
             
             createPropertyDescriptor("icon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's type icon.",
               }
             ),
             
             createPropertyDescriptor("initialSelectionValue", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's initial selection value object.",
               }
             ),
             
             createPropertyDescriptor("initialValue", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's initial value object.",
               }
             ),
             
             createPropertyDescriptor("inputValue", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's input value object.",
               }
             ),
             
             createPropertyDescriptor("maxCharactersPerLineCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "maxCharactersPerLineCount",
               }
             ),
             
             createPropertyDescriptor("message", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The optionpane's message object.",
               }
             ),
             
             createPropertyDescriptor("messageType", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's message type.",
               }
             ),
             
             createPropertyDescriptor("optionType", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's option type.",
               }
             ),
             
             createPropertyDescriptor("options", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's options objects.",
               }
             ),
             
             createPropertyDescriptor("selectionValues", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's selection values.",
               }
             ),
             
             createPropertyDescriptor("value", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The option pane's value object.",
               }
             ),
             
             createPropertyDescriptor("wantsInput", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Flag which allows the user to input a value.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JOptionPane
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JOptionPaneColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JOptionPaneColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JOptionPaneMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JOptionPaneMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


