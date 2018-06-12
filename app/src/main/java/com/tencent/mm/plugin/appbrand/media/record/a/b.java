package com.tencent.mm.plugin.appbrand.media.record.a;

import com.tencent.mm.sdk.platformtools.x;

public class b
  implements c
{
  String giV = "audio/mp4a-latm";
  String giW = "audio/mpeg";
  c.a giX = null;
  int giY = 0;
  int giZ = 0;
  byte[] gja;
  int gjb = 0;
  
  public final void a(c.a parama)
  {
    this.giX = parama;
  }
  
  public boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    return false;
  }
  
  public void close() {}
  
  public final void d(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (this.giX == null) {
      x.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
    }
    for (;;)
    {
      return;
      if (this.giZ == 0)
      {
        x.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
        return;
      }
      if (paramInt > this.giZ) {
        x.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.giZ) });
      }
      x.d("MicroMsg.Record.AudioEncoder", "bufferedSize:%d, buffSize:%d", new Object[] { Integer.valueOf(this.gjb), Integer.valueOf(paramInt) });
      int i = this.gjb + paramInt;
      if ((i >= this.giZ) && (paramArrayOfByte != null))
      {
        x.d("MicroMsg.Record.AudioEncoder", "flush all, currentBufferedSize:%d", new Object[] { Integer.valueOf(i) });
        if (i > this.gja.length)
        {
          x.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", new Object[] { Integer.valueOf(i) });
          byte[] arrayOfByte = this.gja;
          this.gja = new byte[i];
          System.arraycopy(arrayOfByte, 0, this.gja, 0, this.gjb);
        }
        System.arraycopy(paramArrayOfByte, 0, this.gja, this.gjb, paramInt);
        this.giX.c(this.gja, i, false);
        this.gjb = 0;
      }
      while (paramBoolean)
      {
        x.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", new Object[] { Integer.valueOf(this.gjb) });
        this.giX.c(this.gja, this.gjb, paramBoolean);
        this.gjb = 0;
        return;
        if (paramArrayOfByte != null)
        {
          System.arraycopy(paramArrayOfByte, 0, this.gja, this.gjb, paramInt);
          this.gjb = i;
          x.d("MicroMsg.Record.AudioEncoder", "append buff, currentBufferedSize:%d", new Object[] { Integer.valueOf(this.gjb) });
        }
      }
    }
  }
  
  public boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return false;
  }
  
  public void flush() {}
  
  public final void lj(int paramInt)
  {
    x.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", new Object[] { Integer.valueOf(this.giY) });
    this.giY = paramInt;
  }
  
  public final void lk(int paramInt)
  {
    x.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameSize:%d", new Object[] { Integer.valueOf(paramInt) });
    this.giZ = (paramInt * 1024);
    this.gja = new byte[paramInt * 1024];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */