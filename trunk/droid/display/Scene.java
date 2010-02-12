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
