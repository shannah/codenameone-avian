package com.apple.jobjc.corefoundation;

public final class CFXMLExternalID extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected CFXMLExternalID newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLExternalID(runtime); }
	};

	CFXMLExternalID(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLExternalID(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int SYSTEMID_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFURLRefCFType systemID(){
final com.apple.jobjc.corefoundation.CFURLRefCFType returnValue = (com.apple.jobjc.corefoundation.CFURLRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + SYSTEMID_OFFSET));
return returnValue;
	}

	public void setSystemID(final com.apple.jobjc.corefoundation.CFURLRefCFType systemID__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + SYSTEMID_OFFSET, systemID__);
	}

	private static final int PUBLICID_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType publicID(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + PUBLICID_OFFSET));
return returnValue;
	}

	public void setPublicID(final com.apple.jobjc.corefoundation.CFStringRefCFType publicID__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + PUBLICID_OFFSET, publicID__);
	}
}
