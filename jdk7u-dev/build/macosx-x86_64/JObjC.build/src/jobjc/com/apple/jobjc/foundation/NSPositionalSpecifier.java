package com.apple.jobjc.foundation;

public  class NSPositionalSpecifier extends com.apple.jobjc.foundation.NSObject {
	public NSPositionalSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPositionalSpecifier(final NSPositionalSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend evaluate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluate_IMetInst(){
		return ((evaluate_IMetInst != null)
	? (evaluate_IMetInst)
	: (evaluate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void evaluate(){
			final com.apple.jobjc.Invoke.MsgSend evaluate_IMetInst = get_evaluate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluate_IMetInst.init(nativeBuffer, this);
		evaluate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPosition_objectSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPosition_objectSpecifier_IMetInst(){
		return ((initWithPosition_objectSpecifier_IMetInst != null)
	? (initWithPosition_objectSpecifier_IMetInst)
	: (initWithPosition_objectSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPosition:objectSpecifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPosition_objectSpecifier(final long position, final com.apple.jobjc.foundation.NSScriptObjectSpecifier specifier){
			final com.apple.jobjc.Invoke.MsgSend initWithPosition_objectSpecifier_IMetInst = get_initWithPosition_objectSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPosition_objectSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, position);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, specifier);
		initWithPosition_objectSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertionContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertionContainer_IMetInst(){
		return ((insertionContainer_IMetInst != null)
	? (insertionContainer_IMetInst)
	: (insertionContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertionContainer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T insertionContainer(){
			final com.apple.jobjc.Invoke.MsgSend insertionContainer_IMetInst = get_insertionContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertionContainer_IMetInst.init(nativeBuffer, this);
		insertionContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertionIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertionIndex_IMetInst(){
		return ((insertionIndex_IMetInst != null)
	? (insertionIndex_IMetInst)
	: (insertionIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertionIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long insertionIndex(){
			final com.apple.jobjc.Invoke.MsgSend insertionIndex_IMetInst = get_insertionIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertionIndex_IMetInst.init(nativeBuffer, this);
		insertionIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertionKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertionKey_IMetInst(){
		return ((insertionKey_IMetInst != null)
	? (insertionKey_IMetInst)
	: (insertionKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertionKey", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString insertionKey(){
			final com.apple.jobjc.Invoke.MsgSend insertionKey_IMetInst = get_insertionKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertionKey_IMetInst.init(nativeBuffer, this);
		insertionKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertionReplaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertionReplaces_IMetInst(){
		return ((insertionReplaces_IMetInst != null)
	? (insertionReplaces_IMetInst)
	: (insertionReplaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertionReplaces", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean insertionReplaces(){
			final com.apple.jobjc.Invoke.MsgSend insertionReplaces_IMetInst = get_insertionReplaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertionReplaces_IMetInst.init(nativeBuffer, this);
		insertionReplaces_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectSpecifier_IMetInst(){
		return ((objectSpecifier_IMetInst != null)
	? (objectSpecifier_IMetInst)
	: (objectSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier objectSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst = get_objectSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectSpecifier_IMetInst.init(nativeBuffer, this);
		objectSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend position_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_position_IMetInst(){
		return ((position_IMetInst != null)
	? (position_IMetInst)
	: (position_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "position", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long position(){
			final com.apple.jobjc.Invoke.MsgSend position_IMetInst = get_position_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		position_IMetInst.init(nativeBuffer, this);
		position_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setInsertionClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInsertionClassDescription_IMetInst(){
		return ((setInsertionClassDescription_IMetInst != null)
	? (setInsertionClassDescription_IMetInst)
	: (setInsertionClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInsertionClassDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInsertionClassDescription(final com.apple.jobjc.foundation.NSScriptClassDescription classDescription){
			final com.apple.jobjc.Invoke.MsgSend setInsertionClassDescription_IMetInst = get_setInsertionClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInsertionClassDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDescription);
		setInsertionClassDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

}
