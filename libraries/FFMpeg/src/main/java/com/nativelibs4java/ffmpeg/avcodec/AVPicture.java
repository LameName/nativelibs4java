package com.nativelibs4java.ffmpeg.avcodec;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavcodec/avcodec.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVPicture extends StructObject {
	public AVPicture() {
		super();
	}
	public AVPicture(Pointer pointer) {
		super(pointer);
	}
	/// C type : uint8_t*[4]
	@Array({4}) 
	@Field(0) 
	public Pointer<Pointer<Byte > > data() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < number of bytes per line<br>
	 * C type : int[4]
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Integer > linesize() {
		return this.io.getPointerField(this, 1);
	}
}
