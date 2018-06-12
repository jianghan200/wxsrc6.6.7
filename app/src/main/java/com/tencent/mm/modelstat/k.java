package com.tencent.mm.modelstat;

import android.database.Cursor;

public final class k
{
  private static final String FORMAT;
  int bWA = -2;
  public int ejM = 0;
  public int ejN = 0;
  public int ejO = 0;
  public int ejP = 0;
  public int ejQ = 0;
  public int ejR = 0;
  public int ejS = 0;
  public int ejT = 0;
  public int ejU = 0;
  public int ejV = 0;
  public int ejW = 0;
  public int ejX = 0;
  public int ejY = 0;
  public int ejZ = 0;
  public int eka = 0;
  public int ekb = 0;
  public int ekc = 0;
  public int ekd = 0;
  public int eke = 0;
  public int ekf = 0;
  public int ekg = 0;
  public int ekh = 0;
  public int eki = 0;
  public int ekj = 0;
  public int ekk = 0;
  public int ekl = 0;
  public int ekm = 0;
  public int ekn = 0;
  public int eko = 0;
  public int id = 0;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetStatInfo:");
    localStringBuilder.append("[mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[text in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[image in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[voice in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[video in=%d/%dB, out=%d/%dB]");
    FORMAT = localStringBuilder.toString();
  }
  
  public final void d(Cursor paramCursor)
  {
    this.id = paramCursor.getInt(0);
    this.ejM = paramCursor.getInt(1);
    this.ejN = paramCursor.getInt(2);
    this.ejO = paramCursor.getInt(3);
    this.ejP = paramCursor.getInt(4);
    this.ejQ = paramCursor.getInt(5);
    this.ejR = paramCursor.getInt(6);
    this.ejS = paramCursor.getInt(7);
    this.ejT = paramCursor.getInt(8);
    this.ejU = paramCursor.getInt(9);
    this.ejV = paramCursor.getInt(10);
    this.ejW = paramCursor.getInt(11);
    this.ejX = paramCursor.getInt(12);
    this.ejY = paramCursor.getInt(13);
    this.ejZ = paramCursor.getInt(14);
    this.eka = paramCursor.getInt(15);
    this.ekb = paramCursor.getInt(16);
    this.ekc = paramCursor.getInt(17);
    this.ekd = paramCursor.getInt(18);
    this.eke = paramCursor.getInt(19);
    this.ekf = paramCursor.getInt(20);
    this.ekg = paramCursor.getInt(21);
    this.ekh = paramCursor.getInt(22);
    this.eki = paramCursor.getInt(23);
    this.ekj = paramCursor.getInt(24);
    this.ekk = paramCursor.getInt(25);
    this.ekl = paramCursor.getInt(26);
    this.ekm = paramCursor.getInt(27);
    this.ekn = paramCursor.getInt(28);
    this.eko = paramCursor.getInt(29);
  }
  
  public final String toString()
  {
    return String.format(FORMAT, new Object[] { Integer.valueOf(this.ejV), Integer.valueOf(this.ekl), Integer.valueOf(this.ejX), Integer.valueOf(this.ekh), Integer.valueOf(this.ekn), Integer.valueOf(this.ekj), Integer.valueOf(this.ejW), Integer.valueOf(this.ekm), Integer.valueOf(this.ejY), Integer.valueOf(this.eki), Integer.valueOf(this.eko), Integer.valueOf(this.ekk), Integer.valueOf(this.ejN), Integer.valueOf(this.ejO), Integer.valueOf(this.ejZ), Integer.valueOf(this.eka), Integer.valueOf(this.ejP), Integer.valueOf(this.ejQ), Integer.valueOf(this.ekb), Integer.valueOf(this.ekc), Integer.valueOf(this.ejR), Integer.valueOf(this.ejS), Integer.valueOf(this.ekd), Integer.valueOf(this.eke), Integer.valueOf(this.ejT), Integer.valueOf(this.ejU), Integer.valueOf(this.ekf), Integer.valueOf(this.ekg) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelstat/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */