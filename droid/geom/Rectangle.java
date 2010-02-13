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
import droid.geom.Rectangle;

/**
 * flash.geom.Rectangle implementation
 * @author Mj Mendoza IV
 * 
 * A Rectangle object is an area defined by its position, as indicated by its top-left corner point (x, y) and by its width and its height.
 */
public class Rectangle {
	/**
	 * Creates a new Rectangle object with the top-left corner specified by the x and y parameters and with the specified width and height.
	 */
	public Rectangle() {
		setEmpty();
	}
	/**
	 * Creates a new Rectangle object with the top-left corner specified by the x.
	 * @param x
	 */
	public Rectangle(double x) {
		setEmpty();
		this.x = x;
	}
	/**
	 * Creates a new Rectangle object with the top-left corner specified by the x and y parameters.
	 * @param x
	 * @param y
	 */
	public Rectangle(double x, double y) {
		setEmpty();
		this.x = x;
		this.y = y;
	}
	/**
	 * Creates a new Rectangle object with the top-left corner specified by the x and y parameters and with the specified width.
	 * @param x
	 * @param y
	 * @param width
	 */
	public Rectangle(double x, double y, double width) {
		setEmpty();
		this.x = x;
		this.y = y;
		this.width = width;
	}
	/**
	 * Creates a new Rectangle object with the top-left corner specified by the x and y parameters and with the specified width and height.
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * The height of the rectangle, in pixels.
	 */
	public double height;
	/**
	 * The width of the rectangle, in pixels.
	 */
	public double width;
	/**
	 * The x coordinate of the top-left corner of the rectangle.
	 */
	public double x;
	/**
	 * The y coordinate of the top-left corner of the rectangle.
	 */
	public double y;

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setBottom()
	 * @see droid.geom.Rectangle.getBottom()
	 */
	public double bottom;
		/**
		 * Returns the sum of the y and height properties.
		 * @return
		 */
		public double getBottom() {
			setBottom(height + y);
			return bottom;
		}
		/**
		 * Sets the sum of the y and height properties.
		 * @param value
		 */
		public void setBottom(double value) {
			if (value < y) { value = y; }
			height = value - y;
			bottom = value;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setBottomRight()
	 * @see droid.geom.Rectangle.getBottomRight()
	 */
	public Point bottomRight;
		/**
		 * Returns the location of the Rectangle object's bottom-right corner, determined by the values of the right and bottom properties.
		 * @return
		 */
		public Point getBottomRight() {
			setBottomRight(new Point(right, bottom));
			return bottomRight;
		}
		/**
		 * Sets the location of the Rectangle object's bottom-right corner, determined by the values of the right and bottom properties. 
		 * @param value
		 */
		public void setBottomRight(Point value) {
			setRight(value.x);
			setBottom(value.y);
			bottomRight = new Point(right, bottom);
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setLeft()
	 * @see droid.geom.Rectangle.getLeft()
	 */
	public double left;
		/**
		 * Returns the x coordinate of the top-left corner of the rectangle.
		 * @return
		 */
		public double getLeft() {
			setLeft(x);
			return left;
		}
		/**
		 * Sets the x coordinate of the top-left corner of the rectangle.
		 * @param value
		 */
		public void setLeft(double value) {
			if (value > width) { value = width; }
			double xx = 0;
			if (x > value) {
				xx = x - value;
			}
			x = value;
			width += xx;
			left = x;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setRight()
	 * @see droid.geom.Rectangle.getRight()
	 */
	public double right;
		/**
		 * Returns the sum of the x and width properties.
		 * @return
		 */
		public double getRight() {
			setRight(x + width);
			return right;
		}
		/**
		 * Sets the sum of the x and width properties.
		 * @param value
		 */
		public void setRight(double value) {
			if (value < x) { value = x; }
			width = value - x;
			right = x + width;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setSize()
	 * @see droid.geom.Rectangle.getSize()
	 */
	public Point size;
		/**
		 * The size of the Rectangle object, expressed as a Point object with the values of the width and height properties.
		 * @return
		 */
		public Point getSize() {
			setSize(new Point(width, height));
			return size;
		}
		/**
		 * The size of the Rectangle object, expressed as a Point object with the values of the width and height properties.
		 * @param value
		 */
		public void setSize(Point value) {
			width = value.x;
			height = value.y;
			size = new Point(width, height);
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setTop()
	 * @see droid.geom.Rectangle.getTop()
	 */
	public double top;
		/**
		 * Returns the y coordinate of the top-left corner of the rectangle.
		 * @return
		 */
		public double getTop() {
			setTop(y);
			return y;
		}
		/**
		 * Sets the y coordinate of the top-left corner of the rectangle.
		 * @param value
		 */
		public void setTop(double value) {
			if (value > height) { value = height; }
			double yy = 0;
			if (y > value) {
				yy = y - value;
			}
			y = value;
			height += yy;
			top = y;


			height -= (value - y);
			y = value;
			top = y; 
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Rectangle.setTopLeft()
	 * @see droid.geom.Rectangle.getTopLeft()
	 */
	public Point topLeft;
		/**
		 * Return the location of the Rectangle object's top-left corner, determined by the x and y coordinates of the point.
		 * @return
		 */
		public Point getTopLeft() {
			setTopLeft(new Point(x, y));
			return topLeft;
		}
		/**
		 * Sets the location of the Rectangle object's top-left corner, determined by the x and y coordinates of the point.
		 * @param value
		 */
		public void setTopLeft(Point value) {
			x = value.x;
			y = value.y;
			topLeft = value;
		}

	/**
	 * Returns a copy of this Rectangle object.
	 */
	public Rectangle clone() {
		return new Rectangle(this.x, this.y, this.width, this.height);
	}

	/**
	 * Determines if the specified point is contained within the rectangular region.
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(double x, double y) {
		return (this.x < x && this.y < y && (this.x + this.width) > x && (this.y + this.height) > y);
	}

	/**
	 * Determines if the specified point is contained within the rectangular region defined by this Rectangle object using a Point object as a parameter.
	 * @param point
	 * @return
	 */
	public boolean containsPoint(Point point) {
		return contains(point.x, point.y);
	}

	/**
	 * Determines if the Rectangle object specified by the rect parameter is contained within this Rectangle object.
	 * @param rect
	 * @return
	 */
	public boolean containsRect(Rectangle rect) {
		return (contains(rect.x, rect.y)
					&& contains(rect.x + rect.width, rect.y)
					&& contains(rect.x + rect.width, rect.y + rect.height)
					&& contains(rect.x, rect.y + rect.height));
	}

	/**
	 * Determines if the object specified in the toCompare parameter is equal to this Rectangle object.
	 * @param toCompare
	 * @return
	 */
	public boolean equals(Rectangle toCompare) {
		return (this.x == toCompare.x
					&& this.y == toCompare.y
					&& this.width == toCompare.width
					&& this.height == toCompare.height);
	}

	/**
	 * Increases the size of the Rectangle object by the specified amounts, in pixels.
	 * @param dx
	 * @param dy
	 */
	public void inflate(double dx, double dy) {
		this.x -= dx;
		this.y -= dy;
		this.width += (dx * 2);
		this.height += (dy * 2);
	}

	/**
	 * Increases the size of the Rectangle object using a Point object as a parameter.
	 * @param point
	 */
	public void inflatePoint(Point point) {
		inflate(point.x, point.y);
	}

	/**
	 * Returns the area of intersection.
	 * @param toIntersect
	 * @return
	 */
	public Rectangle intersection(Rectangle toIntersect) {
		Rectangle tmp = new Rectangle();
		
		tmp.x = (this.x > toIntersect.x) ? this.x : toIntersect.x;
		tmp.y = (this.y > toIntersect.y) ? this.y : toIntersect.y;
		tmp.width = ((this.x + this.width) < (toIntersect.x + toIntersect.width)) ? (this.x + this.width - tmp.x) : (toIntersect.x + toIntersect.width - tmp.x);
		tmp.height = ((this.y + this.height) < (toIntersect.y + toIntersect.height)) ? (this.y + this.height - tmp.y) : (toIntersect.y + toIntersect.height - tmp.y);
		
		return tmp;
	}

	/**
	 * Determines if the object specified in the toIntersect parameter intersects with this Rectangle object.
	 * @param toIntersect
	 * @return
	 */
	public boolean intersects(Rectangle toIntersect) {
		return (containsPoint(toIntersect.topLeft)
				|| contains(toIntersect.x + toIntersect.width, toIntersect.y)
				|| contains(toIntersect.x + toIntersect.width, toIntersect.y + toIntersect.height)
				|| contains(toIntersect.x, toIntersect.y + toIntersect.height));
	}

	/**
	 * Determines whether or not this Rectangle object is empty.
	 * @return
	 */
	public boolean isEmpty() {
		return this.equals(new Rectangle());
	}

	/**
	 * Adjusts the location of the Rectangle object.
	 * @param dx
	 * @param dy
	 */
	public void offset(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	

	/**
	 * Adjusts the location of the Rectangle object using a Point object as a parameter.
	 * @param point
	 */
	public void offsetPoint(Point point) {
		offset(point.x, point.y);
	}
	

	/**
	 * Sets all properties to 0.
	 */
	public void setEmpty() {
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		getTopLeft();
		getBottomRight();
	}
	

	/**
	 * Builds and returns a string that lists the horizontal and vertical positions and the width and height of the Rectangle object.
	 */
	public String toString() {
		return "(x=" + this.x + ", y=" + this.y + ", w=" + this.width + ", h=" + this.height + ")";
	}
	
	
	/**
	 * Adds two rectangles together to create a new Rectangle object.
	 * @param toUnion
	 * @return
	 */
	public Rectangle union(Rectangle toUnion) {
		Rectangle tmp = this.clone();
		double xx = 0;
		double yy = 0;
		
		if (tmp.x > toUnion.x) {
			xx = this.x - toUnion.x;
			tmp.x = toUnion.x;
		}
		if (tmp.y > toUnion.y) {
			yy = this.y - toUnion.y;
			tmp.y = toUnion.y;
		}
		tmp.width = (tmp.width > toUnion.width) ? tmp.width : toUnion.width;
		tmp.height = (tmp.height > toUnion.height) ? tmp.height : toUnion.height;
		
		tmp.width += xx;
		tmp.height += yy;
		
		return tmp;
	}
}
