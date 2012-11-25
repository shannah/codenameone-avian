package com.apple.jobjc.foundation;

public  class NSCharacterSet extends com.apple.jobjc.foundation.NSObject {
	public NSCharacterSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCharacterSet(final NSCharacterSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend bitmapRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapRepresentation_IMetInst(){
		return ((bitmapRepresentation_IMetInst != null)
	? (bitmapRepresentation_IMetInst)
	: (bitmapRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData bitmapRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend bitmapRepresentation_IMetInst = get_bitmapRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapRepresentation_IMetInst.init(nativeBuffer, this);
		bitmapRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIsMember_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIsMember_IMetInst(){
		return ((characterIsMember_IMetInst != null)
	? (characterIsMember_IMetInst)
	: (characterIsMember_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIsMember:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public boolean characterIsMember(final short aCharacter){
			final com.apple.jobjc.Invoke.MsgSend characterIsMember_IMetInst = get_characterIsMember_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIsMember_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, aCharacter);
		characterIsMember_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasMemberInPlane_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasMemberInPlane_IMetInst(){
		return ((hasMemberInPlane_IMetInst != null)
	? (hasMemberInPlane_IMetInst)
	: (hasMemberInPlane_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasMemberInPlane:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.UCharCoder.INST)));
	}

	 public boolean hasMemberInPlane(final byte thePlane){
			final com.apple.jobjc.Invoke.MsgSend hasMemberInPlane_IMetInst = get_hasMemberInPlane_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasMemberInPlane_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(nativeBuffer, thePlane);
		hasMemberInPlane_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invertedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invertedSet_IMetInst(){
		return ((invertedSet_IMetInst != null)
	? (invertedSet_IMetInst)
	: (invertedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invertedSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCharacterSet invertedSet(){
			final com.apple.jobjc.Invoke.MsgSend invertedSet_IMetInst = get_invertedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invertedSet_IMetInst.init(nativeBuffer, this);
		invertedSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCharacterSet returnValue = (com.apple.jobjc.foundation.NSCharacterSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSupersetOfSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSupersetOfSet_IMetInst(){
		return ((isSupersetOfSet_IMetInst != null)
	? (isSupersetOfSet_IMetInst)
	: (isSupersetOfSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSupersetOfSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSupersetOfSet(final com.apple.jobjc.foundation.NSCharacterSet theOtherSet){
			final com.apple.jobjc.Invoke.MsgSend isSupersetOfSet_IMetInst = get_isSupersetOfSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSupersetOfSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theOtherSet);
		isSupersetOfSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend longCharacterIsMember_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_longCharacterIsMember_IMetInst(){
		return ((longCharacterIsMember_IMetInst != null)
	? (longCharacterIsMember_IMetInst)
	: (longCharacterIsMember_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "longCharacterIsMember:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public boolean longCharacterIsMember(final int theLongChar){
			final com.apple.jobjc.Invoke.MsgSend longCharacterIsMember_IMetInst = get_longCharacterIsMember_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		longCharacterIsMember_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, theLongChar);
		longCharacterIsMember_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
