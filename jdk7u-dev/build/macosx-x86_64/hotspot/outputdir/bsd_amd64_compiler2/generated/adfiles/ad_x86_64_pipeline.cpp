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

//------------------Pipeline Methods-----------------------------------------
#ifndef PRODUCT
const char * Pipeline::stageName(uint s) {
  static const char * const _stage_names[] = {
    "undefined", "S0", "S1", "S2", "S3", "S4", "S5"
  };

  return (s <= 6 ? _stage_names[s] : "???");
}
#endif

uint Pipeline::functional_unit_latency(uint start, const Pipeline *pred) const {
  // See if the functional units overlap
  uint mask = resourcesUsedExclusively() & pred->resourcesUsedExclusively();
  if (mask == 0)
    return (start);

  for (uint i = 0; i < pred->resourceUseCount(); i++) {
    const Pipeline_Use_Element *predUse = pred->resourceUseElement(i);
    if (predUse->multiple())
      continue;

    for (uint j = 0; j < resourceUseCount(); j++) {
      const Pipeline_Use_Element *currUse = resourceUseElement(j);
      if (currUse->multiple())
        continue;

      if (predUse->used() & currUse->used()) {
        Pipeline_Use_Cycle_Mask x = predUse->mask();
        Pipeline_Use_Cycle_Mask y = currUse->mask();

        for ( y <<= start; x.overlaps(y); start++ )
          y <<= 1;
      }
    }
  }

  // There is the potential for overlap
  return (start);
}

// The following two routines assume that the root Pipeline_Use entity
// consists of exactly 1 element for each functional unit
// start is relative to the current cycle; used for latency-based info
uint Pipeline_Use::full_latency(uint delay, const Pipeline_Use &pred) const {
  for (uint i = 0; i < pred._count; i++) {
    const Pipeline_Use_Element *predUse = pred.element(i);
    if (predUse->_multiple) {
      uint min_delay = 7;
      // Multiple possible functional units, choose first unused one
      for (uint j = predUse->_lb; j <= predUse->_ub; j++) {
        const Pipeline_Use_Element *currUse = element(j);
        uint curr_delay = delay;
        if (predUse->_used & currUse->_used) {
          Pipeline_Use_Cycle_Mask x = predUse->_mask;
          Pipeline_Use_Cycle_Mask y = currUse->_mask;

          for ( y <<= curr_delay; x.overlaps(y); curr_delay++ )
            y <<= 1;
        }
        if (min_delay > curr_delay)
          min_delay = curr_delay;
      }
      if (delay < min_delay)
      delay = min_delay;
    }
    else {
      for (uint j = predUse->_lb; j <= predUse->_ub; j++) {
        const Pipeline_Use_Element *currUse = element(j);
        if (predUse->_used & currUse->_used) {
          Pipeline_Use_Cycle_Mask x = predUse->_mask;
          Pipeline_Use_Cycle_Mask y = currUse->_mask;

          for ( y <<= delay; x.overlaps(y); delay++ )
            y <<= 1;
        }
      }
    }
  }

  return (delay);
}

void Pipeline_Use::add_usage(const Pipeline_Use &pred) {
  for (uint i = 0; i < pred._count; i++) {
    const Pipeline_Use_Element *predUse = pred.element(i);
    if (predUse->_multiple) {
      // Multiple possible functional units, choose first unused one
      for (uint j = predUse->_lb; j <= predUse->_ub; j++) {
        Pipeline_Use_Element *currUse = element(j);
        if ( !predUse->_mask.overlaps(currUse->_mask) ) {
          currUse->_used |= (1 << j);
          _resources_used |= (1 << j);
          currUse->_mask.Or(predUse->_mask);
          break;
        }
      }
    }
    else {
      for (uint j = predUse->_lb; j <= predUse->_ub; j++) {
        Pipeline_Use_Element *currUse = element(j);
        currUse->_used |= (1 << j);
        _resources_used |= (1 << j);
        currUse->_mask.Or(predUse->_mask);
      }
    }
  }
}

uint Pipeline::operand_latency(uint opnd, const Pipeline *pred) const {
  int const default_latency = 1;

  assert(this, "NULL pipeline info");
  assert(pred, "NULL predecessor pipline info");

  if (pred->hasFixedLatency())
    return (pred->fixedLatency());

  // If this is not an operand, then assume a dependence with 0 latency
  if (opnd > _read_stage_count)
    return (0);

  uint writeStage = pred->_write_stage;
  uint readStage  = _read_stages[opnd-1];

  if (writeStage == stage_undefined || readStage == stage_undefined)
    return (default_latency);

  int delta = writeStage - readStage;
  if (delta < 0) delta = 0;

  return (delta);
}

Pipeline_Use_Cycle_Mask operator&(const Pipeline_Use_Cycle_Mask &in1, const Pipeline_Use_Cycle_Mask &in2) {
  return Pipeline_Use_Cycle_Mask(in1._mask & in2._mask);
}

Pipeline_Use_Cycle_Mask operator|(const Pipeline_Use_Cycle_Mask &in1, const Pipeline_Use_Cycle_Mask &in2) {
  return Pipeline_Use_Cycle_Mask(in1._mask | in2._mask);
}

static const Pipeline pipeline_class_Zero_Instructions(0, 0, true, 0, 0, false, false, false, false, NULL, NULL, NULL, Pipeline_Use(0, 0, 0, NULL));

static const Pipeline pipeline_class_Unknown_Instructions(0, 0, true, 0, 0, false, true, true, false, NULL, NULL, NULL, Pipeline_Use(0, 0, 0, NULL));

const Pipeline_Use_Element Pipeline_Use::elaborated_elements[11] = {
  Pipeline_Use_Element(0, 0, 0, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 1, 1, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 2, 2, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 3, 3, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 4, 4, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 5, 5, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 6, 6, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 7, 7, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 8, 8, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 9, 9, false, Pipeline_Use_Cycle_Mask(0)),
  Pipeline_Use_Element(0, 10, 10, false, Pipeline_Use_Cycle_Mask(0))
};

const Pipeline_Use Pipeline_Use::elaborated_use(0, 0, 11, (Pipeline_Use_Element *)&elaborated_elements[0]);


// Pipeline Class "ialu_reg"
static const enum machPipelineStages pipeline_reads_001[1] = {
  stage_S3 
};

static const enum machPipelineStages pipeline_res_stages_001[11] = {
  stage_S0,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_S3,        // BR
  stage_S3,        // FPU
  stage_S3         // ALU0
};

