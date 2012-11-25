package com.apple.jobjc.foundation;

public  class NSNetServiceClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSNetServiceClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNetServiceClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNetServiceClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dataFromTXTRecordDictionary_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataFromTXTRecordDictionary_CMetInst(){
		return ((dataFromTXTRecordDictionary_CMetInst != null)
	? (dataFromTXTRecordDictionary_CMetInst)
	: (dataFromTXTRecordDictionary_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataFromTXTRecordDictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataFromTXTRecordDictionary(final com.apple.jobjc.foundation.NSDictionary txtDictionary){
			final com.apple.jobjc.Invoke.MsgSend dataFromTXTRecordDictionary_CMetInst = get_dataFromTXTRecordDictionary_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataFromTXTRecordDictionary_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, txtDictionary);
		dataFromTXTRecordDictionary_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryFromTXTRecordData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryFromTXTRecordData_CMetInst(){
		return ((dictionaryFromTXTRecordData_CMetInst != null)
	? (dictionaryFromTXTRecordData_CMetInst)
	: (dictionaryFromTXTRecordData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryFromTXTRecordData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryFromTXTRecordData(final com.apple.jobjc.foundation.NSData txtData){
			final com.apple.jobjc.Invoke.MsgSend dictionaryFromTXTRecordData_CMetInst = get_dictionaryFromTXTRecordData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryFromTXTRecordData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, txtData);
		dictionaryFromTXTRecordData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
