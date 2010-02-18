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

import droid.display.BitmapData;
import droid.geom.Rectangle;
import droid.geom.Point;
import droid.geom.ColorTransform;
import droid.display.IBitmapDrawable;
import droid.geom.Matrix;
import droid.filters.BitmapFilter;
import droid.utils.ByteArray;

/**
 * flash.display.BitmapData implementation
 * @author Mj Mendoza IV
 * 
 * The BitmapData class lets you work with the data (pixels) of a Bitmap object.
 */
public class BitmapData implements IBitmapDrawable {
	public int height;
		/**
		 * The height of the bitmap image in pixels.
		 * @return
		 */
		public int getHeight() {
			return height;
		}
	
	public Rectangle rect;
		/**
		 * The rectangle that defines the size and location of the bitmap image.
		 * @return
		 */
		public Rectangle getRect() {
			return rect;
		}
	
	public boolean transparent;
		/**
		 * Defines whether the bitmap image supports per-pixel transparency.
		 * @return
		 */
		public boolean getTransparent() {
			return transparent;
		}
	
	public int width;
		/**
		 * The width of the bitmap image in pixels.
		 * @return
		 */
		public int getWidth() {
			return width;
		}

	/**
	 * Takes a source image and a filter object and generates the filtered image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param filter
	 */
	public void applyFilter(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, BitmapFilter filter) {
		//TODO: implement
	}

	/**
	 * Creates a BitmapData object with a specified width and height.
	 * @param width
	 * @param height
	 */
	public BitmapData(int width, int height) {
		this.width = width;
		this.height = height;
		this.transparent = true;
		//this.fillColor = 4294967295;
		//TODO: implement
	}
	/**
	 * Creates a BitmapData object with a specified width and height.
	 * @param width
	 * @param height
	 * @param transparent
	 */
	public BitmapData(int width, int height, boolean transparent) {
		this.width = width;
		this.height = height;
		this.transparent = transparent;
		//this.fillColor = 4294967295;
		//TODO: implement
	}
	/**
	 * Creates a BitmapData object with a specified width and height.
	 * @param width
	 * @param height
	 * @param transparent
	 * @param fillColor
	 */
	public BitmapData(int width, int height, boolean transparent, int fillColor) {
		this.width = width;
		this.height = height;
		this.transparent = transparent;
		this.fillColor = fillColor;
	}
	private int fillColor;
	
	/**
	 * Returns a new BitmapData object with an exact copy of the original bitmap.
	 */
	public BitmapData clone() {
		return new BitmapData(this.getWidth(), this.getHeight(), this.getTransparent(), this.fillColor);
	}

	/**
	 * Adjusts the color values in a specified area of a bitmap image by using a ColorTransform object.
	 * @param rect
	 * @param colorTransform
	 */
	public void colorTransform(Rectangle rect, ColorTransform colorTransform) {
		//TODO: implement
	}
	
	/**
	 * Compares two BitmapData objects.
	 * @param otherBitmapData
	 * @return
	 */
	public Object compare(BitmapData otherBitmapData) {
		//TODO: implement
		return null;
	}

	/**
	 * Transfers data from one channel of another BitmapData object or the current BitmapData object into a channel of the current BitmapData object.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param sourceChannel
	 * @param destChannel
	 */
	public void copyChannel(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int sourceChannel, int destChannel) {
		//TODO: implement
	}

	/**
	 * Provides a fast routine to perform pixel manipulation between images with no stretching, rotation, or color effects.
	 * @param sourceBitmapDataData
	 * @param sourceRect
	 * @param destPoint
	 */
	public void copyPixels(BitmapData sourceBitmapDataData, Rectangle sourceRect, Point destPoint) {
		copyPixels(sourceBitmapDataData, sourceRect, destPoint, null, null, false);
	}
	/**
	 * Provides a fast routine to perform pixel manipulation between images with no stretching, rotation, or color effects.
	 * @param sourceBitmapDataData
	 * @param sourceRect
	 * @param destPoint
	 * @param alphaBitmapData
	 */
	public void copyPixels(BitmapData sourceBitmapDataData, Rectangle sourceRect, Point destPoint, BitmapData alphaBitmapData) {
		copyPixels(sourceBitmapDataData, sourceRect, destPoint, alphaBitmapData, null, false);
	}
	/**
	 * Provides a fast routine to perform pixel manipulation between images with no stretching, rotation, or color effects.
	 * @param sourceBitmapDataData
	 * @param sourceRect
	 * @param destPoint
	 * @param alphaBitmapData
	 * @param alphaPoint
	 */
	public void copyPixels(BitmapData sourceBitmapDataData, Rectangle sourceRect, Point destPoint, BitmapData alphaBitmapData, Point alphaPoint) {
		copyPixels(sourceBitmapDataData, sourceRect, destPoint, alphaBitmapData, alphaPoint, false);
	}
	/**
	 * Provides a fast routine to perform pixel manipulation between images with no stretching, rotation, or color effects.
	 * @param sourceBitmapDataData
	 * @param sourceRect
	 * @param destPoint
	 * @param alphaBitmapData
	 * @param alphaPoint
	 * @param mergeAlpha
	 */
	public void copyPixels(BitmapData sourceBitmapDataData, Rectangle sourceRect, Point destPoint, BitmapData alphaBitmapData, Point alphaPoint, boolean mergeAlpha) {
		//TODO: implement
	}

