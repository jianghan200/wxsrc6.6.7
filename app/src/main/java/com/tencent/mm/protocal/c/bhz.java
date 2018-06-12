package com.tencent.mm.protocal.c;

public final class bhz
  extends com.tencent.mm.bk.a
{
  public String siM;
  public boolean siN;
  
  public final bhz VO(String paramString)
  {
    this.siM = paramString;
    this.siN = true;
    return this;
  }
  
  public final void a(f.a.a.c.a parama)
  {
    if (this.siN) {
      parama.g(1, this.siM);
    }
  }
  
  public final boolean a(f.a.a.a.a parama, com.tencent.mm.bk.a parama1, int paramInt)
  {
    parama1 = (bhz)parama1;
    switch (paramInt)
    {
    default: 
      return false;
    }
    parama1.VO(parama.vHC.readString());
    return true;
  }
  
  public final int boi()
  {
    int i = 0;
    if (this.siN) {
      i = f.a.a.b.b.a.h(1, this.siM) + 0;
    }
    return i + 0;
  }
  
  public final byte[] toByteArray()
  {
    return super.toByteArray();
  }
  
  public final String toString()
  {
    return this.siM;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */