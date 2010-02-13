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
package droid.text;

/**
 * flash.text.TextSnapshot implementation
 * @author Mj Mendoza IV
 * 
 * TextSnapshot objects let you work with static text in a movie clip.
 */
public class TextSnapshot {
	public TextSnapshot() {
		//
	}

	public int charCount;
	/**
	 * The number of characters in a TextSnapshot object.
	 * @return
	 */
	public int getCharCount() {
		//TODO: implement
		return 0;
	}
	
	protected String text;

	/**
	 * Searches the specified TextSnapshot object and returns the position of the first occurrence of textToFind found at or after beginIndex.
	 * @param beginIndex
	 * @param textToFind
	 * @param caseSensitive
	 * @return
	 */
	public int findText(int beginIndex, String textToFind, boolean caseSensitive) {
		if (caseSensitive) {
			return text.indexOf(textToFind, beginIndex);
		} else {
			return text.toLowerCase().indexOf(textToFind.toLowerCase(), beginIndex);
		}
	}

	/**
	 * Returns a Boolean value that specifies whether a TextSnapshot object contains selected text in the specified range.
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public boolean getSelected(int beginIndex, int endIndex) {
		//TODO: implement
		return false;
	}

	/**
	 * Returns a string that contains all the characters specified by the corresponding setSelected() method.
	 * @return
	 */
	public String getSelectedText() {
		return getSelectedText(false);
	}
	/**
	 * Returns a string that contains all the characters specified by the corresponding setSelected() method.
	 * @param includeLineEndings
	 * @return
	 */
	public String getSelectedText(boolean includeLineEndings) {
		//TODO: implement
		return "";
	}

	/**
	 * Returns a string that contains all the characters specified by the beginIndex and endIndex parameters. 
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public String getText(int beginIndex, int endIndex) {
		return getText(beginIndex, endIndex, false);
	}
	/**
	 * Returns a string that contains all the characters specified by the beginIndex and endIndex parameters.
	 * @param beginIndex
	 * @param endIndex
	 * @param includeLineEndings
	 * @return
	 */
	public String getText(int beginIndex, int endIndex, boolean includeLineEndings) {
		//TODO: implement includeLineEndings
		return text.substring(beginIndex, endIndex);
	}

	/**
	 * Returns an array of objects that contains information about a run of text.
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public Object[] getTextRunInfo(int beginIndex, int endIndex) {
		//TODO: implement
		return null;
	}

	/// Lets you determine which character within a TextSnapshot object is on or near the specified x, y coordinates of the movie clip containing the text in the TextSnapshot object.
	public double hitTestTextNearPos(double x, double y) {
		return hitTestTextNearPos(x, y, 0);
	}
	public double hitTestTextNearPos(double x, double y, double maxDistance) {
		//TODO: implement
		return 0;
	}

	/// Specifies the color to use when highlighting characters that have been selected with the  setSelected() method.
	public void setSelectColor() {
		setSelectColor(16776960);
	}
	public void setSelectColor(int hexColor) {
		//TODO: implement
	}

	/**
	 * Specifies a range of characters in a TextSnapshot object to be selected or deselected.
	 * @param beginIndex
	 * @param endIndex
	 * @param select
	 */
	public void setSelected(int beginIndex, int endIndex, boolean select) {
		//TODO: implement
	}
}
