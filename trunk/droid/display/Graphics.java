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

import droid.geom.Matrix;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Paint;

/**
* flash.display.Graphics implementation
* @author Mj Mendoza IV
* 
* The Graphics class contains a set of methods that you can use to create a vector shape.
*
* beginGradientFill(type, colors, alphas, ratios, matrix, spreadMethod, interpolation, focalPointRatio);
* clear();
* curveTo(ctlX, ctlY, ancX, ancY);
* drawRoundRect(x, y, w, h, ellipseWidth, ellipseHeight);
* drawRoundRectComplex(x , y ,w, h, topLeftRadius, topRightRadius, bottomLeftRadius, bottomRightRadius);
* lineGradientStyle();
* lineStyle();
*/
public class Graphics extends Canvas {
    protected Canvas canvas;
    protected Paint paint;
    protected Paint linePaint;
   
    protected double startX;
    protected double startY;
    
    /**
     * Begins a bitmap filled shape.
     * @param bitmap
     */
    public void beginBitmapFill(BitmapData bitmap) {
    	beginBitmapFill(bitmap, null, true, false);
    }
    /**
     * Begins a bitmap filled shape.
     * @param bitmap
     * @param matrix
     */
    public void beginBitmapFill(BitmapData bitmap, Matrix matrix) {
    	beginBitmapFill(bitmap, matrix, true, false);
    }
    /**
     * Begins a bitmap filled shape.
     * @param bitmap
     * @param matrix
     * @param repeat
     */
    public void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat) {
    	beginBitmapFill(bitmap, matrix, repeat, false);
    }
    /**
     * Begins a bitmap filled shape.
     * @param bitmap
     * @param matrix
     * @param repeat
     * @param smooth
     */
    public void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) {
    	//TODO: implement
    }
    
    /**
     * Specifies a single-color fill.
     * @param color
     * @param alpha
     */
    public void beginFill(int color, double alpha) {
        paint.setColor(color);
        setAlpha(alpha);
    }
    
    /**
     * Specifies a gradient fill.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     */
    public void beginGradientFill(String type, int[] colors, int[] alphas, int[] ratios) {
    	beginGradientFill(type, colors, alphas, ratios, null, "pad", "rgb", 0);
    }
    /**
     * Specifies a gradient fill.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     */
    public void beginGradientFill(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix) {
    	beginGradientFill(type, colors, alphas, ratios, matrix, "pad", "rgb", 0);
    }
    /**
     * Specifies a gradient fill.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     */
    public void beginGradientFill(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod) {
    	beginGradientFill(type, colors, alphas, ratios, matrix, spreadMethod, "rgb", 0);
    }
    /**
     * Specifies a gradient fill.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     * @param interpolation
     */
    public void beginGradientFill(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod, String interpolation) {
    	beginGradientFill(type, colors, alphas, ratios, matrix, spreadMethod, interpolation, 0);
    }
    /**
     * Specifies a gradient fill.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     * @param interpolation
     * @param focalPointRatio
     */
    public void beginGradientFill(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod, String interpolation, double focalPointRatio) {
        //TODO: implement
    }
    
    /**
     * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
     */
    public void clear() {
        //TODO: implement
    }
    
    /**
     * Draws a curve from the current drawing position to (anchorX, anchorY) using the control point specified by (controlX, controlY).
     * @param controlX
     * @param controlY
     * @param anchorX
     * @param anchorY
     */
    public void curveTo(double controlX, double controlY, double anchorX, double anchorY) {
        double startAngle = 0.0;
        double sweepAngle = 0.0;
        canvas.drawArc(new RectF((float) startX, (float) startY, (float) (controlX - startX), (float) (controlY - startY)), (float) startAngle, (float) sweepAngle, false, paint);
    }
    
    /**
     * Draws a circle.
     * @param x
     * @param y
     * @param radius
     */
    public void drawCircle(double x, double y, double radius) {
        canvas.drawCircle((float) x, (float) y, (float) radius, linePaint);
    }
    
    /**
     * Draws an ellipse.
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void drawEllipse(double x, double y, double width, double height) {
        canvas.drawOval(new RectF((float) x, (float) y, (float) (x + width), (float) (y + height)), paint);
    }
    
    /**
     * Draws a round rectangle.
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void drawRect(double x, double y, double width, double height) {
        canvas.drawRect(new RectF((float) x, (float) y, (float) (x + width), (float) (y + height)), paint);
        moveTo(x, y);
        lineTo(x + width, y);
        lineTo(x + width, y + height);
        lineTo(x, y + height);
        lineTo(x, y);
    }
    
    /**
     * Draws a round rectangle.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param ellipseWidth
     */
    public void drawRoundRect(double x, double y, double width, double height, double ellipseWidth) {
    	drawRoundRect(x, y, width, height, ellipseWidth, 0);
    }
    /**
     * Draws a round rectangle.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param ellipseWidth
     * @param ellipseHeight
     */
    public void drawRoundRect(double x, double y, double width, double height, double ellipseWidth, double ellipseHeight) {
    	//TODO: implement
    }
    
    public void drawRoundRectComplex(double x, double y, double width, double height, double topLeftRadius, double topRightRadius, double bottomLeftRadius, double bottomRightRadius) {
        //TODO: implement
    }
    
    /**
     * Applies a fill to the lines and curves.
     */
    public void endFill() {
        setAlpha(0);
        moveTo(0, 0);
    }
    
    /**
     * Specifies a gradient to use for the stroke when drawing lines.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     */
    public void lineGradientStyle(String type, int[] colors, int[] alphas, int[] ratios) {
        lineGradientStyle(type, colors, alphas, ratios, null, "pad", "rgb", 0);
    }
    /**
     * Specifies a gradient to use for the stroke when drawing lines.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     */
    public void lineGradientStyle(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix) {
    	lineGradientStyle(type, colors, alphas, ratios, matrix, "pad", "rgb", 0);
    }
    /**
     * Specifies a gradient to use for the stroke when drawing lines.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     */
    public void lineGradientStyle(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod) {
    	lineGradientStyle(type, colors, alphas, ratios, matrix, spreadMethod, "rgb", 0);
    }
    /**
     * Specifies a gradient to use for the stroke when drawing lines.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     * @param interpolationMethod
     */
    public void lineGradientStyle(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod, String interpolationMethod) {
    	lineGradientStyle(type, colors, alphas, ratios, matrix, spreadMethod, interpolationMethod, 0);
    }
    /**
     * Specifies a gradient to use for the stroke when drawing lines.
     * @param type
     * @param colors
     * @param alphas
     * @param ratios
     * @param matrix
     * @param spreadMethod
     * @param interpolationMethod
     * @param focalPointRatio
     */
    public void lineGradientStyle(String type, int[] colors, int[] alphas, int[] ratios, Matrix matrix, String spreadMethod, String interpolationMethod, double focalPointRatio) {
    	//TODO: implement
    }
   
    /**
     * Specifies a line style that Flash uses for drawing lines.
     */
    public void lineStyle() {
    	lineStyle(0, 0, 1, false, "normal", null, null, 3);
    }
    /**
     * Specifies a line style that Flash uses for drawing lines.
     * @param thickness
     */
    public void lineStyle(double thickness) {
    	lineStyle(thickness, 0, 1, false, "normal", null, null, 3);
    }
    /**
     * Specifies a line style that Flash uses for drawing lines.
     * @param thickness
     * @param color
     */
    public void lineStyle(double thickness, int color) {
    	lineStyle(thickness, color, 1, false, "normal", null, null, 3);
    }
    /**
     * Specifies a line style that Flash uses for drawing lines.
     * @param thickness
     * @param color
     * @param alpha
     */
    public void lineStyle(double thickness, int color, double alpha) {
    	lineStyle(thickness, color, alpha, false, "normal", null, null, 3);
    }
    /**
     * Specifies a line style that Flash uses for drawing lines.
     * @param thickness
     * @param color
     * @param alpha
     * @param pixelHinting
     */
	public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting) {
		lineStyle(thickness, color, alpha, pixelHinting, "normal", null, null, 3);
	}
	/**
	 * Specifies a line style that Flash uses for drawing lines.
	 * @param thickness
	 * @param color
	 * @param alpha
	 * @param pixelHinting
	 * @param scaleMode
	 */
	public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode) {
		lineStyle(thickness, color, alpha, pixelHinting, scaleMode, null, null, 3);
	}
	/**
	 * Specifies a line style that Flash uses for drawing lines.
	 * @param thickness
	 * @param color
	 * @param alpha
	 * @param pixelHinting
	 * @param scaleMode
	 * @param caps
	 */
	public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode, String caps) {
		lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps, null, 3);
	}
	/**
	 * Specifies a line style that Flash uses for drawing lines.
	 * @param thickness
	 * @param color
	 * @param alpha
	 * @param pixelHinting
	 * @param scaleMode
	 * @param caps
	 * @param joints
	 */
	public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode, String caps, String joints) {
		lineStyle(thickness, color, alpha, pixelHinting, scaleMode, caps, joints, 3);
	}
	/**
	 * Specifies a line style that Flash uses for drawing lines.
	 * @param thickness
	 * @param color
	 * @param alpha
	 * @param pixelHinting
	 * @param scaleMode
	 * @param caps
	 * @param joints
	 * @param miterLimit
	 */
	public void lineStyle(double thickness, int color, double alpha, boolean pixelHinting, String scaleMode, String caps, String joints, double miterLimit) {
	    //TODO: implement
		linePaint.setColor(color);
    	linePaint.setAlpha((int) alpha);
    	//linePaint.setStrokeCap();
    	//linePaint.setStrokeJoin(joints);
    }
   
    /**
     * Draws a line from the current drawing position to (x, y).
     * @param x
     * @param y
     */
	public void lineTo(double x, double y) {
        canvas.drawLine((float) startX, (float) startY, (float) x, (float) y, linePaint);
    }
   
    /**
     * Moves the current drawing position to (x, y).
     * @param x
     * @param y
     */
	public void moveTo(double x, double y) {
        startX = x;
        startY = y;
    }
    
	    protected void setAlpha(double alpha) {
	        if (alpha > 1.0f) {
	            alpha = 1.0f;
	        } else if (alpha < 0.0f){
	            alpha = 0.0f;
	        }
	        paint.setAlpha((int) (alpha * 100));
	    }
    
}