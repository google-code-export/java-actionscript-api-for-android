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
 * flash.utils.IDataInput implementation
 * @author Mj Mendoza IV
 * 
 * The IDataInput interface provides a set of methods for reading binary data.
 */
public interface IDataInput {
	/**
	 * Not to be used for manual/direct manipulation.
	 */
	public int bytesAvailable = 0;
		/**
		 * Returns the number of bytes of data available for reading in the input buffer.
		 * @return
		 */
		public int getBytesAvailable();
	
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
		public void setEndian (String type);
	
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
	 * Reads a Boolean value from the byte stream or byte array.
	 * @return
	 */
	public boolean readBoolean();
	
	/**
	 * Reads a signed byte from the byte stream or byte array.
	 * @return
	 */
	public int readByte();
	
	/**
	 * Reads the number of data bytes, specified by the length parameter, from the byte stream or byte array. 
	 * @param bytes
	 */
	public void readBytes(ByteArray bytes);
	/**
	 * Reads the number of data bytes, specified by the length parameter, from the byte stream or byte array.
	 * @param bytes
	 * @param offset
	 */
	public void readBytes(ByteArray bytes, int offset);
	/**
	 * Reads the number of data bytes, specified by the length parameter, from the byte stream or byte array.
	 * @param bytes
	 * @param offset
	 * @param length
	 */
	public void readBytes(ByteArray bytes, int offset, int length);
	
	/**
	 * Reads an IEEE 754 double-precision floating point number from the byte stream or byte array.
	 * @return
	 */
	public double readDouble();
	
	/**
	 * Reads an IEEE 754 single-precision floating point number from the byte stream or byte array.
	 * @return
	 */
	public double readFloat();
	
	/**
	 * Reads a signed 32-bit integer from the byte stream or byte array.
	 * @return
	 */
	public int readInt();
	
	/**
	 * Reads a multibyte string of specified length from the byte stream using the specified character set.
	 * @param length
	 * @param charSet
	 * @return
	 */
	public String readMultiByte(int length, String charSet);
	
	/**
	 * Reads an object from the byte stream or byte array, encoded in AMF serialized format.
	 * @return
	 */
	public Any readObject();
	
	/**
	 * Reads a signed 16-bit integer from the byte stream or byte array.
	 * @return
	 */
	public int readShort();
	
	/**
	 * Reads an unsigned byte from the byte stream or byte array.
	 * @return
	 */
	public int readUnsignedByte();
	
	/**
	 * Reads an unsigned 32-bit integer from the byte stream or byte array.
	 * @return
	 */
	public long readUnsignedInt();
	
	/**
	 * Reads an unsigned 16-bit integer from the byte stream or byte array.
	 * @return
	 */
	public int readUnsignedShort();
	
	/**
	 * Reads a UTF-8 string from the byte stream or byte array.
	 * @return
	 */
	public String readUTF();
	
	/**
	 * Reads a sequence of length UTF-8 bytes from the byte stream or byte array and returns a string.
	 * @param length
	 * @return
	 */
	public String readUTFBytes(int length);
}
