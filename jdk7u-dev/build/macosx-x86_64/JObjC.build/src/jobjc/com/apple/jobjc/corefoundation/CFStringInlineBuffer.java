package com.apple.jobjc.corefoundation;

public final class CFStringInlineBuffer extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 176 : 152;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.corefoundation.CFRange.getStructCoder(),
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder){
		@Override protected CFStringInlineBuffer newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFStringInlineBuffer(runtime); }
	};

	CFStringInlineBuffer(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFStringInlineBuffer(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int BUFFER_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null ([64S], [64S]) */ buffer(){
final Object /* null ([64S], [64S]) */ returnValue = (Object /* null ([64S], [64S]) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + BUFFER_OFFSET));
return returnValue;
	}

	public void setBuffer(final Object /* null ([64S], [64S]) */ buffer__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + BUFFER_OFFSET, buffer__);
	}

	private static final int THESTRING_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 128 : 128;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType theString(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + THESTRING_OFFSET));
return returnValue;
	}

	public void setTheString(final com.apple.jobjc.corefoundation.CFStringRefCFType theString__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + THESTRING_OFFSET, theString__);
	}

	private static final int DIRECTBUFFER_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 136 : 132;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.Pointer<java.lang.Short> directBuffer(){
final com.apple.jobjc.Pointer<java.lang.Short> returnValue = (com.apple.jobjc.Pointer<java.lang.Short>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + DIRECTBUFFER_OFFSET));
return returnValue;
	}

	public void setDirectBuffer(final com.apple.jobjc.Pointer<java.lang.Short> directBuffer__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + DIRECTBUFFER_OFFSET, directBuffer__);
	}

	private static final int RANGETOBUFFER_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 144 : 136;
	private com.apple.jobjc.corefoundation.CFRange rangeToBuffer__ = null;
	public com.apple.jobjc.corefoundation.CFRange rangeToBuffer(){
		if(null==rangeToBuffer__){
			this.raw.position(RANGETOBUFFER_OFFSET);
			rangeToBuffer__ = com.apple.jobjc.JObjC.getInstance(getRuntime()).CoreFoundation().makeCFRange(this.raw.slice());
		}
		return rangeToBuffer__;
	}

	private static final int BUFFEREDRANGESTART_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 160 : 144;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long bufferedRangeStart(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + BUFFEREDRANGESTART_OFFSET));
return returnValue;
	}

	public void setBufferedRangeStart(final long bufferedRangeStart__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + BUFFEREDRANGESTART_OFFSET, bufferedRangeStart__);
	}

	private static final int BUFFEREDRANGEEND_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 168 : 148;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long bufferedRangeEnd(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + BUFFEREDRANGEEND_OFFSET));
return returnValue;
	}

	public void setBufferedRangeEnd(final long bufferedRangeEnd__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + BUFFEREDRANGEEND_OFFSET, bufferedRangeEnd__);
	}
}
