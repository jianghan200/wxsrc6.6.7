package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.i;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;

public final class m
  implements h
{
  private final String aem;
  private int aft;
  private long aih;
  private k alX;
  private String amX;
  private boolean anb;
  private long ann;
  private final j aot = new j(4);
  private final i aou;
  private int aov;
  private boolean aow;
  private int state = 0;
  
  public m()
  {
    this(null);
  }
  
  public m(String paramString)
  {
    this.aot.data[0] = -1;
    this.aou = new i();
    this.aem = paramString;
  }
  
  public final void a(f paramf, u.d paramd)
  {
    paramd.kf();
    this.amX = paramd.kh();
    this.alX = paramf.cp(paramd.kg());
  }
  
  public final void b(j paramj)
  {
    while (paramj.me() > 0)
    {
      Object localObject;
      int i;
      switch (this.state)
      {
      default: 
        break;
      case 0: 
        localObject = paramj.data;
        i = paramj.position;
        int k = paramj.limit;
        for (;;)
        {
          if (i >= k) {
            break label168;
          }
          boolean bool;
          if ((localObject[i] & 0xFF) == 255)
          {
            bool = true;
            if ((!this.aow) || ((localObject[i] & 0xE0) != 224)) {
              break label156;
            }
          }
          for (int j = 1;; j = 0)
          {
            this.aow = bool;
            if (j == 0) {
              break label161;
            }
            paramj.setPosition(i + 1);
            this.aow = false;
            this.aot.data[1] = localObject[i];
            this.aov = 2;
            this.state = 1;
            break;
            bool = false;
            break label79;
          }
          i += 1;
        }
        paramj.setPosition(k);
        break;
      case 1: 
        i = Math.min(paramj.me(), 4 - this.aov);
        paramj.readBytes(this.aot.data, this.aov, i);
        this.aov = (i + this.aov);
        if (this.aov >= 4)
        {
          this.aot.setPosition(0);
          if (!i.a(this.aot.readInt(), this.aou))
          {
            this.aov = 0;
            this.state = 1;
          }
          else
          {
            this.aft = this.aou.aft;
            if (!this.anb)
            {
              this.ann = (1000000L * this.aou.aiQ / this.aou.sampleRate);
              localObject = Format.a(this.amX, this.aou.mimeType, -1, 4096, this.aou.channels, this.aou.sampleRate, null, null, this.aem);
              this.alX.f((Format)localObject);
              this.anb = true;
            }
            this.aot.setPosition(0);
            this.alX.a(this.aot, 4);
            this.state = 2;
          }
        }
        break;
      case 2: 
        label79:
        label156:
        label161:
        label168:
        i = Math.min(paramj.me(), this.aft - this.aov);
        this.alX.a(paramj, i);
        this.aov = (i + this.aov);
        if (this.aov >= this.aft)
        {
          this.alX.a(this.aih, 1, this.aft, 0, null);
          this.aih += this.ann;
          this.aov = 0;
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
    this.aov = 0;
    this.aow = false;
  }
  
  public final void jY() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */