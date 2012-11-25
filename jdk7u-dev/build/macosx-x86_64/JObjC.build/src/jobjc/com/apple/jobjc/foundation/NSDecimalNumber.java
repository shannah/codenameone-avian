package com.apple.jobjc.foundation;

public  class NSDecimalNumber extends com.apple.jobjc.foundation.NSNumber {
	public NSDecimalNumber(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDecimalNumber(final NSDecimalNumber obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.foundation.NSNumber decimalNumber){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByAdding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByAdding_IMetInst(){
		return ((decimalNumberByAdding_IMetInst != null)
	? (decimalNumberByAdding_IMetInst)
	: (decimalNumberByAdding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByAdding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByAdding(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByAdding_IMetInst = get_decimalNumberByAdding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByAdding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		decimalNumberByAdding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByAdding_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByAdding_withBehavior_IMetInst(){
		return ((decimalNumberByAdding_withBehavior_IMetInst != null)
	? (decimalNumberByAdding_withBehavior_IMetInst)
	: (decimalNumberByAdding_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByAdding:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByAdding_withBehavior(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByAdding_withBehavior_IMetInst = get_decimalNumberByAdding_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByAdding_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByAdding_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByDividingBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByDividingBy_IMetInst(){
		return ((decimalNumberByDividingBy_IMetInst != null)
	? (decimalNumberByDividingBy_IMetInst)
	: (decimalNumberByDividingBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByDividingBy:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByDividingBy(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByDividingBy_IMetInst = get_decimalNumberByDividingBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByDividingBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		decimalNumberByDividingBy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByDividingBy_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByDividingBy_withBehavior_IMetInst(){
		return ((decimalNumberByDividingBy_withBehavior_IMetInst != null)
	? (decimalNumberByDividingBy_withBehavior_IMetInst)
	: (decimalNumberByDividingBy_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByDividingBy:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByDividingBy_withBehavior(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByDividingBy_withBehavior_IMetInst = get_decimalNumberByDividingBy_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByDividingBy_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByDividingBy_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByMultiplyingBy_IMetInst(){
		return ((decimalNumberByMultiplyingBy_IMetInst != null)
	? (decimalNumberByMultiplyingBy_IMetInst)
	: (decimalNumberByMultiplyingBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByMultiplyingBy:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByMultiplyingBy(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingBy_IMetInst = get_decimalNumberByMultiplyingBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByMultiplyingBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		decimalNumberByMultiplyingBy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingBy_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByMultiplyingBy_withBehavior_IMetInst(){
		return ((decimalNumberByMultiplyingBy_withBehavior_IMetInst != null)
	? (decimalNumberByMultiplyingBy_withBehavior_IMetInst)
	: (decimalNumberByMultiplyingBy_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByMultiplyingBy:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByMultiplyingBy_withBehavior(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingBy_withBehavior_IMetInst = get_decimalNumberByMultiplyingBy_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByMultiplyingBy_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByMultiplyingBy_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingByPowerOf10_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByMultiplyingByPowerOf10_IMetInst(){
		return ((decimalNumberByMultiplyingByPowerOf10_IMetInst != null)
	? (decimalNumberByMultiplyingByPowerOf10_IMetInst)
	: (decimalNumberByMultiplyingByPowerOf10_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByMultiplyingByPowerOf10:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByMultiplyingByPowerOf10(final short power){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingByPowerOf10_IMetInst = get_decimalNumberByMultiplyingByPowerOf10_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByMultiplyingByPowerOf10_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, power);
		decimalNumberByMultiplyingByPowerOf10_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst(){
		return ((decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst != null)
	? (decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst)
	: (decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByMultiplyingByPowerOf10:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByMultiplyingByPowerOf10_withBehavior(final short power, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst = get_decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, power);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByMultiplyingByPowerOf10_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByRaisingToPower_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByRaisingToPower_IMetInst(){
		return ((decimalNumberByRaisingToPower_IMetInst != null)
	? (decimalNumberByRaisingToPower_IMetInst)
	: (decimalNumberByRaisingToPower_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByRaisingToPower:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByRaisingToPower(final long power){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByRaisingToPower_IMetInst = get_decimalNumberByRaisingToPower_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByRaisingToPower_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, power);
		decimalNumberByRaisingToPower_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByRaisingToPower_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByRaisingToPower_withBehavior_IMetInst(){
		return ((decimalNumberByRaisingToPower_withBehavior_IMetInst != null)
	? (decimalNumberByRaisingToPower_withBehavior_IMetInst)
	: (decimalNumberByRaisingToPower_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByRaisingToPower:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByRaisingToPower_withBehavior(final long power, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByRaisingToPower_withBehavior_IMetInst = get_decimalNumberByRaisingToPower_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByRaisingToPower_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, power);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByRaisingToPower_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberByRoundingAccordingToBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberByRoundingAccordingToBehavior_IMetInst(){
		return ((decimalNumberByRoundingAccordingToBehavior_IMetInst != null)
	? (decimalNumberByRoundingAccordingToBehavior_IMetInst)
	: (decimalNumberByRoundingAccordingToBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberByRoundingAccordingToBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberByRoundingAccordingToBehavior(final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberByRoundingAccordingToBehavior_IMetInst = get_decimalNumberByRoundingAccordingToBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberByRoundingAccordingToBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberByRoundingAccordingToBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberBySubtracting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberBySubtracting_IMetInst(){
		return ((decimalNumberBySubtracting_IMetInst != null)
	? (decimalNumberBySubtracting_IMetInst)
	: (decimalNumberBySubtracting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberBySubtracting:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberBySubtracting(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberBySubtracting_IMetInst = get_decimalNumberBySubtracting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberBySubtracting_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		decimalNumberBySubtracting_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberBySubtracting_withBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberBySubtracting_withBehavior_IMetInst(){
		return ((decimalNumberBySubtracting_withBehavior_IMetInst != null)
	? (decimalNumberBySubtracting_withBehavior_IMetInst)
	: (decimalNumberBySubtracting_withBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberBySubtracting:withBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberBySubtracting_withBehavior(final com.apple.jobjc.foundation.NSDecimalNumber decimalNumber, final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberBySubtracting_withBehavior_IMetInst = get_decimalNumberBySubtracting_withBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberBySubtracting_withBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, decimalNumber);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		decimalNumberBySubtracting_withBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalValue_IMetInst(){
		return ((decimalValue_IMetInst != null)
	? (decimalValue_IMetInst)
	: (decimalValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalValue", com.apple.jobjc.foundation.NSDecimal.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDecimal decimalValue(){
			final com.apple.jobjc.Invoke.MsgSend decimalValue_IMetInst = get_decimalValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSDecimal returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSDecimal();
		decimalValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_IMetInst(){
		return ((descriptionWithLocale_IMetInst != null)
	? (descriptionWithLocale_IMetInst)
	: (descriptionWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst = get_descriptionWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleValue_IMetInst(){
		return ((doubleValue_IMetInst != null)
	? (doubleValue_IMetInst)
	: (doubleValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double doubleValue(){
			final com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst = get_doubleValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleValue_IMetInst.init(nativeBuffer, this);
		doubleValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDecimal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDecimal_IMetInst(){
		return ((initWithDecimal_IMetInst != null)
	? (initWithDecimal_IMetInst)
	: (initWithDecimal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDecimal:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSDecimal.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDecimal(final com.apple.jobjc.foundation.NSDecimal dcm){
			final com.apple.jobjc.Invoke.MsgSend initWithDecimal_IMetInst = get_initWithDecimal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDecimal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSDecimal.getStructCoder().push(nativeBuffer, dcm);
		initWithDecimal_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMantissa_exponent_isNegative_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMantissa_exponent_isNegative_IMetInst(){
		return ((initWithMantissa_exponent_isNegative_IMetInst != null)
	? (initWithMantissa_exponent_isNegative_IMetInst)
	: (initWithMantissa_exponent_isNegative_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMantissa:exponent:isNegative:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMantissa_exponent_isNegative(final long mantissa, final short exponent, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithMantissa_exponent_isNegative_IMetInst = get_initWithMantissa_exponent_isNegative_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMantissa_exponent_isNegative_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, mantissa);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, exponent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithMantissa_exponent_isNegative_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString numberValue){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, numberValue);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_locale_IMetInst(){
		return ((initWithString_locale_IMetInst != null)
	? (initWithString_locale_IMetInst)
	: (initWithString_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString_locale(final com.apple.jobjc.foundation.NSString numberValue, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend initWithString_locale_IMetInst = get_initWithString_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, numberValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		initWithString_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objCType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objCType_IMetInst(){
		return ((objCType_IMetInst != null)
	? (objCType_IMetInst)
	: (objCType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objCType", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> objCType(){
			final com.apple.jobjc.Invoke.MsgSend objCType_IMetInst = get_objCType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objCType_IMetInst.init(nativeBuffer, this);
		objCType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
