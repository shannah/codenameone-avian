package com.apple.jobjc.corefoundation;

public final class CFXMLDocumentTypeInfo extends com.apple.jobjc.Struct {

	public static int SIZEOF = com.apple.jobjc.JObjCRuntime.IS64 ? 16 : 8;

	public final static com.apple.jobjc.Coder.StructCoder getStructCoder(){ return coder; }
	@Override public final com.apple.jobjc.Coder.StructCoder getCoder(){ return coder; }
	private final static com.apple.jobjc.Coder.StructCoder coder = new com.apple.jobjc.Coder.StructCoder(SIZEOF,
		com.apple.jobjc.corefoundation.CFXMLExternalID.getStructCoder()){
		@Override protected CFXMLDocumentTypeInfo newInstance(com.apple.jobjc.JObjCRuntime runtime){ return new CFXMLDocumentTypeInfo(runtime); }
	};

	CFXMLDocumentTypeInfo(final com.apple.jobjc.JObjCRuntime runtime){
		super(runtime, SIZEOF);
	}

	public CFXMLDocumentTypeInfo(final com.apple.jobjc.JObjCRuntime runtime, final com.apple.jobjc.NativeBuffer buffer) {
		super(runtime, buffer, SIZEOF);
	}

	private static final int EXTERNALID_OFFSET = com.apple.jobjc.JObjCRuntime.IS64 ? 0 : 0;
	private com.apple.jobjc.corefoundation.CFXMLExternalID externalID__ = null;
	public com.apple.jobjc.corefoundation.CFXMLExternalID externalID(){
		if(null==externalID__){
			this.raw.position(EXTERNALID_OFFSET);
			externalID__ = com.apple.jobjc.JObjC.getInstance(getRuntime()).CoreFoundation().makeCFXMLExternalID(this.raw.slice());
		}
		return externalID__;
	}
}
