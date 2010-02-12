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

package droid.misc;

/**
 * An attempt to implement ActionScript's untyped specifier, '*' -- the asterisk symbol.
 * @author Mj Mendoza IV
 * 
 * The class Any is designed to store 'any' type, one at a time. Similar to
 * 
 * BASIC's  --  Dim XZY As Any
 *   or
 * ActionScript's  --  var XYZ:*;
 */
public class Any {
	protected double doubleValue;
	protected float floatValue;
	protected int intValue;
	protected String stringValue;
	protected boolean booleanValue;
	
	public Any() {
		setValue(false);
	}
	public Any(boolean value) {
		setValue(value);
	}
	public Any(double value) {
		setValue(value);
	}
	public Any(float value) {
		setValue(value);
	}
	public Any(int value) {
		setValue(value);
	}
	public Any(String value) {
		setValue(value);
	}
	
	public void setValue(boolean value) {
		booleanValue = value;
		doubleValue = 0.0;
		floatValue = 0.0f;
		intValue = 0;
		stringValue = "";
	}
	public void setValue(double value) {
		booleanValue = false;
		doubleValue = value;
		floatValue = 0.0f;
		intValue = 0;
		stringValue = "";
	}
	public void setValue(float value) {
		booleanValue = false;
		doubleValue = 0.0;
		floatValue = value;
		intValue = 0;
		stringValue = "";
	}
	public void setValue(int value) {
		booleanValue = false;
		doubleValue = 0.0;
		floatValue = 0.0f;
		intValue = value;
		stringValue = "";
	}
	public void setValue(String value) {
		booleanValue = false;
		doubleValue = 0.0;
		floatValue = 0.0f;
		intValue = 0;
		stringValue = value;
	}
	
	public boolean getValueBoolean() {
		return booleanValue;
	}
	public double getValueDouble() {
		return doubleValue;
	}
	public float getValueFloat() {
		return floatValue;
	}
	public int getValueInt() {
		return intValue;
	}
	public String getValueString() {
		return stringValue;
	}
}
