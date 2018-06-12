package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "ABTestInfo") };
  private e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "ABTestInfo", null);
    this.diF = parame;
  }
  
  public final a XE(String paramString)
  {
    a locala = new a();
    locala.field_abtestkey = paramString;
    boolean bool = super.b(locala, new String[0]);
    if ((bool) && (locala.field_endTime == 0L)) {
      locala.field_endTime = Long.MAX_VALUE;
    }
    x.i("MicroMsg.ABTestInfoStorage", "getByLayerId, id: %s, return: %b", new Object[] { paramString, Boolean.valueOf(bool) });
    return locala;
  }
  
  public final LinkedList<uj> cko()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = axc();
    if (localCursor == null) {
      return localLinkedList;
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return localLinkedList;
    }
    a locala = new a();
    for (;;)
    {
      locala.d(localCursor);
      uj localuj = new uj();
      try
      {
        localuj.rvu = bi.getInt(locala.field_expId, 0);
        localuj.priority = locala.field_prioritylevel;
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
          x.e("MicroMsg.ABTestInfoStorage", "expId parse failed, %s", new Object[] { locala.field_expId });
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
    a locala = new a();
    do
    {
      localStringBuilder.append("============\n");
      locala.d(localCursor);
      localStringBuilder.append("abtestkey = ").append(locala.field_abtestkey).append("\n");
      localStringBuilder.append("sequence = ").append(locala.field_sequence).append("\n");
      localStringBuilder.append("priorityLV = ").append(locala.field_prioritylevel).append("\n");
      localStringBuilder.append("expId = ").append(locala.field_expId).append("\n");
    } while (localCursor.moveToNext());
    localCursor.close();
    return localStringBuilder.toString();
  }
  
  public final int da(String paramString, int paramInt)
  {
    paramString = XE(paramString);
    int i = paramInt;
    if (paramString.isValid()) {
      i = bi.getInt(paramString.field_value, paramInt);
    }
    return i;
  }
  
  public final String getExpIdByKey(String paramString)
  {
    paramString = XE(paramString);
    if (paramString.isValid())
    {
      if (paramString.field_expId == null) {
        return "";
      }
      return paramString.field_expId;
    }
    return "";
  }
  
  public final void j(List<a> paramList, int paramInt)
  {
    int i = 0;
    long l = bi.VE();
    this.diF.delete("ABTestInfo", String.format(Locale.US, "%s<>0 and %s<%d", new Object[] { "endTime", "endTime", Long.valueOf(l) }), null);
    a locala1;
    if (1 == paramInt)
    {
      locala1 = new a();
      locala1.field_prioritylevel = 1;
      a(locala1, false, new String[] { "prioritylevel" });
    }
    paramList = paramList.iterator();
    paramInt = i;
    boolean bool;
    if (paramList.hasNext())
    {
      locala1 = (a)paramList.next();
      if ((locala1 == null) || (bi.oW(locala1.field_abtestkey)))
      {
        x.e("MicroMsg.ABTestInfoStorage", "saveIfNecessary, Invalid item");
        bool = false;
        label142:
        if (!bool) {
          break label433;
        }
        paramInt = 1;
      }
    }
    label433:
    for (;;)
    {
      break;
      a locala2 = new a();
      locala2.field_abtestkey = locala1.field_abtestkey;
      if (!super.b(locala2, new String[0]))
      {
        bool = super.a(locala1, false);
        x.i("MicroMsg.ABTestInfoStorage", "Inserted: %s, Result: %b", new Object[] { locala1.field_abtestkey, Boolean.valueOf(bool) });
        break label142;
      }
      if (((locala1.field_sequence > locala2.field_sequence) && (locala1.field_prioritylevel == locala2.field_prioritylevel)) || (locala1.field_prioritylevel > locala2.field_prioritylevel))
      {
        bool = super.b(locala1, false, new String[0]);
        x.i("MicroMsg.ABTestInfoStorage", "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { locala1.field_abtestkey, Boolean.valueOf(bool), Long.valueOf(locala2.field_sequence), Long.valueOf(locala1.field_sequence), Integer.valueOf(locala2.field_prioritylevel), Integer.valueOf(locala1.field_prioritylevel) });
        break label142;
      }
      x.i("MicroMsg.ABTestInfoStorage", "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { locala1.field_abtestkey, Long.valueOf(locala2.field_sequence), Long.valueOf(locala1.field_sequence), Integer.valueOf(locala2.field_prioritylevel), Integer.valueOf(locala1.field_prioritylevel) });
      bool = false;
      break label142;
      if (paramInt != 0) {
        Xp("event_updated");
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/storage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */