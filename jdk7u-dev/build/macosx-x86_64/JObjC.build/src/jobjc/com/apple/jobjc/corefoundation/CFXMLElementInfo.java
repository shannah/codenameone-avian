package com.apple.jobjc.corefoundation;

public final class CFXMLElementInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected CFXMLElementInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLElementInfo(runtime); }
	};

	CFXMLElementInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLElementInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int ATTRIBUTES_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFMutableDictionaryRefCFType attributes(){
final com.apple.jobjc.corefoundation.CFMutableDictionaryRefCFType returnValue = (com.apple.jobjc.corefoundation.CFMutableDictionaryRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ATTRIBUTES_OFFSET));
return returnValue;
	}

	public void setAttributes(final com.apple.jobjc.corefoundation.CFMutableDictionaryRefCFType attributes__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + ATTRIBUTES_OFFSET, attributes__);
	}

	private static final int ATTRIBUTEORDER_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFMutableArrayRefCFType attributeOrder(){
final com.apple.jobjc.corefoundation.CFMutableArrayRefCFType returnValue = (com.apple.jobjc.corefoundation.CFMutableArrayRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ATTRIBUTEORDER_OFFSET));
return returnValue;
	}

	public void setAttributeOrder(final com.apple.jobjc.corefoundation.CFMutableArrayRefCFType attributeOrder__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + ATTRIBUTEORDER_OFFSET, attributeOrder__);
	}

	private static final int ISEMPTY_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public boolean isEmpty(){
final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(getRuntime(), this.raw.bufferPtr + ISEMPTY_OFFSET));
return returnValue;
	}

	public void setIsEmpty(final boolean isEmpty__){
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(getRuntime(), this.raw.bufferPtr + ISEMPTY_OFFSET, isEmpty__);
	}

	private static final int _RESERVED_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 17 : 9;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* null ([3c], [3c]) */ _reserved(){
final Object /* null ([3c], [3c]) */ returnValue = (Object /* null ([3c], [3c]) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + _RESERVED_OFFSET));
return returnValue;
	}

	public void set_reserved(final Object /* null ([3c], [3c]) */ _reserved__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + _RESERVED_OFFSET, _reserved__);
	}
}
