package com.apple.jobjc.corefoundation;

public final class CFSocketSignature extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 24 : 16;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST,
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected CFSocketSignature newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFSocketSignature(runtime); }
	};

	CFSocketSignature(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFSocketSignature(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int PROTOCOLFAMILY_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int protocolFamily(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + PROTOCOLFAMILY_OFFSET));
return returnValue;
	}

	public void setProtocolFamily(final int protocolFamily__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + PROTOCOLFAMILY_OFFSET, protocolFamily__);
	}

	private static final int SOCKETTYPE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 4 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int socketType(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + SOCKETTYPE_OFFSET));
return returnValue;
	}

	public void setSocketType(final int socketType__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + SOCKETTYPE_OFFSET, socketType__);
	}

	private static final int PROTOCOL_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 8;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor
	public int protocol(){
final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(getRuntime(), this.raw.bufferPtr + PROTOCOL_OFFSET));
return returnValue;
	}

	public void setProtocol(final int protocol__){
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(getRuntime(), this.raw.bufferPtr + PROTOCOL_OFFSET, protocol__);
	}

	private static final int ADDRESS_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 12;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFMutableDataRefCFType address(){
final com.apple.jobjc.corefoundation.CFMutableDataRefCFType returnValue = (com.apple.jobjc.corefoundation.CFMutableDataRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + ADDRESS_OFFSET));
return returnValue;
	}

	public void setAddress(final com.apple.jobjc.corefoundation.CFMutableDataRefCFType address__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + ADDRESS_OFFSET, address__);
	}
}
