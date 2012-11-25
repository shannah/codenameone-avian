package com.apple.jobjc.corefoundation;

public final class CFXMLAttributeListDeclarationInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected CFXMLAttributeListDeclarationInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLAttributeListDeclarationInfo(runtime); }
	};

	CFXMLAttributeListDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLAttributeListDeclarationInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int NUMBEROFATTRIBUTES_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long numberOfAttributes(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + NUMBEROFATTRIBUTES_OFFSET));
return returnValue;
	}

	public void setNumberOfAttributes(final long numberOfAttributes__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + NUMBEROFATTRIBUTES_OFFSET, numberOfAttributes__);
	}

	private static final int ATTRIBUTES_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null (^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}, ^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}) */ attributes(){
final Object /* null (^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}, ^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}) */ returnValue = (Object /* null (^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}, ^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ATTRIBUTES_OFFSET));
return returnValue;
	}

	public void setAttributes(final Object /* null (^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}, ^{_CFXMLAttributeDeclarationInfo="attributeName"^{__CFString}"typeString"^{__CFString}"defaultString"^{__CFString}}) */ attributes__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + ATTRIBUTES_OFFSET, attributes__);
	}
}
