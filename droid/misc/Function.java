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

import java.util.ArrayList;

/**
 * Function in ActionScript 3 is not inside any package -- on Java, it needs to be.
 * @author Mj Mendoza IV
 * 
 * A function is the basic unit of code that can be invoked in ActionScript.
 */
public class Function {
	public Function() {
		//
	}
	
	public static int length;

	public int getLength() {
		return length;
	}
	
	public String prototype;
	
	public void setPrototype(String p) {
		prototype = p;
	}
	public String getPrototype() {
		return prototype;
	}
	
	/**
	 * Specifies the object instance on which the Function is called.
	 */
	public Any apply() {
		return new Any();
	}
	/**
	 * Specifies the object instance on which the Function is called.
	 * @param thisArg
	 * @return
	 */
	public Any apply(Any thisArg) {
		return new Any();
	}
	/**
	 * Specifies the object instance on which the Function is called.
	 * @param thisArg
	 * @param argArray
	 * @return
	 */
	public Any apply(Any thisArg, ArrayList<Any> argArray) {
		return new Any();
	}
	
	/**
	 * Invokes this Function.
	 * @return
	 */
	public Any call() {
		return new Any();
	}
	public Any call(Any thisArg) {
		return new Any();
	}
	public Any call(Any thisArg, ArrayList<Any> rest) {
		return new Any();
	}
}
