package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a.a;
import com.google.android.exoplayer2.a.a.a;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.j;

public final class b
  implements h
{
  private final String aem;
  private Format aep;
  long aih;
  private k alX;
  private final i amL = new i(new byte[8]);
  private final j amM = new j(this.amL.data);
  private String amN;
  private int amO;
  private boolean amP;
  private long amQ;
  private int sampleSize;
  private int state = 0;
  
  public b()
  {
    this(null);
  }
  
  public b(String paramString)
  {
    this.aem = paramString;
  }
  
  public final void a(f paramf, u.d paramd)
  {
    paramd.kf();
    this.amN = paramd.kh();
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
        boolean bool;
        if (paramj.me() > 0)
        {
          if (!this.amP)
          {
            if (paramj.readUnsignedByte() == 11) {}
            for (bool = true;; bool = false)
            {
              this.amP = bool;
              break;
            }
          }
          i = paramj.readUnsignedByte();
          if (i == 119) {
            this.amP = false;
          }
        }
        for (i = 1; i != 0; i = 0)
        {
          this.state = 1;
          this.amM.data[0] = 11;
          this.amM.data[1] = 119;
          this.amO = 2;
          break;
          if (i == 11) {}
          for (bool = true;; bool = false)
          {
            this.amP = bool;
            break;
          }
        }
      case 1: 
        Object localObject = this.amM.data;
        i = Math.min(paramj.me(), 8 - this.amO);
        paramj.readBytes((byte[])localObject, this.amO, i);
        this.amO += i;
        if (this.amO == 8) {}
        for (i = 1; i != 0; i = 0)
        {
          this.amL.setPosition(0);
          localObject = a.a(this.amL);
          if ((this.aep == null) || (((a.a)localObject).aeg != this.aep.aeg) || (((a.a)localObject).sampleRate != this.aep.sampleRate) || (((a.a)localObject).mimeType != this.aep.adW))
          {
            this.aep = Format.a(this.amN, ((a.a)localObject).mimeType, -1, -1, ((a.a)localObject).aeg, ((a.a)localObject).sampleRate, null, null, this.aem);
            this.alX.f(this.aep);
          }
          this.sampleSize = ((a.a)localObject).aft;
          this.amQ = (1000000L * ((a.a)localObject).sampleCount / this.aep.sampleRate);
          this.amM.setPosition(0);
          this.alX.a(this.amM, 8);
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
    this.amP = false;
  }
  
  public final void jY() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/c/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */