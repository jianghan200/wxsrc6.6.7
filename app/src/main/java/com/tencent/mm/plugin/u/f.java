package com.tencent.mm.plugin.u;

import android.util.Pair;
import com.tencent.mm.plugin.a.g;
import com.tencent.mm.sdk.platformtools.x;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.List;

public final class f
{
  List<g> eyW;
  List<Pair> eyX;
  RandomAccessFile lcP;
  g lcQ;
  int lcR;
  int lcS;
  
  public final int x(ByteBuffer paramByteBuffer)
  {
    if (this.lcR >= this.lcS) {
      return -1;
    }
    for (;;)
    {
      byte[] arrayOfByte;
      int i;
      try
      {
        this.lcP.seek(this.lcQ.start);
        arrayOfByte = new byte[this.lcQ.size];
        i = this.lcP.read(arrayOfByte);
      }
      catch (Exception paramByteBuffer)
      {
        i = -1;
        continue;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 0;
        arrayOfByte[2] = 0;
        arrayOfByte[3] = 1;
        j = 0;
      }
      try
      {
        if (i >= this.lcQ.size) {
          continue;
        }
        return -1;
      }
      catch (Exception paramByteBuffer)
      {
        x.printErrStackTrace("MicroMsg.Mp4Extractor", paramByteBuffer, "read sample data error", new Object[0]);
        return i;
      }
      paramByteBuffer.clear();
      paramByteBuffer.put(arrayOfByte, 0, i).flip();
      return i;
      int j;
      while (j < i)
      {
        if ((arrayOfByte[j] == Byte.MIN_VALUE) && (j + 4 < i) && (arrayOfByte[(j + 1)] == 0) && (arrayOfByte[(j + 2)] == 0))
        {
          arrayOfByte[(j + 3)] = 0;
          arrayOfByte[(j + 4)] = 1;
        }
        j += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/u/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */