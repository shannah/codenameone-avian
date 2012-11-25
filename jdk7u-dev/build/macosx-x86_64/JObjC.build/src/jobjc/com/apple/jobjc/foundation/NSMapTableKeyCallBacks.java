package com.apple.jobjc.foundation;

public final class NSMapTableKeyCallBacks extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 48 : 24;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected NSMapTableKeyCallBacks newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSMapTableKeyCallBacks(runtime); }
	};

	NSMapTableKeyCallBacks(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSMapTableKeyCallBacks(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
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

	private static final int NOTAKEYMARKER_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFTypeRefCFType notAKeyMarker(){
final com.apple.jobjc.corefoundation.CFTypeRefCFType returnValue = (com.apple.jobjc.corefoundation.CFTypeRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + NOTAKEYMARKER_OFFSET));
return returnValue;
	}

	public void setNotAKeyMarker(final com.apple.jobjc.corefoundation.CFTypeRefCFType notAKeyMarker__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + NOTAKEYMARKER_OFFSET, notAKeyMarker__);
	}
}
