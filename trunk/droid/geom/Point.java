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

import droid.misc.Angle;
import android.graphics.PointF;

/**
 * flash.geom.Point implementation
 * @author Mj Mendoza IV
 * 
 * The Point object represents a location in a two-dimensional coordinate system, where x represents the horizontal axis and y represents the vertical axis.
 */
public class Point {
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double x;
		/**
		 * Returns he horizontal coordinate of the point.
		 */
		public double getX() {
			setX(x);
			return x;
		}
		/**
		 * Sets the horizontal coordinate of the point.
		 */
		public void setX(double x) {
			this.x = x;
			getLength();
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setY()
	 * @see droid.geom.Point.getY()
	 */
	public double y;
		/**
		 * Returns the vertical coordinate of the point.
		 */
		public double getY() {
			setY(y);
			return y;
		}
		/**
		 * Sets the vertical coordinate of the point.
		 */
		public void setY(double y) {
			this.y = y; 
			getLength();
		}
		
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setLength()
	 * @see droid.geom.Point.getLength()
	 */
	public double length;
		/**
		 * Sets the length of the line segment from (0,0) to this point.
		 * @param length
		 */
		public void setLength(double length) {
			Point tmp = Point.polar(getLength(), Angle.getAngleByDegrees(getX(), getY()));
			this.setX(tmp.x);
			this.setY(tmp.y);
		}
		/**
		 * Returns the length of the line segment from (0,0) to this point.
		 */
		public double getLength() {
			length = PointF.length((float) x, (float) y); 
			return length;
		}
	
	/**
	 * Creates a new point.
	 */
	public Point() {
		setX(0);
		setX(0);
	}
	/**
	 * Creates a new point.
	 */
	public Point(double x) {
		setX(x);
		setX(0);
	}
	/**
	 * Creates a new point.
	 */
	public Point(double x, double y) {
		setX(x);
		setX(y);
	}
	
	/**
	 * Adds the coordinates of another point to the coordinates of this point to create a new point.
	 * @param v
	 * @return
	 */
	public Point add(Point v) {
		return new Point(x + v.x, y + v.y);
	}

	/**
	 * Creates a copy of the Point object.
	 */
	public Point clone() {
		return new Point(x, y);
	}
	
	/**
	 *  Returns the distance between pt1 and pt2.
	 * @param pt1
	 * @param pt2
	 * @return
	 */
	public static double distance(Point pt1, Point pt2) {
		return PointF.length((float) (pt2.x - pt1.x), (float) (pt2.y - pt1.y));
	}

	/**
	 *  Determines whether two points are equal.
	 * @param toCompare
	 * @return
	 */
	public boolean equals(Point toCompare) {
		return (getX() == toCompare.x && getY() == toCompare.y) ? true : false;
	}
	
	/**
	 * Determines a point between two specified points.
	 * @param pt1
	 * @param pt2
	 * @param f
	 * @return
	 */
	public static Point interpolate(Point pt1, Point pt2, double f) {
		return Point.polar(f, Angle.getAngleByDegrees(pt2.x - pt1.x, pt2.y - pt1.y));
	}
	
	/**
	 *  Scales the line segment between (0,0) and the current point to a set length.
	 * @param thickness
	 */
	public void normalize(double thickness) {
		setLength(thickness);
	}
	
	/**
	 *  Offsets the Point object by the specified amount.
	 * @param dx
	 * @param dy
	 */
	public void offset(double dx, double dy) {
		Point tmp = add(new Point(dx, dy));
		setX(tmp.x);
		setY(tmp.y);
	}
	
	/**
	 * Converts a pair of polar coordinates to a Cartesian point coordinate.
	 * @param len
	 * @param angle
	 * @return
	 */
	public static Point polar(double len, double angle) {
		Point tmp = new Point();
		tmp.setX(Math.cos(angle) * len);
		tmp.setY(Math.sin(angle) * len);
		return tmp;
	}
	/**
	 * Subtracts the coordinates of another point from the coordinates of this point to create a new point.
	 * @param v
	 * @return
	 */
	public Point subtract(Point v) {
		return new Point(getX() - v.x, getY() - v.y);
	}
	
	/**
	 * Returns a string that contains the values of the x and y coordinates.
	 */
	public String toString() {
		return "(x=" + getX() + ", y= " + getY() + ")";
	}
}