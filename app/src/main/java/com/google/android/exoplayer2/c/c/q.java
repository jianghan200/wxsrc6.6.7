package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;

public final class q
  implements u
{
  private int amO;
  private final p aoJ;
  private final j aoK;
  private int aoL;
  private boolean aoM;
  private boolean aoN;
  
  public q(p paramp)
  {
    this.aoJ = paramp;
    this.aoK = new j(32);
  }
  
  public final void a(j paramj, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = paramj.readUnsignedByte() + paramj.position;; i = -1)
    {
      if (this.aoN)
      {
        if (!paramBoolean) {
          return;
        }
        this.aoN = false;
        paramj.setPosition(i);
        this.amO = 0;
      }
      label41:
      while (paramj.me() > 0) {
        if (this.amO < 3)
        {
          if (this.amO == 0)
          {
            i = paramj.readUnsignedByte();
            paramj.setPosition(paramj.position - 1);
            if (i == 255)
            {
              this.aoN = true;
              return;
            }
          }
          i = Math.min(paramj.me(), 3 - this.amO);
          paramj.readBytes(this.aoK.data, this.amO, i);
          this.amO = (i + this.amO);
          if (this.amO == 3)
          {
            this.aoK.reset(3);
            this.aoK.da(1);
            i = this.aoK.readUnsignedByte();
            int j = this.aoK.readUnsignedByte();
            if ((i & 0x80) != 0) {}
            for (paramBoolean = true;; paramBoolean = false)
            {
              this.aoM = paramBoolean;
              this.aoL = (((i & 0xF) << 8 | j) + 3);
              if (this.aoK.capacity() >= this.aoL) {
                break;
              }
              byte[] arrayOfByte = this.aoK.data;
              this.aoK.reset(Math.min(4098, Math.max(this.aoL, arrayOfByte.length * 2)));
              System.arraycopy(arrayOfByte, 0, this.aoK.data, 0, 3);
              break;
            }
          }
        }
        else
        {
          i = Math.min(paramj.me(), this.aoL - this.amO);
          paramj.readBytes(this.aoK.data, this.amO, i);
          this.amO = (i + this.amO);
          if (this.amO == this.aoL)
          {
            if (!this.aoM) {
              break label393;
            }
            if (t.l(this.aoK.data, this.aoL, -1) != 0)
            {
              this.aoN = true;
              return;
            }
            this.aoK.reset(this.aoL - 4);
          }
        }
      }
      for (;;)
      {
        this.aoJ.b(this.aoK);
        this.amO = 0;
        break label41;
        break;
        label393:
        this.aoK.reset(this.aoL);
      }
    }
  }
  
  public final void a(com.google.android.exoplayer2.i.q paramq, f paramf, u.d paramd)
  {
    this.aoJ.a(paramq, paramf, paramd);
    this.aoN = true;
  }
  
  public final void jX()
  {
    this.aoN = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */