/* 
 Copyright (c) 2002, 2011, Oracle and/or its affiliates. All rights reserved.
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This code is free software; you can redistribute it and/or modify it
 under the terms of the GNU General Public License version 2 only, as
 published by the Free Software Foundation.

 This code is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 version 2 for more details (a copy is included in the LICENSE file that
 accompanied this code).

 You should have received a copy of the GNU General Public License version
 2 along with this work; if not, write to the Free Software Foundation,
 Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.

 Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 or visit www.oracle.com if you need additional information or have any
 questions.
  
 */ 

 // AUTOMATICALLY GENERATED FILE - DO NOT EDIT 

# include "precompiled.hpp"
# include "prims/jvmtiEnter.hpp"
# include "prims/jvmtiRawMonitor.hpp"
# include "prims/jvmtiUtil.hpp"


#ifdef JVMTI_TRACE
jbyte JvmtiTrace::_event_trace_flags[85];

jint JvmtiTrace::_max_event_index = 84;

// Event names
const char* JvmtiTrace::_event_names[] = {
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "VMInit",
  "VMDeath",
  "ThreadStart",
  "ThreadEnd",
  "ClassFileLoadHook",
  "ClassLoad",
  "ClassPrepare",
  "VMStart",
  "Exception",
  "ExceptionCatch",
  "SingleStep",
  "FramePop",
  "Breakpoint",
  "FieldAccess",
  "FieldModification",
  "MethodEntry",
  "MethodExit",
  "NativeMethodBind",
  "CompiledMethodLoad",
  "CompiledMethodUnload",
  "DynamicCodeGenerated",
  "DataDumpRequest",
  NULL,
  "MonitorWait",
  "MonitorWaited",
  "MonitorContendedEnter",
  "MonitorContendedEntered",
  NULL,
  NULL,
  NULL,
  "ResourceExhausted",
  "GarbageCollectionStart",
  "GarbageCollectionFinish",
  "ObjectFree",
  "VMObjectAlloc"
};


// Heap Reference Enumeration names
const char* jvmtiHeapReferenceKindConstantNames[] = {
  "JVMTI_HEAP_REFERENCE_CLASS",
  "JVMTI_HEAP_REFERENCE_FIELD",
  "JVMTI_HEAP_REFERENCE_ARRAY_ELEMENT",
  "JVMTI_HEAP_REFERENCE_CLASS_LOADER",
  "JVMTI_HEAP_REFERENCE_SIGNERS",
  "JVMTI_HEAP_REFERENCE_PROTECTION_DOMAIN",
  "JVMTI_HEAP_REFERENCE_INTERFACE",
  "JVMTI_HEAP_REFERENCE_STATIC_FIELD",
  "JVMTI_HEAP_REFERENCE_CONSTANT_POOL",
  "JVMTI_HEAP_REFERENCE_SUPERCLASS",
  "JVMTI_HEAP_REFERENCE_JNI_GLOBAL",
  "JVMTI_HEAP_REFERENCE_SYSTEM_CLASS",
  "JVMTI_HEAP_REFERENCE_MONITOR",
  "JVMTI_HEAP_REFERENCE_STACK_LOCAL",
  "JVMTI_HEAP_REFERENCE_JNI_LOCAL",
  "JVMTI_HEAP_REFERENCE_THREAD",
  "JVMTI_HEAP_REFERENCE_OTHER",
  NULL
};

// Heap Reference Enumeration value
jint jvmtiHeapReferenceKindConstantValues[] = {
  1,
  2,
  3,
  4,
  5,
  6,
  7,
  8,
  9,
  10,
  21,
  22,
  23,
  24,
  25,
  26,
  27,
  0
};



// Primitive Type Enumeration names
const char* jvmtiPrimitiveTypeConstantNames[] = {
  "JVMTI_PRIMITIVE_TYPE_BOOLEAN",
  "JVMTI_PRIMITIVE_TYPE_BYTE",
  "JVMTI_PRIMITIVE_TYPE_CHAR",
  "JVMTI_PRIMITIVE_TYPE_SHORT",
  "JVMTI_PRIMITIVE_TYPE_INT",
  "JVMTI_PRIMITIVE_TYPE_LONG",
  "JVMTI_PRIMITIVE_TYPE_FLOAT",
  "JVMTI_PRIMITIVE_TYPE_DOUBLE",
  NULL
};

// Primitive Type Enumeration value
jint jvmtiPrimitiveTypeConstantValues[] = {
  90,
  66,
  67,
  83,
  73,
  74,
  70,
  68,
  0
};



// Heap Object Filter Enumeration names
const char* jvmtiHeapObjectFilterConstantNames[] = {
  "JVMTI_HEAP_OBJECT_TAGGED",
  "JVMTI_HEAP_OBJECT_UNTAGGED",
  "JVMTI_HEAP_OBJECT_EITHER",
  NULL
};

// Heap Object Filter Enumeration value
jint jvmtiHeapObjectFilterConstantValues[] = {
  1,
  2,
  3,
  0
};



// Heap Root Kind Enumeration names
const char* jvmtiHeapRootKindConstantNames[] = {
  "JVMTI_HEAP_ROOT_JNI_GLOBAL",
  "JVMTI_HEAP_ROOT_SYSTEM_CLASS",
  "JVMTI_HEAP_ROOT_MONITOR",
  "JVMTI_HEAP_ROOT_STACK_LOCAL",
  "JVMTI_HEAP_ROOT_JNI_LOCAL",
  "JVMTI_HEAP_ROOT_THREAD",
  "JVMTI_HEAP_ROOT_OTHER",
  NULL
};

// Heap Root Kind Enumeration value
jint jvmtiHeapRootKindConstantValues[] = {
  1,
  2,
  3,
  4,
  5,
  6,
  7,
  0
};



// Object Reference Enumeration names
const char* jvmtiObjectReferenceKindConstantNames[] = {
  "JVMTI_REFERENCE_CLASS",
  "JVMTI_REFERENCE_FIELD",
  "JVMTI_REFERENCE_ARRAY_ELEMENT",
  "JVMTI_REFERENCE_CLASS_LOADER",
  "JVMTI_REFERENCE_SIGNERS",
  "JVMTI_REFERENCE_PROTECTION_DOMAIN",
  "JVMTI_REFERENCE_INTERFACE",
  "JVMTI_REFERENCE_STATIC_FIELD",
  "JVMTI_REFERENCE_CONSTANT_POOL",
  NULL
};

// Object Reference Enumeration value
jint jvmtiObjectReferenceKindConstantValues[] = {
  1,
  2,
  3,
  4,
  5,
  6,
  7,
  8,
  9,
  0
};



// Iteration Control Enumeration names
const char* jvmtiIterationControlConstantNames[] = {
  "JVMTI_ITERATION_CONTINUE",
  "JVMTI_ITERATION_IGNORE",
  "JVMTI_ITERATION_ABORT",
  NULL
};

// Iteration Control Enumeration value
jint jvmtiIterationControlConstantValues[] = {
  1,
  2,
  0,
  0
};



// Event Enable/Disable names
const char* jvmtiEventModeConstantNames[] = {
  "JVMTI_ENABLE",
  "JVMTI_DISABLE",
  NULL
};

// Event Enable/Disable value
jint jvmtiEventModeConstantValues[] = {
  1,
  0,
  0
};



// Extension Function/Event Parameter Types names
const char* jvmtiParamTypesConstantNames[] = {
  "JVMTI_TYPE_JBYTE",
  "JVMTI_TYPE_JCHAR",
  "JVMTI_TYPE_JSHORT",
  "JVMTI_TYPE_JINT",
  "JVMTI_TYPE_JLONG",
  "JVMTI_TYPE_JFLOAT",
  "JVMTI_TYPE_JDOUBLE",
  "JVMTI_TYPE_JBOOLEAN",
  "JVMTI_TYPE_JOBJECT",
  "JVMTI_TYPE_JTHREAD",
  "JVMTI_TYPE_JCLASS",
  "JVMTI_TYPE_JVALUE",
  "JVMTI_TYPE_JFIELDID",
  "JVMTI_TYPE_JMETHODID",
  "JVMTI_TYPE_CCHAR",
  "JVMTI_TYPE_CVOID",
  "JVMTI_TYPE_JNIENV",
  NULL
};

// Extension Function/Event Parameter Types value
jint jvmtiParamTypesConstantValues[] = {
  101,
  102,
  103,
  104,
  105,
  106,
  107,
  108,
  109,
  110,
  111,
  112,
  113,
  114,
  115,
  116,
  117,
  0
};



// Extension Function/Event Parameter Kinds names
const char* jvmtiParamKindConstantNames[] = {
  "JVMTI_KIND_IN",
  "JVMTI_KIND_IN_PTR",
  "JVMTI_KIND_IN_BUF",
  "JVMTI_KIND_ALLOC_BUF",
  "JVMTI_KIND_ALLOC_ALLOC_BUF",
  "JVMTI_KIND_OUT",
  "JVMTI_KIND_OUT_BUF",
  NULL
};

// Extension Function/Event Parameter Kinds value
jint jvmtiParamKindConstantValues[] = {
  91,
  92,
  93,
  94,
  95,
  96,
  97,
  0
};



// Timer Kinds names
const char* jvmtiTimerKindConstantNames[] = {
  "JVMTI_TIMER_USER_CPU",
  "JVMTI_TIMER_TOTAL_CPU",
  "JVMTI_TIMER_ELAPSED",
  NULL
};

// Timer Kinds value
jint jvmtiTimerKindConstantValues[] = {
  30,
  31,
  32,
  0
};



// Phases of execution names
const char* jvmtiPhaseConstantNames[] = {
  "JVMTI_PHASE_ONLOAD",
  "JVMTI_PHASE_PRIMORDIAL",
  "JVMTI_PHASE_START",
  "JVMTI_PHASE_LIVE",
  "JVMTI_PHASE_DEAD",
  NULL
};

// Phases of execution value
jint jvmtiPhaseConstantValues[] = {
  1,
  2,
  6,
  4,
  8,
  0
};



// Verbose Flag Enumeration names
const char* jvmtiVerboseFlagConstantNames[] = {
  "JVMTI_VERBOSE_OTHER",
  "JVMTI_VERBOSE_GC",
  "JVMTI_VERBOSE_CLASS",
  "JVMTI_VERBOSE_JNI",
  NULL
};

// Verbose Flag Enumeration value
jint jvmtiVerboseFlagConstantValues[] = {
  0,
  1,
  2,
  4,
  0
};



// JLocation Format Enumeration names
const char* jvmtiJlocationFormatConstantNames[] = {
  "JVMTI_JLOCATION_JVMBCI",
  "JVMTI_JLOCATION_MACHINEPC",
  "JVMTI_JLOCATION_OTHER",
  NULL
};

// JLocation Format Enumeration value
jint jvmtiJlocationFormatConstantValues[] = {
  1,
  2,
  0,
  0
};

jbyte JvmtiTrace::_trace_flags[156];

jint JvmtiTrace::_max_function_index = 155;

// Function names
const char* JvmtiTrace::_function_names[] = {
  NULL,
  NULL,
  "SetEventNotificationMode",
  NULL,
  "GetAllThreads",
  "SuspendThread",
  "ResumeThread",
  "StopThread",
  "InterruptThread",
  "GetThreadInfo",
  "GetOwnedMonitorInfo",
  "GetCurrentContendedMonitor",
  "RunAgentThread",
  "GetTopThreadGroups",
  "GetThreadGroupInfo",
  "GetThreadGroupChildren",
  "GetFrameCount",
  "GetThreadState",
  "GetCurrentThread",
  "GetFrameLocation",
  "NotifyFramePop",
  "GetLocalObject",
  "GetLocalInt",
  "GetLocalLong",
  "GetLocalFloat",
  "GetLocalDouble",
  "SetLocalObject",
  "SetLocalInt",
  "SetLocalLong",
  "SetLocalFloat",
  "SetLocalDouble",
  "CreateRawMonitor",
  "DestroyRawMonitor",
  "RawMonitorEnter",
  "RawMonitorExit",
  "RawMonitorWait",
  "RawMonitorNotify",
  "RawMonitorNotifyAll",
  "SetBreakpoint",
  "ClearBreakpoint",
  NULL,
  "SetFieldAccessWatch",
  "ClearFieldAccessWatch",
  "SetFieldModificationWatch",
  "ClearFieldModificationWatch",
  "IsModifiableClass",
  "Allocate",
  "Deallocate",
  "GetClassSignature",
  "GetClassStatus",
  "GetSourceFileName",
  "GetClassModifiers",
  "GetClassMethods",
  "GetClassFields",
  "GetImplementedInterfaces",
  "IsInterface",
  "IsArrayClass",
  "GetClassLoader",
  "GetObjectHashCode",
  "GetObjectMonitorUsage",
  "GetFieldName",
  "GetFieldDeclaringClass",
  "GetFieldModifiers",
  "IsFieldSynthetic",
  "GetMethodName",
  "GetMethodDeclaringClass",
  "GetMethodModifiers",
  NULL,
  "GetMaxLocals",
  "GetArgumentsSize",
  "GetLineNumberTable",
  "GetMethodLocation",
  "GetLocalVariableTable",
  "SetNativeMethodPrefix",
  "SetNativeMethodPrefixes",
  "GetBytecodes",
  "IsMethodNative",
  "IsMethodSynthetic",
  "GetLoadedClasses",
  "GetClassLoaderClasses",
  "PopFrame",
  "ForceEarlyReturnObject",
  "ForceEarlyReturnInt",
  "ForceEarlyReturnLong",
  "ForceEarlyReturnFloat",
  "ForceEarlyReturnDouble",
  "ForceEarlyReturnVoid",
  "RedefineClasses",
  "GetVersionNumber",
  "GetCapabilities",
  "GetSourceDebugExtension",
  "IsMethodObsolete",
  "SuspendThreadList",
  "ResumeThreadList",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "GetAllStackTraces",
  "GetThreadListStackTraces",
  "GetThreadLocalStorage",
  "SetThreadLocalStorage",
  "GetStackTrace",
  NULL,
  "GetTag",
  "SetTag",
  "ForceGarbageCollection",
  "IterateOverObjectsReachableFromObject",
  "IterateOverReachableObjects",
  "IterateOverHeap",
  "IterateOverInstancesOfClass",
  NULL,
  "GetObjectsWithTags",
  "FollowReferences",
  "IterateThroughHeap",
  NULL,
  NULL,
  NULL,
  "SetJNIFunctionTable",
  "GetJNIFunctionTable",
  "SetEventCallbacks",
  "GenerateEvents",
  "GetExtensionFunctions",
  "GetExtensionEvents",
  "SetExtensionEventCallback",
  "DisposeEnvironment",
  "GetErrorName",
  "GetJLocationFormat",
  "GetSystemProperties",
  "GetSystemProperty",
  "SetSystemProperty",
  "GetPhase",
  "GetCurrentThreadCpuTimerInfo",
  "GetCurrentThreadCpuTime",
  "GetThreadCpuTimerInfo",
  "GetThreadCpuTime",
  "GetTimerInfo",
  "GetTime",
  "GetPotentialCapabilities",
  NULL,
  "AddCapabilities",
  "RelinquishCapabilities",
  "GetAvailableProcessors",
  "GetClassVersionNumbers",
  "GetConstantPool",
  "GetEnvironmentLocalStorage",
  "SetEnvironmentLocalStorage",
  "AddToBootstrapClassLoaderSearch",
  "SetVerboseFlag",
  "AddToSystemClassLoaderSearch",
  "RetransformClasses",
  "GetOwnedMonitorStackDepthInfo",
  "GetObjectSize",
  "GetLocalInstance"
};

// Exclude list
short JvmtiTrace::_exclude_functions[] = {
  102,
  103,
  134,
  135,
  147,
  148,
  33,
  34,
  35,
  36,
  37,
  46,
  47,
  0
};


extern "C" {


  //
  // Memory Management functions
  // 

static jvmtiError JNICALL
jvmtiTrace_Allocate(jvmtiEnv* env,
            jlong size,
            unsigned char** mem_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(46);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(46);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_Allocate , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (mem_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is mem_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
  }
  err = jvmti_env->Allocate(size, mem_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (mem_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is mem_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
  }
  err = jvmti_env->Allocate(size, mem_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  size=%ld", curr_thread_name, func_name, size);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_Deallocate(jvmtiEnv* env,
            unsigned char* mem) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(47);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(47);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_Deallocate , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->Deallocate(mem);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->Deallocate(mem);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

  //
  // Thread functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetThreadState(jvmtiEnv* env,
            jthread thread,
            jint* thread_state_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(17);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(17);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadState , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_state_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_state_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadState(thread, thread_state_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetCurrentThread(jvmtiEnv* env,
            jthread* thread_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(18);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(18);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetCurrentThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetCurrentThread(thread_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetAllThreads(jvmtiEnv* env,
            jint* threads_count_ptr,
            jthread** threads_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(4);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(4);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetAllThreads , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (threads_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is threads_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (threads_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is threads_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetAllThreads(threads_count_ptr, threads_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SuspendThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(5);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(5);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SuspendThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->SuspendThread(java_thread);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SuspendThreadList(jvmtiEnv* env,
            jint request_count,
            const jthread* request_list,
            jvmtiError* results) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(92);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(92);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SuspendThreadList , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (request_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is request_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (request_list == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d", curr_thread_name, func_name, request_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is request_list",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (results == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is results",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
  }
  err = jvmti_env->SuspendThreadList(request_count, request_list, results);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ResumeThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(6);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(6);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ResumeThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->ResumeThread(java_thread);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ResumeThreadList(jvmtiEnv* env,
            jint request_count,
            const jthread* request_list,
            jvmtiError* results) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(93);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(93);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ResumeThreadList , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (request_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is request_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (request_list == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d", curr_thread_name, func_name, request_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is request_list",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (results == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is results",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
  }
  err = jvmti_env->ResumeThreadList(request_count, request_list, results);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  request_count=%d request_list=0x%x", curr_thread_name, func_name, request_count, request_list);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_StopThread(jvmtiEnv* env,
            jthread thread,
            jobject exception) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(7);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(7);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_StopThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_signal_thread == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->StopThread(java_thread, exception);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_InterruptThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(8);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(8);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_InterruptThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_signal_thread == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->InterruptThread(thread);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadInfo(jvmtiEnv* env,
            jthread thread,
            jvmtiThreadInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(9);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(9);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadInfo(thread, info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetOwnedMonitorInfo(jvmtiEnv* env,
            jthread thread,
            jint* owned_monitor_count_ptr,
            jobject** owned_monitors_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(10);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(10);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetOwnedMonitorInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_owned_monitor_info == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (owned_monitor_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is owned_monitor_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (owned_monitors_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is owned_monitors_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->GetOwnedMonitorInfo(java_thread, owned_monitor_count_ptr, owned_monitors_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetOwnedMonitorStackDepthInfo(jvmtiEnv* env,
            jthread thread,
            jint* monitor_info_count_ptr,
            jvmtiMonitorStackDepthInfo** monitor_info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(153);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(153);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetOwnedMonitorStackDepthInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_owned_monitor_stack_depth_info == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (monitor_info_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor_info_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor_info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->GetOwnedMonitorStackDepthInfo(java_thread, monitor_info_count_ptr, monitor_info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetCurrentContendedMonitor(jvmtiEnv* env,
            jthread thread,
            jobject* monitor_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(11);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(11);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetCurrentContendedMonitor , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_contended_monitor == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (monitor_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->GetCurrentContendedMonitor(java_thread, monitor_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RunAgentThread(jvmtiEnv* env,
            jthread thread,
            jvmtiStartFunction proc,
            const void* arg,
            jint priority) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(12);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(12);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RunAgentThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (proc == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is proc",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  arg=0x%x priority=%d", curr_thread_name, func_name, arg, priority);
  }
  err = jvmti_env->RunAgentThread(thread, proc, arg, priority);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  arg=0x%x priority=%d", curr_thread_name, func_name, arg, priority);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetThreadLocalStorage(jvmtiEnv* env,
            jthread thread,
            const void* data) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(103);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(103);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetThreadLocalStorage , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s data=0x%x", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), data);
  }
  err = jvmti_env->SetThreadLocalStorage(java_thread, data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s data=0x%x", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadLocalStorage(jvmtiEnv* env,
            jthread thread,
            void** data_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(102);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(102);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (data_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is data_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadLocalStorage(thread, data_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

  //
  // Thread Group functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetTopThreadGroups(jvmtiEnv* env,
            jint* group_count_ptr,
            jthreadGroup** groups_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(13);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(13);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetTopThreadGroups , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (group_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is group_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (groups_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is groups_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTopThreadGroups(group_count_ptr, groups_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadGroupInfo(jvmtiEnv* env,
            jthreadGroup group,
            jvmtiThreadGroupInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(14);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(14);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadGroupInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadGroupInfo(group, info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadGroupChildren(jvmtiEnv* env,
            jthreadGroup group,
            jint* thread_count_ptr,
            jthread** threads_ptr,
            jint* group_count_ptr,
            jthreadGroup** groups_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(15);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(15);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadGroupChildren , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (threads_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is threads_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (group_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is group_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (groups_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is groups_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadGroupChildren(group, thread_count_ptr, threads_ptr, group_count_ptr, groups_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Stack Frame functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetStackTrace(jvmtiEnv* env,
            jthread thread,
            jint start_depth,
            jint max_frame_count,
            jvmtiFrameInfo* frame_buffer,
            jint* count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(104);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(104);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetStackTrace , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (max_frame_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s start_depth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), start_depth);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is max_frame_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (frame_buffer == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s start_depth=%d max_frame_count=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), start_depth, max_frame_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is frame_buffer",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s start_depth=%d max_frame_count=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), start_depth, max_frame_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s start_depth=%d max_frame_count=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), start_depth, max_frame_count);
  }
  err = jvmti_env->GetStackTrace(java_thread, start_depth, max_frame_count, frame_buffer, count_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s start_depth=%d max_frame_count=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), start_depth, max_frame_count);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetAllStackTraces(jvmtiEnv* env,
            jint max_frame_count,
            jvmtiStackInfo** stack_info_ptr,
            jint* thread_count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(100);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(100);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetAllStackTraces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (max_frame_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is max_frame_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (stack_info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  max_frame_count=%d", curr_thread_name, func_name, max_frame_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is stack_info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (thread_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  max_frame_count=%d", curr_thread_name, func_name, max_frame_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  max_frame_count=%d", curr_thread_name, func_name, max_frame_count);
  }
  err = jvmti_env->GetAllStackTraces(max_frame_count, stack_info_ptr, thread_count_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  max_frame_count=%d", curr_thread_name, func_name, max_frame_count);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadListStackTraces(jvmtiEnv* env,
            jint thread_count,
            const jthread* thread_list,
            jint max_frame_count,
            jvmtiStackInfo** stack_info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(101);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(101);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadListStackTraces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (thread_list == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread_count=%d", curr_thread_name, func_name, thread_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread_list",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (max_frame_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread_count=%d thread_list=0x%x", curr_thread_name, func_name, thread_count, thread_list);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is max_frame_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (stack_info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread_count=%d thread_list=0x%x max_frame_count=%d", curr_thread_name, func_name, thread_count, thread_list, max_frame_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is stack_info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread_count=%d thread_list=0x%x max_frame_count=%d", curr_thread_name, func_name, thread_count, thread_list, max_frame_count);
  }
  err = jvmti_env->GetThreadListStackTraces(thread_count, thread_list, max_frame_count, stack_info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread_count=%d thread_list=0x%x max_frame_count=%d", curr_thread_name, func_name, thread_count, thread_list, max_frame_count);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetFrameCount(jvmtiEnv* env,
            jthread thread,
            jint* count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(16);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(16);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetFrameCount , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->GetFrameCount(java_thread, count_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_PopFrame(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(80);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(80);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_PopFrame , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_pop_frame == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->PopFrame(java_thread);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetFrameLocation(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jmethodID* method_ptr,
            jlocation* location_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(19);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(19);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetFrameLocation , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (method_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (location_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is location_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
  }
  err = jvmti_env->GetFrameLocation(java_thread, depth, method_ptr, location_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_NotifyFramePop(jvmtiEnv* env,
            jthread thread,
            jint depth) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(20);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(20);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_NotifyFramePop , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_frame_pop_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
  }
  err = jvmti_env->NotifyFramePop(java_thread, depth);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Force Early Return functions
  // 

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnObject(jvmtiEnv* env,
            jthread thread,
            jobject value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(81);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(81);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->ForceEarlyReturnObject(java_thread, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnInt(jvmtiEnv* env,
            jthread thread,
            jint value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(82);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(82);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s value=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
  }
  err = jvmti_env->ForceEarlyReturnInt(java_thread, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s value=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnLong(jvmtiEnv* env,
            jthread thread,
            jlong value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(83);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(83);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s value=%ld", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
  }
  err = jvmti_env->ForceEarlyReturnLong(java_thread, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s value=%ld", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnFloat(jvmtiEnv* env,
            jthread thread,
            jfloat value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(84);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(84);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
  }
  err = jvmti_env->ForceEarlyReturnFloat(java_thread, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnDouble(jvmtiEnv* env,
            jthread thread,
            jdouble value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(85);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(85);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
  }
  err = jvmti_env->ForceEarlyReturnDouble(java_thread, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceEarlyReturnVoid(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(86);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(86);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceEarlyReturnVoid , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->ForceEarlyReturnVoid(java_thread);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Heap functions
  // 

static jvmtiError JNICALL
jvmtiTrace_FollowReferences(jvmtiEnv* env,
            jint heap_filter,
            jclass klass,
            jobject initial_object,
            const jvmtiHeapCallbacks* callbacks,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(115);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(115);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_FollowReferences , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (callbacks == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x", curr_thread_name, func_name, heap_filter, klass);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is callbacks",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x callbacks=0x%x user_data=0x%x", curr_thread_name, func_name, heap_filter, klass, callbacks, user_data);
  }
  err = jvmti_env->FollowReferences(heap_filter, klass, initial_object, callbacks, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x callbacks=0x%x user_data=0x%x", curr_thread_name, func_name, heap_filter, klass, callbacks, user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IterateThroughHeap(jvmtiEnv* env,
            jint heap_filter,
            jclass klass,
            const jvmtiHeapCallbacks* callbacks,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(116);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(116);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IterateThroughHeap , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (callbacks == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x", curr_thread_name, func_name, heap_filter, klass);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is callbacks",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x callbacks=0x%x user_data=0x%x", curr_thread_name, func_name, heap_filter, klass, callbacks, user_data);
  }
  err = jvmti_env->IterateThroughHeap(heap_filter, klass, callbacks, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  heap_filter=%d klass=0x%x callbacks=0x%x user_data=0x%x", curr_thread_name, func_name, heap_filter, klass, callbacks, user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetTag(jvmtiEnv* env,
            jobject object,
            jlong* tag_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(106);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(106);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetTag , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (tag_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is tag_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTag(object, tag_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetTag(jvmtiEnv* env,
            jobject object,
            jlong tag) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(107);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(107);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetTag , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  tag=%ld", curr_thread_name, func_name, tag);
  }
  err = jvmti_env->SetTag(object, tag);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  tag=%ld", curr_thread_name, func_name, tag);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetObjectsWithTags(jvmtiEnv* env,
            jint tag_count,
            const jlong* tags,
            jint* count_ptr,
            jobject** object_result_ptr,
            jlong** tag_result_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(114);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(114);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetObjectsWithTags , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (tag_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is tag_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (tags == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  tag_count=%d", curr_thread_name, func_name, tag_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is tags",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  tag_count=%d tags=0x%x", curr_thread_name, func_name, tag_count, tags);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  tag_count=%d tags=0x%x", curr_thread_name, func_name, tag_count, tags);
  }
  err = jvmti_env->GetObjectsWithTags(tag_count, tags, count_ptr, object_result_ptr, tag_result_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  tag_count=%d tags=0x%x", curr_thread_name, func_name, tag_count, tags);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ForceGarbageCollection(jvmtiEnv* env) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(108);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(108);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ForceGarbageCollection , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->ForceGarbageCollection();
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Heap (1.0) functions
  // 

static jvmtiError JNICALL
jvmtiTrace_IterateOverObjectsReachableFromObject(jvmtiEnv* env,
            jobject object,
            jvmtiObjectReferenceCallback object_reference_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(109);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(109);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IterateOverObjectsReachableFromObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (object_reference_callback == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is object_reference_callback",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  user_data=0x%x", curr_thread_name, func_name, user_data);
  }
  err = jvmti_env->IterateOverObjectsReachableFromObject(object, object_reference_callback, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  user_data=0x%x", curr_thread_name, func_name, user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IterateOverReachableObjects(jvmtiEnv* env,
            jvmtiHeapRootCallback heap_root_callback,
            jvmtiStackReferenceCallback stack_ref_callback,
            jvmtiObjectReferenceCallback object_ref_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(110);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(110);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IterateOverReachableObjects , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  user_data=0x%x", curr_thread_name, func_name, user_data);
  }
  err = jvmti_env->IterateOverReachableObjects(heap_root_callback, stack_ref_callback, object_ref_callback, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  user_data=0x%x", curr_thread_name, func_name, user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IterateOverHeap(jvmtiEnv* env,
            jvmtiHeapObjectFilter object_filter,
            jvmtiHeapObjectCallback heap_object_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(111);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(111);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IterateOverHeap , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (heap_object_callback == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  object_filter=%d:%s", curr_thread_name, func_name, object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is heap_object_callback",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  object_filter=%d:%s user_data=0x%x", curr_thread_name, func_name, object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter), user_data);
  }
  err = jvmti_env->IterateOverHeap(object_filter, heap_object_callback, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  object_filter=%d:%s user_data=0x%x", curr_thread_name, func_name, object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter), user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IterateOverInstancesOfClass(jvmtiEnv* env,
            jclass klass,
            jvmtiHeapObjectFilter object_filter,
            jvmtiHeapObjectCallback heap_object_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(112);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(112);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IterateOverInstancesOfClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (heap_object_callback == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s object_filter=%d:%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is heap_object_callback",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s object_filter=%d:%s user_data=0x%x", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter), user_data);
  }
  err = jvmti_env->IterateOverInstancesOfClass(k_mirror, object_filter, heap_object_callback, user_data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s object_filter=%d:%s user_data=0x%x", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), object_filter, 
                    JvmtiTrace::enum_name(jvmtiHeapObjectFilterConstantNames, jvmtiHeapObjectFilterConstantValues, object_filter), user_data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Local Variable functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetLocalObject(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jobject* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(21);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(21);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->GetLocalObject(java_thread, depth, slot, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalInstance(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jobject* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(155);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(155);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalInstance , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
  }
  err = jvmti_env->GetLocalInstance(java_thread, depth, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalInt(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jint* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(22);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(22);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->GetLocalInt(java_thread, depth, slot, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalLong(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jlong* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(23);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(23);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->GetLocalLong(java_thread, depth, slot, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalFloat(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jfloat* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(24);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(24);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->GetLocalFloat(java_thread, depth, slot, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalDouble(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jdouble* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(25);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(25);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->GetLocalDouble(java_thread, depth, slot, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetLocalObject(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jobject value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(26);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(26);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetLocalObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
  }
  err = jvmti_env->SetLocalObject(java_thread, depth, slot, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetLocalInt(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jint value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(27);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(27);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetLocalInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
  }
  err = jvmti_env->SetLocalInt(java_thread, depth, slot, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%d", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetLocalLong(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jlong value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(28);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(28);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetLocalLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%ld", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
  }
  err = jvmti_env->SetLocalLong(java_thread, depth, slot, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%ld", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetLocalFloat(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jfloat value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(29);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(29);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetLocalFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
  }
  err = jvmti_env->SetLocalFloat(java_thread, depth, slot, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetLocalDouble(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jdouble value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(30);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(30);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetLocalDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is depth - negative depth - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT), depth);
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
  }
  err = jvmti_env->SetLocalDouble(java_thread, depth, slot, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%sdepth=%d slot=%d value=%f", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread), depth, slot, value);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Breakpoint functions
  // 

static jvmtiError JNICALL
jvmtiTrace_SetBreakpoint(jvmtiEnv* env,
            jmethodID method,
            jlocation location) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(38);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(38);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetBreakpoint , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_breakpoint_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s location=%d", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             , location);
  }
  err = jvmti_env->SetBreakpoint(method_oop, location);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s location=%d", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             , location);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ClearBreakpoint(jvmtiEnv* env,
            jmethodID method,
            jlocation location) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(39);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(39);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ClearBreakpoint , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_breakpoint_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s location=%d", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             , location);
  }
  err = jvmti_env->ClearBreakpoint(method_oop, location);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s location=%d", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             , location);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Watched Field functions
  // 

static jvmtiError JNICALL
jvmtiTrace_SetFieldAccessWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(41);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(41);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetFieldAccessWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_access_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->SetFieldAccessWatch(&fdesc);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ClearFieldAccessWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(42);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(42);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ClearFieldAccessWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_access_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->ClearFieldAccessWatch(&fdesc);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetFieldModificationWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(43);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(43);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetFieldModificationWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_modification_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->SetFieldModificationWatch(&fdesc);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_ClearFieldModificationWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(44);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(44);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_ClearFieldModificationWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_modification_events == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->ClearFieldModificationWatch(&fdesc);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Class functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetLoadedClasses(jvmtiEnv* env,
            jint* class_count_ptr,
            jclass** classes_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(78);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(78);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLoadedClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (class_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is class_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (classes_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is classes_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetLoadedClasses(class_count_ptr, classes_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetClassLoaderClasses(jvmtiEnv* env,
            jobject initiating_loader,
            jint* class_count_ptr,
            jclass** classes_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(79);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(79);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassLoaderClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (class_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is class_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (classes_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is classes_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetClassLoaderClasses(initiating_loader, class_count_ptr, classes_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetClassSignature(jvmtiEnv* env,
            jclass klass,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(48);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(48);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassSignature , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassSignature(k_mirror, signature_ptr, generic_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetClassStatus(jvmtiEnv* env,
            jclass klass,
            jint* status_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(49);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(49);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassStatus , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (status_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is status_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassStatus(k_mirror, status_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetSourceFileName(jvmtiEnv* env,
            jclass klass,
            char** source_name_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(50);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(50);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetSourceFileName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_source_file_name == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (source_name_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is source_name_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetSourceFileName(k_mirror, source_name_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetClassModifiers(jvmtiEnv* env,
            jclass klass,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(51);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(51);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (modifiers_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is modifiers_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassModifiers(k_mirror, modifiers_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetClassMethods(jvmtiEnv* env,
            jclass klass,
            jint* method_count_ptr,
            jmethodID** methods_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(52);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(52);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassMethods , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (method_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (methods_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is methods_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassMethods(k_mirror, method_count_ptr, methods_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetClassFields(jvmtiEnv* env,
            jclass klass,
            jint* field_count_ptr,
            jfieldID** fields_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(53);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(53);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassFields , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (field_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (fields_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is fields_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassFields(k_mirror, field_count_ptr, fields_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetImplementedInterfaces(jvmtiEnv* env,
            jclass klass,
            jint* interface_count_ptr,
            jclass** interfaces_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(54);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(54);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetImplementedInterfaces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (interface_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is interface_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (interfaces_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is interfaces_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetImplementedInterfaces(k_mirror, interface_count_ptr, interfaces_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetClassVersionNumbers(jvmtiEnv* env,
            jclass klass,
            jint* minor_version_ptr,
            jint* major_version_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(145);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(145);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassVersionNumbers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (minor_version_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is minor_version_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (major_version_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is major_version_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassVersionNumbers(k_mirror, minor_version_ptr, major_version_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetConstantPool(jvmtiEnv* env,
            jclass klass,
            jint* constant_pool_count_ptr,
            jint* constant_pool_byte_count_ptr,
            unsigned char** constant_pool_bytes_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(146);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(146);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetConstantPool , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_constant_pool == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (constant_pool_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is constant_pool_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (constant_pool_byte_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is constant_pool_byte_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (constant_pool_bytes_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is constant_pool_bytes_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetConstantPool(k_mirror, constant_pool_count_ptr, constant_pool_byte_count_ptr, constant_pool_bytes_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsInterface(jvmtiEnv* env,
            jclass klass,
            jboolean* is_interface_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(55);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(55);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsInterface , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_interface_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_interface_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->IsInterface(k_mirror, is_interface_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsArrayClass(jvmtiEnv* env,
            jclass klass,
            jboolean* is_array_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(56);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(56);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsArrayClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_array_class_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_array_class_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->IsArrayClass(k_mirror, is_array_class_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsModifiableClass(jvmtiEnv* env,
            jclass klass,
            jboolean* is_modifiable_class_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(45);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(45);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsModifiableClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_modifiable_class_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_modifiable_class_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->IsModifiableClass(k_mirror, is_modifiable_class_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetClassLoader(jvmtiEnv* env,
            jclass klass,
            jobject* classloader_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(57);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(57);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetClassLoader , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (classloader_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is classloader_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetClassLoader(k_mirror, classloader_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetSourceDebugExtension(jvmtiEnv* env,
            jclass klass,
            char** source_debug_extension_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(90);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(90);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetSourceDebugExtension , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_source_debug_extension == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (source_debug_extension_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is source_debug_extension_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
  }
  err = jvmti_env->GetSourceDebugExtension(k_mirror, source_debug_extension_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RetransformClasses(jvmtiEnv* env,
            jint class_count,
            const jclass* classes) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(152);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(152);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RetransformClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_retransform_classes == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (class_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is class_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (classes == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  class_count=%d", curr_thread_name, func_name, class_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is classes",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  class_count=%d classes=0x%x", curr_thread_name, func_name, class_count, classes);
  }
  err = jvmti_env->RetransformClasses(class_count, classes);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  class_count=%d classes=0x%x", curr_thread_name, func_name, class_count, classes);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_RedefineClasses(jvmtiEnv* env,
            jint class_count,
            const jvmtiClassDefinition* class_definitions) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(87);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(87);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RedefineClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_redefine_classes == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (class_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is class_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (class_definitions == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  class_count=%d", curr_thread_name, func_name, class_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is class_definitions",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  class_count=%d class_definitions=0x%x", curr_thread_name, func_name, class_count, class_definitions);
  }
  err = jvmti_env->RedefineClasses(class_count, class_definitions);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  class_count=%d class_definitions=0x%x", curr_thread_name, func_name, class_count, class_definitions);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

  //
  // Object functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetObjectSize(jvmtiEnv* env,
            jobject object,
            jlong* size_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(154);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(154);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetObjectSize , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (size_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is size_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetObjectSize(object, size_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetObjectHashCode(jvmtiEnv* env,
            jobject object,
            jint* hash_code_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(58);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(58);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetObjectHashCode , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (hash_code_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is hash_code_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetObjectHashCode(object, hash_code_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetObjectMonitorUsage(jvmtiEnv* env,
            jobject object,
            jvmtiMonitorUsage* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(59);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(59);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetObjectMonitorUsage , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_monitor_info == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetObjectMonitorUsage(object, info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Field functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetFieldName(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            char** name_ptr,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(60);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(60);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetFieldName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->GetFieldName(&fdesc, name_ptr, signature_ptr, generic_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetFieldDeclaringClass(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jclass* declaring_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(61);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(61);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetFieldDeclaringClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (declaring_class_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is declaring_class_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->GetFieldDeclaringClass(&fdesc, declaring_class_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetFieldModifiers(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(62);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(62);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetFieldModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (modifiers_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is modifiers_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->GetFieldModifiers(&fdesc, modifiers_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsFieldSynthetic(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jboolean* is_synthetic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(63);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(63);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsFieldSynthetic , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_synthetic_attribute == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - resolved to NULL - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - not a class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - is a primitive class - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is klass - no klassOop - jclass = 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_CLASS), klass);
      }
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is field",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_FIELDID));
      }
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (is_synthetic_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_synthetic_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
  }
  err = jvmti_env->IsFieldSynthetic(&fdesc, is_synthetic_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  klass=%s field=%s", curr_thread_name, func_name, 
                    JvmtiTrace::get_class_name(k_mirror), fdesc.name()->as_C_string());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Method functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetMethodName(jvmtiEnv* env,
            jmethodID method,
            char** name_ptr,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(64);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(64);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetMethodName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetMethodName(method_oop, name_ptr, signature_ptr, generic_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetMethodDeclaringClass(jvmtiEnv* env,
            jmethodID method,
            jclass* declaring_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(65);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(65);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetMethodDeclaringClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (declaring_class_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is declaring_class_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetMethodDeclaringClass(method_oop, declaring_class_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetMethodModifiers(jvmtiEnv* env,
            jmethodID method,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(66);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(66);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetMethodModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (modifiers_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is modifiers_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetMethodModifiers(method_oop, modifiers_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetMaxLocals(jvmtiEnv* env,
            jmethodID method,
            jint* max_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(68);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(68);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetMaxLocals , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (max_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is max_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetMaxLocals(method_oop, max_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetArgumentsSize(jvmtiEnv* env,
            jmethodID method,
            jint* size_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(69);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(69);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetArgumentsSize , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (size_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is size_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetArgumentsSize(method_oop, size_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLineNumberTable(jvmtiEnv* env,
            jmethodID method,
            jint* entry_count_ptr,
            jvmtiLineNumberEntry** table_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(70);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(70);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLineNumberTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_line_numbers == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (entry_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is entry_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (table_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is table_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetLineNumberTable(method_oop, entry_count_ptr, table_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetMethodLocation(jvmtiEnv* env,
            jmethodID method,
            jlocation* start_location_ptr,
            jlocation* end_location_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(71);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(71);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetMethodLocation , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (start_location_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is start_location_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (end_location_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is end_location_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetMethodLocation(method_oop, start_location_ptr, end_location_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetLocalVariableTable(jvmtiEnv* env,
            jmethodID method,
            jint* entry_count_ptr,
            jvmtiLocalVariableEntry** table_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(72);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(72);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetLocalVariableTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (entry_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is entry_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (table_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is table_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetLocalVariableTable(method_oop, entry_count_ptr, table_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetBytecodes(jvmtiEnv* env,
            jmethodID method,
            jint* bytecode_count_ptr,
            unsigned char** bytecodes_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(75);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(75);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetBytecodes , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_bytecodes == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (bytecode_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is bytecode_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (bytecodes_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is bytecodes_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->GetBytecodes(method_oop, bytecode_count_ptr, bytecodes_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsMethodNative(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_native_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(76);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(76);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsMethodNative , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_native_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_native_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->IsMethodNative(method_oop, is_native_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsMethodSynthetic(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_synthetic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(77);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(77);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsMethodSynthetic , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_synthetic_attribute == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_synthetic_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_synthetic_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->IsMethodSynthetic(method_oop, is_synthetic_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_IsMethodObsolete(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_obsolete_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(91);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(91);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_IsMethodObsolete , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is method",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_METHODID));
      }
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_obsolete_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is is_obsolete_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
  }
  err = jvmti_env->IsMethodObsolete(method_oop, is_obsolete_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  method=%s.%s", curr_thread_name, func_name, 
                    method_oop == NULL? "NULL" : method_oop->klass_name()->as_C_string(),
                    method_oop == NULL? "NULL" : method_oop->name()->as_C_string()
             );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetNativeMethodPrefix(jvmtiEnv* env,
            const char* prefix) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(73);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(73);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_set_native_method_prefix == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetNativeMethodPrefix , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  prefix='%s'", curr_thread_name, func_name, prefix);
  }
  err = jvmti_env->SetNativeMethodPrefix(prefix);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix='%s'", curr_thread_name, func_name, prefix);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  prefix='%s'", curr_thread_name, func_name, prefix);
  }
  err = jvmti_env->SetNativeMethodPrefix(prefix);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix='%s'", curr_thread_name, func_name, prefix);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_SetNativeMethodPrefixes(jvmtiEnv* env,
            jint prefix_count,
            char** prefixes) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(74);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(74);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_set_native_method_prefix == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetNativeMethodPrefixes , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (prefix_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is prefix_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (prefixes == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is prefixes",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
  }
  err = jvmti_env->SetNativeMethodPrefixes(prefix_count, prefixes);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (prefix_count < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is prefix_count",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (prefixes == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is prefixes",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
  }
  err = jvmti_env->SetNativeMethodPrefixes(prefix_count, prefixes);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  prefix_count=%d", curr_thread_name, func_name, prefix_count);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

  //
  // Raw Monitor functions
  // 

static jvmtiError JNICALL
jvmtiTrace_CreateRawMonitor(jvmtiEnv* env,
            const char* name,
            jrawMonitorID* monitor_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(31);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(31);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_CreateRawMonitor , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (name == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is name",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
  }
  err = jvmti_env->CreateRawMonitor(name, monitor_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (name == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is name",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
  }
  err = jvmti_env->CreateRawMonitor(name, monitor_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  name='%s'", curr_thread_name, func_name, name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_DestroyRawMonitor(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(32);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(32);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_DestroyRawMonitor , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->DestroyRawMonitor(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->DestroyRawMonitor(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RawMonitorEnter(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(33);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(33);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorEnter(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorEnter(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RawMonitorExit(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(34);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(34);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorExit(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorExit(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RawMonitorWait(jvmtiEnv* env,
            jrawMonitorID monitor,
            jlong millis) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(35);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(35);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s millis=%ld", curr_thread_name, func_name, rmonitor->get_name(), millis);
  }
  err = jvmti_env->RawMonitorWait(rmonitor, millis);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s millis=%ld", curr_thread_name, func_name, rmonitor->get_name(), millis);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s millis=%ld", curr_thread_name, func_name, rmonitor->get_name(), millis);
  }
  err = jvmti_env->RawMonitorWait(rmonitor, millis);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s millis=%ld", curr_thread_name, func_name, rmonitor->get_name(), millis);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RawMonitorNotify(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(36);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(36);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RawMonitorNotify , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorNotify(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorNotify(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_RawMonitorNotifyAll(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(37);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(37);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RawMonitorNotifyAll , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorNotifyAll(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - raw monitor is NULL",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR));
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is monitor - not a raw monitor 0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_MONITOR), rmonitor);
      }
      return JVMTI_ERROR_INVALID_MONITOR;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
  }
  err = jvmti_env->RawMonitorNotifyAll(rmonitor);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  monitor=%s", curr_thread_name, func_name, rmonitor->get_name());
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // JNI Function Interception functions
  // 

static jvmtiError JNICALL
jvmtiTrace_SetJNIFunctionTable(jvmtiEnv* env,
            const jniNativeInterface* function_table) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(120);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(120);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetJNIFunctionTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (function_table == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is function_table",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  function_table=0x%x", curr_thread_name, func_name, function_table);
  }
  err = jvmti_env->SetJNIFunctionTable(function_table);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  function_table=0x%x", curr_thread_name, func_name, function_table);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetJNIFunctionTable(jvmtiEnv* env,
            jniNativeInterface** function_table) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(121);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(121);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetJNIFunctionTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (function_table == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is function_table",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetJNIFunctionTable(function_table);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Event Management functions
  // 

static jvmtiError JNICALL
jvmtiTrace_SetEventCallbacks(jvmtiEnv* env,
            const jvmtiEventCallbacks* callbacks,
            jint size_of_callbacks) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(122);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(122);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetEventCallbacks , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (size_of_callbacks < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x", curr_thread_name, func_name, callbacks);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is size_of_callbacks",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x size_of_callbacks=%d", curr_thread_name, func_name, callbacks, size_of_callbacks);
  }
  err = jvmti_env->SetEventCallbacks(callbacks, size_of_callbacks);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x size_of_callbacks=%d", curr_thread_name, func_name, callbacks, size_of_callbacks);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (size_of_callbacks < 0) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x", curr_thread_name, func_name, callbacks);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is size_of_callbacks",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_ILLEGAL_ARGUMENT));
      }
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x size_of_callbacks=%d", curr_thread_name, func_name, callbacks, size_of_callbacks);
  }
  err = jvmti_env->SetEventCallbacks(callbacks, size_of_callbacks);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  callbacks=0x%x size_of_callbacks=%d", curr_thread_name, func_name, callbacks, size_of_callbacks);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_SetEventNotificationMode(jvmtiEnv* env,
            jvmtiEventMode mode,
            jvmtiEvent event_type,
            jthread event_thread,
             ...) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(2);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(2);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetEventNotificationMode , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  mode=%d:%s event_type=%d:%s", curr_thread_name, func_name, mode, 
                    JvmtiTrace::enum_name(jvmtiEventModeConstantNames, jvmtiEventModeConstantValues, mode), event_type, 
                    JvmtiTrace::event_name(event_type)
        );
  }
  err = jvmti_env->SetEventNotificationMode(mode, event_type, event_thread, NULL);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  mode=%d:%s event_type=%d:%s", curr_thread_name, func_name, mode, 
                    JvmtiTrace::enum_name(jvmtiEventModeConstantNames, jvmtiEventModeConstantValues, mode), event_type, 
                    JvmtiTrace::event_name(event_type)
        );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  mode=%d:%s event_type=%d:%s", curr_thread_name, func_name, mode, 
                    JvmtiTrace::enum_name(jvmtiEventModeConstantNames, jvmtiEventModeConstantValues, mode), event_type, 
                    JvmtiTrace::event_name(event_type)
        );
  }
  err = jvmti_env->SetEventNotificationMode(mode, event_type, event_thread, NULL);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  mode=%d:%s event_type=%d:%s", curr_thread_name, func_name, mode, 
                    JvmtiTrace::enum_name(jvmtiEventModeConstantNames, jvmtiEventModeConstantValues, mode), event_type, 
                    JvmtiTrace::event_name(event_type)
        );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GenerateEvents(jvmtiEnv* env,
            jvmtiEvent event_type) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(123);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(123);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GenerateEvents , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  event_type=%d:%s", curr_thread_name, func_name, event_type, 
                    JvmtiTrace::event_name(event_type)
        );
  }
  err = jvmti_env->GenerateEvents(event_type);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  event_type=%d:%s", curr_thread_name, func_name, event_type, 
                    JvmtiTrace::event_name(event_type)
        );
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Extension Mechanism functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetExtensionFunctions(jvmtiEnv* env,
            jint* extension_count_ptr,
            jvmtiExtensionFunctionInfo** extensions) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(124);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(124);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetExtensionFunctions , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (extension_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extension_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extensions",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetExtensionFunctions(extension_count_ptr, extensions);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (extension_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extension_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extensions",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetExtensionFunctions(extension_count_ptr, extensions);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetExtensionEvents(jvmtiEnv* env,
            jint* extension_count_ptr,
            jvmtiExtensionEventInfo** extensions) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(125);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(125);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetExtensionEvents , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (extension_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extension_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extensions",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetExtensionEvents(extension_count_ptr, extensions);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (extension_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extension_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is extensions",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetExtensionEvents(extension_count_ptr, extensions);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetExtensionEventCallback(jvmtiEnv* env,
            jint extension_event_index,
            jvmtiExtensionEvent callback) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(126);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(126);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetExtensionEventCallback , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  extension_event_index=%d", curr_thread_name, func_name, extension_event_index);
  }
  err = jvmti_env->SetExtensionEventCallback(extension_event_index, callback);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  extension_event_index=%d", curr_thread_name, func_name, extension_event_index);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  extension_event_index=%d", curr_thread_name, func_name, extension_event_index);
  }
  err = jvmti_env->SetExtensionEventCallback(extension_event_index, callback);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  extension_event_index=%d", curr_thread_name, func_name, extension_event_index);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Capability functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetPotentialCapabilities(jvmtiEnv* env,
            jvmtiCapabilities* capabilities_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(140);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(140);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetPotentialCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetPotentialCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetPotentialCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_AddCapabilities(jvmtiEnv* env,
            const jvmtiCapabilities* capabilities_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(142);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(142);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_AddCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
  }
  err = jvmti_env->AddCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
  }
  err = jvmti_env->AddCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_RelinquishCapabilities(jvmtiEnv* env,
            const jvmtiCapabilities* capabilities_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(143);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(143);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_RelinquishCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
  }
  err = jvmti_env->RelinquishCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
  }
  err = jvmti_env->RelinquishCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  capabilities_ptr=0x%x", curr_thread_name, func_name, capabilities_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetCapabilities(jvmtiEnv* env,
            jvmtiCapabilities* capabilities_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(89);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(89);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (capabilities_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is capabilities_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetCapabilities(capabilities_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

  //
  // Timers functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetCurrentThreadCpuTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(134);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(134);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || (!this_thread->is_Java_thread() && !this_thread->is_VM_thread())) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_thread_cpu_time == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetCurrentThreadCpuTimerInfo(info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetCurrentThreadCpuTime(jvmtiEnv* env,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(135);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(135);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || (!this_thread->is_Java_thread() && !this_thread->is_VM_thread())) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_thread_cpu_time == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (nanos_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is nanos_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetCurrentThreadCpuTime(nanos_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadCpuTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(136);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(136);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadCpuTimerInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_thread_cpu_time == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetThreadCpuTimerInfo(info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetThreadCpuTime(jvmtiEnv* env,
            jthread thread,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(137);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(137);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(!JvmtiEnv::is_vm_live()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    if (trace_flags) {
      tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
      JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
    }
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetThreadCpuTime , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_thread_cpu_time == 0) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_MUST_POSSESS_CAPABILITY));
    }
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - jthread resolved to NULL - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - oop is not a thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_INVALID_THREAD), thread);
      }
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is thread - not a Java thread - jthread = %0x%x",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_THREAD_NOT_ALIVE), thread);
      }
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (nanos_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is nanos_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
  }
  err = jvmti_env->GetThreadCpuTime(java_thread, nanos_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  thread=%s", curr_thread_name, func_name, 
                    JvmtiTrace::safe_get_thread_name(java_thread));
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(138);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(138);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetTimerInfo , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTimerInfo(info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (info_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is info_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTimerInfo(info_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetTime(jvmtiEnv* env,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(139);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(139);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetTime , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (nanos_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is nanos_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTime(nanos_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (nanos_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is nanos_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetTime(nanos_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetAvailableProcessors(jvmtiEnv* env,
            jint* processor_count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(144);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(144);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetAvailableProcessors , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (processor_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is processor_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetAvailableProcessors(processor_count_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (processor_count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is processor_count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetAvailableProcessors(processor_count_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Class Loader Search functions
  // 

static jvmtiError JNICALL
jvmtiTrace_AddToBootstrapClassLoaderSearch(jvmtiEnv* env,
            const char* segment) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(149);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(149);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_AddToBootstrapClassLoaderSearch , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (segment == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is segment",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
  }
  err = jvmti_env->AddToBootstrapClassLoaderSearch(segment);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (segment == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is segment",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
  }
  err = jvmti_env->AddToBootstrapClassLoaderSearch(segment);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_AddToSystemClassLoaderSearch(jvmtiEnv* env,
            const char* segment) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(151);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(151);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_AddToSystemClassLoaderSearch , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (segment == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is segment",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
  }
  err = jvmti_env->AddToSystemClassLoaderSearch(segment);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (segment == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is segment",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
  }
  err = jvmti_env->AddToSystemClassLoaderSearch(segment);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  segment='%s'", curr_thread_name, func_name, segment);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

  //
  // System Properties functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetSystemProperties(jvmtiEnv* env,
            jint* count_ptr,
            char*** property_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(130);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(130);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetSystemProperties , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (property_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetSystemProperties(count_ptr, property_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (count_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is count_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (property_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetSystemProperties(count_ptr, property_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetSystemProperty(jvmtiEnv* env,
            const char* property,
            char** value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(131);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(131);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetSystemProperty , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (property == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
  }
  err = jvmti_env->GetSystemProperty(property, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (property == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (value_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is value_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
  }
  err = jvmti_env->GetSystemProperty(property, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s'", curr_thread_name, func_name, property);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetSystemProperty(jvmtiEnv* env,
            const char* property,
            const char* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(132);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(132);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD) {
    if (trace_flags) {
          tty->print_cr("JVMTI [-] %s %s",  func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_WRONG_PHASE));
    }
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetSystemProperty , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (property == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  property='%s' value_ptr='%s'", curr_thread_name, func_name, property, value_ptr);
  }
  err = jvmti_env->SetSystemProperty(property, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s' value_ptr='%s'", curr_thread_name, func_name, property, value_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (property == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is property",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  property='%s' value_ptr='%s'", curr_thread_name, func_name, property, value_ptr);
  }
  err = jvmti_env->SetSystemProperty(property, value_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  property='%s' value_ptr='%s'", curr_thread_name, func_name, property, value_ptr);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // General functions
  // 

static jvmtiError JNICALL
jvmtiTrace_GetPhase(jvmtiEnv* env,
            jvmtiPhase* phase_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(133);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(133);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetPhase , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (phase_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is phase_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetPhase(phase_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (phase_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is phase_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetPhase(phase_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_DisposeEnvironment(jvmtiEnv* env) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(127);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(127);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_DisposeEnvironment , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->DisposeEnvironment();
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->DisposeEnvironment();
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_SetEnvironmentLocalStorage(jvmtiEnv* env,
            const void* data) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(148);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(148);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  data=0x%x", curr_thread_name, func_name, data);
  }
  err = jvmti_env->SetEnvironmentLocalStorage(data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  data=0x%x", curr_thread_name, func_name, data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  data=0x%x", curr_thread_name, func_name, data);
  }
  err = jvmti_env->SetEnvironmentLocalStorage(data);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  data=0x%x", curr_thread_name, func_name, data);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetEnvironmentLocalStorage(jvmtiEnv* env,
            void** data_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(147);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(147);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  Thread* this_thread = NULL;
  bool transition;
  if (Threads::number_of_threads() == 0) {
    transition = false;
  } else {
    this_thread = (Thread*)ThreadLocalStorage::thread();
    transition = ((this_thread != NULL) && !this_thread->is_VM_thread() && !this_thread->is_ConcurrentGC_thread());
  }
  if (transition) {
    if (!this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    if (data_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is data_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetEnvironmentLocalStorage(data_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (data_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is data_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetEnvironmentLocalStorage(data_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetVersionNumber(jvmtiEnv* env,
            jint* version_ptr) {
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(88);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(88);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetVersionNumber , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (version_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is version_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetVersionNumber(version_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (version_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is version_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetVersionNumber(version_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
}

static jvmtiError JNICALL
jvmtiTrace_GetErrorName(jvmtiEnv* env,
            jvmtiError error,
            char** name_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(128);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(128);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetErrorName , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (name_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is name_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
  }
  err = jvmti_env->GetErrorName(error, name_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (name_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is name_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
  }
  err = jvmti_env->GetErrorName(error, name_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  error=%d:%s", curr_thread_name, func_name, error, 
                    JvmtiUtil::error_name(error)
);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_SetVerboseFlag(jvmtiEnv* env,
            jvmtiVerboseFlag flag,
            jboolean value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(150);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(150);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_SetVerboseFlag , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  flag=%d:%s value=%s", curr_thread_name, func_name, flag, 
                    JvmtiTrace::enum_name(jvmtiVerboseFlagConstantNames, jvmtiVerboseFlagConstantValues, flag), value? "true" : "false");
  }
  err = jvmti_env->SetVerboseFlag(flag, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  flag=%d:%s value=%s", curr_thread_name, func_name, flag, 
                    JvmtiTrace::enum_name(jvmtiVerboseFlagConstantNames, jvmtiVerboseFlagConstantValues, flag), value? "true" : "false");
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
  
  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s {  flag=%d:%s value=%s", curr_thread_name, func_name, flag, 
                    JvmtiTrace::enum_name(jvmtiVerboseFlagConstantNames, jvmtiVerboseFlagConstantValues, flag), value? "true" : "false");
  }
  err = jvmti_env->SetVerboseFlag(flag, value);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s {  flag=%d:%s value=%s", curr_thread_name, func_name, flag, 
                    JvmtiTrace::enum_name(jvmtiVerboseFlagConstantNames, jvmtiVerboseFlagConstantValues, flag), value? "true" : "false");
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmtiTrace_GetJLocationFormat(jvmtiEnv* env,
            jvmtiJlocationFormat* format_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  SafeResourceMark rm;
  jint trace_flags = JvmtiTrace::trace_flags(129);
  const char *func_name;
  const char *curr_thread_name;
  if (trace_flags) {
    func_name = JvmtiTrace::function_name(129);
    curr_thread_name = JvmtiTrace::safe_get_current_thread_name();
  }

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    if (trace_flags) {
          tty->print_cr("JVMTI [%s] %s %s  env=%d",  curr_thread_name, func_name, 
                    JvmtiUtil::error_name(JVMTI_ERROR_INVALID_ENVIRONMENT), env);
    }
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      if (trace_flags) {
        tty->print_cr("JVMTI [non-attached thread] %s %s",  func_name,
        JvmtiUtil::error_name(JVMTI_ERROR_UNATTACHED_THREAD));
      }
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmtiTrace_GetJLocationFormat , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (format_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is format_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetJLocationFormat(format_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  } else {
    if (format_ptr == NULL) {
      if ((trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
        if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
      }
        tty->print_cr("JVMTI [%s] %s } %s - erroneous arg is format_ptr",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(JVMTI_ERROR_NULL_POINTER));
      }
      return JVMTI_ERROR_NULL_POINTER;
  }

  if ((trace_flags & JvmtiTrace::SHOW_IN) != 0) {
              tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
  }
  err = jvmti_env->GetJLocationFormat(format_ptr);
  if ( err != JVMTI_ERROR_NONE && (trace_flags & JvmtiTrace::SHOW_ERROR) != 0) {
      if ((trace_flags & JvmtiTrace::SHOW_IN) == 0) {
          tty->print_cr("JVMTI [%s] %s { ", curr_thread_name, func_name);
    }
    tty->print_cr("JVMTI [%s] %s } %s",  curr_thread_name, func_name, 
                  JvmtiUtil::error_name(err));
  } else if ((trace_flags & JvmtiTrace::SHOW_OUT) != 0) {
    tty->print_cr("JVMTI [%s] %s }",  curr_thread_name, func_name);
  }
  }
  return err;
#endif // JVMTI_KERNEL
}

} /* end extern "C" */

// JVMTI API functions
struct jvmtiInterface_1_ jvmtiTrace_Interface = {
                              /*   1 :  RESERVED */
      NULL,
                              /*   2 : Set Event Notification Mode */
      jvmtiTrace_SetEventNotificationMode,
                              /*   3 :  RESERVED */
      NULL,
                              /*   4 : Get All Threads */
      jvmtiTrace_GetAllThreads,
                              /*   5 : Suspend Thread */
      jvmtiTrace_SuspendThread,
                              /*   6 : Resume Thread */
      jvmtiTrace_ResumeThread,
                              /*   7 : Stop Thread */
      jvmtiTrace_StopThread,
                              /*   8 : Interrupt Thread */
      jvmtiTrace_InterruptThread,
                              /*   9 : Get Thread Info */
      jvmtiTrace_GetThreadInfo,
                              /*   10 : Get Owned Monitor Info */
      jvmtiTrace_GetOwnedMonitorInfo,
                              /*   11 : Get Current Contended Monitor */
      jvmtiTrace_GetCurrentContendedMonitor,
                              /*   12 : Run Agent Thread */
      jvmtiTrace_RunAgentThread,
                              /*   13 : Get Top Thread Groups */
      jvmtiTrace_GetTopThreadGroups,
                              /*   14 : Get Thread Group Info */
      jvmtiTrace_GetThreadGroupInfo,
                              /*   15 : Get Thread Group Children */
      jvmtiTrace_GetThreadGroupChildren,
                              /*   16 : Get Frame Count */
      jvmtiTrace_GetFrameCount,
                              /*   17 : Get Thread State */
      jvmtiTrace_GetThreadState,
                              /*   18 : Get Current Thread */
      jvmtiTrace_GetCurrentThread,
                              /*   19 : Get Frame Location */
      jvmtiTrace_GetFrameLocation,
                              /*   20 : Notify Frame Pop */
      jvmtiTrace_NotifyFramePop,
                              /*   21 : Get Local Variable - Object */
      jvmtiTrace_GetLocalObject,
                              /*   22 : Get Local Variable - Int */
      jvmtiTrace_GetLocalInt,
                              /*   23 : Get Local Variable - Long */
      jvmtiTrace_GetLocalLong,
                              /*   24 : Get Local Variable - Float */
      jvmtiTrace_GetLocalFloat,
                              /*   25 : Get Local Variable - Double */
      jvmtiTrace_GetLocalDouble,
                              /*   26 : Set Local Variable - Object */
      jvmtiTrace_SetLocalObject,
                              /*   27 : Set Local Variable - Int */
      jvmtiTrace_SetLocalInt,
                              /*   28 : Set Local Variable - Long */
      jvmtiTrace_SetLocalLong,
                              /*   29 : Set Local Variable - Float */
      jvmtiTrace_SetLocalFloat,
                              /*   30 : Set Local Variable - Double */
      jvmtiTrace_SetLocalDouble,
                              /*   31 : Create Raw Monitor */
      jvmtiTrace_CreateRawMonitor,
                              /*   32 : Destroy Raw Monitor */
      jvmtiTrace_DestroyRawMonitor,
                              /*   33 : Raw Monitor Enter */
      jvmtiTrace_RawMonitorEnter,
                              /*   34 : Raw Monitor Exit */
      jvmtiTrace_RawMonitorExit,
                              /*   35 : Raw Monitor Wait */
      jvmtiTrace_RawMonitorWait,
                              /*   36 : Raw Monitor Notify */
      jvmtiTrace_RawMonitorNotify,
                              /*   37 : Raw Monitor Notify All */
      jvmtiTrace_RawMonitorNotifyAll,
                              /*   38 : Set Breakpoint */
      jvmtiTrace_SetBreakpoint,
                              /*   39 : Clear Breakpoint */
      jvmtiTrace_ClearBreakpoint,
                              /*   40 :  RESERVED */
      NULL,
                              /*   41 : Set Field Access Watch */
      jvmtiTrace_SetFieldAccessWatch,
                              /*   42 : Clear Field Access Watch */
      jvmtiTrace_ClearFieldAccessWatch,
                              /*   43 : Set Field Modification Watch */
      jvmtiTrace_SetFieldModificationWatch,
                              /*   44 : Clear Field Modification Watch */
      jvmtiTrace_ClearFieldModificationWatch,
                              /*   45 : Is Modifiable Class */
      jvmtiTrace_IsModifiableClass,
                              /*   46 : Allocate */
      jvmtiTrace_Allocate,
                              /*   47 : Deallocate */
      jvmtiTrace_Deallocate,
                              /*   48 : Get Class Signature */
      jvmtiTrace_GetClassSignature,
                              /*   49 : Get Class Status */
      jvmtiTrace_GetClassStatus,
                              /*   50 : Get Source File Name */
      jvmtiTrace_GetSourceFileName,
                              /*   51 : Get Class Modifiers */
      jvmtiTrace_GetClassModifiers,
                              /*   52 : Get Class Methods */
      jvmtiTrace_GetClassMethods,
                              /*   53 : Get Class Fields */
      jvmtiTrace_GetClassFields,
                              /*   54 : Get Implemented Interfaces */
      jvmtiTrace_GetImplementedInterfaces,
                              /*   55 : Is Interface */
      jvmtiTrace_IsInterface,
                              /*   56 : Is Array Class */
      jvmtiTrace_IsArrayClass,
                              /*   57 : Get Class Loader */
      jvmtiTrace_GetClassLoader,
                              /*   58 : Get Object Hash Code */
      jvmtiTrace_GetObjectHashCode,
                              /*   59 : Get Object Monitor Usage */
      jvmtiTrace_GetObjectMonitorUsage,
                              /*   60 : Get Field Name (and Signature) */
      jvmtiTrace_GetFieldName,
                              /*   61 : Get Field Declaring Class */
      jvmtiTrace_GetFieldDeclaringClass,
                              /*   62 : Get Field Modifiers */
      jvmtiTrace_GetFieldModifiers,
                              /*   63 : Is Field Synthetic */
      jvmtiTrace_IsFieldSynthetic,
                              /*   64 : Get Method Name (and Signature) */
      jvmtiTrace_GetMethodName,
                              /*   65 : Get Method Declaring Class */
      jvmtiTrace_GetMethodDeclaringClass,
                              /*   66 : Get Method Modifiers */
      jvmtiTrace_GetMethodModifiers,
                              /*   67 :  RESERVED */
      NULL,
                              /*   68 : Get Max Locals */
      jvmtiTrace_GetMaxLocals,
                              /*   69 : Get Arguments Size */
      jvmtiTrace_GetArgumentsSize,
                              /*   70 : Get Line Number Table */
      jvmtiTrace_GetLineNumberTable,
                              /*   71 : Get Method Location */
      jvmtiTrace_GetMethodLocation,
                              /*   72 : Get Local Variable Table */
      jvmtiTrace_GetLocalVariableTable,
                              /*   73 : Set Native Method Prefix */
      jvmtiTrace_SetNativeMethodPrefix,
                              /*   74 : Set Native Method Prefixes */
      jvmtiTrace_SetNativeMethodPrefixes,
                              /*   75 : Get Bytecodes */
      jvmtiTrace_GetBytecodes,
                              /*   76 : Is Method Native */
      jvmtiTrace_IsMethodNative,
                              /*   77 : Is Method Synthetic */
      jvmtiTrace_IsMethodSynthetic,
                              /*   78 : Get Loaded Classes */
      jvmtiTrace_GetLoadedClasses,
                              /*   79 : Get Classloader Classes */
      jvmtiTrace_GetClassLoaderClasses,
                              /*   80 : Pop Frame */
      jvmtiTrace_PopFrame,
                              /*   81 : Force Early Return - Object */
      jvmtiTrace_ForceEarlyReturnObject,
                              /*   82 : Force Early Return - Int */
      jvmtiTrace_ForceEarlyReturnInt,
                              /*   83 : Force Early Return - Long */
      jvmtiTrace_ForceEarlyReturnLong,
                              /*   84 : Force Early Return - Float */
      jvmtiTrace_ForceEarlyReturnFloat,
                              /*   85 : Force Early Return - Double */
      jvmtiTrace_ForceEarlyReturnDouble,
                              /*   86 : Force Early Return - Void */
      jvmtiTrace_ForceEarlyReturnVoid,
                              /*   87 : Redefine Classes */
      jvmtiTrace_RedefineClasses,
                              /*   88 : Get Version Number */
      jvmtiTrace_GetVersionNumber,
                              /*   89 : Get Capabilities */
      jvmtiTrace_GetCapabilities,
                              /*   90 : Get Source Debug Extension */
      jvmtiTrace_GetSourceDebugExtension,
                              /*   91 : Is Method Obsolete */
      jvmtiTrace_IsMethodObsolete,
                              /*   92 : Suspend Thread List */
      jvmtiTrace_SuspendThreadList,
                              /*   93 : Resume Thread List */
      jvmtiTrace_ResumeThreadList,
                              /*   94 :  RESERVED */
      NULL,
                              /*   95 :  RESERVED */
      NULL,
                              /*   96 :  RESERVED */
      NULL,
                              /*   97 :  RESERVED */
      NULL,
                              /*   98 :  RESERVED */
      NULL,
                              /*   99 :  RESERVED */
      NULL,
                              /*   100 : Get All Stack Traces */
      jvmtiTrace_GetAllStackTraces,
                              /*   101 : Get Thread List Stack Traces */
      jvmtiTrace_GetThreadListStackTraces,
                              /*   102 : Get Thread Local Storage */
      jvmtiTrace_GetThreadLocalStorage,
                              /*   103 : Set Thread Local Storage */
      jvmtiTrace_SetThreadLocalStorage,
                              /*   104 : Get Stack Trace */
      jvmtiTrace_GetStackTrace,
                              /*   105 :  RESERVED */
      NULL,
                              /*   106 : Get Tag */
      jvmtiTrace_GetTag,
                              /*   107 : Set Tag */
      jvmtiTrace_SetTag,
                              /*   108 : Force Garbage Collection */
      jvmtiTrace_ForceGarbageCollection,
                              /*   109 : Iterate Over Objects Reachable From Object */
      jvmtiTrace_IterateOverObjectsReachableFromObject,
                              /*   110 : Iterate Over Reachable Objects */
      jvmtiTrace_IterateOverReachableObjects,
                              /*   111 : Iterate Over Heap */
      jvmtiTrace_IterateOverHeap,
                              /*   112 : Iterate Over Instances Of Class */
      jvmtiTrace_IterateOverInstancesOfClass,
                              /*   113 :  RESERVED */
      NULL,
                              /*   114 : Get Objects With Tags */
      jvmtiTrace_GetObjectsWithTags,
                              /*   115 : Follow References */
      jvmtiTrace_FollowReferences,
                              /*   116 : Iterate Through Heap */
      jvmtiTrace_IterateThroughHeap,
                              /*   117 :  RESERVED */
      NULL,
                              /*   118 :  RESERVED */
      NULL,
                              /*   119 :  RESERVED */
      NULL,
                              /*   120 : Set JNI Function Table */
      jvmtiTrace_SetJNIFunctionTable,
                              /*   121 : Get JNI Function Table */
      jvmtiTrace_GetJNIFunctionTable,
                              /*   122 : Set Event Callbacks */
      jvmtiTrace_SetEventCallbacks,
                              /*   123 : Generate Events */
      jvmtiTrace_GenerateEvents,
                              /*   124 : Get Extension Functions */
      jvmtiTrace_GetExtensionFunctions,
                              /*   125 : Get Extension Events */
      jvmtiTrace_GetExtensionEvents,
                              /*   126 : Set Extension Event Callback */
      jvmtiTrace_SetExtensionEventCallback,
                              /*   127 : Dispose Environment */
      jvmtiTrace_DisposeEnvironment,
                              /*   128 : Get Error Name */
      jvmtiTrace_GetErrorName,
                              /*   129 : Get JLocation Format */
      jvmtiTrace_GetJLocationFormat,
                              /*   130 : Get System Properties */
      jvmtiTrace_GetSystemProperties,
                              /*   131 : Get System Property */
      jvmtiTrace_GetSystemProperty,
                              /*   132 : Set System Property */
      jvmtiTrace_SetSystemProperty,
                              /*   133 : Get Phase */
      jvmtiTrace_GetPhase,
                              /*   134 : Get Current Thread CPU Timer Information */
      jvmtiTrace_GetCurrentThreadCpuTimerInfo,
                              /*   135 : Get Current Thread CPU Time */
      jvmtiTrace_GetCurrentThreadCpuTime,
                              /*   136 : Get Thread CPU Timer Information */
      jvmtiTrace_GetThreadCpuTimerInfo,
                              /*   137 : Get Thread CPU Time */
      jvmtiTrace_GetThreadCpuTime,
                              /*   138 : Get Timer Information */
      jvmtiTrace_GetTimerInfo,
                              /*   139 : Get Time */
      jvmtiTrace_GetTime,
                              /*   140 : Get Potential Capabilities */
      jvmtiTrace_GetPotentialCapabilities,
                              /*   141 :  RESERVED */
      NULL,
                              /*   142 : Add Capabilities */
      jvmtiTrace_AddCapabilities,
                              /*   143 : Relinquish Capabilities */
      jvmtiTrace_RelinquishCapabilities,
                              /*   144 : Get Available Processors */
      jvmtiTrace_GetAvailableProcessors,
                              /*   145 : Get Class Version Numbers */
      jvmtiTrace_GetClassVersionNumbers,
                              /*   146 : Get Constant Pool */
      jvmtiTrace_GetConstantPool,
                              /*   147 : Get Environment Local Storage */
      jvmtiTrace_GetEnvironmentLocalStorage,
                              /*   148 : Set Environment Local Storage */
      jvmtiTrace_SetEnvironmentLocalStorage,
                              /*   149 : Add To Bootstrap Class Loader Search */
      jvmtiTrace_AddToBootstrapClassLoaderSearch,
                              /*   150 : Set Verbose Flag */
      jvmtiTrace_SetVerboseFlag,
                              /*   151 : Add To System Class Loader Search */
      jvmtiTrace_AddToSystemClassLoaderSearch,
                              /*   152 : Retransform Classes */
      jvmtiTrace_RetransformClasses,
                              /*   153 : Get Owned Monitor Stack Depth Info */
      jvmtiTrace_GetOwnedMonitorStackDepthInfo,
                              /*   154 : Get Object Size */
      jvmtiTrace_GetObjectSize,
                              /*   155 : Get Local Instance */
      jvmtiTrace_GetLocalInstance
};

#endif /*JVMTI_TRACE */
