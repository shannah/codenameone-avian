package com.apple.jobjc.foundation;

public  class NSCalendarClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSCalendarClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCalendarClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCalendarClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend autoupdatingCurrentCalendar_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoupdatingCurrentCalendar_CMetInst(){
		return ((autoupdatingCurrentCalendar_CMetInst != null)
	? (autoupdatingCurrentCalendar_CMetInst)
	: (autoupdatingCurrentCalendar_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoupdatingCurrentCalendar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T autoupdatingCurrentCalendar(){
			final com.apple.jobjc.Invoke.MsgSend autoupdatingCurrentCalendar_CMetInst = get_autoupdatingCurrentCalendar_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoupdatingCurrentCalendar_CMetInst.init(nativeBuffer, this);
		autoupdatingCurrentCalendar_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentCalendar_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentCalendar_CMetInst(){
		return ((currentCalendar_CMetInst != null)
	? (currentCalendar_CMetInst)
	: (currentCalendar_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentCalendar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T currentCalendar(){
			final com.apple.jobjc.Invoke.MsgSend currentCalendar_CMetInst = get_currentCalendar_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentCalendar_CMetInst.init(nativeBuffer, this);
		currentCalendar_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
