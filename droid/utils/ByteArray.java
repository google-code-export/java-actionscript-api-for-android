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

import java.util.ArrayList;

import droid.misc.Any;
import droid.utils.ByteArray;

/**
 * flash.utils.ByteArray implementation
 * @author Mj Mendoza IV
 * 
 * The ByteArray class provides methods and properties to optimize reading, writing, and working with binary data.
 */
public class ByteArray implements IDataInput, IDataOutput {
	public ArrayList<Byte> bytes;
	/**
	 * Creates a ByteArray instance representing a packed array of bytes, so that you can use the methods and properties in this class to optimize your data storage and stream.
	 */
	public ByteArray() {
		bytes = new ArrayList<Byte>();
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
			//TODO: compute available bytes left
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
			length = bytes.size();
			return length;
		}
		/**
		 * The length of the ByteArray object, in bytes.
		 * @param value
		 */
		public void setLength(int value) {
			//TODO: review implementation
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
			position = (offset < getLength()) ? offset : -1;
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
		Byte tmp = bytes.get(getPosition());
		return (tmp == 0) ? false : true;
	}
	
	/**
	 * Reads a signed byte from the byte stream.
	 * @return
	 */
	public int readByte() {
		return bytes.get(getPosition());
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
		//TODO: double check on writeInt
		byte b1;
		byte b2;
		byte b3;
		byte b4;
		
		b1 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b2 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b3 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b4 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		return (b1 * 16777216) + (b2 * 65536) + (b3 * 256) + (b4 * 1);
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
		//TODO: double check on writeShort
		byte b1;
		byte b2;
		
		b1 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b2 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		return (b1 * 256) + (b2 * 1);
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
		//TODO: double check on writeUnsignedInt
		byte b1;
		byte b2;
		byte b3;
		byte b4;
		
		b1 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b2 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b3 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b4 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		return (b1 * 16777216) + (b2 * 65536) + (b3 * 256) + (b4 * 1);
	}
	
	/**
	 * Reads an unsigned 16-bit integer from the byte stream.
	 * @return
	 */
	public int readUnsignedShort() {
		//TODO: double check on writeUnsignedShord
		byte b1;
		byte b2;
		
		b1 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		b2 = bytes.get(getPosition());
			setPosition(getPosition() + 1);
		return (b1 * 256) + (b2 * 1);
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
		Byte tmp = new Byte((byte) ((value) ? 1 : 0));
		bytes.add(tmp);
			getLength();
	}
	
	/**
	 * Writes a byte to the byte stream.
	 * @param value
	 */
	public void writeByte(int value) {
		char cvalue = (char) value;
		Byte tmp = new Byte((byte) cvalue);
		bytes.add(tmp);
			getLength();
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
		if (offset < 0) { offset = 0; }
		int range = offset;
		
		if (length < 0) { length = bytes.bytes.size(); }
			range += length;
		
		if (range > bytes.bytes.size() ) { range = bytes.bytes.size(); }
		
		Byte tmp;
		for (int i = offset; i < range; i++) {
			tmp = bytes.bytes.get(i);
			this.bytes.add(tmp);
		}
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
	public void writeFloat(Double value) {
		//TODO: implement
	}
	
	/**
	 * Writes a 32-bit signed integer to the byte stream.
	 * @param value
	 */
	public void writeInt(int value) {
		//TODO: double check on readInt
			int b1;
			int b2;
			int b3;
			int b4;
			/*double dvalue = value;
			if (dvalue < 0) {
				//do negative
				value *= -1; //remove negative
			}*/
			b1 = value / 16777216;
			b2 = (value - (b1 * 16777216)) / (1 * 65536);
			b3 = (value - (b1 * 16777216) - (b2 * 65536)) / (1 * 256);
			b4 = (value - (b1 * 16777216) - (b2 * 65536) - (b3 * 256)) / (1 * 1);
			
			bytes.add((byte) b1);
			bytes.add((byte) b2);
			bytes.add((byte) b3);
			bytes.add((byte) b4);
				getLength();
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
		//TODO: double check on readShort
		int b1;
		int b2;

		b1 = value / 256;
		b2 = value - (b1 * 256) / (1 * 1);
		
		bytes.add((byte) b1);
		bytes.add((byte) b2);
			getLength();
	}
	
	/**
	 * Writes a 32-bit unsigned integer to the byte stream.
	 * @param value
	 */
	public void writeUnsignedInt(int value) {
		//TODO: double check on readUnsignedInt
		int b1;
		int b2;
		int b3;
		int b4;
		
		b1 = value / 16777216;
		b2 = (value - (b1 * 16777216)) / (1 * 65536);
		b3 = (value - (b1 * 16777216) - (b2 * 65536)) / (1 * 256);
		b4 = (value - (b1 * 16777216) - (b2 * 65536) - (b3 * 256)) / (1 * 1);
		
		bytes.add((byte) b1);
		bytes.add((byte) b2);
		bytes.add((byte) b3);
		bytes.add((byte) b4);
			getLength();
	}
	
	/**
	 * Writes a UTF-8 string to the byte stream.
	 * @param value
	 */
	public void writeUTF(String value) {
		for (int i = 0; i < value.length(); i++) {
			bytes.add((byte) value.charAt(i));
		}
	}
	
	/**
	 * Writes a UTF-8 string to the byte stream.
	 * @param value
	 */
	public void writeUTFBytes(String value) {
		//TODO: double check difference of writeUTF and writeUTFBytes
		for (int i = 0; i < value.length(); i++) {
			bytes.add((byte) value.charAt(i));
		}
	}
}
