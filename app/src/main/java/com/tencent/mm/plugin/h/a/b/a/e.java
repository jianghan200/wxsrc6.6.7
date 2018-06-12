package com.tencent.mm.plugin.h.a.b.a;

import com.tencent.mm.plugin.h.a.b.h;

public class e
  extends a
{
  static final String TAG = e.class.getName();
  public static final String hia = h.hgS;
  public static final String hib = h.hgT;
  public static final String hic = h.hgU;
  public static final String hid = h.hgV;
  public byte hie = 0;
  public byte hif = 0;
  public byte hig = 0;
  public byte hih = 0;
  public byte[] hii = { 0, 0 };
  public int hij = -1;
  public byte hik = 0;
  public byte hil = 0;
  public byte[] him = null;
  
  public e()
  {
    this.hhi = null;
    this.hhj = 8;
    this.hgC = 16L;
  }
  
  public final byte[] atV()
  {
    Object localObject;
    if (this.hhi.equalsIgnoreCase(hia))
    {
      localObject = new byte[3];
      System.arraycopy(Byte.valueOf(this.hie), 0, localObject, 0, 1);
      System.arraycopy(Byte.valueOf(this.hif), 0, localObject, 1, 1);
      System.arraycopy(Byte.valueOf(this.hig), 0, localObject, 2, 1);
    }
    byte[] arrayOfByte;
    do
    {
      return (byte[])localObject;
      if (this.hhi.equalsIgnoreCase(hib))
      {
        localObject = new byte[1];
        System.arraycopy(Byte.valueOf(this.hih), 0, localObject, 0, 1);
        return (byte[])localObject;
      }
      if (!this.hhi.equalsIgnoreCase(hid)) {
        break;
      }
      arrayOfByte = new byte[this.hij];
      byte b1 = (byte)(this.hij & 0xFF);
      byte b2 = (byte)(this.hij >> 8 & 0xFF);
      System.arraycopy(Byte.valueOf(b1), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(b2), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.hik), 0, arrayOfByte, 2, 1);
      localObject = arrayOfByte;
    } while (this.hij <= 3);
    System.arraycopy(this.him, 0, arrayOfByte, 3, this.hij - 3);
    return arrayOfByte;
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/h/a/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */