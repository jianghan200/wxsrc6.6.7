package com.google.android.exoplayer2.c.c;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.q;

public final class o
  implements u
{
  private long aih;
  private q alB;
  private int amO;
  private final h aoB;
  private final i aoC;
  private boolean aoD;
  private boolean aoE;
  private boolean aoF;
  private int aoG;
  private int aoH;
  private boolean aoI;
  private int state;
  
  public o(h paramh)
  {
    this.aoB = paramh;
    this.aoC = new i(new byte[10]);
    this.state = 0;
  }
  
  private boolean a(j paramj, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramj.me(), paramInt - this.amO);
    if (i <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramj.da(i);
    }
    for (;;)
    {
      this.amO = (i + this.amO);
      if (this.amO == paramInt) {
        break;
      }
      return false;
      paramj.readBytes(paramArrayOfByte, this.amO, i);
    }
  }
  
  private void setState(int paramInt)
  {
    this.state = paramInt;
    this.amO = 0;
  }
  
  public final void a(j paramj, boolean paramBoolean)
  {
    if (paramBoolean) {
      switch (this.state)
      {
      case 0: 
      case 1: 
      case 2: 
      default: 
        setState(1);
      }
    }
    for (;;)
    {
      if (paramj.me() > 0)
      {
        int i;
        switch (this.state)
        {
        default: 
          break;
        case 0: 
          paramj.da(paramj.me());
          continue;
          if (this.aoH != -1) {
            new StringBuilder("Unexpected start indicator: expected ").append(this.aoH).append(" more bytes");
          }
          this.aoB.jY();
          break;
        case 1: 
          if (a(paramj, this.aoC.data, 9))
          {
            this.aoC.setPosition(0);
            if (this.aoC.cY(24) != 1)
            {
              this.aoH = -1;
              i = 0;
              if (i == 0) {
                break label326;
              }
            }
            for (i = 2;; i = 0)
            {
              setState(i);
              break;
              this.aoC.cX(8);
              i = this.aoC.cY(16);
              this.aoC.cX(5);
              this.aoI = this.aoC.mb();
              this.aoC.cX(2);
              this.aoD = this.aoC.mb();
              this.aoE = this.aoC.mb();
              this.aoC.cX(6);
              this.aoG = this.aoC.cY(8);
              if (i == 0) {}
              for (this.aoH = -1;; this.aoH = (i + 6 - 9 - this.aoG))
              {
                i = 1;
                break;
              }
            }
          }
          break;
        case 2: 
          i = Math.min(10, this.aoG);
          if ((a(paramj, this.aoC.data, i)) && (a(paramj, null, this.aoG)))
          {
            this.aoC.setPosition(0);
            this.aih = -9223372036854775807L;
            if (this.aoD)
            {
              this.aoC.cX(4);
              long l1 = this.aoC.cY(3);
              this.aoC.cX(1);
              long l2 = this.aoC.cY(15) << 15;
              this.aoC.cX(1);
              long l3 = this.aoC.cY(15);
              this.aoC.cX(1);
              if ((!this.aoF) && (this.aoE))
              {
                this.aoC.cX(4);
                long l4 = this.aoC.cY(3);
                this.aoC.cX(1);
                long l5 = this.aoC.cY(15) << 15;
                this.aoC.cX(1);
                long l6 = this.aoC.cY(15);
                this.aoC.cX(1);
                this.alB.T(l4 << 30 | l5 | l6);
                this.aoF = true;
              }
              this.aih = this.alB.T(l1 << 30 | l2 | l3);
            }
            this.aoB.d(this.aih, this.aoI);
            setState(3);
          }
          break;
        case 3: 
          label326:
          int k = paramj.me();
          if (this.aoH == -1) {}
          for (i = 0;; i = k - this.aoH)
          {
            int j = k;
            if (i > 0)
            {
              j = k - i;
              paramj.cZ(paramj.position + j);
            }
            this.aoB.b(paramj);
            if (this.aoH == -1) {
              break;
            }
            this.aoH -= j;
            if (this.aoH != 0) {
              break;
            }
            this.aoB.jY();
            setState(1);
            break;
          }
        }
      }
    }
  }
  
  public final void a(q paramq, f paramf, u.d paramd)
  {
    this.alB = paramq;
    this.aoB.a(paramf, paramd);
  }
  
  public final void jX()
  {
    this.state = 0;
    this.amO = 0;
    this.aoF = false;
    this.aoB.jX();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/c/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */