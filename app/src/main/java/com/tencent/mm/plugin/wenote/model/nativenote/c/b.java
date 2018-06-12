package com.tencent.mm.plugin.wenote.model.nativenote.c;

public final class b
{
  public float fto = -1.0F;
  public float ftp = -1.0F;
  public int hER = 0;
  public float qrP = -1.0F;
  public float qrQ = -1.0F;
  public int qrR = -1;
  public float qrS = -1.0F;
  public float qrT = -1.0F;
  public float qrU = -1.0F;
  public float qrV = -1.0F;
  public int qrW = -1;
  
  public final void a(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt2)
  {
    this.hER = paramInt1;
    this.qrP = paramFloat1;
    this.qrQ = paramFloat2;
    this.fto = paramFloat3;
    this.ftp = paramFloat4;
    if (this.hER == 1)
    {
      this.qrR = paramInt2;
      return;
    }
    this.qrR = 0;
  }
  
  public final int getType()
  {
    int j = 0;
    if ((this.qrP >= 0.0F) && (this.qrQ >= 0.0F) && (this.fto >= 0.0F) && (this.ftp >= 0.0F) && (this.qrR >= 0)) {}
    for (int i = 1; i == 0; i = 0) {
      return 0;
    }
    i = j;
    if (this.qrS >= 0.0F)
    {
      i = j;
      if (this.qrT >= 0.0F)
      {
        i = j;
        if (this.qrU >= 0.0F)
        {
          i = j;
          if (this.qrV >= 0.0F)
          {
            i = j;
            if (this.qrW >= 0) {
              i = 1;
            }
          }
        }
      }
    }
    if (i == 0) {
      return 1;
    }
    i = Math.abs((int)(this.fto - this.qrU));
    j = Math.abs((int)(this.ftp - this.qrV));
    if ((i > 30) || (j > 30) || (this.qrR != this.qrW)) {
      return 3;
    }
    return 2;
  }
  
  public final void reset()
  {
    this.hER = 0;
    this.qrP = -1.0F;
    this.qrQ = -1.0F;
    this.fto = -1.0F;
    this.ftp = -1.0F;
    this.qrR = -1;
    this.qrS = -1.0F;
    this.qrT = -1.0F;
    this.qrU = -1.0F;
    this.qrV = -1.0F;
    this.qrW = -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */