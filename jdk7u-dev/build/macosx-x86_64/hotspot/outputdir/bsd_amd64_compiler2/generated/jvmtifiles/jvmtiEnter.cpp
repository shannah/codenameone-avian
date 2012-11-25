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



// Error names
const char* JvmtiUtil::_error_names[] = {
  "JVMTI_ERROR_NONE",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_INVALID_THREAD",
  "JVMTI_ERROR_INVALID_THREAD_GROUP",
  "JVMTI_ERROR_INVALID_PRIORITY",
  "JVMTI_ERROR_THREAD_NOT_SUSPENDED",
  "JVMTI_ERROR_THREAD_SUSPENDED",
  "JVMTI_ERROR_THREAD_NOT_ALIVE",
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_INVALID_OBJECT",
  "JVMTI_ERROR_INVALID_CLASS",
  "JVMTI_ERROR_CLASS_NOT_PREPARED",
  "JVMTI_ERROR_INVALID_METHODID",
  "JVMTI_ERROR_INVALID_LOCATION",
  "JVMTI_ERROR_INVALID_FIELDID",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_NO_MORE_FRAMES",
  "JVMTI_ERROR_OPAQUE_FRAME",
  NULL,
  "JVMTI_ERROR_TYPE_MISMATCH",
  "JVMTI_ERROR_INVALID_SLOT",
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_DUPLICATE",
  "JVMTI_ERROR_NOT_FOUND",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_INVALID_MONITOR",
  "JVMTI_ERROR_NOT_MONITOR_OWNER",
  "JVMTI_ERROR_INTERRUPT",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_INVALID_CLASS_FORMAT",
  "JVMTI_ERROR_CIRCULAR_CLASS_DEFINITION",
  "JVMTI_ERROR_FAILS_VERIFICATION",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_METHOD_ADDED",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_SCHEMA_CHANGED",
  "JVMTI_ERROR_INVALID_TYPESTATE",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_HIERARCHY_CHANGED",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_METHOD_DELETED",
  "JVMTI_ERROR_UNSUPPORTED_VERSION",
  "JVMTI_ERROR_NAMES_DONT_MATCH",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_CLASS_MODIFIERS_CHANGED",
  "JVMTI_ERROR_UNSUPPORTED_REDEFINITION_METHOD_MODIFIERS_CHANGED",
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_UNMODIFIABLE_CLASS",
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
  "JVMTI_ERROR_NOT_AVAILABLE",
  "JVMTI_ERROR_MUST_POSSESS_CAPABILITY",
  "JVMTI_ERROR_NULL_POINTER",
  "JVMTI_ERROR_ABSENT_INFORMATION",
  "JVMTI_ERROR_INVALID_EVENT_TYPE",
  "JVMTI_ERROR_ILLEGAL_ARGUMENT",
  "JVMTI_ERROR_NATIVE_METHOD",
  NULL,
  "JVMTI_ERROR_CLASS_LOADER_UNSUPPORTED",
  NULL,
  NULL,
  NULL,
  "JVMTI_ERROR_OUT_OF_MEMORY",
  "JVMTI_ERROR_ACCESS_DENIED",
  "JVMTI_ERROR_WRONG_PHASE",
  "JVMTI_ERROR_INTERNAL",
  NULL,
  "JVMTI_ERROR_UNATTACHED_THREAD",
  "JVMTI_ERROR_INVALID_ENVIRONMENT"
};


// Event threaded
const bool JvmtiUtil::_event_threaded[] = {
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  true,
  false,
  true,
  true,
  false,
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  false,
  false,
  false,
  false,
  false,
  false,
  true,
  true,
  true,
  true,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false
};



// Check Event Capabilities
const bool JvmtiUtil::has_event_capability(jvmtiEvent event_type, const jvmtiCapabilities* capabilities_ptr) {
  switch (event_type) {
    case JVMTI_EVENT_SINGLE_STEP:
      return capabilities_ptr->can_generate_single_step_events != 0;
    case JVMTI_EVENT_BREAKPOINT:
      return capabilities_ptr->can_generate_breakpoint_events != 0;
    case JVMTI_EVENT_FIELD_ACCESS:
      return capabilities_ptr->can_generate_field_access_events != 0;
    case JVMTI_EVENT_FIELD_MODIFICATION:
      return capabilities_ptr->can_generate_field_modification_events != 0;
    case JVMTI_EVENT_FRAME_POP:
      return capabilities_ptr->can_generate_frame_pop_events != 0;
    case JVMTI_EVENT_METHOD_ENTRY:
      return capabilities_ptr->can_generate_method_entry_events != 0;
    case JVMTI_EVENT_METHOD_EXIT:
      return capabilities_ptr->can_generate_method_exit_events != 0;
    case JVMTI_EVENT_NATIVE_METHOD_BIND:
      return capabilities_ptr->can_generate_native_method_bind_events != 0;
    case JVMTI_EVENT_EXCEPTION:
      return capabilities_ptr->can_generate_exception_events != 0;
    case JVMTI_EVENT_EXCEPTION_CATCH:
      return capabilities_ptr->can_generate_exception_events != 0;
    case JVMTI_EVENT_COMPILED_METHOD_LOAD:
      return capabilities_ptr->can_generate_compiled_method_load_events != 0;
    case JVMTI_EVENT_COMPILED_METHOD_UNLOAD:
      return capabilities_ptr->can_generate_compiled_method_load_events != 0;
    case JVMTI_EVENT_MONITOR_CONTENDED_ENTER:
      return capabilities_ptr->can_generate_monitor_events != 0;
    case JVMTI_EVENT_MONITOR_CONTENDED_ENTERED:
      return capabilities_ptr->can_generate_monitor_events != 0;
    case JVMTI_EVENT_MONITOR_WAIT:
      return capabilities_ptr->can_generate_monitor_events != 0;
    case JVMTI_EVENT_MONITOR_WAITED:
      return capabilities_ptr->can_generate_monitor_events != 0;
    case JVMTI_EVENT_VM_OBJECT_ALLOC:
      return capabilities_ptr->can_generate_vm_object_alloc_events != 0;
    case JVMTI_EVENT_OBJECT_FREE:
      return capabilities_ptr->can_generate_object_free_events != 0;
    case JVMTI_EVENT_GARBAGE_COLLECTION_START:
      return capabilities_ptr->can_generate_garbage_collection_events != 0;
    case JVMTI_EVENT_GARBAGE_COLLECTION_FINISH:
      return capabilities_ptr->can_generate_garbage_collection_events != 0;
  }
  // if it does not have a capability it is required
  return JNI_TRUE;
}


extern "C" {


  //
  // Memory Management functions
  // 

static jvmtiError JNICALL
jvmti_Allocate(jvmtiEnv* env,
            jlong size,
            unsigned char** mem_ptr) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_Allocate , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (mem_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->Allocate(size, mem_ptr);
  } else {
    if (mem_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->Allocate(size, mem_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_Deallocate(jvmtiEnv* env,
            unsigned char* mem) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_Deallocate , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    err = jvmti_env->Deallocate(mem);
  } else {
    err = jvmti_env->Deallocate(mem);
  }
  return err;
}

  //
  // Thread functions
  // 

static jvmtiError JNICALL
jvmti_GetThreadState(jvmtiEnv* env,
            jthread thread,
            jint* thread_state_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadState , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_state_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadState(thread, thread_state_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetCurrentThread(jvmtiEnv* env,
            jthread* thread_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetCurrentThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCurrentThread(thread_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetAllThreads(jvmtiEnv* env,
            jint* threads_count_ptr,
            jthread** threads_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetAllThreads , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (threads_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (threads_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetAllThreads(threads_count_ptr, threads_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SuspendThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SuspendThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->SuspendThread(java_thread);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SuspendThreadList(jvmtiEnv* env,
            jint request_count,
            const jthread* request_list,
            jvmtiError* results) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SuspendThreadList , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (request_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (request_list == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (results == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SuspendThreadList(request_count, request_list, results);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ResumeThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ResumeThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  err = jvmti_env->ResumeThread(java_thread);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ResumeThreadList(jvmtiEnv* env,
            jint request_count,
            const jthread* request_list,
            jvmtiError* results) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ResumeThreadList , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_suspend == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (request_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (request_list == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (results == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->ResumeThreadList(request_count, request_list, results);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_StopThread(jvmtiEnv* env,
            jthread thread,
            jobject exception) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_StopThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_signal_thread == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  err = jvmti_env->StopThread(java_thread, exception);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_InterruptThread(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_InterruptThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_signal_thread == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  err = jvmti_env->InterruptThread(thread);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadInfo(jvmtiEnv* env,
            jthread thread,
            jvmtiThreadInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadInfo(thread, info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetOwnedMonitorInfo(jvmtiEnv* env,
            jthread thread,
            jint* owned_monitor_count_ptr,
            jobject** owned_monitors_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetOwnedMonitorInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_owned_monitor_info == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (owned_monitor_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (owned_monitors_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetOwnedMonitorInfo(java_thread, owned_monitor_count_ptr, owned_monitors_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetOwnedMonitorStackDepthInfo(jvmtiEnv* env,
            jthread thread,
            jint* monitor_info_count_ptr,
            jvmtiMonitorStackDepthInfo** monitor_info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetOwnedMonitorStackDepthInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_owned_monitor_stack_depth_info == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (monitor_info_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetOwnedMonitorStackDepthInfo(java_thread, monitor_info_count_ptr, monitor_info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetCurrentContendedMonitor(jvmtiEnv* env,
            jthread thread,
            jobject* monitor_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetCurrentContendedMonitor , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_contended_monitor == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (monitor_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCurrentContendedMonitor(java_thread, monitor_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RunAgentThread(jvmtiEnv* env,
            jthread thread,
            jvmtiStartFunction proc,
            const void* arg,
            jint priority) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_RunAgentThread , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (proc == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->RunAgentThread(thread, proc, arg, priority);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetThreadLocalStorage(jvmtiEnv* env,
            jthread thread,
            const void* data) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetThreadLocalStorage , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->SetThreadLocalStorage(java_thread, data);
  return err;
}

static jvmtiError JNICALL
jvmti_GetThreadLocalStorage(jvmtiEnv* env,
            jthread thread,
            void** data_ptr) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (data_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadLocalStorage(thread, data_ptr);
  return err;
}

  //
  // Thread Group functions
  // 

static jvmtiError JNICALL
jvmti_GetTopThreadGroups(jvmtiEnv* env,
            jint* group_count_ptr,
            jthreadGroup** groups_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetTopThreadGroups , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (group_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (groups_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTopThreadGroups(group_count_ptr, groups_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadGroupInfo(jvmtiEnv* env,
            jthreadGroup group,
            jvmtiThreadGroupInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadGroupInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadGroupInfo(group, info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadGroupChildren(jvmtiEnv* env,
            jthreadGroup group,
            jint* thread_count_ptr,
            jthread** threads_ptr,
            jint* group_count_ptr,
            jthreadGroup** groups_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadGroupChildren , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (threads_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (group_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (groups_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadGroupChildren(group, thread_count_ptr, threads_ptr, group_count_ptr, groups_ptr);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Stack Frame functions
  // 

static jvmtiError JNICALL
jvmti_GetStackTrace(jvmtiEnv* env,
            jthread thread,
            jint start_depth,
            jint max_frame_count,
            jvmtiFrameInfo* frame_buffer,
            jint* count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetStackTrace , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (max_frame_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (frame_buffer == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetStackTrace(java_thread, start_depth, max_frame_count, frame_buffer, count_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetAllStackTraces(jvmtiEnv* env,
            jint max_frame_count,
            jvmtiStackInfo** stack_info_ptr,
            jint* thread_count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetAllStackTraces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (max_frame_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (stack_info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (thread_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetAllStackTraces(max_frame_count, stack_info_ptr, thread_count_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadListStackTraces(jvmtiEnv* env,
            jint thread_count,
            const jthread* thread_list,
            jint max_frame_count,
            jvmtiStackInfo** stack_info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadListStackTraces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (thread_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (thread_list == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (max_frame_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (stack_info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadListStackTraces(thread_count, thread_list, max_frame_count, stack_info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetFrameCount(jvmtiEnv* env,
            jthread thread,
            jint* count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetFrameCount , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetFrameCount(java_thread, count_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_PopFrame(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_PopFrame , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_pop_frame == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  err = jvmti_env->PopFrame(java_thread);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetFrameLocation(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jmethodID* method_ptr,
            jlocation* location_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetFrameLocation , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (method_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (location_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetFrameLocation(java_thread, depth, method_ptr, location_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_NotifyFramePop(jvmtiEnv* env,
            jthread thread,
            jint depth) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_NotifyFramePop , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_frame_pop_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->NotifyFramePop(java_thread, depth);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Force Early Return functions
  // 

static jvmtiError JNICALL
jvmti_ForceEarlyReturnObject(jvmtiEnv* env,
            jthread thread,
            jobject value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnObject(java_thread, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceEarlyReturnInt(jvmtiEnv* env,
            jthread thread,
            jint value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnInt(java_thread, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceEarlyReturnLong(jvmtiEnv* env,
            jthread thread,
            jlong value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnLong(java_thread, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceEarlyReturnFloat(jvmtiEnv* env,
            jthread thread,
            jfloat value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnFloat(java_thread, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceEarlyReturnDouble(jvmtiEnv* env,
            jthread thread,
            jdouble value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnDouble(java_thread, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceEarlyReturnVoid(jvmtiEnv* env,
            jthread thread) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceEarlyReturnVoid , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_force_early_return == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  err = jvmti_env->ForceEarlyReturnVoid(java_thread);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Heap functions
  // 

static jvmtiError JNICALL
jvmti_FollowReferences(jvmtiEnv* env,
            jint heap_filter,
            jclass klass,
            jobject initial_object,
            const jvmtiHeapCallbacks* callbacks,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_FollowReferences , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (callbacks == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->FollowReferences(heap_filter, klass, initial_object, callbacks, user_data);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IterateThroughHeap(jvmtiEnv* env,
            jint heap_filter,
            jclass klass,
            const jvmtiHeapCallbacks* callbacks,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IterateThroughHeap , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (callbacks == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IterateThroughHeap(heap_filter, klass, callbacks, user_data);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetTag(jvmtiEnv* env,
            jobject object,
            jlong* tag_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetTag , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (tag_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTag(object, tag_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetTag(jvmtiEnv* env,
            jobject object,
            jlong tag) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetTag , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  err = jvmti_env->SetTag(object, tag);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetObjectsWithTags(jvmtiEnv* env,
            jint tag_count,
            const jlong* tags,
            jint* count_ptr,
            jobject** object_result_ptr,
            jlong** tag_result_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetObjectsWithTags , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (tag_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (tags == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetObjectsWithTags(tag_count, tags, count_ptr, object_result_ptr, tag_result_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ForceGarbageCollection(jvmtiEnv* env) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ForceGarbageCollection , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  err = jvmti_env->ForceGarbageCollection();
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Heap (1.0) functions
  // 

static jvmtiError JNICALL
jvmti_IterateOverObjectsReachableFromObject(jvmtiEnv* env,
            jobject object,
            jvmtiObjectReferenceCallback object_reference_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IterateOverObjectsReachableFromObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (object_reference_callback == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IterateOverObjectsReachableFromObject(object, object_reference_callback, user_data);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IterateOverReachableObjects(jvmtiEnv* env,
            jvmtiHeapRootCallback heap_root_callback,
            jvmtiStackReferenceCallback stack_ref_callback,
            jvmtiObjectReferenceCallback object_ref_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IterateOverReachableObjects , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  err = jvmti_env->IterateOverReachableObjects(heap_root_callback, stack_ref_callback, object_ref_callback, user_data);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IterateOverHeap(jvmtiEnv* env,
            jvmtiHeapObjectFilter object_filter,
            jvmtiHeapObjectCallback heap_object_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IterateOverHeap , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (heap_object_callback == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IterateOverHeap(object_filter, heap_object_callback, user_data);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IterateOverInstancesOfClass(jvmtiEnv* env,
            jclass klass,
            jvmtiHeapObjectFilter object_filter,
            jvmtiHeapObjectCallback heap_object_callback,
            const void* user_data) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IterateOverInstancesOfClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_tag_objects == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (heap_object_callback == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IterateOverInstancesOfClass(k_mirror, object_filter, heap_object_callback, user_data);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Local Variable functions
  // 

static jvmtiError JNICALL
jvmti_GetLocalObject(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jobject* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalObject(java_thread, depth, slot, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalInstance(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jobject* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalInstance , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalInstance(java_thread, depth, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalInt(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jint* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalInt(java_thread, depth, slot, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalLong(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jlong* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalLong(java_thread, depth, slot, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalFloat(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jfloat* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalFloat(java_thread, depth, slot, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalDouble(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jdouble* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalDouble(java_thread, depth, slot, value_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetLocalObject(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jobject value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetLocalObject , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetLocalObject(java_thread, depth, slot, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetLocalInt(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jint value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetLocalInt , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetLocalInt(java_thread, depth, slot, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetLocalLong(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jlong value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetLocalLong , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetLocalLong(java_thread, depth, slot, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetLocalFloat(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jfloat value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetLocalFloat , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetLocalFloat(java_thread, depth, slot, value);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetLocalDouble(jvmtiEnv* env,
            jthread thread,
            jint depth,
            jint slot,
            jdouble value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetLocalDouble , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }

  if (depth < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetLocalDouble(java_thread, depth, slot, value);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Breakpoint functions
  // 

static jvmtiError JNICALL
jvmti_SetBreakpoint(jvmtiEnv* env,
            jmethodID method,
            jlocation location) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetBreakpoint , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_breakpoint_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  err = jvmti_env->SetBreakpoint(method_oop, location);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ClearBreakpoint(jvmtiEnv* env,
            jmethodID method,
            jlocation location) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ClearBreakpoint , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_breakpoint_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  err = jvmti_env->ClearBreakpoint(method_oop, location);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Watched Field functions
  // 

static jvmtiError JNICALL
jvmti_SetFieldAccessWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetFieldAccessWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_access_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  err = jvmti_env->SetFieldAccessWatch(&fdesc);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ClearFieldAccessWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ClearFieldAccessWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_access_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  err = jvmti_env->ClearFieldAccessWatch(&fdesc);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetFieldModificationWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetFieldModificationWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_modification_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  err = jvmti_env->SetFieldModificationWatch(&fdesc);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_ClearFieldModificationWatch(jvmtiEnv* env,
            jclass klass,
            jfieldID field) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_ClearFieldModificationWatch , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_generate_field_modification_events == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  err = jvmti_env->ClearFieldModificationWatch(&fdesc);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Class functions
  // 

static jvmtiError JNICALL
jvmti_GetLoadedClasses(jvmtiEnv* env,
            jint* class_count_ptr,
            jclass** classes_ptr) {
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLoadedClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (class_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (classes_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLoadedClasses(class_count_ptr, classes_ptr);
  return err;
}

static jvmtiError JNICALL
jvmti_GetClassLoaderClasses(jvmtiEnv* env,
            jobject initiating_loader,
            jint* class_count_ptr,
            jclass** classes_ptr) {
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassLoaderClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (class_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (classes_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassLoaderClasses(initiating_loader, class_count_ptr, classes_ptr);
  return err;
}

static jvmtiError JNICALL
jvmti_GetClassSignature(jvmtiEnv* env,
            jclass klass,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassSignature , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  err = jvmti_env->GetClassSignature(k_mirror, signature_ptr, generic_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetClassStatus(jvmtiEnv* env,
            jclass klass,
            jint* status_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassStatus , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (status_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassStatus(k_mirror, status_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetSourceFileName(jvmtiEnv* env,
            jclass klass,
            char** source_name_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetSourceFileName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_source_file_name == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (source_name_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSourceFileName(k_mirror, source_name_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetClassModifiers(jvmtiEnv* env,
            jclass klass,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (modifiers_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassModifiers(k_mirror, modifiers_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetClassMethods(jvmtiEnv* env,
            jclass klass,
            jint* method_count_ptr,
            jmethodID** methods_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassMethods , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (method_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (methods_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassMethods(k_mirror, method_count_ptr, methods_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetClassFields(jvmtiEnv* env,
            jclass klass,
            jint* field_count_ptr,
            jfieldID** fields_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassFields , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (field_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (fields_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassFields(k_mirror, field_count_ptr, fields_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetImplementedInterfaces(jvmtiEnv* env,
            jclass klass,
            jint* interface_count_ptr,
            jclass** interfaces_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetImplementedInterfaces , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (interface_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (interfaces_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetImplementedInterfaces(k_mirror, interface_count_ptr, interfaces_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetClassVersionNumbers(jvmtiEnv* env,
            jclass klass,
            jint* minor_version_ptr,
            jint* major_version_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassVersionNumbers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (minor_version_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (major_version_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassVersionNumbers(k_mirror, minor_version_ptr, major_version_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetConstantPool(jvmtiEnv* env,
            jclass klass,
            jint* constant_pool_count_ptr,
            jint* constant_pool_byte_count_ptr,
            unsigned char** constant_pool_bytes_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetConstantPool , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_constant_pool == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (constant_pool_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (constant_pool_byte_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (constant_pool_bytes_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetConstantPool(k_mirror, constant_pool_count_ptr, constant_pool_byte_count_ptr, constant_pool_bytes_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsInterface(jvmtiEnv* env,
            jclass klass,
            jboolean* is_interface_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsInterface , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_interface_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsInterface(k_mirror, is_interface_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsArrayClass(jvmtiEnv* env,
            jclass klass,
            jboolean* is_array_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsArrayClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_array_class_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsArrayClass(k_mirror, is_array_class_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsModifiableClass(jvmtiEnv* env,
            jclass klass,
            jboolean* is_modifiable_class_ptr) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsModifiableClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (is_modifiable_class_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsModifiableClass(k_mirror, is_modifiable_class_ptr);
  return err;
}

static jvmtiError JNICALL
jvmti_GetClassLoader(jvmtiEnv* env,
            jclass klass,
            jobject* classloader_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetClassLoader , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (classloader_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetClassLoader(k_mirror, classloader_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetSourceDebugExtension(jvmtiEnv* env,
            jclass klass,
            char** source_debug_extension_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetSourceDebugExtension , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_source_debug_extension == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (source_debug_extension_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSourceDebugExtension(k_mirror, source_debug_extension_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RetransformClasses(jvmtiEnv* env,
            jint class_count,
            const jclass* classes) {
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_RetransformClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_retransform_classes == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (class_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (classes == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->RetransformClasses(class_count, classes);
  return err;
}

static jvmtiError JNICALL
jvmti_RedefineClasses(jvmtiEnv* env,
            jint class_count,
            const jvmtiClassDefinition* class_definitions) {
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_RedefineClasses , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_redefine_classes == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (class_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (class_definitions == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->RedefineClasses(class_count, class_definitions);
  return err;
}

  //
  // Object functions
  // 

static jvmtiError JNICALL
jvmti_GetObjectSize(jvmtiEnv* env,
            jobject object,
            jlong* size_ptr) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetObjectSize , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (size_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetObjectSize(object, size_ptr);
  return err;
}

static jvmtiError JNICALL
jvmti_GetObjectHashCode(jvmtiEnv* env,
            jobject object,
            jint* hash_code_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetObjectHashCode , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (hash_code_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetObjectHashCode(object, hash_code_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetObjectMonitorUsage(jvmtiEnv* env,
            jobject object,
            jvmtiMonitorUsage* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetObjectMonitorUsage , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_monitor_info == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetObjectMonitorUsage(object, info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Field functions
  // 

static jvmtiError JNICALL
jvmti_GetFieldName(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            char** name_ptr,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetFieldName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  err = jvmti_env->GetFieldName(&fdesc, name_ptr, signature_ptr, generic_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetFieldDeclaringClass(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jclass* declaring_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetFieldDeclaringClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (declaring_class_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetFieldDeclaringClass(&fdesc, declaring_class_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetFieldModifiers(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetFieldModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (modifiers_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetFieldModifiers(&fdesc, modifiers_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsFieldSynthetic(jvmtiEnv* env,
            jclass klass,
            jfieldID field,
            jboolean* is_synthetic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsFieldSynthetic , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_synthetic_attribute == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  oop k_mirror = JNIHandles::resolve_external_guard(klass);
  if (k_mirror == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  if (!k_mirror->is_a(SystemDictionary::Class_klass())) {
      return JVMTI_ERROR_INVALID_CLASS;
  }

  if (java_lang_Class::is_primitive(k_mirror)) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
      return JVMTI_ERROR_INVALID_CLASS;
  }
  ResourceMark rm_fdesc(current_thread);
  fieldDescriptor fdesc;
  if (!JvmtiEnv::get_field_descriptor(k_oop, field, &fdesc)) {
      return JVMTI_ERROR_INVALID_FIELDID;
  }
  if (is_synthetic_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsFieldSynthetic(&fdesc, is_synthetic_ptr);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Method functions
  // 

static jvmtiError JNICALL
jvmti_GetMethodName(jvmtiEnv* env,
            jmethodID method,
            char** name_ptr,
            char** signature_ptr,
            char** generic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetMethodName , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  err = jvmti_env->GetMethodName(method_oop, name_ptr, signature_ptr, generic_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetMethodDeclaringClass(jvmtiEnv* env,
            jmethodID method,
            jclass* declaring_class_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetMethodDeclaringClass , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (declaring_class_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetMethodDeclaringClass(method_oop, declaring_class_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetMethodModifiers(jvmtiEnv* env,
            jmethodID method,
            jint* modifiers_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetMethodModifiers , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (modifiers_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetMethodModifiers(method_oop, modifiers_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetMaxLocals(jvmtiEnv* env,
            jmethodID method,
            jint* max_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetMaxLocals , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (max_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetMaxLocals(method_oop, max_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetArgumentsSize(jvmtiEnv* env,
            jmethodID method,
            jint* size_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetArgumentsSize , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (size_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetArgumentsSize(method_oop, size_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLineNumberTable(jvmtiEnv* env,
            jmethodID method,
            jint* entry_count_ptr,
            jvmtiLineNumberEntry** table_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLineNumberTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_line_numbers == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (entry_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (table_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLineNumberTable(method_oop, entry_count_ptr, table_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetMethodLocation(jvmtiEnv* env,
            jmethodID method,
            jlocation* start_location_ptr,
            jlocation* end_location_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetMethodLocation , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (start_location_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (end_location_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetMethodLocation(method_oop, start_location_ptr, end_location_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetLocalVariableTable(jvmtiEnv* env,
            jmethodID method,
            jint* entry_count_ptr,
            jvmtiLocalVariableEntry** table_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetLocalVariableTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_access_local_variables == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (entry_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (table_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetLocalVariableTable(method_oop, entry_count_ptr, table_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetBytecodes(jvmtiEnv* env,
            jmethodID method,
            jint* bytecode_count_ptr,
            unsigned char** bytecodes_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetBytecodes , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_bytecodes == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (method_oop->is_native()) {
    return JVMTI_ERROR_NATIVE_METHOD;
  }
  if (bytecode_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (bytecodes_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetBytecodes(method_oop, bytecode_count_ptr, bytecodes_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsMethodNative(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_native_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsMethodNative , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_native_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsMethodNative(method_oop, is_native_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsMethodSynthetic(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_synthetic_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsMethodSynthetic , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_synthetic_attribute == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_synthetic_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsMethodSynthetic(method_oop, is_synthetic_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_IsMethodObsolete(jvmtiEnv* env,
            jmethodID method,
            jboolean* is_obsolete_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_IsMethodObsolete , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  methodOop method_oop = JNIHandles::checked_resolve_jmethod_id(method);
  if (method_oop == NULL) {
      return JVMTI_ERROR_INVALID_METHODID;
  }
  if (is_obsolete_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->IsMethodObsolete(method_oop, is_obsolete_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetNativeMethodPrefix(jvmtiEnv* env,
            const char* prefix) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_set_native_method_prefix == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetNativeMethodPrefix , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    err = jvmti_env->SetNativeMethodPrefix(prefix);
  } else {
    err = jvmti_env->SetNativeMethodPrefix(prefix);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_SetNativeMethodPrefixes(jvmtiEnv* env,
            jint prefix_count,
            char** prefixes) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_set_native_method_prefix == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetNativeMethodPrefixes , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (prefix_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (prefixes == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SetNativeMethodPrefixes(prefix_count, prefixes);
  } else {
    if (prefix_count < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  if (prefixes == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SetNativeMethodPrefixes(prefix_count, prefixes);
  }
  return err;
}

  //
  // Raw Monitor functions
  // 

static jvmtiError JNICALL
jvmti_CreateRawMonitor(jvmtiEnv* env,
            const char* name,
            jrawMonitorID* monitor_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_CreateRawMonitor , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (name == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->CreateRawMonitor(name, monitor_ptr);
  } else {
    if (name == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (monitor_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->CreateRawMonitor(name, monitor_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_DestroyRawMonitor(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_DestroyRawMonitor , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->DestroyRawMonitor(rmonitor);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->DestroyRawMonitor(rmonitor);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RawMonitorEnter(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorEnter(rmonitor);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorEnter(rmonitor);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RawMonitorExit(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorExit(rmonitor);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorExit(rmonitor);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RawMonitorWait(jvmtiEnv* env,
            jrawMonitorID monitor,
            jlong millis) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorWait(rmonitor, millis);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorWait(rmonitor, millis);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RawMonitorNotify(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_RawMonitorNotify , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorNotify(rmonitor);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorNotify(rmonitor);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_RawMonitorNotifyAll(jvmtiEnv* env,
            jrawMonitorID monitor) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_RawMonitorNotifyAll , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorNotifyAll(rmonitor);
  } else {
    JvmtiRawMonitor *rmonitor = (JvmtiRawMonitor *)monitor;
  if (rmonitor == NULL) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  if (!rmonitor->is_valid()) {
      return JVMTI_ERROR_INVALID_MONITOR;
  }
  err = jvmti_env->RawMonitorNotifyAll(rmonitor);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // JNI Function Interception functions
  // 

static jvmtiError JNICALL
jvmti_SetJNIFunctionTable(jvmtiEnv* env,
            const jniNativeInterface* function_table) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_SetJNIFunctionTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (function_table == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SetJNIFunctionTable(function_table);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetJNIFunctionTable(jvmtiEnv* env,
            jniNativeInterface** function_table) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetJNIFunctionTable , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (function_table == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetJNIFunctionTable(function_table);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Event Management functions
  // 

static jvmtiError JNICALL
jvmti_SetEventCallbacks(jvmtiEnv* env,
            const jvmtiEventCallbacks* callbacks,
            jint size_of_callbacks) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetEventCallbacks , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (size_of_callbacks < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetEventCallbacks(callbacks, size_of_callbacks);
  } else {
    if (size_of_callbacks < 0) {
      return JVMTI_ERROR_ILLEGAL_ARGUMENT;
  }
  err = jvmti_env->SetEventCallbacks(callbacks, size_of_callbacks);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_SetEventNotificationMode(jvmtiEnv* env,
            jvmtiEventMode mode,
            jvmtiEvent event_type,
            jthread event_thread,
             ...) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetEventNotificationMode , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    err = jvmti_env->SetEventNotificationMode(mode, event_type, event_thread, NULL);
  } else {
    err = jvmti_env->SetEventNotificationMode(mode, event_type, event_thread, NULL);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_GenerateEvents(jvmtiEnv* env,
            jvmtiEvent event_type) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GenerateEvents , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  err = jvmti_env->GenerateEvents(event_type);
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Extension Mechanism functions
  // 

static jvmtiError JNICALL
jvmti_GetExtensionFunctions(jvmtiEnv* env,
            jint* extension_count_ptr,
            jvmtiExtensionFunctionInfo** extensions) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetExtensionFunctions , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (extension_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetExtensionFunctions(extension_count_ptr, extensions);
  } else {
    if (extension_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetExtensionFunctions(extension_count_ptr, extensions);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetExtensionEvents(jvmtiEnv* env,
            jint* extension_count_ptr,
            jvmtiExtensionEventInfo** extensions) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetExtensionEvents , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (extension_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetExtensionEvents(extension_count_ptr, extensions);
  } else {
    if (extension_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (extensions == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetExtensionEvents(extension_count_ptr, extensions);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetExtensionEventCallback(jvmtiEnv* env,
            jint extension_event_index,
            jvmtiExtensionEvent callback) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetExtensionEventCallback , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    err = jvmti_env->SetExtensionEventCallback(extension_event_index, callback);
  } else {
    err = jvmti_env->SetExtensionEventCallback(extension_event_index, callback);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Capability functions
  // 

static jvmtiError JNICALL
jvmti_GetPotentialCapabilities(jvmtiEnv* env,
            jvmtiCapabilities* capabilities_ptr) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetPotentialCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetPotentialCapabilities(capabilities_ptr);
  } else {
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetPotentialCapabilities(capabilities_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_AddCapabilities(jvmtiEnv* env,
            const jvmtiCapabilities* capabilities_ptr) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_AddCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddCapabilities(capabilities_ptr);
  } else {
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddCapabilities(capabilities_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_RelinquishCapabilities(jvmtiEnv* env,
            const jvmtiCapabilities* capabilities_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_RelinquishCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->RelinquishCapabilities(capabilities_ptr);
  } else {
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->RelinquishCapabilities(capabilities_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetCapabilities(jvmtiEnv* env,
            jvmtiCapabilities* capabilities_ptr) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetCapabilities , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCapabilities(capabilities_ptr);
  } else {
    if (capabilities_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCapabilities(capabilities_ptr);
  }
  return err;
}

  //
  // Timers functions
  // 

static jvmtiError JNICALL
jvmti_GetCurrentThreadCpuTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || (!this_thread->is_Java_thread() && !this_thread->is_VM_thread())) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_thread_cpu_time == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCurrentThreadCpuTimerInfo(info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetCurrentThreadCpuTime(jvmtiEnv* env,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_START && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || (!this_thread->is_Java_thread() && !this_thread->is_VM_thread())) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_current_thread_cpu_time == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (nanos_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetCurrentThreadCpuTime(nanos_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadCpuTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadCpuTimerInfo , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_thread_cpu_time == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadCpuTimerInfo(info_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetThreadCpuTime(jvmtiEnv* env,
            jthread thread,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(!JvmtiEnv::is_vm_live()) {
    return JVMTI_ERROR_WRONG_PHASE;
  }  
  Thread* this_thread = (Thread*)ThreadLocalStorage::thread(); 
  if (this_thread == NULL || !this_thread->is_Java_thread()) {
    return JVMTI_ERROR_UNATTACHED_THREAD;
  }
  JavaThread* current_thread = (JavaThread*)this_thread;
  ThreadInVMfromNative __tiv(current_thread);
  VM_ENTRY_BASE(jvmtiError, jvmti_GetThreadCpuTime , current_thread)
  debug_only(VMNativeEntryWrapper __vew;)
  CautiouslyPreserveExceptionMark __em(this_thread);
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }

  if (jvmti_env->get_capabilities()->can_get_thread_cpu_time == 0) {
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  jvmtiError err;
  JavaThread* java_thread;
  if (thread == NULL) {
    java_thread = current_thread;
  } else {
    oop thread_oop = JNIHandles::resolve_external_guard(thread);
    if (thread_oop == NULL) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    if (!thread_oop->is_a(SystemDictionary::Thread_klass())) {
      return JVMTI_ERROR_INVALID_THREAD;
    }
    java_thread = java_lang_Thread::thread(thread_oop); 
    if (java_thread == NULL) {
      return JVMTI_ERROR_THREAD_NOT_ALIVE;
    }
  }
  if (nanos_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetThreadCpuTime(java_thread, nanos_ptr);
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetTimerInfo(jvmtiEnv* env,
            jvmtiTimerInfo* info_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetTimerInfo , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTimerInfo(info_ptr);
  } else {
    if (info_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTimerInfo(info_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetTime(jvmtiEnv* env,
            jlong* nanos_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetTime , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    if (nanos_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTime(nanos_ptr);
  } else {
    if (nanos_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetTime(nanos_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetAvailableProcessors(jvmtiEnv* env,
            jint* processor_count_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetAvailableProcessors , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (processor_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetAvailableProcessors(processor_count_ptr);
  } else {
    if (processor_count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetAvailableProcessors(processor_count_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // Class Loader Search functions
  // 

static jvmtiError JNICALL
jvmti_AddToBootstrapClassLoaderSearch(jvmtiEnv* env,
            const char* segment) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_AddToBootstrapClassLoaderSearch , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (segment == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddToBootstrapClassLoaderSearch(segment);
  } else {
    if (segment == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddToBootstrapClassLoaderSearch(segment);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_AddToSystemClassLoaderSearch(jvmtiEnv* env,
            const char* segment) {
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_AddToSystemClassLoaderSearch , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (segment == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddToSystemClassLoaderSearch(segment);
  } else {
    if (segment == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->AddToSystemClassLoaderSearch(segment);
  }
  return err;
}

  //
  // System Properties functions
  // 

static jvmtiError JNICALL
jvmti_GetSystemProperties(jvmtiEnv* env,
            jint* count_ptr,
            char*** property_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetSystemProperties , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (property_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSystemProperties(count_ptr, property_ptr);
  } else {
    if (count_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (property_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSystemProperties(count_ptr, property_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetSystemProperty(jvmtiEnv* env,
            const char* property,
            char** value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD && JvmtiEnv::get_phase()!=JVMTI_PHASE_LIVE) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetSystemProperty , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (property == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSystemProperty(property, value_ptr);
  } else {
    if (property == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  if (value_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetSystemProperty(property, value_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetSystemProperty(jvmtiEnv* env,
            const char* property,
            const char* value_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 
  if(JvmtiEnv::get_phase()!=JVMTI_PHASE_ONLOAD) {
    return JVMTI_ERROR_WRONG_PHASE;
  }
  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetSystemProperty , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (property == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SetSystemProperty(property, value_ptr);
  } else {
    if (property == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->SetSystemProperty(property, value_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

  //
  // General functions
  // 

static jvmtiError JNICALL
jvmti_GetPhase(jvmtiEnv* env,
            jvmtiPhase* phase_ptr) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetPhase , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (phase_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetPhase(phase_ptr);
  } else {
    if (phase_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetPhase(phase_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_DisposeEnvironment(jvmtiEnv* env) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_DisposeEnvironment , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    err = jvmti_env->DisposeEnvironment();
  } else {
    err = jvmti_env->DisposeEnvironment();
  }
  return err;
}

static jvmtiError JNICALL
jvmti_SetEnvironmentLocalStorage(jvmtiEnv* env,
            const void* data) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    err = jvmti_env->SetEnvironmentLocalStorage(data);
  } else {
    err = jvmti_env->SetEnvironmentLocalStorage(data);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_GetEnvironmentLocalStorage(jvmtiEnv* env,
            void** data_ptr) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
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
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    
    if (data_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetEnvironmentLocalStorage(data_ptr);
  } else {
    if (data_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetEnvironmentLocalStorage(data_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_GetVersionNumber(jvmtiEnv* env,
            jint* version_ptr) {

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetVersionNumber , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (version_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetVersionNumber(version_ptr);
  } else {
    if (version_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetVersionNumber(version_ptr);
  }
  return err;
}

static jvmtiError JNICALL
jvmti_GetErrorName(jvmtiEnv* env,
            jvmtiError error,
            char** name_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetErrorName , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (name_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetErrorName(error, name_ptr);
  } else {
    if (name_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetErrorName(error, name_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_SetVerboseFlag(jvmtiEnv* env,
            jvmtiVerboseFlag flag,
            jboolean value) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_SetVerboseFlag , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    err = jvmti_env->SetVerboseFlag(flag, value);
  } else {
    err = jvmti_env->SetVerboseFlag(flag, value);
  }
  return err;
#endif // JVMTI_KERNEL
}

static jvmtiError JNICALL
jvmti_GetJLocationFormat(jvmtiEnv* env,
            jvmtiJlocationFormat* format_ptr) {

#ifdef JVMTI_KERNEL 
  return JVMTI_ERROR_NOT_AVAILABLE; 
#else 

  JvmtiEnv* jvmti_env = JvmtiEnv::JvmtiEnv_from_jvmti_env(env);
  if (!jvmti_env->is_valid()) {
    return JVMTI_ERROR_INVALID_ENVIRONMENT;
  }
  jvmtiError err;
  if (Threads::number_of_threads() != 0) {
    Thread* this_thread = (Thread*)ThreadLocalStorage::thread();
    if (this_thread == NULL || !this_thread->is_Java_thread()) {
      return JVMTI_ERROR_UNATTACHED_THREAD;
    }
    JavaThread* current_thread = (JavaThread*)this_thread;
    ThreadInVMfromNative __tiv(current_thread);
    VM_ENTRY_BASE(jvmtiError, jvmti_GetJLocationFormat , current_thread)
    debug_only(VMNativeEntryWrapper __vew;)
    CautiouslyPreserveExceptionMark __em(this_thread);
    if (format_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetJLocationFormat(format_ptr);
  } else {
    if (format_ptr == NULL) {
      return JVMTI_ERROR_NULL_POINTER;
  }
  err = jvmti_env->GetJLocationFormat(format_ptr);
  }
  return err;
#endif // JVMTI_KERNEL
}

} /* end extern "C" */

// JVMTI API functions
struct jvmtiInterface_1_ jvmti_Interface = {
                              /*   1 :  RESERVED */
      NULL,
                              /*   2 : Set Event Notification Mode */
      jvmti_SetEventNotificationMode,
                              /*   3 :  RESERVED */
      NULL,
                              /*   4 : Get All Threads */
      jvmti_GetAllThreads,
                              /*   5 : Suspend Thread */
      jvmti_SuspendThread,
                              /*   6 : Resume Thread */
      jvmti_ResumeThread,
                              /*   7 : Stop Thread */
      jvmti_StopThread,
                              /*   8 : Interrupt Thread */
      jvmti_InterruptThread,
                              /*   9 : Get Thread Info */
      jvmti_GetThreadInfo,
                              /*   10 : Get Owned Monitor Info */
      jvmti_GetOwnedMonitorInfo,
                              /*   11 : Get Current Contended Monitor */
      jvmti_GetCurrentContendedMonitor,
                              /*   12 : Run Agent Thread */
      jvmti_RunAgentThread,
                              /*   13 : Get Top Thread Groups */
      jvmti_GetTopThreadGroups,
                              /*   14 : Get Thread Group Info */
      jvmti_GetThreadGroupInfo,
                              /*   15 : Get Thread Group Children */
      jvmti_GetThreadGroupChildren,
                              /*   16 : Get Frame Count */
      jvmti_GetFrameCount,
                              /*   17 : Get Thread State */
      jvmti_GetThreadState,
                              /*   18 : Get Current Thread */
      jvmti_GetCurrentThread,
                              /*   19 : Get Frame Location */
      jvmti_GetFrameLocation,
                              /*   20 : Notify Frame Pop */
      jvmti_NotifyFramePop,
                              /*   21 : Get Local Variable - Object */
      jvmti_GetLocalObject,
                              /*   22 : Get Local Variable - Int */
      jvmti_GetLocalInt,
                              /*   23 : Get Local Variable - Long */
      jvmti_GetLocalLong,
                              /*   24 : Get Local Variable - Float */
      jvmti_GetLocalFloat,
                              /*   25 : Get Local Variable - Double */
      jvmti_GetLocalDouble,
                              /*   26 : Set Local Variable - Object */
      jvmti_SetLocalObject,
                              /*   27 : Set Local Variable - Int */
      jvmti_SetLocalInt,
                              /*   28 : Set Local Variable - Long */
      jvmti_SetLocalLong,
                              /*   29 : Set Local Variable - Float */
      jvmti_SetLocalFloat,
                              /*   30 : Set Local Variable - Double */
      jvmti_SetLocalDouble,
                              /*   31 : Create Raw Monitor */
      jvmti_CreateRawMonitor,
                              /*   32 : Destroy Raw Monitor */
      jvmti_DestroyRawMonitor,
                              /*   33 : Raw Monitor Enter */
      jvmti_RawMonitorEnter,
                              /*   34 : Raw Monitor Exit */
      jvmti_RawMonitorExit,
                              /*   35 : Raw Monitor Wait */
      jvmti_RawMonitorWait,
                              /*   36 : Raw Monitor Notify */
      jvmti_RawMonitorNotify,
                              /*   37 : Raw Monitor Notify All */
      jvmti_RawMonitorNotifyAll,
                              /*   38 : Set Breakpoint */
      jvmti_SetBreakpoint,
                              /*   39 : Clear Breakpoint */
      jvmti_ClearBreakpoint,
                              /*   40 :  RESERVED */
      NULL,
                              /*   41 : Set Field Access Watch */
      jvmti_SetFieldAccessWatch,
                              /*   42 : Clear Field Access Watch */
      jvmti_ClearFieldAccessWatch,
                              /*   43 : Set Field Modification Watch */
      jvmti_SetFieldModificationWatch,
                              /*   44 : Clear Field Modification Watch */
      jvmti_ClearFieldModificationWatch,
                              /*   45 : Is Modifiable Class */
      jvmti_IsModifiableClass,
                              /*   46 : Allocate */
      jvmti_Allocate,
                              /*   47 : Deallocate */
      jvmti_Deallocate,
                              /*   48 : Get Class Signature */
      jvmti_GetClassSignature,
                              /*   49 : Get Class Status */
      jvmti_GetClassStatus,
                              /*   50 : Get Source File Name */
      jvmti_GetSourceFileName,
                              /*   51 : Get Class Modifiers */
      jvmti_GetClassModifiers,
                              /*   52 : Get Class Methods */
      jvmti_GetClassMethods,
                              /*   53 : Get Class Fields */
      jvmti_GetClassFields,
                              /*   54 : Get Implemented Interfaces */
      jvmti_GetImplementedInterfaces,
                              /*   55 : Is Interface */
      jvmti_IsInterface,
                              /*   56 : Is Array Class */
      jvmti_IsArrayClass,
                              /*   57 : Get Class Loader */
      jvmti_GetClassLoader,
                              /*   58 : Get Object Hash Code */
      jvmti_GetObjectHashCode,
                              /*   59 : Get Object Monitor Usage */
      jvmti_GetObjectMonitorUsage,
                              /*   60 : Get Field Name (and Signature) */
      jvmti_GetFieldName,
                              /*   61 : Get Field Declaring Class */
      jvmti_GetFieldDeclaringClass,
                              /*   62 : Get Field Modifiers */
      jvmti_GetFieldModifiers,
                              /*   63 : Is Field Synthetic */
      jvmti_IsFieldSynthetic,
                              /*   64 : Get Method Name (and Signature) */
      jvmti_GetMethodName,
                              /*   65 : Get Method Declaring Class */
      jvmti_GetMethodDeclaringClass,
                              /*   66 : Get Method Modifiers */
      jvmti_GetMethodModifiers,
                              /*   67 :  RESERVED */
      NULL,
                              /*   68 : Get Max Locals */
      jvmti_GetMaxLocals,
                              /*   69 : Get Arguments Size */
      jvmti_GetArgumentsSize,
                              /*   70 : Get Line Number Table */
      jvmti_GetLineNumberTable,
                              /*   71 : Get Method Location */
      jvmti_GetMethodLocation,
                              /*   72 : Get Local Variable Table */
      jvmti_GetLocalVariableTable,
                              /*   73 : Set Native Method Prefix */
      jvmti_SetNativeMethodPrefix,
                              /*   74 : Set Native Method Prefixes */
      jvmti_SetNativeMethodPrefixes,
                              /*   75 : Get Bytecodes */
      jvmti_GetBytecodes,
                              /*   76 : Is Method Native */
      jvmti_IsMethodNative,
                              /*   77 : Is Method Synthetic */
      jvmti_IsMethodSynthetic,
                              /*   78 : Get Loaded Classes */
      jvmti_GetLoadedClasses,
                              /*   79 : Get Classloader Classes */
      jvmti_GetClassLoaderClasses,
                              /*   80 : Pop Frame */
      jvmti_PopFrame,
                              /*   81 : Force Early Return - Object */
      jvmti_ForceEarlyReturnObject,
                              /*   82 : Force Early Return - Int */
      jvmti_ForceEarlyReturnInt,
                              /*   83 : Force Early Return - Long */
      jvmti_ForceEarlyReturnLong,
                              /*   84 : Force Early Return - Float */
      jvmti_ForceEarlyReturnFloat,
                              /*   85 : Force Early Return - Double */
      jvmti_ForceEarlyReturnDouble,
                              /*   86 : Force Early Return - Void */
      jvmti_ForceEarlyReturnVoid,
                              /*   87 : Redefine Classes */
      jvmti_RedefineClasses,
                              /*   88 : Get Version Number */
      jvmti_GetVersionNumber,
                              /*   89 : Get Capabilities */
      jvmti_GetCapabilities,
                              /*   90 : Get Source Debug Extension */
      jvmti_GetSourceDebugExtension,
                              /*   91 : Is Method Obsolete */
      jvmti_IsMethodObsolete,
                              /*   92 : Suspend Thread List */
      jvmti_SuspendThreadList,
                              /*   93 : Resume Thread List */
      jvmti_ResumeThreadList,
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
      jvmti_GetAllStackTraces,
                              /*   101 : Get Thread List Stack Traces */
      jvmti_GetThreadListStackTraces,
                              /*   102 : Get Thread Local Storage */
      jvmti_GetThreadLocalStorage,
                              /*   103 : Set Thread Local Storage */
      jvmti_SetThreadLocalStorage,
                              /*   104 : Get Stack Trace */
      jvmti_GetStackTrace,
                              /*   105 :  RESERVED */
      NULL,
                              /*   106 : Get Tag */
      jvmti_GetTag,
                              /*   107 : Set Tag */
      jvmti_SetTag,
                              /*   108 : Force Garbage Collection */
      jvmti_ForceGarbageCollection,
                              /*   109 : Iterate Over Objects Reachable From Object */
      jvmti_IterateOverObjectsReachableFromObject,
                              /*   110 : Iterate Over Reachable Objects */
      jvmti_IterateOverReachableObjects,
                              /*   111 : Iterate Over Heap */
      jvmti_IterateOverHeap,
                              /*   112 : Iterate Over Instances Of Class */
      jvmti_IterateOverInstancesOfClass,
                              /*   113 :  RESERVED */
      NULL,
                              /*   114 : Get Objects With Tags */
      jvmti_GetObjectsWithTags,
                              /*   115 : Follow References */
      jvmti_FollowReferences,
                              /*   116 : Iterate Through Heap */
      jvmti_IterateThroughHeap,
                              /*   117 :  RESERVED */
      NULL,
                              /*   118 :  RESERVED */
      NULL,
                              /*   119 :  RESERVED */
      NULL,
                              /*   120 : Set JNI Function Table */
      jvmti_SetJNIFunctionTable,
                              /*   121 : Get JNI Function Table */
      jvmti_GetJNIFunctionTable,
                              /*   122 : Set Event Callbacks */
      jvmti_SetEventCallbacks,
                              /*   123 : Generate Events */
      jvmti_GenerateEvents,
                              /*   124 : Get Extension Functions */
      jvmti_GetExtensionFunctions,
                              /*   125 : Get Extension Events */
      jvmti_GetExtensionEvents,
                              /*   126 : Set Extension Event Callback */
      jvmti_SetExtensionEventCallback,
                              /*   127 : Dispose Environment */
      jvmti_DisposeEnvironment,
                              /*   128 : Get Error Name */
      jvmti_GetErrorName,
                              /*   129 : Get JLocation Format */
      jvmti_GetJLocationFormat,
                              /*   130 : Get System Properties */
      jvmti_GetSystemProperties,
                              /*   131 : Get System Property */
      jvmti_GetSystemProperty,
                              /*   132 : Set System Property */
      jvmti_SetSystemProperty,
                              /*   133 : Get Phase */
      jvmti_GetPhase,
                              /*   134 : Get Current Thread CPU Timer Information */
      jvmti_GetCurrentThreadCpuTimerInfo,
                              /*   135 : Get Current Thread CPU Time */
      jvmti_GetCurrentThreadCpuTime,
                              /*   136 : Get Thread CPU Timer Information */
      jvmti_GetThreadCpuTimerInfo,
                              /*   137 : Get Thread CPU Time */
      jvmti_GetThreadCpuTime,
                              /*   138 : Get Timer Information */
      jvmti_GetTimerInfo,
                              /*   139 : Get Time */
      jvmti_GetTime,
                              /*   140 : Get Potential Capabilities */
      jvmti_GetPotentialCapabilities,
                              /*   141 :  RESERVED */
      NULL,
                              /*   142 : Add Capabilities */
      jvmti_AddCapabilities,
                              /*   143 : Relinquish Capabilities */
      jvmti_RelinquishCapabilities,
                              /*   144 : Get Available Processors */
      jvmti_GetAvailableProcessors,
                              /*   145 : Get Class Version Numbers */
      jvmti_GetClassVersionNumbers,
                              /*   146 : Get Constant Pool */
      jvmti_GetConstantPool,
                              /*   147 : Get Environment Local Storage */
      jvmti_GetEnvironmentLocalStorage,
                              /*   148 : Set Environment Local Storage */
      jvmti_SetEnvironmentLocalStorage,
                              /*   149 : Add To Bootstrap Class Loader Search */
      jvmti_AddToBootstrapClassLoaderSearch,
                              /*   150 : Set Verbose Flag */
      jvmti_SetVerboseFlag,
                              /*   151 : Add To System Class Loader Search */
      jvmti_AddToSystemClassLoaderSearch,
                              /*   152 : Retransform Classes */
      jvmti_RetransformClasses,
                              /*   153 : Get Owned Monitor Stack Depth Info */
      jvmti_GetOwnedMonitorStackDepthInfo,
                              /*   154 : Get Object Size */
      jvmti_GetObjectSize,
                              /*   155 : Get Local Instance */
      jvmti_GetLocalInstance
};
