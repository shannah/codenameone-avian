package com.apple.jobjc.foundation;

public  class NSDateFormatterClass extends com.apple.jobjc.foundation.NSFormatterClass {
	public NSDateFormatterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDateFormatterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDateFormatterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dateFormatFromTemplate_options_locale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateFormatFromTemplate_options_locale_CMetInst(){
		return ((dateFormatFromTemplate_options_locale_CMetInst != null)
	? (dateFormatFromTemplate_options_locale_CMetInst)
	: (dateFormatFromTemplate_options_locale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateFormatFromTemplate:options:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString dateFormatFromTemplate_options_locale(final com.apple.jobjc.foundation.NSString tmplate, final long opts, final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend dateFormatFromTemplate_options_locale_CMetInst = get_dateFormatFromTemplate_options_locale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateFormatFromTemplate_options_locale_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tmplate);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		dateFormatFromTemplate_options_locale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultFormatterBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultFormatterBehavior_CMetInst(){
		return ((defaultFormatterBehavior_CMetInst != null)
	? (defaultFormatterBehavior_CMetInst)
	: (defaultFormatterBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultFormatterBehavior", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultFormatterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend defaultFormatterBehavior_CMetInst = get_defaultFormatterBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultFormatterBehavior_CMetInst.init(nativeBuffer, this);
		defaultFormatterBehavior_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedStringFromDate_dateStyle_timeStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedStringFromDate_dateStyle_timeStyle_CMetInst(){
		return ((localizedStringFromDate_dateStyle_timeStyle_CMetInst != null)
	? (localizedStringFromDate_dateStyle_timeStyle_CMetInst)
	: (localizedStringFromDate_dateStyle_timeStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStringFromDate:dateStyle:timeStyle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString localizedStringFromDate_dateStyle_timeStyle(final com.apple.jobjc.foundation.NSDate date, final long dstyle, final long tstyle){
			final com.apple.jobjc.Invoke.MsgSend localizedStringFromDate_dateStyle_timeStyle_CMetInst = get_localizedStringFromDate_dateStyle_timeStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStringFromDate_dateStyle_timeStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dstyle);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, tstyle);
		localizedStringFromDate_dateStyle_timeStyle_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultFormatterBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultFormatterBehavior_CMetInst(){
		return ((setDefaultFormatterBehavior_CMetInst != null)
	? (setDefaultFormatterBehavior_CMetInst)
	: (setDefaultFormatterBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultFormatterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultFormatterBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setDefaultFormatterBehavior_CMetInst = get_setDefaultFormatterBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultFormatterBehavior_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, behavior);
		setDefaultFormatterBehavior_CMetInst.invoke(nativeBuffer);
		
		
	}

}
