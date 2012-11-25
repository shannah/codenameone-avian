package com.apple.jobjc.foundation;

public  class NSOrderedSet extends com.apple.jobjc.foundation.NSObject {
	public NSOrderedSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOrderedSet(final NSOrderedSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_forKeyPath_options_context_IMetInst(){
		return ((addObserver_forKeyPath_options_context_IMetInst != null)
	? (addObserver_forKeyPath_options_context_IMetInst)
	: (addObserver_forKeyPath_options_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:forKeyPath:options:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void addObserver_forKeyPath_options_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final long options, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst = get_addObserver_forKeyPath_options_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_forKeyPath_options_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		addObserver_forKeyPath_options_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend array_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_array_IMetInst(){
		return ((array_IMetInst != null)
	? (array_IMetInst)
	: (array_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "array", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray array(){
			final com.apple.jobjc.Invoke.MsgSend array_IMetInst = get_array_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		array_IMetInst.init(nativeBuffer, this);
		array_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsObject_IMetInst(){
		return ((containsObject_IMetInst != null)
	? (containsObject_IMetInst)
	: (containsObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst = get_containsObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		containsObject_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_indent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_indent_IMetInst(){
		return ((descriptionWithLocale_indent_IMetInst != null)
	? (descriptionWithLocale_indent_IMetInst)
	: (descriptionWithLocale_indent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:indent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale_indent(final com.apple.jobjc.ID locale, final long level){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_indent_IMetInst = get_descriptionWithLocale_indent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_indent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, level);
		descriptionWithLocale_indent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateObjectsAtIndexes_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateObjectsAtIndexes_options_usingBlock_IMetInst(){
		return ((enumerateObjectsAtIndexes_options_usingBlock_IMetInst != null)
	? (enumerateObjectsAtIndexes_options_usingBlock_IMetInst)
	: (enumerateObjectsAtIndexes_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateObjectsAtIndexes:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateObjectsAtIndexes_options_usingBlock(final com.apple.jobjc.foundation.NSIndexSet s, final long opts, final Object /* void(^)(id,NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateObjectsAtIndexes_options_usingBlock_IMetInst = get_enumerateObjectsAtIndexes_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateObjectsAtIndexes_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, s);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateObjectsAtIndexes_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateObjectsUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateObjectsUsingBlock_IMetInst(){
		return ((enumerateObjectsUsingBlock_IMetInst != null)
	? (enumerateObjectsUsingBlock_IMetInst)
	: (enumerateObjectsUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateObjectsUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateObjectsUsingBlock(final Object /* void(^)(id,NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateObjectsUsingBlock_IMetInst = get_enumerateObjectsUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateObjectsUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateObjectsUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateObjectsWithOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateObjectsWithOptions_usingBlock_IMetInst(){
		return ((enumerateObjectsWithOptions_usingBlock_IMetInst != null)
	? (enumerateObjectsWithOptions_usingBlock_IMetInst)
	: (enumerateObjectsWithOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateObjectsWithOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateObjectsWithOptions_usingBlock(final long opts, final Object /* void(^)(id,NSUInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateObjectsWithOptions_usingBlock_IMetInst = get_enumerateObjectsWithOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateObjectsWithOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateObjectsWithOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstObject_IMetInst(){
		return ((firstObject_IMetInst != null)
	? (firstObject_IMetInst)
	: (firstObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T firstObject(){
			final com.apple.jobjc.Invoke.MsgSend firstObject_IMetInst = get_firstObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstObject_IMetInst.init(nativeBuffer, this);
		firstObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjects_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjects_range_IMetInst(){
		return ((getObjects_range_IMetInst != null)
	? (getObjects_range_IMetInst)
	: (getObjects_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjects:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void getObjects_range(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend getObjects_range_IMetInst = get_getObjects_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjects_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		getObjects_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObject_IMetInst(){
		return ((indexOfObject_IMetInst != null)
	? (indexOfObject_IMetInst)
	: (indexOfObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObject:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend indexOfObject_IMetInst = get_indexOfObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		indexOfObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObject_inSortedRange_options_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObject_inSortedRange_options_usingComparator_IMetInst(){
		return ((indexOfObject_inSortedRange_options_usingComparator_IMetInst != null)
	? (indexOfObject_inSortedRange_options_usingComparator_IMetInst)
	: (indexOfObject_inSortedRange_options_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObject:inSortedRange:options:usingComparator:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexOfObject_inSortedRange_options_usingComparator(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* NSComparator (@, @) */ cmp){
			final com.apple.jobjc.Invoke.MsgSend indexOfObject_inSortedRange_options_usingComparator_IMetInst = get_indexOfObject_inSortedRange_options_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObject_inSortedRange_options_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmp);
		indexOfObject_inSortedRange_options_usingComparator_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObjectAtIndexes_options_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObjectAtIndexes_options_passingTest_IMetInst(){
		return ((indexOfObjectAtIndexes_options_passingTest_IMetInst != null)
	? (indexOfObjectAtIndexes_options_passingTest_IMetInst)
	: (indexOfObjectAtIndexes_options_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObjectAtIndexes:options:passingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexOfObjectAtIndexes_options_passingTest(final com.apple.jobjc.foundation.NSIndexSet s, final long opts, final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexOfObjectAtIndexes_options_passingTest_IMetInst = get_indexOfObjectAtIndexes_options_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObjectAtIndexes_options_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, s);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexOfObjectAtIndexes_options_passingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObjectPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObjectPassingTest_IMetInst(){
		return ((indexOfObjectPassingTest_IMetInst != null)
	? (indexOfObjectPassingTest_IMetInst)
	: (indexOfObjectPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObjectPassingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexOfObjectPassingTest(final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexOfObjectPassingTest_IMetInst = get_indexOfObjectPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObjectPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexOfObjectPassingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObjectWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObjectWithOptions_passingTest_IMetInst(){
		return ((indexOfObjectWithOptions_passingTest_IMetInst != null)
	? (indexOfObjectWithOptions_passingTest_IMetInst)
	: (indexOfObjectWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObjectWithOptions:passingTest:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexOfObjectWithOptions_passingTest(final long opts, final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexOfObjectWithOptions_passingTest_IMetInst = get_indexOfObjectWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObjectWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexOfObjectWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesOfObjectsAtIndexes_options_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesOfObjectsAtIndexes_options_passingTest_IMetInst(){
		return ((indexesOfObjectsAtIndexes_options_passingTest_IMetInst != null)
	? (indexesOfObjectsAtIndexes_options_passingTest_IMetInst)
	: (indexesOfObjectsAtIndexes_options_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesOfObjectsAtIndexes:options:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesOfObjectsAtIndexes_options_passingTest(final com.apple.jobjc.foundation.NSIndexSet s, final long opts, final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesOfObjectsAtIndexes_options_passingTest_IMetInst = get_indexesOfObjectsAtIndexes_options_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesOfObjectsAtIndexes_options_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, s);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesOfObjectsAtIndexes_options_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesOfObjectsPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesOfObjectsPassingTest_IMetInst(){
		return ((indexesOfObjectsPassingTest_IMetInst != null)
	? (indexesOfObjectsPassingTest_IMetInst)
	: (indexesOfObjectsPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesOfObjectsPassingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesOfObjectsPassingTest(final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesOfObjectsPassingTest_IMetInst = get_indexesOfObjectsPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesOfObjectsPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesOfObjectsPassingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexesOfObjectsWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexesOfObjectsWithOptions_passingTest_IMetInst(){
		return ((indexesOfObjectsWithOptions_passingTest_IMetInst != null)
	? (indexesOfObjectsWithOptions_passingTest_IMetInst)
	: (indexesOfObjectsWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexesOfObjectsWithOptions:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet indexesOfObjectsWithOptions_passingTest(final long opts, final Object /* BOOL(^)(id,NSUInteger,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend indexesOfObjectsWithOptions_passingTest_IMetInst = get_indexesOfObjectsWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexesOfObjectsWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		indexesOfObjectsWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithArray_IMetInst(){
		return ((initWithArray_IMetInst != null)
	? (initWithArray_IMetInst)
	: (initWithArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend initWithArray_IMetInst = get_initWithArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		initWithArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithArray_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithArray_copyItems_IMetInst(){
		return ((initWithArray_copyItems_IMetInst != null)
	? (initWithArray_copyItems_IMetInst)
	: (initWithArray_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithArray:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithArray_copyItems(final com.apple.jobjc.foundation.NSArray set, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithArray_copyItems_IMetInst = get_initWithArray_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithArray_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithArray_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithArray_range_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithArray_range_copyItems_IMetInst(){
		return ((initWithArray_range_copyItems_IMetInst != null)
	? (initWithArray_range_copyItems_IMetInst)
	: (initWithArray_range_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithArray:range:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithArray_range_copyItems(final com.apple.jobjc.foundation.NSArray set, final com.apple.jobjc.foundation.NSRange range, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithArray_range_copyItems_IMetInst = get_initWithArray_range_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithArray_range_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithArray_range_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObject_IMetInst(){
		return ((initWithObject_IMetInst != null)
	? (initWithObject_IMetInst)
	: (initWithObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend initWithObject_IMetInst = get_initWithObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		initWithObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects(final com.apple.jobjc.ID firstObj, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend initWithObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObj);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		initWithObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithObjects_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObjects_count_IMetInst(){
		return ((initWithObjects_count_IMetInst != null)
	? (initWithObjects_count_IMetInst)
	: (initWithObjects_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend initWithObjects_count_IMetInst = get_initWithObjects_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		initWithObjects_count_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOrderedSet_IMetInst(){
		return ((initWithOrderedSet_IMetInst != null)
	? (initWithOrderedSet_IMetInst)
	: (initWithOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOrderedSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet set){
			final com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_IMetInst = get_initWithOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		initWithOrderedSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOrderedSet_copyItems_IMetInst(){
		return ((initWithOrderedSet_copyItems_IMetInst != null)
	? (initWithOrderedSet_copyItems_IMetInst)
	: (initWithOrderedSet_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOrderedSet:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOrderedSet_copyItems(final com.apple.jobjc.foundation.NSOrderedSet set, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_copyItems_IMetInst = get_initWithOrderedSet_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOrderedSet_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithOrderedSet_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_range_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOrderedSet_range_copyItems_IMetInst(){
		return ((initWithOrderedSet_range_copyItems_IMetInst != null)
	? (initWithOrderedSet_range_copyItems_IMetInst)
	: (initWithOrderedSet_range_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOrderedSet:range:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOrderedSet_range_copyItems(final com.apple.jobjc.foundation.NSOrderedSet set, final com.apple.jobjc.foundation.NSRange range, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithOrderedSet_range_copyItems_IMetInst = get_initWithOrderedSet_range_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOrderedSet_range_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithOrderedSet_range_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSet_IMetInst(){
		return ((initWithSet_IMetInst != null)
	? (initWithSet_IMetInst)
	: (initWithSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend initWithSet_IMetInst = get_initWithSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		initWithSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSet_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSet_copyItems_IMetInst(){
		return ((initWithSet_copyItems_IMetInst != null)
	? (initWithSet_copyItems_IMetInst)
	: (initWithSet_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSet:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSet_copyItems(final com.apple.jobjc.foundation.NSSet set, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithSet_copyItems_IMetInst = get_initWithSet_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSet_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithSet_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectsOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectsOrderedSet_IMetInst(){
		return ((intersectsOrderedSet_IMetInst != null)
	? (intersectsOrderedSet_IMetInst)
	: (intersectsOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectsOrderedSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean intersectsOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend intersectsOrderedSet_IMetInst = get_intersectsOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectsOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		intersectsOrderedSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectsSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectsSet_IMetInst(){
		return ((intersectsSet_IMetInst != null)
	? (intersectsSet_IMetInst)
	: (intersectsSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectsSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean intersectsSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend intersectsSet_IMetInst = get_intersectsSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectsSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		intersectsSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToOrderedSet_IMetInst(){
		return ((isEqualToOrderedSet_IMetInst != null)
	? (isEqualToOrderedSet_IMetInst)
	: (isEqualToOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToOrderedSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend isEqualToOrderedSet_IMetInst = get_isEqualToOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isEqualToOrderedSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubsetOfOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubsetOfOrderedSet_IMetInst(){
		return ((isSubsetOfOrderedSet_IMetInst != null)
	? (isSubsetOfOrderedSet_IMetInst)
	: (isSubsetOfOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubsetOfOrderedSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSubsetOfOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend isSubsetOfOrderedSet_IMetInst = get_isSubsetOfOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubsetOfOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isSubsetOfOrderedSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubsetOfSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubsetOfSet_IMetInst(){
		return ((isSubsetOfSet_IMetInst != null)
	? (isSubsetOfSet_IMetInst)
	: (isSubsetOfSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubsetOfSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSubsetOfSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend isSubsetOfSet_IMetInst = get_isSubsetOfSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubsetOfSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		isSubsetOfSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastObject_IMetInst(){
		return ((lastObject_IMetInst != null)
	? (lastObject_IMetInst)
	: (lastObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T lastObject(){
			final com.apple.jobjc.Invoke.MsgSend lastObject_IMetInst = get_lastObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastObject_IMetInst.init(nativeBuffer, this);
		lastObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectAtIndex_IMetInst(){
		return ((objectAtIndex_IMetInst != null)
	? (objectAtIndex_IMetInst)
	: (objectAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T objectAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend objectAtIndex_IMetInst = get_objectAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		objectAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectAtIndexedSubscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectAtIndexedSubscript_IMetInst(){
		return ((objectAtIndexedSubscript_IMetInst != null)
	? (objectAtIndexedSubscript_IMetInst)
	: (objectAtIndexedSubscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectAtIndexedSubscript:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T objectAtIndexedSubscript(final long idx){
			final com.apple.jobjc.Invoke.MsgSend objectAtIndexedSubscript_IMetInst = get_objectAtIndexedSubscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectAtIndexedSubscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		objectAtIndexedSubscript_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectEnumerator_IMetInst(){
		return ((objectEnumerator_IMetInst != null)
	? (objectEnumerator_IMetInst)
	: (objectEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator objectEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst = get_objectEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectEnumerator_IMetInst.init(nativeBuffer, this);
		objectEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsAtIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsAtIndexes_IMetInst(){
		return ((objectsAtIndexes_IMetInst != null)
	? (objectsAtIndexes_IMetInst)
	: (objectsAtIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsAtIndexes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray objectsAtIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend objectsAtIndexes_IMetInst = get_objectsAtIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsAtIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		objectsAtIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_IMetInst(){
		return ((removeObserver_forKeyPath_IMetInst != null)
	? (removeObserver_forKeyPath_IMetInst)
	: (removeObserver_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_forKeyPath(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst = get_removeObserver_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		removeObserver_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_context_IMetInst(){
		return ((removeObserver_forKeyPath_context_IMetInst != null)
	? (removeObserver_forKeyPath_context_IMetInst)
	: (removeObserver_forKeyPath_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void removeObserver_forKeyPath_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst = get_removeObserver_forKeyPath_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		removeObserver_forKeyPath_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reverseObjectEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reverseObjectEnumerator_IMetInst(){
		return ((reverseObjectEnumerator_IMetInst != null)
	? (reverseObjectEnumerator_IMetInst)
	: (reverseObjectEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reverseObjectEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator reverseObjectEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend reverseObjectEnumerator_IMetInst = get_reverseObjectEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reverseObjectEnumerator_IMetInst.init(nativeBuffer, this);
		reverseObjectEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reversedOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reversedOrderedSet_IMetInst(){
		return ((reversedOrderedSet_IMetInst != null)
	? (reversedOrderedSet_IMetInst)
	: (reversedOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reversedOrderedSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSOrderedSet reversedOrderedSet(){
			final com.apple.jobjc.Invoke.MsgSend reversedOrderedSet_IMetInst = get_reversedOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reversedOrderedSet_IMetInst.init(nativeBuffer, this);
		reversedOrderedSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSOrderedSet returnValue = (com.apple.jobjc.foundation.NSOrderedSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend set_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_IMetInst(){
		return ((set_IMetInst != null)
	? (set_IMetInst)
	: (set_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet set(){
			final com.apple.jobjc.Invoke.MsgSend set_IMetInst = get_set_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_IMetInst.init(nativeBuffer, this);
		set_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forKey_IMetInst(){
		return ((setValue_forKey_IMetInst != null)
	? (setValue_forKey_IMetInst)
	: (setValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst = get_setValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setValue_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingComparator_IMetInst(){
		return ((sortedArrayUsingComparator_IMetInst != null)
	? (sortedArrayUsingComparator_IMetInst)
	: (sortedArrayUsingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingComparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingComparator(final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingComparator_IMetInst = get_sortedArrayUsingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortedArrayUsingComparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayWithOptions_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayWithOptions_usingComparator_IMetInst(){
		return ((sortedArrayWithOptions_usingComparator_IMetInst != null)
	? (sortedArrayWithOptions_usingComparator_IMetInst)
	: (sortedArrayWithOptions_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayWithOptions:usingComparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayWithOptions_usingComparator(final long opts, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayWithOptions_usingComparator_IMetInst = get_sortedArrayWithOptions_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayWithOptions_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortedArrayWithOptions_usingComparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForKey_IMetInst(){
		return ((valueForKey_IMetInst != null)
	? (valueForKey_IMetInst)
	: (valueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst = get_valueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
