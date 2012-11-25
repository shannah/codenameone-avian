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
MachNode *loadINode::peephole( Block *block, int block_index, PhaseRegAlloc *ra_, int &deleted, Compile* C ) {
  bool  matches = true;
  MachNode *inst0 = this;
  MachNode *inst1 = NULL;
  if( (OptoPeepholeAt == -1) || (OptoPeepholeAt==0) ) {
    matches = true;
  // Check instruction sub-tree
  // Identify previous instruction if inside this block
  if( block_index - 1 > 0 ) {
    Node *n = block->_nodes.at(block_index - 1);
    inst1 = (n->is_Mach()) ? n->as_Mach() : NULL;
  }
  matches = matches && (inst1 != NULL) && (inst1->rule() == storeI_rule);
    // If instruction subtree matches
    if( matches ) {

      // Check constraints on sub-tree-leaves
      // Build map to register info
  // Start at oper_input_base() and count operands
  unsigned inst0_idx0 = 2;
  unsigned inst0_idx1 = 2; 	// mem
  unsigned inst0_idx2 = inst0->req(); 
  // Start at oper_input_base() and count operands
  unsigned inst1_idx0 = 2;
  unsigned inst1_idx1 = 2; 	// mem
  unsigned inst1_idx2 = inst1_idx1 + inst1->_opnds[1]->num_edges(); 	// src
  unsigned inst1_idx3 = inst1->req(); 
      matches = matches &&
        (inst1->_opnds[2]->reg(ra_,inst1,inst1_idx2)  /* 1.src */ == /* 0.dst */ inst0->_opnds[0]->reg(ra_,inst0))
      && ( 
  (inst1->_opnds[1]->base(ra_,inst1,inst1_idx1)  /* 1.mem$$base */ == /* 0.mem$$base */ inst0->_opnds[1]->base(ra_,inst0,inst0_idx1)) &&
  (inst1->_opnds[1]->index(ra_,inst1,inst1_idx1)  /* 1.mem$$index */ == /* 0.mem$$index */ inst0->_opnds[1]->index(ra_,inst0,inst0_idx1)) &&
  (inst1->_opnds[1]->scale()  /* 1.mem$$scale */ == /* 0.mem$$scale */ inst0->_opnds[1]->scale()) &&
  (inst1->_opnds[1]->disp(ra_,inst1,inst1_idx1)  /* 1.mem$$disp */ == /* 0.mem$$disp */ inst0->_opnds[1]->disp(ra_,inst0,inst0_idx1))
) 
;
      // IF instructions and constraints matched
      if( matches ) {
        // generate the new sub-tree
        assert( true, "Debug stopping point");
        storeINode *root = new (C) storeINode();
        // ----- Initial setup -----
        root->add_req(_in[0]);                // control edge
        root->add_req(inst1->in(1));        // unmatched ideal edge
        root->_bottom_type = inst1->bottom_type();
        ra_->add_reference(root, inst1);
        ra_->set_oop (root, ra_->is_oop(inst1));
        ra_->set_pair(root->_idx, ra_->get_reg_second(inst1), ra_->get_reg_first(inst1));
        root->_opnds[0] = inst1->_opnds[0]->clone(C); // result
        // ----- Done with initial setup -----
        for( unsigned x1 = inst1_idx1; x1 < inst1_idx2; x1++ )
          root->add_req( inst1->in(x1) );
        root->_opnds[1] = inst1->_opnds[1]->clone(C);
        for( unsigned x2 = inst1_idx2; x2 < inst1_idx3; x2++ )
          root->add_req( inst1->in(x2) );
        root->_opnds[2] = inst1->_opnds[2]->clone(C);
        deleted = 2;
        return root;  // return new root;
      }
    }
  } // end of peephole rule #0

  return NULL;  // No peephole rules matched
}

MachNode *loadLNode::peephole( Block *block, int block_index, PhaseRegAlloc *ra_, int &deleted, Compile* C ) {
  bool  matches = true;
  MachNode *inst0 = this;
  MachNode *inst1 = NULL;
  if( (OptoPeepholeAt == -1) || (OptoPeepholeAt==1) ) {
    matches = true;
  // Check instruction sub-tree
  // Identify previous instruction if inside this block
  if( block_index - 1 > 0 ) {
    Node *n = block->_nodes.at(block_index - 1);
    inst1 = (n->is_Mach()) ? n->as_Mach() : NULL;
  }
  matches = matches && (inst1 != NULL) && (inst1->rule() == storeL_rule);
    // If instruction subtree matches
    if( matches ) {

      // Check constraints on sub-tree-leaves
      // Build map to register info
  // Start at oper_input_base() and count operands
  unsigned inst0_idx0 = 2;
  unsigned inst0_idx1 = 2; 	// mem
  unsigned inst0_idx2 = inst0->req(); 
  // Start at oper_input_base() and count operands
  unsigned inst1_idx0 = 2;
  unsigned inst1_idx1 = 2; 	// mem
  unsigned inst1_idx2 = inst1_idx1 + inst1->_opnds[1]->num_edges(); 	// src
  unsigned inst1_idx3 = inst1->req(); 
      matches = matches &&
        (inst1->_opnds[2]->reg(ra_,inst1,inst1_idx2)  /* 1.src */ == /* 0.dst */ inst0->_opnds[0]->reg(ra_,inst0))
      && ( 
  (inst1->_opnds[1]->base(ra_,inst1,inst1_idx1)  /* 1.mem$$base */ == /* 0.mem$$base */ inst0->_opnds[1]->base(ra_,inst0,inst0_idx1)) &&
  (inst1->_opnds[1]->index(ra_,inst1,inst1_idx1)  /* 1.mem$$index */ == /* 0.mem$$index */ inst0->_opnds[1]->index(ra_,inst0,inst0_idx1)) &&
  (inst1->_opnds[1]->scale()  /* 1.mem$$scale */ == /* 0.mem$$scale */ inst0->_opnds[1]->scale()) &&
  (inst1->_opnds[1]->disp(ra_,inst1,inst1_idx1)  /* 1.mem$$disp */ == /* 0.mem$$disp */ inst0->_opnds[1]->disp(ra_,inst0,inst0_idx1))
) 
;
      // IF instructions and constraints matched
      if( matches ) {
        // generate the new sub-tree
        assert( true, "Debug stopping point");
        storeLNode *root = new (C) storeLNode();
        // ----- Initial setup -----
        root->add_req(_in[0]);                // control edge
        root->add_req(inst1->in(1));        // unmatched ideal edge
        root->_bottom_type = inst1->bottom_type();
        ra_->add_reference(root, inst1);
        ra_->set_oop (root, ra_->is_oop(inst1));
        ra_->set_pair(root->_idx, ra_->get_reg_second(inst1), ra_->get_reg_first(inst1));
        root->_opnds[0] = inst1->_opnds[0]->clone(C); // result
        // ----- Done with initial setup -----
        for( unsigned x1 = inst1_idx1; x1 < inst1_idx2; x1++ )
          root->add_req( inst1->in(x1) );
        root->_opnds[1] = inst1->_opnds[1]->clone(C);
        for( unsigned x2 = inst1_idx2; x2 < inst1_idx3; x2++ )
          root->add_req( inst1->in(x2) );
        root->_opnds[2] = inst1->_opnds[2]->clone(C);
        deleted = 2;
        return root;  // return new root;
      }
    }
  } // end of peephole rule #1

  return NULL;  // No peephole rules matched
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
