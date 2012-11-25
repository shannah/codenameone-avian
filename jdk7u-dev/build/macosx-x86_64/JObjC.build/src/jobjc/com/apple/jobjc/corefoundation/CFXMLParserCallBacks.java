package com.apple.jobjc.corefoundation;

public final class CFXMLParserCallBacks extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 48 : 24;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST,
		com.apple.jobjc.Coder.UnknownCoder.INST){
		@Override protected CFXMLParserCallBacks newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLParserCallBacks(runtime); }
	};

	CFXMLParserCallBacks(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLParserCallBacks(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int VERSION_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long version(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + VERSION_OFFSET));
return returnValue;
	}

	public void setVersion(final long version__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + VERSION_OFFSET, version__);
	}

	private static final int CREATEXMLSTRUCTURE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ createXMLStructure(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + CREATEXMLSTRUCTURE_OFFSET));
return returnValue;
	}

	public void setCreateXMLStructure(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ createXMLStructure__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + CREATEXMLSTRUCTURE_OFFSET, createXMLStructure__);
	}

	private static final int ADDCHILD_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ addChild(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ADDCHILD_OFFSET));
return returnValue;
	}

	public void setAddChild(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ addChild__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + ADDCHILD_OFFSET, addChild__);
	}

	private static final int ENDXMLSTRUCTURE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ endXMLStructure(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ENDXMLSTRUCTURE_OFFSET));
return returnValue;
	}

	public void setEndXMLStructure(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ endXMLStructure__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + ENDXMLSTRUCTURE_OFFSET, endXMLStructure__);
	}

	private static final int RESOLVEEXTERNALENTITY_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ resolveExternalEntity(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + RESOLVEEXTERNALENTITY_OFFSET));
return returnValue;
	}

	public void setResolveExternalEntity(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ resolveExternalEntity__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + RESOLVEEXTERNALENTITY_OFFSET, resolveExternalEntity__);
	}

	private static final int HANDLEERROR_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$UnknownCoderDescriptor
	public Object /* CFWriteStreamClientCallBack (^?, ^?) */ handleError(){
final Object /* CFWriteStreamClientCallBack (^?, ^?) */ returnValue = (Object /* CFWriteStreamClientCallBack (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(getRuntime(), this.raw.bufferPtr + HANDLEERROR_OFFSET));
return returnValue;
	}

	public void setHandleError(final Object /* CFWriteStreamClientCallBack (^?, ^?) */ handleError__){
		com.apple.jobjc.Coder.UnknownCoder.INST.push(getRuntime(), this.raw.bufferPtr + HANDLEERROR_OFFSET, handleError__);
	}
}
