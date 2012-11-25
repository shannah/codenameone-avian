package com.apple.jobjc.appkit;

public  class NSRuleEditor extends com.apple.jobjc.appkit.NSControl {
	public NSRuleEditor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRuleEditor(final NSRuleEditor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRow_IMetInst(){
		return ((addRow_IMetInst != null)
	? (addRow_IMetInst)
	: (addRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRow(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend addRow_IMetInst = get_addRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		addRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canRemoveAllRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canRemoveAllRows_IMetInst(){
		return ((canRemoveAllRows_IMetInst != null)
	? (canRemoveAllRows_IMetInst)
	: (canRemoveAllRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canRemoveAllRows", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canRemoveAllRows(){
			final com.apple.jobjc.Invoke.MsgSend canRemoveAllRows_IMetInst = get_canRemoveAllRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canRemoveAllRows_IMetInst.init(nativeBuffer, this);
		canRemoveAllRows_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend criteriaForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_criteriaForRow_IMetInst(){
		return ((criteriaForRow_IMetInst != null)
	? (criteriaForRow_IMetInst)
	: (criteriaForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "criteriaForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray criteriaForRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend criteriaForRow_IMetInst = get_criteriaForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		criteriaForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		criteriaForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend criteriaKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_criteriaKeyPath_IMetInst(){
		return ((criteriaKeyPath_IMetInst != null)
	? (criteriaKeyPath_IMetInst)
	: (criteriaKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "criteriaKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString criteriaKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend criteriaKeyPath_IMetInst = get_criteriaKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		criteriaKeyPath_IMetInst.init(nativeBuffer, this);
		criteriaKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayValuesForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayValuesForRow_IMetInst(){
		return ((displayValuesForRow_IMetInst != null)
	? (displayValuesForRow_IMetInst)
	: (displayValuesForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayValuesForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray displayValuesForRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend displayValuesForRow_IMetInst = get_displayValuesForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayValuesForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		displayValuesForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayValuesKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayValuesKeyPath_IMetInst(){
		return ((displayValuesKeyPath_IMetInst != null)
	? (displayValuesKeyPath_IMetInst)
	: (displayValuesKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayValuesKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayValuesKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend displayValuesKeyPath_IMetInst = get_displayValuesKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayValuesKeyPath_IMetInst.init(nativeBuffer, this);
		displayValuesKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formattingDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formattingDictionary_IMetInst(){
		return ((formattingDictionary_IMetInst != null)
	? (formattingDictionary_IMetInst)
	: (formattingDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formattingDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary formattingDictionary(){
			final com.apple.jobjc.Invoke.MsgSend formattingDictionary_IMetInst = get_formattingDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formattingDictionary_IMetInst.init(nativeBuffer, this);
		formattingDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formattingStringsFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formattingStringsFilename_IMetInst(){
		return ((formattingStringsFilename_IMetInst != null)
	? (formattingStringsFilename_IMetInst)
	: (formattingStringsFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formattingStringsFilename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString formattingStringsFilename(){
			final com.apple.jobjc.Invoke.MsgSend formattingStringsFilename_IMetInst = get_formattingStringsFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formattingStringsFilename_IMetInst.init(nativeBuffer, this);
		formattingStringsFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst(){
		return ((insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst != null)
	? (insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst)
	: (insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertRowAtIndex:withType:asSubrowOfRow:animate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void insertRowAtIndex_withType_asSubrowOfRow_animate(final long rowIndex, final long rowType, final long parentRow, final boolean shouldAnimate){
			final com.apple.jobjc.Invoke.MsgSend insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst = get_insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, rowType);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, parentRow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldAnimate);
		insertRowAtIndex_withType_asSubrowOfRow_animate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nestingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nestingMode_IMetInst(){
		return ((nestingMode_IMetInst != null)
	? (nestingMode_IMetInst)
	: (nestingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nestingMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long nestingMode(){
			final com.apple.jobjc.Invoke.MsgSend nestingMode_IMetInst = get_nestingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nestingMode_IMetInst.init(nativeBuffer, this);
		nestingMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfRows_IMetInst(){
		return ((numberOfRows_IMetInst != null)
	? (numberOfRows_IMetInst)
	: (numberOfRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfRows", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfRows(){
			final com.apple.jobjc.Invoke.MsgSend numberOfRows_IMetInst = get_numberOfRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfRows_IMetInst.init(nativeBuffer, this);
		numberOfRows_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentRowForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentRowForRow_IMetInst(){
		return ((parentRowForRow_IMetInst != null)
	? (parentRowForRow_IMetInst)
	: (parentRowForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentRowForRow:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long parentRowForRow(final long rowIndex){
			final com.apple.jobjc.Invoke.MsgSend parentRowForRow_IMetInst = get_parentRowForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentRowForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		parentRowForRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicate_IMetInst(){
		return ((predicate_IMetInst != null)
	? (predicate_IMetInst)
	: (predicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicate(){
			final com.apple.jobjc.Invoke.MsgSend predicate_IMetInst = get_predicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicate_IMetInst.init(nativeBuffer, this);
		predicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateForRow_IMetInst(){
		return ((predicateForRow_IMetInst != null)
	? (predicateForRow_IMetInst)
	: (predicateForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateForRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend predicateForRow_IMetInst = get_predicateForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		predicateForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadCriteria_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadCriteria_IMetInst(){
		return ((reloadCriteria_IMetInst != null)
	? (reloadCriteria_IMetInst)
	: (reloadCriteria_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadCriteria", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reloadCriteria(){
			final com.apple.jobjc.Invoke.MsgSend reloadCriteria_IMetInst = get_reloadCriteria_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadCriteria_IMetInst.init(nativeBuffer, this);
		reloadCriteria_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadPredicate_IMetInst(){
		return ((reloadPredicate_IMetInst != null)
	? (reloadPredicate_IMetInst)
	: (reloadPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadPredicate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reloadPredicate(){
			final com.apple.jobjc.Invoke.MsgSend reloadPredicate_IMetInst = get_reloadPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadPredicate_IMetInst.init(nativeBuffer, this);
		reloadPredicate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRowAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRowAtIndex_IMetInst(){
		return ((removeRowAtIndex_IMetInst != null)
	? (removeRowAtIndex_IMetInst)
	: (removeRowAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRowAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeRowAtIndex(final long rowIndex){
			final com.apple.jobjc.Invoke.MsgSend removeRowAtIndex_IMetInst = get_removeRowAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRowAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		removeRowAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRowsAtIndexes_includeSubrows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRowsAtIndexes_includeSubrows_IMetInst(){
		return ((removeRowsAtIndexes_includeSubrows_IMetInst != null)
	? (removeRowsAtIndexes_includeSubrows_IMetInst)
	: (removeRowsAtIndexes_includeSubrows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRowsAtIndexes:includeSubrows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void removeRowsAtIndexes_includeSubrows(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final boolean includeSubrows){
			final com.apple.jobjc.Invoke.MsgSend removeRowsAtIndexes_includeSubrows_IMetInst = get_removeRowsAtIndexes_includeSubrows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRowsAtIndexes_includeSubrows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, includeSubrows);
		removeRowsAtIndexes_includeSubrows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rowClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowClass_IMetInst(){
		return ((rowClass_IMetInst != null)
	? (rowClass_IMetInst)
	: (rowClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T rowClass(){
			final com.apple.jobjc.Invoke.MsgSend rowClass_IMetInst = get_rowClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowClass_IMetInst.init(nativeBuffer, this);
		rowClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowForDisplayValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowForDisplayValue_IMetInst(){
		return ((rowForDisplayValue_IMetInst != null)
	? (rowForDisplayValue_IMetInst)
	: (rowForDisplayValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowForDisplayValue:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long rowForDisplayValue(final com.apple.jobjc.ID displayValue){
			final com.apple.jobjc.Invoke.MsgSend rowForDisplayValue_IMetInst = get_rowForDisplayValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowForDisplayValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, displayValue);
		rowForDisplayValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowHeight_IMetInst(){
		return ((rowHeight_IMetInst != null)
	? (rowHeight_IMetInst)
	: (rowHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rowHeight(){
			final com.apple.jobjc.Invoke.MsgSend rowHeight_IMetInst = get_rowHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowHeight_IMetInst.init(nativeBuffer, this);
		rowHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowTypeForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowTypeForRow_IMetInst(){
		return ((rowTypeForRow_IMetInst != null)
	? (rowTypeForRow_IMetInst)
	: (rowTypeForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowTypeForRow:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long rowTypeForRow(final long rowIndex){
			final com.apple.jobjc.Invoke.MsgSend rowTypeForRow_IMetInst = get_rowTypeForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowTypeForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		rowTypeForRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowTypeKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowTypeKeyPath_IMetInst(){
		return ((rowTypeKeyPath_IMetInst != null)
	? (rowTypeKeyPath_IMetInst)
	: (rowTypeKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowTypeKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString rowTypeKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend rowTypeKeyPath_IMetInst = get_rowTypeKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowTypeKeyPath_IMetInst.init(nativeBuffer, this);
		rowTypeKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectRowIndexes_byExtendingSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectRowIndexes_byExtendingSelection_IMetInst(){
		return ((selectRowIndexes_byExtendingSelection_IMetInst != null)
	? (selectRowIndexes_byExtendingSelection_IMetInst)
	: (selectRowIndexes_byExtendingSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectRowIndexes:byExtendingSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void selectRowIndexes_byExtendingSelection(final com.apple.jobjc.foundation.NSIndexSet indexes, final boolean extend){
			final com.apple.jobjc.Invoke.MsgSend selectRowIndexes_byExtendingSelection_IMetInst = get_selectRowIndexes_byExtendingSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectRowIndexes_byExtendingSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, extend);
		selectRowIndexes_byExtendingSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRowIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRowIndexes_IMetInst(){
		return ((selectedRowIndexes_IMetInst != null)
	? (selectedRowIndexes_IMetInst)
	: (selectedRowIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRowIndexes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectedRowIndexes(){
			final com.apple.jobjc.Invoke.MsgSend selectedRowIndexes_IMetInst = get_selectedRowIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRowIndexes_IMetInst.init(nativeBuffer, this);
		selectedRowIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanRemoveAllRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanRemoveAllRows_IMetInst(){
		return ((setCanRemoveAllRows_IMetInst != null)
	? (setCanRemoveAllRows_IMetInst)
	: (setCanRemoveAllRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanRemoveAllRows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanRemoveAllRows(final boolean val){
			final com.apple.jobjc.Invoke.MsgSend setCanRemoveAllRows_IMetInst = get_setCanRemoveAllRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanRemoveAllRows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, val);
		setCanRemoveAllRows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCriteria_andDisplayValues_forRowAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCriteria_andDisplayValues_forRowAtIndex_IMetInst(){
		return ((setCriteria_andDisplayValues_forRowAtIndex_IMetInst != null)
	? (setCriteria_andDisplayValues_forRowAtIndex_IMetInst)
	: (setCriteria_andDisplayValues_forRowAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCriteria:andDisplayValues:forRowAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setCriteria_andDisplayValues_forRowAtIndex(final com.apple.jobjc.foundation.NSArray criteria, final com.apple.jobjc.foundation.NSArray values, final long rowIndex){
			final com.apple.jobjc.Invoke.MsgSend setCriteria_andDisplayValues_forRowAtIndex_IMetInst = get_setCriteria_andDisplayValues_forRowAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCriteria_andDisplayValues_forRowAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, criteria);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, values);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		setCriteria_andDisplayValues_forRowAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCriteriaKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCriteriaKeyPath_IMetInst(){
		return ((setCriteriaKeyPath_IMetInst != null)
	? (setCriteriaKeyPath_IMetInst)
	: (setCriteriaKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCriteriaKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCriteriaKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setCriteriaKeyPath_IMetInst = get_setCriteriaKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCriteriaKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setCriteriaKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplayValuesKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplayValuesKeyPath_IMetInst(){
		return ((setDisplayValuesKeyPath_IMetInst != null)
	? (setDisplayValuesKeyPath_IMetInst)
	: (setDisplayValuesKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplayValuesKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDisplayValuesKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setDisplayValuesKeyPath_IMetInst = get_setDisplayValuesKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplayValuesKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setDisplayValuesKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean editable){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, editable);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormattingDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormattingDictionary_IMetInst(){
		return ((setFormattingDictionary_IMetInst != null)
	? (setFormattingDictionary_IMetInst)
	: (setFormattingDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormattingDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFormattingDictionary(final com.apple.jobjc.foundation.NSDictionary dictionary){
			final com.apple.jobjc.Invoke.MsgSend setFormattingDictionary_IMetInst = get_setFormattingDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormattingDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dictionary);
		setFormattingDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormattingStringsFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormattingStringsFilename_IMetInst(){
		return ((setFormattingStringsFilename_IMetInst != null)
	? (setFormattingStringsFilename_IMetInst)
	: (setFormattingStringsFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormattingStringsFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFormattingStringsFilename(final com.apple.jobjc.foundation.NSString stringsFilename){
			final com.apple.jobjc.Invoke.MsgSend setFormattingStringsFilename_IMetInst = get_setFormattingStringsFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormattingStringsFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringsFilename);
		setFormattingStringsFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNestingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNestingMode_IMetInst(){
		return ((setNestingMode_IMetInst != null)
	? (setNestingMode_IMetInst)
	: (setNestingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNestingMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setNestingMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setNestingMode_IMetInst = get_setNestingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNestingMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setNestingMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowClass_IMetInst(){
		return ((setRowClass_IMetInst != null)
	? (setRowClass_IMetInst)
	: (setRowClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setRowClass(final com.apple.jobjc.NSClass rowClass){
			final com.apple.jobjc.Invoke.MsgSend setRowClass_IMetInst = get_setRowClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, rowClass);
		setRowClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowHeight_IMetInst(){
		return ((setRowHeight_IMetInst != null)
	? (setRowHeight_IMetInst)
	: (setRowHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setRowHeight(final double height){
			final com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst = get_setRowHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, height);
		setRowHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowTypeKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowTypeKeyPath_IMetInst(){
		return ((setRowTypeKeyPath_IMetInst != null)
	? (setRowTypeKeyPath_IMetInst)
	: (setRowTypeKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowTypeKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRowTypeKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setRowTypeKeyPath_IMetInst = get_setRowTypeKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowTypeKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setRowTypeKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubrowsKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubrowsKeyPath_IMetInst(){
		return ((setSubrowsKeyPath_IMetInst != null)
	? (setSubrowsKeyPath_IMetInst)
	: (setSubrowsKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubrowsKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubrowsKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setSubrowsKeyPath_IMetInst = get_setSubrowsKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubrowsKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setSubrowsKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend subrowIndexesForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subrowIndexesForRow_IMetInst(){
		return ((subrowIndexesForRow_IMetInst != null)
	? (subrowIndexesForRow_IMetInst)
	: (subrowIndexesForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subrowIndexesForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet subrowIndexesForRow(final long rowIndex){
			final com.apple.jobjc.Invoke.MsgSend subrowIndexesForRow_IMetInst = get_subrowIndexesForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subrowIndexesForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowIndex);
		subrowIndexesForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subrowsKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subrowsKeyPath_IMetInst(){
		return ((subrowsKeyPath_IMetInst != null)
	? (subrowsKeyPath_IMetInst)
	: (subrowsKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subrowsKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString subrowsKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend subrowsKeyPath_IMetInst = get_subrowsKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subrowsKeyPath_IMetInst.init(nativeBuffer, this);
		subrowsKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