static const uint pipeline_res_cycles_001[11] = {
  1, // D0
  1, // D1
  1, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  1, // BR
  1, // FPU
  1  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_001[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_001((uint)stage_undefined, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_001,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_001[0]));

// Pipeline Class "ialu_reg_long"
static const uint pipeline_res_cycles_002[11] = {
  2, // D0
  2, // D1
  2, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  2, // BR
  2, // FPU
  2  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_002[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_002((uint)stage_undefined, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_002,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_002[0]));

// Pipeline Class "ialu_reg_fat"
static const enum machPipelineStages pipeline_res_stages_002[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_S3,        // BR
  stage_S3,        // FPU
  stage_S3         // ALU0
};

static const uint pipeline_res_cycles_003[11] = {
  1, // D0
  0, // D1
  0, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  1, // BR
  1, // FPU
  1  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_003[2] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_003((uint)stage_undefined, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_002,
  (uint * const) pipeline_res_cycles_003,
  Pipeline_Use(0x701, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_003[0]));

// Pipeline Class "ialu_reg_long_fat"
static const uint pipeline_res_cycles_004[11] = {
  2, // D0
  0, // D1
  0, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  2, // BR
  2, // FPU
  2  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_004[2] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_004((uint)stage_undefined, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_002,
  (uint * const) pipeline_res_cycles_004,
  Pipeline_Use(0x701, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_004[0]));

// Pipeline Class "ialu_reg_reg"
static const Pipeline pipeline_class_005((uint)stage_S4, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_001,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_001[0]));

// Pipeline Class "ialu_reg_reg_long"
static const Pipeline pipeline_class_006((uint)stage_S4, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_002,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_002[0]));

// Pipeline Class "ialu_reg_reg_fat"
static const Pipeline pipeline_class_007((uint)stage_S4, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_002,
  (uint * const) pipeline_res_cycles_003,
  Pipeline_Use(0x701, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_003[0]));

// Pipeline Class "ialu_reg_reg_long_fat"
static const Pipeline pipeline_class_008((uint)stage_S4, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_002,
  (uint * const) pipeline_res_cycles_004,
  Pipeline_Use(0x701, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_004[0]));

// Pipeline Class "ialu_reg_mem"
static const enum machPipelineStages pipeline_res_stages_003[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_S4,        // BR
  stage_S4,        // FPU
  stage_S4         // ALU0
};

static const uint pipeline_res_cycles_005[11] = {
  1, // D0
  0, // D1
  0, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  0, // MEM
  1, // BR
  1, // FPU
  1  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_005[3] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_009((uint)stage_S5, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_003,
  (uint * const) pipeline_res_cycles_005,
  Pipeline_Use(0x739, 0x001,  3, (Pipeline_Use_Element *)&pipeline_res_mask_005[0]));

// Pipeline Class "ialu_mem"
static const enum machPipelineStages pipeline_res_stages_004[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_006[11] = {
  1, // D0
  0, // D1
  0, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_006[2] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_010((uint)stage_undefined, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_004,
  (uint * const) pipeline_res_cycles_006,
  Pipeline_Use(0x039, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_006[0]));

// Pipeline Class "ialu_mem_reg"
static const enum machPipelineStages pipeline_reads_002[2] = {
  stage_S3,
  stage_S5 
};

static const Pipeline pipeline_class_011((uint)stage_undefined, 2, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_002,
   (enum machPipelineStages * const) pipeline_res_stages_003,
  (uint * const) pipeline_res_cycles_005,
  Pipeline_Use(0x739, 0x001,  3, (Pipeline_Use_Element *)&pipeline_res_mask_005[0]));

// Pipeline Class "ialu_mem_imm"
static const Pipeline pipeline_class_012((uint)stage_undefined, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_003,
  (uint * const) pipeline_res_cycles_005,
  Pipeline_Use(0x739, 0x001,  3, (Pipeline_Use_Element *)&pipeline_res_mask_005[0]));

// Pipeline Class "ialu_reg_reg_alu0"
static const enum machPipelineStages pipeline_res_stages_005[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_S3,        // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_007[11] = {
  1, // D0
  0, // D1
  0, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  1, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_007[2] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x100, 8, 8, false, Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_013((uint)stage_S4, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_005,
  (uint * const) pipeline_res_cycles_007,
  Pipeline_Use(0x101, 0x101,  2, (Pipeline_Use_Element *)&pipeline_res_mask_007[0]));

// Pipeline Class "ialu_reg_mem_alu0"
static const enum machPipelineStages pipeline_res_stages_006[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_S4,        // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_008[11] = {
  1, // D0
  0, // D1
  0, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  0, // MEM
  1, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_008[3] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x100, 8, 8, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_014((uint)stage_S5, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_006,
  (uint * const) pipeline_res_cycles_008,
  Pipeline_Use(0x139, 0x101,  3, (Pipeline_Use_Element *)&pipeline_res_mask_008[0]));

// Pipeline Class "ialu_cr_reg_reg"
static const enum machPipelineStages pipeline_reads_003[2] = {
  stage_S3,
  stage_S3 
};

static const Pipeline pipeline_class_015((uint)stage_S4, 2, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_003,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_001,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_001[0]));

// Pipeline Class "ialu_cr_reg_imm"
static const Pipeline pipeline_class_016((uint)stage_S4, 1, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_001,
  (uint * const) pipeline_res_cycles_001,
  Pipeline_Use(0x707, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_001[0]));

// Pipeline Class "ialu_cr_reg_mem"
static const Pipeline pipeline_class_017((uint)stage_S4, 2, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_003,
   (enum machPipelineStages * const) pipeline_res_stages_003,
  (uint * const) pipeline_res_cycles_005,
  Pipeline_Use(0x739, 0x001,  3, (Pipeline_Use_Element *)&pipeline_res_mask_005[0]));

// Pipeline Class "pipe_cmplt"
static const enum machPipelineStages pipeline_reads_004[3] = {
  stage_S3,
  stage_S3,
  stage_S4 
};

static const enum machPipelineStages pipeline_res_stages_007[11] = {
  stage_S0,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_009[11] = {
  4, // D0
  4, // D1
  4, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_009[1] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000008)) 
};

static const Pipeline pipeline_class_018((uint)stage_undefined, 3, false, 0, 4, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_004,
   (enum machPipelineStages * const) pipeline_res_stages_007,
  (uint * const) pipeline_res_cycles_009,
  Pipeline_Use(0x007, 0x000,  1, (Pipeline_Use_Element *)&pipeline_res_mask_009[0]));

// Pipeline Class "pipe_cmov_reg"
static const uint pipeline_res_cycles_010[11] = {
  1, // D0
  1, // D1
  1, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_010[1] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000001)) 
};

static const Pipeline pipeline_class_019((uint)stage_S4, 2, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_003,
   (enum machPipelineStages * const) pipeline_res_stages_007,
  (uint * const) pipeline_res_cycles_010,
  Pipeline_Use(0x007, 0x000,  1, (Pipeline_Use_Element *)&pipeline_res_mask_010[0]));

// Pipeline Class "pipe_cmov_mem"
static const enum machPipelineStages pipeline_reads_005[3] = {
  stage_S3,
  stage_S4,
  stage_S3 
};

static const enum machPipelineStages pipeline_res_stages_008[11] = {
  stage_S0,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_011[11] = {
  1, // D0
  1, // D1
  1, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_011[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_020((uint)stage_S4, 3, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_005,
   (enum machPipelineStages * const) pipeline_res_stages_008,
  (uint * const) pipeline_res_cycles_011,
  Pipeline_Use(0x03f, 0x000,  2, (Pipeline_Use_Element *)&pipeline_res_mask_011[0]));

// Pipeline Class "pipe_cmov_reg_long"
static const uint pipeline_res_cycles_012[11] = {
  2, // D0
  2, // D1
  2, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_012[1] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000002)) 
};

static const Pipeline pipeline_class_021((uint)stage_S4, 3, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_005,
   (enum machPipelineStages * const) pipeline_res_stages_007,
  (uint * const) pipeline_res_cycles_012,
  Pipeline_Use(0x007, 0x000,  1, (Pipeline_Use_Element *)&pipeline_res_mask_012[0]));

// Pipeline Class "fpu_reg"
static const enum machPipelineStages pipeline_res_stages_009[11] = {
  stage_S0,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_S3,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_013[11] = {
  2, // D0
  2, // D1
  2, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  1, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_013[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_022((uint)stage_undefined, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_009,
  (uint * const) pipeline_res_cycles_013,
  Pipeline_Use(0x087, 0x080,  2, (Pipeline_Use_Element *)&pipeline_res_mask_013[0]));

// Pipeline Class "fpu_reg_reg"
static const Pipeline pipeline_class_023((uint)stage_S4, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_009,
  (uint * const) pipeline_res_cycles_013,
  Pipeline_Use(0x087, 0x080,  2, (Pipeline_Use_Element *)&pipeline_res_mask_013[0]));

// Pipeline Class "fpu_reg_reg_reg"
static const uint pipeline_res_cycles_014[11] = {
  3, // D0
  3, // D1
  3, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  2, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_014[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000004)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_024((uint)stage_S4, 2, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_003,
   (enum machPipelineStages * const) pipeline_res_stages_009,
  (uint * const) pipeline_res_cycles_014,
  Pipeline_Use(0x087, 0x080,  2, (Pipeline_Use_Element *)&pipeline_res_mask_014[0]));

// Pipeline Class "fpu_reg_reg_reg_reg"
static const enum machPipelineStages pipeline_reads_006[3] = {
  stage_S3,
  stage_S3,
  stage_S3 
};

static const uint pipeline_res_cycles_015[11] = {
  4, // D0
  4, // D1
  4, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  2, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_015[2] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000008)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_025((uint)stage_S4, 3, false, 0, 4, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_006,
   (enum machPipelineStages * const) pipeline_res_stages_009,
  (uint * const) pipeline_res_cycles_015,
  Pipeline_Use(0x087, 0x080,  2, (Pipeline_Use_Element *)&pipeline_res_mask_015[0]));

// Pipeline Class "fpu_reg_mem_reg_reg"
static const enum machPipelineStages pipeline_res_stages_010[11] = {
  stage_S1,        // D0
  stage_S1,        // D1
  stage_S1,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_S3,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_016[11] = {
  3, // D0
  3, // D1
  3, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  2, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_016[4] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x00000007)),
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x0000000c)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_026((uint)stage_S4, 3, false, 0, 4, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_006,
   (enum machPipelineStages * const) pipeline_res_stages_010,
  (uint * const) pipeline_res_cycles_016,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_016[0]));

// Pipeline Class "fpu_reg_mem"
static const enum machPipelineStages pipeline_res_stages_011[11] = {
  stage_S1,        // D0
  stage_S1,        // D1
  stage_S1,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_S4,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_017[11] = {
  1, // D0
  1, // D1
  1, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  1, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_017[4] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x00000001)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_027((uint)stage_S5, 1, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_011,
  (uint * const) pipeline_res_cycles_017,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_017[0]));

// Pipeline Class "fpu_reg_reg_mem"
static const uint pipeline_res_cycles_018[11] = {
  2, // D0
  2, // D1
  2, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  0, // MS2
  1, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_018[4] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x00000003)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_028((uint)stage_S5, 2, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_003,
   (enum machPipelineStages * const) pipeline_res_stages_011,
  (uint * const) pipeline_res_cycles_018,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_018[0]));

// Pipeline Class "fpu_mem_reg"
static const enum machPipelineStages pipeline_res_stages_012[11] = {
  stage_S1,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_S4,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_019[4] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x00000001)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_029((uint)stage_undefined, 2, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_002,
   (enum machPipelineStages * const) pipeline_res_stages_012,
  (uint * const) pipeline_res_cycles_017,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_019[0]));

// Pipeline Class "fpu_mem_reg_reg"
static const Pipeline_Use_Element pipeline_res_mask_020[4] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x00000001)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_030((uint)stage_undefined, 3, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_006,
   (enum machPipelineStages * const) pipeline_res_stages_012,
  (uint * const) pipeline_res_cycles_018,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_020[0]));

// Pipeline Class "fpu_mem_reg_mem"
static const enum machPipelineStages pipeline_reads_007[3] = {
  stage_S4,
  stage_S3,
  stage_S3 
};

static const enum machPipelineStages pipeline_res_stages_013[11] = {
  stage_S0,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_S4,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_019[11] = {
  2, // D0
  1, // D1
  1, // D2
  2, // DECODE
  2, // MS0
  2, // MS1
  0, // MS2
  1, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_021[4] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000001)),
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_031((uint)stage_undefined, 3, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_007,
   (enum machPipelineStages * const) pipeline_res_stages_013,
  (uint * const) pipeline_res_cycles_019,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_021[0]));

// Pipeline Class "fpu_mem_mem"
static const enum machPipelineStages pipeline_reads_008[2] = {
  stage_S4,
  stage_S3 
};

static const uint pipeline_res_cycles_020[11] = {
  2, // D0
  0, // D1
  0, // D2
  2, // DECODE
  2, // MS0
  2, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_022[2] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000002)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x0000000c)) 
};

static const Pipeline pipeline_class_032((uint)stage_undefined, 2, false, 0, 2, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_008,
   (enum machPipelineStages * const) pipeline_res_stages_004,
  (uint * const) pipeline_res_cycles_020,
  Pipeline_Use(0x039, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_022[0]));

// Pipeline Class "fpu_mem_mem_mem"
static const enum machPipelineStages pipeline_res_stages_014[11] = {
  stage_S0,        // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_undefined, // MS2
  stage_S4,        // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_021[11] = {
  3, // D0
  0, // D1
  0, // D2
  3, // DECODE
  3, // MS0
  3, // MS1
  0, // MS2
  1, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_023[3] = {
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x80000004)),
  Pipeline_Use_Element(0x080, 7, 7, false, Pipeline_Use_Cycle_Mask(0x00000008)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x0000001c)) 
};

static const Pipeline pipeline_class_033((uint)stage_undefined, 3, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_007,
   (enum machPipelineStages * const) pipeline_res_stages_014,
  (uint * const) pipeline_res_cycles_021,
  Pipeline_Use(0x0b9, 0x081,  3, (Pipeline_Use_Element *)&pipeline_res_mask_023[0]));

// Pipeline Class "fpu_mem_reg_con"
static const enum machPipelineStages pipeline_reads_009[2] = {
  stage_S4,
  stage_S4 
};

static const Pipeline pipeline_class_034((uint)stage_undefined, 2, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_009,
   (enum machPipelineStages * const) pipeline_res_stages_013,
  (uint * const) pipeline_res_cycles_019,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_021[0]));

// Pipeline Class "fpu_reg_con"
static const Pipeline pipeline_class_035((uint)stage_S5, 0, false, 0, 2, false, false, false, false,
 NULL,  (enum machPipelineStages * const) pipeline_res_stages_011,
  (uint * const) pipeline_res_cycles_017,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_017[0]));

// Pipeline Class "fpu_reg_reg_con"
static const Pipeline pipeline_class_036((uint)stage_S5, 1, false, 0, 3, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_011,
  (uint * const) pipeline_res_cycles_018,
  Pipeline_Use(0x0bf, 0x081,  4, (Pipeline_Use_Element *)&pipeline_res_mask_018[0]));

