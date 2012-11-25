package com.apple.jobjc.foundation;

public final class NSRange extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder,
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder){
		@Override protected NSRange newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSRange(runtime); }
	};

	NSRange(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSRange(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int LOCATION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long location(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + LOCATION_OFFSET));
return returnValue;
	}

	public void setLocation(final long location__){
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(getRuntime(), this.raw.bufferPtr + LOCATION_OFFSET, location__);
	}

	private static final int LENGTH_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long length(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + LENGTH_OFFSET));
return returnValue;
	}

	public void setLength(final long length__){
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(getRuntime(), this.raw.bufferPtr + LENGTH_OFFSET, length__);
	}
}
