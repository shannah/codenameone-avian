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

// Register masks, one for each register class.
const RegMask _ANY_REG_mask( 0xffffffff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_REG_mask( 0xffffcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_PTR_REG_mask( 0xffffcff, 0x0, 0x0, 0x0, 0x0, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
const RegMask _PTR_NO_RAX_REG_mask( 0xfcffcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_NO_RBP_REG_mask( 0xf3ffcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_NO_RAX_RBX_REG_mask( 0xfcfccff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RAX_REG_mask( 0x300000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RBX_REG_mask( 0x3000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RSI_REG_mask( 0xc0000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RDI_REG_mask( 0xc000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RBP_REG_mask( 0xc00000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_RSP_REG_mask( 0xc0000000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _PTR_R15_REG_mask( 0x30000000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_REG_mask( 0xffffcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_LONG_REG_mask( 0xffffcff, 0x0, 0x0, 0x0, 0x0, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
const RegMask _LONG_NO_RAX_RDX_REG_mask( 0xfccfcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_NO_RCX_REG_mask( 0xffff0ff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_NO_RAX_REG_mask( 0xfcffcff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_RAX_REG_mask( 0x300000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_RCX_REG_mask( 0xc00, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _LONG_RDX_REG_mask( 0x30000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_REG_mask( 0x5555455, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_INT_REG_mask( 0x5555455, 0x0, 0x0, 0x0, 0x0, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
const RegMask _INT_NO_RCX_REG_mask( 0x5555055, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_NO_RAX_RDX_REG_mask( 0x5445455, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_RAX_REG_mask( 0x100000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_RBX_REG_mask( 0x1000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_RCX_REG_mask( 0x400, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_RDX_REG_mask( 0x10000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_RDI_REG_mask( 0x4000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _INT_FLAGS_mask( 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0 );
const RegMask _FLOAT_REG_mask( 0x0, 0x1010101, 0x1010101, 0x1010101, 0x1010101, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_FLOAT_REG_mask( 0x0, 0x1010101, 0x1010101, 0x1010101, 0x1010101, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
const RegMask _DOUBLE_REG_mask( 0x0, 0x3030303, 0x3030303, 0x3030303, 0x3030303, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_DOUBLE_REG_mask( 0x0, 0x3030303, 0x3030303, 0x3030303, 0x3030303, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
const RegMask _VECTORS_REG_mask( 0x0, 0x1010101, 0x1010101, 0x1010101, 0x1010101, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _VECTORD_REG_mask( 0x0, 0x3030303, 0x3030303, 0x3030303, 0x3030303, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _VECTORX_REG_mask( 0x0, 0xf0f0f0f, 0xf0f0f0f, 0xf0f0f0f, 0xf0f0f0f, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _VECTORY_REG_mask( 0x0, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_SLOTS_mask( 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 );
const RegMask _STACK_OR_STACK_SLOTS_mask( 0x0, 0x0, 0x0, 0x0, 0x0, 0xffffff00, 0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff );
MachNode* loadUB2L_immI8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadS2BNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// mem
  unsigned num2 = opnd_array(2)->num_edges(); 	// twentyfour
  unsigned num3 = opnd_array(3)->num_edges(); 	// twentyfour
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* loadUS2BNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// mem
  unsigned num2 = opnd_array(2)->num_edges(); 	// twentyfour
  unsigned num3 = opnd_array(3)->num_edges(); 	// twentyfour
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* loadUS2L_immI16Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadI2BNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// mem
  unsigned num2 = opnd_array(2)->num_edges(); 	// twentyfour
  unsigned num3 = opnd_array(3)->num_edges(); 	// twentyfour
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* loadI2SNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// mem
  unsigned num2 = opnd_array(2)->num_edges(); 	// sixteen
  unsigned num3 = opnd_array(3)->num_edges(); 	// sixteen
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* loadI2L_immINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConI0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConL0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConP0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConP31Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* loadConN0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* loadConDNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* bytes_reverse_unsigned_shortNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* bytes_reverse_shortNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countLeadingZerosINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countLeadingZerosI_bsrNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countLeadingZerosLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countLeadingZerosL_bsrNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countTrailingZerosINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* countTrailingZerosLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* popCountINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* popCountI_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* popCountLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* popCountL_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* membar_volatileNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* encodeHeapOopNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* encodeHeapOop_not_nullNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* decodeHeapOopNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* decodeHeapOop_not_nullNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* jumpXtnd_offsetNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP dest
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* jumpXtnd_addrNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP dest
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* jumpXtndNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP dest
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmovI_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovI_regUNode *n0 = new (C) cmovI_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovI_memUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  if (mem == (Node*)1) {
    idx0--; // Adjust base because memory edge hasn't been inserted yet
  }
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovI_memUNode *n0 = new (C) cmovI_memUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  if (mem != (Node*)1) {
    n0->add_req(_in[1]);	// Add memory edge
  }
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovN_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovN_regUNode *n0 = new (C) cmovN_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGN, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovP_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovP_regUNode *n0 = new (C) cmovP_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGP, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovL_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovL_regUNode *n0 = new (C) cmovL_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovL_memUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  if (mem == (Node*)1) {
    idx0--; // Adjust base because memory edge hasn't been inserted yet
  }
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovL_memUNode *n0 = new (C) cmovL_memUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  if (mem != (Node*)1) {
    n0->add_req(_in[1]);	// Add memory edge
  }
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovF_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovF_regUNode *n0 = new (C) cmovF_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( REGF, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* cmovD_regUCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  cmovD_regUNode *n0 = new (C) cmovD_regUNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( REGD, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // cop
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // cr
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  n0->set_opnd_array(3, opnd_array(3)->clone(C)); // dst
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  tmp3 = n0;
  n0->set_opnd_array(4, opnd_array(4)->clone(C)); // src
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* addI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addI_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addI_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addI_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addI_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* incI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* incI_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* decI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* decI_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addL_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addL_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addL_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addL_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* incL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* incL_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* decL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* decL_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* addP_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addP_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* storeIConditionalNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);

  return this;
}

MachNode* storeLConditionalNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RAX_REG_mask()), Op_RegL );
  proj_list.push(kill);

  return this;
}

MachNode* compareAndSwapPNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RAX_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* compareAndSwapLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RAX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* compareAndSwapINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xaddI_no_resNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xaddINode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xaddL_no_resNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xaddLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* compareAndSwapNNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL oldval
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegN );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subI_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subI_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* subI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* subL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subL_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* subL_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* subL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* subP_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* negI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* negI_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// zero
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* negL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* negL_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// zero
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* mulI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulI_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulI_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulL_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulL_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mulHiL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RAX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* divI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rdx
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* divL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rdx
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RDX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* divModI_rReg_divmodNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* divModL_rReg_divmodNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* mul_hiNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RAX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarL_rReg_63Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarL_rReg_2Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* divL_10Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachOper *op0 = new (C) rax_RegLOper();
  MachOper *op1 = new (C) rFlagsRegOper();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = NULL;
  MachNode *tmp4 = NULL;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  MachNode *result = NULL;

  loadConL_0x6666666666666667Node *n0 = new (C) loadConL_0x6666666666666667Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  tmp3 = n0;
  result = n0->Expand( state, proj_list, mem );

  mul_hiNode *n1 = new (C) mul_hiNode();
  n1->add_req(_in[0]);
  n1->set_opnd_array(0, state->MachOperGenerator( RDX_REGL, C ));
  tmp0 = n1;
  n1->set_opnd_array(1, opnd_array(1)->clone(C)); // src
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n1->add_req(_in[i + idx1]);
    }
  }
  else n1->add_req(tmp1);
  n1->set_opnd_array(2, op0->clone(C)); // rax
  if(tmp3 != NULL)
    n1->add_req(tmp3);
  result = n1->Expand( state, proj_list, mem );

  sarL_rReg_63Node *n2 = new (C) sarL_rReg_63Node();
  n2->add_req(_in[0]);
  n2->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n2->set_opnd_array(1, opnd_array(1)->clone(C)); // src
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n2->add_req(_in[i + idx1]);
    }
  }
  else n2->add_req(tmp1);
  tmp1 = n2;
  result = n2->Expand( state, proj_list, mem );

  sarL_rReg_2Node *n3 = new (C) sarL_rReg_2Node();
  n3->add_req(_in[0]);
  n3->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n3->set_opnd_array(1, opnd_array(0)->clone(C)); // dst
  if(tmp0 == this) {
    for(unsigned i = 0; i < num0; i++) {
      n3->add_req(_in[i + idx0]);
    }
  }
  else n3->add_req(tmp0);
  tmp0 = n3;
  result = n3->Expand( state, proj_list, mem );

  subL_rRegNode *n4 = new (C) subL_rRegNode();
  n4->add_req(_in[0]);
  n4->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n4->set_opnd_array(1, opnd_array(0)->clone(C)); // dst
  if(tmp0 == this) {
    for(unsigned i = 0; i < num0; i++) {
      n4->add_req(_in[i + idx0]);
    }
  }
  else n4->add_req(tmp0);
  tmp0 = n4;
  n4->set_opnd_array(2, opnd_array(1)->clone(C)); // src
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n4->add_req(_in[i + idx1]);
    }
  }
  else n4->add_req(tmp1);
  result = n4->Expand( state, proj_list, mem );


  return result;
}

MachNode* modI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* modL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RAX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salI_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salI_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* salI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* salI_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salI_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarI_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarI_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarI_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarI_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrI_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrI_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrI_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrI_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* salL_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salL_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* salL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* salL_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* salL_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarL_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarL_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* sarL_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* sarL_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrL_rReg_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrL_mem_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* shrL_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* shrL_mem_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// shift
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* i2bNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// src
  unsigned num2 = opnd_array(2)->num_edges(); 	// twentyfour
  unsigned num3 = opnd_array(3)->num_edges(); 	// twentyfour
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* i2sNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// src
  unsigned num2 = opnd_array(2)->num_edges(); 	// sixteen
  unsigned num3 = opnd_array(3)->num_edges(); 	// sixteen
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* rolI_rReg_imm1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolI_rReg_imm8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolI_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolI_rReg_i1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolI_rReg_imm1Node *n0 = new (C) rolI_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_i1_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolI_rReg_imm1Node *n0 = new (C) rolI_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_i8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolI_rReg_imm8Node *n0 = new (C) rolI_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // lshift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_i8_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolI_rReg_imm8Node *n0 = new (C) rolI_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(4)->clone(C)); // lshift
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_Var_C0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolI_rReg_CLNode *n0 = new (C) rolI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_Var_C0_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolI_rReg_CLNode *n0 = new (C) rolI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_Var_C32Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolI_rReg_CLNode *n0 = new (C) rolI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolI_rReg_Var_C32_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolI_rReg_CLNode *n0 = new (C) rolI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_imm1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorI_rReg_imm8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorI_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorI_rReg_i1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorI_rReg_imm1Node *n0 = new (C) rorI_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_i1_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorI_rReg_imm1Node *n0 = new (C) rorI_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_i8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorI_rReg_imm8Node *n0 = new (C) rorI_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // rshift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_i8_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorI_rReg_imm8Node *n0 = new (C) rorI_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(4)->clone(C)); // rshift
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_Var_C0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorI_rReg_CLNode *n0 = new (C) rorI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_Var_C0_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorI_rReg_CLNode *n0 = new (C) rorI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_Var_C32Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorI_rReg_CLNode *n0 = new (C) rorI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorI_rReg_Var_C32_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorI_rReg_CLNode *n0 = new (C) rorI_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGI, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_imm1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolL_rReg_imm8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolL_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rolL_rReg_i1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolL_rReg_imm1Node *n0 = new (C) rolL_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_i1_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolL_rReg_imm1Node *n0 = new (C) rolL_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_i8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolL_rReg_imm8Node *n0 = new (C) rolL_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // lshift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_i8_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rolL_rReg_imm8Node *n0 = new (C) rolL_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(4)->clone(C)); // lshift
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_Var_C0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolL_rReg_CLNode *n0 = new (C) rolL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_Var_C0_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolL_rReg_CLNode *n0 = new (C) rolL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_Var_C64Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolL_rReg_CLNode *n0 = new (C) rolL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rolL_rReg_Var_C64_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rolL_rReg_CLNode *n0 = new (C) rolL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_imm1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorL_rReg_imm8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorL_rReg_CLNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rorL_rReg_i1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorL_rReg_imm1Node *n0 = new (C) rorL_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_i1_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorL_rReg_imm1Node *n0 = new (C) rorL_rReg_imm1Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_i8Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorL_rReg_imm8Node *n0 = new (C) rorL_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // rshift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_i8_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  MachNode *result = NULL;

  rorL_rReg_imm8Node *n0 = new (C) rorL_rReg_imm8Node();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RREGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(4)->clone(C)); // rshift
  if(tmp4 == this) {
    for(unsigned i = 0; i < num4; i++) {
      n0->add_req(_in[i + idx4]);
    }
  }
  else n0->add_req(tmp4);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_Var_C0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorL_rReg_CLNode *n0 = new (C) rorL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_Var_C0_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorL_rReg_CLNode *n0 = new (C) rorL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_Var_C64Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorL_rReg_CLNode *n0 = new (C) rorL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // shift
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* rorL_rReg_Var_C64_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = this;
  MachNode *tmp4 = this;
  MachNode *tmp5 = this;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned num3 = opnd_array(3)->num_edges();
  unsigned num4 = opnd_array(4)->num_edges();
  unsigned num5 = opnd_array(5)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  MachNode *result = NULL;

  rorL_rReg_CLNode *n0 = new (C) rorL_rReg_CLNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( NO_RCX_REGL, C ));
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  tmp1 = n0;
  n0->set_opnd_array(2, opnd_array(3)->clone(C)); // shift
  if(tmp3 == this) {
    for(unsigned i = 0; i < num3; i++) {
      n0->add_req(_in[i + idx3]);
    }
  }
  else n0->add_req(tmp3);
  result = n0->Expand( state, proj_list, mem );


  return result;
}

MachNode* andI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andI_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andI_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andI_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* andI_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* andI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orI_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orI_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orI_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orI_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorI_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorI_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorI_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorI_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorI_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorI_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* andL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andL_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andL_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* andL_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* andL_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* andL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_rReg_castP2XNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_rReg_castP2X_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* orL_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orL_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* orL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorL_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorL_rReg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorL_rReg_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorL_rReg_mem_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* xorL_mem_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorL_mem_rReg_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// src
  unsigned num3 = opnd_array(3)->num_edges(); 	// dst
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* xorL_mem_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// dst
  unsigned num2 = opnd_array(2)->num_edges(); 	// dst
  unsigned num3 = opnd_array(3)->num_edges(); 	// src
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  set_opnd_array(2, opnd_array(3)->clone(C)); // src
  for(unsigned i = 0; i < num3; i++) {
    set_req(i + idx2, _in[i + idx3]);
  }
  num2 = num3;
  idx3 = idx2 + num2;
  for(int i = idx4 - 1; i >= (int)idx3; i--) {
    del_req(i);
  }
  _num_opnds = 3;

  return this;
}

MachNode* convI2BNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* convP2BNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpLTMaskNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpLTMask0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cadd_cmpLTMaskNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// p
  unsigned num2 = opnd_array(2)->num_edges(); 	// q
  unsigned num3 = opnd_array(3)->num_edges(); 	// y
  unsigned num4 = opnd_array(4)->num_edges(); 	// p
  unsigned num5 = opnd_array(5)->num_edges(); 	// q
  unsigned num6 = opnd_array(6)->num_edges(); 	// tmp
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  unsigned idx7 = idx6 + num6;
  set_opnd_array(4, opnd_array(6)->clone(C)); // tmp
  for(unsigned i = 0; i < num6; i++) {
    set_req(i + idx4, _in[i + idx6]);
  }
  num4 = num6;
  idx5 = idx4 + num4;
  for(int i = idx7 - 1; i >= (int)idx5; i--) {
    del_req(i);
  }
  _num_opnds = 5;

  return this;
}

MachNode* cadd_cmpLTMask_1Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// p
  unsigned num2 = opnd_array(2)->num_edges(); 	// q
  unsigned num3 = opnd_array(3)->num_edges(); 	// p
  unsigned num4 = opnd_array(4)->num_edges(); 	// q
  unsigned num5 = opnd_array(5)->num_edges(); 	// y
  unsigned num6 = opnd_array(6)->num_edges(); 	// tmp
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  unsigned idx7 = idx6 + num6;
  set_opnd_array(3, opnd_array(5)->clone(C)); // y
  for(unsigned i = 0; i < num5; i++) {
    set_req(i + idx3, _in[i + idx5]);
  }
  num3 = num5;
  idx4 = idx3 + num3;
  set_opnd_array(4, opnd_array(6)->clone(C)); // tmp
  for(unsigned i = 0; i < num6; i++) {
    set_req(i + idx4, _in[i + idx6]);
  }
  num4 = num6;
  idx5 = idx4 + num4;
  for(int i = idx7 - 1; i >= (int)idx5; i--) {
    del_req(i);
  }
  _num_opnds = 5;

  return this;
}

MachNode* cadd_cmpLTMask_0Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// y
  unsigned num2 = opnd_array(2)->num_edges(); 	// p
  unsigned num3 = opnd_array(3)->num_edges(); 	// q
  unsigned num4 = opnd_array(4)->num_edges(); 	// p
  unsigned num5 = opnd_array(5)->num_edges(); 	// q
  unsigned num6 = opnd_array(6)->num_edges(); 	// tmp
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  unsigned idx7 = idx6 + num6;
  set_opnd_array(4, opnd_array(6)->clone(C)); // tmp
  for(unsigned i = 0; i < num6; i++) {
    set_req(i + idx4, _in[i + idx6]);
  }
  num4 = num6;
  idx5 = idx4 + num4;
  for(int i = idx7 - 1; i >= (int)idx5; i--) {
    del_req(i);
  }
  _num_opnds = 5;

  return this;
}

MachNode* cadd_cmpLTMask_2Node::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGI, C ));
  add_req(def);
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges(); 	// p
  unsigned num2 = opnd_array(2)->num_edges(); 	// q
  unsigned num3 = opnd_array(3)->num_edges(); 	// y
  unsigned num4 = opnd_array(4)->num_edges(); 	// p
  unsigned num5 = opnd_array(5)->num_edges(); 	// q
  unsigned num6 = opnd_array(6)->num_edges(); 	// tmp
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  unsigned idx4 = idx3 + num3;
  unsigned idx5 = idx4 + num4;
  unsigned idx6 = idx5 + num5;
  unsigned idx7 = idx6 + num6;
  set_opnd_array(4, opnd_array(6)->clone(C)); // tmp
  for(unsigned i = 0; i < num6; i++) {
    set_req(i + idx4, _in[i + idx6]);
  }
  num4 = num6;
  idx5 = idx4 + num4;
  for(int i = idx7 - 1; i >= (int)idx5; i--) {
    del_req(i);
  }
  _num_opnds = 5;

  return this;
}

MachNode* cmpF_cc_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmpF_cc_immCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmpD_cc_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmpD_cc_immCFNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmpF_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpF_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* cmpD_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpD_memNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* powD_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL rdx
  kill = new (C) MachProjNode( this, 2, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL rcx
  kill = new (C) MachProjNode( this, 3, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 4, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* expD_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rax
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL rdx
  kill = new (C) MachProjNode( this, 2, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL rcx
  kill = new (C) MachProjNode( this, 3, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 4, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* convF2I_reg_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* convF2L_reg_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* convD2I_reg_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* convD2L_reg_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* rep_stosNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cnt
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (LONG_RCX_REG_mask()), Op_RegL );
  proj_list.push(kill);
  // DEF/KILL base
  kill = new (C) MachProjNode( this, 2, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL zero
  kill = new (C) MachProjNode( this, 3, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 4, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* string_compareNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL str1
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt1
  kill = new (C) MachProjNode( this, 2, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL str2
  kill = new (C) MachProjNode( this, 3, (PTR_RSI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt2
  kill = new (C) MachProjNode( this, 4, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // TEMP tmp1
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 5, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* string_indexof_conNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL str1
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt1
  kill = new (C) MachProjNode( this, 2, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL str2
  kill = new (C) MachProjNode( this, 3, (PTR_RSI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // TEMP vec
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // DEF/KILL cnt2
  kill = new (C) MachProjNode( this, 4, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL tmp
  kill = new (C) MachProjNode( this, 5, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 6, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* string_indexofNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL str1
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt1
  kill = new (C) MachProjNode( this, 2, (INT_RDX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL str2
  kill = new (C) MachProjNode( this, 3, (PTR_RSI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt2
  kill = new (C) MachProjNode( this, 4, (INT_RAX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // TEMP vec
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // DEF/KILL tmp
  kill = new (C) MachProjNode( this, 5, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 6, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* string_equalsNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL str1
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL str2
  kill = new (C) MachProjNode( this, 2, (PTR_RSI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL cnt
  kill = new (C) MachProjNode( this, 3, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // TEMP tmp1
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // TEMP tmp2
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // DEF/KILL tmp3
  kill = new (C) MachProjNode( this, 4, (INT_RBX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 5, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* array_equalsNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL ary1
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // DEF/KILL ary2
  kill = new (C) MachProjNode( this, 2, (PTR_RSI_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // TEMP tmp1
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // TEMP tmp2
  def = new (C) MachTempNode(state->MachOperGenerator( REGD, C ));
  add_req(def);
  // DEF/KILL tmp3
  kill = new (C) MachProjNode( this, 3, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL tmp4
  kill = new (C) MachProjNode( this, 4, (INT_RBX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 5, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* cmpL3_reg_regNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL flags
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* minI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachOper *op0 = new (C) rFlagsRegOper();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = NULL;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  MachNode *result = NULL;

  compI_rRegNode *n0 = new (C) compI_rRegNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RFLAGSREG, C ));
  tmp3 = n0;
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // src
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );

  cmovI_reg_gNode *n1 = new (C) cmovI_reg_gNode();
  n1->add_req(_in[0]);
  n1->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n1->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n1->add_req(_in[i + idx1]);
    }
  }
  else n1->add_req(tmp1);
  tmp1 = n1;
  n1->set_opnd_array(2, opnd_array(2)->clone(C)); // src
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n1->add_req(_in[i + idx2]);
    }
  }
  else n1->add_req(tmp2);
  n1->set_opnd_array(3, op0->clone(C)); // cr
  if(tmp3 != NULL)
    n1->add_req(tmp3);
  result = n1->Expand( state, proj_list, mem );


  return result;
}

MachNode* maxI_rRegNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  MachOper *op0 = new (C) rFlagsRegOper();
  MachNode *tmp0 = this;
  MachNode *tmp1 = this;
  MachNode *tmp2 = this;
  MachNode *tmp3 = NULL;
  unsigned num0 = 0;
  unsigned num1 = opnd_array(1)->num_edges();
  unsigned num2 = opnd_array(2)->num_edges();
  unsigned idx0 = oper_input_base();
  unsigned idx1 = idx0 + num0;
  unsigned idx2 = idx1 + num1;
  unsigned idx3 = idx2 + num2;
  MachNode *result = NULL;

  compI_rRegNode *n0 = new (C) compI_rRegNode();
  n0->add_req(_in[0]);
  n0->set_opnd_array(0, state->MachOperGenerator( RFLAGSREG, C ));
  tmp3 = n0;
  n0->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n0->add_req(_in[i + idx1]);
    }
  }
  else n0->add_req(tmp1);
  n0->set_opnd_array(2, opnd_array(2)->clone(C)); // src
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n0->add_req(_in[i + idx2]);
    }
  }
  else n0->add_req(tmp2);
  result = n0->Expand( state, proj_list, mem );

  cmovI_reg_lNode *n1 = new (C) cmovI_reg_lNode();
  n1->add_req(_in[0]);
  n1->set_opnd_array(0, state->MachOperGenerator( RREGI, C ));
  n1->set_opnd_array(1, opnd_array(1)->clone(C)); // dst
  if(tmp1 == this) {
    for(unsigned i = 0; i < num1; i++) {
      n1->add_req(_in[i + idx1]);
    }
  }
  else n1->add_req(tmp1);
  tmp1 = n1;
  n1->set_opnd_array(2, opnd_array(2)->clone(C)); // src
  if(tmp2 == this) {
    for(unsigned i = 0; i < num2; i++) {
      n1->add_req(_in[i + idx2]);
    }
  }
  else n1->add_req(tmp2);
  n1->set_opnd_array(3, op0->clone(C)); // cr
  if(tmp3 != NULL)
    n1->add_req(tmp3);
  result = n1->Expand( state, proj_list, mem );


  return result;
}

MachNode* partialSubtypeCheckNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rcx
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL cr
  kill = new (C) MachProjNode( this, 2, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* partialSubtypeCheck_vs_ZeroNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL rcx
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_RCX_REG_mask()), Op_RegI );
  proj_list.push(kill);
  // DEF/KILL result
  kill = new (C) MachProjNode( this, 2, (PTR_RDI_REG_mask()), Op_RegP );
  proj_list.push(kill);

  return this;
}

MachNode* cmpFastLockNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL box
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RBX_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RAX_REGI, C ));
  add_req(def);
  // TEMP scr
  def = new (C) MachTempNode(state->MachOperGenerator( RREGP, C ));
  add_req(def);

  return this;
}

MachNode* cmpFastUnlockNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL box
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (PTR_RAX_REG_mask()), Op_RegP );
  proj_list.push(kill);
  // TEMP tmp
  MachTempNode *def;
  def = new (C) MachTempNode(state->MachOperGenerator( RREGP, C ));
  add_req(def);

  return this;
}

MachNode* safePoint_pollNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* safePoint_poll_farNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  // Add projection edges for additional defs or kills
  // DEF/KILL cr
  MachProjNode *kill;
  kill = new (C) MachProjNode( this, 1, (INT_FLAGS_mask()), Op_RegFlags );
  proj_list.push(kill);

  return this;
}

MachNode* addF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* addF_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* addD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* addD_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* subF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* subF_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* subD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* subD_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* mulF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* mulF_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* mulD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* mulD_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* divF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* divF_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* divD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* divD_reg_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* sqrtF_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* sqrtD_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl4B_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl8B_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl16B_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl32B_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl2S_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl4S_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl8S_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl16S_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl2I_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl4I_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl8I_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl2L_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
}

MachNode* Repl4L_immNode::Expand(State* state, Node_List& proj_list, Node* mem) {
  Compile* C = Compile::current();
  add_req(C->mach_constant_base_node());

  return this;
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
