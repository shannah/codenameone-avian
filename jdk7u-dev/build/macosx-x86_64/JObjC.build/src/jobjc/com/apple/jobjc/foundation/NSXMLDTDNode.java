package com.apple.jobjc.foundation;

public  class NSXMLDTDNode extends com.apple.jobjc.foundation.NSXMLNode {
	public NSXMLDTDNode(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLDTDNode(final NSXMLDTDNode obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend DTDKind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_DTDKind_IMetInst(){
		return ((DTDKind_IMetInst != null)
	? (DTDKind_IMetInst)
	: (DTDKind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "DTDKind", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long DTDKind(){
			final com.apple.jobjc.Invoke.MsgSend DTDKind_IMetInst = get_DTDKind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		DTDKind_IMetInst.init(nativeBuffer, this);
		DTDKind_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithXMLString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithXMLString_IMetInst(){
		return ((initWithXMLString_IMetInst != null)
	? (initWithXMLString_IMetInst)
	: (initWithXMLString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithXMLString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithXMLString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend initWithXMLString_IMetInst = get_initWithXMLString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithXMLString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		initWithXMLString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExternal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExternal_IMetInst(){
		return ((isExternal_IMetInst != null)
	? (isExternal_IMetInst)
	: (isExternal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExternal", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExternal(){
			final com.apple.jobjc.Invoke.MsgSend isExternal_IMetInst = get_isExternal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExternal_IMetInst.init(nativeBuffer, this);
		isExternal_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notationName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notationName_IMetInst(){
		return ((notationName_IMetInst != null)
	? (notationName_IMetInst)
	: (notationName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notationName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString notationName(){
			final com.apple.jobjc.Invoke.MsgSend notationName_IMetInst = get_notationName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notationName_IMetInst.init(nativeBuffer, this);
		notationName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend publicID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_publicID_IMetInst(){
		return ((publicID_IMetInst != null)
	? (publicID_IMetInst)
	: (publicID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "publicID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString publicID(){
			final com.apple.jobjc.Invoke.MsgSend publicID_IMetInst = get_publicID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		publicID_IMetInst.init(nativeBuffer, this);
		publicID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDTDKind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDTDKind_IMetInst(){
		return ((setDTDKind_IMetInst != null)
	? (setDTDKind_IMetInst)
	: (setDTDKind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDTDKind:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDTDKind(final long kind){
			final com.apple.jobjc.Invoke.MsgSend setDTDKind_IMetInst = get_setDTDKind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDTDKind_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, kind);
		setDTDKind_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNotationName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNotationName_IMetInst(){
		return ((setNotationName_IMetInst != null)
	? (setNotationName_IMetInst)
	: (setNotationName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNotationName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNotationName(final com.apple.jobjc.foundation.NSString notationName){
			final com.apple.jobjc.Invoke.MsgSend setNotationName_IMetInst = get_setNotationName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNotationName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notationName);
		setNotationName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPublicID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPublicID_IMetInst(){
		return ((setPublicID_IMetInst != null)
	? (setPublicID_IMetInst)
	: (setPublicID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPublicID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPublicID(final com.apple.jobjc.foundation.NSString publicID){
			final com.apple.jobjc.Invoke.MsgSend setPublicID_IMetInst = get_setPublicID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPublicID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, publicID);
		setPublicID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSystemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSystemID_IMetInst(){
		return ((setSystemID_IMetInst != null)
	? (setSystemID_IMetInst)
	: (setSystemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSystemID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSystemID(final com.apple.jobjc.foundation.NSString systemID){
			final com.apple.jobjc.Invoke.MsgSend setSystemID_IMetInst = get_setSystemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSystemID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		setSystemID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemID_IMetInst(){
		return ((systemID_IMetInst != null)
	? (systemID_IMetInst)
	: (systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString systemID(){
			final com.apple.jobjc.Invoke.MsgSend systemID_IMetInst = get_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemID_IMetInst.init(nativeBuffer, this);
		systemID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
