package com.apple.jobjc.appkit;

public  class NSRulerMarker extends com.apple.jobjc.foundation.NSObject {
	public NSRulerMarker(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRulerMarker(final NSRulerMarker obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend drawRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawRect_IMetInst(){
		return ((drawRect_IMetInst != null)
	? (drawRect_IMetInst)
	: (drawRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawRect_IMetInst = get_drawRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageOrigin_IMetInst(){
		return ((imageOrigin_IMetInst != null)
	? (imageOrigin_IMetInst)
	: (imageOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageOrigin", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint imageOrigin(){
			final com.apple.jobjc.Invoke.MsgSend imageOrigin_IMetInst = get_imageOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageOrigin_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		imageOrigin_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRectInRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRectInRuler_IMetInst(){
		return ((imageRectInRuler_IMetInst != null)
	? (imageRectInRuler_IMetInst)
	: (imageRectInRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRectInRuler", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect imageRectInRuler(){
			final com.apple.jobjc.Invoke.MsgSend imageRectInRuler_IMetInst = get_imageRectInRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRectInRuler_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		imageRectInRuler_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRulerView_markerLocation_image_imageOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRulerView_markerLocation_image_imageOrigin_IMetInst(){
		return ((initWithRulerView_markerLocation_image_imageOrigin_IMetInst != null)
	? (initWithRulerView_markerLocation_image_imageOrigin_IMetInst)
	: (initWithRulerView_markerLocation_image_imageOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRulerView:markerLocation:image:imageOrigin:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRulerView_markerLocation_image_imageOrigin(final com.apple.jobjc.appkit.NSRulerView ruler, final double location, final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint imageOrigin){
			final com.apple.jobjc.Invoke.MsgSend initWithRulerView_markerLocation_image_imageOrigin_IMetInst = get_initWithRulerView_markerLocation_image_imageOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRulerView_markerLocation_image_imageOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, imageOrigin);
		initWithRulerView_markerLocation_image_imageOrigin_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDragging_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDragging_IMetInst(){
		return ((isDragging_IMetInst != null)
	? (isDragging_IMetInst)
	: (isDragging_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDragging", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDragging(){
			final com.apple.jobjc.Invoke.MsgSend isDragging_IMetInst = get_isDragging_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDragging_IMetInst.init(nativeBuffer, this);
		isDragging_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMovable_IMetInst(){
		return ((isMovable_IMetInst != null)
	? (isMovable_IMetInst)
	: (isMovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMovable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMovable(){
			final com.apple.jobjc.Invoke.MsgSend isMovable_IMetInst = get_isMovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMovable_IMetInst.init(nativeBuffer, this);
		isMovable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRemovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRemovable_IMetInst(){
		return ((isRemovable_IMetInst != null)
	? (isRemovable_IMetInst)
	: (isRemovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRemovable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRemovable(){
			final com.apple.jobjc.Invoke.MsgSend isRemovable_IMetInst = get_isRemovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRemovable_IMetInst.init(nativeBuffer, this);
		isRemovable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend markerLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markerLocation_IMetInst(){
		return ((markerLocation_IMetInst != null)
	? (markerLocation_IMetInst)
	: (markerLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markerLocation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double markerLocation(){
			final com.apple.jobjc.Invoke.MsgSend markerLocation_IMetInst = get_markerLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markerLocation_IMetInst.init(nativeBuffer, this);
		markerLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedObject_IMetInst(){
		return ((representedObject_IMetInst != null)
	? (representedObject_IMetInst)
	: (representedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T representedObject(){
			final com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst = get_representedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedObject_IMetInst.init(nativeBuffer, this);
		representedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ruler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ruler_IMetInst(){
		return ((ruler_IMetInst != null)
	? (ruler_IMetInst)
	: (ruler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ruler", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRulerView ruler(){
			final com.apple.jobjc.Invoke.MsgSend ruler_IMetInst = get_ruler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ruler_IMetInst.init(nativeBuffer, this);
		ruler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRulerView returnValue = (com.apple.jobjc.appkit.NSRulerView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageOrigin_IMetInst(){
		return ((setImageOrigin_IMetInst != null)
	? (setImageOrigin_IMetInst)
	: (setImageOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setImageOrigin(final com.apple.jobjc.foundation.NSPoint imageOrigin){
			final com.apple.jobjc.Invoke.MsgSend setImageOrigin_IMetInst = get_setImageOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, imageOrigin);
		setImageOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMarkerLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMarkerLocation_IMetInst(){
		return ((setMarkerLocation_IMetInst != null)
	? (setMarkerLocation_IMetInst)
	: (setMarkerLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMarkerLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMarkerLocation(final double location){
			final com.apple.jobjc.Invoke.MsgSend setMarkerLocation_IMetInst = get_setMarkerLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMarkerLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		setMarkerLocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMovable_IMetInst(){
		return ((setMovable_IMetInst != null)
	? (setMovable_IMetInst)
	: (setMovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMovable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMovable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMovable_IMetInst = get_setMovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMovable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMovable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRemovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRemovable_IMetInst(){
		return ((setRemovable_IMetInst != null)
	? (setRemovable_IMetInst)
	: (setRemovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRemovable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRemovable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRemovable_IMetInst = get_setRemovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRemovable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRemovable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedObject_IMetInst(){
		return ((setRepresentedObject_IMetInst != null)
	? (setRepresentedObject_IMetInst)
	: (setRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedObject(final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst = get_setRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		setRepresentedObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend thicknessRequiredInRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_thicknessRequiredInRuler_IMetInst(){
		return ((thicknessRequiredInRuler_IMetInst != null)
	? (thicknessRequiredInRuler_IMetInst)
	: (thicknessRequiredInRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "thicknessRequiredInRuler", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double thicknessRequiredInRuler(){
			final com.apple.jobjc.Invoke.MsgSend thicknessRequiredInRuler_IMetInst = get_thicknessRequiredInRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		thicknessRequiredInRuler_IMetInst.init(nativeBuffer, this);
		thicknessRequiredInRuler_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackMouse_adding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackMouse_adding_IMetInst(){
		return ((trackMouse_adding_IMetInst != null)
	? (trackMouse_adding_IMetInst)
	: (trackMouse_adding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackMouse:adding:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean trackMouse_adding(final com.apple.jobjc.appkit.NSEvent mouseDownEvent, final boolean isAdding){
			final com.apple.jobjc.Invoke.MsgSend trackMouse_adding_IMetInst = get_trackMouse_adding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackMouse_adding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mouseDownEvent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isAdding);
		trackMouse_adding_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
