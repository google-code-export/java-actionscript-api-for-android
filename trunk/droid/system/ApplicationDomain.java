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
package droid.system;

import droid.system.ApplicationDomain;

/**
 * flash.system.ApplicationDomain implementation
 * @author Mj Mendoza IV
 * 
 * The ApplicationDomain class is a container for discrete groups of class definitions.
 */
public class ApplicationDomain {	
	/**
	 * Creates a new application domain.
	 */
	public ApplicationDomain() {
		//TODO: implement
	}
	/**
	 * Creates a new application domain.
	 * @param parentDomain
	 */
	public ApplicationDomain(ApplicationDomain parentDomain) {
		//TODO: implement
	}
	
	/// Gets the current application domain in which your code is executing.
	public static ApplicationDomain currentDomain;
	public static ApplicationDomain getCurrentDomain() {
		return currentDomain;
	}
	
	/// Gets the parent domain of this application domain.
	public ApplicationDomain parentDomain;
	public ApplicationDomain getParentDomain() {
		return parentDomain;
	}

	/**
	 * Gets a public definition from the specified application domain.
	 * @param name
	 * @return
	 */
	public Object getDefinition(String name) {
		//TODO: implement
		return null;
	}
	
	/**
	 * Checks to see if a public definition exists within the specified application domain.
	 * @param name
	 * @return
	 */
	public boolean hasDefinition(String name) {
		//TODO: implement
		return false;
	}
}
