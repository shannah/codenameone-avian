package com.apple.jobjc.corefoundation;

public final class CFXMLElementTypeDeclarationInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected CFXMLElementTypeDeclarationInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLElementTypeDeclarationInfo(runtime); }
	};

	CFXMLElementTypeDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLElementTypeDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int CONTENTDESCRIPTION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType contentDescription(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + CONTENTDESCRIPTION_OFFSET));
return returnValue;
	}

	public void setContentDescription(final com.apple.jobjc.corefoundation.CFStringRefCFType contentDescription__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + CONTENTDESCRIPTION_OFFSET, contentDescription__);
	}
}
