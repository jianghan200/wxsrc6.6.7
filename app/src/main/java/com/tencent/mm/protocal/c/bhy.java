package com.tencent.mm.protocal.c;

public final class bhy
  extends com.tencent.mm.bk.a
{
  public int siI;
  private boolean siJ;
  public com.tencent.mm.bk.b siK;
  public boolean siL;
  
  private bhy CR(int paramInt)
  {
    this.siI = paramInt;
    this.siJ = true;
    return this;
  }
  
  private bhy cgw()
  {
    if (!this.siJ) {
      throw new f.a.a.b("Not all required fields were included (false = not included in message),  iLen:" + this.siJ);
    }
    return this;
  }
  
  public final bhy S(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = com.tencent.mm.bk.b.t(paramArrayOfByte, 0, paramInt);
    b(paramArrayOfByte);
    CR(paramArrayOfByte.lR.length);
    return this;
  }
  
  public final void a(f.a.a.c.a parama)
  {
    parama.fT(1, this.siI);
    if (this.siL) {
      parama.b(2, this.siK);
    }
  }
  
  public final boolean a(f.a.a.a.a parama, com.tencent.mm.bk.a parama1, int paramInt)
  {
    parama1 = (bhy)parama1;
    switch (paramInt)
    {
    default: 
      return false;
    case 1: 
      parama1.CR(parama.vHC.rY());
      return true;
    }
    parama1.b(parama.cJR());
    return true;
  }
  
  public final bhy b(com.tencent.mm.bk.b paramb)
  {
    if (paramb == null) {
      bq(null);
    }
    this.siK = paramb;
    this.siL = true;
    CR(this.siK.lR.length);
    return this;
  }
  
  public final int boi()
  {
    int j = f.a.a.a.fQ(1, this.siI) + 0;
    int i = j;
    if (this.siL) {
      i = j + f.a.a.a.a(2, this.siK);
    }
    return i + 0;
  }
  
  public final bhy bq(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = com.tencent.mm.bk.b.bi(paramArrayOfByte);
    b(paramArrayOfByte);
    CR(paramArrayOfByte.lR.length);
    return this;
  }
  
  public final bhy br(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new f.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    for (int i = a(paramArrayOfByte);; i = a(paramArrayOfByte))
    {
      if (i <= 0) {
        return cgw();
      }
      if (!a(paramArrayOfByte, this, i)) {
        paramArrayOfByte.cJS();
      }
    }
  }
  
  public final byte[] toByteArray()
  {
    cgw();
    return super.toByteArray();
  }
  
  public final String toString()
  {
    String str2 = new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString() + "iLen = " + this.siI + "   ";
    String str1 = str2;
    if (this.siL) {
      str1 = str2 + "Buffer = " + this.siK + "   ";
    }
    return str1 + ")";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */