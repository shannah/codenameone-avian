package com.apple.jobjc.foundation;

public  class NSInvocation extends com.apple.jobjc.foundation.NSObject {
	public NSInvocation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSInvocation(final NSInvocation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend argumentsRetained_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_argumentsRetained_IMetInst(){
		return ((argumentsRetained_IMetInst != null)
	? (argumentsRetained_IMetInst)
	: (argumentsRetained_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "argumentsRetained", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean argumentsRetained(){
			final com.apple.jobjc.Invoke.MsgSend argumentsRetained_IMetInst = get_argumentsRetained_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		argumentsRetained_IMetInst.init(nativeBuffer, this);
		argumentsRetained_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getArgument_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getArgument_atIndex_IMetInst(){
		return ((getArgument_atIndex_IMetInst != null)
	? (getArgument_atIndex_IMetInst)
	: (getArgument_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getArgument:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void getArgument_atIndex(final com.apple.jobjc.Pointer<Void> argumentLocation, final long idx){
			final com.apple.jobjc.Invoke.MsgSend getArgument_atIndex_IMetInst = get_getArgument_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getArgument_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, argumentLocation);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, idx);
		getArgument_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getReturnValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getReturnValue_IMetInst(){
		return ((getReturnValue_IMetInst != null)
	? (getReturnValue_IMetInst)
	: (getReturnValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getReturnValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getReturnValue(final com.apple.jobjc.Pointer<Void> retLoc){
			final com.apple.jobjc.Invoke.MsgSend getReturnValue_IMetInst = get_getReturnValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getReturnValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, retLoc);
		getReturnValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invoke_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invoke_IMetInst(){
		return ((invoke_IMetInst != null)
	? (invoke_IMetInst)
	: (invoke_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invoke", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invoke(){
			final com.apple.jobjc.Invoke.MsgSend invoke_IMetInst = get_invoke_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invoke_IMetInst.init(nativeBuffer, this);
		invoke_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invokeWithTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invokeWithTarget_IMetInst(){
		return ((invokeWithTarget_IMetInst != null)
	? (invokeWithTarget_IMetInst)
	: (invokeWithTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invokeWithTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void invokeWithTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend invokeWithTarget_IMetInst = get_invokeWithTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invokeWithTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		invokeWithTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend methodSignature_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodSignature_IMetInst(){
		return ((methodSignature_IMetInst != null)
	? (methodSignature_IMetInst)
	: (methodSignature_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodSignature", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMethodSignature methodSignature(){
			final com.apple.jobjc.Invoke.MsgSend methodSignature_IMetInst = get_methodSignature_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodSignature_IMetInst.init(nativeBuffer, this);
		methodSignature_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMethodSignature returnValue = (com.apple.jobjc.foundation.NSMethodSignature) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend retainArguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_retainArguments_IMetInst(){
		return ((retainArguments_IMetInst != null)
	? (retainArguments_IMetInst)
	: (retainArguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "retainArguments", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void retainArguments(){
			final com.apple.jobjc.Invoke.MsgSend retainArguments_IMetInst = get_retainArguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		retainArguments_IMetInst.init(nativeBuffer, this);
		retainArguments_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selector_IMetInst(){
		return ((selector_IMetInst != null)
	? (selector_IMetInst)
	: (selector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selector", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL selector(){
			final com.apple.jobjc.Invoke.MsgSend selector_IMetInst = get_selector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selector_IMetInst.init(nativeBuffer, this);
		selector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setArgument_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArgument_atIndex_IMetInst(){
		return ((setArgument_atIndex_IMetInst != null)
	? (setArgument_atIndex_IMetInst)
	: (setArgument_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArgument:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setArgument_atIndex(final com.apple.jobjc.Pointer<Void> argumentLocation, final long idx){
			final com.apple.jobjc.Invoke.MsgSend setArgument_atIndex_IMetInst = get_setArgument_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArgument_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, argumentLocation);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, idx);
		setArgument_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReturnValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReturnValue_IMetInst(){
		return ((setReturnValue_IMetInst != null)
	? (setReturnValue_IMetInst)
	: (setReturnValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReturnValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setReturnValue(final com.apple.jobjc.Pointer<Void> retLoc){
			final com.apple.jobjc.Invoke.MsgSend setReturnValue_IMetInst = get_setReturnValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReturnValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, retLoc);
		setReturnValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelector_IMetInst(){
		return ((setSelector_IMetInst != null)
	? (setSelector_IMetInst)
	: (setSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setSelector(final com.apple.jobjc.SEL selector){
			final com.apple.jobjc.Invoke.MsgSend setSelector_IMetInst = get_setSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		setSelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend target_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_target_IMetInst(){
		return ((target_IMetInst != null)
	? (target_IMetInst)
	: (target_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "target", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T target(){
			final com.apple.jobjc.Invoke.MsgSend target_IMetInst = get_target_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		target_IMetInst.init(nativeBuffer, this);
		target_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
