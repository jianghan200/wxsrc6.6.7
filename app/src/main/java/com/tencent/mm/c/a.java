package com.tencent.mm.c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class a
{
  public a bxg;
  public b bxh = null;
  
  public a(b paramb)
  {
    this.bxh = paramb;
  }
  
  public static a cD(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      if (i >= 8) {
        break label39;
      }
    }
    Object localObject;
    label39:
    do
    {
      return null;
      try
      {
        localObject = new File(paramString);
        if (!((File)localObject).exists()) {
          break;
        }
        i = (int)((File)localObject).length();
      }
      catch (Exception paramString) {}
      localObject = a.y(f(paramString, i - 8, 8));
    } while ((localObject == null) || (((a)localObject).bxj < 0));
    b localb = new b();
    localb.aG(f(paramString, i - ((a)localObject).bxj - 8, ((a)localObject).bxj));
    paramString = new a(localb);
    paramString.bxg = ((a)localObject);
    return paramString;
    return null;
  }
  
  public static boolean cE(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      File localFile = new File(paramString);
      if (localFile.exists())
      {
        a locala = cD(paramString);
        if ((locala != null) && (locala.bxh != null)) {
          try
          {
            paramString = new File(paramString);
            if (paramString.exists())
            {
              boolean bool = locala.bxh.apkMd5.equalsIgnoreCase(g.a(paramString, (int)(localFile.length() - (locala.bxg.bxj + 8) - 2L), new byte[] { 0, 0 }));
              return bool;
            }
          }
          catch (Exception paramString) {}
        }
      }
    }
    return false;
  }
  
  private static byte[] f(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = new File(paramString);
    if (!((File)localObject).exists()) {
      return null;
    }
    if (paramInt2 == -1)
    {
      paramInt2 = (int)((File)localObject).length();
      for (;;)
      {
        if (paramInt1 < 0) {
          return null;
        }
        if (paramInt2 <= 0) {
          return null;
        }
        int i = paramInt2;
        if (paramInt1 + paramInt2 > (int)((File)localObject).length()) {
          i = (int)((File)localObject).length() - paramInt1;
        }
        try
        {
          localObject = new RandomAccessFile(paramString, "r");
          paramString = new byte[i];
          long l = paramInt1;
          try
          {
            ((RandomAccessFile)localObject).seek(l);
            ((RandomAccessFile)localObject).readFully(paramString);
            ((RandomAccessFile)localObject).close();
            return paramString;
          }
          catch (Exception localException)
          {
            return paramString;
          }
        }
        catch (Exception paramString)
        {
          return null;
        }
      }
    }
  }
  
  public final int o(File paramFile)
  {
    try
    {
      if (cD(paramFile.getAbsolutePath()) != null)
      {
        System.out.println("Error: duplicate append apk external info!");
        return -1;
      }
      byte[] arrayOfByte = this.bxh.toByteArray();
      Object localObject = new a(arrayOfByte.length);
      localObject = a.al(a.bxi << 32 | ((a)localObject).bxj);
      int i = (byte)((arrayOfByte.length + 8) % 256);
      int j = (byte)((arrayOfByte.length + 8) / 256);
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "rw");
      localRandomAccessFile.seek(paramFile.length() - 2L);
      localRandomAccessFile.write(new byte[] { i, j });
      localRandomAccessFile.close();
      paramFile = new FileOutputStream(paramFile, true);
      paramFile.write(arrayOfByte);
      paramFile.write((byte[])localObject);
      paramFile.flush();
      paramFile.close();
      return 0;
    }
    catch (Exception paramFile) {}
    return -1;
  }
  
  public static final class a
  {
    static final long bxi = "Micromsg".hashCode();
    public int bxj = 0;
    
    public a(int paramInt)
    {
      this.bxj = paramInt;
    }
    
    static byte[] al(long paramLong)
    {
      byte[] arrayOfByte = new byte[8];
      int i = 0;
      for (;;)
      {
        if (i >= 8) {
          return arrayOfByte;
        }
        arrayOfByte[i] = ((byte)(int)(paramLong >> i * 8 & 0xFF));
        i += 1;
      }
    }
    
    public static a y(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length == 8)
      {
        long l = 0L;
        int i = 0;
        for (;;)
        {
          if (i >= paramArrayOfByte.length)
          {
            if (l >> 32 != bxi) {
              break;
            }
            return new a((int)l);
          }
          l |= (paramArrayOfByte[i] & 0xFF) << i * 8;
          i += 1;
        }
      }
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */