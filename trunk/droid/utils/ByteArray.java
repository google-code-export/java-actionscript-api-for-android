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
 * The ByteArray class provides methods and properties to optimize reading, writing, and working with binary data.
 */
public class ByteArray implements IDataInput, IDataOutput {
	/**
	 * Creates a ByteArray instance representing a packed array of bytes, so that you can use the methods and properties in this class to optimize your data storage and stream.
	 */
	public ByteArray() {
		
	}
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */
	public int bytesAvailable;
		/**
		 * The number of bytes of data available for reading from the current position in the byte array to the end of the array.
		 * @return
		 */
		public int getBytesAvailable() {
			return bytesAvailable;
		}
		
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */
	public static int defaultObjectEncoding;
		/**
		 * Denotes the default object encoding for the ByteArray class to use for a new ByteArray instance.
		 * @return
		 */
		public static int getDefaultObjectEncoding() {
			return ByteArray.defaultObjectEncoding;
		}
		/**
		 * Denotes the default object encoding for the ByteArray class to use for a new ByteArray instance.
		 * @param version
		 */
		public static void setDefaultObjectEncoding(int version) {
			ByteArray.defaultObjectEncoding = version;
		}
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */ 
	public String endian;
		/**
		 * Changes or reads the byte order for the data; either Endian.BIG_ENDIAN or Endian.LITTLE_ENDIAN.
		 * @return
		 */
		public String getEndian() {
			return endian;
		}
		/**
		 * Changes or reads the byte order for the data; either Endian.BIG_ENDIAN or Endian.LITTLE_ENDIAN.
		 * @param type
		 */
		public void setEndian(String type) {
			endian = type;
		}
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */
	public int length;
		/**
		 * The length of the ByteArray object, in bytes.
		 * @return
		 */
		public int getLength() {
			return length;
		}
		/**
		 * The length of the ByteArray object, in bytes.
		 * @param value
		 */
		public void setLength(int value) {
			length = value;
		}
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */
	public int objectEncoding;
		/**
		 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading from, a ByteArray instance.
		 * @return
		 */
		public int getObjectEncoding() {
			return objectEncoding;
		}
		/**
		 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading from, a ByteArray instance.
		 * @param version
		 */
		public void setObjectEncoding(int version) {
			objectEncoding = version;
		}
	
	/**
	 * Not to be used for manual/direct manipulation. 
	 */
	public int position;
		/**
		 * Moves, or returns the current position, in bytes, of the file pointer into the ByteArray object.
		 * @return
		 */
		public int getPosition() {
			return position;
		}
		/**
		 * Moves, or returns the current position, in bytes, of the file pointer into the ByteArray object.
		 * @param offset
		 */
		public void setPosition(int offset) {
			position = offset;
		}
	
	/**
	 * Compresses the byte array.
	 */
	public void compress() {
		
	}
	
	/**
	 * Reads a Boolean value from the byte stream.
	 * @return
	 */
	public boolean readBoolean() {
		//TODO: implement
		return false;
	}
	
	/**
	 * Reads a signed byte from the byte stream.
	 * @return
	 */
	public int readByte() {
		//TODO: implement
		return 0;
	}
	
	/// Reads the number of data bytes, specified by the length parameter, from the byte stream.
	public void readBytes(ByteArray bytes) {
		readBytes(bytes, 0, 0);
	}
	public void readBytes(ByteArray bytes, int offset) {
		readBytes(bytes, offset, 0);
	}
	public void readBytes(ByteArray bytes, int offset, int length) {
		//TODO: implement
	}
	
	/**
	 * Reads an IEEE 754 double-precision (64-bit) floating-point number from the byte stream.
	 * @return
	 */
	public double readDouble() {
		//TODO: implement
		return 0.0;
	}
	
	/**
	 * Reads an IEEE 754 single-precision (32-bit) floating-point number from the byte stream.
	 * @return
	 */
	public double readFloat() {
		//TODO: implement
		return 0.0;
	}
	
	/**
	 * Reads a signed 32-bit integer from the byte stream.
	 * @return
	 */
	public int readInt() {
		//TODO: implement
		return 0;
	}
	
	/**
	 * Reads a multibyte string of specified length from the byte stream using the specified character set.
	 * @param length
	 * @param charSet
	 * @return
	 */
	public String readMultiByte(int length, String charSet) {
		//TODO: implement
		return "";
	}
	
	/**
	 * Reads an object from the byte array, encoded in AMF serialized format.
	 * @return
	 */
	public Any readObject() {
		//TODO: implement
		return new Any();
	}
	
	/**
	 * Reads a signed 16-bit integer from the byte stream.
	 * @return
	 */
	public int readShort() {
		//TODO: implement
		return 0;
	}
	
	/**
	 * Reads an unsigned byte from the byte stream.
	 * @return
	 */
	public int readUnsignedByte() {
		//TODO: implement
		return 0;
	}
	
	/**
	 * Reads an unsigned 32-bit integer from the byte stream.
	 * @return
	 */
	public int readUnsignedInt() {
		//TODO: implement
		return 0;
	}
	
	/**
	 * Reads an unsigned 16-bit integer from the byte stream.
	 * @return
	 */
	public int readUnsignedShort() {
		//TODO: implement
		return 0;
	}
	
	/**
	 * Reads a UTF-8 string from the byte stream.
	 * @return
	 */
	public String readUTF() {
		//TODO: implement
		return "";
	}
	
	/**
	 * Reads a sequence of UTF-8 bytes specified by the length parameter from the byte stream and returns a string.
	 * @param length
	 * @return
	 */
	public String readUTFBytes(int length) {
		//TODO: implement
		return "";
	}
	
	/**
	 * Converts the byte array to a string.
	 */
	public String toString () {
		//TODO: implement
		return "";
	}
	
	/**
	 * Decompresses the byte array.
	 */
	public void uncompress() {
		//TODO: implement
	}
	
	/**
	 * Writes a Boolean value.
	 * @param value
	 */
	public void writeBoolean(boolean value) {
		//TODO: implement
	}
	
	/**
	 * Writes a byte to the byte stream.
	 * @param value
	 */
	public void writeByte(int value) {
		//TODO: implement
	}
	
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream.
	 * @param bytes
	 * @param offset
	 */
	public void writeBytes(ByteArray bytes) {
		writeBytes(bytes, 0, 0);
	}
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream.
	 * @param bytes
	 * @param offset
	 */
	public void writeBytes(ByteArray bytes, int offset) {
		writeBytes(bytes, offset, 0);
	}
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream.
	 * @param bytes
	 * @param offset
	 * @param length
	 */
	public void writeBytes(ByteArray bytes, int offset, int length) {
		//TODO: implement
	}
	
	/**
	 * Writes an IEEE 754 double-precision (64-bit) floating-point number to the byte stream.
	 * @param value
	 */
	public void writeDouble(double value) {
		//TODO: implement
	}
	
	/**
	 * Writes an IEEE 754 single-precision (32-bit) floating-point number to the byte stream.
	 * @param value
	 */
	public void writeFloat(double value) {
		//TODO: implement
	}
	
	/**
	 * Writes a 32-bit signed integer to the byte stream.
	 * @param value
	 */
	public void writeInt(int value) {
		//TODO: implement
	}
	
	/**
	 * Writes a multibyte string to the byte stream using the specified character set.
	 * @param value
	 * @param charSet
	 */
	public void writeMultiByte(String value, String charSet) {
		//TODO: implement
	}
	
	/// Writes an object into the byte array in AMF serialized format.
	public void writeObject(Any object) {
		//TODO: implement
	}
	
	/**
	 * Writes a 16-bit integer to the byte stream.
	 * @param value
	 */
	public void writeShort(int value) {
		//TODO: implement
	}
	
	/**
	 * Writes a 32-bit unsigned integer to the byte stream.
	 * @param value
	 */
	public void writeUnsignedInt(int value) {
		//TODO: implement
	}
	
	/**
	 * Writes a UTF-8 string to the byte stream.
	 * @param value
	 */
	public void writeUTF(String value) {
		//TODO: implement
	}
	
	/**
	 * Writes a UTF-8 string to the byte stream.
	 * @param value
	 */
	public void writeUTFBytes(String value) {
		//TODO: implement
	}
}
