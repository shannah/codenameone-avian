package com.apple.jobjc.foundation;

public final class NSSwappedDouble extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST){
		@Override protected NSSwappedDouble newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSSwappedDouble(runtime); }
	};

	NSSwappedDouble(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSSwappedDouble(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int V_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public long v(){
final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(getRuntime(), this.raw.bufferPtr + V_OFFSET));
return returnValue;
	}

	public void setV(final long v__){
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(getRuntime(), this.raw.bufferPtr + V_OFFSET, v__);
	}
}
