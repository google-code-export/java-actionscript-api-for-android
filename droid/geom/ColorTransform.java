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

import droid.geom.ColorTransform;

/**
 * flash.geom.ColorTransform implementation
 * @author Mj Mendoza IV
 * 
 * The ColorTransform class lets you adjust the color values in a display object.
 */
public class ColorTransform {
	/**
	 * Creates a ColorTransform object for a display object.
	 */
	public ColorTransform() {
		this.redMultiplier = 1;
		this.greenMultiplier = 1;
		this.blueMultiplier = 1;
		this.alphaMultiplier = 1;
		this.redOffset = 0;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 */
	public ColorTransform(double redMultiplier) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = 1;
		this.blueMultiplier = 1;
		this.alphaMultiplier = 1;
		this.redOffset = 0;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = 1;
		this.alphaMultiplier = 1;
		this.redOffset = 0;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = 1;
		this.redOffset = 0;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultiplier) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = alphaMultiplier;
		this.redOffset = 0;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 * @param redOffset
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultiplier, double redOffset) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = alphaMultiplier;
		this.redOffset = redOffset;
		this.greenOffset = 0;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 * @param redOffset
	 * @param greenOffset
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultiplier, double redOffset, double greenOffset) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = alphaMultiplier;
		this.redOffset = redOffset;
		this.greenOffset = greenOffset;
		this.blueOffset = 0;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 * @param redOffset
	 * @param greenOffset
	 * @param blueOffset
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultiplier, double redOffset, double greenOffset, double blueOffset) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = alphaMultiplier;
		this.redOffset = redOffset;
		this.greenOffset = greenOffset;
		this.blueOffset = blueOffset;
		this.alphaOffset = 0;
		
		applyColor();
	}
	/**
	 * Creates a ColorTransform object for a display object.
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 * @param redOffset
	 * @param greenOffset
	 * @param blueOffset
	 * @param alphaOffset
	 */
	public ColorTransform(double redMultiplier, double greenMultiplier, double blueMultiplier, double alphaMultiplier, double redOffset, double greenOffset, double blueOffset, double alphaOffset) {
		this.redMultiplier = redMultiplier;
		this.greenMultiplier = greenMultiplier;
		this.blueMultiplier = blueMultiplier;
		this.alphaMultiplier = alphaMultiplier;
		this.redOffset = redOffset;
		this.greenOffset = greenOffset;
		this.blueOffset = blueOffset;
		this.alphaOffset = alphaOffset;
		
		applyColor();
	}
	
	/**
	 * A decimal value that is multiplied with the alpha transparency channel value.
	 */
	public double alphaMultiplier;
	/**
	 * A number from -255 to 255 that is added to the alpha transparency channel value after it has been multiplied by the alphaMultiplier value.
	 */
	public double alphaOffset;
	/**
	 * A decimal value that is multiplied with the blue channel value.
	 */
	public double blueMultiplier;
	/**
	 * A number from -255 to 255 that is added to the blue channel value after it has been multiplied by the blueMultiplier value.
	 */
	public double blueOffset;
	/**
	 * A decimal value that is multiplied with the green channel value.
	 */
	public double greenMultiplier;
	/**
	 * A number from -255 to 255 that is added to the green channel value after it has been multiplied by the greenMultiplier value.
	 */
	public double greenOffset;
	/**
	 * A decimal value that is multiplied with the red channel value.
	 */
	public double redMultiplier;
	/**
	 * A number from -255 to 255 that is added to the red channel value after it has been multiplied by the redMultiplier value.
	 */
	public double redOffset;

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.ColorTransform.setColor()
	 * @see droid.geom.ColorTransform.setColor()
	 */
	public int color;
	/**
	 * Returns the RGB color value for a ColorTransform object.
	 * @return
	 */
	public int getColor() {
		applyColor();
		return color;
	}
	/**
	 * Sets the RGB color value for a ColorTransform object.
	 * @param newColor
	 */
	public void setColor(int newColor) {
		this.redOffset = newColor / 65536;
		this.greenOffset = (newColor - (this.redOffset * 65536))  / 256;
		this.blueOffset = newColor - (this.redOffset * 65536) - (this.greenOffset * 256);
		
		applyColor();
	}
	
	/**
	 * Concatenates the ColorTranform object specified by the second parameter with the current ColorTransform object and sets the current object as the result, which is an additive combination of the two color transformations.
	 * @param second
	 */
	public void concat(ColorTransform second) {
		this.redMultiplier = this.redMultiplier * second.redMultiplier;
		this.greenMultiplier = this.greenMultiplier * second.greenMultiplier;
		this.blueMultiplier = this.blueMultiplier * second.blueMultiplier;
		this.alphaMultiplier = this.alphaMultiplier * second.alphaMultiplier;
		
		this.redOffset += this.redMultiplier;
		this.greenOffset += this.greenMultiplier;
		this.blueOffset += this.blueMultiplier;
		this.alphaOffset += this.alphaMultiplier;
		
		applyColor();
	}
	
		private void applyColor() {
			if (this.redOffset > 255) { this.redOffset = 255; } else if (this.redOffset < -255) { this.redOffset = -255; }
			if (this.greenOffset > 255) { this.greenOffset = 255; } else if (this.greenOffset < -255) { this.greenOffset = -255; }
			if (this.blueOffset > 255) { this.blueOffset = 255; } else if (this.blueOffset < -255) { this.blueOffset = -255; }
			
			this.color = (int) (this.redOffset * 65536) + (int) (this.greenOffset * 256) + (int) (this.blueOffset);
		}

	/**
	 * Formats and returns a string that describes all of the properties of the ColorTransform object.
	 */
	public String toString() {
		return "(redMultiplier=" + this.redMultiplier + ", greenMultiplier=" + this.greenMultiplier + ", blueMultiplier=" + this.blueMultiplier + ", alphaMultiplier=" + this.alphaMultiplier + ", redOffset=" + this.redOffset + ", greenOffset=" + this.greenOffset + ", blueOffset=" + this.blueOffset + ", alphaOffset=" + this.alphaOffset + ")";
	}
}
