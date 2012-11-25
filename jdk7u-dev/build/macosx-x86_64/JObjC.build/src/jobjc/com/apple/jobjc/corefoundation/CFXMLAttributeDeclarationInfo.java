package com.apple.jobjc.corefoundation;

public final class CFXMLAttributeDeclarationInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected CFXMLAttributeDeclarationInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLAttributeDeclarationInfo(runtime); }
	};

	CFXMLAttributeDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLAttributeDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int ATTRIBUTENAME_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType attributeName(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ATTRIBUTENAME_OFFSET));
return returnValue;
	}

	public void setAttributeName(final com.apple.jobjc.corefoundation.CFStringRefCFType attributeName__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + ATTRIBUTENAME_OFFSET, attributeName__);
	}

	private static final int TYPESTRING_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType typeString(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + TYPESTRING_OFFSET));
return returnValue;
	}

	public void setTypeString(final com.apple.jobjc.corefoundation.CFStringRefCFType typeString__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + TYPESTRING_OFFSET, typeString__);
	}

	private static final int DEFAULTSTRING_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType defaultString(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + DEFAULTSTRING_OFFSET));
return returnValue;
	}

	public void setDefaultString(final com.apple.jobjc.corefoundation.CFStringRefCFType defaultString__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + DEFAULTSTRING_OFFSET, defaultString__);
	}
}
