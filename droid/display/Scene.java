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

/**
 * flash.display.Scene implementation
 * @author Mj Mendoza IV
 * 
 * The Scene class includes properties for identifying the name, labels, and number of frames in a scene.
 */
public class Scene {
	public Scene(String name, String[] labels, int numFrames) {
		setName(name);
		setLabels(labels);
		setNumFrames(numFrames);
	}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Scene.setLabels()
	 * @see droid.display.Scene.getLabels()
	 */
	public String[] labels;
		/**
		 * An array of FrameLabel objects for the scene.
		 * @return
		 */
		public String[] getLabels() {
			return labels;
		}
		/**
		 * An array of FrameLabel objects for the scene.
		 * @param value
		 */
		public void setLabels(String[] value) {
			labels = value;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Scene.setName()
	 * @see droid.display.Scene.getName()
	 */
	public String name;
		/**
		 * Returns the name of the scene.
		 * @return
		 */
		public String getName() {
			return name;
		}
		/**
		 * Sets the name of the scene.
		 * @param value
		 */
		public void setName(String value) {
			name = value;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.display.Scene.setNumFrames()
	 * @see droid.display.Scene.getNumFrames()
	 */
	public int numFrames;
		/**
		 * Returns the number of frames in the scene.
		 * @return
		 */
		public int getNumFrames() {
			return numFrames;
		}
		/**
		 * Sets the number of frames in the scene.
		 * @param value
		 */
		public void setNumFrames(int value) {
			if (value < 0) { value = 0; }
			numFrames = value;
		}
}