	/**
	 * Frees memory that is used to store the BitmapData object.
	 */
	public void dispose() {
		//TODO: implement
	}

	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer. 
	 * @param source
	 */
	public void draw (IBitmapDrawable source) {
		draw(source, null, null, null, null, false);
	}
	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer.
	 * @param source
	 * @param matrix
	 */
	public void draw(IBitmapDrawable source, Matrix matrix) {
		draw(source, matrix, null, null, null, false);
	}
	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer.
	 * @param source
	 * @param matrix
	 * @param colorTransform
	 */
	public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform) {
		draw(source, matrix, colorTransform, null, null, false);
	}
	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer.
	 * @param source
	 * @param matrix
	 * @param colorTransform
	 * @param blendMode
	 */
	public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, String blendMode) {
		draw(source, matrix, colorTransform, blendMode, null, false);
	}
	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer.
	 * @param source
	 * @param matrix
	 * @param colorTransform
	 * @param blendMode
	 * @param clipRect
	 */
	public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, String blendMode, Rectangle clipRect) {
		draw(source, matrix, colorTransform, blendMode, clipRect, false);
	}
	/**
	 * Draws the source display object onto the bitmap image, using the Flash Player vector renderer.
	 * @param source
	 * @param matrix
	 * @param colorTransform
	 * @param blendMode
	 * @param clipRect
	 * @param smoothing
	 */
	public void draw(IBitmapDrawable source, Matrix matrix, ColorTransform colorTransform, String blendMode, Rectangle clipRect, boolean smoothing) {
		//TODO: implement
	}

	/**
	 * Fills a rectangular area of pixels with a specified ARGB color.
	 * @param rect
	 * @param color
	 */
	public void fillRect(Rectangle rect, int color) {
		//TODO: implement
	}

	/**
	 * Performs a flood fill operation on an image starting at a (x, y) coordinate.
	 * @param x
	 * @param y
	 * @param color
	 */
	public void floodFill(int x, int y, int color) {
		//TODO: implement
	}

	/**
	 * Determines the destination rectangle that will be affected by the applyFilter() call.
	 * @param sourceRect
	 * @param filter
	 * @return
	 */
	public Rectangle generateFilterRect(Rectangle sourceRect, BitmapFilter filter) {
		//TODO: implement
		return null;
	}

	/**
	 * Determines a rectangular region that either fully encloses all pixels of a specified color within the bitmap image (if the findColor parameter is set to true) or fully encloses all pixels that do not include the specified color (if the findColor parameter is set to false).
	 * @param mask
	 * @param color
	 * @return
	 */
	public Rectangle getColorBoundsRect(int mask, int color) {
		return getColorBoundsRect(mask, color, false);
	}
	/**
	 * Determines a rectangular region that either fully encloses all pixels of a specified color within the bitmap image (if the findColor parameter is set to true) or fully encloses all pixels that do not include the specified color (if the findColor parameter is set to false).
	 * @param mask
	 * @param color
	 * @param findColor
	 * @return
	 */
	public Rectangle getColorBoundsRect(int mask, int color, boolean findColor) {
		//TODO: implement
		return null;
	}

	/**
	 * Returns an integer representing a RGB pixel value from a BitmapData object at a specific point.
	 * @param x
	 * @param y
	 * @return
	 */
	public int getPixel(int x, int y) {
		//TODO: implement
		return 0;
	}

	/**
	 * Returns an ARGB color value that contains alpha channel data and RGB data.
	 * @param x
	 * @param y
	 * @return
	 */
	public int getPixel32(int x, int y) {
		//TODO: implement
		return 0;
	}

	/**
	 * Generates a byte array from a rectangular region of pixel data.
	 * @param rect
	 * @return
	 */
	public ByteArray getPixels(Rectangle rect) {
		//TODO: implement
		return null;
	}

	/**
	 * Performs pixel-level hit detection between one bitmap image and a point, rectangle, or other bitmap image.
	 * @param firstPoint
	 * @param firstAlphaThreshold
	 * @param secondObject
	 * @return
	 */
	public boolean hitTest(Point firstPoint, int firstAlphaThreshold, Object secondObject) {
		return hitTest(firstPoint, firstAlphaThreshold, secondObject, null, 1);
	}
	/**
	 * Performs pixel-level hit detection between one bitmap image and a point, rectangle, or other bitmap image.
	 * @param firstPoint
	 * @param firstAlphaThreshold
	 * @param secondObject
	 * @param secondBitmapDataPoint
	 * @return
	 */
	public boolean hitTest(Point firstPoint, int firstAlphaThreshold, Object secondObject, Point secondBitmapDataPoint) {
		return hitTest(firstPoint, firstAlphaThreshold, secondObject, secondBitmapDataPoint, 1);
	}
	/**
	 * Performs pixel-level hit detection between one bitmap image and a point, rectangle, or other bitmap image.
	 * @param firstPoint
	 * @param firstAlphaThreshold
	 * @param secondObject
	 * @param secondBitmapDataPoint
	 * @param secondAlphaThreshold
	 * @return
	 */
	public boolean hitTest(Point firstPoint, int firstAlphaThreshold, Object secondObject, Point secondBitmapDataPoint, int secondAlphaThreshold) {
		return false;
	}

	/**
	 * Locks an image so that any objects that reference the BitmapData object, such as Bitmap objects, are not updated when this BitmapData object changes.
	 */
	public void lock() {
		//TODO: implement
	}

	/**
	 * Performs per-channel blending from a source image to a destination image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param redMultiplier
	 * @param greenMultiplier
	 * @param blueMultiplier
	 * @param alphaMultiplier
	 */
	public void merge (BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int redMultiplier, int greenMultiplier, int blueMultiplier, int alphaMultiplier) {
		//TODO: implement
	}

	/**
	 * Fills an image with pixels representing random noise.
	 * @param randomSeed
	 */
	public void noise (int randomSeed) {
		noise(randomSeed, 0, 255, 7, false);
	}
	/**
	 * Fills an image with pixels representing random noise.
	 * @param randomSeed
	 * @param low
	 */
	public void noise (int randomSeed, int low) {
		noise(randomSeed, low, 255, 7, false);
	}
	/**
	 * Fills an image with pixels representing random noise.
	 * @param randomSeed
	 * @param low
	 * @param high
	 */
	public void noise (int randomSeed, int low, int high) {
		noise(randomSeed, low, high, 7, false);
	}
	/**
	 * Fills an image with pixels representing random noise.
	 * @param randomSeed
	 * @param low
	 * @param high
	 * @param channelOptions
	 */
	public void noise(int randomSeed, int low, int high, int channelOptions) {
		noise(randomSeed, low, high, channelOptions, false);
	}
	/**
	 * Fills an image with pixels representing random noise.
	 * @param randomSeed
	 * @param low
	 * @param high
	 * @param channelOptions
	 * @param grayScale
	 */
	public void noise(int randomSeed, int low, int high, int channelOptions, boolean grayScale) {
		//TODO: implement
	}

	/**
	 * Remaps the color channel values in an image that has up to four arrays of color palette data, one for each channel.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 */
	public void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) {
		paletteMap(sourceBitmapData, sourceRect, destPoint, new int[0], new int[0], new int[0], new int[0]);
	}
	/**
	 * Remaps the color channel values in an image that has up to four arrays of color palette data, one for each channel.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param redArray
	 */
	public void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray) {
		paletteMap(sourceBitmapData, sourceRect, destPoint, redArray, new int[0], new int[0], new int[0]);
	}
	/**
	 * Remaps the color channel values in an image that has up to four arrays of color palette data, one for each channel.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param redArray
	 * @param greenArray
	 */
	public void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray, int[] greenArray) {
		paletteMap(sourceBitmapData, sourceRect, destPoint, redArray, greenArray, new int[0], new int[0]);
	}
	/**
	 * Remaps the color channel values in an image that has up to four arrays of color palette data, one for each channel.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param redArray
	 * @param greenArray
	 * @param blueArray
	 */
	public void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray, int[] greenArray, int[] blueArray) {
		paletteMap(sourceBitmapData, sourceRect, destPoint, redArray, greenArray, blueArray, new int[0]);
	}
	/**
	 * Remaps the color channel values in an image that has up to four arrays of color palette data, one for each channel.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param redArray
	 * @param greenArray
	 * @param blueArray
	 * @param alphaArray
	 */
	public void paletteMap(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int[] redArray, int[] greenArray, int[] blueArray, int[] alphaArray) {
		//TODO: implement
	}

	/**
	 * Generates a Perlin noise image.
	 * @param baseX
	 * @param baseY
	 * @param numOctaves
	 * @param randomSeed
	 * @param stitch
	 * @param fractalNoise
	 */
	public void perlinNoise(double baseX, double baseY, int numOctaves, int randomSeed, boolean stitch, boolean fractalNoise) {
		perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch, fractalNoise, 7, false, new int[0]);
	}
	/**
	 * Generates a Perlin noise image.
	 * @param baseX
	 * @param baseY
	 * @param numOctaves
	 * @param randomSeed
	 * @param stitch
	 * @param fractalNoise
	 * @param channelOptions
	 */
	public void perlinNoise(double baseX, double baseY, int numOctaves, int randomSeed, boolean stitch, boolean fractalNoise, int channelOptions) {
		perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch, fractalNoise, channelOptions, false, new int[0]);
	}
	/**
	 * Generates a Perlin noise image.
	 * @param baseX
	 * @param baseY
	 * @param numOctaves
	 * @param randomSeed
	 * @param stitch
	 * @param fractalNoise
	 * @param channelOptions
	 * @param grayScale
	 */
	public void perlinNoise(double baseX, double baseY, int numOctaves, int randomSeed, boolean stitch, boolean fractalNoise, int channelOptions, boolean grayScale) {
		perlinNoise(baseX, baseY, numOctaves, randomSeed, stitch, fractalNoise, channelOptions, grayScale, new int[0]);
	}
	/**
	 * Generates a Perlin noise image.
	 * @param baseX
	 * @param baseY
	 * @param numOctaves
	 * @param randomSeed
	 * @param stitch
	 * @param fractalNoise
	 * @param channelOptions
	 * @param grayScale
	 * @param offsets
	 */
	public void perlinNoise(double baseX, double baseY, int numOctaves, int randomSeed, boolean stitch, boolean fractalNoise, int channelOptions, boolean grayScale, int[] offsets) {
		//TODO: implement
	}

	/**
	 * Performs a pixel dissolve either from a source image to a destination image or by using the same image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @return
	 */
	public int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint) {
		return pixelDissolve(sourceBitmapData, sourceRect, destPoint, 0, 0, 0);
	}
	/**
	 * Performs a pixel dissolve either from a source image to a destination image or by using the same image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param randomSeed
	 * @return
	 */
	public int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed) {
		return pixelDissolve(sourceBitmapData, sourceRect, destPoint, randomSeed, 0, 0);
	}
	/**
	 * Performs a pixel dissolve either from a source image to a destination image or by using the same image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param randomSeed
	 * @param numPixels
	 * @return
	 */
	public int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed, int numPixels) {
		return pixelDissolve(sourceBitmapData, sourceRect, destPoint, randomSeed, numPixels, 0);
	}
	/**
	 * Performs a pixel dissolve either from a source image to a destination image or by using the same image.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param randomSeed
	 * @param numPixels
	 * @param fillColor
	 * @return
	 */
	public int pixelDissolve(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, int randomSeed, int numPixels, int fillColor) {
		//TODO: implement
		return 0;
	}

	/**
	 * Scrolls an image by a certain (x, y) pixel amount.
	 * @param x
	 * @param y
	 */
	public void scroll(int x, int y) {
		//TODO:implement
	}

	/**
	 * Sets a single pixel of a BitmapData object.
	 * @param x
	 * @param y
	 * @param color
	 */
	public void setPixel(int x, int y, int color) {
		//TODO: implement
	}

	/**
	 * Sets the color and alpha transparency values of a single pixel of a BitmapData object.
	 * @param x
	 * @param y
	 * @param color
	 */
	public void setPixel32(int x, int y, int color) {
		//TODO: implement
	}

	/**
	 * Converts a byte array into a rectangular region of pixel data.
	 * @param rect
	 * @param inputByteArray
	 */
	public void setPixels(Rectangle rect, ByteArray inputByteArray) {
		//TODO: implement
	}

	/**
	 * Tests pixel values in an image against a specified threshold and sets pixels that pass the test to new color values.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param operation
	 * @param threshold
	 * @return
	 */
	public int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operation, int threshold) {
		return threshold(sourceBitmapData, sourceRect, destPoint, operation, threshold, 0, 2147483647, false);
	}
	/**
	 * Tests pixel values in an image against a specified threshold and sets pixels that pass the test to new color values.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param operation
	 * @param threshold
	 * @param color
	 * @return
	 */
	public int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operation, int threshold, int color) {
		//TODO: double check implementation of default value -- Flash uses unsigned int, thus 4294967295
		//threshold(sourceBitmapData, sourceRect, destPoint, operation, threshold, 0, 4294967295, false);
		return threshold(sourceBitmapData, sourceRect, destPoint, operation, threshold, color, 2147483647, false);
	}
	/**
	 * Tests pixel values in an image against a specified threshold and sets pixels that pass the test to new color values.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param operation
	 * @param threshold
	 * @param color
	 * @param mask
	 * @return
	 */
	public int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operation, int threshold, int color, int mask) {
		return threshold(sourceBitmapData, sourceRect, destPoint, operation, threshold, color, mask, false);
	}
	/**
	 * Tests pixel values in an image against a specified threshold and sets pixels that pass the test to new color values.
	 * @param sourceBitmapData
	 * @param sourceRect
	 * @param destPoint
	 * @param operation
	 * @param threshold
	 * @param color
	 * @param mask
	 * @param copySource
	 * @return
	 */
	public int threshold(BitmapData sourceBitmapData, Rectangle sourceRect, Point destPoint, String operation, int threshold, int color, int mask, boolean copySource) {
		//TODO: implement
		return 0;
	}

	/**
	 * Unlocks an image so that any objects that reference the BitmapData object, such as Bitmap objects, are updated when this BitmapData object changes. 
	 */
	public void unlock() {
		unlock(null);
	}
	/**
	 * Unlocks an image so that any objects that reference the BitmapData object, such as Bitmap objects, are updated when this BitmapData object changes. 
	 * @param changeRect
	 */
	public void unlock(Rectangle changeRect) {
		//TODO: implement
	}
}
