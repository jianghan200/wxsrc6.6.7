package com.tencent.mm.plugin.downloader.model;

import com.tencent.mm.c.l;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

public final class k
{
  protected static final com.tencent.mm.c.k bxv = new com.tencent.mm.c.k(101010256L);
  private static l icz = new l(38650);
  
  public static String E(File paramFile)
  {
    return e(paramFile, "channelId");
  }
  
  private static byte[] d(RandomAccessFile paramRandomAccessFile)
  {
    int j = 1;
    long l = paramRandomAccessFile.length() - 22L;
    paramRandomAccessFile.seek(l);
    byte[] arrayOfByte = bxv.getBytes();
    int i = paramRandomAccessFile.read();
    if (i != -1) {
      if ((i != arrayOfByte[0]) || (paramRandomAccessFile.read() != arrayOfByte[1]) || (paramRandomAccessFile.read() != arrayOfByte[2]) || (paramRandomAccessFile.read() != arrayOfByte[3])) {}
    }
    for (i = j;; i = 0)
    {
      if (i == 0)
      {
        throw new ZipException("archive is not a ZIP archive");
        l -= 1L;
        paramRandomAccessFile.seek(l);
        i = paramRandomAccessFile.read();
        break;
      }
      paramRandomAccessFile.seek(16L + l + 4L);
      arrayOfByte = new byte[2];
      paramRandomAccessFile.readFully(arrayOfByte);
      i = new l(arrayOfByte).value;
      if (i == 0) {
        return null;
      }
      arrayOfByte = new byte[i];
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    }
  }
  
  private static String e(File paramFile, String paramString)
  {
    try
    {
      localRandomAccessFile = new RandomAccessFile(paramFile, "r");
      try
      {
        paramFile = d(localRandomAccessFile);
        if (paramFile == null)
        {
          localRandomAccessFile.close();
          return null;
        }
        locala = new a((byte)0);
        if (paramFile == null) {
          break label235;
        }
        localByteBuffer = ByteBuffer.wrap(paramFile);
        icz.getBytes();
        arrayOfByte = new byte[2];
        localByteBuffer.get(arrayOfByte);
        if (icz.equals(new l(arrayOfByte))) {
          break label129;
        }
        throw new ProtocolException("unknow protocl [" + Arrays.toString(paramFile) + "]");
      }
      finally
      {
        paramString = localRandomAccessFile;
      }
    }
    finally
    {
      for (;;)
      {
        RandomAccessFile localRandomAccessFile;
        a locala;
        ByteBuffer localByteBuffer;
        byte[] arrayOfByte;
        label129:
        int i;
        label235:
        paramString = null;
      }
    }
    if (paramString != null) {
      paramString.close();
    }
    throw paramFile;
    if (paramFile.length - 2 > 2)
    {
      arrayOfByte = new byte[2];
      localByteBuffer.get(arrayOfByte);
      i = new l(arrayOfByte).value;
      if (paramFile.length - 2 - 2 >= i)
      {
        arrayOfByte = new byte[i];
        localByteBuffer.get(arrayOfByte);
        locala.icA.load(new ByteArrayInputStream(arrayOfByte));
        i = paramFile.length - 2 - i - 2;
        if (i > 0)
        {
          locala.icB = new byte[i];
          localByteBuffer.get(locala.icB);
        }
      }
    }
    paramFile = locala.icA.getProperty(paramString);
    localRandomAccessFile.close();
    return paramFile;
  }
  
  private static final class a
  {
    Properties icA = new Properties();
    byte[] icB;
    
    public final String toString()
    {
      return "ApkExternalInfo [p=" + this.icA + ", otherData=" + Arrays.toString(this.icB) + "]";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */