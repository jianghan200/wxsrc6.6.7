package com.tencent.mm.plugin.a;

import com.tencent.mm.sdk.platformtools.x;
import java.io.RandomAccessFile;

public final class e
  extends a
{
  public static final int eyO = c.aE("vide");
  public static final int eyP = c.aE("soun");
  public static final int eyQ = c.aE("hint");
  long duration = 0L;
  long eyR = 0L;
  long eyS = 0L;
  long eyT = 0L;
  
  public e(int paramInt1, long paramLong, int paramInt2)
  {
    super(paramInt1, paramLong, paramInt2, 0L);
  }
  
  public final boolean a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte)
  {
    int m = 0;
    int k = 0;
    int j = 0;
    int n = paramRandomAccessFile.read(paramArrayOfByte);
    while (n >= 8)
    {
      i1 = c.B(paramArrayOfByte, 0);
      int i = c.B(paramArrayOfByte, 4);
      long l;
      if (i == a.akf)
      {
        byte[] arrayOfByte = new byte[4];
        i = paramRandomAccessFile.read(arrayOfByte);
        if (i < 4) {
          i = -1;
        }
        while (i <= 0)
        {
          x.w("MicroMsg.MdiaAtom", "handle mdhd atom error.");
          return false;
          i += 0;
          if (arrayOfByte[0] == 0)
          {
            if (!c.a(paramRandomAccessFile, 8L))
            {
              i = -1;
            }
            else
            {
              m = paramRandomAccessFile.read(paramArrayOfByte);
              if (m < 8)
              {
                i = -1;
              }
              else
              {
                i = i + 8 + m;
                this.eyR = c.C(paramArrayOfByte, 0);
                this.duration = c.C(paramArrayOfByte, 4);
              }
            }
          }
          else if (!c.a(paramRandomAccessFile, 16L))
          {
            i = -1;
          }
          else
          {
            m = paramRandomAccessFile.read(arrayOfByte);
            if (m < 4)
            {
              i = -1;
            }
            else
            {
              this.eyR = c.C(arrayOfByte, 0);
              int i2 = paramRandomAccessFile.read(paramArrayOfByte);
              if (i2 < 8)
              {
                i = -1;
              }
              else
              {
                i = i2 + (i + 16 + m);
                this.duration = c.R(paramArrayOfByte);
              }
            }
          }
        }
        m = 1;
        l = i1 - n - i;
        i = j;
      }
      for (;;)
      {
        if ((m != 0) && (k != 0))
        {
          i1 = i;
          n = k;
          j = m;
          if (i != 0) {
            break label444;
          }
        }
        if (c.a(paramRandomAccessFile, l)) {
          break;
        }
        return false;
        if (i == a.akg)
        {
          if (!c.a(paramRandomAccessFile, 8L)) {
            i = -1;
          }
          while (i <= 0)
          {
            x.w("MicroMsg.MdiaAtom", "handle hdlr atom error.");
            return false;
            i = paramRandomAccessFile.read(paramArrayOfByte, 0, 4);
            if (i < 4)
            {
              i = -1;
            }
            else
            {
              this.eyS = c.B(paramArrayOfByte, 0);
              i += 8;
            }
          }
          k = 1;
          l = i1 - n - i;
          i = j;
        }
        else if (i == a.ajT)
        {
          this.eyT = (paramRandomAccessFile.getFilePointer() - n);
          l = i1 - n;
          i = 1;
        }
        else
        {
          l = i1 - 8;
          i = j;
        }
      }
      n = paramRandomAccessFile.read(paramArrayOfByte);
      j = i;
    }
    int i1 = j;
    j = m;
    n = k;
    label444:
    return (j != 0) && (n != 0) && (i1 != 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */