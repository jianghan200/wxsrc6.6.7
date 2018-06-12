package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bia
  extends com.tencent.mm.bk.a
{
  public int siO;
  private boolean siP;
  
  private bia cgx()
  {
    if (!this.siP) {
      throw new b("Not all required fields were included (false = not included in message),  uiVal:" + this.siP);
    }
    return this;
  }
  
  public final bia CS(int paramInt)
  {
    this.siO = paramInt;
    this.siP = true;
    return this;
  }
  
  public final void a(f.a.a.c.a parama)
  {
    parama.fT(1, this.siO);
  }
  
  public final boolean a(f.a.a.a.a parama, com.tencent.mm.bk.a parama1, int paramInt)
  {
    parama1 = (bia)parama1;
    switch (paramInt)
    {
    default: 
      return false;
    }
    parama1.CS(parama.vHC.rY());
    return true;
  }
  
  public final int boi()
  {
    return f.a.a.a.fQ(1, this.siO) + 0 + 0;
  }
  
  public final byte[] toByteArray()
  {
    cgx();
    return super.toByteArray();
  }
  
  public final String toString()
  {
    return new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString())).append("uiVal = ").append(this.siO).append("   ").toString() + ")";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */