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


// end file prefix - do not modify or remove this line

  //
  // Memory Management functions
  // 

// mem_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::Allocate(jlong size, unsigned char** mem_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end Allocate */


// mem - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::Deallocate(unsigned char* mem) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end Deallocate */


  //
  // Thread functions
  // 

// Threads_lock NOT held
// thread - NOT pre-checked
// thread_state_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadState(jthread thread, jint* thread_state_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadState */


// thread_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetCurrentThread(jthread* thread_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetCurrentThread */


// threads_count_ptr - pre-checked for NULL
// threads_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetAllThreads(jint* threads_count_ptr, jthread** threads_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetAllThreads */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::SuspendThread(JavaThread* java_thread) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SuspendThread */


// request_count - pre-checked to be greater than or equal to 0
// request_list - pre-checked for NULL
// results - pre-checked for NULL
jvmtiError
JvmtiEnv::SuspendThreadList(jint request_count, const jthread* request_list, jvmtiError* results) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SuspendThreadList */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ResumeThread(JavaThread* java_thread) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ResumeThread */


// request_count - pre-checked to be greater than or equal to 0
// request_list - pre-checked for NULL
// results - pre-checked for NULL
jvmtiError
JvmtiEnv::ResumeThreadList(jint request_count, const jthread* request_list, jvmtiError* results) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ResumeThreadList */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::StopThread(JavaThread* java_thread, jobject exception) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end StopThread */


// Threads_lock NOT held
// thread - NOT pre-checked
jvmtiError
JvmtiEnv::InterruptThread(jthread thread) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end InterruptThread */


// Threads_lock NOT held
// thread - NOT pre-checked
// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadInfo(jthread thread, jvmtiThreadInfo* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadInfo */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// owned_monitor_count_ptr - pre-checked for NULL
// owned_monitors_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetOwnedMonitorInfo(JavaThread* java_thread, jint* owned_monitor_count_ptr, jobject** owned_monitors_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetOwnedMonitorInfo */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// monitor_info_count_ptr - pre-checked for NULL
// monitor_info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetOwnedMonitorStackDepthInfo(JavaThread* java_thread, jint* monitor_info_count_ptr, jvmtiMonitorStackDepthInfo** monitor_info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetOwnedMonitorStackDepthInfo */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// monitor_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetCurrentContendedMonitor(JavaThread* java_thread, jobject* monitor_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetCurrentContendedMonitor */


// Threads_lock NOT held
// thread - NOT pre-checked
// proc - pre-checked for NULL
// arg - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::RunAgentThread(jthread thread, jvmtiStartFunction proc, const void* arg, jint priority) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RunAgentThread */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetThreadLocalStorage(JavaThread* java_thread, const void* data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetThreadLocalStorage */


// Threads_lock NOT held
// thread - NOT pre-checked
// data_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadLocalStorage(jthread thread, void** data_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadLocalStorage */


  //
  // Thread Group functions
  // 

// group_count_ptr - pre-checked for NULL
// groups_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetTopThreadGroups(jint* group_count_ptr, jthreadGroup** groups_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetTopThreadGroups */


// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadGroupInfo(jthreadGroup group, jvmtiThreadGroupInfo* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadGroupInfo */


// thread_count_ptr - pre-checked for NULL
// threads_ptr - pre-checked for NULL
// group_count_ptr - pre-checked for NULL
// groups_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadGroupChildren(jthreadGroup group, jint* thread_count_ptr, jthread** threads_ptr, jint* group_count_ptr, jthreadGroup** groups_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadGroupChildren */


  //
  // Stack Frame functions
  // 

// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// max_frame_count - pre-checked to be greater than or equal to 0
// frame_buffer - pre-checked for NULL
// count_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetStackTrace(JavaThread* java_thread, jint start_depth, jint max_frame_count, jvmtiFrameInfo* frame_buffer, jint* count_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetStackTrace */


// max_frame_count - pre-checked to be greater than or equal to 0
// stack_info_ptr - pre-checked for NULL
// thread_count_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetAllStackTraces(jint max_frame_count, jvmtiStackInfo** stack_info_ptr, jint* thread_count_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetAllStackTraces */


// thread_count - pre-checked to be greater than or equal to 0
// thread_list - pre-checked for NULL
// max_frame_count - pre-checked to be greater than or equal to 0
// stack_info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadListStackTraces(jint thread_count, const jthread* thread_list, jint max_frame_count, jvmtiStackInfo** stack_info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadListStackTraces */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// count_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetFrameCount(JavaThread* java_thread, jint* count_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetFrameCount */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::PopFrame(JavaThread* java_thread) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end PopFrame */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// method_ptr - pre-checked for NULL
// location_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetFrameLocation(JavaThread* java_thread, jint depth, jmethodID* method_ptr, jlocation* location_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetFrameLocation */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::NotifyFramePop(JavaThread* java_thread, jint depth) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end NotifyFramePop */


  //
  // Force Early Return functions
  // 

// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnObject(JavaThread* java_thread, jobject value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnObject */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnInt(JavaThread* java_thread, jint value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnInt */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnLong(JavaThread* java_thread, jlong value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnLong */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnFloat(JavaThread* java_thread, jfloat value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnFloat */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnDouble(JavaThread* java_thread, jdouble value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnDouble */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
jvmtiError
JvmtiEnv::ForceEarlyReturnVoid(JavaThread* java_thread) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceEarlyReturnVoid */


  //
  // Heap functions
  // 

// klass - NULL is a valid value, must be checked
// initial_object - NULL is a valid value, must be checked
// callbacks - pre-checked for NULL
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::FollowReferences(jint heap_filter, jclass klass, jobject initial_object, const jvmtiHeapCallbacks* callbacks, const void* user_data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end FollowReferences */


// klass - NULL is a valid value, must be checked
// callbacks - pre-checked for NULL
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::IterateThroughHeap(jint heap_filter, jclass klass, const jvmtiHeapCallbacks* callbacks, const void* user_data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IterateThroughHeap */


// tag_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetTag(jobject object, jlong* tag_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetTag */


jvmtiError
JvmtiEnv::SetTag(jobject object, jlong tag) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetTag */


// tag_count - pre-checked to be greater than or equal to 0
// tags - pre-checked for NULL
// count_ptr - pre-checked for NULL
// object_result_ptr - NULL is a valid value, must be checked
// tag_result_ptr - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::GetObjectsWithTags(jint tag_count, const jlong* tags, jint* count_ptr, jobject** object_result_ptr, jlong** tag_result_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetObjectsWithTags */


jvmtiError
JvmtiEnv::ForceGarbageCollection() {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ForceGarbageCollection */


  //
  // Heap (1.0) functions
  // 

// object_reference_callback - pre-checked for NULL
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::IterateOverObjectsReachableFromObject(jobject object, jvmtiObjectReferenceCallback object_reference_callback, const void* user_data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IterateOverObjectsReachableFromObject */


// heap_root_callback - NULL is a valid value, must be checked
// stack_ref_callback - NULL is a valid value, must be checked
// object_ref_callback - NULL is a valid value, must be checked
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::IterateOverReachableObjects(jvmtiHeapRootCallback heap_root_callback, jvmtiStackReferenceCallback stack_ref_callback, jvmtiObjectReferenceCallback object_ref_callback, const void* user_data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IterateOverReachableObjects */


// heap_object_callback - pre-checked for NULL
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::IterateOverHeap(jvmtiHeapObjectFilter object_filter, jvmtiHeapObjectCallback heap_object_callback, const void* user_data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IterateOverHeap */


// k_mirror - may be primitive, this must be checked
// heap_object_callback - pre-checked for NULL
// user_data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::IterateOverInstancesOfClass(oop k_mirror, jvmtiHeapObjectFilter object_filter, jvmtiHeapObjectCallback heap_object_callback, const void* user_data) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IterateOverInstancesOfClass */


  //
  // Local Variable functions
  // 

// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalObject(JavaThread* java_thread, jint depth, jint slot, jobject* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalObject */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalInstance(JavaThread* java_thread, jint depth, jobject* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalInstance */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalInt(JavaThread* java_thread, jint depth, jint slot, jint* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalInt */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalLong(JavaThread* java_thread, jint depth, jint slot, jlong* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalLong */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalFloat(JavaThread* java_thread, jint depth, jint slot, jfloat* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalFloat */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalDouble(JavaThread* java_thread, jint depth, jint slot, jdouble* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalDouble */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::SetLocalObject(JavaThread* java_thread, jint depth, jint slot, jobject value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetLocalObject */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::SetLocalInt(JavaThread* java_thread, jint depth, jint slot, jint value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetLocalInt */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::SetLocalLong(JavaThread* java_thread, jint depth, jint slot, jlong value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetLocalLong */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::SetLocalFloat(JavaThread* java_thread, jint depth, jint slot, jfloat value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetLocalFloat */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// java_thread - unchecked 
// depth - pre-checked as non-negative
jvmtiError
JvmtiEnv::SetLocalDouble(JavaThread* java_thread, jint depth, jint slot, jdouble value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetLocalDouble */


  //
  // Breakpoint functions
  // 

// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
jvmtiError
JvmtiEnv::SetBreakpoint(methodOop method_oop, jlocation location) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetBreakpoint */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
jvmtiError
JvmtiEnv::ClearBreakpoint(methodOop method_oop, jlocation location) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ClearBreakpoint */


  //
  // Watched Field functions
  // 

jvmtiError
JvmtiEnv::SetFieldAccessWatch(fieldDescriptor* fdesc_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetFieldAccessWatch */


jvmtiError
JvmtiEnv::ClearFieldAccessWatch(fieldDescriptor* fdesc_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ClearFieldAccessWatch */


jvmtiError
JvmtiEnv::SetFieldModificationWatch(fieldDescriptor* fdesc_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetFieldModificationWatch */


jvmtiError
JvmtiEnv::ClearFieldModificationWatch(fieldDescriptor* fdesc_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end ClearFieldModificationWatch */


  //
  // Class functions
  // 

// class_count_ptr - pre-checked for NULL
// classes_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLoadedClasses(jint* class_count_ptr, jclass** classes_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLoadedClasses */


// initiating_loader - NULL is a valid value, must be checked
// class_count_ptr - pre-checked for NULL
// classes_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassLoaderClasses(jobject initiating_loader, jint* class_count_ptr, jclass** classes_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassLoaderClasses */


// k_mirror - may be primitive, this must be checked
// signature_ptr - NULL is a valid value, must be checked
// generic_ptr - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::GetClassSignature(oop k_mirror, char** signature_ptr, char** generic_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassSignature */


// k_mirror - may be primitive, this must be checked
// status_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassStatus(oop k_mirror, jint* status_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassStatus */


// k_mirror - may be primitive, this must be checked
// source_name_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetSourceFileName(oop k_mirror, char** source_name_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetSourceFileName */


// k_mirror - may be primitive, this must be checked
// modifiers_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassModifiers(oop k_mirror, jint* modifiers_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassModifiers */


// k_mirror - may be primitive, this must be checked
// method_count_ptr - pre-checked for NULL
// methods_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassMethods(oop k_mirror, jint* method_count_ptr, jmethodID** methods_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassMethods */


// k_mirror - may be primitive, this must be checked
// field_count_ptr - pre-checked for NULL
// fields_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassFields(oop k_mirror, jint* field_count_ptr, jfieldID** fields_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassFields */


// k_mirror - may be primitive, this must be checked
// interface_count_ptr - pre-checked for NULL
// interfaces_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetImplementedInterfaces(oop k_mirror, jint* interface_count_ptr, jclass** interfaces_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetImplementedInterfaces */


// k_mirror - may be primitive, this must be checked
// minor_version_ptr - pre-checked for NULL
// major_version_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassVersionNumbers(oop k_mirror, jint* minor_version_ptr, jint* major_version_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassVersionNumbers */


// k_mirror - may be primitive, this must be checked
// constant_pool_count_ptr - pre-checked for NULL
// constant_pool_byte_count_ptr - pre-checked for NULL
// constant_pool_bytes_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetConstantPool(oop k_mirror, jint* constant_pool_count_ptr, jint* constant_pool_byte_count_ptr, unsigned char** constant_pool_bytes_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetConstantPool */


// k_mirror - may be primitive, this must be checked
// is_interface_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsInterface(oop k_mirror, jboolean* is_interface_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsInterface */


// k_mirror - may be primitive, this must be checked
// is_array_class_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsArrayClass(oop k_mirror, jboolean* is_array_class_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsArrayClass */


// k_mirror - may be primitive, this must be checked
// is_modifiable_class_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsModifiableClass(oop k_mirror, jboolean* is_modifiable_class_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsModifiableClass */


// k_mirror - may be primitive, this must be checked
// classloader_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetClassLoader(oop k_mirror, jobject* classloader_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetClassLoader */


// k_mirror - may be primitive, this must be checked
// source_debug_extension_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetSourceDebugExtension(oop k_mirror, char** source_debug_extension_ptr) {
  if (java_lang_Class::is_primitive(k_mirror)) {
    // DO PRIMITIVE CLASS PROCESSING
    return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
  }
  klassOop k_oop = java_lang_Class::as_klassOop(k_mirror);
  if (k_oop == NULL) {
    return JVMTI_ERROR_INVALID_CLASS;
  }
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetSourceDebugExtension */


// class_count - pre-checked to be greater than or equal to 0
// classes - pre-checked for NULL
jvmtiError
JvmtiEnv::RetransformClasses(jint class_count, const jclass* classes) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RetransformClasses */


// class_count - pre-checked to be greater than or equal to 0
// class_definitions - pre-checked for NULL
jvmtiError
JvmtiEnv::RedefineClasses(jint class_count, const jvmtiClassDefinition* class_definitions) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RedefineClasses */


  //
  // Object functions
  // 

// size_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetObjectSize(jobject object, jlong* size_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetObjectSize */


// hash_code_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetObjectHashCode(jobject object, jint* hash_code_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetObjectHashCode */


// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetObjectMonitorUsage(jobject object, jvmtiMonitorUsage* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetObjectMonitorUsage */


  //
  // Field functions
  // 

// name_ptr - NULL is a valid value, must be checked
// signature_ptr - NULL is a valid value, must be checked
// generic_ptr - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::GetFieldName(fieldDescriptor* fdesc_ptr, char** name_ptr, char** signature_ptr, char** generic_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetFieldName */


// declaring_class_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetFieldDeclaringClass(fieldDescriptor* fdesc_ptr, jclass* declaring_class_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetFieldDeclaringClass */


// modifiers_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetFieldModifiers(fieldDescriptor* fdesc_ptr, jint* modifiers_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetFieldModifiers */


// is_synthetic_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsFieldSynthetic(fieldDescriptor* fdesc_ptr, jboolean* is_synthetic_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsFieldSynthetic */


  //
  // Method functions
  // 

// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// name_ptr - NULL is a valid value, must be checked
// signature_ptr - NULL is a valid value, must be checked
// generic_ptr - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::GetMethodName(methodOop method_oop, char** name_ptr, char** signature_ptr, char** generic_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetMethodName */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// declaring_class_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetMethodDeclaringClass(methodOop method_oop, jclass* declaring_class_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetMethodDeclaringClass */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// modifiers_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetMethodModifiers(methodOop method_oop, jint* modifiers_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetMethodModifiers */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// max_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetMaxLocals(methodOop method_oop, jint* max_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetMaxLocals */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// size_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetArgumentsSize(methodOop method_oop, jint* size_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetArgumentsSize */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// entry_count_ptr - pre-checked for NULL
// table_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLineNumberTable(methodOop method_oop, jint* entry_count_ptr, jvmtiLineNumberEntry** table_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLineNumberTable */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// start_location_ptr - pre-checked for NULL
// end_location_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetMethodLocation(methodOop method_oop, jlocation* start_location_ptr, jlocation* end_location_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetMethodLocation */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// entry_count_ptr - pre-checked for NULL
// table_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetLocalVariableTable(methodOop method_oop, jint* entry_count_ptr, jvmtiLocalVariableEntry** table_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetLocalVariableTable */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// bytecode_count_ptr - pre-checked for NULL
// bytecodes_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetBytecodes(methodOop method_oop, jint* bytecode_count_ptr, unsigned char** bytecodes_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetBytecodes */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// is_native_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsMethodNative(methodOop method_oop, jboolean* is_native_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsMethodNative */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// is_synthetic_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsMethodSynthetic(methodOop method_oop, jboolean* is_synthetic_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsMethodSynthetic */


// method_oop - pre-checked for validity, but may be NULL meaning obsolete method
// is_obsolete_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::IsMethodObsolete(methodOop method_oop, jboolean* is_obsolete_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end IsMethodObsolete */


// prefix - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetNativeMethodPrefix(const char* prefix) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetNativeMethodPrefix */


// prefix_count - pre-checked to be greater than or equal to 0
// prefixes - pre-checked for NULL
jvmtiError
JvmtiEnv::SetNativeMethodPrefixes(jint prefix_count, char** prefixes) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetNativeMethodPrefixes */


  //
  // Raw Monitor functions
  // 

// name - pre-checked for NULL
// monitor_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::CreateRawMonitor(const char* name, jrawMonitorID* monitor_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end CreateRawMonitor */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::DestroyRawMonitor(JvmtiRawMonitor * rmonitor) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end DestroyRawMonitor */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::RawMonitorEnter(JvmtiRawMonitor * rmonitor) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RawMonitorEnter */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::RawMonitorExit(JvmtiRawMonitor * rmonitor) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RawMonitorExit */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::RawMonitorWait(JvmtiRawMonitor * rmonitor, jlong millis) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RawMonitorWait */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::RawMonitorNotify(JvmtiRawMonitor * rmonitor) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RawMonitorNotify */


// rmonitor - pre-checked for validity
jvmtiError
JvmtiEnv::RawMonitorNotifyAll(JvmtiRawMonitor * rmonitor) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RawMonitorNotifyAll */


  //
  // JNI Function Interception functions
  // 

// function_table - pre-checked for NULL
jvmtiError
JvmtiEnv::SetJNIFunctionTable(const jniNativeInterface* function_table) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetJNIFunctionTable */


// function_table - pre-checked for NULL
jvmtiError
JvmtiEnv::GetJNIFunctionTable(jniNativeInterface** function_table) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetJNIFunctionTable */


  //
  // Event Management functions
  // 

// callbacks - NULL is a valid value, must be checked
// size_of_callbacks - pre-checked to be greater than or equal to 0
jvmtiError
JvmtiEnv::SetEventCallbacks(const jvmtiEventCallbacks* callbacks, jint size_of_callbacks) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetEventCallbacks */


// event_thread - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetEventNotificationMode(jvmtiEventMode mode, jvmtiEvent event_type, jthread event_thread,   ...) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetEventNotificationMode */


jvmtiError
JvmtiEnv::GenerateEvents(jvmtiEvent event_type) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GenerateEvents */


  //
  // Extension Mechanism functions
  // 

// extension_count_ptr - pre-checked for NULL
// extensions - pre-checked for NULL
jvmtiError
JvmtiEnv::GetExtensionFunctions(jint* extension_count_ptr, jvmtiExtensionFunctionInfo** extensions) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetExtensionFunctions */


// extension_count_ptr - pre-checked for NULL
// extensions - pre-checked for NULL
jvmtiError
JvmtiEnv::GetExtensionEvents(jint* extension_count_ptr, jvmtiExtensionEventInfo** extensions) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetExtensionEvents */


// callback - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetExtensionEventCallback(jint extension_event_index, jvmtiExtensionEvent callback) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetExtensionEventCallback */


  //
  // Capability functions
  // 

// capabilities_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetPotentialCapabilities(jvmtiCapabilities* capabilities_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetPotentialCapabilities */


// capabilities_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::AddCapabilities(const jvmtiCapabilities* capabilities_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end AddCapabilities */


// capabilities_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::RelinquishCapabilities(const jvmtiCapabilities* capabilities_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end RelinquishCapabilities */


// capabilities_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetCapabilities(jvmtiCapabilities* capabilities_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetCapabilities */


  //
  // Timers functions
  // 

// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetCurrentThreadCpuTimerInfo(jvmtiTimerInfo* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetCurrentThreadCpuTimerInfo */


// nanos_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetCurrentThreadCpuTime(jlong* nanos_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetCurrentThreadCpuTime */


// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadCpuTimerInfo(jvmtiTimerInfo* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadCpuTimerInfo */


// Threads_lock NOT held, java_thread not protected by lock
// java_thread - pre-checked
// nanos_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetThreadCpuTime(JavaThread* java_thread, jlong* nanos_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetThreadCpuTime */


// info_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetTimerInfo(jvmtiTimerInfo* info_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetTimerInfo */


// nanos_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetTime(jlong* nanos_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetTime */


// processor_count_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetAvailableProcessors(jint* processor_count_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetAvailableProcessors */


  //
  // Class Loader Search functions
  // 

// segment - pre-checked for NULL
jvmtiError
JvmtiEnv::AddToBootstrapClassLoaderSearch(const char* segment) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end AddToBootstrapClassLoaderSearch */


// segment - pre-checked for NULL
jvmtiError
JvmtiEnv::AddToSystemClassLoaderSearch(const char* segment) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end AddToSystemClassLoaderSearch */


  //
  // System Properties functions
  // 

// count_ptr - pre-checked for NULL
// property_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetSystemProperties(jint* count_ptr, char*** property_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetSystemProperties */


// property - pre-checked for NULL
// value_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetSystemProperty(const char* property, char** value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetSystemProperty */


// property - pre-checked for NULL
// value_ptr - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetSystemProperty(const char* property, const char* value_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetSystemProperty */


  //
  // General functions
  // 

// phase_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetPhase(jvmtiPhase* phase_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetPhase */


jvmtiError
JvmtiEnv::DisposeEnvironment() {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end DisposeEnvironment */


// data - NULL is a valid value, must be checked
jvmtiError
JvmtiEnv::SetEnvironmentLocalStorage(const void* data) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetEnvironmentLocalStorage */


// data_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetEnvironmentLocalStorage(void** data_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetEnvironmentLocalStorage */


// version_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetVersionNumber(jint* version_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetVersionNumber */


// name_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetErrorName(jvmtiError error, char** name_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetErrorName */


jvmtiError
JvmtiEnv::SetVerboseFlag(jvmtiVerboseFlag flag, jboolean value) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end SetVerboseFlag */


// format_ptr - pre-checked for NULL
jvmtiError
JvmtiEnv::GetJLocationFormat(jvmtiJlocationFormat* format_ptr) {
  return JVMTI_ERROR_MUST_POSSESS_CAPABILITY;
} /* end GetJLocationFormat */

