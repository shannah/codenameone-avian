package com.apple.jobjc.foundation;

public  class NSXPCInterface extends com.apple.jobjc.foundation.NSObject {
	public NSXPCInterface(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXPCInterface(final NSXPCInterface obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classesForSelector_argumentIndex_ofReply_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classesForSelector_argumentIndex_ofReply_IMetInst(){
		return ((classesForSelector_argumentIndex_ofReply_IMetInst != null)
	? (classesForSelector_argumentIndex_ofReply_IMetInst)
	: (classesForSelector_argumentIndex_ofReply_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classesForSelector:argumentIndex:ofReply:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet classesForSelector_argumentIndex_ofReply(final com.apple.jobjc.SEL sel, final long arg, final boolean ofReply){
			final com.apple.jobjc.Invoke.MsgSend classesForSelector_argumentIndex_ofReply_IMetInst = get_classesForSelector_argumentIndex_ofReply_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classesForSelector_argumentIndex_ofReply_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ofReply);
		classesForSelector_argumentIndex_ofReply_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interfaceForSelector_argumentIndex_ofReply_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interfaceForSelector_argumentIndex_ofReply_IMetInst(){
		return ((interfaceForSelector_argumentIndex_ofReply_IMetInst != null)
	? (interfaceForSelector_argumentIndex_ofReply_IMetInst)
	: (interfaceForSelector_argumentIndex_ofReply_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interfaceForSelector:argumentIndex:ofReply:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXPCInterface interfaceForSelector_argumentIndex_ofReply(final com.apple.jobjc.SEL sel, final long arg, final boolean ofReply){
			final com.apple.jobjc.Invoke.MsgSend interfaceForSelector_argumentIndex_ofReply_IMetInst = get_interfaceForSelector_argumentIndex_ofReply_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interfaceForSelector_argumentIndex_ofReply_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ofReply);
		interfaceForSelector_argumentIndex_ofReply_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXPCInterface returnValue = (com.apple.jobjc.foundation.NSXPCInterface) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocol_IMetInst(){
		return ((protocol_IMetInst != null)
	? (protocol_IMetInst)
	: (protocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocol", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* Protocol* (@, @) */ protocol(){
			final com.apple.jobjc.Invoke.MsgSend protocol_IMetInst = get_protocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocol_IMetInst.init(nativeBuffer, this);
		protocol_IMetInst.invoke(nativeBuffer);
		final Object /* Protocol* (@, @) */ returnValue = (Object /* Protocol* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setClasses_forSelector_argumentIndex_ofReply_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClasses_forSelector_argumentIndex_ofReply_IMetInst(){
		return ((setClasses_forSelector_argumentIndex_ofReply_IMetInst != null)
	? (setClasses_forSelector_argumentIndex_ofReply_IMetInst)
	: (setClasses_forSelector_argumentIndex_ofReply_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClasses:forSelector:argumentIndex:ofReply:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setClasses_forSelector_argumentIndex_ofReply(final com.apple.jobjc.foundation.NSSet classes, final com.apple.jobjc.SEL sel, final long arg, final boolean ofReply){
			final com.apple.jobjc.Invoke.MsgSend setClasses_forSelector_argumentIndex_ofReply_IMetInst = get_setClasses_forSelector_argumentIndex_ofReply_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClasses_forSelector_argumentIndex_ofReply_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classes);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ofReply);
		setClasses_forSelector_argumentIndex_ofReply_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInterface_forSelector_argumentIndex_ofReply_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInterface_forSelector_argumentIndex_ofReply_IMetInst(){
		return ((setInterface_forSelector_argumentIndex_ofReply_IMetInst != null)
	? (setInterface_forSelector_argumentIndex_ofReply_IMetInst)
	: (setInterface_forSelector_argumentIndex_ofReply_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInterface:forSelector:argumentIndex:ofReply:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setInterface_forSelector_argumentIndex_ofReply(final com.apple.jobjc.foundation.NSXPCInterface ifc, final com.apple.jobjc.SEL sel, final long arg, final boolean ofReply){
			final com.apple.jobjc.Invoke.MsgSend setInterface_forSelector_argumentIndex_ofReply_IMetInst = get_setInterface_forSelector_argumentIndex_ofReply_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInterface_forSelector_argumentIndex_ofReply_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ifc);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ofReply);
		setInterface_forSelector_argumentIndex_ofReply_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setProtocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProtocol_IMetInst(){
		return ((setProtocol_IMetInst != null)
	? (setProtocol_IMetInst)
	: (setProtocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProtocol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setProtocol(final Object /* Protocol* (@, @) */ protocol){
			final com.apple.jobjc.Invoke.MsgSend setProtocol_IMetInst = get_setProtocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProtocol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, protocol);
		setProtocol_IMetInst.invoke(nativeBuffer);
		
		
	}

}
