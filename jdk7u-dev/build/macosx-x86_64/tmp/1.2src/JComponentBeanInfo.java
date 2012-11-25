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
 * Descriptive information about the JComponent class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JComponent properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JComponentBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJComponent = javax.swing.JComponent.class;

    /**
     * @return a JComponent BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJComponent,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                
                    BeanInfoUtils.SHORTDESCRIPTION, "JComponent"
        });
    }


    /**
     * Create a JComponent PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JComponent.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JComponent PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJComponent, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JComponent.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JComponent
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] debugGraphicsOptionsEnumeration = new Object[] { 
			"LOG_OPTION" ,   new Integer(DebugGraphics.LOG_OPTION), "DebugGraphics.LOG_OPTION",
			"BUFFERED_OPTION" ,   new Integer(DebugGraphics.BUFFERED_OPTION), "DebugGraphics.BUFFERED_OPTION",
			"NONE_OPTION" ,   new Integer(DebugGraphics.NONE_OPTION), "DebugGraphics.NONE_OPTION",
			"FLASH_OPTION" ,   new Integer(DebugGraphics.FLASH_OPTION), "DebugGraphics.FLASH_OPTION"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UIClassID", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("actionMap", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actionMap",
               }
             ),
             
             createPropertyDescriptor("alignmentX", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The preferred horizontal alignment of the component.",
               }
             ),
             
             createPropertyDescriptor("alignmentY", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The preferred vertical alignment of the component.",
               }
             ),
             
             createPropertyDescriptor("ancestorListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "ancestorListeners",
               }
             ),
             
             createPropertyDescriptor("autoscrolls", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Determines if this component automatically scrolls its contents when dragged.",
               }
             ),
             
             createPropertyDescriptor("background", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The background color of the component.",
               }
             ),
             
             createPropertyDescriptor("baselineResizeBehavior", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "baselineResizeBehavior",
               }
             ),
             
             createPropertyDescriptor("border", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The component's border.",
               }
             ),
             
             createPropertyDescriptor("componentCount", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "componentCount",
               }
             ),
             
             createPropertyDescriptor("componentPopupMenu", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Popup to show",
               }
             ),
             
             createPropertyDescriptor("components", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "components",
               }
             ),
             
             createPropertyDescriptor("containerListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "containerListeners",
               }
             ),
             
             createPropertyDescriptor("debugGraphicsOptions", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                      "enumerationValues", debugGraphicsOptionsEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Diagnostic options for graphics operations.",
               }
             ),
             
             createPropertyDescriptor("doubleBuffered", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "doubleBuffered",
               }
             ),
             
             createPropertyDescriptor("enabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The enabled state of the component.",
               }
             ),
             
             createPropertyDescriptor("focusCycleRoot", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusCycleRoot",
               }
             ),
             
             createPropertyDescriptor("focusTraversalPolicy", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusTraversalPolicy",
               }
             ),
             
             createPropertyDescriptor("focusTraversalPolicyProvider", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusTraversalPolicyProvider",
               }
             ),
             
             createPropertyDescriptor("focusTraversalPolicySet", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusTraversalPolicySet",
               }
             ),
             
             createPropertyDescriptor("focusable", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "focusable",
               }
             ),
             
             createPropertyDescriptor("font", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The font for the component.",
               }
             ),
             
             createPropertyDescriptor("foreground", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The foreground color of the component.",
               }
             ),
             
             createPropertyDescriptor("graphics", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "graphics",
               }
             ),
             
             createPropertyDescriptor("height", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "height",
               }
             ),
             
             createPropertyDescriptor("inheritsPopupMenu", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether or not the JPopupMenu is inherited",
               }
             ),
             
             createPropertyDescriptor("inputVerifier", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The component's input verifier.",
               }
             ),
             
             createPropertyDescriptor("insets", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "insets",
               }
             ),
             
             createPropertyDescriptor("layout", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "layout",
               }
             ),
             
             createPropertyDescriptor("managingFocus", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "managingFocus",
               }
             ),
             
             createPropertyDescriptor("maximumSize", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The maximum size of the component.",
               }
             ),
             
             createPropertyDescriptor("minimumSize", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The minimum size of the component.",
               }
             ),
             
             createPropertyDescriptor("name", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "name",
               }
             ),
             
             createPropertyDescriptor("nextFocusableComponent", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "nextFocusableComponent",
               }
             ),
             
             createPropertyDescriptor("opaque", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The component's opacity",
               }
             ),
             
             createPropertyDescriptor("optimizedDrawingEnabled", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "optimizedDrawingEnabled",
               }
             ),
             
             createPropertyDescriptor("paintingForPrint", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "paintingForPrint",
               }
             ),
             
             createPropertyDescriptor("paintingTile", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "paintingTile",
               }
             ),
             
             createPropertyDescriptor("preferredSize", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The preferred size of the component.",
               }
             ),
             
             createPropertyDescriptor("registeredKeyStrokes", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "registeredKeyStrokes",
               }
             ),
             
             createPropertyDescriptor("requestFocusEnabled", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "requestFocusEnabled",
               }
             ),
             
             createPropertyDescriptor("rootPane", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "rootPane",
               }
             ),
             
             createPropertyDescriptor("toolTipText", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The text to display in a tool tip.",
               }
             ),
             
             createPropertyDescriptor("topLevelAncestor", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "topLevelAncestor",
               }
             ),
             
             createPropertyDescriptor("transferHandler", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Mechanism for transfer of data to and from the component",
               }
             ),
             
             createPropertyDescriptor("validateRoot", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "validateRoot",
               }
             ),
             
             createPropertyDescriptor("verifyInputWhenFocusTarget", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Whether the Component verifies input before accepting focus.",
               }
             ),
             
             createPropertyDescriptor("vetoableChangeListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "vetoableChangeListeners",
               }
             ),
             
             createPropertyDescriptor("visible", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "visible",
               }
             ),
             
             createPropertyDescriptor("visibleRect", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "visibleRect",
               }
             ),
             
             createPropertyDescriptor("width", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "width",
               }
             ),
             
             createPropertyDescriptor("x", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "x",
               }
             ),
             
             createPropertyDescriptor("y", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "y",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JComponent
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JComponentColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JComponentColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JComponentMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JComponentMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


