package com.apple.jobjc.appkit;

public  class NSParagraphStyleClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSParagraphStyleClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSParagraphStyleClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSParagraphStyleClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultParagraphStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultParagraphStyle_CMetInst(){
		return ((defaultParagraphStyle_CMetInst != null)
	? (defaultParagraphStyle_CMetInst)
	: (defaultParagraphStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultParagraphStyle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSParagraphStyle defaultParagraphStyle(){
			final com.apple.jobjc.Invoke.MsgSend defaultParagraphStyle_CMetInst = get_defaultParagraphStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultParagraphStyle_CMetInst.init(nativeBuffer, this);
		defaultParagraphStyle_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSParagraphStyle returnValue = (com.apple.jobjc.appkit.NSParagraphStyle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultWritingDirectionForLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultWritingDirectionForLanguage_CMetInst(){
		return ((defaultWritingDirectionForLanguage_CMetInst != null)
	? (defaultWritingDirectionForLanguage_CMetInst)
	: (defaultWritingDirectionForLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultWritingDirectionForLanguage:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long defaultWritingDirectionForLanguage(final com.apple.jobjc.foundation.NSString languageName){
			final com.apple.jobjc.Invoke.MsgSend defaultWritingDirectionForLanguage_CMetInst = get_defaultWritingDirectionForLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultWritingDirectionForLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, languageName);
		defaultWritingDirectionForLanguage_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
