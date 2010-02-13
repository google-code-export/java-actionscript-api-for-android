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

import droid.media.SoundTransform;
import droid.display.DisplayObject;
import droid.display.Sprite;
import droid.display.Graphics;
import droid.geom.Rectangle;

/**
 * flash.display.Sprite implementation
 * @author Mj Mendoza IV
 * 
 * The Sprite class is a basic display list building block: a display list node that can display graphics and can also contain children.
 */
public class Sprite extends DisplayObjectContainer {
	/**
	 * Creates a new Sprite instance.
	 */
	public Sprite() {
		//
	}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setButtonMode()
	 * @see droid.display.Sprite.getButtonMode()
	 */
	public boolean buttonMode;
		/**
		 * Specifies the button mode of this sprite.
		 * @return
		 */
		public boolean getButtonMode() {
			setButtonMode(buttonMode);
			return buttonMode;
		}
		/**
		 * Specifies the button mode of this sprite.
		 * @param value
		 */
		public void setButtonMode(boolean value) {
			buttonMode = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setDropTarget()
	 * @see droid.display.Sprite.getDropTarget()
	 */
	public DisplayObject dropTarget;
		/**
		 * Specifies the display object over which the sprite is being dragged, or on which the sprite was dropped.
		 * @return
		 */
		public DisplayObject getDropTarget() {
			setDropTarget(dropTarget);
			return dropTarget;
		}
		/**
		 * Specifies the display object over which the sprite is being dragged, or on which the sprite was dropped.
		 * @param value
		 */
		public void setDropTarget(DisplayObject value) {
			dropTarget = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setGraphics()
	 * @see droid.display.Sprite.getGraphics()
	 */
	public Graphics graphics;
		/**
		 * Specifies the Graphics object that belongs to this sprite where vector drawing commands can occur.
		 * @return
		 */
		public Graphics getGraphics() {
			setGraphics(graphics);
			return graphics;
		}
		/**
		 * Specifies the Graphics object that belongs to this sprite where vector drawing commands can occur.
		 * @param value
		 */
		public void setGraphics(Graphics value) {
			graphics = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setHitArea()
	 * @see droid.display.Sprite.getHitArea()
	 */
	public Sprite hitArea;
		/**
		 * Designates another sprite to serve as the hit area for a sprite.
		 * @return
		 */
		public Sprite getHitArea() {
			setHitArea(hitArea);
			return hitArea;
		}
		/**
		 * Designates another sprite to serve as the hit area for a sprite.
		 * @param value
		 */
		public void setHitArea(Sprite value) {
			hitArea = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setSoundTransform()
	 * @see droid.display.Sprite.getSoundTransform()
	 */
	public SoundTransform soundTransform;
		/**
		 * Controls sound within this sprite.
		 * @return
		 */
		public SoundTransform getSoundTransform() {
			setSoundTransform(soundTransform);
			return soundTransform;
		}
		/**
		 * Controls sound within this sprite.
		 * @param sndTransform
		 */
		public void setSoundTransform(SoundTransform sndTransform) {
			soundTransform = sndTransform;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Sprite.setUseHandCursor()
	 * @see droid.display.Sprite.getUseHandCursor()
	 */
	public boolean useHandCursor;
		/**
		 * Returns a Boolean value that indicates whether the pointing hand (hand cursor) appears when the mouse rolls over a sprite in which the buttonMode property is set to true.
		 * @return
		 */
		public boolean getUseHandCursor() {
			setUseHandCursor(useHandCursor);
			return useHandCursor;
		}
		/**
		 * Sets whether the pointing hand (hand cursor) appears when the mouse rolls over a sprite in which the buttonMode property is set to true.
		 * @param value
		 */
		public void setUseHandCursor(boolean value) {
			useHandCursor = value;
		}

	/**
	 * Lets the user drag the specified sprite.
	 */
	public void startDrag() {
		startDrag(false, null);
	}
	/**
	 * Lets the user drag the specified sprite.
	 * @param lockCenter
	 */
	public void startDrag(boolean lockCenter) {
		startDrag(lockCenter, null);
	}
	/**
	 * Lets the user drag the specified sprite.
	 * @param lockCenter
	 * @param bounds
	 */
	public void startDrag(boolean lockCenter, Rectangle bounds) {
		//TODO: implement
	}

	/**
	 * Ends the startDrag() method.
	 */
	public void stopDrag() {
		//TODO: implement
	}

	public String toString() {
		return "[object Sprite]";
	}
}
