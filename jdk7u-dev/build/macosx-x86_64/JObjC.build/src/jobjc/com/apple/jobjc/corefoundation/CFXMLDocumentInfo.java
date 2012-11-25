package com.apple.jobjc.corefoundation;

public final class CFXMLDocumentInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST){
		@Override protected CFXMLDocumentInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLDocumentInfo(runtime); }
	};

	CFXMLDocumentInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLDocumentInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int SOURCEURL_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFURLRefCFType sourceURL(){
final com.apple.jobjc.corefoundation.CFURLRefCFType returnValue = (com.apple.jobjc.corefoundation.CFURLRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + SOURCEURL_OFFSET));
return returnValue;
	}

	public void setSourceURL(final com.apple.jobjc.corefoundation.CFURLRefCFType sourceURL__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + SOURCEURL_OFFSET, sourceURL__);
	}

	private static final int ENCODING_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int encoding(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + ENCODING_OFFSET));
return returnValue;
	}

	public void setEncoding(final int encoding__){
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + ENCODING_OFFSET, encoding__);
	}
}
