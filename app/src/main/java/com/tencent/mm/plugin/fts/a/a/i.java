package com.tencent.mm.plugin.fts.a.a;

import com.tencent.mm.sdk.platformtools.ag;
import java.util.Comparator;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class i
{
  private static final AtomicInteger jsm = new AtomicInteger(0);
  public String bWm = null;
  public ag handler = null;
  public final int id = jsm.incrementAndGet();
  public int jsn = 0;
  public String jso = null;
  public String jsp = null;
  public int[] jsq = null;
  public int[] jsr = null;
  public int jss = Integer.MAX_VALUE;
  public HashSet<String> jst = new HashSet();
  public Comparator<l> jsu = null;
  public com.tencent.mm.plugin.fts.a.l jsv = null;
  public int scene = -1;
  public String talker = null;
  
  public static i a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt, HashSet<String> paramHashSet, Comparator<l> paramComparator, com.tencent.mm.plugin.fts.a.l paraml, ag paramag)
  {
    i locali = new i();
    locali.bWm = paramString;
    locali.jso = null;
    locali.jsq = paramArrayOfInt1;
    locali.jsr = paramArrayOfInt2;
    locali.jss = paramInt;
    locali.jst = paramHashSet;
    locali.jsu = paramComparator;
    locali.jsv = paraml;
    locali.handler = paramag;
    return locali;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (i)paramObject;
    } while (this.id == ((i)paramObject).id);
    return false;
  }
  
  public String toString()
  {
    return String.format("{id: %d, query: %s}", new Object[] { Integer.valueOf(this.id), this.bWm });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */