package com.apple.jobjc.foundation;

public final class NSDecimal extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 20 : 20;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected NSDecimal newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSDecimal(runtime); }
	};

	NSDecimal(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSDecimal(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}
	// Skipping bitfield '_exponent'
	// Skipping bitfield '_length'
	// Skipping bitfield '_isNegative'
	// Skipping bitfield '_isCompact'
	// Skipping bitfield '_reserved'

	private static final int _MANTISSA_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null ([8S], [8S]) */ _mantissa(){
final Object /* null ([8S], [8S]) */ returnValue = (Object /* null ([8S], [8S]) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + _MANTISSA_OFFSET));
return returnValue;
	}

	public void set_mantissa(final Object /* null ([8S], [8S]) */ _mantissa__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + _MANTISSA_OFFSET, _mantissa__);
	}
}
