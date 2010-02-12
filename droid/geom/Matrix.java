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

import droid.geom.Point;

/**
 * flash.geom.Matrix implementation
 * @author Mj Mendoza IV
 * 
 * The Matrix class represents a transformation matrix that determines
 * how to map points from one coordinate space to another.
 */
public class Matrix {
	/**
	 * The value that affects the positioning of pixels along the x axis when scaling or rotating an image.
	 */
	public double a;
	/**
	 * The value that affects the positioning of pixels along the y axis when rotating or skewing an image.
	 */
	public double b;
	/**
	 * The value that affects the positioning of pixels along the x axis when rotating or skewing an image.
	 */
	public double c;
	/**
	 * The value that affects the positioning of pixels along the y axis when scaling or rotating an image.
	 */
	public double d;
	/**
	 * The distance by which to translate each point along the x axis.
	 */
	public double tx;
	/**
	 * The distance by which to translate each point along the y axis.
	 */
	public double ty;
	
	/**
	 * Creates a new two-dimensional Matrix object.
	 */
	public Matrix() {
		this.a = 1;
		this.b = 0;
		this.c = 0;
		this.d = 1;
		this.tx = 0;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 */
	public Matrix(double a) {
		this.a = a;
		this.b = 0;
		this.c = 0;
		this.d = 1;
		this.tx = 0;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 * @param b
	 */
	public Matrix(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = 0;
		this.d = 1;
		this.tx = 0;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 * @param b
	 * @param c
	 */
	public Matrix(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = 1;
		this.tx = 0;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Matrix(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tx = 0;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param tx
	 */
	public Matrix(double a, double b, double c, double d, double tx) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tx = tx;
		this.ty = 0;
	}
	/**
	 * Creates a new two-dimensional Matrix object.
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param tx
	 * @param ty
	 */
	public Matrix(double a, double b, double c, double d, double tx, double ty) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tx = tx;
		this.ty = ty;
	}
	
	/**
	 * Returns a new Matrix object that is a copy of the current matrix.
	 */
	public Matrix clone() {
		return new Matrix(a, b, c, d, tx, ty);
	}
	
	/**
	 * Concatenates a matrix with the current matrix, effectively combining
	 * the geometric effects of the two.
	 */
	public void concat(Matrix m) {
		a = a * m.a + b * m.c;
		b = a * m.b + b * m.d;
		c = c * m.a + d * m.c;
		d = c * m.b + d * m.d;
		tx = tx * m.a + ty * m.c + m.tx;
		ty = tx * m.b + ty * m.d + m.ty;
	}
	
	/**
	 * Creates a Matrix with scaling, rotation, and translation values.
	 * @param scaleX
	 * @param scaleY
	 */
	public void createBox(double scaleX, double scaleY) {
		createBox(scaleX, scaleY, 0, 0, 0);
	}
	/**
	 * Creates a Matrix with scaling, rotation, and translation values.
	 * @param scaleX
	 * @param scaleY
	 * @param rotation
	 */
	public void createBox(double scaleX, double scaleY, double rotation) {
		createBox(scaleX, scaleY, rotation, 0, 0);
	}
	/**
	 * Creates a Matrix with scaling, rotation, and translation values.
	 * @param scaleX
	 * @param scaleY
	 * @param rotation
	 * @param tx
	 */
	public void createBox(double scaleX, double scaleY, double rotation, double tx) {
		createBox(scaleX, scaleY, rotation, tx, 0);
	}
	/**
	 * Creates a Matrix with scaling, rotation, and translation values.
	 * @param scaleX
	 * @param scaleY
	 * @param rotation
	 * @param tx
	 * @param ty
	 */
	public void createBox(double scaleX, double scaleY, double rotation, double tx, double ty) {
		rotate(rotation);
		scale(scaleX, scaleY);
		translate(tx, ty); //weird -- see createBox example in flash.geom.Matrix doc
	}
	
	/**
	 * Creates the specific style of matrix expected by the beginGradientFill() method of the Graphics class.
	 * @param width
	 * @param height
	 * 
	 * @see droid.display.Graphics
	 */
	public void createGradientBox(double width, double height) {
		createGradientBox(width, height, 0, 0, 0);
	}
	/**
	 * Creates the specific style of matrix expected by the beginGradientFill() method of the Graphics class.
	 * @param width
	 * @param height
	 * @param rotation
	 */
	public void createGradientBox(double width, double height, double rotation) {
		createGradientBox(width, height, rotation, 0, 0);
	}
	/**
	 * Creates the specific style of matrix expected by the beginGradientFill() method of the Graphics class.
	 * @param width
	 * @param height
	 * @param rotation
	 * @param tx
	 */
	public void createGradientBox(double width, double height, double rotation, double tx) {
		createGradientBox(width, height, rotation, tx, 0);
	}
	/**
	 * Creates the specific style of matrix expected by the beginGradientFill() method of the Graphics class.
	 * @param width
	 * @param height
	 * @param rotation
	 * @param tx
	 * @param ty
	 */
	public void createGradientBox(double width, double height, double rotation, double tx, double ty) {
		//TODO: implement
		//how to implement width, height
		rotate(rotation);
		translate(tx, ty);
	}
	
	/**
	 * Given a point in the pretransform coordinate space, returns the coordinates of that point after the transformation occurs.
	 */
	public void deltaTransformPoint(Point point) {
		//TODO: implement
	}
	
	/**
	 * Sets each matrix property to a value that causes a null transformation.
	 */
	public void identity() {
		this.a = 1;
		this.b = 0;
		this.c = 0;
		this.d = 1;
		this.tx = 0;
		this.ty = 0;
	}
	
	/**
	 * Performs the opposite transformation of the original matrix.
	 */
	public void invert() {
		a = d / (a *d - b * c);
		b = -b / (a * d - b * c);
		c = -c / (a * d - b * c);
		d = a / (a * d - b * c);
		tx = (c * ty - d * tx) / (a * d - b * c);
		ty = (a * ty - b * tx) / (a * d - b * c);
	}
	
	/**
	 * Applies a rotation transformation to the Matrix object.
	 * @param angle
	 */
	public void rotate(double angle) {
		double sin = Math.sin(angle);
		double cos = Math.cos(angle);
		
		double a = this.a;
		double b = this.b;
		double c = this.c;
		double d = this.d;
		double tx = this.tx;
		double ty = this.ty;
		this.a = a * cos - b * sin;
		this.b = a * sin + b * cos;
		this.c = c * cos - d * sin;
		this.d = c * sin + d * cos;
		this.tx = tx * cos - ty * sin;
		this.ty = tx * sin + ty * cos;
	}
	
	/**
	 * Applies a scaling transformation to the matrix.
	 * @param sx
	 * @param sy
	 */
	public void scale(double sx, double sy) {
		a = a * sx;
		d = d * sy;
		tx = tx * sx;
		ty = ty * sy;
	}
	
	/**
	 * Returns a text value listing the properties of this Matrix object.
	 */
	public String toString() {
		return "(a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", tx=" + tx + ", ty=" + ty + ")";
	}
	
	/**
	 * Returns the result of a geometric transformation to a Point object.
	 * @return
	 */
	public Point transformPoint(Point point) {
		return new Point(this.a * point.x, this.d * point.y);
	}
	
	/**
	 * A transformation that moves an object along the x and y axes.
	 * @param dx
	 * @param dy
	 */
	public void translate(double dx, double dy) {
		tx += dx;
		ty += dy;
	}
}
