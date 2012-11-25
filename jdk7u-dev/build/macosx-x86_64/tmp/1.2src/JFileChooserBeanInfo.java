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
 * Descriptive information about the JFileChooser class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JFileChooser properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JFileChooserBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJFileChooser = javax.swing.JFileChooser.class;

    /**
     * @return a JFileChooser BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJFileChooser,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                              "isContainer", Boolean.FALSE,
                 
                    BeanInfoUtils.SHORTDESCRIPTION, "A component which allows for the interactive selection of a file."
        });
    }


    /**
     * Create a JFileChooser PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JFileChooser.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JFileChooser PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJFileChooser, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JFileChooser.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JFileChooser
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] dialogTypeEnumeration = new Object[] { 
			"OPEN_DIALOG" ,   new Integer(JFileChooser.OPEN_DIALOG), "JFileChooser.OPEN_DIALOG",
			"SAVE_DIALOG" ,   new Integer(JFileChooser.SAVE_DIALOG), "JFileChooser.SAVE_DIALOG",
			"CUSTOM_DIALOG" ,   new Integer(JFileChooser.CUSTOM_DIALOG), "JFileChooser.CUSTOM_DIALOG"
		};

		Object[] fileSelectionModeEnumeration = new Object[] { 
			"FILES_ONLY" ,   new Integer(JFileChooser.FILES_ONLY), "JFileChooser.FILES_ONLY",
			"DIRECTORIES_ONLY" ,   new Integer(JFileChooser.DIRECTORIES_ONLY), "JFileChooser.DIRECTORIES_ONLY",
			"FILES_AND_DIRECTORIES" ,   new Integer(JFileChooser.FILES_AND_DIRECTORIES), "JFileChooser.FILES_AND_DIRECTORIES"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UI",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "A string that specifies the name of the L&F class.",
               }
             ),
             
             createPropertyDescriptor("acceptAllFileFilter", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "acceptAllFileFilter",
               }
             ),
             
             createPropertyDescriptor("acceptAllFileFilterUsed", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets whether the AcceptAll FileFilter is used as an available choice in the choosable filter list.",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("accessory", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets the accessory component on the JFileChooser.",
               }
             ),
             
             createPropertyDescriptor("actionListeners", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "actionListeners",
               }
             ),
             
             createPropertyDescriptor("approveButtonMnemonic", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The mnemonic key accelerator for the ApproveButton.",
               }
             ),
             
             createPropertyDescriptor("approveButtonText", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The text that goes in the ApproveButton.",
               }
             ),
             
             createPropertyDescriptor("approveButtonToolTipText", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The tooltip text for the ApproveButton.",
               }
             ),
             
             createPropertyDescriptor("choosableFileFilters", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "choosableFileFilters",
               }
             ),
             
             createPropertyDescriptor("controlButtonsAreShown", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets whether the approve & cancel buttons are shown.",
               }
             ),
             
             createPropertyDescriptor("currentDirectory", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The directory that the JFileChooser is showing files of.",
               }
             ),
             
             createPropertyDescriptor("dialogTitle", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The title of the JFileChooser dialog window.",
               }
             ),
             
             createPropertyDescriptor("dialogType", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", dialogTypeEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The type (open, save, custom) of the JFileChooser. ",
               }
             ),
             
             createPropertyDescriptor("directorySelectionEnabled", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "directorySelectionEnabled",
               }
             ),
             
             createPropertyDescriptor("dragEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.FALSE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "determines whether automatic drag handling is enabled ",
               }
             ),
             
             createPropertyDescriptor("fileFilter", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets the File Filter used to filter out files of type.",
               }
             ),
             
             createPropertyDescriptor("fileHidingEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets file hiding on or off.",
               }
             ),
             
             createPropertyDescriptor("fileSelectionEnabled", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "fileSelectionEnabled",
               }
             ),
             
             createPropertyDescriptor("fileSelectionMode", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", fileSelectionModeEnumeration,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets the types of files that the JFileChooser can choose. ",
               }
             ),
             
             createPropertyDescriptor("fileSystemView", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.EXPERT, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets the FileSytemView used to get filesystem information.",
               }
             ),
             
             createPropertyDescriptor("fileView", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets the File View used to get file type information.",
               }
             ),
             
             createPropertyDescriptor("multiSelectionEnabled", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Sets multiple file selection mode.",
               }
             ),
             
             createPropertyDescriptor("selectedFile", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                        sun.swing.BeanInfoUtils.PREFERRED, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedFile",
               }
             ),
             
             createPropertyDescriptor("selectedFiles", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The list of selected files if the chooser is in multiple selection mode.",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JFileChooser
     */
    public Image getIcon(int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadImage("beaninfo/images/JFileChooserColor32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadImage("beaninfo/images/JFileChooserColor16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadImage("beaninfo/images/JFileChooserMono32.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono32.gif") : i);		  
            case ICON_MONO_16x16:
                i = loadImage("beaninfo/images/JFileChooserMono16.gif");
                return ((i == null) ? loadImage("beaninfo/images/JComponentMono16.gif") : i);		  
            default:
                return super.getIcon(kind);
        }
    }
}


