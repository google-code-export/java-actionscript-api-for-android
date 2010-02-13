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
package droid.events;

import droid.events.Event;
import droid.misc.Any;

/**
 * flash.events.Event implementation
 * @author Mj Mendoza IV
 * 
 * The Event class is used as the base class for the creation of Event objects, which are passed as parameters to event listeners when an event occurs.
 */
public class Event {
	/**
	 * The Event.ACTIVATE constant defines the value of the type property of an activate event object.
	 */
	public static String ACTIVATE = "activate";
	/**
	 * The Event.ADDED constant defines the value of the type property of an added event object.
	 */
	public static String ADDED = "added";
	/**
	 * The Event.ADDED_TO_STAGE constant defines the value of the type property of an addedToStage event object.
	 */
	public static String ADDED_TO_STAGE = "addedToStage";
	/**
	 * The Event.CANCEL constant defines the value of the type property of a cancel event object.
	 */
	public static String CANCEL = "cancel";
	/**
	 * The Event.CHANGE constant defines the value of the type property of a change event object.
	 */
	public static String CHANGE = "change";
	/**
	 * The Event.CLOSE constant defines the value of the type property of a close event object.
	 */
	public static String CLOSE = "close";
	/**
	 * The Event.COMPLETE constant defines the value of the type property of a complete event object.
	 */
	public static String COMPLETE = "complete";
	/**
	 * The Event.CONNECT constant defines the value of the type property of a connect event object.
	 */
	public static String CONNECT = "connect";
	/**
	 * The Event.DEACTIVATE constant defines the value of the type property of a deactivate event object.
	 */
	public static String DEACTIVATE = "deactivate";
	/**
	 * The Event.ENTER_FRAME constant defines the value of the type property of an enterFrame event object.
	 */
	public static String ENTER_FRAME = "enterFrame";
	/**
	 * The Event.FULL_SCREEN constant defines the value of the type property of a fullScreen event object.
	 */
	public static String FULLSCREEN = "fullscreen";
	/**
	 * The Event.ID3 constant defines the value of the type property of an id3 event object.
	 */
	public static String ID3 = "id3";
	/**
	 * The Event.INIT constant defines the value of the type property of an init event object.
	 */
	public static String INIT = "init";
	/**
	 * The Event.MOUSE_LEAVE constant defines the value of the type property of a mouseLeave event object.
	 */
	public static String MOUSE_LEAVE = "mouseLeave";
	/**
	 * The Event.OPEN constant defines the value of the type property of an open event object.
	 */
	public static String OPEN = "open";
	/**
	 * The Event.REMOVED constant defines the value of the type property of a removed event object.
	 */
	public static String REMOVED = "removed";
	/**
	 * The Event.REMOVED_FROM_STAGE constant defines the value of the type property of a removedFromStage event object.
	 */
	public static String REMOVED_FROM_STAGE = "removedFromStage";
	/**
	 * The Event.RENDER constant defines the value of the type property of a render event object.
	 */
	public static String RENDER = "render";
	/**
	 * The Event.RESIZE constant defines the value of the type property of a resize event object.
	 */
	public static String RESIZE = "resize";
	/**
	 * The Event.SCROLL constant defines the value of the type property of a scroll event object.
	 */
	public static String SCROLL = "scroll";
	/**
	 * The Event.SELECT constant defines the value of the type property of a select event object.
	 */
	public static String SELECT = "select";
	/**
	 * The Event.SOUND_COMPLETE constant defines the value of the type property of a soundComplete event object.
	 */
	public static String SOUND_COMPLETE = "soundComplete";
	/**
	 * The Event.TAB_CHILDREN_CHANGE constant defines the value of the type property of a tabChildrenChange event object.
	 */
	public static String TAB_CHILDREN_CHANGE = "tabChildrenChange";
	/**
	 * The Event.TAB_ENABLED_CHANGE constant defines the value of the type property of a tabEnabledChange event object.
	 */
	public static String TAB_ENABLED_CHANGE = "tabEnabledChange";
	/**
	 * The Event.TAB_INDEX_CHANGE constant defines the value of the type property of a tabIndexChange event object.
	 */
	public static String TAB_INDEX_CHANGE = "tabIndexChange";
	/**
	 * The Event.UNLOAD constant defines the value of the type property of an unload event object.
	 */
	public static String UNLOAD = "unload";
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getBubbles()
	 */
	public boolean bubbles;
		/**
		 * Indicates whether an event is a bubbling event.
		 * @return
		 */
		public boolean getBubbles() {
			return bubbles;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getCancelable()
	 */
	public boolean cancelable;
		/**
		 * Indicates whether the behavior associated with the event can be prevented.
		 * @return
		 */
		public boolean getCancelable() {
			return cancelable;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getCurrentTarget()
	 */
	public Object currentTarget;
		/**
		 * The object that is actively processing the Event object with an event listener.
		 * @return
		 */
		public Object getCurrentTarget() {
			return currentTarget;
		}
	
	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getEventPhase()
	 */
	public int eventPhase;
		/**
		 * The current phase in the event flow.
		 * @return
		 */
		public int getEventPhase() {
			return eventPhase;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getTarget()
	 */
	public Object target;
		/**
		 * The event target.
		 * @return
		 */
		public Object getTarget() {
			return target;
		}

	/**
	 * Not to be used for manual/direct manipulation.
	 * @see droid.events.Event.getType()
	 */
	public String type;
		/**
		 * The type of event.
		 * @return
		 */
		public String getType() {
			return type;
		}

	/**
	 * Duplicates an instance of an Event subclass.
	 */
	public Event clone() {
		return new Event(type, bubbles, cancelable);
	}
	
	/**
	 * Used to create new Event object.
	 * @param type
	 */
	public Event(String type) {
		this.type = type;
		this.bubbles = false;
		this.cancelable = false;
	}
	/**
	 * Used to create new Event object.
	 * @param type
	 * @param bubbles
	 */
	public Event(String type, boolean bubbles) {
		this.type = type;
		this.bubbles = bubbles;
		this.cancelable = false;
	}
	/**
	 * Used to create new Event object.
	 * @param type
	 * @param bubbles
	 * @param cancelable
	 */
	public Event(String type, boolean bubbles, boolean cancelable) {
		this.type = type;
		this.bubbles = bubbles;
		this.cancelable = cancelable;
	}
	
	/**
	 * A utility function for implementing the toString() method in custom ActionScript 3.0 Event classes. 
	 * @param className
	 * @param rest
	 * @return
	 */
	public String formatToString(String className, Any[] rest) {
		//TODO: implement
		return "";
	}
	
	/**
	 * Checks whether the preventDefault() method has been called on the event. 
	 * @return
	 */
	public boolean isDefaultPrevented() {
		//TODO: implement
		return false;
	}
	
	/**
	 * Cancels an event's default behavior if that behavior can be canceled.
	 */
	public void preventDefault() {
		//TODO: implement
	}
	
	/**
	 * Prevents processing of any event listeners in the current node and any subsequent nodes in the event flow. 
	 */
	public void stopImmediatePropagation() {
		//TODO: implement
	}
	
	/**
	 * Prevents processing of any event listeners in nodes subsequent to the current node in the event flow. 
	 */
	public void stopPropagation() {
		//TODO: implement
	}
	
	/**
	 * Returns a string containing all the properties of the Event object.
	 * @return
	 */
	public String toString() {
		return "[Event type=\"" + this.type + "\" bubbles=" + this.bubbles + " cancelable=" + this.cancelable + " eventPhase=" + this.eventPhase + "]";
	}
}
