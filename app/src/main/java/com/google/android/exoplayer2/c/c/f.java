package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;

public final class f
  implements h
{
  private final String aem;
  private Format aep;
  private long aih;
  private k alX;
  private final j amM = new j(new byte[15]);
  private int amO;
  private long amQ;
  private String amX;
  private int ang;
  private int sampleSize;
  private int state;
  
  public f(String paramString)
  {
    this.amM.data[0] = Byte.MAX_VALUE;
    this.amM.data[1] = -2;
    this.amM.data[2] = Byte.MIN_VALUE;
    this.amM.data[3] = 1;
    this.state = 0;
    this.aem = paramString;
  }
  
  public final void a(com.google.android.exoplayer2.c.f paramf, u.d paramd)
  {
    paramd.kf();
    this.amX = paramd.kh();
    this.alX = paramf.cp(paramd.kg());
  }
  
  public final void b(j paramj)
  {
    while (paramj.me() > 0)
    {
      int i;
      switch (this.state)
      {
      default: 
        break;
      case 0: 
        while (paramj.me() > 0)
        {
          this.ang <<= 8;
          this.ang |= paramj.readUnsignedByte();
          if (this.ang == 2147385345) {
            this.ang = 0;
          }
        }
        for (i = 1; i != 0; i = 0)
        {
          this.amO = 4;
          this.state = 1;
          break;
        }
      case 1: 
        byte[] arrayOfByte = this.amM.data;
        i = Math.min(paramj.me(), 15 - this.amO);
        paramj.readBytes(arrayOfByte, this.amO, i);
        this.amO += i;
        if (this.amO == 15) {}
        for (i = 1; i != 0; i = 0)
        {
          arrayOfByte = this.amM.data;
          if (this.aep == null)
          {
            this.aep = com.google.android.exoplayer2.a.h.a(arrayOfByte, this.amX, this.aem);
            this.alX.f(this.aep);
          }
          this.sampleSize = com.google.android.exoplayer2.a.h.h(arrayOfByte);
          this.amQ = ((int)(com.google.android.exoplayer2.a.h.g(arrayOfByte) * 1000000L / this.aep.sampleRate));
          this.amM.setPosition(0);
          this.alX.a(this.amM, 15);
          this.state = 2;
          break;
        }
      case 2: 
        i = Math.min(paramj.me(), this.sampleSize - this.amO);
        this.alX.a(paramj, i);
        this.amO = (i + this.amO);
        if (this.amO == this.sampleSize)
        {
          this.alX.a(this.aih, 1, this.sampleSize, 0, null);
          this.aih += this.amQ;
          this.state = 0;
        }
        break;
      }
    }
  }
  
  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aih = paramLong;
  }
  
  public final void jX()
  {
    this.state = 0;
    this.amO = 0;
    this.ang = 0;
  }
  
  public final void jY() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/c/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */