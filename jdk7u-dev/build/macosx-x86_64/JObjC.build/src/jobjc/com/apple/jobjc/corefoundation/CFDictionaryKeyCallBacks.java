package com.apple.jobjc.corefoundation;

public final class CFDictionaryKeyCallBacks extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 48 : 24;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected CFDictionaryKeyCallBacks newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFDictionaryKeyCallBacks(runtime); }
	};

	CFDictionaryKeyCallBacks(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFDictionaryKeyCallBacks(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int VERSION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long version(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + VERSION_OFFSET));
return returnValue;
	}

	public void setVersion(final long version__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + VERSION_OFFSET, version__);
	}

	private static final int RETAIN_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ retain(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET));
return returnValue;
	}

	public void setRetain(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ retain__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET, retain__);
	}

	private static final int RELEASE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ release(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET));
return returnValue;
	}

	public void setRelease(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ release__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET, release__);
	}

	private static final int COPYDESCRIPTION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ copyDescription(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + COPYDESCRIPTION_OFFSET));
return returnValue;
	}

	public void setCopyDescription(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ copyDescription__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + COPYDESCRIPTION_OFFSET, copyDescription__);
	}

	private static final int EQUAL_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ equal(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + EQUAL_OFFSET));
return returnValue;
	}

	public void setEqual(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ equal__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + EQUAL_OFFSET, equal__);
	}

	private static final int HASH_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ hash(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + HASH_OFFSET));
return returnValue;
	}

	public void setHash(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ hash__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + HASH_OFFSET, hash__);
	}
}
