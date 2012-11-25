package com.apple.jobjc.foundation;

public  class NSArray extends com.apple.jobjc.foundation.NSObject {
	public NSArray(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSArray(final NSArray obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst(){
		return ((addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst != null)
	? (addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst)
	: (addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:toObjectsAtIndexes:forKeyPath:options:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void addObserver_toObjectsAtIndexes_forKeyPath_options_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSString keyPath, final long options, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst = get_addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		addObserver_toObjectsAtIndexes_forKeyPath_options_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayByAddingObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayByAddingObject_IMetInst(){
		return ((arrayByAddingObject_IMetInst != null)
	? (arrayByAddingObject_IMetInst)
	: (arrayByAddingObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayByAddingObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrayByAddingObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend arrayByAddingObject_IMetInst = get_arrayByAddingObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayByAddingObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		arrayByAddingObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayByAddingObjectsFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayByAddingObjectsFromArray_IMetInst(){
		return ((arrayByAddingObjectsFromArray_IMetInst != null)
	? (arrayByAddingObjectsFromArray_IMetInst)
	: (arrayByAddingObjectsFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayByAddingObjectsFromArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrayByAddingObjectsFromArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend arrayByAddingObjectsFromArray_IMetInst = get_arrayByAddingObjectsFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayByAddingObjectsFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		arrayByAddingObjectsFromArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend componentsJoinedByString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_componentsJoinedByString_IMetInst(){
		return ((componentsJoinedByString_IMetInst != null)
	? (componentsJoinedByString_IMetInst)
	: (componentsJoinedByString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "componentsJoinedByString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString componentsJoinedByString(final com.apple.jobjc.foundation.NSString separator){
			final com.apple.jobjc.Invoke.MsgSend componentsJoinedByString_IMetInst = get_componentsJoinedByString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		componentsJoinedByString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, separator);
		componentsJoinedByString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsObject_IMetInst(){
		return ((containsObject_IMetInst != null)
	? (containsObject_IMetInst)
	: (containsObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst = get_containsObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
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

	private static com.apple.jobjc.Invoke.MsgSend filteredArrayUsingPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filteredArrayUsingPredicate_IMetInst(){
		return ((filteredArrayUsingPredicate_IMetInst != null)
	? (filteredArrayUsingPredicate_IMetInst)
	: (filteredArrayUsingPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filteredArrayUsingPredicate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray filteredArrayUsingPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend filteredArrayUsingPredicate_IMetInst = get_filteredArrayUsingPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filteredArrayUsingPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		filteredArrayUsingPredicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstObjectCommonWithArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstObjectCommonWithArray_IMetInst(){
		return ((firstObjectCommonWithArray_IMetInst != null)
	? (firstObjectCommonWithArray_IMetInst)
	: (firstObjectCommonWithArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstObjectCommonWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T firstObjectCommonWithArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend firstObjectCommonWithArray_IMetInst = get_firstObjectCommonWithArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstObjectCommonWithArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		firstObjectCommonWithArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjects_IMetInst(){
		return ((getObjects_IMetInst != null)
	? (getObjects_IMetInst)
	: (getObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getObjects(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects){
			final com.apple.jobjc.Invoke.MsgSend getObjects_IMetInst = get_getObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		getObjects_IMetInst.invoke(nativeBuffer);
		
		
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

	 public long indexOfObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend indexOfObject_IMetInst = get_indexOfObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		indexOfObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObject_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObject_inRange_IMetInst(){
		return ((indexOfObject_inRange_IMetInst != null)
	? (indexOfObject_inRange_IMetInst)
	: (indexOfObject_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObject:inRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long indexOfObject_inRange(final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend indexOfObject_inRange_IMetInst = get_indexOfObject_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObject_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		indexOfObject_inRange_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObject_inSortedRange_options_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObject_inSortedRange_options_usingComparator_IMetInst(){
		return ((indexOfObject_inSortedRange_options_usingComparator_IMetInst != null)
	? (indexOfObject_inSortedRange_options_usingComparator_IMetInst)
	: (indexOfObject_inSortedRange_options_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObject:inSortedRange:options:usingComparator:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long indexOfObject_inSortedRange_options_usingComparator(final com.apple.jobjc.ID obj, final com.apple.jobjc.foundation.NSRange r, final long opts, final Object /* NSComparator (@, @) */ cmp){
			final com.apple.jobjc.Invoke.MsgSend indexOfObject_inSortedRange_options_usingComparator_IMetInst = get_indexOfObject_inSortedRange_options_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObject_inSortedRange_options_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, r);
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

	private static com.apple.jobjc.Invoke.MsgSend indexOfObjectIdenticalTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObjectIdenticalTo_IMetInst(){
		return ((indexOfObjectIdenticalTo_IMetInst != null)
	? (indexOfObjectIdenticalTo_IMetInst)
	: (indexOfObjectIdenticalTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObjectIdenticalTo:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfObjectIdenticalTo(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend indexOfObjectIdenticalTo_IMetInst = get_indexOfObjectIdenticalTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObjectIdenticalTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		indexOfObjectIdenticalTo_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfObjectIdenticalTo_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfObjectIdenticalTo_inRange_IMetInst(){
		return ((indexOfObjectIdenticalTo_inRange_IMetInst != null)
	? (indexOfObjectIdenticalTo_inRange_IMetInst)
	: (indexOfObjectIdenticalTo_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfObjectIdenticalTo:inRange:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long indexOfObjectIdenticalTo_inRange(final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend indexOfObjectIdenticalTo_inRange_IMetInst = get_indexOfObjectIdenticalTo_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfObjectIdenticalTo_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		indexOfObjectIdenticalTo_inRange_IMetInst.invoke(nativeBuffer);
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

	 public <T extends com.apple.jobjc.ID> T initWithArray_copyItems(final com.apple.jobjc.foundation.NSArray array, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithArray_copyItems_IMetInst = get_initWithArray_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithArray_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithArray_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_IMetInst(){
		return ((initWithContentsOfFile_IMetInst != null)
	? (initWithContentsOfFile_IMetInst)
	: (initWithContentsOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst = get_initWithContentsOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithContentsOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isEqualToArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToArray_IMetInst(){
		return ((isEqualToArray_IMetInst != null)
	? (isEqualToArray_IMetInst)
	: (isEqualToArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToArray:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend isEqualToArray_IMetInst = get_isEqualToArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		isEqualToArray_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeObjectsPerformSelector_IMetInst(){
		return ((makeObjectsPerformSelector_IMetInst != null)
	? (makeObjectsPerformSelector_IMetInst)
	: (makeObjectsPerformSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeObjectsPerformSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void makeObjectsPerformSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_IMetInst = get_makeObjectsPerformSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeObjectsPerformSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		makeObjectsPerformSelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeObjectsPerformSelector_withObject_IMetInst(){
		return ((makeObjectsPerformSelector_withObject_IMetInst != null)
	? (makeObjectsPerformSelector_withObject_IMetInst)
	: (makeObjectsPerformSelector_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeObjectsPerformSelector:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeObjectsPerformSelector_withObject(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID argument){
			final com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_withObject_IMetInst = get_makeObjectsPerformSelector_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeObjectsPerformSelector_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		makeObjectsPerformSelector_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectAtIndex_IMetInst(){
		return ((objectAtIndex_IMetInst != null)
	? (objectAtIndex_IMetInst)
	: (objectAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T objectAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend objectAtIndex_IMetInst = get_objectAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
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

	private static com.apple.jobjc.Invoke.MsgSend pathsMatchingExtensions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathsMatchingExtensions_IMetInst(){
		return ((pathsMatchingExtensions_IMetInst != null)
	? (pathsMatchingExtensions_IMetInst)
	: (pathsMatchingExtensions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathsMatchingExtensions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathsMatchingExtensions(final com.apple.jobjc.foundation.NSArray filterTypes){
			final com.apple.jobjc.Invoke.MsgSend pathsMatchingExtensions_IMetInst = get_pathsMatchingExtensions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathsMatchingExtensions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filterTypes);
		pathsMatchingExtensions_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst(){
		return ((removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst != null)
	? (removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst)
	: (removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:fromObjectsAtIndexes:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_fromObjectsAtIndexes_forKeyPath(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst = get_removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		removeObserver_fromObjectsAtIndexes_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst(){
		return ((removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst != null)
	? (removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst)
	: (removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:fromObjectsAtIndexes:forKeyPath:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void removeObserver_fromObjectsAtIndexes_forKeyPath_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst = get_removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		removeObserver_fromObjectsAtIndexes_forKeyPath_context_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayHint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayHint_IMetInst(){
		return ((sortedArrayHint_IMetInst != null)
	? (sortedArrayHint_IMetInst)
	: (sortedArrayHint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayHint", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData sortedArrayHint(){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayHint_IMetInst = get_sortedArrayHint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayHint_IMetInst.init(nativeBuffer, this);
		sortedArrayHint_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingDescriptors_IMetInst(){
		return ((sortedArrayUsingDescriptors_IMetInst != null)
	? (sortedArrayUsingDescriptors_IMetInst)
	: (sortedArrayUsingDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingDescriptors:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingDescriptors(final com.apple.jobjc.foundation.NSArray sortDescriptors){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingDescriptors_IMetInst = get_sortedArrayUsingDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		sortedArrayUsingDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingFunction_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingFunction_context_IMetInst(){
		return ((sortedArrayUsingFunction_context_IMetInst != null)
	? (sortedArrayUsingFunction_context_IMetInst)
	: (sortedArrayUsingFunction_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingFunction:context:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingFunction_context(final Object /* NSInteger(*)(id,id,void*) (^?, ^?) */ comparator, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingFunction_context_IMetInst = get_sortedArrayUsingFunction_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingFunction_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, comparator);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		sortedArrayUsingFunction_context_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingFunction_context_hint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingFunction_context_hint_IMetInst(){
		return ((sortedArrayUsingFunction_context_hint_IMetInst != null)
	? (sortedArrayUsingFunction_context_hint_IMetInst)
	: (sortedArrayUsingFunction_context_hint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingFunction:context:hint:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingFunction_context_hint(final Object /* NSInteger(*)(id,id,void*) (^?, ^?) */ comparator, final com.apple.jobjc.Pointer<Void> context, final com.apple.jobjc.foundation.NSData hint){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingFunction_context_hint_IMetInst = get_sortedArrayUsingFunction_context_hint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingFunction_context_hint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, comparator);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hint);
		sortedArrayUsingFunction_context_hint_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingSelector_IMetInst(){
		return ((sortedArrayUsingSelector_IMetInst != null)
	? (sortedArrayUsingSelector_IMetInst)
	: (sortedArrayUsingSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingSelector(final com.apple.jobjc.SEL comparator){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingSelector_IMetInst = get_sortedArrayUsingSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, comparator);
		sortedArrayUsingSelector_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend subarrayWithRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subarrayWithRange_IMetInst(){
		return ((subarrayWithRange_IMetInst != null)
	? (subarrayWithRange_IMetInst)
	: (subarrayWithRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subarrayWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSArray subarrayWithRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend subarrayWithRange_IMetInst = get_subarrayWithRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subarrayWithRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		subarrayWithRange_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_IMetInst(){
		return ((writeToFile_atomically_IMetInst != null)
	? (writeToFile_atomically_IMetInst)
	: (writeToFile_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToFile_atomically(final com.apple.jobjc.foundation.NSString path, final boolean useAuxiliaryFile){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst = get_writeToFile_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		writeToFile_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_atomically_IMetInst(){
		return ((writeToURL_atomically_IMetInst != null)
	? (writeToURL_atomically_IMetInst)
	: (writeToURL_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToURL_atomically(final com.apple.jobjc.foundation.NSURL url, final boolean atomically){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst = get_writeToURL_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, atomically);
		writeToURL_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
