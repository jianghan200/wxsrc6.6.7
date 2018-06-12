package com.tencent.mm.plugin.fts.a.b;

import java.util.List;

final class a
{
  public List<a> ayR;
  public int end;
  public a jsN;
  public boolean jsO;
  public int start;
  
  public a(int paramInt1, int paramInt2, a parama)
  {
    this.start = paramInt1;
    this.end = paramInt2;
    this.jsN = parama;
  }
  
  public final String toString()
  {
    if (this.jsN == null) {
      return String.format("[%d,%d]", new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.end) });
    }
    return String.format("%s [%d,%d]", new Object[] { this.jsN, Integer.valueOf(this.start), Integer.valueOf(this.end) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */