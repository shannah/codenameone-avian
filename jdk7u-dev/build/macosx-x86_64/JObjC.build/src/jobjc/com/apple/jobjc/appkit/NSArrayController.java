package com.apple.jobjc.appkit;

public  class NSArrayController extends com.apple.jobjc.appkit.NSObjectController {
	public NSArrayController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSArrayController(final NSArrayController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend add_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_add_IMetInst(){
		return ((add_IMetInst != null)
	? (add_IMetInst)
	: (add_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "add:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void add(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend add_IMetInst = get_add_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		add_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		add_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_IMetInst(){
		return ((addObject_IMetInst != null)
	? (addObject_IMetInst)
	: (addObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend addObject_IMetInst = get_addObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		addObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObjects_IMetInst(){
		return ((addObjects_IMetInst != null)
	? (addObjects_IMetInst)
	: (addObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend addObjects_IMetInst = get_addObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		addObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addSelectedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSelectedObjects_IMetInst(){
		return ((addSelectedObjects_IMetInst != null)
	? (addSelectedObjects_IMetInst)
	: (addSelectedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSelectedObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean addSelectedObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend addSelectedObjects_IMetInst = get_addSelectedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSelectedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		addSelectedObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addSelectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSelectionIndexes_IMetInst(){
		return ((addSelectionIndexes_IMetInst != null)
	? (addSelectionIndexes_IMetInst)
	: (addSelectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSelectionIndexes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean addSelectionIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend addSelectionIndexes_IMetInst = get_addSelectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSelectionIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		addSelectionIndexes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alwaysUsesMultipleValuesMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alwaysUsesMultipleValuesMarker_IMetInst(){
		return ((alwaysUsesMultipleValuesMarker_IMetInst != null)
	? (alwaysUsesMultipleValuesMarker_IMetInst)
	: (alwaysUsesMultipleValuesMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alwaysUsesMultipleValuesMarker", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean alwaysUsesMultipleValuesMarker(){
			final com.apple.jobjc.Invoke.MsgSend alwaysUsesMultipleValuesMarker_IMetInst = get_alwaysUsesMultipleValuesMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alwaysUsesMultipleValuesMarker_IMetInst.init(nativeBuffer, this);
		alwaysUsesMultipleValuesMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrangeObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrangeObjects_IMetInst(){
		return ((arrangeObjects_IMetInst != null)
	? (arrangeObjects_IMetInst)
	: (arrangeObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrangeObjects:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrangeObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend arrangeObjects_IMetInst = get_arrangeObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrangeObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		arrangeObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrangedObjects_IMetInst(){
		return ((arrangedObjects_IMetInst != null)
	? (arrangedObjects_IMetInst)
	: (arrangedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrangedObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrangedObjects(){
			final com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst = get_arrangedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrangedObjects_IMetInst.init(nativeBuffer, this);
		arrangedObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend automaticRearrangementKeyPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticRearrangementKeyPaths_IMetInst(){
		return ((automaticRearrangementKeyPaths_IMetInst != null)
	? (automaticRearrangementKeyPaths_IMetInst)
	: (automaticRearrangementKeyPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticRearrangementKeyPaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray automaticRearrangementKeyPaths(){
			final com.apple.jobjc.Invoke.MsgSend automaticRearrangementKeyPaths_IMetInst = get_automaticRearrangementKeyPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticRearrangementKeyPaths_IMetInst.init(nativeBuffer, this);
		automaticRearrangementKeyPaths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend automaticallyRearrangesObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticallyRearrangesObjects_IMetInst(){
		return ((automaticallyRearrangesObjects_IMetInst != null)
	? (automaticallyRearrangesObjects_IMetInst)
	: (automaticallyRearrangesObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticallyRearrangesObjects", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean automaticallyRearrangesObjects(){
			final com.apple.jobjc.Invoke.MsgSend automaticallyRearrangesObjects_IMetInst = get_automaticallyRearrangesObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticallyRearrangesObjects_IMetInst.init(nativeBuffer, this);
		automaticallyRearrangesObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend avoidsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_avoidsEmptySelection_IMetInst(){
		return ((avoidsEmptySelection_IMetInst != null)
	? (avoidsEmptySelection_IMetInst)
	: (avoidsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "avoidsEmptySelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean avoidsEmptySelection(){
			final com.apple.jobjc.Invoke.MsgSend avoidsEmptySelection_IMetInst = get_avoidsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		avoidsEmptySelection_IMetInst.init(nativeBuffer, this);
		avoidsEmptySelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canInsert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInsert_IMetInst(){
		return ((canInsert_IMetInst != null)
	? (canInsert_IMetInst)
	: (canInsert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInsert", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canInsert(){
			final com.apple.jobjc.Invoke.MsgSend canInsert_IMetInst = get_canInsert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInsert_IMetInst.init(nativeBuffer, this);
		canInsert_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canSelectNext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canSelectNext_IMetInst(){
		return ((canSelectNext_IMetInst != null)
	? (canSelectNext_IMetInst)
	: (canSelectNext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canSelectNext", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canSelectNext(){
			final com.apple.jobjc.Invoke.MsgSend canSelectNext_IMetInst = get_canSelectNext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canSelectNext_IMetInst.init(nativeBuffer, this);
		canSelectNext_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canSelectPrevious_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canSelectPrevious_IMetInst(){
		return ((canSelectPrevious_IMetInst != null)
	? (canSelectPrevious_IMetInst)
	: (canSelectPrevious_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canSelectPrevious", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canSelectPrevious(){
			final com.apple.jobjc.Invoke.MsgSend canSelectPrevious_IMetInst = get_canSelectPrevious_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canSelectPrevious_IMetInst.init(nativeBuffer, this);
		canSelectPrevious_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clearsFilterPredicateOnInsertion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearsFilterPredicateOnInsertion_IMetInst(){
		return ((clearsFilterPredicateOnInsertion_IMetInst != null)
	? (clearsFilterPredicateOnInsertion_IMetInst)
	: (clearsFilterPredicateOnInsertion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearsFilterPredicateOnInsertion", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean clearsFilterPredicateOnInsertion(){
			final com.apple.jobjc.Invoke.MsgSend clearsFilterPredicateOnInsertion_IMetInst = get_clearsFilterPredicateOnInsertion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearsFilterPredicateOnInsertion_IMetInst.init(nativeBuffer, this);
		clearsFilterPredicateOnInsertion_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend didChangeArrangementCriteria_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didChangeArrangementCriteria_IMetInst(){
		return ((didChangeArrangementCriteria_IMetInst != null)
	? (didChangeArrangementCriteria_IMetInst)
	: (didChangeArrangementCriteria_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didChangeArrangementCriteria", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void didChangeArrangementCriteria(){
			final com.apple.jobjc.Invoke.MsgSend didChangeArrangementCriteria_IMetInst = get_didChangeArrangementCriteria_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didChangeArrangementCriteria_IMetInst.init(nativeBuffer, this);
		didChangeArrangementCriteria_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend filterPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filterPredicate_IMetInst(){
		return ((filterPredicate_IMetInst != null)
	? (filterPredicate_IMetInst)
	: (filterPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filterPredicate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate filterPredicate(){
			final com.apple.jobjc.Invoke.MsgSend filterPredicate_IMetInst = get_filterPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filterPredicate_IMetInst.init(nativeBuffer, this);
		filterPredicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insert_IMetInst(){
		return ((insert_IMetInst != null)
	? (insert_IMetInst)
	: (insert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insert:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insert(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insert_IMetInst = get_insert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insert_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insert_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertObject_atArrangedObjectIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObject_atArrangedObjectIndex_IMetInst(){
		return ((insertObject_atArrangedObjectIndex_IMetInst != null)
	? (insertObject_atArrangedObjectIndex_IMetInst)
	: (insertObject_atArrangedObjectIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObject:atArrangedObjectIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertObject_atArrangedObjectIndex(final com.apple.jobjc.ID object, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertObject_atArrangedObjectIndex_IMetInst = get_insertObject_atArrangedObjectIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObject_atArrangedObjectIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		insertObject_atArrangedObjectIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertObjects_atArrangedObjectIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObjects_atArrangedObjectIndexes_IMetInst(){
		return ((insertObjects_atArrangedObjectIndexes_IMetInst != null)
	? (insertObjects_atArrangedObjectIndexes_IMetInst)
	: (insertObjects_atArrangedObjectIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObjects:atArrangedObjectIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertObjects_atArrangedObjectIndexes(final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend insertObjects_atArrangedObjectIndexes_IMetInst = get_insertObjects_atArrangedObjectIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObjects_atArrangedObjectIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		insertObjects_atArrangedObjectIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preservesSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preservesSelection_IMetInst(){
		return ((preservesSelection_IMetInst != null)
	? (preservesSelection_IMetInst)
	: (preservesSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preservesSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean preservesSelection(){
			final com.apple.jobjc.Invoke.MsgSend preservesSelection_IMetInst = get_preservesSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preservesSelection_IMetInst.init(nativeBuffer, this);
		preservesSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rearrangeObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rearrangeObjects_IMetInst(){
		return ((rearrangeObjects_IMetInst != null)
	? (rearrangeObjects_IMetInst)
	: (rearrangeObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rearrangeObjects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void rearrangeObjects(){
			final com.apple.jobjc.Invoke.MsgSend rearrangeObjects_IMetInst = get_rearrangeObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rearrangeObjects_IMetInst.init(nativeBuffer, this);
		rearrangeObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend remove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remove_IMetInst(){
		return ((remove_IMetInst != null)
	? (remove_IMetInst)
	: (remove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void remove(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend remove_IMetInst = get_remove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		remove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObject_IMetInst(){
		return ((removeObject_IMetInst != null)
	? (removeObject_IMetInst)
	: (removeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst = get_removeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		removeObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectAtArrangedObjectIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectAtArrangedObjectIndex_IMetInst(){
		return ((removeObjectAtArrangedObjectIndex_IMetInst != null)
	? (removeObjectAtArrangedObjectIndex_IMetInst)
	: (removeObjectAtArrangedObjectIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectAtArrangedObjectIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeObjectAtArrangedObjectIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeObjectAtArrangedObjectIndex_IMetInst = get_removeObjectAtArrangedObjectIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectAtArrangedObjectIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		removeObjectAtArrangedObjectIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjects_IMetInst(){
		return ((removeObjects_IMetInst != null)
	? (removeObjects_IMetInst)
	: (removeObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend removeObjects_IMetInst = get_removeObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		removeObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsAtArrangedObjectIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsAtArrangedObjectIndexes_IMetInst(){
		return ((removeObjectsAtArrangedObjectIndexes_IMetInst != null)
	? (removeObjectsAtArrangedObjectIndexes_IMetInst)
	: (removeObjectsAtArrangedObjectIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsAtArrangedObjectIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsAtArrangedObjectIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsAtArrangedObjectIndexes_IMetInst = get_removeObjectsAtArrangedObjectIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsAtArrangedObjectIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		removeObjectsAtArrangedObjectIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeSelectedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeSelectedObjects_IMetInst(){
		return ((removeSelectedObjects_IMetInst != null)
	? (removeSelectedObjects_IMetInst)
	: (removeSelectedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeSelectedObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removeSelectedObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend removeSelectedObjects_IMetInst = get_removeSelectedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeSelectedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		removeSelectedObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeSelectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeSelectionIndexes_IMetInst(){
		return ((removeSelectionIndexes_IMetInst != null)
	? (removeSelectionIndexes_IMetInst)
	: (removeSelectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeSelectionIndexes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removeSelectionIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend removeSelectionIndexes_IMetInst = get_removeSelectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeSelectionIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		removeSelectionIndexes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectNext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectNext_IMetInst(){
		return ((selectNext_IMetInst != null)
	? (selectNext_IMetInst)
	: (selectNext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectNext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectNext(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectNext_IMetInst = get_selectNext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectNext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectNext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectPrevious_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectPrevious_IMetInst(){
		return ((selectPrevious_IMetInst != null)
	? (selectPrevious_IMetInst)
	: (selectPrevious_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectPrevious:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectPrevious(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectPrevious_IMetInst = get_selectPrevious_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectPrevious_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectPrevious_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedObjects_IMetInst(){
		return ((selectedObjects_IMetInst != null)
	? (selectedObjects_IMetInst)
	: (selectedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedObjects(){
			final com.apple.jobjc.Invoke.MsgSend selectedObjects_IMetInst = get_selectedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedObjects_IMetInst.init(nativeBuffer, this);
		selectedObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndex_IMetInst(){
		return ((selectionIndex_IMetInst != null)
	? (selectionIndex_IMetInst)
	: (selectionIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndex", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long selectionIndex(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndex_IMetInst = get_selectionIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndex_IMetInst.init(nativeBuffer, this);
		selectionIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexes_IMetInst(){
		return ((selectionIndexes_IMetInst != null)
	? (selectionIndexes_IMetInst)
	: (selectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectionIndexes(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexes_IMetInst = get_selectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexes_IMetInst.init(nativeBuffer, this);
		selectionIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectsInsertedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectsInsertedObjects_IMetInst(){
		return ((selectsInsertedObjects_IMetInst != null)
	? (selectsInsertedObjects_IMetInst)
	: (selectsInsertedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectsInsertedObjects", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean selectsInsertedObjects(){
			final com.apple.jobjc.Invoke.MsgSend selectsInsertedObjects_IMetInst = get_selectsInsertedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectsInsertedObjects_IMetInst.init(nativeBuffer, this);
		selectsInsertedObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlwaysUsesMultipleValuesMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlwaysUsesMultipleValuesMarker_IMetInst(){
		return ((setAlwaysUsesMultipleValuesMarker_IMetInst != null)
	? (setAlwaysUsesMultipleValuesMarker_IMetInst)
	: (setAlwaysUsesMultipleValuesMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlwaysUsesMultipleValuesMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAlwaysUsesMultipleValuesMarker(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAlwaysUsesMultipleValuesMarker_IMetInst = get_setAlwaysUsesMultipleValuesMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlwaysUsesMultipleValuesMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAlwaysUsesMultipleValuesMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticallyRearrangesObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticallyRearrangesObjects_IMetInst(){
		return ((setAutomaticallyRearrangesObjects_IMetInst != null)
	? (setAutomaticallyRearrangesObjects_IMetInst)
	: (setAutomaticallyRearrangesObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticallyRearrangesObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticallyRearrangesObjects(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticallyRearrangesObjects_IMetInst = get_setAutomaticallyRearrangesObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticallyRearrangesObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticallyRearrangesObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAvoidsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAvoidsEmptySelection_IMetInst(){
		return ((setAvoidsEmptySelection_IMetInst != null)
	? (setAvoidsEmptySelection_IMetInst)
	: (setAvoidsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAvoidsEmptySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAvoidsEmptySelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAvoidsEmptySelection_IMetInst = get_setAvoidsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAvoidsEmptySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAvoidsEmptySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setClearsFilterPredicateOnInsertion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClearsFilterPredicateOnInsertion_IMetInst(){
		return ((setClearsFilterPredicateOnInsertion_IMetInst != null)
	? (setClearsFilterPredicateOnInsertion_IMetInst)
	: (setClearsFilterPredicateOnInsertion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClearsFilterPredicateOnInsertion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setClearsFilterPredicateOnInsertion(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setClearsFilterPredicateOnInsertion_IMetInst = get_setClearsFilterPredicateOnInsertion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClearsFilterPredicateOnInsertion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setClearsFilterPredicateOnInsertion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFilterPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFilterPredicate_IMetInst(){
		return ((setFilterPredicate_IMetInst != null)
	? (setFilterPredicate_IMetInst)
	: (setFilterPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFilterPredicate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFilterPredicate(final com.apple.jobjc.foundation.NSPredicate filterPredicate){
			final com.apple.jobjc.Invoke.MsgSend setFilterPredicate_IMetInst = get_setFilterPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFilterPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filterPredicate);
		setFilterPredicate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreservesSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreservesSelection_IMetInst(){
		return ((setPreservesSelection_IMetInst != null)
	? (setPreservesSelection_IMetInst)
	: (setPreservesSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreservesSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPreservesSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPreservesSelection_IMetInst = get_setPreservesSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreservesSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPreservesSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedObjects_IMetInst(){
		return ((setSelectedObjects_IMetInst != null)
	? (setSelectedObjects_IMetInst)
	: (setSelectedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setSelectedObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend setSelectedObjects_IMetInst = get_setSelectedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		setSelectedObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndex_IMetInst(){
		return ((setSelectionIndex_IMetInst != null)
	? (setSelectionIndex_IMetInst)
	: (setSelectionIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean setSelectionIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndex_IMetInst = get_setSelectionIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		setSelectionIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexes_IMetInst(){
		return ((setSelectionIndexes_IMetInst != null)
	? (setSelectionIndexes_IMetInst)
	: (setSelectionIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setSelectionIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexes_IMetInst = get_setSelectionIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		setSelectionIndexes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectsInsertedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectsInsertedObjects_IMetInst(){
		return ((setSelectsInsertedObjects_IMetInst != null)
	? (setSelectsInsertedObjects_IMetInst)
	: (setSelectsInsertedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectsInsertedObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectsInsertedObjects(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectsInsertedObjects_IMetInst = get_setSelectsInsertedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectsInsertedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectsInsertedObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSortDescriptors_IMetInst(){
		return ((setSortDescriptors_IMetInst != null)
	? (setSortDescriptors_IMetInst)
	: (setSortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSortDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSortDescriptors(final com.apple.jobjc.foundation.NSArray sortDescriptors){
			final com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst = get_setSortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSortDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		setSortDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptors_IMetInst(){
		return ((sortDescriptors_IMetInst != null)
	? (sortDescriptors_IMetInst)
	: (sortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst = get_sortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptors_IMetInst.init(nativeBuffer, this);
		sortDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
