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

#include "precompiled.hpp"
#include "adfiles/ad_x86_64.hpp"
MachOper *UniverseOper::clone(Compile* C) const {
  return new (C) UniverseOper();
}
MachOper *sRegIOper::clone(Compile* C) const {
  return new (C) sRegIOper();
}
MachOper *sRegPOper::clone(Compile* C) const {
  return new (C) sRegPOper();
}
MachOper *sRegFOper::clone(Compile* C) const {
  return new (C) sRegFOper();
}
MachOper *sRegDOper::clone(Compile* C) const {
  return new (C) sRegDOper();
}
MachOper *sRegLOper::clone(Compile* C) const {
  return new (C) sRegLOper();
}
MachOper *immIOper::clone(Compile* C) const {
  return new (C) immIOper(_c0);
}
MachOper *immI0Oper::clone(Compile* C) const {
  return new (C) immI0Oper(_c0);
}
MachOper *immI1Oper::clone(Compile* C) const {
  return new (C) immI1Oper(_c0);
}
MachOper *immI_M1Oper::clone(Compile* C) const {
  return new (C) immI_M1Oper(_c0);
}
MachOper *immI2Oper::clone(Compile* C) const {
  return new (C) immI2Oper(_c0);
}
MachOper *immI8Oper::clone(Compile* C) const {
  return new (C) immI8Oper(_c0);
}
MachOper *immI16Oper::clone(Compile* C) const {
  return new (C) immI16Oper(_c0);
}
MachOper *immI_32Oper::clone(Compile* C) const {
  return new (C) immI_32Oper(_c0);
}
MachOper *immI_64Oper::clone(Compile* C) const {
  return new (C) immI_64Oper(_c0);
}
MachOper *immPOper::clone(Compile* C) const {
  return new (C) immPOper(_c0);
}
MachOper *immP0Oper::clone(Compile* C) const {
  return new (C) immP0Oper(_c0);
}
MachOper *immNOper::clone(Compile* C) const {
  return new (C) immNOper(_c0);
}
MachOper *immN0Oper::clone(Compile* C) const {
  return new (C) immN0Oper(_c0);
}
MachOper *immP31Oper::clone(Compile* C) const {
  return new (C) immP31Oper(_c0);
}
MachOper *immLOper::clone(Compile* C) const {
  return new (C) immLOper(_c0);
}
MachOper *immL8Oper::clone(Compile* C) const {
  return new (C) immL8Oper(_c0);
}
MachOper *immUL32Oper::clone(Compile* C) const {
  return new (C) immUL32Oper(_c0);
}
MachOper *immL32Oper::clone(Compile* C) const {
  return new (C) immL32Oper(_c0);
}
MachOper *immL0Oper::clone(Compile* C) const {
  return new (C) immL0Oper(_c0);
}
MachOper *immL1Oper::clone(Compile* C) const {
  return new (C) immL1Oper(_c0);
}
MachOper *immL_M1Oper::clone(Compile* C) const {
  return new (C) immL_M1Oper(_c0);
}
MachOper *immL10Oper::clone(Compile* C) const {
  return new (C) immL10Oper(_c0);
}
MachOper *immL_127Oper::clone(Compile* C) const {
  return new (C) immL_127Oper(_c0);
}
MachOper *immL_32bitsOper::clone(Compile* C) const {
  return new (C) immL_32bitsOper(_c0);
}
MachOper *immF0Oper::clone(Compile* C) const {
  return new (C) immF0Oper(_c0);
}
MachOper *immFOper::clone(Compile* C) const {
  return new (C) immFOper(_c0);
}
MachOper *immD0Oper::clone(Compile* C) const {
  return new (C) immD0Oper(_c0);
}
MachOper *immDOper::clone(Compile* C) const {
  return new (C) immDOper(_c0);
}
MachOper *immI_16Oper::clone(Compile* C) const {
  return new (C) immI_16Oper(_c0);
}
MachOper *immI_24Oper::clone(Compile* C) const {
  return new (C) immI_24Oper(_c0);
}
MachOper *immI_255Oper::clone(Compile* C) const {
  return new (C) immI_255Oper(_c0);
}
MachOper *immI_65535Oper::clone(Compile* C) const {
  return new (C) immI_65535Oper(_c0);
}
MachOper *immL_255Oper::clone(Compile* C) const {
  return new (C) immL_255Oper(_c0);
}
MachOper *immL_65535Oper::clone(Compile* C) const {
  return new (C) immL_65535Oper(_c0);
}
MachOper *rRegIOper::clone(Compile* C) const {
  return new (C) rRegIOper();
}
MachOper *rax_RegIOper::clone(Compile* C) const {
  return new (C) rax_RegIOper();
}
MachOper *rbx_RegIOper::clone(Compile* C) const {
  return new (C) rbx_RegIOper();
}
MachOper *rcx_RegIOper::clone(Compile* C) const {
  return new (C) rcx_RegIOper();
}
MachOper *rdx_RegIOper::clone(Compile* C) const {
  return new (C) rdx_RegIOper();
}
MachOper *rdi_RegIOper::clone(Compile* C) const {
  return new (C) rdi_RegIOper();
}
MachOper *no_rcx_RegIOper::clone(Compile* C) const {
  return new (C) no_rcx_RegIOper();
}
MachOper *no_rax_rdx_RegIOper::clone(Compile* C) const {
  return new (C) no_rax_rdx_RegIOper();
}
MachOper *any_RegPOper::clone(Compile* C) const {
  return new (C) any_RegPOper();
}
MachOper *rRegPOper::clone(Compile* C) const {
  return new (C) rRegPOper();
}
MachOper *rRegNOper::clone(Compile* C) const {
  return new (C) rRegNOper();
}
MachOper *no_rax_RegPOper::clone(Compile* C) const {
  return new (C) no_rax_RegPOper();
}
MachOper *no_rbp_RegPOper::clone(Compile* C) const {
  return new (C) no_rbp_RegPOper();
}
MachOper *no_rax_rbx_RegPOper::clone(Compile* C) const {
  return new (C) no_rax_rbx_RegPOper();
}
MachOper *rax_RegPOper::clone(Compile* C) const {
  return new (C) rax_RegPOper();
}
MachOper *rax_RegNOper::clone(Compile* C) const {
  return new (C) rax_RegNOper();
}
MachOper *rbx_RegPOper::clone(Compile* C) const {
  return new (C) rbx_RegPOper();
}
MachOper *rsi_RegPOper::clone(Compile* C) const {
  return new (C) rsi_RegPOper();
}
MachOper *rdi_RegPOper::clone(Compile* C) const {
  return new (C) rdi_RegPOper();
}
MachOper *rbp_RegPOper::clone(Compile* C) const {
  return new (C) rbp_RegPOper();
}
MachOper *r15_RegPOper::clone(Compile* C) const {
  return new (C) r15_RegPOper();
}
MachOper *rRegLOper::clone(Compile* C) const {
  return new (C) rRegLOper();
}
MachOper *no_rax_rdx_RegLOper::clone(Compile* C) const {
  return new (C) no_rax_rdx_RegLOper();
}
MachOper *no_rax_RegLOper::clone(Compile* C) const {
  return new (C) no_rax_RegLOper();
}
MachOper *no_rcx_RegLOper::clone(Compile* C) const {
  return new (C) no_rcx_RegLOper();
}
MachOper *rax_RegLOper::clone(Compile* C) const {
  return new (C) rax_RegLOper();
}
MachOper *rcx_RegLOper::clone(Compile* C) const {
  return new (C) rcx_RegLOper();
}
MachOper *rdx_RegLOper::clone(Compile* C) const {
  return new (C) rdx_RegLOper();
}
MachOper *rFlagsRegOper::clone(Compile* C) const {
  return new (C) rFlagsRegOper();
}
MachOper *rFlagsRegUOper::clone(Compile* C) const {
  return new (C) rFlagsRegUOper();
}
MachOper *rFlagsRegUCFOper::clone(Compile* C) const {
  return new (C) rFlagsRegUCFOper();
}
MachOper *regFOper::clone(Compile* C) const {
  return new (C) regFOper();
}
MachOper *regDOper::clone(Compile* C) const {
  return new (C) regDOper();
}
MachOper *indirectOper::clone(Compile* C) const {
  return new (C) indirectOper();
}
MachOper *indOffset8Oper::clone(Compile* C) const {
  return new (C) indOffset8Oper(_c0);
}
MachOper *indOffset32Oper::clone(Compile* C) const {
  return new (C) indOffset32Oper(_c0);
}
MachOper *indIndexOffsetOper::clone(Compile* C) const {
  return new (C) indIndexOffsetOper(_c0);
}
MachOper *indIndexOper::clone(Compile* C) const {
  return new (C) indIndexOper();
}
MachOper *indIndexScaleOper::clone(Compile* C) const {
  return new (C) indIndexScaleOper(_c0);
}
MachOper *indIndexScaleOffsetOper::clone(Compile* C) const {
  return new (C) indIndexScaleOffsetOper(_c0, _c1);
}
MachOper *indPosIndexScaleOffsetOper::clone(Compile* C) const {
  return new (C) indPosIndexScaleOffsetOper(_c0, _c1);
}
MachOper *indCompressedOopOffsetOper::clone(Compile* C) const {
  return new (C) indCompressedOopOffsetOper(_c0);
}
MachOper *indirectNarrowOper::clone(Compile* C) const {
  return new (C) indirectNarrowOper();
}
MachOper *indOffset8NarrowOper::clone(Compile* C) const {
  return new (C) indOffset8NarrowOper(_c0);
}
MachOper *indOffset32NarrowOper::clone(Compile* C) const {
  return new (C) indOffset32NarrowOper(_c0);
}
MachOper *indIndexOffsetNarrowOper::clone(Compile* C) const {
  return new (C) indIndexOffsetNarrowOper(_c0);
}
MachOper *indIndexNarrowOper::clone(Compile* C) const {
  return new (C) indIndexNarrowOper();
}
MachOper *indIndexScaleNarrowOper::clone(Compile* C) const {
  return new (C) indIndexScaleNarrowOper(_c0);
}
MachOper *indIndexScaleOffsetNarrowOper::clone(Compile* C) const {
  return new (C) indIndexScaleOffsetNarrowOper(_c0, _c1);
}
MachOper *indPosIndexScaleOffsetNarrowOper::clone(Compile* C) const {
  return new (C) indPosIndexScaleOffsetNarrowOper(_c0, _c1);
}
MachOper *stackSlotPOper::clone(Compile* C) const {
  return new (C) stackSlotPOper();
}
MachOper *stackSlotIOper::clone(Compile* C) const {
  return new (C) stackSlotIOper();
}
MachOper *stackSlotFOper::clone(Compile* C) const {
  return new (C) stackSlotFOper();
}
MachOper *stackSlotDOper::clone(Compile* C) const {
  return new (C) stackSlotDOper();
}
MachOper *stackSlotLOper::clone(Compile* C) const {
  return new (C) stackSlotLOper();
}
MachOper *cmpOpOper::clone(Compile* C) const {
  return new (C) cmpOpOper(_c0);
}
MachOper *cmpOpUOper::clone(Compile* C) const {
  return new (C) cmpOpUOper(_c0);
}
MachOper *cmpOpUCFOper::clone(Compile* C) const {
  return new (C) cmpOpUCFOper(_c0);
}
MachOper *cmpOpUCF2Oper::clone(Compile* C) const {
  return new (C) cmpOpUCF2Oper(_c0);
}
MachOper *vecSOper::clone(Compile* C) const {
  return new (C) vecSOper();
}
MachOper *vecDOper::clone(Compile* C) const {
  return new (C) vecDOper();
}
MachOper *vecXOper::clone(Compile* C) const {
  return new (C) vecXOper();
}
MachOper *vecYOper::clone(Compile* C) const {
  return new (C) vecYOper();
}
// Check consistency of C++ compilation with ADLC options:
// Check adlc -D_ALLBSD_SOURCE=1
#ifndef _ALLBSD_SOURCE
#  error "_ALLBSD_SOURCE must be defined"
#endif // _ALLBSD_SOURCE
// Check adlc -D_GNU_SOURCE=1
#ifndef _GNU_SOURCE
#  error "_GNU_SOURCE must be defined"
#endif // _GNU_SOURCE
// Check adlc -DAMD64=1
#ifndef AMD64
#  error "AMD64 must be defined"
#endif // AMD64
// Check adlc -D_LP64=1
#ifndef _LP64
#  error "_LP64 must be defined"
#endif // _LP64
