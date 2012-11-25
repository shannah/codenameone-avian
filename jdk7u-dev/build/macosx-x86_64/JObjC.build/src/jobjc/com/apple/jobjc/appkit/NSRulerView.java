package com.apple.jobjc.appkit;

public  class NSRulerView extends com.apple.jobjc.appkit.NSView {
	public NSRulerView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRulerView(final NSRulerView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryView_IMetInst(){
		return ((accessoryView_IMetInst != null)
	? (accessoryView_IMetInst)
	: (accessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView accessoryView(){
			final com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst = get_accessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryView_IMetInst.init(nativeBuffer, this);
		accessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addMarker_IMetInst(){
		return ((addMarker_IMetInst != null)
	? (addMarker_IMetInst)
	: (addMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addMarker(final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend addMarker_IMetInst = get_addMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		addMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend baselineLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baselineLocation_IMetInst(){
		return ((baselineLocation_IMetInst != null)
	? (baselineLocation_IMetInst)
	: (baselineLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baselineLocation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double baselineLocation(){
			final com.apple.jobjc.Invoke.MsgSend baselineLocation_IMetInst = get_baselineLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baselineLocation_IMetInst.init(nativeBuffer, this);
		baselineLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clientView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clientView_IMetInst(){
		return ((clientView_IMetInst != null)
	? (clientView_IMetInst)
	: (clientView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clientView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView clientView(){
			final com.apple.jobjc.Invoke.MsgSend clientView_IMetInst = get_clientView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clientView_IMetInst.init(nativeBuffer, this);
		clientView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawHashMarksAndLabelsInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawHashMarksAndLabelsInRect_IMetInst(){
		return ((drawHashMarksAndLabelsInRect_IMetInst != null)
	? (drawHashMarksAndLabelsInRect_IMetInst)
	: (drawHashMarksAndLabelsInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawHashMarksAndLabelsInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawHashMarksAndLabelsInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawHashMarksAndLabelsInRect_IMetInst = get_drawHashMarksAndLabelsInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawHashMarksAndLabelsInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawHashMarksAndLabelsInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawMarkersInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawMarkersInRect_IMetInst(){
		return ((drawMarkersInRect_IMetInst != null)
	? (drawMarkersInRect_IMetInst)
	: (drawMarkersInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawMarkersInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawMarkersInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawMarkersInRect_IMetInst = get_drawMarkersInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawMarkersInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawMarkersInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithScrollView_orientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithScrollView_orientation_IMetInst(){
		return ((initWithScrollView_orientation_IMetInst != null)
	? (initWithScrollView_orientation_IMetInst)
	: (initWithScrollView_orientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithScrollView:orientation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithScrollView_orientation(final com.apple.jobjc.appkit.NSScrollView scrollView, final long orientation){
			final com.apple.jobjc.Invoke.MsgSend initWithScrollView_orientation_IMetInst = get_initWithScrollView_orientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithScrollView_orientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, scrollView);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, orientation);
		initWithScrollView_orientation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateHashMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateHashMarks_IMetInst(){
		return ((invalidateHashMarks_IMetInst != null)
	? (invalidateHashMarks_IMetInst)
	: (invalidateHashMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateHashMarks", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateHashMarks(){
			final com.apple.jobjc.Invoke.MsgSend invalidateHashMarks_IMetInst = get_invalidateHashMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateHashMarks_IMetInst.init(nativeBuffer, this);
		invalidateHashMarks_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFlipped_IMetInst(){
		return ((isFlipped_IMetInst != null)
	? (isFlipped_IMetInst)
	: (isFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFlipped", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFlipped(){
			final com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst = get_isFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFlipped_IMetInst.init(nativeBuffer, this);
		isFlipped_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markers_IMetInst(){
		return ((markers_IMetInst != null)
	? (markers_IMetInst)
	: (markers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray markers(){
			final com.apple.jobjc.Invoke.MsgSend markers_IMetInst = get_markers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markers_IMetInst.init(nativeBuffer, this);
		markers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend measurementUnits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_measurementUnits_IMetInst(){
		return ((measurementUnits_IMetInst != null)
	? (measurementUnits_IMetInst)
	: (measurementUnits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "measurementUnits", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString measurementUnits(){
			final com.apple.jobjc.Invoke.MsgSend measurementUnits_IMetInst = get_measurementUnits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		measurementUnits_IMetInst.init(nativeBuffer, this);
		measurementUnits_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveRulerlineFromLocation_toLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveRulerlineFromLocation_toLocation_IMetInst(){
		return ((moveRulerlineFromLocation_toLocation_IMetInst != null)
	? (moveRulerlineFromLocation_toLocation_IMetInst)
	: (moveRulerlineFromLocation_toLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveRulerlineFromLocation:toLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void moveRulerlineFromLocation_toLocation(final double oldLocation, final double newLocation){
			final com.apple.jobjc.Invoke.MsgSend moveRulerlineFromLocation_toLocation_IMetInst = get_moveRulerlineFromLocation_toLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveRulerlineFromLocation_toLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, oldLocation);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, newLocation);
		moveRulerlineFromLocation_toLocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orientation_IMetInst(){
		return ((orientation_IMetInst != null)
	? (orientation_IMetInst)
	: (orientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orientation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long orientation(){
			final com.apple.jobjc.Invoke.MsgSend orientation_IMetInst = get_orientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orientation_IMetInst.init(nativeBuffer, this);
		orientation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend originOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_originOffset_IMetInst(){
		return ((originOffset_IMetInst != null)
	? (originOffset_IMetInst)
	: (originOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "originOffset", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double originOffset(){
			final com.apple.jobjc.Invoke.MsgSend originOffset_IMetInst = get_originOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		originOffset_IMetInst.init(nativeBuffer, this);
		originOffset_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeMarker_IMetInst(){
		return ((removeMarker_IMetInst != null)
	? (removeMarker_IMetInst)
	: (removeMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeMarker(final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend removeMarker_IMetInst = get_removeMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		removeMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend requiredThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requiredThickness_IMetInst(){
		return ((requiredThickness_IMetInst != null)
	? (requiredThickness_IMetInst)
	: (requiredThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requiredThickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double requiredThickness(){
			final com.apple.jobjc.Invoke.MsgSend requiredThickness_IMetInst = get_requiredThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requiredThickness_IMetInst.init(nativeBuffer, this);
		requiredThickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reservedThicknessForAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reservedThicknessForAccessoryView_IMetInst(){
		return ((reservedThicknessForAccessoryView_IMetInst != null)
	? (reservedThicknessForAccessoryView_IMetInst)
	: (reservedThicknessForAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reservedThicknessForAccessoryView", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double reservedThicknessForAccessoryView(){
			final com.apple.jobjc.Invoke.MsgSend reservedThicknessForAccessoryView_IMetInst = get_reservedThicknessForAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reservedThicknessForAccessoryView_IMetInst.init(nativeBuffer, this);
		reservedThicknessForAccessoryView_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reservedThicknessForMarkers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reservedThicknessForMarkers_IMetInst(){
		return ((reservedThicknessForMarkers_IMetInst != null)
	? (reservedThicknessForMarkers_IMetInst)
	: (reservedThicknessForMarkers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reservedThicknessForMarkers", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double reservedThicknessForMarkers(){
			final com.apple.jobjc.Invoke.MsgSend reservedThicknessForMarkers_IMetInst = get_reservedThicknessForMarkers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reservedThicknessForMarkers_IMetInst.init(nativeBuffer, this);
		reservedThicknessForMarkers_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruleThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruleThickness_IMetInst(){
		return ((ruleThickness_IMetInst != null)
	? (ruleThickness_IMetInst)
	: (ruleThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruleThickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double ruleThickness(){
			final com.apple.jobjc.Invoke.MsgSend ruleThickness_IMetInst = get_ruleThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruleThickness_IMetInst.init(nativeBuffer, this);
		ruleThickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollView_IMetInst(){
		return ((scrollView_IMetInst != null)
	? (scrollView_IMetInst)
	: (scrollView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScrollView scrollView(){
			final com.apple.jobjc.Invoke.MsgSend scrollView_IMetInst = get_scrollView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollView_IMetInst.init(nativeBuffer, this);
		scrollView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScrollView returnValue = (com.apple.jobjc.appkit.NSScrollView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView accessory){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, accessory);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setClientView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClientView_IMetInst(){
		return ((setClientView_IMetInst != null)
	? (setClientView_IMetInst)
	: (setClientView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClientView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setClientView(final com.apple.jobjc.appkit.NSView client){
			final com.apple.jobjc.Invoke.MsgSend setClientView_IMetInst = get_setClientView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClientView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		setClientView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMarkers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMarkers_IMetInst(){
		return ((setMarkers_IMetInst != null)
	? (setMarkers_IMetInst)
	: (setMarkers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMarkers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMarkers(final com.apple.jobjc.foundation.NSArray markers){
			final com.apple.jobjc.Invoke.MsgSend setMarkers_IMetInst = get_setMarkers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMarkers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, markers);
		setMarkers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMeasurementUnits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMeasurementUnits_IMetInst(){
		return ((setMeasurementUnits_IMetInst != null)
	? (setMeasurementUnits_IMetInst)
	: (setMeasurementUnits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMeasurementUnits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMeasurementUnits(final com.apple.jobjc.foundation.NSString unitName){
			final com.apple.jobjc.Invoke.MsgSend setMeasurementUnits_IMetInst = get_setMeasurementUnits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMeasurementUnits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unitName);
		setMeasurementUnits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOrientation_IMetInst(){
		return ((setOrientation_IMetInst != null)
	? (setOrientation_IMetInst)
	: (setOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend setOrientation_IMetInst = get_setOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, orientation);
		setOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOriginOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOriginOffset_IMetInst(){
		return ((setOriginOffset_IMetInst != null)
	? (setOriginOffset_IMetInst)
	: (setOriginOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOriginOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setOriginOffset(final double offset){
			final com.apple.jobjc.Invoke.MsgSend setOriginOffset_IMetInst = get_setOriginOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOriginOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, offset);
		setOriginOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReservedThicknessForAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReservedThicknessForAccessoryView_IMetInst(){
		return ((setReservedThicknessForAccessoryView_IMetInst != null)
	? (setReservedThicknessForAccessoryView_IMetInst)
	: (setReservedThicknessForAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReservedThicknessForAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setReservedThicknessForAccessoryView(final double thickness){
			final com.apple.jobjc.Invoke.MsgSend setReservedThicknessForAccessoryView_IMetInst = get_setReservedThicknessForAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReservedThicknessForAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, thickness);
		setReservedThicknessForAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReservedThicknessForMarkers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReservedThicknessForMarkers_IMetInst(){
		return ((setReservedThicknessForMarkers_IMetInst != null)
	? (setReservedThicknessForMarkers_IMetInst)
	: (setReservedThicknessForMarkers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReservedThicknessForMarkers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setReservedThicknessForMarkers(final double thickness){
			final com.apple.jobjc.Invoke.MsgSend setReservedThicknessForMarkers_IMetInst = get_setReservedThicknessForMarkers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReservedThicknessForMarkers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, thickness);
		setReservedThicknessForMarkers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRuleThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRuleThickness_IMetInst(){
		return ((setRuleThickness_IMetInst != null)
	? (setRuleThickness_IMetInst)
	: (setRuleThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRuleThickness:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setRuleThickness(final double thickness){
			final com.apple.jobjc.Invoke.MsgSend setRuleThickness_IMetInst = get_setRuleThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRuleThickness_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, thickness);
		setRuleThickness_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollView_IMetInst(){
		return ((setScrollView_IMetInst != null)
	? (setScrollView_IMetInst)
	: (setScrollView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScrollView(final com.apple.jobjc.appkit.NSScrollView scrollView){
			final com.apple.jobjc.Invoke.MsgSend setScrollView_IMetInst = get_setScrollView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, scrollView);
		setScrollView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend trackMarker_withMouseEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackMarker_withMouseEvent_IMetInst(){
		return ((trackMarker_withMouseEvent_IMetInst != null)
	? (trackMarker_withMouseEvent_IMetInst)
	: (trackMarker_withMouseEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackMarker:withMouseEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean trackMarker_withMouseEvent(final com.apple.jobjc.appkit.NSRulerMarker marker, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend trackMarker_withMouseEvent_IMetInst = get_trackMarker_withMouseEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackMarker_withMouseEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		trackMarker_withMouseEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
