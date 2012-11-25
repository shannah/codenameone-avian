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
#include "opto/cfgnode.hpp"
#include "opto/locknode.hpp"


//------------------------- MachOper Generator ---------------
// A switch statement on the dense-packed user-defined type system
// that invokes 'new' on the corresponding class constructor.

MachOper *State::MachOperGenerator(int opcode, Compile* C){

  switch(opcode) {
  case UNIVERSE:
    return new (C) UniverseOper( );
  case LABEL:
    return new (C) labelOper( );
  case SREGI:
    return new (C) sRegIOper( );
  case SREGP:
    return new (C) sRegPOper( );
  case SREGF:
    return new (C) sRegFOper( );
  case SREGD:
    return new (C) sRegDOper( );
  case SREGL:
    return new (C) sRegLOper( );
  case METHOD:
    return new (C) methodOper( );
  case IMMI:
    return new (C) immIOper(_leaf->get_int() );
  case IMMI0:
    return new (C) immI0Oper(_leaf->get_int() );
  case IMMI1:
    return new (C) immI1Oper(_leaf->get_int() );
  case IMMI_M1:
    return new (C) immI_M1Oper(_leaf->get_int() );
  case IMMI2:
    return new (C) immI2Oper(_leaf->get_int() );
  case IMMI8:
    return new (C) immI8Oper(_leaf->get_int() );
  case IMMI16:
    return new (C) immI16Oper(_leaf->get_int() );
  case IMMI_32:
    return new (C) immI_32Oper(_leaf->get_int() );
  case IMMI_64:
    return new (C) immI_64Oper(_leaf->get_int() );
  case IMMP:
    return new (C) immPOper(_leaf->bottom_type()->is_ptr() );
  case IMMP0:
    return new (C) immP0Oper(_leaf->bottom_type()->is_ptr() );
  case IMMN:
    return new (C) immNOper(_leaf->bottom_type()->is_narrowoop() );
  case IMMN0:
    return new (C) immN0Oper(_leaf->bottom_type()->is_narrowoop() );
  case IMMP31:
    return new (C) immP31Oper(_leaf->bottom_type()->is_ptr() );
  case IMML:
    return new (C) immLOper(_leaf->get_long() );
  case IMML8:
    return new (C) immL8Oper(_leaf->get_long() );
  case IMMUL32:
    return new (C) immUL32Oper(_leaf->get_long() );
  case IMML32:
    return new (C) immL32Oper(_leaf->get_long() );
  case IMML0:
    return new (C) immL0Oper(_leaf->get_long() );
  case IMML1:
    return new (C) immL1Oper(_leaf->get_long() );
  case IMML_M1:
    return new (C) immL_M1Oper(_leaf->get_long() );
  case IMML10:
    return new (C) immL10Oper(_leaf->get_long() );
  case IMML_127:
    return new (C) immL_127Oper(_leaf->get_long() );
  case IMML_32BITS:
    return new (C) immL_32bitsOper(_leaf->get_long() );
  case IMMF0:
    return new (C) immF0Oper(_leaf->getf() );
  case IMMF:
    return new (C) immFOper(_leaf->getf() );
  case IMMD0:
    return new (C) immD0Oper(_leaf->getd() );
  case IMMD:
    return new (C) immDOper(_leaf->getd() );
  case IMMI_16:
    return new (C) immI_16Oper(_leaf->get_int() );
  case IMMI_24:
    return new (C) immI_24Oper(_leaf->get_int() );
  case IMMI_255:
    return new (C) immI_255Oper(_leaf->get_int() );
  case IMMI_65535:
    return new (C) immI_65535Oper(_leaf->get_int() );
  case IMML_255:
    return new (C) immL_255Oper(_leaf->get_long() );
  case IMML_65535:
    return new (C) immL_65535Oper(_leaf->get_long() );
  case RREGI:
    return new (C) rRegIOper( );
  case RAX_REGI:
    return new (C) rax_RegIOper( );
  case RBX_REGI:
    return new (C) rbx_RegIOper( );
  case RCX_REGI:
    return new (C) rcx_RegIOper( );
  case RDX_REGI:
    return new (C) rdx_RegIOper( );
  case RDI_REGI:
    return new (C) rdi_RegIOper( );
  case NO_RCX_REGI:
    return new (C) no_rcx_RegIOper( );
  case NO_RAX_RDX_REGI:
    return new (C) no_rax_rdx_RegIOper( );
  case ANY_REGP:
    return new (C) any_RegPOper( );
  case RREGP:
    return new (C) rRegPOper( );
  case RREGN:
    return new (C) rRegNOper( );
  case NO_RAX_REGP:
    return new (C) no_rax_RegPOper( );
  case NO_RBP_REGP:
    return new (C) no_rbp_RegPOper( );
  case NO_RAX_RBX_REGP:
    return new (C) no_rax_rbx_RegPOper( );
  case RAX_REGP:
    return new (C) rax_RegPOper( );
  case RAX_REGN:
    return new (C) rax_RegNOper( );
  case RBX_REGP:
    return new (C) rbx_RegPOper( );
  case RSI_REGP:
    return new (C) rsi_RegPOper( );
  case RDI_REGP:
    return new (C) rdi_RegPOper( );
  case RBP_REGP:
    return new (C) rbp_RegPOper( );
  case R15_REGP:
    return new (C) r15_RegPOper( );
  case RREGL:
    return new (C) rRegLOper( );
  case NO_RAX_RDX_REGL:
    return new (C) no_rax_rdx_RegLOper( );
  case NO_RAX_REGL:
    return new (C) no_rax_RegLOper( );
  case NO_RCX_REGL:
    return new (C) no_rcx_RegLOper( );
  case RAX_REGL:
    return new (C) rax_RegLOper( );
  case RCX_REGL:
    return new (C) rcx_RegLOper( );
  case RDX_REGL:
    return new (C) rdx_RegLOper( );
  case RFLAGSREG:
    return new (C) rFlagsRegOper( );
  case RFLAGSREGU:
    return new (C) rFlagsRegUOper( );
  case RFLAGSREGUCF:
    return new (C) rFlagsRegUCFOper( );
  case REGF:
    return new (C) regFOper( );
  case REGD:
    return new (C) regDOper( );
  case INDIRECT:
    return new (C) indirectOper( );
  case INDOFFSET8:
    return new (C) indOffset8Oper(_kids[1]->_leaf->get_long() );
  case INDOFFSET32:
    return new (C) indOffset32Oper(_kids[1]->_leaf->get_long() );
  case INDINDEXOFFSET:
    return new (C) indIndexOffsetOper(_kids[1]->_leaf->get_long() );
  case INDINDEX:
    return new (C) indIndexOper( );
  case INDINDEXSCALE:
    return new (C) indIndexScaleOper(_kids[1]->_kids[1]->_leaf->get_int() );
  case INDINDEXSCALEOFFSET:
    return new (C) indIndexScaleOffsetOper(_kids[0]->_kids[1]->_kids[1]->_leaf->get_int(), _kids[1]->_leaf->get_long() );
  case INDPOSINDEXSCALEOFFSET:
    return new (C) indPosIndexScaleOffsetOper(_kids[0]->_kids[1]->_kids[1]->_leaf->get_int(), _kids[1]->_leaf->get_long() );
  case INDCOMPRESSEDOOPOFFSET:
    return new (C) indCompressedOopOffsetOper(_kids[1]->_leaf->get_long() );
  case INDIRECTNARROW:
    return new (C) indirectNarrowOper( );
  case INDOFFSET8NARROW:
    return new (C) indOffset8NarrowOper(_kids[1]->_leaf->get_long() );
  case INDOFFSET32NARROW:
    return new (C) indOffset32NarrowOper(_kids[1]->_leaf->get_long() );
  case INDINDEXOFFSETNARROW:
    return new (C) indIndexOffsetNarrowOper(_kids[1]->_leaf->get_long() );
  case INDINDEXNARROW:
    return new (C) indIndexNarrowOper( );
  case INDINDEXSCALENARROW:
    return new (C) indIndexScaleNarrowOper(_kids[1]->_kids[1]->_leaf->get_int() );
  case INDINDEXSCALEOFFSETNARROW:
    return new (C) indIndexScaleOffsetNarrowOper(_kids[0]->_kids[1]->_kids[1]->_leaf->get_int(), _kids[1]->_leaf->get_long() );
  case INDPOSINDEXSCALEOFFSETNARROW:
    return new (C) indPosIndexScaleOffsetNarrowOper(_kids[0]->_kids[1]->_kids[1]->_leaf->get_int(), _kids[1]->_leaf->get_long() );
  case STACKSLOTP:
    return new (C) stackSlotPOper( );
  case STACKSLOTI:
    return new (C) stackSlotIOper( );
  case STACKSLOTF:
    return new (C) stackSlotFOper( );
  case STACKSLOTD:
    return new (C) stackSlotDOper( );
  case STACKSLOTL:
    return new (C) stackSlotLOper( );
  case CMPOP:
    return new (C) cmpOpOper(_leaf->as_Bool()->_test._test );
  case CMPOPU:
    return new (C) cmpOpUOper(_leaf->as_Bool()->_test._test );
  case CMPOPUCF:
    return new (C) cmpOpUCFOper(_leaf->as_Bool()->_test._test );
  case CMPOPUCF2:
    return new (C) cmpOpUCF2Oper(_leaf->as_Bool()->_test._test );
  case VECS:
    return new (C) vecSOper( );
  case VECD:
    return new (C) vecDOper( );
  case VECX:
    return new (C) vecXOper( );
  case VECY:
    return new (C) vecYOper( );
  case _ADDP_ANY_REGP_RREGL:    return NULL;
  case _LSHIFTL_RREGL_IMMI2:    return NULL;
  case _ADDP_ANY_REGP__LSHIFTL_RREGL_IMMI2:    return NULL;
  case _CONVI2L_RREGI_:    return NULL;
  case _LSHIFTL__CONVI2L_RREGI__IMMI2:    return NULL;
  case _ADDP_ANY_REGP__LSHIFTL__CONVI2L_RREGI__IMMI2:    return NULL;
  case _DECODEN_RREGN_:    return NULL;
  case _ADDP__DECODEN_RREGN__RREGL:    return NULL;
  case _ADDP__DECODEN_RREGN___LSHIFTL_RREGL_IMMI2:    return NULL;
  case _ADDP__DECODEN_RREGN___LSHIFTL__CONVI2L_RREGI__IMMI2:    return NULL;
  case _LOADB_MEMORY_:    return NULL;
  case _LOADUB_MEMORY_:    return NULL;
  case _ANDI__LOADUB_MEMORY__IMMI8:    return NULL;
  case _LOADS_MEMORY_:    return NULL;
  case _LSHIFTI__LOADS_MEMORY__IMMI_24:    return NULL;
  case _LOADUS_MEMORY_:    return NULL;
  case _LSHIFTI__LOADUS_MEMORY__IMMI_24:    return NULL;
  case _ANDI__LOADUS_MEMORY__IMMI_255:    return NULL;
  case _ANDI__LOADUS_MEMORY__IMMI16:    return NULL;
  case _LOADI_MEMORY_:    return NULL;
  case _LSHIFTI__LOADI_MEMORY__IMMI_24:    return NULL;
  case _LSHIFTI__LOADI_MEMORY__IMMI_16:    return NULL;
  case _ANDI__LOADI_MEMORY__IMMI_255:    return NULL;
  case _ANDI__LOADI_MEMORY__IMMI_65535:    return NULL;
  case _ANDI__LOADI_MEMORY__IMMI:    return NULL;
  case _CONVI2L__LOADI_MEMORY__:    return NULL;
  case _LOADL_MEMORY_:    return NULL;
  case _CASTP2X_RREGP_:    return NULL;
  case _CASTP2X__DECODEN_RREGN__:    return NULL;
  case _ADDL__LSHIFTL_RREGL_IMMI2_IMML32:    return NULL;
  case _BINARY_CMPOP_RFLAGSREG:    return NULL;
  case _BINARY_RREGI_RREGI:    return NULL;
  case _BINARY_CMPOPU_RFLAGSREGU:    return NULL;
  case _BINARY_CMPOPUCF_RFLAGSREGUCF:    return NULL;
  case _BINARY_RREGI__LOADI_MEMORY_:    return NULL;
  case _BINARY_RREGN_RREGN:    return NULL;
  case _BINARY_RREGP_RREGP:    return NULL;
  case _BINARY_RREGL_RREGL:    return NULL;
  case _BINARY_RREGL__LOADL_MEMORY_:    return NULL;
  case _BINARY_REGF_REGF:    return NULL;
  case _BINARY_REGD_REGD:    return NULL;
  case _ADDI__LOADI_MEMORY__RREGI:    return NULL;
  case _ADDI_RREGI__LOADI_MEMORY_:    return NULL;
  case _ADDI__LOADI_MEMORY__IMMI:    return NULL;
  case _ADDI__LOADI_MEMORY__IMMI1:    return NULL;
  case _ADDI__LOADI_MEMORY__IMMI_M1:    return NULL;
  case _ADDL__LOADL_MEMORY__RREGL:    return NULL;
  case _ADDL_RREGL__LOADL_MEMORY_:    return NULL;
  case _ADDL__LOADL_MEMORY__IMML32:    return NULL;
  case _ADDL__LOADL_MEMORY__IMML1:    return NULL;
  case _ADDL__LOADL_MEMORY__IMML_M1:    return NULL;
  case _BINARY_RAX_REGP_RREGP:    return NULL;
  case _BINARY_RAX_REGI_RREGI:    return NULL;
  case _BINARY_RAX_REGL_RREGL:    return NULL;
  case _BINARY_RAX_REGN_RREGN:    return NULL;
  case _SUBI__LOADI_MEMORY__RREGI:    return NULL;
  case _SUBI__LOADI_MEMORY__IMMI:    return NULL;
  case _SUBL__LOADL_MEMORY__RREGL:    return NULL;
  case _SUBL__LOADL_MEMORY__IMML32:    return NULL;
  case _SUBI_IMMI0_RREGI:    return NULL;
  case _SUBI_IMMI0__LOADI_MEMORY_:    return NULL;
  case _SUBL_IMML0__LOADL_MEMORY_:    return NULL;
  case _LSHIFTI__LOADI_MEMORY__IMMI1:    return NULL;
  case _LSHIFTI__LOADI_MEMORY__IMMI8:    return NULL;
  case _LSHIFTI__LOADI_MEMORY__RCX_REGI:    return NULL;
  case _RSHIFTI__LOADI_MEMORY__IMMI1:    return NULL;
  case _RSHIFTI__LOADI_MEMORY__IMMI8:    return NULL;
  case _RSHIFTI__LOADI_MEMORY__RCX_REGI:    return NULL;
  case _URSHIFTI__LOADI_MEMORY__IMMI1:    return NULL;
  case _URSHIFTI__LOADI_MEMORY__IMMI8:    return NULL;
  case _URSHIFTI__LOADI_MEMORY__RCX_REGI:    return NULL;
  case _LSHIFTL__LOADL_MEMORY__IMMI1:    return NULL;
  case _LSHIFTL__LOADL_MEMORY__IMMI8:    return NULL;
  case _LSHIFTL__LOADL_MEMORY__RCX_REGI:    return NULL;
  case _RSHIFTL__LOADL_MEMORY__IMMI1:    return NULL;
  case _RSHIFTL__LOADL_MEMORY__IMMI8:    return NULL;
  case _RSHIFTL__LOADL_MEMORY__RCX_REGI:    return NULL;
  case _URSHIFTL__LOADL_MEMORY__IMMI1:    return NULL;
  case _URSHIFTL__LOADL_MEMORY__IMMI8:    return NULL;
  case _URSHIFTL__LOADL_MEMORY__RCX_REGI:    return NULL;
  case _LSHIFTI_RREGI_IMMI_24:    return NULL;
  case _LSHIFTI_RREGI_IMMI_16:    return NULL;
  case _LSHIFTI_RREGI_IMMI1:    return NULL;
  case _URSHIFTI_RREGI_IMMI_M1:    return NULL;
  case _LSHIFTI_RREGI_IMMI8:    return NULL;
  case _URSHIFTI_RREGI_IMMI8:    return NULL;
  case _LSHIFTI_NO_RCX_REGI_RCX_REGI:    return NULL;
  case _SUBI_IMMI0_RCX_REGI:    return NULL;
  case _URSHIFTI_NO_RCX_REGI__SUBI_IMMI0_RCX_REGI:    return NULL;
  case _SUBI_IMMI_32_RCX_REGI:    return NULL;
  case _URSHIFTI_NO_RCX_REGI__SUBI_IMMI_32_RCX_REGI:    return NULL;
  case _URSHIFTI_RREGI_IMMI1:    return NULL;
  case _LSHIFTI_RREGI_IMMI_M1:    return NULL;
  case _URSHIFTI_NO_RCX_REGI_RCX_REGI:    return NULL;
  case _LSHIFTI_NO_RCX_REGI__SUBI_IMMI0_RCX_REGI:    return NULL;
  case _LSHIFTI_NO_RCX_REGI__SUBI_IMMI_32_RCX_REGI:    return NULL;
  case _LSHIFTL_RREGL_IMMI1:    return NULL;
  case _URSHIFTL_RREGL_IMMI_M1:    return NULL;
  case _LSHIFTL_RREGL_IMMI8:    return NULL;
  case _URSHIFTL_RREGL_IMMI8:    return NULL;
  case _LSHIFTL_NO_RCX_REGL_RCX_REGI:    return NULL;
  case _URSHIFTL_NO_RCX_REGL__SUBI_IMMI0_RCX_REGI:    return NULL;
  case _SUBI_IMMI_64_RCX_REGI:    return NULL;
  case _URSHIFTL_NO_RCX_REGL__SUBI_IMMI_64_RCX_REGI:    return NULL;
  case _URSHIFTL_RREGL_IMMI1:    return NULL;
  case _LSHIFTL_RREGL_IMMI_M1:    return NULL;
  case _URSHIFTL_NO_RCX_REGL_RCX_REGI:    return NULL;
  case _LSHIFTL_NO_RCX_REGL__SUBI_IMMI0_RCX_REGI:    return NULL;
  case _LSHIFTL_NO_RCX_REGL__SUBI_IMMI_64_RCX_REGI:    return NULL;
  case _ANDI_RREGI_IMMI_255:    return NULL;
  case _ANDI_RREGI_IMMI_65535:    return NULL;
  case _ANDI__LOADI_MEMORY__RREGI:    return NULL;
  case _ANDI_RREGI__LOADI_MEMORY_:    return NULL;
  case _ORI__LOADI_MEMORY__RREGI:    return NULL;
  case _ORI_RREGI__LOADI_MEMORY_:    return NULL;
  case _ORI__LOADI_MEMORY__IMMI:    return NULL;
  case _XORI__LOADI_MEMORY__RREGI:    return NULL;
  case _XORI_RREGI__LOADI_MEMORY_:    return NULL;
  case _XORI__LOADI_MEMORY__IMMI:    return NULL;
  case _ANDL__LOADL_MEMORY__RREGL:    return NULL;
  case _ANDL_RREGL__LOADL_MEMORY_:    return NULL;
  case _ANDL__LOADL_MEMORY__IMML32:    return NULL;
  case _CASTP2X_ANY_REGP_:    return NULL;
  case _ORL__LOADL_MEMORY__RREGL:    return NULL;
  case _ORL_RREGL__LOADL_MEMORY_:    return NULL;
  case _ORL__LOADL_MEMORY__IMML32:    return NULL;
  case _XORL__LOADL_MEMORY__RREGL:    return NULL;
  case _XORL_RREGL__LOADL_MEMORY_:    return NULL;
  case _XORL__LOADL_MEMORY__IMML32:    return NULL;
  case _CMPLTMASK_RREGI_RREGI:    return NULL;
  case _ANDI__CMPLTMASK_RREGI_RREGI_RREGI:    return NULL;
  case _SUBI_RREGI_RREGI:    return NULL;
  case _ANDI_RREGI__CMPLTMASK_RREGI_RREGI:    return NULL;
  case _LOADF_MEMORY_:    return NULL;
  case _LOADD_MEMORY_:    return NULL;
  case _BINARY_RDI_REGP_RCX_REGI:    return NULL;
  case _BINARY_RSI_REGP_RDX_REGI:    return NULL;
  case _BINARY_RDI_REGP_RDX_REGI:    return NULL;
  case _BINARY_RSI_REGP_IMMI:    return NULL;
  case _BINARY_RSI_REGP_RAX_REGI:    return NULL;
  case _BINARY_RDI_REGP_RSI_REGP:    return NULL;
  case _ANDI_RREGI_IMMI:    return NULL;
  case _LOADP_MEMORY_:    return NULL;
  case _LOADN_MEMORY_:    return NULL;
  case _ANDL_RREGL_IMML32:    return NULL;
  case _PARTIALSUBTYPECHECK_RSI_REGP_RAX_REGP:    return NULL;
  case _CONVF2D_REGF_:    return NULL;
  case _SQRTD__CONVF2D_REGF__:    return NULL;
  case _CONVF2D__LOADF_MEMORY__:    return NULL;
  case _SQRTD__CONVF2D__LOADF_MEMORY___:    return NULL;
  case _CONVF2D_IMMF_:    return NULL;
  case _SQRTD__CONVF2D_IMMF__:    return NULL;
  case _LOADVECTOR_MEMORY_:    return NULL;
  
  default:
    fprintf(stderr, "Default MachOper Generator invoked for: \n");
    fprintf(stderr, "   opcode = %d\n", opcode);
    break;
  }
  return NULL;
};


