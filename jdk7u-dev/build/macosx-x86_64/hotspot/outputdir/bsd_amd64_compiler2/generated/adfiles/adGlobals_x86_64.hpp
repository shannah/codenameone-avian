//
// Copyright (c) 2003, 2012, Oracle and/or its affiliates. All rights reserved.
// DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
//
// This code is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License version 2 only, as
// published by the Free Software Foundation.
//
// This code is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// version 2 for more details (a copy is included in the LICENSE file that
// accompanied this code).
//
// You should have received a copy of the GNU General Public License version
// 2 along with this work; if not, write to the Free Software Foundation,
// Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
//
// Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// or visit www.oracle.com if you need additional information or have any
// questions.
//
//

// Machine Generated File.  Do Not Edit!


#ifndef GENERATED_ADFILES_ADGLOBALS_HPP
#define GENERATED_ADFILES_ADGLOBALS_HPP


// the number of reserved registers + machine registers.
#define REG_COUNT    161

// the number of save_on_entry + always_saved registers.
#define MAX_SAVED_ON_ENTRY_REG_COUNT    12
#define     SAVED_ON_ENTRY_REG_COUNT    0
#define   C_SAVED_ON_ENTRY_REG_COUNT    12

// Enumerate machine register numbers starting after reserved regs.
// in the order of occurrence in the register block.
enum MachRegisterNumbers {
  R10_num,                  // enum   0, regnum   0, reg encode  10
  R10_H_num,                // enum   1, regnum   1, reg encode  10
  R11_num,                  // enum   2, regnum   2, reg encode  11
  R11_H_num,                // enum   3, regnum   3, reg encode  11
  R8_num,                   // enum   4, regnum   4, reg encode   8
  R8_H_num,                 // enum   5, regnum   5, reg encode   8
  R9_num,                   // enum   6, regnum   6, reg encode   9
  R9_H_num,                 // enum   7, regnum   7, reg encode   9
  R12_num,                  // enum   8, regnum   8, reg encode  12
  R12_H_num,                // enum   9, regnum   9, reg encode  12
  RCX_num,                  // enum  10, regnum  10, reg encode   1
  RCX_H_num,                // enum  11, regnum  11, reg encode   1
  RBX_num,                  // enum  12, regnum  12, reg encode   3
  RBX_H_num,                // enum  13, regnum  13, reg encode   3
  RDI_num,                  // enum  14, regnum  14, reg encode   7
  RDI_H_num,                // enum  15, regnum  15, reg encode   7
  RDX_num,                  // enum  16, regnum  16, reg encode   2
  RDX_H_num,                // enum  17, regnum  17, reg encode   2
  RSI_num,                  // enum  18, regnum  18, reg encode   6
  RSI_H_num,                // enum  19, regnum  19, reg encode   6
  RAX_num,                  // enum  20, regnum  20, reg encode   0
  RAX_H_num,                // enum  21, regnum  21, reg encode   0
  RBP_num,                  // enum  22, regnum  22, reg encode   5
  RBP_H_num,                // enum  23, regnum  23, reg encode   5
  R13_num,                  // enum  24, regnum  24, reg encode  13
  R13_H_num,                // enum  25, regnum  25, reg encode  13
  R14_num,                  // enum  26, regnum  26, reg encode  14
  R14_H_num,                // enum  27, regnum  27, reg encode  14
  R15_num,                  // enum  28, regnum  28, reg encode  15
  R15_H_num,                // enum  29, regnum  29, reg encode  15
  RSP_num,                  // enum  30, regnum  30, reg encode   4
  RSP_H_num,                // enum  31, regnum  31, reg encode   4
  XMM0_num,                 // enum  32, regnum  32, reg encode   0
  XMM0b_num,                // enum  33, regnum  33, reg encode   0
  XMM0c_num,                // enum  34, regnum  34, reg encode   0
  XMM0d_num,                // enum  35, regnum  35, reg encode   0
  XMM0e_num,                // enum  36, regnum  36, reg encode   0
  XMM0f_num,                // enum  37, regnum  37, reg encode   0
  XMM0g_num,                // enum  38, regnum  38, reg encode   0
  XMM0h_num,                // enum  39, regnum  39, reg encode   0
  XMM1_num,                 // enum  40, regnum  40, reg encode   1
  XMM1b_num,                // enum  41, regnum  41, reg encode   1
  XMM1c_num,                // enum  42, regnum  42, reg encode   1
  XMM1d_num,                // enum  43, regnum  43, reg encode   1
  XMM1e_num,                // enum  44, regnum  44, reg encode   1
  XMM1f_num,                // enum  45, regnum  45, reg encode   1
  XMM1g_num,                // enum  46, regnum  46, reg encode   1
  XMM1h_num,                // enum  47, regnum  47, reg encode   1
  XMM2_num,                 // enum  48, regnum  48, reg encode   2
  XMM2b_num,                // enum  49, regnum  49, reg encode   2
  XMM2c_num,                // enum  50, regnum  50, reg encode   2
  XMM2d_num,                // enum  51, regnum  51, reg encode   2
  XMM2e_num,                // enum  52, regnum  52, reg encode   2
  XMM2f_num,                // enum  53, regnum  53, reg encode   2
  XMM2g_num,                // enum  54, regnum  54, reg encode   2
  XMM2h_num,                // enum  55, regnum  55, reg encode   2
  XMM3_num,                 // enum  56, regnum  56, reg encode   3
  XMM3b_num,                // enum  57, regnum  57, reg encode   3
  XMM3c_num,                // enum  58, regnum  58, reg encode   3
  XMM3d_num,                // enum  59, regnum  59, reg encode   3
  XMM3e_num,                // enum  60, regnum  60, reg encode   3
  XMM3f_num,                // enum  61, regnum  61, reg encode   3
  XMM3g_num,                // enum  62, regnum  62, reg encode   3
  XMM3h_num,                // enum  63, regnum  63, reg encode   3
  XMM4_num,                 // enum  64, regnum  64, reg encode   4
  XMM4b_num,                // enum  65, regnum  65, reg encode   4
  XMM4c_num,                // enum  66, regnum  66, reg encode   4
  XMM4d_num,                // enum  67, regnum  67, reg encode   4
  XMM4e_num,                // enum  68, regnum  68, reg encode   4
  XMM4f_num,                // enum  69, regnum  69, reg encode   4
  XMM4g_num,                // enum  70, regnum  70, reg encode   4
  XMM4h_num,                // enum  71, regnum  71, reg encode   4
  XMM5_num,                 // enum  72, regnum  72, reg encode   5
  XMM5b_num,                // enum  73, regnum  73, reg encode   5
  XMM5c_num,                // enum  74, regnum  74, reg encode   5
  XMM5d_num,                // enum  75, regnum  75, reg encode   5
  XMM5e_num,                // enum  76, regnum  76, reg encode   5
  XMM5f_num,                // enum  77, regnum  77, reg encode   5
  XMM5g_num,                // enum  78, regnum  78, reg encode   5
  XMM5h_num,                // enum  79, regnum  79, reg encode   5
  XMM6_num,                 // enum  80, regnum  80, reg encode   6
  XMM6b_num,                // enum  81, regnum  81, reg encode   6
  XMM6c_num,                // enum  82, regnum  82, reg encode   6
  XMM6d_num,                // enum  83, regnum  83, reg encode   6
  XMM6e_num,                // enum  84, regnum  84, reg encode   6
  XMM6f_num,                // enum  85, regnum  85, reg encode   6
  XMM6g_num,                // enum  86, regnum  86, reg encode   6
  XMM6h_num,                // enum  87, regnum  87, reg encode   6
  XMM7_num,                 // enum  88, regnum  88, reg encode   7
  XMM7b_num,                // enum  89, regnum  89, reg encode   7
  XMM7c_num,                // enum  90, regnum  90, reg encode   7
  XMM7d_num,                // enum  91, regnum  91, reg encode   7
  XMM7e_num,                // enum  92, regnum  92, reg encode   7
  XMM7f_num,                // enum  93, regnum  93, reg encode   7
  XMM7g_num,                // enum  94, regnum  94, reg encode   7
  XMM7h_num,                // enum  95, regnum  95, reg encode   7
  XMM8_num,                 // enum  96, regnum  96, reg encode   8
  XMM8b_num,                // enum  97, regnum  97, reg encode   8
  XMM8c_num,                // enum  98, regnum  98, reg encode   8
  XMM8d_num,                // enum  99, regnum  99, reg encode   8
  XMM8e_num,                // enum 100, regnum 100, reg encode   8
  XMM8f_num,                // enum 101, regnum 101, reg encode   8
  XMM8g_num,                // enum 102, regnum 102, reg encode   8
  XMM8h_num,                // enum 103, regnum 103, reg encode   8
  XMM9_num,                 // enum 104, regnum 104, reg encode   9
  XMM9b_num,                // enum 105, regnum 105, reg encode   9
  XMM9c_num,                // enum 106, regnum 106, reg encode   9
  XMM9d_num,                // enum 107, regnum 107, reg encode   9
  XMM9e_num,                // enum 108, regnum 108, reg encode   9
  XMM9f_num,                // enum 109, regnum 109, reg encode   9
  XMM9g_num,                // enum 110, regnum 110, reg encode   9
  XMM9h_num,                // enum 111, regnum 111, reg encode   9
  XMM10_num,                // enum 112, regnum 112, reg encode  10
  XMM10b_num,               // enum 113, regnum 113, reg encode  10
  XMM10c_num,               // enum 114, regnum 114, reg encode  10
  XMM10d_num,               // enum 115, regnum 115, reg encode  10
  XMM10e_num,               // enum 116, regnum 116, reg encode  10
  XMM10f_num,               // enum 117, regnum 117, reg encode  10
  XMM10g_num,               // enum 118, regnum 118, reg encode  10
  XMM10h_num,               // enum 119, regnum 119, reg encode  10
  XMM11_num,                // enum 120, regnum 120, reg encode  11
  XMM11b_num,               // enum 121, regnum 121, reg encode  11
  XMM11c_num,               // enum 122, regnum 122, reg encode  11
  XMM11d_num,               // enum 123, regnum 123, reg encode  11
  XMM11e_num,               // enum 124, regnum 124, reg encode  11
  XMM11f_num,               // enum 125, regnum 125, reg encode  11
  XMM11g_num,               // enum 126, regnum 126, reg encode  11
  XMM11h_num,               // enum 127, regnum 127, reg encode  11
  XMM12_num,                // enum 128, regnum 128, reg encode  12
  XMM12b_num,               // enum 129, regnum 129, reg encode  12
  XMM12c_num,               // enum 130, regnum 130, reg encode  12
  XMM12d_num,               // enum 131, regnum 131, reg encode  12
  XMM12e_num,               // enum 132, regnum 132, reg encode  12
  XMM12f_num,               // enum 133, regnum 133, reg encode  12
  XMM12g_num,               // enum 134, regnum 134, reg encode  12
  XMM12h_num,               // enum 135, regnum 135, reg encode  12
  XMM13_num,                // enum 136, regnum 136, reg encode  13
  XMM13b_num,               // enum 137, regnum 137, reg encode  13
  XMM13c_num,               // enum 138, regnum 138, reg encode  13
  XMM13d_num,               // enum 139, regnum 139, reg encode  13
  XMM13e_num,               // enum 140, regnum 140, reg encode  13
  XMM13f_num,               // enum 141, regnum 141, reg encode  13
  XMM13g_num,               // enum 142, regnum 142, reg encode  13
  XMM13h_num,               // enum 143, regnum 143, reg encode  13
  XMM14_num,                // enum 144, regnum 144, reg encode  14
  XMM14b_num,               // enum 145, regnum 145, reg encode  14
  XMM14c_num,               // enum 146, regnum 146, reg encode  14
  XMM14d_num,               // enum 147, regnum 147, reg encode  14
  XMM14e_num,               // enum 148, regnum 148, reg encode  14
  XMM14f_num,               // enum 149, regnum 149, reg encode  14
  XMM14g_num,               // enum 150, regnum 150, reg encode  14
  XMM14h_num,               // enum 151, regnum 151, reg encode  14
  XMM15_num,                // enum 152, regnum 152, reg encode  15
  XMM15b_num,               // enum 153, regnum 153, reg encode  15
  XMM15c_num,               // enum 154, regnum 154, reg encode  15
  XMM15d_num,               // enum 155, regnum 155, reg encode  15
  XMM15e_num,               // enum 156, regnum 156, reg encode  15
  XMM15f_num,               // enum 157, regnum 157, reg encode  15
  XMM15g_num,               // enum 158, regnum 158, reg encode  15
  XMM15h_num,               // enum 159, regnum 159, reg encode  15
  RFLAGS_num,               // enum 160, regnum 160, reg encode  16
  _last_Mach_Reg            // 161
};

// Size of register-mask in ints
#define RM_SIZE 10
// Unroll factor for loops over the data in a RegMask
#define FORALL_BODY BODY(0) BODY(1) BODY(2) BODY(3) BODY(4) BODY(5) BODY(6) BODY(7) BODY(8) BODY(9) 

class RegMask;

#endif // GENERATED_ADFILES_ADGLOBALS_HPP
