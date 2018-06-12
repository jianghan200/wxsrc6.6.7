package com.tencent.mm.plugin.appbrand.s.f;

import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public final class b
{
  public static CodingErrorAction gEd = CodingErrorAction.REPORT;
  
  public static String G(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, 0, paramInt, "ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      x.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramArrayOfByte.toString());
    }
    return "";
  }
  
  public static String w(ByteBuffer paramByteBuffer)
  {
    Object localObject = Charset.forName("UTF8").newDecoder();
    ((CharsetDecoder)localObject).onMalformedInput(gEd);
    ((CharsetDecoder)localObject).onUnmappableCharacter(gEd);
    try
    {
      paramByteBuffer.mark();
      localObject = ((CharsetDecoder)localObject).decode(paramByteBuffer).toString();
      paramByteBuffer.reset();
      return (String)localObject;
    }
    catch (CharacterCodingException paramByteBuffer)
    {
      throw new com.tencent.mm.plugin.appbrand.s.c.b(1007, paramByteBuffer);
    }
  }
  
  public static byte[] wc(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      x.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
    }
    return new byte[0];
  }
  
  public static byte[] wd(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ASCII");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      x.e("MicroMsg.AppBrandNetWork.Charsetfunctions", paramString.toString());
    }
    return new byte[0];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */