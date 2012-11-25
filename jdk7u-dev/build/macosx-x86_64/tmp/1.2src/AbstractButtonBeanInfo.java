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
 * Descriptive information about the AbstractButton class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * AbstractButton properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class AbstractButtonBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classAbstractButton = javax.swing.AbstractButton.class;

    /**
     * @return a AbstractButton BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classAbstractButton,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                
                    BeanInfoUtils.SHORTDESCRIPTION, "AbstractButton"
        });
    }


    /**
     * Create a AbstractButton PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the AbstractButton.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a AbstractButton PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classAbstractButton, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in AbstractButton.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for AbstractButton
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
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the LookAndFeel.",
               }
             ),
             
             createPropertyDescriptor("action", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the Action instance connected with this ActionEvent source",
               }
             ),
             
             createPropertyDescriptor("actionCommand", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actionCommand",
               }
             ),
             
             createPropertyDescriptor("actionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actionListeners",
               }
             ),
             
             createPropertyDescriptor("borderPainted", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the border should be painted.",
               }
             ),
             
             createPropertyDescriptor("changeListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "changeListeners",
               }
             ),
             
             createPropertyDescriptor("contentAreaFilled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the button should paint the content area or leave it transparent.",
               }
             ),
             
             createPropertyDescriptor("disabledIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The disabled icon for the button.",
               }
             ),
             
             createPropertyDescriptor("disabledSelectedIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The disabled selection icon for the button.",
               }
             ),
             
             createPropertyDescriptor("displayedMnemonicIndex", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the index into the String to draw the keyboard character mnemonic at",
               }
             ),
             
             createPropertyDescriptor("focusPainted", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether focus should be painted",
               }
             ),
             
             createPropertyDescriptor("hideActionText", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the text of the button should come from the <code>Action</code>.",
               }
             ),
             
             createPropertyDescriptor("horizontalAlignment", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalAlignmentEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The horizontal alignment of the icon and text.",
               }
             ),
             
             createPropertyDescriptor("horizontalTextPosition", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", horizontalTextPositionEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The horizontal position of the text relative to the icon.",
               }
             ),
             
             createPropertyDescriptor("icon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The button's default icon",
               }
             ),
             
             createPropertyDescriptor("iconTextGap", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "If both the icon and text properties are set, this property defines the space between them.",
               }
             ),
             
             createPropertyDescriptor("itemListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "itemListeners",
               }
             ),
             
             createPropertyDescriptor("label", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Replace by setText(text)",
               }
             ),
             
             createPropertyDescriptor("margin", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The space between the button's border and the label.",
               }
             ),
             
             createPropertyDescriptor("mnemonic", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "the keyboard character mnemonic",
               }
             ),
             
             createPropertyDescriptor("model", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Model that the Button uses.",
               }
             ),
             
             createPropertyDescriptor("multiClickThreshhold", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "multiClickThreshhold",
               }
             ),
             
             createPropertyDescriptor("pressedIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The pressed icon for the button.",
               }
             ),
             
             createPropertyDescriptor("rolloverEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether rollover effects should be enabled.",
               }
             ),
             
             createPropertyDescriptor("rolloverIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The rollover icon for the button.",
               }
             ),
             
             createPropertyDescriptor("rolloverSelectedIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The rollover selected icon for the button.",
               }
             ),
             
             createPropertyDescriptor("selected", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selected",
               }
             ),
             
             createPropertyDescriptor("selectedIcon", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The selected icon for the button.",
               }
             ),
             
             createPropertyDescriptor("selectedObjects", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedObjects",
               }
             ),
             
             createPropertyDescriptor("text", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The button's text.",
               }
             ),
             
             createPropertyDescriptor("verticalAlignment", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", verticalAlignmentEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The vertical alignment of the icon and text.",
               }
             ),
             
             createPropertyDescriptor("verticalTextPosition", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", verticalTextPositionEnumeration,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The vertical position of the text relative to the icon.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for AbstractButton
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/AbstractButtonColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/AbstractButtonColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/AbstractButtonMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/AbstractButtonMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


