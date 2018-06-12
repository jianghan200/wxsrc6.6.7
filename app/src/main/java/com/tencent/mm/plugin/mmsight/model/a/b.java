package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  int bYE;
  int kGn;
  int kGo;
  byte[] lho;
  byte[] lhp;
  int lhq = 0;
  int lhr = 0;
  long lhs = bi.VG();
  int lht;
  int lhu;
  int lhv;
  int lhw;
  boolean lhx;
  boolean lhy;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, int paramInt6, byte[] paramArrayOfByte)
  {
    this.lhv = paramInt3;
    this.kGn = paramInt4;
    this.kGo = paramInt5;
    this.lht = paramInt1;
    this.lhu = paramInt2;
    this.lhy = paramBoolean2;
    this.lhx = paramBoolean1;
    this.bYE = paramInt6;
    this.lho = paramArrayOfByte;
    this.lhq = paramArrayOfByte.length;
    this.lhp = j.lin.i(Integer.valueOf(paramInt4 * paramInt5 * 3 / 2));
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */