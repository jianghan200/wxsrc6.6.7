package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;

public final class m
{
  private int type = -1;
  protected final a vpb;
  public int vpc;
  private int vpd;
  
  public m(a parama, int paramInt)
  {
    this.vpb = parama;
    this.type = paramInt;
  }
  
  public m(k paramk, int paramInt)
  {
    this(new k.1(paramk), paramInt);
  }
  
  private void Hw(int paramInt)
  {
    if (cGC() != paramInt) {
      throw new IllegalStateException(String.format("Expected %x but was %x", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(cGC()) }));
    }
  }
  
  public final int cGC()
  {
    if (this.type == -1)
    {
      int i = this.vpb.readByte() & 0xFF;
      this.type = (i & 0x1F);
      this.vpd = ((i & 0xE0) >> 5);
    }
    return this.type;
  }
  
  public final int cGD()
  {
    Hw(28);
    this.type = -1;
    return o.b(this.vpb);
  }
  
  public final int cGE()
  {
    Hw(29);
    this.type = -1;
    this.vpc = o.b(this.vpb);
    return o.b(this.vpb);
  }
  
  public final int cGF()
  {
    return o.b(this.vpb);
  }
  
  public final int cGG()
  {
    Hw(23);
    this.type = -1;
    return l.a(this.vpb, this.vpd, false);
  }
  
  public final int cGH()
  {
    Hw(24);
    this.type = -1;
    return l.a(this.vpb, this.vpd, false);
  }
  
  public final int cGI()
  {
    Hw(25);
    this.type = -1;
    return l.a(this.vpb, this.vpd, false);
  }
  
  public final int cGJ()
  {
    Hw(27);
    this.type = -1;
    return l.a(this.vpb, this.vpd, false);
  }
  
  public final int cGK()
  {
    Hw(26);
    this.type = -1;
    return l.a(this.vpb, this.vpd, false);
  }
  
  public final void cGL()
  {
    Hw(30);
    this.type = -1;
  }
  
  public final boolean readBoolean()
  {
    Hw(31);
    this.type = -1;
    return this.vpd != 0;
  }
  
  public final byte readByte()
  {
    Hw(0);
    this.type = -1;
    return (byte)l.a(this.vpb, this.vpd);
  }
  
  public final char readChar()
  {
    Hw(3);
    this.type = -1;
    return (char)l.a(this.vpb, this.vpd, false);
  }
  
  public final double readDouble()
  {
    Hw(17);
    this.type = -1;
    a locala = this.vpb;
    int i = this.vpd;
    long l = 0L;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return Double.longBitsToDouble(l);
  }
  
  public final float readFloat()
  {
    Hw(16);
    this.type = -1;
    return Float.intBitsToFloat(l.a(this.vpb, this.vpd, true));
  }
  
  public final int readInt()
  {
    Hw(4);
    this.type = -1;
    return l.a(this.vpb, this.vpd);
  }
  
  public final long readLong()
  {
    Hw(6);
    this.type = -1;
    a locala = this.vpb;
    int j = this.vpd;
    long l = 0L;
    int i = j;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return l >> (7 - j) * 8;
  }
  
  public final short readShort()
  {
    Hw(2);
    this.type = -1;
    return (short)l.a(this.vpb, this.vpd);
  }
  
  public final void skipValue()
  {
    int j = 0;
    int i = 0;
    switch (cGC())
    {
    case 1: 
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    default: 
      throw new j("Unexpected type: " + Integer.toHexString(this.type));
    case 0: 
      readByte();
      return;
    case 2: 
      readShort();
      return;
    case 3: 
      readChar();
      return;
    case 4: 
      readInt();
      return;
    case 6: 
      readLong();
      return;
    case 16: 
      readFloat();
      return;
    case 17: 
      readDouble();
      return;
    case 23: 
      cGG();
      return;
    case 24: 
      cGH();
      return;
    case 25: 
      cGI();
      return;
    case 27: 
      cGJ();
      return;
    case 26: 
      cGK();
      return;
    case 28: 
      j = cGD();
      while (i < j)
      {
        skipValue();
        i += 1;
      }
    case 29: 
      int k = cGE();
      i = j;
      while (i < k)
      {
        o.b(this.vpb);
        skipValue();
        i += 1;
      }
    case 30: 
      cGL();
      return;
    }
    readBoolean();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tinker/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */