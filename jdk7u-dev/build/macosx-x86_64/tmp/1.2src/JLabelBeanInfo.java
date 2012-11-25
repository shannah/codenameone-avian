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
 * Descriptive information about the JLabel class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JLabel properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JLabelBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJLabel = javax.swing.JLabel.class;

    /**
     * @return a JLabel BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJLabel,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component that displays a short string and an icon."
        });
    }


    /**
     * Create a JLabel PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JLabel.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JLabel PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJLabel, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JLabel.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JLabel
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] horizontalAlignmentEnumeration = new Object[] { 
			"TRAILING" ,   new Integer(SwingConstants.TRAILING), "SwingConstants.TRAILING",
			"RIGHT" ,   new Integer(SwingConstants.RIGHT), "SwingConstants.RIGHT",
			"LEFT" ,   new Integer(SwingConstants.LEFT), "SwingConstants.LEFT",
			"LEADING" ,   new Integer(SwingConstants.LEADING), "SwingConstants.LEADING",
			"CENTER" ,   new Integer(SwingConstants.CENTER), "SwingConstants.CENTER"
		};

		Object[] horizontalTextPositionEnumeration = new Object[] { 
			"TRAILING" ,   new Integer(SwingConstants.TRAILING), "SwingConstants.TRAILING",
			"RIGHT" ,   new Integer(SwingConstants.RIGHT), "SwingConstants.RIGHT",
			"LEFT" ,   new Integer(SwingConstants.LEFT), "SwingConstants.LEFT",
			"LEADING" ,   new Integer(SwingConstants.LEADING), "SwingConstants.LEADING",
			"CENTER" ,   new Integer(SwingConstants.CENTER), "SwingConstants.CENTER"
		};

		Object[] verticalAlignmentEnumeration = new Object[] { 
			"BOTTOM" ,   new Integer(SwingConstants.BOTTOM), "SwingConstants.BOTTOM",
			"TOP" ,   new Integer(SwingConstants.TOP), "SwingConstants.TOP",
			"CENTER" ,   new Integer(SwingConstants.CENTER), "SwingConstants.CENTER"
		};

		Object[] verticalTextPositionEnumeration = new Object[] { 
			"BOTTOM" ,   new Integer(SwingConstants.BOTTOM), "SwingConstants.BOTTOM",
			"TOP" ,   new Integer(SwingConstants.TOP), "SwingConstants.TOP",
			"CENTER" ,   new Integer(SwingConstants.CENTER), "SwingConstants.CENTER"
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
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The AccessibleContext associated with this Label.",
               }
             ),
             
             createPropertyDescriptor("disabledIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The icon to display if the label is disabled.",
               }
             ),
             
             createPropertyDescriptor("displayedMnemonic", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The mnemonic keycode.",
               }
             ),
             
             createPropertyDescriptor("displayedMnemonicIndex", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the index into the String to draw the keyboard character mnemonic at",
               }
             ),
             
             createPropertyDescriptor("horizontalAlignment", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalAlignmentEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The alignment of the label's content along the X axis.",
               }
             ),
             
             createPropertyDescriptor("horizontalTextPosition", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalTextPositionEnumeration,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The horizontal position of the label's text, relative to its image.",
               }
             ),
             
             createPropertyDescriptor("icon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The icon this component will display.",
               }
             ),
             
             createPropertyDescriptor("iconTextGap", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "If both the icon and text properties are set, this property defines the space between them.",
               }
             ),
             
             createPropertyDescriptor("labelFor", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The component this is labelling.",
               }
             ),
             
             createPropertyDescriptor("text", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Defines the single line of text this component will display.",
               }
             ),
             
             createPropertyDescriptor("verticalAlignment", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", verticalAlignmentEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The alignment of the label's contents along the Y axis.",
               }
             ),
             
             createPropertyDescriptor("verticalTextPosition", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", verticalTextPositionEnumeration,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The vertical position of the text relative to it's image.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JLabel
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JLabelColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JLabelColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JLabelMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JLabelMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


