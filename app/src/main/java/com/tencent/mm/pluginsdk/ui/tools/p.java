package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.x;

public final class p
{
  h.d gbg = h.d.qFy;
  int hmV;
  int hmW;
  boolean qTC;
  int qUm;
  int qUn;
  int videoHeight;
  int videoWidth;
  
  final void reset()
  {
    this.hmW = 0;
    this.hmV = 0;
    this.videoHeight = 0;
    this.videoWidth = 0;
    this.qUn = 0;
    this.qUm = 0;
  }
  
  final void setScaleType(h.d paramd)
  {
    x.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", new Object[] { this.gbg, paramd });
    this.gbg = paramd;
    reset();
  }
  
  final boolean x(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.hmV == paramInt1) && (this.hmW == paramInt2) && (this.videoWidth == paramInt3) && (this.videoHeight == paramInt4)) {
      return true;
    }
    this.hmV = paramInt1;
    this.hmW = paramInt2;
    this.videoWidth = paramInt3;
    this.videoHeight = paramInt4;
    float f1 = this.videoWidth * 1.0F / this.videoHeight;
    float f2 = this.hmV * 1.0F / this.hmW;
    if (this.gbg != h.d.qFy) {
      if (this.gbg == h.d.qFA) {
        if (this.hmV < this.hmW)
        {
          this.qUn = ((int)(this.hmV / f1));
          this.qUm = this.hmV;
          if (this.qUn <= this.hmW) {}
        }
      }
    }
    label642:
    for (;;)
    {
      p localp = this;
      localp.qUm = ((int)(localp.hmW * f1));
      localp.qUn = localp.hmW;
      for (;;)
      {
        x.d("MicroMsg.ViewSizeCache", "screen[%d, %d], video[%d, %d], measure[%d, %d] scale[%f, %f]", new Object[] { Integer.valueOf(this.hmV), Integer.valueOf(this.hmW), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.qUm), Integer.valueOf(this.qUn), Float.valueOf(f2), Float.valueOf(f1) });
        return false;
        this.qUm = ((int)(this.hmW * f1));
        this.qUn = this.hmW;
        if (this.qUm > this.hmV)
        {
          this.qUn = ((int)(this.hmV / f1));
          this.qUm = this.hmV;
          continue;
          if (this.gbg == h.d.qFz)
          {
            this.qUn = this.hmW;
            this.qUm = this.hmV;
          }
          else
          {
            if (this.gbg == h.d.qFB)
            {
              if (this.hmV > this.hmW)
              {
                this.qUn = ((int)(this.hmV / f1));
                this.qUm = this.hmV;
                if (this.qUn >= this.hmW) {
                  continue;
                }
                break;
              }
              this.qUm = ((int)(this.hmW * f1));
              this.qUn = this.hmW;
              if (this.qUm >= this.hmV) {
                continue;
              }
              this.qUn = ((int)(this.hmV / f1));
              this.qUm = this.hmV;
              continue;
            }
            if (!this.qTC)
            {
              if (this.hmV < this.hmW)
              {
                this.qUn = ((int)(this.hmV / f1));
                this.qUm = this.hmV;
              }
              else
              {
                this.qUm = ((int)(this.hmW * f1));
                this.qUn = this.hmW;
              }
            }
            else if (Math.abs(f1 - f2) > 0.05D)
            {
              if (this.hmV < this.hmW)
              {
                this.qUn = ((int)(this.hmV / f1));
                this.qUm = this.hmV;
              }
              else
              {
                this.qUm = ((int)(this.hmW * f1));
                this.qUn = this.hmW;
              }
            }
            else
            {
              if (this.hmV <= this.hmW) {
                break label642;
              }
              this.qUn = ((int)(this.hmV / f1));
              this.qUm = this.hmV;
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */