package com.apple.jobjc.corefoundation;

public final class CFAllocatorContext extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 72 : 36;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected CFAllocatorContext newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFAllocatorContext(runtime); }
	};

	CFAllocatorContext(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFAllocatorContext(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
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

	private static final int INFO_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFTypeRefCFType info(){
final com.apple.jobjc.corefoundation.CFTypeRefCFType returnValue = (com.apple.jobjc.corefoundation.CFTypeRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + INFO_OFFSET));
return returnValue;
	}

	public void setInfo(final com.apple.jobjc.corefoundation.CFTypeRefCFType info__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + INFO_OFFSET, info__);
	}

	private static final int RETAIN_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ retain(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET));
return returnValue;
	}

	public void setRetain(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ retain__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET, retain__);
	}

	private static final int RELEASE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ release(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET));
return returnValue;
	}

	public void setRelease(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ release__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET, release__);
	}

	private static final int COPYDESCRIPTION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ copyDescription(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + COPYDESCRIPTION_OFFSET));
return returnValue;
	}

	public void setCopyDescription(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ copyDescription__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + COPYDESCRIPTION_OFFSET, copyDescription__);
	}

	private static final int ALLOCATE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ allocate(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ALLOCATE_OFFSET));
return returnValue;
	}

	public void setAllocate(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ allocate__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + ALLOCATE_OFFSET, allocate__);
	}

	private static final int REALLOCATE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 48 : 24;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ reallocate(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + REALLOCATE_OFFSET));
return returnValue;
	}

	public void setReallocate(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ reallocate__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + REALLOCATE_OFFSET, reallocate__);
	}

	private static final int DEALLOCATE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 56 : 28;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ deallocate(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + DEALLOCATE_OFFSET));
return returnValue;
	}

	public void setDeallocate(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ deallocate__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + DEALLOCATE_OFFSET, deallocate__);
	}

	private static final int PREFERREDSIZE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 64 : 32;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ preferredSize(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + PREFERREDSIZE_OFFSET));
return returnValue;
	}

	public void setPreferredSize(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ preferredSize__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + PREFERREDSIZE_OFFSET, preferredSize__);
	}
}
