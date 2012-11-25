package com.apple.jobjc.foundation;

public final class NSPoint extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder){
		@Override protected NSPoint newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSPoint(runtime); }
	};

	NSPoint(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSPoint(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int X_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double x(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + X_OFFSET));
return returnValue;
	}

	public void setX(final double x__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + X_OFFSET, x__);
	}

	private static final int Y_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double y(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + Y_OFFSET));
return returnValue;
	}

	public void setY(final double y__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + Y_OFFSET, y__);
	}
}
