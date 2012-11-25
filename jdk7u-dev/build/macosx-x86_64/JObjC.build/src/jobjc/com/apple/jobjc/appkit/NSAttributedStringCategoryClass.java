package com.apple.jobjc.appkit;

public final class NSAttributedStringCategoryClass extends com.apple.jobjc.foundation.NSAttributedStringClass {
	NSAttributedStringCategoryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super("NSAttributedString", runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributedStringWithAttachment_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringWithAttachment_CMetInst(){
		return ((attributedStringWithAttachment_CMetInst != null)
	? (attributedStringWithAttachment_CMetInst)
	: (attributedStringWithAttachment_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringWithAttachment:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringWithAttachment(final com.apple.jobjc.appkit.NSTextAttachment attachment){
			final com.apple.jobjc.Invoke.MsgSend attributedStringWithAttachment_CMetInst = get_attributedStringWithAttachment_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringWithAttachment_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attachment);
		attributedStringWithAttachment_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textFileTypes_CMetInst(){
		return ((textFileTypes_CMetInst != null)
	? (textFileTypes_CMetInst)
	: (textFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend textFileTypes_CMetInst = get_textFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textFileTypes_CMetInst.init(nativeBuffer, this);
		textFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textPasteboardTypes_CMetInst(){
		return ((textPasteboardTypes_CMetInst != null)
	? (textPasteboardTypes_CMetInst)
	: (textPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend textPasteboardTypes_CMetInst = get_textPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textPasteboardTypes_CMetInst.init(nativeBuffer, this);
		textPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textTypes_CMetInst(){
		return ((textTypes_CMetInst != null)
	? (textTypes_CMetInst)
	: (textTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textTypes(){
			final com.apple.jobjc.Invoke.MsgSend textTypes_CMetInst = get_textTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textTypes_CMetInst.init(nativeBuffer, this);
		textTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textUnfilteredFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textUnfilteredFileTypes_CMetInst(){
		return ((textUnfilteredFileTypes_CMetInst != null)
	? (textUnfilteredFileTypes_CMetInst)
	: (textUnfilteredFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textUnfilteredFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textUnfilteredFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend textUnfilteredFileTypes_CMetInst = get_textUnfilteredFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textUnfilteredFileTypes_CMetInst.init(nativeBuffer, this);
		textUnfilteredFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textUnfilteredPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textUnfilteredPasteboardTypes_CMetInst(){
		return ((textUnfilteredPasteboardTypes_CMetInst != null)
	? (textUnfilteredPasteboardTypes_CMetInst)
	: (textUnfilteredPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textUnfilteredPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textUnfilteredPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend textUnfilteredPasteboardTypes_CMetInst = get_textUnfilteredPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textUnfilteredPasteboardTypes_CMetInst.init(nativeBuffer, this);
		textUnfilteredPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textUnfilteredTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textUnfilteredTypes_CMetInst(){
		return ((textUnfilteredTypes_CMetInst != null)
	? (textUnfilteredTypes_CMetInst)
	: (textUnfilteredTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textUnfilteredTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textUnfilteredTypes(){
			final com.apple.jobjc.Invoke.MsgSend textUnfilteredTypes_CMetInst = get_textUnfilteredTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textUnfilteredTypes_CMetInst.init(nativeBuffer, this);
		textUnfilteredTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
