package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "ABTestItem") };
  private final e diF;
  
  public d(e parame)
  {
    super(parame, c.dhO, "ABTestItem", null);
    this.diF = parame;
  }
  
  public final Map<String, c> XF(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (paramString = null; (paramString == null) || (!paramString.moveToFirst()); paramString = rawQuery(String.format("select * from %s where %s = %s", new Object[] { "ABTestItem", "business", paramString }), new String[0]))
    {
      if (paramString != null) {
        paramString.close();
      }
      return new HashMap(0);
    }
    HashMap localHashMap = new HashMap();
    do
    {
      c localc = new c();
      localc.d(paramString);
      localHashMap.put(localc.field_layerId, localc);
    } while (paramString.moveToNext());
    paramString.close();
    return localHashMap;
  }
  
  public final LinkedList<uj> cko()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = axc();
    if ((localCursor == null) || (!localCursor.moveToFirst())) {
      return localLinkedList;
    }
    c localc = new c();
    for (;;)
    {
      localc.d(localCursor);
      uj localuj = new uj();
      try
      {
        localuj.rvu = bi.getInt(localc.field_expId, 0);
        localuj.priority = localc.field_prioritylevel;
        localLinkedList.add(localuj);
        if (localCursor.moveToNext()) {
          continue;
        }
        localCursor.close();
        return localLinkedList;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.ABTestStorage", "expId parse failed, %s", new Object[] { localc.field_expId });
        }
      }
    }
  }
  
  public final String ckp()
  {
    Cursor localCursor = axc();
    if (localCursor == null) {
      return "null cursor!!";
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return "cursor empty!!";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    c localc = new c();
    do
    {
      localStringBuilder.append("============\n");
      localc.d(localCursor);
      localStringBuilder.append("layerId = ").append(localc.field_layerId).append("\n");
      localStringBuilder.append("sequence = ").append(localc.field_sequence).append("\n");
      localStringBuilder.append("priorityLV = ").append(localc.field_prioritylevel).append("\n");
      localStringBuilder.append("expId = ").append(localc.field_expId).append("\n");
    } while (localCursor.moveToNext());
    localCursor.close();
    return localStringBuilder.toString();
  }
  
  public final c fJ(String paramString)
  {
    c localc = new c();
    localc.field_layerId = paramString;
    boolean bool = super.b(localc, new String[0]);
    if ((bool) && (localc.field_endTime == 0L)) {
      localc.field_endTime = Long.MAX_VALUE;
    }
    x.i("MicroMsg.ABTestStorage", "getByLayerId, id: %s, return: %b", new Object[] { paramString, Boolean.valueOf(bool) });
    return localc;
  }
  
  public final void j(List<c> paramList, int paramInt)
  {
    int i = 0;
    long l = bi.VE();
    this.diF.delete("ABTestItem", String.format(Locale.US, "%s<>0 and %s<%d", new Object[] { "endTime", "endTime", Long.valueOf(l) }), null);
    c localc1;
    if (paramInt == 0)
    {
      localc1 = new c();
      localc1.field_prioritylevel = 1;
      a(localc1, false, new String[] { "prioritylevel" });
    }
    paramList = paramList.iterator();
    paramInt = i;
    boolean bool;
    if (paramList.hasNext())
    {
      localc1 = (c)paramList.next();
      if ((localc1 == null) || (bi.oW(localc1.field_layerId)))
      {
        x.e("MicroMsg.ABTestStorage", "saveIfNecessary, Invalid item");
        bool = false;
        label141:
        if (!bool) {
          break label434;
        }
        paramInt = 1;
      }
    }
    label434:
    for (;;)
    {
      break;
      c localc2 = new c();
      localc2.field_layerId = localc1.field_layerId;
      if (!super.b(localc2, new String[0]))
      {
        bool = super.a(localc1, false);
        x.i("MicroMsg.ABTestStorage", "Inserted: %s, Result: %b", new Object[] { localc1.field_layerId, Boolean.valueOf(bool) });
        break label141;
      }
      if (((localc1.field_sequence > localc2.field_sequence) && (localc1.field_prioritylevel == localc2.field_prioritylevel)) || (localc1.field_prioritylevel > localc2.field_prioritylevel))
      {
        bool = super.b(localc1, false, new String[0]);
        x.i("MicroMsg.ABTestStorage", "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { localc1.field_layerId, Boolean.valueOf(bool), Long.valueOf(localc2.field_sequence), Long.valueOf(localc1.field_sequence), Integer.valueOf(localc2.field_prioritylevel), Integer.valueOf(localc1.field_prioritylevel) });
        break label141;
      }
      x.i("MicroMsg.ABTestStorage", "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { localc1.field_layerId, Long.valueOf(localc2.field_sequence), Long.valueOf(localc1.field_sequence), Integer.valueOf(localc2.field_prioritylevel), Integer.valueOf(localc1.field_prioritylevel) });
      bool = false;
      break label141;
      if (paramInt != 0) {
        Xp("event_updated");
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */