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
package droid.geom;

import droid.geom.Matrix;
import droid.geom.ColorTransform;
import droid.geom.Rectangle;
import droid.display.DisplayObject;

/**
 * flash.geom.Transform implementation
 * @author Mj Mendoza IV
 * 
 * The Transform class provides access to color adjustment properties and two- or three-dimensional transformation objects that can be applied to a display object.
 */
public class Transform {
	protected DisplayObject displayObject;
	
	public Transform (DisplayObject displayObject) {
		this.displayObject = displayObject;
	}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Transform.setColorTransform()
	 * @see droid.geom.Transform.getColorTransform()
	 */
	public ColorTransform colorTransform;
		/**
		 * A ColorTransform object containing values that universally adjust the colors in the display object.
		 * @return
		 */
		public ColorTransform getColorTransform() {
			return colorTransform;
		}
		/**
		 * A ColorTransform object containing values that universally adjust the colors in the display object.
		 * @param value
		 */
		public void setColorTransform(ColorTransform value) {
			colorTransform = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Transform.getConcatenatedColorTransform()
	 */
	public ColorTransform concatenatedColorTransform;
		/**
		 * A ColorTransform object representing the combined color transformations applied to the display object and all of its parent objects, back to the root level.
		 * @return
		 */
		public ColorTransform getConcatenatedColorTransform() {
			return concatenatedColorTransform;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Transform.getConcatenatedMatrix()
	 */
	public Matrix concatenatedMatrix;
		/**
		 * A Matrix object representing the combined transformation matrixes of the display object and all of its parent objects, back to the root level.
		 * @return
		 */
		public Matrix getConcatenatedMatrix() {
			return concatenatedMatrix;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Transform.setMatrix()
	 * @see droid.geom.Transform.getMatrix()
	 */
	public Matrix matrix;
		/**
		 * A Matrix object containing values that alter the scaling, rotation, and translation of the display object.
		 * @return
		 */
		public Matrix getMatrix() {
			return matrix;
		}
		/**
		 * A Matrix object containing values that alter the scaling, rotation, and translation of the display object.
		 * @param value
		 */
		public void setMatrix(Matrix value) {
			matrix = value;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Transform.getPixelBounds()
	 */
	public Rectangle pixelBounds;
		/**
		 * A Rectangle object that defines the bounding rectangle of the display object on the stage.
		 * @return
		 */
		public Rectangle getPixelBounds () {
			return pixelBounds;
		}
}
