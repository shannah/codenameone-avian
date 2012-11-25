package com.apple.jobjc.foundation;

public final class NSHashTableCallBacks extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected NSHashTableCallBacks newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSHashTableCallBacks(runtime); }
	};

	NSHashTableCallBacks(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSHashTableCallBacks(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int HASH_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* NSUInteger(*)(void*) (^?, ^?) */ hash(){
final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + HASH_OFFSET));
return returnValue;
	}

	public void setHash(final Object /* NSUInteger(*)(void*) (^?, ^?) */ hash__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + HASH_OFFSET, hash__);
	}

	private static final int ISEQUAL_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* NSUInteger(*)(void*) (^?, ^?) */ isEqual(){
final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ISEQUAL_OFFSET));
return returnValue;
	}

	public void setIsEqual(final Object /* NSUInteger(*)(void*) (^?, ^?) */ isEqual__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + ISEQUAL_OFFSET, isEqual__);
	}

	private static final int RETAIN_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* NSUInteger(*)(void*) (^?, ^?) */ retain(){
final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET));
return returnValue;
	}

	public void setRetain(final Object /* NSUInteger(*)(void*) (^?, ^?) */ retain__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RETAIN_OFFSET, retain__);
	}

	private static final int RELEASE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* NSUInteger(*)(void*) (^?, ^?) */ release(){
final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET));
return returnValue;
	}

	public void setRelease(final Object /* NSUInteger(*)(void*) (^?, ^?) */ release__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RELEASE_OFFSET, release__);
	}

	private static final int DESCRIBE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* NSUInteger(*)(void*) (^?, ^?) */ describe(){
final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + DESCRIBE_OFFSET));
return returnValue;
	}

	public void setDescribe(final Object /* NSUInteger(*)(void*) (^?, ^?) */ describe__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + DESCRIBE_OFFSET, describe__);
	}
}
