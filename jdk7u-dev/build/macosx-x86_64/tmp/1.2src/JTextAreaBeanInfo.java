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
 * Descriptive information about the JTextArea class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JTextArea properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JTextAreaBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJTextArea = javax.swing.JTextArea.class;

    /**
     * @return a JTextArea BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJTextArea,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A multi-line area that displays plain text."
        });
    }


    /**
     * Create a JTextArea PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JTextArea.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JTextArea PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJTextArea, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JTextArea.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JTextArea
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("columns", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the number of columns preferred for display",
               }
             ),
             
             createPropertyDescriptor("lineCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "lineCount",
               }
             ),
             
             createPropertyDescriptor("lineWrap", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "should lines be wrapped",
               }
             ),
             
             createPropertyDescriptor("preferredScrollableViewportSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredScrollableViewportSize",
               }
             ),
             
             createPropertyDescriptor("preferredSize", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "preferredSize",
               }
             ),
             
             createPropertyDescriptor("rows", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the number of rows preferred for display",
               }
             ),
             
             createPropertyDescriptor("scrollableTracksViewportWidth", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "scrollableTracksViewportWidth",
               }
             ),
             
             createPropertyDescriptor("tabSize", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the number of characters to expand tabs to",
               }
             ),
             
             createPropertyDescriptor("wrapStyleWord", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "should wrapping occur at word boundaries",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JTextArea
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JTextAreaColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JTextAreaColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JTextAreaMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JTextAreaMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