// Pipeline Class "pipe_jmp"
static const enum machPipelineStages pipeline_res_stages_015[11] = {
  stage_undefined, // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_S3,        // MS2
  stage_undefined, // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_022[11] = {
  0, // D0
  0, // D1
  0, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  1, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_024[1] = {
  Pipeline_Use_Element(0x040, 6, 6, false, Pipeline_Use_Cycle_Mask(0x00000004)) 
};

static const Pipeline pipeline_class_037((uint)stage_undefined, 0, false, 0, 1, false, false, false, false,
 NULL,  (enum machPipelineStages * const) pipeline_res_stages_015,
  (uint * const) pipeline_res_cycles_022,
  Pipeline_Use(0x040, 0x040,  1, (Pipeline_Use_Element *)&pipeline_res_mask_024[0]));

// Pipeline Class "pipe_jcc"
static const enum machPipelineStages pipeline_reads_010[2] = {
  stage_S1,
  stage_undefined 
};

static const Pipeline pipeline_class_038((uint)stage_undefined, 2, false, 0, 1, false, false, false, false,

  (enum machPipelineStages * const) pipeline_reads_010,
   (enum machPipelineStages * const) pipeline_res_stages_015,
  (uint * const) pipeline_res_cycles_022,
  Pipeline_Use(0x040, 0x040,  1, (Pipeline_Use_Element *)&pipeline_res_mask_024[0]));

// Pipeline Class "pipe_cmpxchg"
static const enum machPipelineStages pipeline_res_stages_016[11] = {
  stage_S2,        // D0
  stage_S0,        // D1
  stage_S0,        // D2
  stage_S3,        // DECODE
  stage_S3,        // MS0
  stage_S3,        // MS1
  stage_S5,        // MS2
  stage_undefined, // MEM
  stage_S3,        // BR
  stage_S3,        // FPU
  stage_S3         // ALU0
};

static const uint pipeline_res_cycles_023[11] = {
  3, // D0
  3, // D1
  3, // D2
  1, // DECODE
  1, // MS0
  1, // MS1
  1, // MS2
  0, // MEM
  2, // BR
  2, // FPU
  2  // ALU0
};

static const Pipeline_Use_Element pipeline_res_mask_025[5] = {
  Pipeline_Use_Element(0x007, 0, 2, true,  Pipeline_Use_Cycle_Mask(0x80000004)),
  Pipeline_Use_Element(0x001, 0, 0, false, Pipeline_Use_Cycle_Mask(0x00000002)),
  Pipeline_Use_Element(0x038, 3, 5, true,  Pipeline_Use_Cycle_Mask(0x00000004)),
  Pipeline_Use_Element(0x700, 8, 10, true,  Pipeline_Use_Cycle_Mask(0x0000000c)),
  Pipeline_Use_Element(0x040, 6, 6, false, Pipeline_Use_Cycle_Mask(0x00000010)) 
};

static const Pipeline pipeline_class_039((uint)stage_S5, 1, true, 6, 1, false, false, true, false,

  (enum machPipelineStages * const) pipeline_reads_001,
   (enum machPipelineStages * const) pipeline_res_stages_016,
  (uint * const) pipeline_res_cycles_023,
  Pipeline_Use(0x77f, 0x041,  5, (Pipeline_Use_Element *)&pipeline_res_mask_025[0]));

// Pipeline Class "pipe_slow"
static const Pipeline pipeline_class_040((uint)stage_undefined, 0, true, 100, 10, false, true, true, false,
 NULL,  (enum machPipelineStages * const) pipeline_res_stages_004,
  (uint * const) pipeline_res_cycles_020,
  Pipeline_Use(0x039, 0x001,  2, (Pipeline_Use_Element *)&pipeline_res_mask_022[0]));

// Pipeline Class "empty"
static const enum machPipelineStages pipeline_res_stages_017[11] = {
  stage_undefined, // D0
  stage_undefined, // D1
  stage_undefined, // D2
  stage_undefined, // DECODE
  stage_undefined, // MS0
  stage_undefined, // MS1
  stage_undefined, // MS2
  stage_undefined, // MEM
  stage_undefined, // BR
  stage_undefined, // FPU
  stage_undefined  // ALU0
};

static const uint pipeline_res_cycles_024[11] = {
  0, // D0
  0, // D1
  0, // D2
  0, // DECODE
  0, // MS0
  0, // MS1
  0, // MS2
  0, // MEM
  0, // BR
  0, // FPU
  0  // ALU0
};

static const Pipeline pipeline_class_041((uint)stage_undefined, 0, false, 0, 0, false, false, false, false,
 NULL,  (enum machPipelineStages * const) pipeline_res_stages_017,
  (uint * const) pipeline_res_cycles_024,
  Pipeline_Use(0x000, 0x000,  0, (Pipeline_Use_Element *)NULL));

//------------------Inter-Instruction Latency--------------------------------
uint Node::latency(uint i) {
  uint j;
  // verify in legal range for inputs
  assert(i < len(), "index not in range");

  // verify input is not null
  Node *pred = in(i);
  if (!pred)
    return 0;

  if (pred->is_Proj())
    pred = pred->in(0);

  // if either node does not have pipeline info, use default
  const Pipeline *predpipe = pred->pipeline();
  assert(predpipe, "no predecessor pipeline info");

  if (predpipe->hasFixedLatency())
    return predpipe->fixedLatency();

  const Pipeline *currpipe = pipeline();
  assert(currpipe, "no pipeline info");

  if (!is_Mach())
    return 0;

  const MachNode *m = as_Mach();
  j = m->oper_input_base();
  if (i < j)
    return currpipe->functional_unit_latency(0, predpipe);

  // determine which operand this is in
  uint n = m->num_opnds();
  int delta = 0;

  uint k;
  for (k = 1; k < n; k++) {
    j += m->_opnds[k]->num_edges();
    if (i < j)
      break;
  }
  if (k < n)
    delta = currpipe->operand_latency(k,predpipe);

  return currpipe->functional_unit_latency(delta, predpipe);
}

// Descriptions for emitting different functional unit nops
void Bundle::initialize_nops(MachNode * nop_list[1], Compile *C) {
  nop_list[0] = (MachNode *) new (C) MachNopNode();
};

#ifndef PRODUCT
void Bundle::dump(outputStream *st) const {
  static const char * bundle_flags[] = {
    "",
    "use nop delay",
    "use unconditional delay",
    "use conditional delay",
    "used in conditional delay",
    "used in unconditional delay",
    "used in all conditional delays",
  };

  static const char *resource_names[11] = { "D0", "D1", "D2", "DECODE", "MS0", "MS1", "MS2", "MEM", "BR", "FPU", "ALU0" };

  bool needs_comma = false;

  if (_flags) {
    st->print("%s", bundle_flags[_flags]);
    needs_comma = true;
  };
  if (instr_count()) {
    st->print("%s%d instr%s", needs_comma ? ", " : "", instr_count(), instr_count() != 1 ? "s" : "");
    needs_comma = true;
  };
  uint r = resources_used();
  if (r) {
    st->print("%sresource%s:", needs_comma ? ", " : "", (r & (r-1)) != 0 ? "s" : "");
    for (uint i = 0; i < 11; i++)
      if ((r & (1 << i)) != 0)
        st->print(" %s", resource_names[i]);
    needs_comma = true;
  };
  st->print("\n");
}
#endif
const Pipeline *                         Node::pipeline_class() { return (&pipeline_class_Zero_Instructions); }
const Pipeline *                         Node::pipeline() const { return (&pipeline_class_Zero_Instructions); }

const Pipeline *                     MachNode::pipeline_class() { return (&pipeline_class_Unknown_Instructions); }
const Pipeline *                     MachNode::pipeline() const { return pipeline_class(); }

const Pipeline * MachNopNode::pipeline() const { return (&pipeline_class_041); }


const Pipeline *                        loadBNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadBNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadB2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadB2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                       loadUBNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                       loadUBNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadUB2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadUB2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *               loadUB2L_immI8Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *               loadUB2L_immI8Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadSNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadSNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadS2BNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadS2BNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadS2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadS2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                       loadUSNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                       loadUSNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadUS2BNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadUS2BNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadUS2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadUS2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *            loadUS2L_immI_255Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *            loadUS2L_immI_255Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              loadUS2L_immI16Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              loadUS2L_immI16Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadINode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadINode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadI2BNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadI2BNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadI2UBNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadI2UBNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadI2SNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadI2SNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadI2USNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadI2USNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadI2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadI2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *             loadI2L_immI_255Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *             loadI2L_immI_255Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *           loadI2L_immI_65535Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *           loadI2L_immI_65535Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                 loadI2L_immINode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                 loadI2L_immINode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                     loadUI2LNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                     loadUI2LNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadLNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadLNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                    loadRangeNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                    loadRangeNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadPNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadPNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadNNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                        loadNNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                    loadKlassNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                    loadKlassNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                   loadNKlassNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                   loadNKlassNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                        loadFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                        loadFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                loadD_partialNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                loadD_partialNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                        loadDNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                        loadDNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                        leaP8Node::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                        leaP8Node::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                       leaP32Node::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                       leaP32Node::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                   leaPIdxOffNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                   leaPIdxOffNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                 leaPIdxScaleNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                 leaPIdxScaleNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *              leaPIdxScaleOffNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *              leaPIdxScaleOffNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *           leaPPosIdxScaleOffNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *           leaPPosIdxScaleOffNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *      leaPCompressedOopOffsetNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *      leaPCompressedOopOffsetNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                  leaP8NarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                  leaP8NarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                 leaP32NarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *                 leaP32NarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *             leaPIdxOffNarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *             leaPIdxOffNarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *           leaPIdxScaleNarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *           leaPIdxScaleNarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *        leaPIdxScaleOffNarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *        leaPIdxScaleOffNarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *     leaPPosIdxScaleOffNarrowNode::pipeline_class() { return (&pipeline_class_007); }
const Pipeline *     leaPPosIdxScaleOffNarrowNode::pipeline() const { return (&pipeline_class_007); }

const Pipeline *                     loadConINode::pipeline_class() { return (&pipeline_class_003); }
const Pipeline *                     loadConINode::pipeline() const { return (&pipeline_class_003); }

const Pipeline *                    loadConI0Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    loadConI0Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     loadConLNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                     loadConLNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    loadConL0Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    loadConL0Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                  loadConUL32Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  loadConUL32Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   loadConL32Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                   loadConL32Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     loadConPNode::pipeline_class() { return (&pipeline_class_003); }
const Pipeline *                     loadConPNode::pipeline() const { return (&pipeline_class_003); }

const Pipeline *                    loadConP0Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    loadConP0Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   loadConP31Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                   loadConP31Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     loadConFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     loadConFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    loadConN0Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    loadConN0Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     loadConNNode::pipeline_class() { return (&pipeline_class_003); }
const Pipeline *                     loadConNNode::pipeline() const { return (&pipeline_class_003); }

const Pipeline *                    loadConF0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    loadConF0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     loadConDNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     loadConDNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    loadConD0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    loadConD0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      loadSSINode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadSSINode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadSSLNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadSSLNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadSSPNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                      loadSSPNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                      loadSSFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      loadSSFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      loadSSDNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      loadSSDNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    prefetchrNode::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                    prefetchrNode::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                 prefetchrNTANode::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                 prefetchrNTANode::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                  prefetchrT0Node::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                  prefetchrT0Node::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                  prefetchrT2Node::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                  prefetchrT2Node::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                 prefetchwNTANode::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                 prefetchwNTANode::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                prefetchAllocNode::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *                prefetchAllocNode::pipeline() const { return (&pipeline_class_010); }

const Pipeline *             prefetchAllocNTANode::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *             prefetchAllocNTANode::pipeline() const { return (&pipeline_class_010); }

const Pipeline *              prefetchAllocT0Node::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *              prefetchAllocT0Node::pipeline() const { return (&pipeline_class_010); }

const Pipeline *              prefetchAllocT2Node::pipeline_class() { return (&pipeline_class_010); }
const Pipeline *              prefetchAllocT2Node::pipeline() const { return (&pipeline_class_010); }

const Pipeline *                       storeBNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storeBNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                       storeCNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storeCNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                       storeINode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storeINode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                       storeLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storeLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                       storePNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storePNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                   storeImmP0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmP0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                    storeImmPNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                    storeImmPNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                       storeNNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                       storeNNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                   storeImmN0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmN0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                    storeImmNNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                    storeImmNNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                   storeImmI0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmI0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                    storeImmINode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                    storeImmINode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                   storeImmL0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmL0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                    storeImmLNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                    storeImmLNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                   storeImmC0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmC0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  storeImmI16Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                  storeImmI16Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                   storeImmB0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                   storeImmB0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                    storeImmBNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                    storeImmBNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *              storeImmCM0_regNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              storeImmCM0_regNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  storeImmCM0Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                  storeImmCM0Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                       storeFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       storeFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      storeF0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                      storeF0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                   storeF_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   storeF_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                       storeDNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       storeDNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  storeD0_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                  storeD0_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                      storeD0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                      storeD0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                     storeSSINode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                     storeSSINode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                     storeSSLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                     storeSSLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                     storeSSPNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                     storeSSPNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                     storeSSFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     storeSSFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     storeSSDNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     storeSSDNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            bytes_reverse_intNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *            bytes_reverse_intNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           bytes_reverse_longNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           bytes_reverse_longNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline * bytes_reverse_unsigned_shortNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline * bytes_reverse_unsigned_shortNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *          bytes_reverse_shortNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *          bytes_reverse_shortNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           countLeadingZerosINode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           countLeadingZerosINode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *       countLeadingZerosI_bsrNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *       countLeadingZerosI_bsrNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           countLeadingZerosLNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           countLeadingZerosLNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *       countLeadingZerosL_bsrNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *       countLeadingZerosL_bsrNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *          countTrailingZerosINode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *          countTrailingZerosINode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *          countTrailingZerosLNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *          countTrailingZerosLNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    popCountINode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    popCountINode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                popCountI_memNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                popCountI_memNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    popCountLNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    popCountLNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                popCountL_memNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                popCountL_memNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               membar_acquireNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *               membar_acquireNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *          membar_acquire_lockNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *          membar_acquire_lockNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *               membar_releaseNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *               membar_releaseNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *          membar_release_lockNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *          membar_release_lockNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *              membar_volatileNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              membar_volatileNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *  unnecessary_membar_volatileNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *  unnecessary_membar_volatileNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *            membar_storestoreNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *            membar_storestoreNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *                      castX2PNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                      castX2PNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                      castP2XNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                      castP2XNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                      convP2INode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                      convP2INode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                      convN2INode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                      convN2INode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                encodeHeapOopNode::pipeline_class() { return (&pipeline_class_002); }
const Pipeline *                encodeHeapOopNode::pipeline() const { return (&pipeline_class_002); }

const Pipeline *       encodeHeapOop_not_nullNode::pipeline_class() { return (&pipeline_class_002); }
const Pipeline *       encodeHeapOop_not_nullNode::pipeline() const { return (&pipeline_class_002); }

const Pipeline *                decodeHeapOopNode::pipeline_class() { return (&pipeline_class_002); }
const Pipeline *                decodeHeapOopNode::pipeline() const { return (&pipeline_class_002); }

const Pipeline *       decodeHeapOop_not_nullNode::pipeline_class() { return (&pipeline_class_002); }
const Pipeline *       decodeHeapOop_not_nullNode::pipeline() const { return (&pipeline_class_002); }

const Pipeline *              jumpXtnd_offsetNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *              jumpXtnd_offsetNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                jumpXtnd_addrNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                jumpXtnd_addrNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                     jumpXtndNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                     jumpXtndNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                    cmovI_regNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                    cmovI_regNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                   cmovI_regUNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                   cmovI_regUNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                    cmovI_memNode::pipeline_class() { return (&pipeline_class_020); }
const Pipeline *                    cmovI_memNode::pipeline() const { return (&pipeline_class_020); }

const Pipeline *                   cmovI_memUNode::pipeline_class() { return (&pipeline_class_020); }
const Pipeline *                   cmovI_memUNode::pipeline() const { return (&pipeline_class_020); }

const Pipeline *                    cmovN_regNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                    cmovN_regNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                   cmovN_regUNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                   cmovN_regUNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                    cmovP_regNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                    cmovP_regNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                   cmovP_regUNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                   cmovP_regUNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                    cmovL_regNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                    cmovL_regNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                    cmovL_memNode::pipeline_class() { return (&pipeline_class_020); }
const Pipeline *                    cmovL_memNode::pipeline() const { return (&pipeline_class_020); }

const Pipeline *                   cmovL_regUNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                   cmovL_regUNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                   cmovL_memUNode::pipeline_class() { return (&pipeline_class_020); }
const Pipeline *                   cmovL_memUNode::pipeline() const { return (&pipeline_class_020); }

const Pipeline *                    cmovF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    cmovF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   cmovF_regUNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   cmovF_regUNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    cmovD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    cmovD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   cmovD_regUNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   cmovD_regUNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    addI_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    addI_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                addI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                addI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                addI_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                addI_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              addI_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              addI_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                addI_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                addI_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              addI_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              addI_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 addI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 addI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    incI_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    incI_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     incI_memNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                     incI_memNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    decI_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    decI_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     decI_memNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                     decI_memNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *               leaI_rReg_immINode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *               leaI_rReg_immINode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                    addL_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    addL_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                addL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                addL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                addL_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                addL_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              addL_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              addL_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                addL_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                addL_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              addL_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              addL_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 addL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 addL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    incL_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    incL_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     incL_memNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                     incL_memNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    decL_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    decL_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     decL_memNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                     decL_memNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *               leaL_rReg_immLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *               leaL_rReg_immLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                    addP_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    addP_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                addP_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                addP_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                leaP_rReg_immNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                leaP_rReg_immNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  checkCastPPNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *                  checkCastPPNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *                       castPPNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *                       castPPNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *                       castIINode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *                       castIINode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *                  loadPLockedNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                  loadPLockedNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *            storePConditionalNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *            storePConditionalNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *            storeIConditionalNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *            storeIConditionalNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *            storeLConditionalNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *            storeLConditionalNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *              compareAndSwapPNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *              compareAndSwapPNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *              compareAndSwapLNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *              compareAndSwapLNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *              compareAndSwapINode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *              compareAndSwapINode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                 xaddI_no_resNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                 xaddI_no_resNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xaddINode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xaddINode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                 xaddL_no_resNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                 xaddL_no_resNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xaddLNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xaddLNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xchgINode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xchgINode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xchgLNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xchgLNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xchgPNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xchgPNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                        xchgNNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *                        xchgNNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *              compareAndSwapNNode::pipeline_class() { return (&pipeline_class_039); }
const Pipeline *              compareAndSwapNNode::pipeline() const { return (&pipeline_class_039); }

const Pipeline *                    subI_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    subI_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                subI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                subI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                subI_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                subI_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                subI_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                subI_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 subI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 subI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    subL_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    subL_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                subL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                subL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                subL_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                subL_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                subL_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                subL_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 subL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 subL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    subP_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    subP_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                    negI_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    negI_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     negI_memNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                     negI_memNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    negL_rRegNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                    negL_rRegNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                     negL_memNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                     negL_memNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    mulI_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    mulI_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                mulI_rReg_immNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                mulI_rReg_immNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                     mulI_memNode::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                     mulI_memNode::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                   mulI_mem_0Node::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                   mulI_mem_0Node::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                 mulI_mem_immNode::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                 mulI_mem_immNode::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                    mulL_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    mulL_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                mulL_rReg_immNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                mulL_rReg_immNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                     mulL_memNode::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                     mulL_memNode::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                   mulL_mem_0Node::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                   mulL_mem_0Node::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                 mulL_mem_immNode::pipeline_class() { return (&pipeline_class_014); }
const Pipeline *                 mulL_mem_immNode::pipeline() const { return (&pipeline_class_014); }

const Pipeline *                  mulHiL_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                  mulHiL_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                    divI_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    divI_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                    divL_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    divL_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *          divModI_rReg_divmodNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *          divModI_rReg_divmodNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *          divModL_rReg_divmodNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *          divModL_rReg_divmodNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *  loadConL_0x6666666666666667Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *  loadConL_0x6666666666666667Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                       mul_hiNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                       mul_hiNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                 sarL_rReg_63Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                 sarL_rReg_63Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                  sarL_rReg_2Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  sarL_rReg_2Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                    modI_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    modI_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                    modL_rRegNode::pipeline_class() { return (&pipeline_class_013); }
const Pipeline *                    modL_rRegNode::pipeline() const { return (&pipeline_class_013); }

const Pipeline *                  salI_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  salI_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   salI_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   salI_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                salI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                salI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 salI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 salI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 salI_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 salI_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  salI_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  salI_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  sarI_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  sarI_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   sarI_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   sarI_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                sarI_rReg_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                sarI_rReg_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 sarI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 sarI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 sarI_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 sarI_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  sarI_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  sarI_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  shrI_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  shrI_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   shrI_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   shrI_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                shrI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                shrI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 shrI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 shrI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 shrI_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 shrI_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  shrI_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  shrI_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  salL_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  salL_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   salL_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   salL_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                salL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                salL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 salL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 salL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 salL_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 salL_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  salL_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  salL_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  sarL_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  sarL_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   sarL_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   sarL_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                sarL_rReg_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                sarL_rReg_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 sarL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 sarL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 sarL_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 sarL_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  sarL_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  sarL_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  shrL_rReg_1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                  shrL_rReg_1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                   shrL_mem_1Node::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                   shrL_mem_1Node::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                shrL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                shrL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 shrL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 shrL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                 shrL_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 shrL_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                  shrL_mem_CLNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                  shrL_mem_CLNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                          i2bNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                          i2bNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                          i2sNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                          i2sNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *               rolI_rReg_imm1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rolI_rReg_imm1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               rolI_rReg_imm8Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rolI_rReg_imm8Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 rolI_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 rolI_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *               rorI_rReg_imm1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rorI_rReg_imm1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               rorI_rReg_imm8Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rorI_rReg_imm8Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 rorI_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 rorI_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *               rolL_rReg_imm1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rolL_rReg_imm1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               rolL_rReg_imm8Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rolL_rReg_imm8Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 rolL_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 rolL_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *               rorL_rReg_imm1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rorL_rReg_imm1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               rorL_rReg_imm8Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *               rorL_rReg_imm8Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 rorL_rReg_CLNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                 rorL_rReg_CLNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                    andI_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    andI_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *             andI_rReg_imm255Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *             andI_rReg_imm255Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           andI2L_rReg_imm255Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           andI2L_rReg_imm255Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           andI_rReg_imm65535Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           andI_rReg_imm65535Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *         andI2L_rReg_imm65535Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *         andI2L_rReg_imm65535Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                andI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                andI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                andI_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                andI_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              andI_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              andI_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                andI_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                andI_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              andI_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              andI_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 andI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 andI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                     orI_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                     orI_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                 orI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                 orI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 orI_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                 orI_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *               orI_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *               orI_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                 orI_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                 orI_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *               orI_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *               orI_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  orI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                  orI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    xorI_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    xorI_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                xorI_rReg_im1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                xorI_rReg_im1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                xorI_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                xorI_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                xorI_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                xorI_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              xorI_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              xorI_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                xorI_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                xorI_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              xorI_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              xorI_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 xorI_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 xorI_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    andL_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    andL_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *             andL_rReg_imm255Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *             andL_rReg_imm255Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *           andL_rReg_imm65535Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *           andL_rReg_imm65535Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                andL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                andL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                andL_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                andL_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              andL_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              andL_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                andL_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                andL_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              andL_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              andL_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 andL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 andL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                     orL_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                     orL_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *             orL_rReg_castP2XNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *             orL_rReg_castP2XNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *           orL_rReg_castP2X_0Node::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *           orL_rReg_castP2X_0Node::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                 orL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                 orL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                 orL_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                 orL_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *               orL_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *               orL_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                 orL_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                 orL_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *               orL_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *               orL_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                  orL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                  orL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                    xorL_rRegNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                    xorL_rRegNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *                xorL_rReg_im1Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                xorL_rReg_im1Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                xorL_rReg_immNode::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                xorL_rReg_immNode::pipeline() const { return (&pipeline_class_001); }

const Pipeline *                xorL_rReg_memNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *                xorL_rReg_memNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *              xorL_rReg_mem_0Node::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *              xorL_rReg_mem_0Node::pipeline() const { return (&pipeline_class_009); }

const Pipeline *                xorL_mem_rRegNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *                xorL_mem_rRegNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              xorL_mem_rReg_0Node::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *              xorL_mem_rReg_0Node::pipeline() const { return (&pipeline_class_011); }

const Pipeline *                 xorL_mem_immNode::pipeline_class() { return (&pipeline_class_012); }
const Pipeline *                 xorL_mem_immNode::pipeline() const { return (&pipeline_class_012); }

const Pipeline *                      convI2BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      convI2BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      convP2BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      convP2BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    cmpLTMaskNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    cmpLTMaskNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   cmpLTMask0Node::pipeline_class() { return (&pipeline_class_001); }
const Pipeline *                   cmpLTMask0Node::pipeline() const { return (&pipeline_class_001); }

const Pipeline *               cadd_cmpLTMaskNode::pipeline_class() { return (&pipeline_class_018); }
const Pipeline *               cadd_cmpLTMaskNode::pipeline() const { return (&pipeline_class_018); }

const Pipeline *             cadd_cmpLTMask_1Node::pipeline_class() { return (&pipeline_class_018); }
const Pipeline *             cadd_cmpLTMask_1Node::pipeline() const { return (&pipeline_class_018); }

const Pipeline *             cadd_cmpLTMask_0Node::pipeline_class() { return (&pipeline_class_018); }
const Pipeline *             cadd_cmpLTMask_0Node::pipeline() const { return (&pipeline_class_018); }

const Pipeline *             cadd_cmpLTMask_2Node::pipeline_class() { return (&pipeline_class_018); }
const Pipeline *             cadd_cmpLTMask_2Node::pipeline() const { return (&pipeline_class_018); }

const Pipeline *                  cmpF_cc_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpF_cc_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               cmpF_cc_reg_CFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               cmpF_cc_reg_CFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmpF_cc_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpF_cc_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                cmpF_cc_memCFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpF_cc_memCFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmpF_cc_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpF_cc_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                cmpF_cc_immCFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpF_cc_immCFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmpD_cc_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpD_cc_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               cmpD_cc_reg_CFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               cmpD_cc_reg_CFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmpD_cc_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpD_cc_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                cmpD_cc_memCFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpD_cc_memCFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmpD_cc_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpD_cc_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                cmpD_cc_immCFNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpD_cc_immCFNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cmpD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cmpD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     cosD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     cosD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     sinD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     sinD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     tanD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     tanD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   log10D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   log10D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     logD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     logD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     powD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     powD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     expD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     expD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               roundFloat_nopNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *               roundFloat_nopNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *              roundDouble_nopNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *              roundDouble_nopNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *              convF2D_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convF2D_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convF2D_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convF2D_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convD2F_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convD2F_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convD2F_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convD2F_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convF2I_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convF2I_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convF2L_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convF2L_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convD2I_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convD2I_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convD2L_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convD2L_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convI2F_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convI2F_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convI2F_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convI2F_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convI2D_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convI2D_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convI2D_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convI2D_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 convXI2F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 convXI2F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 convXI2D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 convXI2D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convL2F_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convL2F_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convL2F_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convL2F_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convL2D_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convL2D_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convL2D_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              convL2D_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              convI2L_reg_regNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *              convI2L_reg_regNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *          convI2L_reg_reg_zexNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *          convI2L_reg_reg_zexNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *          convI2L_reg_mem_zexNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *          convI2L_reg_mem_zexNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *           zerox_long_reg_regNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *           zerox_long_reg_regNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *              convL2I_reg_regNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *              convL2I_reg_regNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *            MoveF2I_stack_regNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *            MoveF2I_stack_regNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *            MoveI2F_stack_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *            MoveI2F_stack_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            MoveD2L_stack_regNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *            MoveD2L_stack_regNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *    MoveL2D_stack_reg_partialNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *    MoveL2D_stack_reg_partialNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            MoveL2D_stack_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *            MoveL2D_stack_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            MoveF2I_reg_stackNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *            MoveF2I_reg_stackNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            MoveI2F_reg_stackNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *            MoveI2F_reg_stackNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *            MoveD2L_reg_stackNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *            MoveD2L_reg_stackNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            MoveL2D_reg_stackNode::pipeline_class() { return (&pipeline_class_011); }
const Pipeline *            MoveL2D_reg_stackNode::pipeline() const { return (&pipeline_class_011); }

const Pipeline *              MoveF2I_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              MoveF2I_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              MoveD2L_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              MoveD2L_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              MoveI2F_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              MoveI2F_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              MoveL2D_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              MoveL2D_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     rep_stosNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     rep_stosNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               string_compareNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               string_compareNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *           string_indexof_conNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *           string_indexof_conNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               string_indexofNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               string_indexofNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                string_equalsNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                string_equalsNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 array_equalsNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 array_equalsNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   compI_rRegNode::pipeline_class() { return (&pipeline_class_015); }
const Pipeline *                   compI_rRegNode::pipeline() const { return (&pipeline_class_015); }

const Pipeline *               compI_rReg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *               compI_rReg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *               compI_rReg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compI_rReg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                    testI_regNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testI_regNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                testI_reg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                testI_reg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                testI_reg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *                testI_reg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *              testI_reg_mem_0Node::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *              testI_reg_mem_0Node::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                   compU_rRegNode::pipeline_class() { return (&pipeline_class_015); }
const Pipeline *                   compU_rRegNode::pipeline() const { return (&pipeline_class_015); }

const Pipeline *               compU_rReg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *               compU_rReg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *               compU_rReg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compU_rReg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                    testU_regNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testU_regNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                   compP_rRegNode::pipeline_class() { return (&pipeline_class_015); }
const Pipeline *                   compP_rRegNode::pipeline() const { return (&pipeline_class_015); }

const Pipeline *               compP_rReg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compP_rReg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *               compP_mem_rRegNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compP_mem_rRegNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                    testP_regNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testP_regNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                    testP_memNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testP_memNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *               testP_mem_reg0Node::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               testP_mem_reg0Node::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                   compN_rRegNode::pipeline_class() { return (&pipeline_class_015); }
const Pipeline *                   compN_rRegNode::pipeline() const { return (&pipeline_class_015); }

const Pipeline *               compN_rReg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compN_rReg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *               compN_rReg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *               compN_rReg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                compN_mem_immNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *                compN_mem_immNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                    testN_regNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testN_regNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                    testN_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *                    testN_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *               testN_mem_reg0Node::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               testN_mem_reg0Node::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                   compL_rRegNode::pipeline_class() { return (&pipeline_class_015); }
const Pipeline *                   compL_rRegNode::pipeline() const { return (&pipeline_class_015); }

const Pipeline *               compL_rReg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *               compL_rReg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *               compL_rReg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *               compL_rReg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                    testL_regNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                    testL_regNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                testL_reg_immNode::pipeline_class() { return (&pipeline_class_016); }
const Pipeline *                testL_reg_immNode::pipeline() const { return (&pipeline_class_016); }

const Pipeline *                testL_reg_memNode::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *                testL_reg_memNode::pipeline() const { return (&pipeline_class_017); }

const Pipeline *              testL_reg_mem_0Node::pipeline_class() { return (&pipeline_class_017); }
const Pipeline *              testL_reg_mem_0Node::pipeline() const { return (&pipeline_class_017); }

const Pipeline *                cmpL3_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpL3_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  cmovI_reg_gNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                  cmovI_reg_gNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                  cmovI_reg_lNode::pipeline_class() { return (&pipeline_class_019); }
const Pipeline *                  cmovI_reg_lNode::pipeline() const { return (&pipeline_class_019); }

const Pipeline *                       jmpDirNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                       jmpDirNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                       jmpConNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                       jmpConNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                   jmpLoopEndNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                   jmpLoopEndNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                  jmpLoopEndUNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                  jmpLoopEndUNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                jmpLoopEndUCFNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                jmpLoopEndUCFNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                      jmpConUNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                      jmpConUNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                    jmpConUCFNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                    jmpConUCFNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                   jmpConUCF2Node::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                   jmpConUCF2Node::pipeline() const { return (&pipeline_class_038); }

const Pipeline *          partialSubtypeCheckNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *          partialSubtypeCheckNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *  partialSubtypeCheck_vs_ZeroNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *  partialSubtypeCheck_vs_ZeroNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 jmpDir_shortNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                 jmpDir_shortNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                 jmpCon_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                 jmpCon_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *             jmpLoopEnd_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *             jmpLoopEnd_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *            jmpLoopEndU_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *            jmpLoopEndU_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *          jmpLoopEndUCF_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *          jmpLoopEndUCF_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                jmpConU_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *                jmpConU_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *              jmpConUCF_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *              jmpConUCF_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *             jmpConUCF2_shortNode::pipeline_class() { return (&pipeline_class_038); }
const Pipeline *             jmpConUCF2_shortNode::pipeline() const { return (&pipeline_class_038); }

const Pipeline *                  cmpFastLockNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  cmpFastLockNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                cmpFastUnlockNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                cmpFastUnlockNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               safePoint_pollNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *               safePoint_pollNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *           safePoint_poll_farNode::pipeline_class() { return (&pipeline_class_009); }
const Pipeline *           safePoint_poll_farNode::pipeline() const { return (&pipeline_class_009); }

const Pipeline *         CallStaticJavaDirectNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *         CallStaticJavaDirectNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *         CallStaticJavaHandleNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *         CallStaticJavaHandleNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *        CallDynamicJavaDirectNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *        CallDynamicJavaDirectNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *            CallRuntimeDirectNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *            CallRuntimeDirectNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               CallLeafDirectNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               CallLeafDirectNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *           CallLeafNoFPDirectNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *           CallLeafNoFPDirectNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                          RetNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                          RetNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *               TailCalljmpIndNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *               TailCalljmpIndNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                   tailjmpIndNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *                   tailjmpIndNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *              CreateExceptionNode::pipeline_class() { return (&pipeline_class_041); }
const Pipeline *              CreateExceptionNode::pipeline() const { return (&pipeline_class_041); }

const Pipeline *             RethrowExceptionNode::pipeline_class() { return (&pipeline_class_037); }
const Pipeline *             RethrowExceptionNode::pipeline() const { return (&pipeline_class_037); }

const Pipeline *                     tlsLoadPNode::pipeline_class() { return (&pipeline_class_005); }
const Pipeline *                     tlsLoadPNode::pipeline() const { return (&pipeline_class_005); }

const Pipeline *           ShouldNotReachHereNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *           ShouldNotReachHereNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   addF_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   addF_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addF_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addF_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               addF_reg_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               addF_reg_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addF_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addF_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   addD_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   addD_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     addD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     addD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addD_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addD_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               addD_reg_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               addD_reg_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 addD_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 addD_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subF_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subF_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subF_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subF_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     subD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     subD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subD_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subD_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 subD_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 subD_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   mulF_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   mulF_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulF_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulF_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               mulF_reg_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               mulF_reg_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulF_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulF_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   mulD_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   mulD_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     mulD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     mulD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulD_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulD_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               mulD_reg_mem_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               mulD_reg_mem_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 mulD_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 mulD_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divF_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divF_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divF_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divF_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     divD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     divD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divD_reg_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divD_reg_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 divD_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 divD_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     absF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     absF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 absF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 absF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     absD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     absD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 absD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 absD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     negF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     negF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 negF_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 negF_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     negD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     negD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                 negD_reg_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                 negD_reg_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtF_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtF_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtF_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtF_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtF_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtF_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtD_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtD_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtD_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtD_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    sqrtD_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    sqrtD_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       loadV4Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       loadV4Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       loadV8Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       loadV8Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      loadV16Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      loadV16Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      loadV32Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      loadV32Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      storeV4Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      storeV4Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      storeV8Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      storeV8Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     storeV16Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     storeV16Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                     storeV32Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                     storeV32Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      Repl16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      Repl16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      Repl32BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      Repl32BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl4B_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl4B_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl8B_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl8B_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl16B_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  Repl16B_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl32B_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  Repl32B_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl4B_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4B_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl8B_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl8B_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                 Repl16B_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                 Repl16B_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                 Repl32B_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                 Repl32B_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl2SNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                       Repl2SNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl4SNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                       Repl4SNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      Repl16SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      Repl16SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl2S_immNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                   Repl2S_immNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                   Repl4S_immNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                   Repl4S_immNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                   Repl8S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl8S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl16S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  Repl16S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl2S_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl2S_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl4S_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4S_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl8S_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl8S_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                 Repl16S_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                 Repl16S_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl2INode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                       Repl2INode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl8INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl8INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl2I_immNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                   Repl2I_immNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                   Repl4I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl4I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl8I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl8I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl2I_memNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                   Repl2I_memNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                   Repl4I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl4I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl8I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl8I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl2I_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl2I_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl4I_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4I_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl8I_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl8I_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl2LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl2LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl4LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl4LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl2L_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl2L_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl4L_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl4L_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl2L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl2L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   Repl4L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   Repl4L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl2L_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl2L_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl4L_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4L_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl2FNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                       Repl2FNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl4FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl4FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl8FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl8FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl2F_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl2F_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl4F_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4F_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl8F_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl8F_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       Repl2DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl2DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       Repl4DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       Repl4DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  Repl2D_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl2D_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                  Repl4D_zeroNode::pipeline_class() { return (&pipeline_class_023); }
const Pipeline *                  Repl4D_zeroNode::pipeline() const { return (&pipeline_class_023); }

const Pipeline *                       vadd4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      vadd16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      vadd16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd16B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd16B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd16B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd16B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd32B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd32B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd32B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd32B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vadd16S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vadd16S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd2LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd2LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd2FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd2FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd4FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd4FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd8F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd8F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vadd2DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vadd2DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd2D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd2D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vadd4D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vadd4D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      vsub16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      vsub16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub16B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub16B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub16B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub16B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub32B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub32B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub32B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub32B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsub16S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsub16S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub2LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub2LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4L_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4L_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub2FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub2FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub4FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub4FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub8F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub8F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsub2DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsub2DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub2D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub2D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsub4D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsub4D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vmul16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vmul16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vmul16S_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vmul16S_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8I_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8I_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul2FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul2FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul2F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul2F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul4FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul4FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul8F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul8F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vmul2DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vmul2DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul2D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul2D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul2D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul2D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vmul4D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vmul4D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vdiv2FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vdiv2FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv2F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv2F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vdiv4FNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vdiv4FNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv4F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv4F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv4F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv4F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv8F_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv8F_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv8F_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv8F_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vdiv2DNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vdiv2DNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv2D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv2D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv2D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv2D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv4D_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv4D_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vdiv4D_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vdiv4D_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    vshiftcntNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    vshiftcntNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vshiftcnt_0Node::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vshiftcnt_0Node::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll2S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll2S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll4S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll4S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll4S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll4S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll8S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll8S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll8S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll8S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsll16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsll16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              vsll16S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              vsll16S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll2I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll2I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll4I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll4I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll4I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll4I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll8I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll8I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsll2LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsll2LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2L_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2L_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll2L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll2L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll2L_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll2L_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsll4L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsll4L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsll4L_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsll4L_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl2S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl2S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl4S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl4S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl4S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl4S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl8S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl8S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl8S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl8S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsrl16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsrl16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              vsrl16S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              vsrl16S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl2I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl2I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl4I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl4I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl4I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl4I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl8I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl8I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsrl2LNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsrl2LNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2L_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2L_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl2L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl2L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl2L_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl2L_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsrl4L_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsrl4L_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsrl4L_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsrl4L_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsra2SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsra2SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra2S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra2S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra2S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra2S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra2S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra2S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsra4SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsra4SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra4S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra4S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra4S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra4S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra4S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra4S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsra8SNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsra8SNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra8S_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra8S_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra8S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra8S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra8S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra8S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vsra16S_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vsra16S_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *              vsra16S_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *              vsra16S_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsra2INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsra2INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra2I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra2I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra2I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra2I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra2I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra2I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vsra4INode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vsra4INode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra4I_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra4I_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra4I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra4I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra4I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra4I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vsra8I_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vsra8I_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *               vsra8I_reg_immNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *               vsra8I_reg_immNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vand4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vand4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vand4B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vand4B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vand8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vand8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vand8B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vand8B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      vand16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      vand16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vand16B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vand16B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vand16B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vand16B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vand32B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vand32B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vand32B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vand32B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                        vor4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                        vor4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    vor4B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    vor4B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                        vor8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                        vor8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                    vor8B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                    vor8B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vor16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vor16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vor16B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vor16B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vor16B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vor16B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vor32B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vor32B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vor32B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vor32B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vxor4BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vxor4BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vxor4B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vxor4B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                       vxor8BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                       vxor8BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                   vxor8B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                   vxor8B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                      vxor16BNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                      vxor16BNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vxor16B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vxor16B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vxor16B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vxor16B_memNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vxor32B_regNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vxor32B_regNode::pipeline() const { return (&pipeline_class_040); }

const Pipeline *                  vxor32B_memNode::pipeline_class() { return (&pipeline_class_040); }
const Pipeline *                  vxor32B_memNode::pipeline() const { return (&pipeline_class_040); }
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
