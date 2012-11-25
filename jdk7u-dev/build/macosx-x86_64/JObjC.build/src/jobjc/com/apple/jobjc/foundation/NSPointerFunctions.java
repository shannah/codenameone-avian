package com.apple.jobjc.foundation;

public  class NSPointerFunctions extends com.apple.jobjc.foundation.NSObject {
	public NSPointerFunctions(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPointerFunctions(final NSPointerFunctions obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acquireFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acquireFunction_IMetInst(){
		return ((acquireFunction_IMetInst != null)
	? (acquireFunction_IMetInst)
	: (acquireFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acquireFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void*(*)(void*,NSUInteger(*)(void*),BOOL) (^?, ^?) */ acquireFunction(){
			final com.apple.jobjc.Invoke.MsgSend acquireFunction_IMetInst = get_acquireFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acquireFunction_IMetInst.init(nativeBuffer, this);
		acquireFunction_IMetInst.invoke(nativeBuffer);
		final Object /* void*(*)(void*,NSUInteger(*)(void*),BOOL) (^?, ^?) */ returnValue = (Object /* void*(*)(void*,NSUInteger(*)(void*),BOOL) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionFunction_IMetInst(){
		return ((descriptionFunction_IMetInst != null)
	? (descriptionFunction_IMetInst)
	: (descriptionFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSString*(*)(void*) (^?, ^?) */ descriptionFunction(){
			final com.apple.jobjc.Invoke.MsgSend descriptionFunction_IMetInst = get_descriptionFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionFunction_IMetInst.init(nativeBuffer, this);
		descriptionFunction_IMetInst.invoke(nativeBuffer);
		final Object /* NSString*(*)(void*) (^?, ^?) */ returnValue = (Object /* NSString*(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hashFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hashFunction_IMetInst(){
		return ((hashFunction_IMetInst != null)
	? (hashFunction_IMetInst)
	: (hashFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hashFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSUInteger(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ hashFunction(){
			final com.apple.jobjc.Invoke.MsgSend hashFunction_IMetInst = get_hashFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hashFunction_IMetInst.init(nativeBuffer, this);
		hashFunction_IMetInst.invoke(nativeBuffer);
		final Object /* NSUInteger(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOptions_IMetInst(){
		return ((initWithOptions_IMetInst != null)
	? (initWithOptions_IMetInst)
	: (initWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithOptions_IMetInst = get_initWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualFunction_IMetInst(){
		return ((isEqualFunction_IMetInst != null)
	? (isEqualFunction_IMetInst)
	: (isEqualFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* BOOL(*)(void*,void*,NSUInteger(*)(void*)) (^?, ^?) */ isEqualFunction(){
			final com.apple.jobjc.Invoke.MsgSend isEqualFunction_IMetInst = get_isEqualFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualFunction_IMetInst.init(nativeBuffer, this);
		isEqualFunction_IMetInst.invoke(nativeBuffer);
		final Object /* BOOL(*)(void*,void*,NSUInteger(*)(void*)) (^?, ^?) */ returnValue = (Object /* BOOL(*)(void*,void*,NSUInteger(*)(void*)) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend relinquishFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relinquishFunction_IMetInst(){
		return ((relinquishFunction_IMetInst != null)
	? (relinquishFunction_IMetInst)
	: (relinquishFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relinquishFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ relinquishFunction(){
			final com.apple.jobjc.Invoke.MsgSend relinquishFunction_IMetInst = get_relinquishFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relinquishFunction_IMetInst.init(nativeBuffer, this);
		relinquishFunction_IMetInst.invoke(nativeBuffer);
		final Object /* void(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ returnValue = (Object /* void(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcquireFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcquireFunction_IMetInst(){
		return ((setAcquireFunction_IMetInst != null)
	? (setAcquireFunction_IMetInst)
	: (setAcquireFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcquireFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setAcquireFunction(final Object /* void*(*)(void*,NSUInteger(*)(void*),BOOL) (^?, ^?) */ acquireFunction){
			final com.apple.jobjc.Invoke.MsgSend setAcquireFunction_IMetInst = get_setAcquireFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcquireFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, acquireFunction);
		setAcquireFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDescriptionFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDescriptionFunction_IMetInst(){
		return ((setDescriptionFunction_IMetInst != null)
	? (setDescriptionFunction_IMetInst)
	: (setDescriptionFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDescriptionFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setDescriptionFunction(final Object /* NSString*(*)(void*) (^?, ^?) */ descriptionFunction){
			final com.apple.jobjc.Invoke.MsgSend setDescriptionFunction_IMetInst = get_setDescriptionFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDescriptionFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, descriptionFunction);
		setDescriptionFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHashFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHashFunction_IMetInst(){
		return ((setHashFunction_IMetInst != null)
	? (setHashFunction_IMetInst)
	: (setHashFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHashFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setHashFunction(final Object /* NSUInteger(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ hashFunction){
			final com.apple.jobjc.Invoke.MsgSend setHashFunction_IMetInst = get_setHashFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHashFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, hashFunction);
		setHashFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIsEqualFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIsEqualFunction_IMetInst(){
		return ((setIsEqualFunction_IMetInst != null)
	? (setIsEqualFunction_IMetInst)
	: (setIsEqualFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIsEqualFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setIsEqualFunction(final Object /* BOOL(*)(void*,void*,NSUInteger(*)(void*)) (^?, ^?) */ isEqualFunction){
			final com.apple.jobjc.Invoke.MsgSend setIsEqualFunction_IMetInst = get_setIsEqualFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIsEqualFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, isEqualFunction);
		setIsEqualFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRelinquishFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRelinquishFunction_IMetInst(){
		return ((setRelinquishFunction_IMetInst != null)
	? (setRelinquishFunction_IMetInst)
	: (setRelinquishFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRelinquishFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setRelinquishFunction(final Object /* void(*)(void*,NSUInteger(*)(void*)) (^?, ^?) */ relinquishFunction){
			final com.apple.jobjc.Invoke.MsgSend setRelinquishFunction_IMetInst = get_setRelinquishFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRelinquishFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, relinquishFunction);
		setRelinquishFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSizeFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSizeFunction_IMetInst(){
		return ((setSizeFunction_IMetInst != null)
	? (setSizeFunction_IMetInst)
	: (setSizeFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSizeFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setSizeFunction(final Object /* NSUInteger(*)(void*) (^?, ^?) */ sizeFunction){
			final com.apple.jobjc.Invoke.MsgSend setSizeFunction_IMetInst = get_setSizeFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSizeFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, sizeFunction);
		setSizeFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesStrongWriteBarrier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesStrongWriteBarrier_IMetInst(){
		return ((setUsesStrongWriteBarrier_IMetInst != null)
	? (setUsesStrongWriteBarrier_IMetInst)
	: (setUsesStrongWriteBarrier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesStrongWriteBarrier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesStrongWriteBarrier(final boolean usesStrongWriteBarrier){
			final com.apple.jobjc.Invoke.MsgSend setUsesStrongWriteBarrier_IMetInst = get_setUsesStrongWriteBarrier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesStrongWriteBarrier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, usesStrongWriteBarrier);
		setUsesStrongWriteBarrier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesWeakReadAndWriteBarriers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesWeakReadAndWriteBarriers_IMetInst(){
		return ((setUsesWeakReadAndWriteBarriers_IMetInst != null)
	? (setUsesWeakReadAndWriteBarriers_IMetInst)
	: (setUsesWeakReadAndWriteBarriers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesWeakReadAndWriteBarriers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesWeakReadAndWriteBarriers(final boolean usesWeakReadAndWriteBarriers){
			final com.apple.jobjc.Invoke.MsgSend setUsesWeakReadAndWriteBarriers_IMetInst = get_setUsesWeakReadAndWriteBarriers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesWeakReadAndWriteBarriers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, usesWeakReadAndWriteBarriers);
		setUsesWeakReadAndWriteBarriers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeFunction_IMetInst(){
		return ((sizeFunction_IMetInst != null)
	? (sizeFunction_IMetInst)
	: (sizeFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSUInteger(*)(void*) (^?, ^?) */ sizeFunction(){
			final com.apple.jobjc.Invoke.MsgSend sizeFunction_IMetInst = get_sizeFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeFunction_IMetInst.init(nativeBuffer, this);
		sizeFunction_IMetInst.invoke(nativeBuffer);
		final Object /* NSUInteger(*)(void*) (^?, ^?) */ returnValue = (Object /* NSUInteger(*)(void*) (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesStrongWriteBarrier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesStrongWriteBarrier_IMetInst(){
		return ((usesStrongWriteBarrier_IMetInst != null)
	? (usesStrongWriteBarrier_IMetInst)
	: (usesStrongWriteBarrier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesStrongWriteBarrier", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesStrongWriteBarrier(){
			final com.apple.jobjc.Invoke.MsgSend usesStrongWriteBarrier_IMetInst = get_usesStrongWriteBarrier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesStrongWriteBarrier_IMetInst.init(nativeBuffer, this);
		usesStrongWriteBarrier_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesWeakReadAndWriteBarriers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesWeakReadAndWriteBarriers_IMetInst(){
		return ((usesWeakReadAndWriteBarriers_IMetInst != null)
	? (usesWeakReadAndWriteBarriers_IMetInst)
	: (usesWeakReadAndWriteBarriers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesWeakReadAndWriteBarriers", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesWeakReadAndWriteBarriers(){
			final com.apple.jobjc.Invoke.MsgSend usesWeakReadAndWriteBarriers_IMetInst = get_usesWeakReadAndWriteBarriers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesWeakReadAndWriteBarriers_IMetInst.init(nativeBuffer, this);
		usesWeakReadAndWriteBarriers_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