//------------------------- MachNode Generator ---------------
// A switch statement on the dense-packed user-defined type system
// that invokes 'new' on the corresponding class constructor.

MachNode *State::MachNodeGenerator(int opcode, Compile* C){
  switch(opcode) {
  case loadB_rule: {
      loadBNode *node = new (C) loadBNode();
      return node;
    }
  case loadB2L_rule: {
      loadB2LNode *node = new (C) loadB2LNode();
      return node;
    }
  case loadUB_rule: {
      loadUBNode *node = new (C) loadUBNode();
      return node;
    }
  case loadUB2L_rule: {
      loadUB2LNode *node = new (C) loadUB2LNode();
      return node;
    }
  case loadUB2L_immI8_rule: {
      loadUB2L_immI8Node *node = new (C) loadUB2L_immI8Node();
      return node;
    }
  case loadS_rule: {
      loadSNode *node = new (C) loadSNode();
      return node;
    }
  case loadS2B_rule: {
      loadS2BNode *node = new (C) loadS2BNode();
      return node;
    }
  case loadS2L_rule: {
      loadS2LNode *node = new (C) loadS2LNode();
      return node;
    }
  case loadUS_rule: {
      loadUSNode *node = new (C) loadUSNode();
      return node;
    }
  case loadUS2B_rule: {
      loadUS2BNode *node = new (C) loadUS2BNode();
      return node;
    }
  case loadUS2L_rule: {
      loadUS2LNode *node = new (C) loadUS2LNode();
      return node;
    }
  case loadUS2L_immI_255_rule: {
      loadUS2L_immI_255Node *node = new (C) loadUS2L_immI_255Node();
      return node;
    }
  case loadUS2L_immI16_rule: {
      loadUS2L_immI16Node *node = new (C) loadUS2L_immI16Node();
      return node;
    }
  case loadI_rule: {
      loadINode *node = new (C) loadINode();
      return node;
    }
  case loadI2B_rule: {
      loadI2BNode *node = new (C) loadI2BNode();
      return node;
    }
  case loadI2UB_rule: {
      loadI2UBNode *node = new (C) loadI2UBNode();
      return node;
    }
  case loadI2S_rule: {
      loadI2SNode *node = new (C) loadI2SNode();
      return node;
    }
  case loadI2US_rule: {
      loadI2USNode *node = new (C) loadI2USNode();
      return node;
    }
  case loadI2L_rule: {
      loadI2LNode *node = new (C) loadI2LNode();
      return node;
    }
  case loadI2L_immI_255_rule: {
      loadI2L_immI_255Node *node = new (C) loadI2L_immI_255Node();
      return node;
    }
  case loadI2L_immI_65535_rule: {
      loadI2L_immI_65535Node *node = new (C) loadI2L_immI_65535Node();
      return node;
    }
  case loadI2L_immI_rule: {
      loadI2L_immINode *node = new (C) loadI2L_immINode();
      return node;
    }
  case loadUI2L_rule: {
      loadUI2LNode *node = new (C) loadUI2LNode();
      return node;
    }
  case loadL_rule: {
      loadLNode *node = new (C) loadLNode();
      return node;
    }
  case loadRange_rule: {
      loadRangeNode *node = new (C) loadRangeNode();
      return node;
    }
  case loadP_rule: {
      loadPNode *node = new (C) loadPNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadN_rule: {
      loadNNode *node = new (C) loadNNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadKlass_rule: {
      loadKlassNode *node = new (C) loadKlassNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadNKlass_rule: {
      loadNKlassNode *node = new (C) loadNKlassNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadF_rule: {
      loadFNode *node = new (C) loadFNode();
      return node;
    }
  case loadD_partial_rule: {
      loadD_partialNode *node = new (C) loadD_partialNode();
      return node;
    }
  case loadD_rule: {
      loadDNode *node = new (C) loadDNode();
      return node;
    }
  case leaP8_rule: {
      leaP8Node *node = new (C) leaP8Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaP32_rule: {
      leaP32Node *node = new (C) leaP32Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxOff_rule: {
      leaPIdxOffNode *node = new (C) leaPIdxOffNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxScale_rule: {
      leaPIdxScaleNode *node = new (C) leaPIdxScaleNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxScaleOff_rule: {
      leaPIdxScaleOffNode *node = new (C) leaPIdxScaleOffNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPPosIdxScaleOff_rule: {
      leaPPosIdxScaleOffNode *node = new (C) leaPPosIdxScaleOffNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPCompressedOopOffset_rule: {
      leaPCompressedOopOffsetNode *node = new (C) leaPCompressedOopOffsetNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaP8Narrow_rule: {
      leaP8NarrowNode *node = new (C) leaP8NarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaP32Narrow_rule: {
      leaP32NarrowNode *node = new (C) leaP32NarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxOffNarrow_rule: {
      leaPIdxOffNarrowNode *node = new (C) leaPIdxOffNarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxScaleNarrow_rule: {
      leaPIdxScaleNarrowNode *node = new (C) leaPIdxScaleNarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPIdxScaleOffNarrow_rule: {
      leaPIdxScaleOffNarrowNode *node = new (C) leaPIdxScaleOffNarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaPPosIdxScaleOffNarrow_rule: {
      leaPPosIdxScaleOffNarrowNode *node = new (C) leaPPosIdxScaleOffNarrowNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadConI_rule: {
      loadConINode *node = new (C) loadConINode();
      node->_opnd_array[1] = new (C) immIOper(_leaf->get_int() );
      return node;
    }
  case loadConI0_rule: {
      loadConI0Node *node = new (C) loadConI0Node();
      return node;
    }
  case loadConL_rule: {
      loadConLNode *node = new (C) loadConLNode();
      node->_opnd_array[1] = new (C) immLOper(_leaf->get_long() );
      return node;
    }
  case loadConL0_rule: {
      loadConL0Node *node = new (C) loadConL0Node();
      return node;
    }
  case loadConUL32_rule: {
      loadConUL32Node *node = new (C) loadConUL32Node();
      node->_opnd_array[1] = new (C) immUL32Oper(_leaf->get_long() );
      return node;
    }
  case loadConL32_rule: {
      loadConL32Node *node = new (C) loadConL32Node();
      node->_opnd_array[1] = new (C) immL32Oper(_leaf->get_long() );
      return node;
    }
  case loadConP_rule: {
      loadConPNode *node = new (C) loadConPNode();
      node->_opnd_array[1] = new (C) immPOper(_leaf->bottom_type()->is_ptr() );
      return node;
    }
  case loadConP0_rule: {
      loadConP0Node *node = new (C) loadConP0Node();
      return node;
    }
  case loadConP31_rule: {
      loadConP31Node *node = new (C) loadConP31Node();
      return node;
    }
  case loadConF_rule: {
      loadConFNode *node = new (C) loadConFNode();
      node->_opnd_array[1] = new (C) immFOper(_leaf->getf() );
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadConN0_rule: {
      loadConN0Node *node = new (C) loadConN0Node();
      return node;
    }
  case loadConN_rule: {
      loadConNNode *node = new (C) loadConNNode();
      node->_opnd_array[1] = new (C) immNOper(_leaf->bottom_type()->is_narrowoop() );
      return node;
    }
  case loadConF0_rule: {
      loadConF0Node *node = new (C) loadConF0Node();
      node->_opnd_array[1] = new (C) immF0Oper(_leaf->getf() );
      return node;
    }
  case loadConD_rule: {
      loadConDNode *node = new (C) loadConDNode();
      node->_opnd_array[1] = new (C) immDOper(_leaf->getd() );
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadConD0_rule: {
      loadConD0Node *node = new (C) loadConD0Node();
      node->_opnd_array[1] = new (C) immD0Oper(_leaf->getd() );
      return node;
    }
  case loadSSI_rule: {
      loadSSINode *node = new (C) loadSSINode();
      return node;
    }
  case loadSSL_rule: {
      loadSSLNode *node = new (C) loadSSLNode();
      return node;
    }
  case loadSSP_rule: {
      loadSSPNode *node = new (C) loadSSPNode();
      return node;
    }
  case loadSSF_rule: {
      loadSSFNode *node = new (C) loadSSFNode();
      return node;
    }
  case loadSSD_rule: {
      loadSSDNode *node = new (C) loadSSDNode();
      return node;
    }
  case prefetchr_rule: {
      prefetchrNode *node = new (C) prefetchrNode();
      return node;
    }
  case prefetchrNTA_rule: {
      prefetchrNTANode *node = new (C) prefetchrNTANode();
      return node;
    }
  case prefetchrT0_rule: {
      prefetchrT0Node *node = new (C) prefetchrT0Node();
      return node;
    }
  case prefetchrT2_rule: {
      prefetchrT2Node *node = new (C) prefetchrT2Node();
      return node;
    }
  case prefetchwNTA_rule: {
      prefetchwNTANode *node = new (C) prefetchwNTANode();
      return node;
    }
  case prefetchAlloc_rule: {
      prefetchAllocNode *node = new (C) prefetchAllocNode();
      return node;
    }
  case prefetchAllocNTA_rule: {
      prefetchAllocNTANode *node = new (C) prefetchAllocNTANode();
      return node;
    }
  case prefetchAllocT0_rule: {
      prefetchAllocT0Node *node = new (C) prefetchAllocT0Node();
      return node;
    }
  case prefetchAllocT2_rule: {
      prefetchAllocT2Node *node = new (C) prefetchAllocT2Node();
      return node;
    }
  case storeB_rule: {
      storeBNode *node = new (C) storeBNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeC_rule: {
      storeCNode *node = new (C) storeCNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeI_rule: {
      storeINode *node = new (C) storeINode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeL_rule: {
      storeLNode *node = new (C) storeLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeP_rule: {
      storePNode *node = new (C) storePNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmP0_rule: {
      storeImmP0Node *node = new (C) storeImmP0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmP_rule: {
      storeImmPNode *node = new (C) storeImmPNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeN_rule: {
      storeNNode *node = new (C) storeNNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmN0_rule: {
      storeImmN0Node *node = new (C) storeImmN0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmN_rule: {
      storeImmNNode *node = new (C) storeImmNNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmI0_rule: {
      storeImmI0Node *node = new (C) storeImmI0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmI_rule: {
      storeImmINode *node = new (C) storeImmINode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmL0_rule: {
      storeImmL0Node *node = new (C) storeImmL0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmL_rule: {
      storeImmLNode *node = new (C) storeImmLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmC0_rule: {
      storeImmC0Node *node = new (C) storeImmC0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmI16_rule: {
      storeImmI16Node *node = new (C) storeImmI16Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmB0_rule: {
      storeImmB0Node *node = new (C) storeImmB0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmB_rule: {
      storeImmBNode *node = new (C) storeImmBNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmCM0_reg_rule: {
      storeImmCM0_regNode *node = new (C) storeImmCM0_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeImmCM0_rule: {
      storeImmCM0Node *node = new (C) storeImmCM0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeF_rule: {
      storeFNode *node = new (C) storeFNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeF0_rule: {
      storeF0Node *node = new (C) storeF0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeF_imm_rule: {
      storeF_immNode *node = new (C) storeF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeD_rule: {
      storeDNode *node = new (C) storeDNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeD0_imm_rule: {
      storeD0_immNode *node = new (C) storeD0_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeD0_rule: {
      storeD0Node *node = new (C) storeD0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeSSI_rule: {
      storeSSINode *node = new (C) storeSSINode();
      return node;
    }
  case storeSSL_rule: {
      storeSSLNode *node = new (C) storeSSLNode();
      return node;
    }
  case storeSSP_rule: {
      storeSSPNode *node = new (C) storeSSPNode();
      return node;
    }
  case storeSSF_rule: {
      storeSSFNode *node = new (C) storeSSFNode();
      return node;
    }
  case storeSSD_rule: {
      storeSSDNode *node = new (C) storeSSDNode();
      return node;
    }
  case bytes_reverse_int_rule: {
      bytes_reverse_intNode *node = new (C) bytes_reverse_intNode();
      return node;
    }
  case bytes_reverse_long_rule: {
      bytes_reverse_longNode *node = new (C) bytes_reverse_longNode();
      return node;
    }
  case bytes_reverse_unsigned_short_rule: {
      bytes_reverse_unsigned_shortNode *node = new (C) bytes_reverse_unsigned_shortNode();
      return node;
    }
  case bytes_reverse_short_rule: {
      bytes_reverse_shortNode *node = new (C) bytes_reverse_shortNode();
      return node;
    }
  case countLeadingZerosI_rule: {
      countLeadingZerosINode *node = new (C) countLeadingZerosINode();
      return node;
    }
  case countLeadingZerosI_bsr_rule: {
      countLeadingZerosI_bsrNode *node = new (C) countLeadingZerosI_bsrNode();
      return node;
    }
  case countLeadingZerosL_rule: {
      countLeadingZerosLNode *node = new (C) countLeadingZerosLNode();
      return node;
    }
  case countLeadingZerosL_bsr_rule: {
      countLeadingZerosL_bsrNode *node = new (C) countLeadingZerosL_bsrNode();
      return node;
    }
  case countTrailingZerosI_rule: {
      countTrailingZerosINode *node = new (C) countTrailingZerosINode();
      return node;
    }
  case countTrailingZerosL_rule: {
      countTrailingZerosLNode *node = new (C) countTrailingZerosLNode();
      return node;
    }
  case popCountI_rule: {
      popCountINode *node = new (C) popCountINode();
      return node;
    }
  case popCountI_mem_rule: {
      popCountI_memNode *node = new (C) popCountI_memNode();
      return node;
    }
  case popCountL_rule: {
      popCountLNode *node = new (C) popCountLNode();
      return node;
    }
  case popCountL_mem_rule: {
      popCountL_memNode *node = new (C) popCountL_memNode();
      return node;
    }
  case membar_acquire_rule: {
      membar_acquireNode *node = new (C) membar_acquireNode();
      return node;
    }
  case membar_acquire_lock_rule: {
      membar_acquire_lockNode *node = new (C) membar_acquire_lockNode();
      return node;
    }
  case membar_release_rule: {
      membar_releaseNode *node = new (C) membar_releaseNode();
      return node;
    }
  case membar_release_lock_rule: {
      membar_release_lockNode *node = new (C) membar_release_lockNode();
      return node;
    }
  case membar_volatile_rule: {
      membar_volatileNode *node = new (C) membar_volatileNode();
      node->set_opnd_array(1, MachOperGenerator(RFLAGSREG, C));
      return node;
    }
  case unnecessary_membar_volatile_rule: {
      unnecessary_membar_volatileNode *node = new (C) unnecessary_membar_volatileNode();
      return node;
    }
  case membar_storestore_rule: {
      membar_storestoreNode *node = new (C) membar_storestoreNode();
      return node;
    }
  case castX2P_rule: {
      castX2PNode *node = new (C) castX2PNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case castP2X_rule: {
      castP2XNode *node = new (C) castP2XNode();
      return node;
    }
  case convP2I_rule: {
      convP2INode *node = new (C) convP2INode();
      return node;
    }
  case convN2I_rule: {
      convN2INode *node = new (C) convN2INode();
      return node;
    }
  case encodeHeapOop_rule: {
      encodeHeapOopNode *node = new (C) encodeHeapOopNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case encodeHeapOop_not_null_rule: {
      encodeHeapOop_not_nullNode *node = new (C) encodeHeapOop_not_nullNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case decodeHeapOop_rule: {
      decodeHeapOopNode *node = new (C) decodeHeapOopNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case decodeHeapOop_not_null_rule: {
      decodeHeapOop_not_nullNode *node = new (C) decodeHeapOop_not_nullNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case jumpXtnd_offset_rule: {
      jumpXtnd_offsetNode *node = new (C) jumpXtnd_offsetNode();
      node->set_opnd_array(3, MachOperGenerator(RREGI, C));
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case jumpXtnd_addr_rule: {
      jumpXtnd_addrNode *node = new (C) jumpXtnd_addrNode();
      node->set_opnd_array(4, MachOperGenerator(RREGI, C));
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case jumpXtnd_rule: {
      jumpXtndNode *node = new (C) jumpXtndNode();
      node->set_opnd_array(2, MachOperGenerator(RREGI, C));
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmovI_reg_rule: {
      cmovI_regNode *node = new (C) cmovI_regNode();
      return node;
    }
  case cmovI_regU_rule: {
      cmovI_regUNode *node = new (C) cmovI_regUNode();
      return node;
    }
  case cmovI_regUCF_rule: {
      cmovI_regUCFNode *node = new (C) cmovI_regUCFNode();
      return node;
    }
  case cmovI_mem_rule: {
      cmovI_memNode *node = new (C) cmovI_memNode();
      return node;
    }
  case cmovI_memU_rule: {
      cmovI_memUNode *node = new (C) cmovI_memUNode();
      return node;
    }
  case cmovI_memUCF_rule: {
      cmovI_memUCFNode *node = new (C) cmovI_memUCFNode();
      return node;
    }
  case cmovN_reg_rule: {
      cmovN_regNode *node = new (C) cmovN_regNode();
      return node;
    }
  case cmovN_regU_rule: {
      cmovN_regUNode *node = new (C) cmovN_regUNode();
      return node;
    }
  case cmovN_regUCF_rule: {
      cmovN_regUCFNode *node = new (C) cmovN_regUCFNode();
      return node;
    }
  case cmovP_reg_rule: {
      cmovP_regNode *node = new (C) cmovP_regNode();
      return node;
    }
  case cmovP_regU_rule: {
      cmovP_regUNode *node = new (C) cmovP_regUNode();
      return node;
    }
  case cmovP_regUCF_rule: {
      cmovP_regUCFNode *node = new (C) cmovP_regUCFNode();
      return node;
    }
  case cmovL_reg_rule: {
      cmovL_regNode *node = new (C) cmovL_regNode();
      return node;
    }
  case cmovL_mem_rule: {
      cmovL_memNode *node = new (C) cmovL_memNode();
      return node;
    }
  case cmovL_regU_rule: {
      cmovL_regUNode *node = new (C) cmovL_regUNode();
      return node;
    }
  case cmovL_regUCF_rule: {
      cmovL_regUCFNode *node = new (C) cmovL_regUCFNode();
      return node;
    }
  case cmovL_memU_rule: {
      cmovL_memUNode *node = new (C) cmovL_memUNode();
      return node;
    }
  case cmovL_memUCF_rule: {
      cmovL_memUCFNode *node = new (C) cmovL_memUCFNode();
      return node;
    }
  case cmovF_reg_rule: {
      cmovF_regNode *node = new (C) cmovF_regNode();
      return node;
    }
  case cmovF_regU_rule: {
      cmovF_regUNode *node = new (C) cmovF_regUNode();
      return node;
    }
  case cmovF_regUCF_rule: {
      cmovF_regUCFNode *node = new (C) cmovF_regUCFNode();
      return node;
    }
  case cmovD_reg_rule: {
      cmovD_regNode *node = new (C) cmovD_regNode();
      return node;
    }
  case cmovD_regU_rule: {
      cmovD_regUNode *node = new (C) cmovD_regUNode();
      return node;
    }
  case cmovD_regUCF_rule: {
      cmovD_regUCFNode *node = new (C) cmovD_regUCFNode();
      return node;
    }
  case addI_rReg_rule: {
      addI_rRegNode *node = new (C) addI_rRegNode();
      return node;
    }
  case addI_rReg_imm_rule: {
      addI_rReg_immNode *node = new (C) addI_rReg_immNode();
      return node;
    }
  case addI_rReg_mem_rule: {
      addI_rReg_memNode *node = new (C) addI_rReg_memNode();
      return node;
    }
  case addI_rReg_mem_0_rule: {
      addI_rReg_mem_0Node *node = new (C) addI_rReg_mem_0Node();
      return node;
    }
  case addI_mem_rReg_rule: {
      addI_mem_rRegNode *node = new (C) addI_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addI_mem_rReg_0_rule: {
      addI_mem_rReg_0Node *node = new (C) addI_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addI_mem_imm_rule: {
      addI_mem_immNode *node = new (C) addI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case incI_rReg_rule: {
      incI_rRegNode *node = new (C) incI_rRegNode();
      return node;
    }
  case incI_mem_rule: {
      incI_memNode *node = new (C) incI_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case decI_rReg_rule: {
      decI_rRegNode *node = new (C) decI_rRegNode();
      return node;
    }
  case decI_mem_rule: {
      decI_memNode *node = new (C) decI_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaI_rReg_immI_rule: {
      leaI_rReg_immINode *node = new (C) leaI_rReg_immINode();
      return node;
    }
  case addL_rReg_rule: {
      addL_rRegNode *node = new (C) addL_rRegNode();
      return node;
    }
  case addL_rReg_imm_rule: {
      addL_rReg_immNode *node = new (C) addL_rReg_immNode();
      return node;
    }
  case addL_rReg_mem_rule: {
      addL_rReg_memNode *node = new (C) addL_rReg_memNode();
      return node;
    }
  case addL_rReg_mem_0_rule: {
      addL_rReg_mem_0Node *node = new (C) addL_rReg_mem_0Node();
      return node;
    }
  case addL_mem_rReg_rule: {
      addL_mem_rRegNode *node = new (C) addL_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addL_mem_rReg_0_rule: {
      addL_mem_rReg_0Node *node = new (C) addL_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addL_mem_imm_rule: {
      addL_mem_immNode *node = new (C) addL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case incL_rReg_rule: {
      incL_rRegNode *node = new (C) incL_rRegNode();
      return node;
    }
  case incL_mem_rule: {
      incL_memNode *node = new (C) incL_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case decL_rReg_rule: {
      decL_rRegNode *node = new (C) decL_rRegNode();
      return node;
    }
  case decL_mem_rule: {
      decL_memNode *node = new (C) decL_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaL_rReg_immL_rule: {
      leaL_rReg_immLNode *node = new (C) leaL_rReg_immLNode();
      return node;
    }
  case addP_rReg_rule: {
      addP_rRegNode *node = new (C) addP_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addP_rReg_imm_rule: {
      addP_rReg_immNode *node = new (C) addP_rReg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case leaP_rReg_imm_rule: {
      leaP_rReg_immNode *node = new (C) leaP_rReg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case checkCastPP_rule: {
      checkCastPPNode *node = new (C) checkCastPPNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case castPP_rule: {
      castPPNode *node = new (C) castPPNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case castII_rule: {
      castIINode *node = new (C) castIINode();
      return node;
    }
  case loadPLocked_rule: {
      loadPLockedNode *node = new (C) loadPLockedNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storePConditional_rule: {
      storePConditionalNode *node = new (C) storePConditionalNode();
      return node;
    }
  case storeIConditional_rule: {
      storeIConditionalNode *node = new (C) storeIConditionalNode();
      return node;
    }
  case storeLConditional_rule: {
      storeLConditionalNode *node = new (C) storeLConditionalNode();
      return node;
    }
  case compareAndSwapP_rule: {
      compareAndSwapPNode *node = new (C) compareAndSwapPNode();
      return node;
    }
  case compareAndSwapL_rule: {
      compareAndSwapLNode *node = new (C) compareAndSwapLNode();
      return node;
    }
  case compareAndSwapI_rule: {
      compareAndSwapINode *node = new (C) compareAndSwapINode();
      return node;
    }
  case xaddI_no_res_rule: {
      xaddI_no_resNode *node = new (C) xaddI_no_resNode();
      return node;
    }
  case xaddI_rule: {
      xaddINode *node = new (C) xaddINode();
      return node;
    }
  case xaddL_no_res_rule: {
      xaddL_no_resNode *node = new (C) xaddL_no_resNode();
      return node;
    }
  case xaddL_rule: {
      xaddLNode *node = new (C) xaddLNode();
      return node;
    }
  case xchgI_rule: {
      xchgINode *node = new (C) xchgINode();
      return node;
    }
  case xchgL_rule: {
      xchgLNode *node = new (C) xchgLNode();
      return node;
    }
  case xchgP_rule: {
      xchgPNode *node = new (C) xchgPNode();
      return node;
    }
  case xchgN_rule: {
      xchgNNode *node = new (C) xchgNNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case compareAndSwapN_rule: {
      compareAndSwapNNode *node = new (C) compareAndSwapNNode();
      return node;
    }
  case subI_rReg_rule: {
      subI_rRegNode *node = new (C) subI_rRegNode();
      return node;
    }
  case subI_rReg_imm_rule: {
      subI_rReg_immNode *node = new (C) subI_rReg_immNode();
      return node;
    }
  case subI_rReg_mem_rule: {
      subI_rReg_memNode *node = new (C) subI_rReg_memNode();
      return node;
    }
  case subI_mem_rReg_rule: {
      subI_mem_rRegNode *node = new (C) subI_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subI_mem_imm_rule: {
      subI_mem_immNode *node = new (C) subI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subL_rReg_rule: {
      subL_rRegNode *node = new (C) subL_rRegNode();
      return node;
    }
  case subL_rReg_imm_rule: {
      subL_rReg_immNode *node = new (C) subL_rReg_immNode();
      return node;
    }
  case subL_rReg_mem_rule: {
      subL_rReg_memNode *node = new (C) subL_rReg_memNode();
      return node;
    }
  case subL_mem_rReg_rule: {
      subL_mem_rRegNode *node = new (C) subL_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subL_mem_imm_rule: {
      subL_mem_immNode *node = new (C) subL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subP_rReg_rule: {
      subP_rRegNode *node = new (C) subP_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case negI_rReg_rule: {
      negI_rRegNode *node = new (C) negI_rRegNode();
      return node;
    }
  case negI_mem_rule: {
      negI_memNode *node = new (C) negI_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case negL_rReg_rule: {
      negL_rRegNode *node = new (C) negL_rRegNode();
      return node;
    }
  case negL_mem_rule: {
      negL_memNode *node = new (C) negL_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case mulI_rReg_rule: {
      mulI_rRegNode *node = new (C) mulI_rRegNode();
      return node;
    }
  case mulI_rReg_imm_rule: {
      mulI_rReg_immNode *node = new (C) mulI_rReg_immNode();
      return node;
    }
  case mulI_mem_rule: {
      mulI_memNode *node = new (C) mulI_memNode();
      return node;
    }
  case mulI_mem_0_rule: {
      mulI_mem_0Node *node = new (C) mulI_mem_0Node();
      return node;
    }
  case mulI_mem_imm_rule: {
      mulI_mem_immNode *node = new (C) mulI_mem_immNode();
      return node;
    }
  case mulL_rReg_rule: {
      mulL_rRegNode *node = new (C) mulL_rRegNode();
      return node;
    }
  case mulL_rReg_imm_rule: {
      mulL_rReg_immNode *node = new (C) mulL_rReg_immNode();
      return node;
    }
  case mulL_mem_rule: {
      mulL_memNode *node = new (C) mulL_memNode();
      return node;
    }
  case mulL_mem_0_rule: {
      mulL_mem_0Node *node = new (C) mulL_mem_0Node();
      return node;
    }
  case mulL_mem_imm_rule: {
      mulL_mem_immNode *node = new (C) mulL_mem_immNode();
      return node;
    }
  case mulHiL_rReg_rule: {
      mulHiL_rRegNode *node = new (C) mulHiL_rRegNode();
      return node;
    }
  case divI_rReg_rule: {
      divI_rRegNode *node = new (C) divI_rRegNode();
      return node;
    }
  case divL_rReg_rule: {
      divL_rRegNode *node = new (C) divL_rRegNode();
      return node;
    }
  case divModI_rReg_divmod_rule: {
      divModI_rReg_divmodNode *node = new (C) divModI_rReg_divmodNode();
      return node;
    }
  case divModL_rReg_divmod_rule: {
      divModL_rReg_divmodNode *node = new (C) divModL_rReg_divmodNode();
      return node;
    }
  case divL_10_rule: {
      divL_10Node *node = new (C) divL_10Node();
      return node;
    }
  case modI_rReg_rule: {
      modI_rRegNode *node = new (C) modI_rRegNode();
      return node;
    }
  case modL_rReg_rule: {
      modL_rRegNode *node = new (C) modL_rRegNode();
      return node;
    }
  case salI_rReg_1_rule: {
      salI_rReg_1Node *node = new (C) salI_rReg_1Node();
      return node;
    }
  case salI_mem_1_rule: {
      salI_mem_1Node *node = new (C) salI_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case salI_rReg_imm_rule: {
      salI_rReg_immNode *node = new (C) salI_rReg_immNode();
      return node;
    }
  case salI_mem_imm_rule: {
      salI_mem_immNode *node = new (C) salI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case salI_rReg_CL_rule: {
      salI_rReg_CLNode *node = new (C) salI_rReg_CLNode();
      return node;
    }
  case salI_mem_CL_rule: {
      salI_mem_CLNode *node = new (C) salI_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarI_rReg_1_rule: {
      sarI_rReg_1Node *node = new (C) sarI_rReg_1Node();
      return node;
    }
  case sarI_mem_1_rule: {
      sarI_mem_1Node *node = new (C) sarI_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarI_rReg_imm_rule: {
      sarI_rReg_immNode *node = new (C) sarI_rReg_immNode();
      return node;
    }
  case sarI_mem_imm_rule: {
      sarI_mem_immNode *node = new (C) sarI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarI_rReg_CL_rule: {
      sarI_rReg_CLNode *node = new (C) sarI_rReg_CLNode();
      return node;
    }
  case sarI_mem_CL_rule: {
      sarI_mem_CLNode *node = new (C) sarI_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrI_rReg_1_rule: {
      shrI_rReg_1Node *node = new (C) shrI_rReg_1Node();
      return node;
    }
  case shrI_mem_1_rule: {
      shrI_mem_1Node *node = new (C) shrI_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrI_rReg_imm_rule: {
      shrI_rReg_immNode *node = new (C) shrI_rReg_immNode();
      return node;
    }
  case shrI_mem_imm_rule: {
      shrI_mem_immNode *node = new (C) shrI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrI_rReg_CL_rule: {
      shrI_rReg_CLNode *node = new (C) shrI_rReg_CLNode();
      return node;
    }
  case shrI_mem_CL_rule: {
      shrI_mem_CLNode *node = new (C) shrI_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case salL_rReg_1_rule: {
      salL_rReg_1Node *node = new (C) salL_rReg_1Node();
      return node;
    }
  case salL_mem_1_rule: {
      salL_mem_1Node *node = new (C) salL_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case salL_rReg_imm_rule: {
      salL_rReg_immNode *node = new (C) salL_rReg_immNode();
      return node;
    }
  case salL_mem_imm_rule: {
      salL_mem_immNode *node = new (C) salL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case salL_rReg_CL_rule: {
      salL_rReg_CLNode *node = new (C) salL_rReg_CLNode();
      return node;
    }
  case salL_mem_CL_rule: {
      salL_mem_CLNode *node = new (C) salL_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarL_rReg_1_rule: {
      sarL_rReg_1Node *node = new (C) sarL_rReg_1Node();
      return node;
    }
  case sarL_mem_1_rule: {
      sarL_mem_1Node *node = new (C) sarL_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarL_rReg_imm_rule: {
      sarL_rReg_immNode *node = new (C) sarL_rReg_immNode();
      return node;
    }
  case sarL_mem_imm_rule: {
      sarL_mem_immNode *node = new (C) sarL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sarL_rReg_CL_rule: {
      sarL_rReg_CLNode *node = new (C) sarL_rReg_CLNode();
      return node;
    }
  case sarL_mem_CL_rule: {
      sarL_mem_CLNode *node = new (C) sarL_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrL_rReg_1_rule: {
      shrL_rReg_1Node *node = new (C) shrL_rReg_1Node();
      return node;
    }
  case shrL_mem_1_rule: {
      shrL_mem_1Node *node = new (C) shrL_mem_1Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrL_rReg_imm_rule: {
      shrL_rReg_immNode *node = new (C) shrL_rReg_immNode();
      return node;
    }
  case shrL_mem_imm_rule: {
      shrL_mem_immNode *node = new (C) shrL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case shrL_rReg_CL_rule: {
      shrL_rReg_CLNode *node = new (C) shrL_rReg_CLNode();
      return node;
    }
  case shrL_mem_CL_rule: {
      shrL_mem_CLNode *node = new (C) shrL_mem_CLNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case i2b_rule: {
      i2bNode *node = new (C) i2bNode();
      return node;
    }
  case i2s_rule: {
      i2sNode *node = new (C) i2sNode();
      return node;
    }
  case rolI_rReg_i1_rule: {
      rolI_rReg_i1Node *node = new (C) rolI_rReg_i1Node();
      return node;
    }
  case rolI_rReg_i1_0_rule: {
      rolI_rReg_i1_0Node *node = new (C) rolI_rReg_i1_0Node();
      return node;
    }
  case rolI_rReg_i8_rule: {
      rolI_rReg_i8Node *node = new (C) rolI_rReg_i8Node();
      return node;
    }
  case rolI_rReg_i8_0_rule: {
      rolI_rReg_i8_0Node *node = new (C) rolI_rReg_i8_0Node();
      return node;
    }
  case rolI_rReg_Var_C0_rule: {
      rolI_rReg_Var_C0Node *node = new (C) rolI_rReg_Var_C0Node();
      return node;
    }
  case rolI_rReg_Var_C0_0_rule: {
      rolI_rReg_Var_C0_0Node *node = new (C) rolI_rReg_Var_C0_0Node();
      return node;
    }
  case rolI_rReg_Var_C32_rule: {
      rolI_rReg_Var_C32Node *node = new (C) rolI_rReg_Var_C32Node();
      return node;
    }
  case rolI_rReg_Var_C32_0_rule: {
      rolI_rReg_Var_C32_0Node *node = new (C) rolI_rReg_Var_C32_0Node();
      return node;
    }
  case rorI_rReg_i1_rule: {
      rorI_rReg_i1Node *node = new (C) rorI_rReg_i1Node();
      return node;
    }
  case rorI_rReg_i1_0_rule: {
      rorI_rReg_i1_0Node *node = new (C) rorI_rReg_i1_0Node();
      return node;
    }
  case rorI_rReg_i8_rule: {
      rorI_rReg_i8Node *node = new (C) rorI_rReg_i8Node();
      return node;
    }
  case rorI_rReg_i8_0_rule: {
      rorI_rReg_i8_0Node *node = new (C) rorI_rReg_i8_0Node();
      return node;
    }
  case rorI_rReg_Var_C0_rule: {
      rorI_rReg_Var_C0Node *node = new (C) rorI_rReg_Var_C0Node();
      return node;
    }
  case rorI_rReg_Var_C0_0_rule: {
      rorI_rReg_Var_C0_0Node *node = new (C) rorI_rReg_Var_C0_0Node();
      return node;
    }
  case rorI_rReg_Var_C32_rule: {
      rorI_rReg_Var_C32Node *node = new (C) rorI_rReg_Var_C32Node();
      return node;
    }
  case rorI_rReg_Var_C32_0_rule: {
      rorI_rReg_Var_C32_0Node *node = new (C) rorI_rReg_Var_C32_0Node();
      return node;
    }
  case rolL_rReg_i1_rule: {
      rolL_rReg_i1Node *node = new (C) rolL_rReg_i1Node();
      return node;
    }
  case rolL_rReg_i1_0_rule: {
      rolL_rReg_i1_0Node *node = new (C) rolL_rReg_i1_0Node();
      return node;
    }
  case rolL_rReg_i8_rule: {
      rolL_rReg_i8Node *node = new (C) rolL_rReg_i8Node();
      return node;
    }
  case rolL_rReg_i8_0_rule: {
      rolL_rReg_i8_0Node *node = new (C) rolL_rReg_i8_0Node();
      return node;
    }
  case rolL_rReg_Var_C0_rule: {
      rolL_rReg_Var_C0Node *node = new (C) rolL_rReg_Var_C0Node();
      return node;
    }
  case rolL_rReg_Var_C0_0_rule: {
      rolL_rReg_Var_C0_0Node *node = new (C) rolL_rReg_Var_C0_0Node();
      return node;
    }
  case rolL_rReg_Var_C64_rule: {
      rolL_rReg_Var_C64Node *node = new (C) rolL_rReg_Var_C64Node();
      return node;
    }
  case rolL_rReg_Var_C64_0_rule: {
      rolL_rReg_Var_C64_0Node *node = new (C) rolL_rReg_Var_C64_0Node();
      return node;
    }
  case rorL_rReg_i1_rule: {
      rorL_rReg_i1Node *node = new (C) rorL_rReg_i1Node();
      return node;
    }
  case rorL_rReg_i1_0_rule: {
      rorL_rReg_i1_0Node *node = new (C) rorL_rReg_i1_0Node();
      return node;
    }
  case rorL_rReg_i8_rule: {
      rorL_rReg_i8Node *node = new (C) rorL_rReg_i8Node();
      return node;
    }
  case rorL_rReg_i8_0_rule: {
      rorL_rReg_i8_0Node *node = new (C) rorL_rReg_i8_0Node();
      return node;
    }
  case rorL_rReg_Var_C0_rule: {
      rorL_rReg_Var_C0Node *node = new (C) rorL_rReg_Var_C0Node();
      return node;
    }
  case rorL_rReg_Var_C0_0_rule: {
      rorL_rReg_Var_C0_0Node *node = new (C) rorL_rReg_Var_C0_0Node();
      return node;
    }
  case rorL_rReg_Var_C64_rule: {
      rorL_rReg_Var_C64Node *node = new (C) rorL_rReg_Var_C64Node();
      return node;
    }
  case rorL_rReg_Var_C64_0_rule: {
      rorL_rReg_Var_C64_0Node *node = new (C) rorL_rReg_Var_C64_0Node();
      return node;
    }
  case andI_rReg_rule: {
      andI_rRegNode *node = new (C) andI_rRegNode();
      return node;
    }
  case andI_rReg_imm255_rule: {
      andI_rReg_imm255Node *node = new (C) andI_rReg_imm255Node();
      return node;
    }
  case andI2L_rReg_imm255_rule: {
      andI2L_rReg_imm255Node *node = new (C) andI2L_rReg_imm255Node();
      return node;
    }
  case andI_rReg_imm65535_rule: {
      andI_rReg_imm65535Node *node = new (C) andI_rReg_imm65535Node();
      return node;
    }
  case andI2L_rReg_imm65535_rule: {
      andI2L_rReg_imm65535Node *node = new (C) andI2L_rReg_imm65535Node();
      return node;
    }
  case andI_rReg_imm_rule: {
      andI_rReg_immNode *node = new (C) andI_rReg_immNode();
      return node;
    }
  case andI_rReg_mem_rule: {
      andI_rReg_memNode *node = new (C) andI_rReg_memNode();
      return node;
    }
  case andI_rReg_mem_0_rule: {
      andI_rReg_mem_0Node *node = new (C) andI_rReg_mem_0Node();
      return node;
    }
  case andI_mem_rReg_rule: {
      andI_mem_rRegNode *node = new (C) andI_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case andI_mem_rReg_0_rule: {
      andI_mem_rReg_0Node *node = new (C) andI_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case andI_mem_imm_rule: {
      andI_mem_immNode *node = new (C) andI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orI_rReg_rule: {
      orI_rRegNode *node = new (C) orI_rRegNode();
      return node;
    }
  case orI_rReg_imm_rule: {
      orI_rReg_immNode *node = new (C) orI_rReg_immNode();
      return node;
    }
  case orI_rReg_mem_rule: {
      orI_rReg_memNode *node = new (C) orI_rReg_memNode();
      return node;
    }
  case orI_rReg_mem_0_rule: {
      orI_rReg_mem_0Node *node = new (C) orI_rReg_mem_0Node();
      return node;
    }
  case orI_mem_rReg_rule: {
      orI_mem_rRegNode *node = new (C) orI_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orI_mem_rReg_0_rule: {
      orI_mem_rReg_0Node *node = new (C) orI_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orI_mem_imm_rule: {
      orI_mem_immNode *node = new (C) orI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorI_rReg_rule: {
      xorI_rRegNode *node = new (C) xorI_rRegNode();
      return node;
    }
  case xorI_rReg_im1_rule: {
      xorI_rReg_im1Node *node = new (C) xorI_rReg_im1Node();
      return node;
    }
  case xorI_rReg_imm_rule: {
      xorI_rReg_immNode *node = new (C) xorI_rReg_immNode();
      return node;
    }
  case xorI_rReg_mem_rule: {
      xorI_rReg_memNode *node = new (C) xorI_rReg_memNode();
      return node;
    }
  case xorI_rReg_mem_0_rule: {
      xorI_rReg_mem_0Node *node = new (C) xorI_rReg_mem_0Node();
      return node;
    }
  case xorI_mem_rReg_rule: {
      xorI_mem_rRegNode *node = new (C) xorI_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorI_mem_rReg_0_rule: {
      xorI_mem_rReg_0Node *node = new (C) xorI_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorI_mem_imm_rule: {
      xorI_mem_immNode *node = new (C) xorI_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case andL_rReg_rule: {
      andL_rRegNode *node = new (C) andL_rRegNode();
      return node;
    }
  case andL_rReg_imm255_rule: {
      andL_rReg_imm255Node *node = new (C) andL_rReg_imm255Node();
      return node;
    }
  case andL_rReg_imm65535_rule: {
      andL_rReg_imm65535Node *node = new (C) andL_rReg_imm65535Node();
      return node;
    }
  case andL_rReg_imm_rule: {
      andL_rReg_immNode *node = new (C) andL_rReg_immNode();
      return node;
    }
  case andL_rReg_mem_rule: {
      andL_rReg_memNode *node = new (C) andL_rReg_memNode();
      return node;
    }
  case andL_rReg_mem_0_rule: {
      andL_rReg_mem_0Node *node = new (C) andL_rReg_mem_0Node();
      return node;
    }
  case andL_mem_rReg_rule: {
      andL_mem_rRegNode *node = new (C) andL_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case andL_mem_rReg_0_rule: {
      andL_mem_rReg_0Node *node = new (C) andL_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case andL_mem_imm_rule: {
      andL_mem_immNode *node = new (C) andL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orL_rReg_rule: {
      orL_rRegNode *node = new (C) orL_rRegNode();
      return node;
    }
  case orL_rReg_castP2X_rule: {
      orL_rReg_castP2XNode *node = new (C) orL_rReg_castP2XNode();
      return node;
    }
  case orL_rReg_castP2X_0_rule: {
      orL_rReg_castP2X_0Node *node = new (C) orL_rReg_castP2X_0Node();
      return node;
    }
  case orL_rReg_imm_rule: {
      orL_rReg_immNode *node = new (C) orL_rReg_immNode();
      return node;
    }
  case orL_rReg_mem_rule: {
      orL_rReg_memNode *node = new (C) orL_rReg_memNode();
      return node;
    }
  case orL_rReg_mem_0_rule: {
      orL_rReg_mem_0Node *node = new (C) orL_rReg_mem_0Node();
      return node;
    }
  case orL_mem_rReg_rule: {
      orL_mem_rRegNode *node = new (C) orL_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orL_mem_rReg_0_rule: {
      orL_mem_rReg_0Node *node = new (C) orL_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case orL_mem_imm_rule: {
      orL_mem_immNode *node = new (C) orL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorL_rReg_rule: {
      xorL_rRegNode *node = new (C) xorL_rRegNode();
      return node;
    }
  case xorL_rReg_im1_rule: {
      xorL_rReg_im1Node *node = new (C) xorL_rReg_im1Node();
      return node;
    }
  case xorL_rReg_imm_rule: {
      xorL_rReg_immNode *node = new (C) xorL_rReg_immNode();
      return node;
    }
  case xorL_rReg_mem_rule: {
      xorL_rReg_memNode *node = new (C) xorL_rReg_memNode();
      return node;
    }
  case xorL_rReg_mem_0_rule: {
      xorL_rReg_mem_0Node *node = new (C) xorL_rReg_mem_0Node();
      return node;
    }
  case xorL_mem_rReg_rule: {
      xorL_mem_rRegNode *node = new (C) xorL_mem_rRegNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorL_mem_rReg_0_rule: {
      xorL_mem_rReg_0Node *node = new (C) xorL_mem_rReg_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case xorL_mem_imm_rule: {
      xorL_mem_immNode *node = new (C) xorL_mem_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case convI2B_rule: {
      convI2BNode *node = new (C) convI2BNode();
      return node;
    }
  case convP2B_rule: {
      convP2BNode *node = new (C) convP2BNode();
      return node;
    }
  case cmpLTMask_rule: {
      cmpLTMaskNode *node = new (C) cmpLTMaskNode();
      return node;
    }
  case cmpLTMask0_rule: {
      cmpLTMask0Node *node = new (C) cmpLTMask0Node();
      return node;
    }
  case cadd_cmpLTMask_rule: {
      cadd_cmpLTMaskNode *node = new (C) cadd_cmpLTMaskNode();
      node->set_opnd_array(6, MachOperGenerator(RREGI, C));
      return node;
    }
  case cadd_cmpLTMask_1_rule: {
      cadd_cmpLTMask_1Node *node = new (C) cadd_cmpLTMask_1Node();
      node->set_opnd_array(6, MachOperGenerator(RREGI, C));
      return node;
    }
  case cadd_cmpLTMask_0_rule: {
      cadd_cmpLTMask_0Node *node = new (C) cadd_cmpLTMask_0Node();
      node->set_opnd_array(6, MachOperGenerator(RREGI, C));
      return node;
    }
  case cadd_cmpLTMask_2_rule: {
      cadd_cmpLTMask_2Node *node = new (C) cadd_cmpLTMask_2Node();
      node->set_opnd_array(6, MachOperGenerator(RREGI, C));
      return node;
    }
  case cmpF_cc_reg_rule: {
      cmpF_cc_regNode *node = new (C) cmpF_cc_regNode();
      return node;
    }
  case cmpF_cc_reg_CF_rule: {
      cmpF_cc_reg_CFNode *node = new (C) cmpF_cc_reg_CFNode();
      return node;
    }
  case cmpF_cc_mem_rule: {
      cmpF_cc_memNode *node = new (C) cmpF_cc_memNode();
      return node;
    }
  case cmpF_cc_memCF_rule: {
      cmpF_cc_memCFNode *node = new (C) cmpF_cc_memCFNode();
      return node;
    }
  case cmpF_cc_imm_rule: {
      cmpF_cc_immNode *node = new (C) cmpF_cc_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmpF_cc_immCF_rule: {
      cmpF_cc_immCFNode *node = new (C) cmpF_cc_immCFNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmpD_cc_reg_rule: {
      cmpD_cc_regNode *node = new (C) cmpD_cc_regNode();
      return node;
    }
  case cmpD_cc_reg_CF_rule: {
      cmpD_cc_reg_CFNode *node = new (C) cmpD_cc_reg_CFNode();
      return node;
    }
  case cmpD_cc_mem_rule: {
      cmpD_cc_memNode *node = new (C) cmpD_cc_memNode();
      return node;
    }
  case cmpD_cc_memCF_rule: {
      cmpD_cc_memCFNode *node = new (C) cmpD_cc_memCFNode();
      return node;
    }
  case cmpD_cc_imm_rule: {
      cmpD_cc_immNode *node = new (C) cmpD_cc_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmpD_cc_immCF_rule: {
      cmpD_cc_immCFNode *node = new (C) cmpD_cc_immCFNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmpF_reg_rule: {
      cmpF_regNode *node = new (C) cmpF_regNode();
      return node;
    }
  case cmpF_mem_rule: {
      cmpF_memNode *node = new (C) cmpF_memNode();
      return node;
    }
  case cmpF_imm_rule: {
      cmpF_immNode *node = new (C) cmpF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cmpD_reg_rule: {
      cmpD_regNode *node = new (C) cmpD_regNode();
      return node;
    }
  case cmpD_mem_rule: {
      cmpD_memNode *node = new (C) cmpD_memNode();
      return node;
    }
  case cmpD_imm_rule: {
      cmpD_immNode *node = new (C) cmpD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case cosD_reg_rule: {
      cosD_regNode *node = new (C) cosD_regNode();
      return node;
    }
  case sinD_reg_rule: {
      sinD_regNode *node = new (C) sinD_regNode();
      return node;
    }
  case tanD_reg_rule: {
      tanD_regNode *node = new (C) tanD_regNode();
      return node;
    }
  case log10D_reg_rule: {
      log10D_regNode *node = new (C) log10D_regNode();
      return node;
    }
  case logD_reg_rule: {
      logD_regNode *node = new (C) logD_regNode();
      return node;
    }
  case powD_reg_rule: {
      powD_regNode *node = new (C) powD_regNode();
      return node;
    }
  case expD_reg_rule: {
      expD_regNode *node = new (C) expD_regNode();
      return node;
    }
  case roundFloat_nop_rule: {
      roundFloat_nopNode *node = new (C) roundFloat_nopNode();
      return node;
    }
  case roundDouble_nop_rule: {
      roundDouble_nopNode *node = new (C) roundDouble_nopNode();
      return node;
    }
  case convF2D_reg_reg_rule: {
      convF2D_reg_regNode *node = new (C) convF2D_reg_regNode();
      return node;
    }
  case convF2D_reg_mem_rule: {
      convF2D_reg_memNode *node = new (C) convF2D_reg_memNode();
      return node;
    }
  case convD2F_reg_reg_rule: {
      convD2F_reg_regNode *node = new (C) convD2F_reg_regNode();
      return node;
    }
  case convD2F_reg_mem_rule: {
      convD2F_reg_memNode *node = new (C) convD2F_reg_memNode();
      return node;
    }
  case convF2I_reg_reg_rule: {
      convF2I_reg_regNode *node = new (C) convF2I_reg_regNode();
      return node;
    }
  case convF2L_reg_reg_rule: {
      convF2L_reg_regNode *node = new (C) convF2L_reg_regNode();
      return node;
    }
  case convD2I_reg_reg_rule: {
      convD2I_reg_regNode *node = new (C) convD2I_reg_regNode();
      return node;
    }
  case convD2L_reg_reg_rule: {
      convD2L_reg_regNode *node = new (C) convD2L_reg_regNode();
      return node;
    }
  case convI2F_reg_reg_rule: {
      convI2F_reg_regNode *node = new (C) convI2F_reg_regNode();
      return node;
    }
  case convI2F_reg_mem_rule: {
      convI2F_reg_memNode *node = new (C) convI2F_reg_memNode();
      return node;
    }
  case convI2D_reg_reg_rule: {
      convI2D_reg_regNode *node = new (C) convI2D_reg_regNode();
      return node;
    }
  case convI2D_reg_mem_rule: {
      convI2D_reg_memNode *node = new (C) convI2D_reg_memNode();
      return node;
    }
  case convXI2F_reg_rule: {
      convXI2F_regNode *node = new (C) convXI2F_regNode();
      return node;
    }
  case convXI2D_reg_rule: {
      convXI2D_regNode *node = new (C) convXI2D_regNode();
      return node;
    }
  case convL2F_reg_reg_rule: {
      convL2F_reg_regNode *node = new (C) convL2F_reg_regNode();
      return node;
    }
  case convL2F_reg_mem_rule: {
      convL2F_reg_memNode *node = new (C) convL2F_reg_memNode();
      return node;
    }
  case convL2D_reg_reg_rule: {
      convL2D_reg_regNode *node = new (C) convL2D_reg_regNode();
      return node;
    }
  case convL2D_reg_mem_rule: {
      convL2D_reg_memNode *node = new (C) convL2D_reg_memNode();
      return node;
    }
  case convI2L_reg_reg_rule: {
      convI2L_reg_regNode *node = new (C) convI2L_reg_regNode();
      return node;
    }
  case convI2L_reg_reg_zex_rule: {
      convI2L_reg_reg_zexNode *node = new (C) convI2L_reg_reg_zexNode();
      return node;
    }
  case convI2L_reg_mem_zex_rule: {
      convI2L_reg_mem_zexNode *node = new (C) convI2L_reg_mem_zexNode();
      return node;
    }
  case zerox_long_reg_reg_rule: {
      zerox_long_reg_regNode *node = new (C) zerox_long_reg_regNode();
      return node;
    }
  case convL2I_reg_reg_rule: {
      convL2I_reg_regNode *node = new (C) convL2I_reg_regNode();
      return node;
    }
  case MoveF2I_stack_reg_rule: {
      MoveF2I_stack_regNode *node = new (C) MoveF2I_stack_regNode();
      return node;
    }
  case MoveI2F_stack_reg_rule: {
      MoveI2F_stack_regNode *node = new (C) MoveI2F_stack_regNode();
      return node;
    }
  case MoveD2L_stack_reg_rule: {
      MoveD2L_stack_regNode *node = new (C) MoveD2L_stack_regNode();
      return node;
    }
  case MoveL2D_stack_reg_partial_rule: {
      MoveL2D_stack_reg_partialNode *node = new (C) MoveL2D_stack_reg_partialNode();
      return node;
    }
  case MoveL2D_stack_reg_rule: {
      MoveL2D_stack_regNode *node = new (C) MoveL2D_stack_regNode();
      return node;
    }
  case MoveF2I_reg_stack_rule: {
      MoveF2I_reg_stackNode *node = new (C) MoveF2I_reg_stackNode();
      return node;
    }
  case MoveI2F_reg_stack_rule: {
      MoveI2F_reg_stackNode *node = new (C) MoveI2F_reg_stackNode();
      return node;
    }
  case MoveD2L_reg_stack_rule: {
      MoveD2L_reg_stackNode *node = new (C) MoveD2L_reg_stackNode();
      return node;
    }
  case MoveL2D_reg_stack_rule: {
      MoveL2D_reg_stackNode *node = new (C) MoveL2D_reg_stackNode();
      return node;
    }
  case MoveF2I_reg_reg_rule: {
      MoveF2I_reg_regNode *node = new (C) MoveF2I_reg_regNode();
      return node;
    }
  case MoveD2L_reg_reg_rule: {
      MoveD2L_reg_regNode *node = new (C) MoveD2L_reg_regNode();
      return node;
    }
  case MoveI2F_reg_reg_rule: {
      MoveI2F_reg_regNode *node = new (C) MoveI2F_reg_regNode();
      return node;
    }
  case MoveL2D_reg_reg_rule: {
      MoveL2D_reg_regNode *node = new (C) MoveL2D_reg_regNode();
      return node;
    }
  case rep_stos_rule: {
      rep_stosNode *node = new (C) rep_stosNode();
      return node;
    }
  case string_compare_rule: {
      string_compareNode *node = new (C) string_compareNode();
      node->set_opnd_array(5, MachOperGenerator(REGD, C));
      return node;
    }
  case string_indexof_con_rule: {
      string_indexof_conNode *node = new (C) string_indexof_conNode();
      node->set_opnd_array(5, MachOperGenerator(REGD, C));
      return node;
    }
  case string_indexof_rule: {
      string_indexofNode *node = new (C) string_indexofNode();
      node->set_opnd_array(5, MachOperGenerator(REGD, C));
      return node;
    }
  case string_equals_rule: {
      string_equalsNode *node = new (C) string_equalsNode();
      node->set_opnd_array(4, MachOperGenerator(REGD, C));
      node->set_opnd_array(5, MachOperGenerator(REGD, C));
      return node;
    }
  case array_equals_rule: {
      array_equalsNode *node = new (C) array_equalsNode();
      node->set_opnd_array(3, MachOperGenerator(REGD, C));
      node->set_opnd_array(4, MachOperGenerator(REGD, C));
      return node;
    }
  case compI_rReg_rule: {
      compI_rRegNode *node = new (C) compI_rRegNode();
      return node;
    }
  case compI_rReg_imm_rule: {
      compI_rReg_immNode *node = new (C) compI_rReg_immNode();
      return node;
    }
  case compI_rReg_mem_rule: {
      compI_rReg_memNode *node = new (C) compI_rReg_memNode();
      return node;
    }
  case testI_reg_rule: {
      testI_regNode *node = new (C) testI_regNode();
      return node;
    }
  case testI_reg_imm_rule: {
      testI_reg_immNode *node = new (C) testI_reg_immNode();
      return node;
    }
  case testI_reg_mem_rule: {
      testI_reg_memNode *node = new (C) testI_reg_memNode();
      return node;
    }
  case testI_reg_mem_0_rule: {
      testI_reg_mem_0Node *node = new (C) testI_reg_mem_0Node();
      return node;
    }
  case compU_rReg_rule: {
      compU_rRegNode *node = new (C) compU_rRegNode();
      return node;
    }
  case compU_rReg_imm_rule: {
      compU_rReg_immNode *node = new (C) compU_rReg_immNode();
      return node;
    }
  case compU_rReg_mem_rule: {
      compU_rReg_memNode *node = new (C) compU_rReg_memNode();
      return node;
    }
  case testU_reg_rule: {
      testU_regNode *node = new (C) testU_regNode();
      return node;
    }
  case compP_rReg_rule: {
      compP_rRegNode *node = new (C) compP_rRegNode();
      return node;
    }
  case compP_rReg_mem_rule: {
      compP_rReg_memNode *node = new (C) compP_rReg_memNode();
      return node;
    }
  case compP_mem_rReg_rule: {
      compP_mem_rRegNode *node = new (C) compP_mem_rRegNode();
      return node;
    }
  case testP_reg_rule: {
      testP_regNode *node = new (C) testP_regNode();
      return node;
    }
  case testP_mem_rule: {
      testP_memNode *node = new (C) testP_memNode();
      return node;
    }
  case testP_mem_reg0_rule: {
      testP_mem_reg0Node *node = new (C) testP_mem_reg0Node();
      return node;
    }
  case compN_rReg_rule: {
      compN_rRegNode *node = new (C) compN_rRegNode();
      return node;
    }
  case compN_rReg_mem_rule: {
      compN_rReg_memNode *node = new (C) compN_rReg_memNode();
      return node;
    }
  case compN_rReg_imm_rule: {
      compN_rReg_immNode *node = new (C) compN_rReg_immNode();
      return node;
    }
  case compN_mem_imm_rule: {
      compN_mem_immNode *node = new (C) compN_mem_immNode();
      return node;
    }
  case testN_reg_rule: {
      testN_regNode *node = new (C) testN_regNode();
      return node;
    }
  case testN_mem_rule: {
      testN_memNode *node = new (C) testN_memNode();
      return node;
    }
  case testN_mem_reg0_rule: {
      testN_mem_reg0Node *node = new (C) testN_mem_reg0Node();
      return node;
    }
  case compL_rReg_rule: {
      compL_rRegNode *node = new (C) compL_rRegNode();
      return node;
    }
  case compL_rReg_imm_rule: {
      compL_rReg_immNode *node = new (C) compL_rReg_immNode();
      return node;
    }
  case compL_rReg_mem_rule: {
      compL_rReg_memNode *node = new (C) compL_rReg_memNode();
      return node;
    }
  case testL_reg_rule: {
      testL_regNode *node = new (C) testL_regNode();
      return node;
    }
  case testL_reg_imm_rule: {
      testL_reg_immNode *node = new (C) testL_reg_immNode();
      return node;
    }
  case testL_reg_mem_rule: {
      testL_reg_memNode *node = new (C) testL_reg_memNode();
      return node;
    }
  case testL_reg_mem_0_rule: {
      testL_reg_mem_0Node *node = new (C) testL_reg_mem_0Node();
      return node;
    }
  case cmpL3_reg_reg_rule: {
      cmpL3_reg_regNode *node = new (C) cmpL3_reg_regNode();
      return node;
    }
  case minI_rReg_rule: {
      minI_rRegNode *node = new (C) minI_rRegNode();
      return node;
    }
  case maxI_rReg_rule: {
      maxI_rRegNode *node = new (C) maxI_rRegNode();
      return node;
    }
  case jmpDir_rule: {
      jmpDirNode *node = new (C) jmpDirNode();
      node->set_opnd_array(1, MachOperGenerator(LABEL, C));
      return node;
    }
  case jmpCon_rule: {
      jmpConNode *node = new (C) jmpConNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEnd_rule: {
      jmpLoopEndNode *node = new (C) jmpLoopEndNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEndU_rule: {
      jmpLoopEndUNode *node = new (C) jmpLoopEndUNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEndUCF_rule: {
      jmpLoopEndUCFNode *node = new (C) jmpLoopEndUCFNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConU_rule: {
      jmpConUNode *node = new (C) jmpConUNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConUCF_rule: {
      jmpConUCFNode *node = new (C) jmpConUCFNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConUCF2_rule: {
      jmpConUCF2Node *node = new (C) jmpConUCF2Node();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case partialSubtypeCheck_rule: {
      partialSubtypeCheckNode *node = new (C) partialSubtypeCheckNode();
      return node;
    }
  case partialSubtypeCheck_vs_Zero_rule: {
      partialSubtypeCheck_vs_ZeroNode *node = new (C) partialSubtypeCheck_vs_ZeroNode();
      return node;
    }
  case jmpDir_short_rule: {
      jmpDir_shortNode *node = new (C) jmpDir_shortNode();
      node->set_opnd_array(1, MachOperGenerator(LABEL, C));
      return node;
    }
  case jmpCon_short_rule: {
      jmpCon_shortNode *node = new (C) jmpCon_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEnd_short_rule: {
      jmpLoopEnd_shortNode *node = new (C) jmpLoopEnd_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEndU_short_rule: {
      jmpLoopEndU_shortNode *node = new (C) jmpLoopEndU_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpLoopEndUCF_short_rule: {
      jmpLoopEndUCF_shortNode *node = new (C) jmpLoopEndUCF_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConU_short_rule: {
      jmpConU_shortNode *node = new (C) jmpConU_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConUCF_short_rule: {
      jmpConUCF_shortNode *node = new (C) jmpConUCF_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case jmpConUCF2_short_rule: {
      jmpConUCF2_shortNode *node = new (C) jmpConUCF2_shortNode();
      node->set_opnd_array(3, MachOperGenerator(LABEL, C));
      node->_prob = _leaf->as_If()->_prob;
      node->_fcnt = _leaf->as_If()->_fcnt;
      return node;
    }
  case cmpFastLock_rule: {
      cmpFastLockNode *node = new (C) cmpFastLockNode();
      node->set_opnd_array(3, MachOperGenerator(RAX_REGI, C));
      node->set_opnd_array(4, MachOperGenerator(RREGP, C));
      node->_counters = _leaf->as_FastLock()->counters();
      return node;
    }
  case cmpFastUnlock_rule: {
      cmpFastUnlockNode *node = new (C) cmpFastUnlockNode();
      node->set_opnd_array(3, MachOperGenerator(RREGP, C));
      return node;
    }
  case safePoint_poll_rule: {
      safePoint_pollNode *node = new (C) safePoint_pollNode();
      node->set_opnd_array(1, MachOperGenerator(RFLAGSREG, C));
      return node;
    }
  case safePoint_poll_far_rule: {
      safePoint_poll_farNode *node = new (C) safePoint_poll_farNode();
      return node;
    }
  case CallStaticJavaDirect_rule: {
      CallStaticJavaDirectNode *node = new (C) CallStaticJavaDirectNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case CallStaticJavaHandle_rule: {
      CallStaticJavaHandleNode *node = new (C) CallStaticJavaHandleNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case CallDynamicJavaDirect_rule: {
      CallDynamicJavaDirectNode *node = new (C) CallDynamicJavaDirectNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case CallRuntimeDirect_rule: {
      CallRuntimeDirectNode *node = new (C) CallRuntimeDirectNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case CallLeafDirect_rule: {
      CallLeafDirectNode *node = new (C) CallLeafDirectNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case CallLeafNoFPDirect_rule: {
      CallLeafNoFPDirectNode *node = new (C) CallLeafNoFPDirectNode();
      node->set_opnd_array(1, MachOperGenerator(METHOD, C));
      return node;
    }
  case Ret_rule: {
      RetNode *node = new (C) RetNode();
      return node;
    }
  case TailCalljmpInd_rule: {
      TailCalljmpIndNode *node = new (C) TailCalljmpIndNode();
      return node;
    }
  case tailjmpInd_rule: {
      tailjmpIndNode *node = new (C) tailjmpIndNode();
      return node;
    }
  case CreateException_rule: {
      CreateExceptionNode *node = new (C) CreateExceptionNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case RethrowException_rule: {
      RethrowExceptionNode *node = new (C) RethrowExceptionNode();
      return node;
    }
  case tlsLoadP_rule: {
      tlsLoadPNode *node = new (C) tlsLoadPNode();
      return node;
    }
  case ShouldNotReachHere_rule: {
      ShouldNotReachHereNode *node = new (C) ShouldNotReachHereNode();
      return node;
    }
  case addF_reg_rule: {
      addF_regNode *node = new (C) addF_regNode();
      return node;
    }
  case addF_mem_rule: {
      addF_memNode *node = new (C) addF_memNode();
      return node;
    }
  case addF_mem_0_rule: {
      addF_mem_0Node *node = new (C) addF_mem_0Node();
      return node;
    }
  case addF_imm_rule: {
      addF_immNode *node = new (C) addF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addF_reg_reg_rule: {
      addF_reg_regNode *node = new (C) addF_reg_regNode();
      return node;
    }
  case addF_reg_mem_rule: {
      addF_reg_memNode *node = new (C) addF_reg_memNode();
      return node;
    }
  case addF_reg_mem_0_rule: {
      addF_reg_mem_0Node *node = new (C) addF_reg_mem_0Node();
      return node;
    }
  case addF_reg_imm_rule: {
      addF_reg_immNode *node = new (C) addF_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addD_reg_rule: {
      addD_regNode *node = new (C) addD_regNode();
      return node;
    }
  case addD_mem_rule: {
      addD_memNode *node = new (C) addD_memNode();
      return node;
    }
  case addD_mem_0_rule: {
      addD_mem_0Node *node = new (C) addD_mem_0Node();
      return node;
    }
  case addD_imm_rule: {
      addD_immNode *node = new (C) addD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case addD_reg_reg_rule: {
      addD_reg_regNode *node = new (C) addD_reg_regNode();
      return node;
    }
  case addD_reg_mem_rule: {
      addD_reg_memNode *node = new (C) addD_reg_memNode();
      return node;
    }
  case addD_reg_mem_0_rule: {
      addD_reg_mem_0Node *node = new (C) addD_reg_mem_0Node();
      return node;
    }
  case addD_reg_imm_rule: {
      addD_reg_immNode *node = new (C) addD_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subF_reg_rule: {
      subF_regNode *node = new (C) subF_regNode();
      return node;
    }
  case subF_mem_rule: {
      subF_memNode *node = new (C) subF_memNode();
      return node;
    }
  case subF_imm_rule: {
      subF_immNode *node = new (C) subF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subF_reg_reg_rule: {
      subF_reg_regNode *node = new (C) subF_reg_regNode();
      return node;
    }
  case subF_reg_mem_rule: {
      subF_reg_memNode *node = new (C) subF_reg_memNode();
      return node;
    }
  case subF_reg_imm_rule: {
      subF_reg_immNode *node = new (C) subF_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subD_reg_rule: {
      subD_regNode *node = new (C) subD_regNode();
      return node;
    }
  case subD_mem_rule: {
      subD_memNode *node = new (C) subD_memNode();
      return node;
    }
  case subD_imm_rule: {
      subD_immNode *node = new (C) subD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case subD_reg_reg_rule: {
      subD_reg_regNode *node = new (C) subD_reg_regNode();
      return node;
    }
  case subD_reg_mem_rule: {
      subD_reg_memNode *node = new (C) subD_reg_memNode();
      return node;
    }
  case subD_reg_imm_rule: {
      subD_reg_immNode *node = new (C) subD_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case mulF_reg_rule: {
      mulF_regNode *node = new (C) mulF_regNode();
      return node;
    }
  case mulF_mem_rule: {
      mulF_memNode *node = new (C) mulF_memNode();
      return node;
    }
  case mulF_mem_0_rule: {
      mulF_mem_0Node *node = new (C) mulF_mem_0Node();
      return node;
    }
  case mulF_imm_rule: {
      mulF_immNode *node = new (C) mulF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case mulF_reg_reg_rule: {
      mulF_reg_regNode *node = new (C) mulF_reg_regNode();
      return node;
    }
  case mulF_reg_mem_rule: {
      mulF_reg_memNode *node = new (C) mulF_reg_memNode();
      return node;
    }
  case mulF_reg_mem_0_rule: {
      mulF_reg_mem_0Node *node = new (C) mulF_reg_mem_0Node();
      return node;
    }
  case mulF_reg_imm_rule: {
      mulF_reg_immNode *node = new (C) mulF_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case mulD_reg_rule: {
      mulD_regNode *node = new (C) mulD_regNode();
      return node;
    }
  case mulD_mem_rule: {
      mulD_memNode *node = new (C) mulD_memNode();
      return node;
    }
  case mulD_mem_0_rule: {
      mulD_mem_0Node *node = new (C) mulD_mem_0Node();
      return node;
    }
  case mulD_imm_rule: {
      mulD_immNode *node = new (C) mulD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case mulD_reg_reg_rule: {
      mulD_reg_regNode *node = new (C) mulD_reg_regNode();
      return node;
    }
  case mulD_reg_mem_rule: {
      mulD_reg_memNode *node = new (C) mulD_reg_memNode();
      return node;
    }
  case mulD_reg_mem_0_rule: {
      mulD_reg_mem_0Node *node = new (C) mulD_reg_mem_0Node();
      return node;
    }
  case mulD_reg_imm_rule: {
      mulD_reg_immNode *node = new (C) mulD_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case divF_reg_rule: {
      divF_regNode *node = new (C) divF_regNode();
      return node;
    }
  case divF_mem_rule: {
      divF_memNode *node = new (C) divF_memNode();
      return node;
    }
  case divF_imm_rule: {
      divF_immNode *node = new (C) divF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case divF_reg_reg_rule: {
      divF_reg_regNode *node = new (C) divF_reg_regNode();
      return node;
    }
  case divF_reg_mem_rule: {
      divF_reg_memNode *node = new (C) divF_reg_memNode();
      return node;
    }
  case divF_reg_imm_rule: {
      divF_reg_immNode *node = new (C) divF_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case divD_reg_rule: {
      divD_regNode *node = new (C) divD_regNode();
      return node;
    }
  case divD_mem_rule: {
      divD_memNode *node = new (C) divD_memNode();
      return node;
    }
  case divD_imm_rule: {
      divD_immNode *node = new (C) divD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case divD_reg_reg_rule: {
      divD_reg_regNode *node = new (C) divD_reg_regNode();
      return node;
    }
  case divD_reg_mem_rule: {
      divD_reg_memNode *node = new (C) divD_reg_memNode();
      return node;
    }
  case divD_reg_imm_rule: {
      divD_reg_immNode *node = new (C) divD_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case absF_reg_rule: {
      absF_regNode *node = new (C) absF_regNode();
      return node;
    }
  case absF_reg_reg_rule: {
      absF_reg_regNode *node = new (C) absF_reg_regNode();
      return node;
    }
  case absD_reg_rule: {
      absD_regNode *node = new (C) absD_regNode();
      return node;
    }
  case absD_reg_reg_rule: {
      absD_reg_regNode *node = new (C) absD_reg_regNode();
      return node;
    }
  case negF_reg_rule: {
      negF_regNode *node = new (C) negF_regNode();
      return node;
    }
  case negF_reg_reg_rule: {
      negF_reg_regNode *node = new (C) negF_reg_regNode();
      return node;
    }
  case negD_reg_rule: {
      negD_regNode *node = new (C) negD_regNode();
      return node;
    }
  case negD_reg_reg_rule: {
      negD_reg_regNode *node = new (C) negD_reg_regNode();
      return node;
    }
  case sqrtF_reg_rule: {
      sqrtF_regNode *node = new (C) sqrtF_regNode();
      return node;
    }
  case sqrtF_mem_rule: {
      sqrtF_memNode *node = new (C) sqrtF_memNode();
      return node;
    }
  case sqrtF_imm_rule: {
      sqrtF_immNode *node = new (C) sqrtF_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case sqrtD_reg_rule: {
      sqrtD_regNode *node = new (C) sqrtD_regNode();
      return node;
    }
  case sqrtD_mem_rule: {
      sqrtD_memNode *node = new (C) sqrtD_memNode();
      return node;
    }
  case sqrtD_imm_rule: {
      sqrtD_immNode *node = new (C) sqrtD_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadV4_rule: {
      loadV4Node *node = new (C) loadV4Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadV8_rule: {
      loadV8Node *node = new (C) loadV8Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadV16_rule: {
      loadV16Node *node = new (C) loadV16Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case loadV32_rule: {
      loadV32Node *node = new (C) loadV32Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeV4_rule: {
      storeV4Node *node = new (C) storeV4Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeV8_rule: {
      storeV8Node *node = new (C) storeV8Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeV16_rule: {
      storeV16Node *node = new (C) storeV16Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case storeV32_rule: {
      storeV32Node *node = new (C) storeV32Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4B_rule: {
      Repl4BNode *node = new (C) Repl4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8B_rule: {
      Repl8BNode *node = new (C) Repl8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16B_rule: {
      Repl16BNode *node = new (C) Repl16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl32B_rule: {
      Repl32BNode *node = new (C) Repl32BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4B_imm_rule: {
      Repl4B_immNode *node = new (C) Repl4B_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8B_imm_rule: {
      Repl8B_immNode *node = new (C) Repl8B_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16B_imm_rule: {
      Repl16B_immNode *node = new (C) Repl16B_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl32B_imm_rule: {
      Repl32B_immNode *node = new (C) Repl32B_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4B_zero_rule: {
      Repl4B_zeroNode *node = new (C) Repl4B_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8B_zero_rule: {
      Repl8B_zeroNode *node = new (C) Repl8B_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16B_zero_rule: {
      Repl16B_zeroNode *node = new (C) Repl16B_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl32B_zero_rule: {
      Repl32B_zeroNode *node = new (C) Repl32B_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2S_rule: {
      Repl2SNode *node = new (C) Repl2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4S_rule: {
      Repl4SNode *node = new (C) Repl4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8S_rule: {
      Repl8SNode *node = new (C) Repl8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16S_rule: {
      Repl16SNode *node = new (C) Repl16SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2S_imm_rule: {
      Repl2S_immNode *node = new (C) Repl2S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4S_imm_rule: {
      Repl4S_immNode *node = new (C) Repl4S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8S_imm_rule: {
      Repl8S_immNode *node = new (C) Repl8S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16S_imm_rule: {
      Repl16S_immNode *node = new (C) Repl16S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2S_zero_rule: {
      Repl2S_zeroNode *node = new (C) Repl2S_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4S_zero_rule: {
      Repl4S_zeroNode *node = new (C) Repl4S_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8S_zero_rule: {
      Repl8S_zeroNode *node = new (C) Repl8S_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl16S_zero_rule: {
      Repl16S_zeroNode *node = new (C) Repl16S_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2I_rule: {
      Repl2INode *node = new (C) Repl2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4I_rule: {
      Repl4INode *node = new (C) Repl4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8I_rule: {
      Repl8INode *node = new (C) Repl8INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2I_imm_rule: {
      Repl2I_immNode *node = new (C) Repl2I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4I_imm_rule: {
      Repl4I_immNode *node = new (C) Repl4I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8I_imm_rule: {
      Repl8I_immNode *node = new (C) Repl8I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2I_mem_rule: {
      Repl2I_memNode *node = new (C) Repl2I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4I_mem_rule: {
      Repl4I_memNode *node = new (C) Repl4I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8I_mem_rule: {
      Repl8I_memNode *node = new (C) Repl8I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2I_zero_rule: {
      Repl2I_zeroNode *node = new (C) Repl2I_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4I_zero_rule: {
      Repl4I_zeroNode *node = new (C) Repl4I_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8I_zero_rule: {
      Repl8I_zeroNode *node = new (C) Repl8I_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2L_rule: {
      Repl2LNode *node = new (C) Repl2LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4L_rule: {
      Repl4LNode *node = new (C) Repl4LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2L_imm_rule: {
      Repl2L_immNode *node = new (C) Repl2L_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4L_imm_rule: {
      Repl4L_immNode *node = new (C) Repl4L_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2L_mem_rule: {
      Repl2L_memNode *node = new (C) Repl2L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4L_mem_rule: {
      Repl4L_memNode *node = new (C) Repl4L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2L_zero_rule: {
      Repl2L_zeroNode *node = new (C) Repl2L_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4L_zero_rule: {
      Repl4L_zeroNode *node = new (C) Repl4L_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2F_rule: {
      Repl2FNode *node = new (C) Repl2FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4F_rule: {
      Repl4FNode *node = new (C) Repl4FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8F_rule: {
      Repl8FNode *node = new (C) Repl8FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2F_zero_rule: {
      Repl2F_zeroNode *node = new (C) Repl2F_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4F_zero_rule: {
      Repl4F_zeroNode *node = new (C) Repl4F_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl8F_zero_rule: {
      Repl8F_zeroNode *node = new (C) Repl8F_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2D_rule: {
      Repl2DNode *node = new (C) Repl2DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4D_rule: {
      Repl4DNode *node = new (C) Repl4DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl2D_zero_rule: {
      Repl2D_zeroNode *node = new (C) Repl2D_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case Repl4D_zero_rule: {
      Repl4D_zeroNode *node = new (C) Repl4D_zeroNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4B_rule: {
      vadd4BNode *node = new (C) vadd4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4B_reg_rule: {
      vadd4B_regNode *node = new (C) vadd4B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8B_rule: {
      vadd8BNode *node = new (C) vadd8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8B_reg_rule: {
      vadd8B_regNode *node = new (C) vadd8B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd16B_rule: {
      vadd16BNode *node = new (C) vadd16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd16B_reg_rule: {
      vadd16B_regNode *node = new (C) vadd16B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd16B_mem_rule: {
      vadd16B_memNode *node = new (C) vadd16B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd32B_reg_rule: {
      vadd32B_regNode *node = new (C) vadd32B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd32B_mem_rule: {
      vadd32B_memNode *node = new (C) vadd32B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2S_rule: {
      vadd2SNode *node = new (C) vadd2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2S_reg_rule: {
      vadd2S_regNode *node = new (C) vadd2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4S_rule: {
      vadd4SNode *node = new (C) vadd4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4S_reg_rule: {
      vadd4S_regNode *node = new (C) vadd4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8S_rule: {
      vadd8SNode *node = new (C) vadd8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8S_reg_rule: {
      vadd8S_regNode *node = new (C) vadd8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8S_mem_rule: {
      vadd8S_memNode *node = new (C) vadd8S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd16S_reg_rule: {
      vadd16S_regNode *node = new (C) vadd16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd16S_mem_rule: {
      vadd16S_memNode *node = new (C) vadd16S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2I_rule: {
      vadd2INode *node = new (C) vadd2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2I_reg_rule: {
      vadd2I_regNode *node = new (C) vadd2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4I_rule: {
      vadd4INode *node = new (C) vadd4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4I_reg_rule: {
      vadd4I_regNode *node = new (C) vadd4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4I_mem_rule: {
      vadd4I_memNode *node = new (C) vadd4I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8I_reg_rule: {
      vadd8I_regNode *node = new (C) vadd8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8I_mem_rule: {
      vadd8I_memNode *node = new (C) vadd8I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2L_rule: {
      vadd2LNode *node = new (C) vadd2LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2L_reg_rule: {
      vadd2L_regNode *node = new (C) vadd2L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2L_mem_rule: {
      vadd2L_memNode *node = new (C) vadd2L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4L_reg_rule: {
      vadd4L_regNode *node = new (C) vadd4L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4L_mem_rule: {
      vadd4L_memNode *node = new (C) vadd4L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2F_rule: {
      vadd2FNode *node = new (C) vadd2FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2F_reg_rule: {
      vadd2F_regNode *node = new (C) vadd2F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4F_rule: {
      vadd4FNode *node = new (C) vadd4FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4F_reg_rule: {
      vadd4F_regNode *node = new (C) vadd4F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4F_mem_rule: {
      vadd4F_memNode *node = new (C) vadd4F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8F_reg_rule: {
      vadd8F_regNode *node = new (C) vadd8F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd8F_mem_rule: {
      vadd8F_memNode *node = new (C) vadd8F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2D_rule: {
      vadd2DNode *node = new (C) vadd2DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2D_reg_rule: {
      vadd2D_regNode *node = new (C) vadd2D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd2D_mem_rule: {
      vadd2D_memNode *node = new (C) vadd2D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4D_reg_rule: {
      vadd4D_regNode *node = new (C) vadd4D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vadd4D_mem_rule: {
      vadd4D_memNode *node = new (C) vadd4D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4B_rule: {
      vsub4BNode *node = new (C) vsub4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4B_reg_rule: {
      vsub4B_regNode *node = new (C) vsub4B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8B_rule: {
      vsub8BNode *node = new (C) vsub8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8B_reg_rule: {
      vsub8B_regNode *node = new (C) vsub8B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub16B_rule: {
      vsub16BNode *node = new (C) vsub16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub16B_reg_rule: {
      vsub16B_regNode *node = new (C) vsub16B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub16B_mem_rule: {
      vsub16B_memNode *node = new (C) vsub16B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub32B_reg_rule: {
      vsub32B_regNode *node = new (C) vsub32B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub32B_mem_rule: {
      vsub32B_memNode *node = new (C) vsub32B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2S_rule: {
      vsub2SNode *node = new (C) vsub2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2S_reg_rule: {
      vsub2S_regNode *node = new (C) vsub2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4S_rule: {
      vsub4SNode *node = new (C) vsub4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4S_reg_rule: {
      vsub4S_regNode *node = new (C) vsub4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8S_rule: {
      vsub8SNode *node = new (C) vsub8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8S_reg_rule: {
      vsub8S_regNode *node = new (C) vsub8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8S_mem_rule: {
      vsub8S_memNode *node = new (C) vsub8S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub16S_reg_rule: {
      vsub16S_regNode *node = new (C) vsub16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub16S_mem_rule: {
      vsub16S_memNode *node = new (C) vsub16S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2I_rule: {
      vsub2INode *node = new (C) vsub2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2I_reg_rule: {
      vsub2I_regNode *node = new (C) vsub2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4I_rule: {
      vsub4INode *node = new (C) vsub4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4I_reg_rule: {
      vsub4I_regNode *node = new (C) vsub4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4I_mem_rule: {
      vsub4I_memNode *node = new (C) vsub4I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8I_reg_rule: {
      vsub8I_regNode *node = new (C) vsub8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8I_mem_rule: {
      vsub8I_memNode *node = new (C) vsub8I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2L_rule: {
      vsub2LNode *node = new (C) vsub2LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2L_reg_rule: {
      vsub2L_regNode *node = new (C) vsub2L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2L_mem_rule: {
      vsub2L_memNode *node = new (C) vsub2L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4L_reg_rule: {
      vsub4L_regNode *node = new (C) vsub4L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4L_mem_rule: {
      vsub4L_memNode *node = new (C) vsub4L_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2F_rule: {
      vsub2FNode *node = new (C) vsub2FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2F_reg_rule: {
      vsub2F_regNode *node = new (C) vsub2F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4F_rule: {
      vsub4FNode *node = new (C) vsub4FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4F_reg_rule: {
      vsub4F_regNode *node = new (C) vsub4F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4F_mem_rule: {
      vsub4F_memNode *node = new (C) vsub4F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8F_reg_rule: {
      vsub8F_regNode *node = new (C) vsub8F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub8F_mem_rule: {
      vsub8F_memNode *node = new (C) vsub8F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2D_rule: {
      vsub2DNode *node = new (C) vsub2DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2D_reg_rule: {
      vsub2D_regNode *node = new (C) vsub2D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub2D_mem_rule: {
      vsub2D_memNode *node = new (C) vsub2D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4D_reg_rule: {
      vsub4D_regNode *node = new (C) vsub4D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsub4D_mem_rule: {
      vsub4D_memNode *node = new (C) vsub4D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2S_rule: {
      vmul2SNode *node = new (C) vmul2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2S_reg_rule: {
      vmul2S_regNode *node = new (C) vmul2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4S_rule: {
      vmul4SNode *node = new (C) vmul4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4S_reg_rule: {
      vmul4S_regNode *node = new (C) vmul4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8S_rule: {
      vmul8SNode *node = new (C) vmul8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8S_reg_rule: {
      vmul8S_regNode *node = new (C) vmul8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8S_mem_rule: {
      vmul8S_memNode *node = new (C) vmul8S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul16S_reg_rule: {
      vmul16S_regNode *node = new (C) vmul16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul16S_mem_rule: {
      vmul16S_memNode *node = new (C) vmul16S_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2I_rule: {
      vmul2INode *node = new (C) vmul2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2I_reg_rule: {
      vmul2I_regNode *node = new (C) vmul2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4I_rule: {
      vmul4INode *node = new (C) vmul4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4I_reg_rule: {
      vmul4I_regNode *node = new (C) vmul4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4I_mem_rule: {
      vmul4I_memNode *node = new (C) vmul4I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8I_reg_rule: {
      vmul8I_regNode *node = new (C) vmul8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8I_mem_rule: {
      vmul8I_memNode *node = new (C) vmul8I_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2F_rule: {
      vmul2FNode *node = new (C) vmul2FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2F_reg_rule: {
      vmul2F_regNode *node = new (C) vmul2F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4F_rule: {
      vmul4FNode *node = new (C) vmul4FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4F_reg_rule: {
      vmul4F_regNode *node = new (C) vmul4F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4F_mem_rule: {
      vmul4F_memNode *node = new (C) vmul4F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8F_reg_rule: {
      vmul8F_regNode *node = new (C) vmul8F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul8F_mem_rule: {
      vmul8F_memNode *node = new (C) vmul8F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2D_rule: {
      vmul2DNode *node = new (C) vmul2DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2D_reg_rule: {
      vmul2D_regNode *node = new (C) vmul2D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul2D_mem_rule: {
      vmul2D_memNode *node = new (C) vmul2D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4D_reg_rule: {
      vmul4D_regNode *node = new (C) vmul4D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vmul4D_mem_rule: {
      vmul4D_memNode *node = new (C) vmul4D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv2F_rule: {
      vdiv2FNode *node = new (C) vdiv2FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv2F_reg_rule: {
      vdiv2F_regNode *node = new (C) vdiv2F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv4F_rule: {
      vdiv4FNode *node = new (C) vdiv4FNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv4F_reg_rule: {
      vdiv4F_regNode *node = new (C) vdiv4F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv4F_mem_rule: {
      vdiv4F_memNode *node = new (C) vdiv4F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv8F_reg_rule: {
      vdiv8F_regNode *node = new (C) vdiv8F_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv8F_mem_rule: {
      vdiv8F_memNode *node = new (C) vdiv8F_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv2D_rule: {
      vdiv2DNode *node = new (C) vdiv2DNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv2D_reg_rule: {
      vdiv2D_regNode *node = new (C) vdiv2D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv2D_mem_rule: {
      vdiv2D_memNode *node = new (C) vdiv2D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv4D_reg_rule: {
      vdiv4D_regNode *node = new (C) vdiv4D_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vdiv4D_mem_rule: {
      vdiv4D_memNode *node = new (C) vdiv4D_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vshiftcnt_rule: {
      vshiftcntNode *node = new (C) vshiftcntNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vshiftcnt_0_rule: {
      vshiftcnt_0Node *node = new (C) vshiftcnt_0Node();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2S_rule: {
      vsll2SNode *node = new (C) vsll2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2S_imm_rule: {
      vsll2S_immNode *node = new (C) vsll2S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2S_reg_rule: {
      vsll2S_regNode *node = new (C) vsll2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2S_reg_imm_rule: {
      vsll2S_reg_immNode *node = new (C) vsll2S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4S_rule: {
      vsll4SNode *node = new (C) vsll4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4S_imm_rule: {
      vsll4S_immNode *node = new (C) vsll4S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4S_reg_rule: {
      vsll4S_regNode *node = new (C) vsll4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4S_reg_imm_rule: {
      vsll4S_reg_immNode *node = new (C) vsll4S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8S_rule: {
      vsll8SNode *node = new (C) vsll8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8S_imm_rule: {
      vsll8S_immNode *node = new (C) vsll8S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8S_reg_rule: {
      vsll8S_regNode *node = new (C) vsll8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8S_reg_imm_rule: {
      vsll8S_reg_immNode *node = new (C) vsll8S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll16S_reg_rule: {
      vsll16S_regNode *node = new (C) vsll16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll16S_reg_imm_rule: {
      vsll16S_reg_immNode *node = new (C) vsll16S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2I_rule: {
      vsll2INode *node = new (C) vsll2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2I_imm_rule: {
      vsll2I_immNode *node = new (C) vsll2I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2I_reg_rule: {
      vsll2I_regNode *node = new (C) vsll2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2I_reg_imm_rule: {
      vsll2I_reg_immNode *node = new (C) vsll2I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4I_rule: {
      vsll4INode *node = new (C) vsll4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4I_imm_rule: {
      vsll4I_immNode *node = new (C) vsll4I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4I_reg_rule: {
      vsll4I_regNode *node = new (C) vsll4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4I_reg_imm_rule: {
      vsll4I_reg_immNode *node = new (C) vsll4I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8I_reg_rule: {
      vsll8I_regNode *node = new (C) vsll8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll8I_reg_imm_rule: {
      vsll8I_reg_immNode *node = new (C) vsll8I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2L_rule: {
      vsll2LNode *node = new (C) vsll2LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2L_imm_rule: {
      vsll2L_immNode *node = new (C) vsll2L_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2L_reg_rule: {
      vsll2L_regNode *node = new (C) vsll2L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll2L_reg_imm_rule: {
      vsll2L_reg_immNode *node = new (C) vsll2L_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4L_reg_rule: {
      vsll4L_regNode *node = new (C) vsll4L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsll4L_reg_imm_rule: {
      vsll4L_reg_immNode *node = new (C) vsll4L_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2S_rule: {
      vsrl2SNode *node = new (C) vsrl2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2S_imm_rule: {
      vsrl2S_immNode *node = new (C) vsrl2S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2S_reg_rule: {
      vsrl2S_regNode *node = new (C) vsrl2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2S_reg_imm_rule: {
      vsrl2S_reg_immNode *node = new (C) vsrl2S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4S_rule: {
      vsrl4SNode *node = new (C) vsrl4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4S_imm_rule: {
      vsrl4S_immNode *node = new (C) vsrl4S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4S_reg_rule: {
      vsrl4S_regNode *node = new (C) vsrl4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4S_reg_imm_rule: {
      vsrl4S_reg_immNode *node = new (C) vsrl4S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8S_rule: {
      vsrl8SNode *node = new (C) vsrl8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8S_imm_rule: {
      vsrl8S_immNode *node = new (C) vsrl8S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8S_reg_rule: {
      vsrl8S_regNode *node = new (C) vsrl8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8S_reg_imm_rule: {
      vsrl8S_reg_immNode *node = new (C) vsrl8S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl16S_reg_rule: {
      vsrl16S_regNode *node = new (C) vsrl16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl16S_reg_imm_rule: {
      vsrl16S_reg_immNode *node = new (C) vsrl16S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2I_rule: {
      vsrl2INode *node = new (C) vsrl2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2I_imm_rule: {
      vsrl2I_immNode *node = new (C) vsrl2I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2I_reg_rule: {
      vsrl2I_regNode *node = new (C) vsrl2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2I_reg_imm_rule: {
      vsrl2I_reg_immNode *node = new (C) vsrl2I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4I_rule: {
      vsrl4INode *node = new (C) vsrl4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4I_imm_rule: {
      vsrl4I_immNode *node = new (C) vsrl4I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4I_reg_rule: {
      vsrl4I_regNode *node = new (C) vsrl4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4I_reg_imm_rule: {
      vsrl4I_reg_immNode *node = new (C) vsrl4I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8I_reg_rule: {
      vsrl8I_regNode *node = new (C) vsrl8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl8I_reg_imm_rule: {
      vsrl8I_reg_immNode *node = new (C) vsrl8I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2L_rule: {
      vsrl2LNode *node = new (C) vsrl2LNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2L_imm_rule: {
      vsrl2L_immNode *node = new (C) vsrl2L_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2L_reg_rule: {
      vsrl2L_regNode *node = new (C) vsrl2L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl2L_reg_imm_rule: {
      vsrl2L_reg_immNode *node = new (C) vsrl2L_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4L_reg_rule: {
      vsrl4L_regNode *node = new (C) vsrl4L_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsrl4L_reg_imm_rule: {
      vsrl4L_reg_immNode *node = new (C) vsrl4L_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2S_rule: {
      vsra2SNode *node = new (C) vsra2SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2S_imm_rule: {
      vsra2S_immNode *node = new (C) vsra2S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2S_reg_rule: {
      vsra2S_regNode *node = new (C) vsra2S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2S_reg_imm_rule: {
      vsra2S_reg_immNode *node = new (C) vsra2S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4S_rule: {
      vsra4SNode *node = new (C) vsra4SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4S_imm_rule: {
      vsra4S_immNode *node = new (C) vsra4S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4S_reg_rule: {
      vsra4S_regNode *node = new (C) vsra4S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4S_reg_imm_rule: {
      vsra4S_reg_immNode *node = new (C) vsra4S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8S_rule: {
      vsra8SNode *node = new (C) vsra8SNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8S_imm_rule: {
      vsra8S_immNode *node = new (C) vsra8S_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8S_reg_rule: {
      vsra8S_regNode *node = new (C) vsra8S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8S_reg_imm_rule: {
      vsra8S_reg_immNode *node = new (C) vsra8S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra16S_reg_rule: {
      vsra16S_regNode *node = new (C) vsra16S_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra16S_reg_imm_rule: {
      vsra16S_reg_immNode *node = new (C) vsra16S_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2I_rule: {
      vsra2INode *node = new (C) vsra2INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2I_imm_rule: {
      vsra2I_immNode *node = new (C) vsra2I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2I_reg_rule: {
      vsra2I_regNode *node = new (C) vsra2I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra2I_reg_imm_rule: {
      vsra2I_reg_immNode *node = new (C) vsra2I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4I_rule: {
      vsra4INode *node = new (C) vsra4INode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4I_imm_rule: {
      vsra4I_immNode *node = new (C) vsra4I_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4I_reg_rule: {
      vsra4I_regNode *node = new (C) vsra4I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra4I_reg_imm_rule: {
      vsra4I_reg_immNode *node = new (C) vsra4I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8I_reg_rule: {
      vsra8I_regNode *node = new (C) vsra8I_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vsra8I_reg_imm_rule: {
      vsra8I_reg_immNode *node = new (C) vsra8I_reg_immNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand4B_rule: {
      vand4BNode *node = new (C) vand4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand4B_reg_rule: {
      vand4B_regNode *node = new (C) vand4B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand8B_rule: {
      vand8BNode *node = new (C) vand8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand8B_reg_rule: {
      vand8B_regNode *node = new (C) vand8B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand16B_rule: {
      vand16BNode *node = new (C) vand16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand16B_reg_rule: {
      vand16B_regNode *node = new (C) vand16B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand16B_mem_rule: {
      vand16B_memNode *node = new (C) vand16B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand32B_reg_rule: {
      vand32B_regNode *node = new (C) vand32B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vand32B_mem_rule: {
      vand32B_memNode *node = new (C) vand32B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor4B_rule: {
      vor4BNode *node = new (C) vor4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor4B_reg_rule: {
      vor4B_regNode *node = new (C) vor4B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor8B_rule: {
      vor8BNode *node = new (C) vor8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor8B_reg_rule: {
      vor8B_regNode *node = new (C) vor8B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor16B_rule: {
      vor16BNode *node = new (C) vor16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor16B_reg_rule: {
      vor16B_regNode *node = new (C) vor16B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor16B_mem_rule: {
      vor16B_memNode *node = new (C) vor16B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor32B_reg_rule: {
      vor32B_regNode *node = new (C) vor32B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vor32B_mem_rule: {
      vor32B_memNode *node = new (C) vor32B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor4B_rule: {
      vxor4BNode *node = new (C) vxor4BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor4B_reg_rule: {
      vxor4B_regNode *node = new (C) vxor4B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor8B_rule: {
      vxor8BNode *node = new (C) vxor8BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor8B_reg_rule: {
      vxor8B_regNode *node = new (C) vxor8B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor16B_rule: {
      vxor16BNode *node = new (C) vxor16BNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor16B_reg_rule: {
      vxor16B_regNode *node = new (C) vxor16B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor16B_mem_rule: {
      vxor16B_memNode *node = new (C) vxor16B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor32B_reg_rule: {
      vxor32B_regNode *node = new (C) vxor32B_regNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  case vxor32B_mem_rule: {
      vxor32B_memNode *node = new (C) vxor32B_memNode();
      node->_bottom_type = _leaf->bottom_type();
      return node;
    }
  
  default:
    fprintf(stderr, "Default MachNode Generator invoked for: \n");
    fprintf(stderr, "   opcode = %d\n", opcode);
    break;
  };
  return NULL;
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
