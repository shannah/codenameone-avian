package com.apple.jobjc.foundation;

public  class NSIndexSet extends com.apple.jobjc.foundation.NSObject {
	public NSIndexSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSIndexSet(final NSIndexSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend containsIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsIndex_IMetInst(){
		return ((containsIndex_IMetInst != null)
	? (containsIndex_IMetInst)
	: (containsIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean containsIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend containsIndex_IMetInst = get_containsIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		containsIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsIndexes_IMetInst(){
		return ((containsIndexes_IMetInst != null)
	? (containsIndexes_IMetInst)
	: (containsIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsIndexes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsIndexes(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend containsIndexes_IMetInst = get_containsIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		containsIndexes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsIndexesInRange_IMetInst(){
		return ((containsIndexesInRange_IMetInst != null)
	? (containsIndexesInRange_IMetInst)
	: (containsIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsIndexesInRange:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public boolean containsIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend containsIndexesInRange_IMetInst = get_containsIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		containsIndexesInRange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_count_IMetInst(){
		return ((count_IMetInst != null)
	? (count_IMetInst)
	: (count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "count", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long count(){
			final com.apple.jobjc.Invoke.MsgSend count_IMetInst = get_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		count_IMetInst.init(nativeBuffer, this);
		count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countOfIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countOfIndexesInRange_IMetInst(){
		return ((countOfIndexesInRange_IMetInst != null)
	? (countOfIndexesInRange_IMetInst)
	: (countOfIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countOfIndexesInRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long countOfIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend countOfIndexesInRange_IMetInst = get_countOfIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countOfIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		countOfIndexesInRange_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateIndexesInRange_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateIndexesInRange_options_usingBlock_IMetInst(){
		return ((enumerateIndexesInRange_options_usingBlock_IMetInst != null)
	? (enumerateIndexesInRange_options_usingBlock_IMetInst)
	: (enumerateIndexesInRange_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateIndexesInRange:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateIndexesInRange_options_usingBlock(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* void(^)(NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateIndexesInRange_options_usingBlock_IMetInst = get_enumerateIndexesInRange_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateIndexesInRange_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateIndexesInRange_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateIndexesUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateIndexesUsingBlock_IMetInst(){
		return ((enumerateIndexesUsingBlock_IMetInst != null)
	? (enumerateIndexesUsingBlock_IMetInst)
	: (enumerateIndexesUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateIndexesUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateIndexesUsingBlock(final Object /* void(^)(NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateIndexesUsingBlock_IMetInst = get_enumerateIndexesUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateIndexesUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateIndexesUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateIndexesWithOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateIndexesWithOptions_usingBlock_IMetInst(){
		return ((enumerateIndexesWithOptions_usingBlock_IMetInst != null)
	? (enumerateIndexesWithOptions_usingBlock_IMetInst)
	: (enumerateIndexesWithOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateIndexesWithOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateIndexesWithOptions_usingBlock(final long opts, final Object /* void(^)(NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateIndexesWithOptions_usingBlock_IMetInst = get_enumerateIndexesWithOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateIndexesWithOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateIndexesWithOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateRangesInRange_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateRangesInRange_options_usingBlock_IMetInst(){
		return ((enumerateRangesInRange_options_usingBlock_IMetInst != null)
	? (enumerateRangesInRange_options_usingBlock_IMetInst)
	: (enumerateRangesInRange_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateRangesInRange:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateRangesInRange_options_usingBlock(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* void(^)(NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateRangesInRange_options_usingBlock_IMetInst = get_enumerateRangesInRange_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateRangesInRange_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateRangesInRange_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateRangesUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateRangesUsingBlock_IMetInst(){
		return ((enumerateRangesUsingBlock_IMetInst != null)
	? (enumerateRangesUsingBlock_IMetInst)
	: (enumerateRangesUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateRangesUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateRangesUsingBlock(final Object /* void(^)(NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateRangesUsingBlock_IMetInst = get_enumerateRangesUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateRangesUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateRangesUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateRangesWithOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateRangesWithOptions_usingBlock_IMetInst(){
		return ((enumerateRangesWithOptions_usingBlock_IMetInst != null)
	? (enumerateRangesWithOptions_usingBlock_IMetInst)
	: (enumerateRangesWithOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateRangesWithOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateRangesWithOptions_usingBlock(final long opts, final Object /* void(^)(NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateRangesWithOptions_usingBlock_IMetInst = get_enumerateRangesWithOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateRangesWithOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateRangesWithOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstIndex_IMetInst(){
		return ((firstIndex_IMetInst != null)
	? (firstIndex_IMetInst)
	: (firstIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstIndex", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long firstIndex(){
			final com.apple.jobjc.Invoke.MsgSend firstIndex_IMetInst = get_firstIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstIndex_IMetInst.init(nativeBuffer, this);
		firstIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getIndexes_maxCount_inIndexRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getIndexes_maxCount_inIndexRange_IMetInst(){
		return ((getIndexes_maxCount_inIndexRange_IMetInst != null)
	? (getIndexes_maxCount_inIndexRange_IMetInst)
	: (getIndexes_maxCount_inIndexRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getIndexes:maxCount:inIndexRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long getIndexes_maxCount_inIndexRange(final com.apple.jobjc.Pointer<java.lang.Long> indexBuffer, final long bufferSize, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range){
			final com.apple.jobjc.Invoke.MsgSend getIndexes_maxCount_inIndexRange_IMetInst = get_getIndexes_maxCount_inIndexRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getIndexes_maxCount_inIndexRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, indexBuffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bufferSize);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		getIndexes_maxCount_inIndexRange_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexGreaterThanIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexGreaterThanIndex_IMetInst(){
		return ((indexGreaterThanIndex_IMetInst != null)
	? (indexGreaterThanIndex_IMetInst)
	: (indexGreaterThanIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexGreaterThanIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long indexGreaterThanIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend indexGreaterThanIndex_IMetInst = get_indexGreaterThanIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexGreaterThanIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		indexGreaterThanIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexGreaterThanOrEqualToIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexGreaterThanOrEqualToIndex_IMetInst(){
		return ((indexGreaterThanOrEqualToIndex_IMetInst != null)
	? (indexGreaterThanOrEqualToIndex_IMetInst)
	: (indexGreaterThanOrEqualToIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexGreaterThanOrEqualToIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long indexGreaterThanOrEqualToIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend indexGreaterThanOrEqualToIndex_IMetInst = get_indexGreaterThanOrEqualToIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexGreaterThanOrEqualToIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		indexGreaterThanOrEqualToIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexInRange_options_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexInRange_options_passingTest_IMetInst(){
		return ((indexInRange_options_passingTest_IMetInst != null)
	? (indexInRange_options_passingTest_IMetInst)
	: (indexInRange_options_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexInRange:options:passingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexInRange_options_passingTest(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexInRange_options_passingTest_IMetInst = get_indexInRange_options_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexInRange_options_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexInRange_options_passingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexLessThanIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexLessThanIndex_IMetInst(){
		return ((indexLessThanIndex_IMetInst != null)
	? (indexLessThanIndex_IMetInst)
	: (indexLessThanIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexLessThanIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long indexLessThanIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend indexLessThanIndex_IMetInst = get_indexLessThanIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexLessThanIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		indexLessThanIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexLessThanOrEqualToIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexLessThanOrEqualToIndex_IMetInst(){
		return ((indexLessThanOrEqualToIndex_IMetInst != null)
	? (indexLessThanOrEqualToIndex_IMetInst)
	: (indexLessThanOrEqualToIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexLessThanOrEqualToIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long indexLessThanOrEqualToIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend indexLessThanOrEqualToIndex_IMetInst = get_indexLessThanOrEqualToIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexLessThanOrEqualToIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		indexLessThanOrEqualToIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPassingTest_IMetInst(){
		return ((indexPassingTest_IMetInst != null)
	? (indexPassingTest_IMetInst)
	: (indexPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPassingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexPassingTest(final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexPassingTest_IMetInst = get_indexPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexPassingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexWithOptions_passingTest_IMetInst(){
		return ((indexWithOptions_passingTest_IMetInst != null)
	? (indexWithOptions_passingTest_IMetInst)
	: (indexWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexWithOptions:passingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexWithOptions_passingTest(final long opts, final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexWithOptions_passingTest_IMetInst = get_indexWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesInRange_options_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesInRange_options_passingTest_IMetInst(){
		return ((indexesInRange_options_passingTest_IMetInst != null)
	? (indexesInRange_options_passingTest_IMetInst)
	: (indexesInRange_options_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesInRange:options:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesInRange_options_passingTest(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesInRange_options_passingTest_IMetInst = get_indexesInRange_options_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesInRange_options_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesInRange_options_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesPassingTest_IMetInst(){
		return ((indexesPassingTest_IMetInst != null)
	? (indexesPassingTest_IMetInst)
	: (indexesPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesPassingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesPassingTest(final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesPassingTest_IMetInst = get_indexesPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesPassingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesWithOptions_passingTest_IMetInst(){
		return ((indexesWithOptions_passingTest_IMetInst != null)
	? (indexesWithOptions_passingTest_IMetInst)
	: (indexesWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesWithOptions:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesWithOptions_passingTest(final long opts, final Object /* BOOL(^)(NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesWithOptions_passingTest_IMetInst = get_indexesWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIndex_IMetInst(){
		return ((initWithIndex_IMetInst != null)
	? (initWithIndex_IMetInst)
	: (initWithIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithIndex_IMetInst = get_initWithIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		initWithIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIndexSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIndexSet_IMetInst(){
		return ((initWithIndexSet_IMetInst != null)
	? (initWithIndexSet_IMetInst)
	: (initWithIndexSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIndexSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIndexSet(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend initWithIndexSet_IMetInst = get_initWithIndexSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIndexSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		initWithIndexSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIndexesInRange_IMetInst(){
		return ((initWithIndexesInRange_IMetInst != null)
	? (initWithIndexesInRange_IMetInst)
	: (initWithIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIndexesInRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend initWithIndexesInRange_IMetInst = get_initWithIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		initWithIndexesInRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectsIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectsIndexesInRange_IMetInst(){
		return ((intersectsIndexesInRange_IMetInst != null)
	? (intersectsIndexesInRange_IMetInst)
	: (intersectsIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectsIndexesInRange:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public boolean intersectsIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend intersectsIndexesInRange_IMetInst = get_intersectsIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectsIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		intersectsIndexesInRange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToIndexSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToIndexSet_IMetInst(){
		return ((isEqualToIndexSet_IMetInst != null)
	? (isEqualToIndexSet_IMetInst)
	: (isEqualToIndexSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToIndexSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToIndexSet(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend isEqualToIndexSet_IMetInst = get_isEqualToIndexSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToIndexSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		isEqualToIndexSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastIndex_IMetInst(){
		return ((lastIndex_IMetInst != null)
	? (lastIndex_IMetInst)
	: (lastIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastIndex", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lastIndex(){
			final com.apple.jobjc.Invoke.MsgSend lastIndex_IMetInst = get_lastIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastIndex_IMetInst.init(nativeBuffer, this);
		lastIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
