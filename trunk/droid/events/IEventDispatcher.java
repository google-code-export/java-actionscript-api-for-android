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
import droid.misc.Function;

/**
 * flash.events.IEventDispatcher implementation
 * @author Mj Mendoza IV
 * 
 * The IEventDispatcher interface defines methods for adding or removing event listeners, checks whether specific types of event listeners are registered, and dispatches events.
 */
public interface IEventDispatcher {
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event.
	 * @param type
	 * @param listener
	 */
	public void addEventListener(String type, Function listener);
	
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event.
	 * @param type
	 * @param listener
	 * @param useCapture
	 */
	public void addEventListener(String type, Function listener , boolean useCapture);
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event.
	 * @param type
	 * @param listener
	 * @param useCapture
	 * @param priority
	 */
	public void addEventListener(String type, Function listener , boolean useCapture, int priority);
	/**
	 * Registers an event listener object with an EventDispatcher object so that the listener receives notification of an event.
	 * @param type
	 * @param listener
	 * @param useCapture
	 * @param priority
	 * @param useWeakReference
	 */
	public void addEventListener (String type, Function listener , boolean useCapture, int priority, boolean useWeakReference);

	/**
	 * Dispatches an event into the event flow.
	 * @param event
	 * @return
	 */
	public boolean dispatchEvent(Event event);

	/**
	 * Checks whether the EventDispatcher object has any listeners registered for a specific type of event.
	 * @return
	 */
	public boolean hasEventListener(String type);

	/**
	 * Removes a listener from the EventDispatcher object.
	 * @param type
	 * @param listener
	 */
	public void removeEventListener(String type, Function listener);
	/**
	 * Removes a listener from the EventDispatcher object.
	 * @param type
	 * @param listener
	 * @param useCapture
	 */
	public void removeEventListener(String type, Function listener, boolean useCapture);

	/**
	 * Checks whether an event listener is registered with this EventDispatcher object or any of its ancestors for the specified event type.
	 * @param type
	 * @return
	 */
	public boolean willTrigger(String type);
}
