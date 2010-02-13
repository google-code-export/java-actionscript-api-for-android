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
package droid.media;

/**
 * flash.media.SoundTransform implementation
 * @author creek23
 * 
 * The SoundTransform class contains properties for volume and panning.
 */
public class SoundTransform {
	/**
	 * Creates a SoundTransform object.
	 */
	public SoundTransform() {
		setVolume(1);
		setPan(0);
	}
	/**
	 * Creates a SoundTransform object.
	 * @param vol
	 */
	public SoundTransform(double vol) {
		setVolume(vol);
		setPan(0);
	}
	/**
	 * Creates a SoundTransform object.
	 * @param vol
	 * @param panning
	 */
	public SoundTransform(double vol, double panning) {
		setVolume(vol);
		setPan(panning);
	}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double leftToLeft;
		/**
		 * Returns a value, from 0 (none) to 1 (all), specifying how much of the left input is played in the left speaker.
		 * @return
		 */
		public double getLeftToLeft() {
			return leftToLeft;
		}
		/**
		 * Sets a value, from 0 (none) to 1 (all), specifying how much of the left input is played in the left speaker.
		 * @param leftToLeft
		 */
		public void setLeftToLeft(double leftToLeft) {
			if (leftToLeft > 1) { leftToLeft = 1; }
			if (leftToLeft < 0) { leftToLeft = 0; }
			this.leftToLeft = leftToLeft;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double leftToRight;
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the left input is played in the right speaker.
		 * @return
		 */
		public double getLeftToRight() {
			return leftToRight;
		}
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the left input is played in the right speaker.
		 * @param leftToRight
		 */
		public void setLeftToRight(double leftToRight) {
			if (leftToRight > 1) { leftToRight = 1; }
			if (leftToRight < 0) { leftToRight = 0; }
			this.leftToRight = leftToRight;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double pan;
		/**
		 * The left-to-right panning of the sound, ranging from -1 (full pan left) to 1 (full pan right).
		 * @return
		 */
		public double getPan() {
			return pan;
		}
		/**
		 * The left-to-right panning of the sound, ranging from -1 (full pan left) to 1 (full pan right).
		 * @param panning
		 */
		public void setPan(double panning) {
			if (panning > 1) { panning = 1; }
			if (panning < -1) { panning = -1; }
			pan = panning;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double rightToLeft;
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the right input is played in the left speaker.
		 * @return
		 */
		public double getRightToLeft() {
			return rightToLeft;
		}
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the right input is played in the left speaker.
		 * @param rightToLeft
		 */
		public void setRightToLeft(double rightToLeft) {
			if (rightToLeft > 1) { rightToLeft = 1; }
			if (rightToLeft < 0) { rightToLeft = 0; }
			this.rightToLeft = rightToLeft;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double rightToRight;
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the right input is played in the right speaker.
		 * @return
		 */
		public double getRightToRight() {
			return rightToRight;
		}
		/**
		 * A value, from 0 (none) to 1 (all), specifying how much of the right input is played in the right speaker.
		 * @param rightToRight
		 */
		public void setRightToRight(double rightToRight) {
			if (rightToRight > 1) { rightToRight = 1; }
			if (rightToRight < 0) { rightToRight = 0; }
			this.rightToRight = rightToRight;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.geom.Point.setX()
	 * @see droid.geom.Point.getX()
	 */
	public double volume;
		/**
		 * The volume, ranging from 0 (silent) to 1 (full volume).
		 * @return
		 */
		public double getVolume() {
			return volume;
		}
		/**
		 * The volume, ranging from 0 (silent) to 1 (full volume).
		 * @param volume
		 */
		public void setVolume(double volume) {
			if (volume > 1) { volume = 1; }
			if (volume < 0) { volume = 0; }
			this.volume = volume;
		}
}
