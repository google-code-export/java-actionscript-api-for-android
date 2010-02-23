package droid.display;

import droid.events.EventDispatcher;
import droid.display.IBitmapDrawable;
import droid.geom.Transform;
import droid.display.Stage;
import droid.geom.Point;
import droid.geom.Rectangle;
import droid.misc.IDisplayObject;
import droid.accessibility.AccessibilityProperties;
import droid.display.DisplayObjectContainer;
import droid.display.DisplayObject;
import droid.display.LoaderInfo;

import java.util.ArrayList;

/**
 * flash.display.DisplayObject implementation
 * @author Mj Mendoza IV
 * 
 * The DisplayObject class is the base class for all objects that can be placed on the display list.
 */
public class DisplayObject extends EventDispatcher implements IBitmapDrawable, IDisplayObject {
	public DisplayObject() {
		setType("DisplayObject");
		this.parent = null;
	}
	/**
	 * [broadcast event] Dispatched when the display list is about to be updated and rendered.
	 * @eventType flash.events.Event.RENDER
	 */
	//[Event(name="render", type="flash.events.Event")] 

	/**
	 * Dispatched when a display object is about to be removed from the display list, either directly or through the removal of a sub tree in which the display object is contained.
	 * @eventType flash.events.Event.REMOVED_FROM_STAGE
	 */
	//[Event(name="removedFromStage", type="flash.events.Event")] 

	/**
	 * Dispatched when a display object is about to be removed from the display list.
	 * @eventType flash.events.Event.REMOVED
	 */
	//[Event(name="removed", type="flash.events.Event")] 

	/**
	 * [broadcast event] Dispatched when the playhead is entering a new frame.
	 * @eventType flash.events.Event.ENTER_FRAME
	 */
	//[Event(name="enterFrame", type="flash.events.Event")] 

	/**
	 * Dispatched when a display object is added to the on stage display list, either directly or through the addition of a sub tree in which the display object is contained.
	 * @eventType flash.events.Event.ADDED_TO_STAGE
	 */
	//[Event(name="addedToStage", type="flash.events.Event")] 
	
	/**
	 * Dispatched when a display object is added to the display list.
	 * @eventType flash.events.Event.ADDED
	 */
	//[Event(name="added", type="flash.events.Event")] 
	
	/// The current accessibility options for this display object.
	public AccessibilityProperties accessibilityProperties;
	public AccessibilityProperties getAccessibilityProperties() {
		return accessibilityProperties;
	}
	public void setAccessibilityProperties(AccessibilityProperties value) {
		accessibilityProperties = value;
	}
	
	/// Indicates the alpha transparency value of the object specified.
	public double alpha;
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double value) {
		alpha = value;
	}

	/// A value from the BlendMode class that specifies which blend mode to use.
	public String blendMode;
	public String getBlendMode() {
		return blendMode;
	}
	public void setBlendMode(String value) {
		blendMode = value;
	}

	/// If set to true, Flash Player caches an internal bitmap representation of the display object.
	public boolean cacheAsBitmap;
	public boolean getCacheAsBitmap() {
		return cacheAsBitmap;
	}
	public void setCacheAsBitmap(boolean value) {
		cacheAsBitmap = value;
	}

	/// An indexed array that contains each filter object currently associated with the display object.
	public ArrayList<Object> filters;
	public ArrayList<Object> getFilters() {
		return filters;
	}
	public void setFilters(ArrayList<Object> value) {
		filters = value;
	}

	/// Indicates the height of the display object, in pixels.
	public double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double value) {
		height = value;
	}

	/// Returns a LoaderInfo object containing information about loading the file to which this display object belongs.
	public LoaderInfo loaderInfo;
	public LoaderInfo getLoaderInfo() {
		return loaderInfo;
	}

	/// The calling display object is masked by the specified mask object.
	public DisplayObject mask;
	public DisplayObject getMask () {
		return mask;
	}
	public void setMask(DisplayObject value) {
		mask = value;
	}

	/// Indicates the x coordinate of the mouse position, in pixels.
	public double mouseX;
	public double getMouseX() {
		return mouseX;
	}
	
	/// Indicates the y coordinate of the mouse position, in pixels.
	public double mouseY;
	public double getMouseY() {
		return mouseY;
	}

	/// Indicates the instance name of the DisplayObject.
	public String name;
	public String getNameDisplayObject() {
		return name;
	}
	public void setNameDisplayObject(String value) {
		name = value;
	}

	/// Specifies whether the display object is opaque with a certain background color.
	public Object opaqueBackground;
	public Object getOpaqueBackground() {
		return opaqueBackground;
	}
	public void setOpaqueBackground(Object value) {
		opaqueBackground = value;
	}

	/// Indicates the DisplayObjectContainer object that contains this display object.
	public DisplayObjectContainer parent;
	public DisplayObjectContainer getParent() {
		return parent;
	}

	/// For a display object in a loaded SWF file, the root property is the top-most display object in the portion of the display list's tree structure represented by that SWF file.
	public DisplayObject root;
	public DisplayObject getRoot() {
		return root;
	}

	/// Indicates the rotation of the DisplayObject instance, in degrees, from its original orientation.
	public double rotation;
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double value) {
		rotation = value;
	}

	/// The current scaling grid that is in effect.
	public Rectangle scale9Grid;
	public Rectangle getScale9Grid() {
		return scale9Grid;
	}
	public void setScale9Grid(Rectangle innerRectangle) {
		scale9Grid = innerRectangle;
	}

	/// Indicates the horizontal scale (percentage) of the object as applied from the registration point.
	public double scaleX;
	public double getScaleX() {
		return scaleX;
	}
	public void setScaleX(double value) {
		scaleX = value;
	}

	/// Indicates the vertical scale (percentage) of an object as applied from the registration point of the object.
	public double scaleY;
	public double getScaleY() {
		return scaleY;
	}
	public void setScaleY(double value) {
		scaleY = value;
	}

	/// The scroll rectangle bounds of the display object.
	public Rectangle scrollRect;
	public Rectangle getScrollRect() {
		return scrollRect;
	}
	public void setScrollRect(Rectangle value) {
		scrollRect = value;
	}
	
	/// The Stage of the display object.
	public Stage stage;
	public Stage getStage() {
		return stage;
	}

	/// An object with properties pertaining to a display object's matrix, color transform, and pixel bounds.
	public Transform transform;
	public Transform getTransform() {
		return transform;
	}
	public void setTransform(Transform value) {
		transform = value;
	}

	/// Indicates the width of the display object, in pixels.
	public double width;
	public double getWidth() {
		return width;
	}
	public void setWidth(double value) {
		width = value;
	}

	/// Whether or not the display object is visible.
	public boolean visible;
	public boolean getVisible() {
		return visible;
	}
	public void setVisible(boolean value) {
		visible = value;
	}

	/// Indicates the x coordinate of the DisplayObject instance relative to the local coordinates of the parent DisplayObjectContainer.
	public double x;
	public double getX() {
		return x;
	}
	public void setX(double value) {
		x = value;
	}

	/// Indicates the y coordinate of the DisplayObject instance relative to the local coordinates of the parent DisplayObjectContainer.
	public double y;
	public double getY() {
		return y;
	}
	public void setY(double value) {
		y = value;
	}
	
	/**
	 * Returns a rectangle that defines the area of the display object relative to the coordinate system of the targetCoordinateSpace object.
	 * @param targetCoordinateSpace
	 * @return
	 */
	public Rectangle getBounds(DisplayObject targetCoordinateSpace) {
		//TODO: implement
		return null;
	}

	/**
	 * Returns a rectangle that defines the boundary of the display object, based on the coordinate system defined by the targetCoordinateSpace parameter, excluding any strokes on shapes.
	 * @param targetCoordinateSpace
	 * @return
	 */
	public Rectangle getRect(DisplayObject targetCoordinateSpace) {
		//TODO: implement
		return null;
	}

	/**
	 * Converts the point object from Stage (global) coordinates to the display object's (local) coordinates.
	 * @param point
	 * @return
	 */
	public Point globalToLocal(Point point) {
		Point tmp = localToGlobal(new Point(this.x,this.y));
		
		return new Point(point.x - tmp.x, point.y - tmp.y);
	}

	/**
	 * Evaluates the display object to see if it overlaps or intersects with the display object passed as a parameter.
	 * @param obj
	 * @return
	 */
	public boolean hitTestObject(DisplayObject obj) {
		return hitTestPoint(obj.x, obj.y) && hitTestPoint(obj.x + obj.width, obj.y)
					&& hitTestPoint(obj.x + obj.width, obj.y + obj.height) && hitTestPoint(obj.x, obj.y + obj.height);
	}

	/**
	 * Evaluates the display object to see if it overlaps or intersects with a point specified by x and y.
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean hitTestPoint(double x, double y) {
		return hitTestPoint(x, y, false);
	}
	/**
	 * Evaluates the display object to see if it overlaps or intersects with a point specified by x and y.
	 * @param x
	 * @param y
	 * @param shapeFlag
	 * @return
	 */
	public boolean hitTestPoint(double x, double y, boolean shapeFlag) {
		if (this.x >= x && (this.x + this.width) <= x
				&& this.y >= y && (this.y + this.height) <= y) {
			if (shapeFlag == true) {
				//TODO: implement checking with shapeFlag set to true
				return false;
			} else {
				return true;
			}
			
		} else {
			return false;
		}
		
	}

	/**
	 * Converts the point object from the display object's (local) coordinates to the Stage (global) coordinates.
	 * @param point
	 * @return
	 */
	public Point localToGlobal(Point point) {
		DisplayObjectContainer parent = this.parent;
		Point tmp = new Point(point.x, point.y);
		
		while (parent != null) {
			tmp.x -= parent.x;
			tmp.y -= parent.y;
			parent = parent.parent;
		}
		
		return new Point(tmp.x, tmp.y);
	}
	    protected String type;
	    public String getType() {
	    	return type;
	    }
	    protected String setType(String type) {
	    	return this.type = type;
	    }
}
