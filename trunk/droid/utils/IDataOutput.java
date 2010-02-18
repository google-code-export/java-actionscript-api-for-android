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
package droid.utils;

import droid.misc.Any;
import droid.utils.ByteArray;

/**
 * flash.utils.ByteArray implementation
 * @author Mj Mendoza IV
 * 
 * The IDataOutput interface provides a set of methods for writing binary data.
 */
public interface IDataOutput {
	/**
	 * Not to be used for manual/direct manipulation.
	 */
	public String endian = "";
		/**
		 * The byte order for the data, either the "bigEndian" or "littleEndian" constant from the Endian class.
		 * @return
		 */
		public String getEndian();
		/**
		 * The byte order for the data, either the "bigEndian" or "littleEndian" constant from the Endian class.
		 * @param type
		 */
		public void setEndian(String type);
	
	/**
	 * Not to be used for manual/direct manipulation.
	 */
	public int objectEncoding = 0;
		/**
		 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading binary data.
		 * @return
		 */
		public int getObjectEncoding();
		/**
		 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading binary data.
		 * @param version
		 */
		public void setObjectEncoding(int version);
	
	/**
	 * Writes a Boolean value.
	 * @param value
	 */
	public void writeBoolean(boolean value);
	
	/**
	 * Writes a byte.
	 * @param value
	 */
	public void writeByte(int value);
	
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset(zero-based index) bytes into the byte stream.
	 * @param bytes
	 */
	public void writeBytes(ByteArray bytes);
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset(zero-based index) bytes into the byte stream.
	 * @param bytes
	 * @param offset
	 */
	public void writeBytes(ByteArray bytes, int offset);
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset(zero-based index) bytes into the byte stream.
	 * @param bytes
	 * @param offset
	 * @param length
	 */
	public void writeBytes(ByteArray bytes, int offset, int length);
	
	/**
	 * Writes an IEEE 754 double-precision (64-bit) floating point number.
	 * @param value
	 */
	public void writeDouble(double value);
	
	/**
	 * Writes an IEEE 754 single-precision (32-bit) floating point number.
	 * @param value
	 */
	public void writeFloat(double value);
	
	/**
	 * Writes a 32-bit signed integer.
	 * @param value
	 */
	public void writeInt(int value);
	
	/**
	 * Writes a multibyte string to the byte stream using the specified character set.
	 * @param value
	 * @param charSet
	 */
	public void writeMultiByte(String value, String charSet);
	
	/**
	 * Writes an object to the byte stream or byte array in AMF serialized format.
	 * @param object
	 */
	public void writeObject(Any object);
	
	/**
	 * Writes a 16-bit integer.
	 * @param value
	 */
	public void writeShort(int value);
	
	/**
	 * Writes a 32-bit unsigned integer.
	 * @param value
	 */
	public void writeUnsignedInt(int value);
	
	/**
	 * Writes a UTF-8 string to the byte stream.
	 * @param value
	 */
	public void writeUTF(String value);
	
	/**
	 * Writes a UTF-8 string.
	 * @param value
	 */
	public void writeUTFBytes(String value);
}
