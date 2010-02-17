/**
* Jasafa - Java ActionScript API For Android
* Java implementation of ActionScript3
*
* MIT Licensed (http://www.opensource.org/licenses/mit-license.php)
* Copyright (c) 2010 Mj Mendoza IV <mjmendoza@konsolscript.org>
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/
package droid.display;

import java.util.ArrayList;

import droid.display.DisplayObject;
import droid.text.TextSnapshot;
import droid.geom.Point;
import droid.misc.IDisplayObject;

/**
 * flash.display.DisplayObjectContainer
 * @author Mj Mendoza IV
 * 
 * The DisplayObjectContainer class is the base class for all objects that can serve as display object containers on the display list.
 */
public class DisplayObjectContainer extends InteractiveObject implements IDisplayObject {
	ArrayList<DisplayObject> displayObjects;
	/**
	 * Calling the new DisplayObjectContainer() constructor throws an ArgumentError exception.
	 * @return
	 */
	public DisplayObjectContainer() {
		setType("DisplayObjectContainer");
		displayObjects = new ArrayList<DisplayObject>();
	}
	
	public boolean mouseChildren;
	/**
	 * Determines whether or not the children of the object are mouse enabled.
	 * @return
	 */
	public boolean getMouseChildren() {
		return mouseChildren;
	}
	/**
	 * Determines whether or not the children of the object are mouse enabled.
	 * @param enable
	 */
	public void setMouseChildren(boolean enable) {
		mouseChildren = enable;
	}

	public int numChildren;
	/**
	 * Returns the number of children of this object.
	 * @return
	 */
	public int getNumChildren() {
		return numChildren;
	}

	/**
	 * Determines whether the children of the object are tab enabled.
	 */
	public boolean tabChildren;
	/**
	 * Determines whether the children of the object are tab enabled.
	 * @return
	 */
	public boolean getTabChildren() {
		return tabChildren;
	}
	/**
	 * Determines whether the children of the object are tab enabled.
	 * @param enable
	 */
	public void setTabChildren (boolean enable) {
		tabChildren = enable;
	}

	/**
	 * Returns a TextSnapshot object for this DisplayObjectContainer instance.
	 */
	public TextSnapshot textSnapshot;
	public TextSnapshot getTextSnapshot() {
		return textSnapshot;
	}

	/**
	 * Adds a child object to this DisplayObjectContainer instance.
	 * @param child
	 * @return
	 */
	public DisplayObject addChild (DisplayObject child) {
		displayObjects.add(child);
		return null;
	}

	/**
	 * Adds a child object to this DisplayObjectContainer instance.
	 * @param child
	 * @param index
	 * @return
	 */
	public DisplayObject addChildAt (DisplayObject child, int index) {
		displayObjects.add(index, child);
		return null;
	}

	/**
	 * Indicates whether the security restrictions would cause any display objects to be omitted from the list returned by calling the DisplayObjectContainer.getObjectsUnderPoint() method with the specified point point.
	 * @param point
	 * @return
	 */
	public boolean areInaccessibleObjectsUnderPoint(Point point) {
		//TODO: implement
		return false;
	}

	/**
	 * Determines whether the specified display object is a child of the DisplayObjectContainer instance or the instance itself.
	 * @param child
	 * @return
	 */
	public boolean contains(DisplayObject child) {
		for (int i = 0; i < displayObjects.size(); i++) {
			if (displayObjects.get(i) == child) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the child display object instance that exists at the specified index.
	 * @param index
	 * @return
	 */
	public DisplayObject getChildAt(int index) {
		return displayObjects.get(index);
	}

	/**
	 * Returns the child display object that exists with the specified name.
	 * @param name
	 * @return
	 */
	public DisplayObject getChildByName(String name) {
		DisplayObject tmp;
		for (int i = 0; i < displayObjects.size(); i++) {
			tmp = displayObjects.get(i);
			if (tmp.getNameDisplayObject() == name) {
				return tmp;
			}
		}
		return null;
	}

	/**
	 * Returns the index number of a child DisplayObject instance.
	 * @param child
	 * @return
	 */
	public int getChildIndex(DisplayObject child) {
		for (int i = 0; i < displayObjects.size(); i++) {
			if (displayObjects.get(i) == child) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * Returns an array of objects that lie under the specified point and are children (or grandchildren, and so on) of this DisplayObjectContainer instance.
	 * @param point
	 * @return
	 */
	public Object[] getObjectsUnderPoint(Point point) {
		//TODO: implement
		return null;
	}

	/**
	 * Removes a child display object from the DisplayObjectContainer instance.
	 * @param child
	 * @return
	 */
	public DisplayObject removeChild(DisplayObject child) {
		displayObjects.remove(child);
		return null;
	}

	/**
	 * Removes a child display object, at the specified index position, from the DisplayObjectContainer instance.
	 * @param index
	 * @return
	 */
	public DisplayObject removeChildAt(int index) {
		displayObjects.remove(index);
		return null;
	}

	/**
	 * Changes the index number of an existing child.
	 * @param child
	 * @param index
	 */
	public void setChildIndex(DisplayObject child, int index) {
		if (this.getChildAt(index) != null) {
			int orig = this.getChildIndex(child);
			int i = index;
			if (orig < index) {
				for (i = orig; i < index; i++) {
					displayObjects.set(i, displayObjects.get(i+1));
				}
			} else if (orig > index) {
				for (i = orig; i > index; i--) {
					displayObjects.set(i, displayObjects.get(i-1));
				}
			}
			displayObjects.set(i, child);
		}
	}

	/**
	 * Swaps the z-order (front-to-back order) of the two specified child objects.
	 * @param child1
	 * @param child2
	 */
	public void swapChildren(DisplayObject child1, DisplayObject child2) {
		int do1 = getChildIndex(child1);
		int do2 = getChildIndex(child2);
		swapChildrenAt(do1, do2);
	}

	/**
	 * Swaps the z-order (front-to-back order) of the child objects at the two specified index positions in the child list.
	 * @param index1
	 * @param index2
	 */
	public void swapChildrenAt(int index1, int index2) {
		DisplayObject tmpa = displayObjects.get(index1);
		DisplayObject tmpb = displayObjects.get(index2);
		DisplayObject tmpc = tmpa;
		displayObjects.set(index2, tmpc);
		displayObjects.set(index1, tmpb);
	}
}
