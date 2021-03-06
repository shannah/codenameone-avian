/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_awt_image_DataBufferNative */

#ifndef _Included_sun_awt_image_DataBufferNative
#define _Included_sun_awt_image_DataBufferNative
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_awt_image_DataBufferNative_TYPE_BYTE
#define sun_awt_image_DataBufferNative_TYPE_BYTE 0L
#undef sun_awt_image_DataBufferNative_TYPE_USHORT
#define sun_awt_image_DataBufferNative_TYPE_USHORT 1L
#undef sun_awt_image_DataBufferNative_TYPE_SHORT
#define sun_awt_image_DataBufferNative_TYPE_SHORT 2L
#undef sun_awt_image_DataBufferNative_TYPE_INT
#define sun_awt_image_DataBufferNative_TYPE_INT 3L
#undef sun_awt_image_DataBufferNative_TYPE_FLOAT
#define sun_awt_image_DataBufferNative_TYPE_FLOAT 4L
#undef sun_awt_image_DataBufferNative_TYPE_DOUBLE
#define sun_awt_image_DataBufferNative_TYPE_DOUBLE 5L
#undef sun_awt_image_DataBufferNative_TYPE_UNDEFINED
#define sun_awt_image_DataBufferNative_TYPE_UNDEFINED 32L
/*
 * Class:     sun_awt_image_DataBufferNative
 * Method:    getElem
 * Signature: (IILsun/java2d/SurfaceData;)I
 */
JNIEXPORT jint JNICALL Java_sun_awt_image_DataBufferNative_getElem
  (JNIEnv *, jobject, jint, jint, jobject);

/*
 * Class:     sun_awt_image_DataBufferNative
 * Method:    setElem
 * Signature: (IIILsun/java2d/SurfaceData;)V
 */
JNIEXPORT void JNICALL Java_sun_awt_image_DataBufferNative_setElem
  (JNIEnv *, jobject, jint, jint, jint, jobject);

#ifdef __cplusplus
}
#endif
#endif
