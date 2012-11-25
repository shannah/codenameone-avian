package com.apple.jobjc.corefoundation;

public final class CFXMLEntityInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 40 : 20;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder,
		com.apple.jobjc.Coder.PointerCoder.INST,
		com.apple.jobjc.corefoundation.CFXMLExternalID.getStructCoder(),
		com.apple.jobjc.Coder.PointerCoder.INST){
		@Override protected CFXMLEntityInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLEntityInfo(runtime); }
	};

	CFXMLEntityInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLEntityInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int ENTITYTYPE_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	//class com.apple.internal.jobjc.generator.model.coders.ComplexCoderDescriptor$MixedEncodingDescriptor
	public long entityType(){
final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(getRuntime(), this.raw.bufferPtr + ENTITYTYPE_OFFSET));
return returnValue;
	}

	public void setEntityType(final long entityType__){
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(getRuntime(), this.raw.bufferPtr + ENTITYTYPE_OFFSET, entityType__);
	}

	private static final int REPLACEMENTTEXT_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 8 : 4;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType replacementText(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + REPLACEMENTTEXT_OFFSET));
return returnValue;
	}

	public void setReplacementText(final com.apple.jobjc.corefoundation.CFStringRefCFType replacementText__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + REPLACEMENTTEXT_OFFSET, replacementText__);
	}

	private static final int ENTITYID_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;
	private com.apple.jobjc.corefoundation.CFXMLExternalID entityID__ = null;
	public com.apple.jobjc.corefoundation.CFXMLExternalID entityID(){
		if(null==entityID__){
			this.raw.position(ENTITYID_OFFSET);
			entityID__ = com.apple.jobjc.JObjC.getInstance(getRuntime()).CoreFoundation().makeCFXMLExternalID(this.raw.slice());
		}
		return entityID__;
	}

	private static final int NOTATIONNAME_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 32 : 16;
	//class com.apple.internal.jobjc.generator.model.coders.CoderDescriptor$PointerCoderDescriptor
	public com.apple.jobjc.corefoundation.CFStringRefCFType notationName(){
final com.apple.jobjc.corefoundation.CFStringRefCFType returnValue = (com.apple.jobjc.corefoundation.CFStringRefCFType) (com.apple.jobjc.Coder.PointerCoder.INST.pop(getRuntime(), this.raw.bufferPtr + NOTATIONNAME_OFFSET));
return returnValue;
	}

	public void setNotationName(final com.apple.jobjc.corefoundation.CFStringRefCFType notationName__){
		com.apple.jobjc.Coder.PointerCoder.INST.push(getRuntime(), this.raw.bufferPtr + NOTATIONNAME_OFFSET, notationName__);
	}
}
