package com.apple.jobjc.foundation;

public final class NSSize extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder,
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder){
		@Override protected NSSize newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new NSSize(runtime); }
	};

	NSSize(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public NSSize(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int WIDTH_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double width(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + WIDTH_OFFSET));
return returnValue;
	}

	public void setWidth(final double width__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + WIDTH_OFFSET, width__);
	}

	private static final int HEIGHT_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public double height(){
final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(getRuntime(), this.raw.bufferPtr + HEIGHT_OFFSET));
return returnValue;
	}

	public void setHeight(final double height__){
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(getRuntime(), this.raw.bufferPtr + HEIGHT_OFFSET, height__);
	}
}
