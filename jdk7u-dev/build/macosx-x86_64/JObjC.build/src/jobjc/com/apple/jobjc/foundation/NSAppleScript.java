package com.apple.jobjc.foundation;

public  class NSAppleScript extends com.apple.jobjc.foundation.NSObject {
	public NSAppleScript(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAppleScript(final NSAppleScript obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend compileAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compileAndReturnError_IMetInst(){
		return ((compileAndReturnError_IMetInst != null)
	? (compileAndReturnError_IMetInst)
	: (compileAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compileAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean compileAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> errorInfo){
			final com.apple.jobjc.Invoke.MsgSend compileAndReturnError_IMetInst = get_compileAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compileAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorInfo);
		compileAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executeAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeAndReturnError_IMetInst(){
		return ((executeAndReturnError_IMetInst != null)
	? (executeAndReturnError_IMetInst)
	: (executeAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeAndReturnError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor executeAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> errorInfo){
			final com.apple.jobjc.Invoke.MsgSend executeAndReturnError_IMetInst = get_executeAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorInfo);
		executeAndReturnError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executeAppleEvent_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeAppleEvent_error_IMetInst(){
		return ((executeAppleEvent_error_IMetInst != null)
	? (executeAppleEvent_error_IMetInst)
	: (executeAppleEvent_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeAppleEvent:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor executeAppleEvent_error(final com.apple.jobjc.foundation.NSAppleEventDescriptor event, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> errorInfo){
			final com.apple.jobjc.Invoke.MsgSend executeAppleEvent_error_IMetInst = get_executeAppleEvent_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeAppleEvent_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorInfo);
		executeAppleEvent_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_error_IMetInst(){
		return ((initWithContentsOfURL_error_IMetInst != null)
	? (initWithContentsOfURL_error_IMetInst)
	: (initWithContentsOfURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> errorInfo){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_error_IMetInst = get_initWithContentsOfURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorInfo);
		initWithContentsOfURL_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSource_IMetInst(){
		return ((initWithSource_IMetInst != null)
	? (initWithSource_IMetInst)
	: (initWithSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSource(final com.apple.jobjc.foundation.NSString source){
			final com.apple.jobjc.Invoke.MsgSend initWithSource_IMetInst = get_initWithSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, source);
		initWithSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isCompiled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCompiled_IMetInst(){
		return ((isCompiled_IMetInst != null)
	? (isCompiled_IMetInst)
	: (isCompiled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCompiled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCompiled(){
			final com.apple.jobjc.Invoke.MsgSend isCompiled_IMetInst = get_isCompiled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCompiled_IMetInst.init(nativeBuffer, this);
		isCompiled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend source_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_source_IMetInst(){
		return ((source_IMetInst != null)
	? (source_IMetInst)
	: (source_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "source", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString source(){
			final com.apple.jobjc.Invoke.MsgSend source_IMetInst = get_source_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		source_IMetInst.init(nativeBuffer, this);
		source_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
