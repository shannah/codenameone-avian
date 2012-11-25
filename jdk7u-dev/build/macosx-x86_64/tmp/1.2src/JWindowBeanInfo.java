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
 * Descriptive information about the JWindow class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JWindow properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JWindowBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJWindow = javax.swing.JWindow.class;

    /**
     * @return a JWindow BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJWindow,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "containerDelegate", "getContentPane",
                               "isContainer", Boolean.TRUE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A toplevel window which has no system border or controls."
        });
    }


    /**
     * Create a JWindow PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JWindow.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JWindow PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJWindow, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JWindow.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JWindow
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("contentPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The client area of the window where child components are normally inserted.",
               }
             ),
             
             createPropertyDescriptor("glassPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "A transparent pane used for menu rendering.",
               }
             ),
             
             createPropertyDescriptor("graphics", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "graphics",
               }
             ),
             
             createPropertyDescriptor("layeredPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The pane which holds the various window layers.",
               }
             ),
             
             createPropertyDescriptor("rootPane", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the RootPane object for this window.",
               }
             ),
             
             createPropertyDescriptor("transferHandler", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Mechanism for transfer of data into the component",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JWindow
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JWindowColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JWindowColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JWindowMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JWindowMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


