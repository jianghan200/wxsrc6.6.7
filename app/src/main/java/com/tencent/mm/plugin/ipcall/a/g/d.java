package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "IPCallAddressItem") };
  public static final String[] ksz = { "*", "rowid" };
  public e diF;
  
  public d(e parame)
  {
    super(parame, c.dhO, "IPCallAddressItem", null);
    this.diF = parame;
  }
  
  private Cursor ES(String paramString)
  {
    return this.diF.query("IPCallAddressItem", ksz, "systemAddressBookUsername LIKE ? or sortKey LIKE ?", new String[] { "%" + paramString + "%", "%" + paramString + "%" }, null, null, "upper(sortKey) asc");
  }
  
  public final c EP(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      paramString = this.diF.a("IPCallAddressItem", ksz, "contactId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (paramString.moveToFirst())
        {
          c localc = new c();
          localc.d(paramString);
          return localc;
        }
        return null;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.IPCallAddressStorage", "getByContactId error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final c EQ(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      paramString = this.diF.a("IPCallAddressItem", ksz, "systemAddressBookUsername=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (paramString.moveToFirst())
        {
          c localc = new c();
          localc.d(paramString);
          return localc;
        }
        return null;
      }
      catch (Exception localException)
      {
        x.d("MicroMsg.IPCallAddressStorage", "getByContactName error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final Cursor ER(String paramString)
  {
    System.currentTimeMillis();
    int i = 0;
    if (i < paramString.length()) {
      if (!Character.isDigit(paramString.charAt(i)))
      {
        i = 0;
        label27:
        if (i != 0) {
          break label55;
        }
      }
    }
    for (paramString = ES(paramString);; paramString = this.diF.query("IPCallAddressItem", ksz, "contactId IN " + paramString, null, null, null, "upper(sortKey) asc"))
    {
      System.currentTimeMillis();
      return paramString;
      i += 1;
      break;
      i = 1;
      break label27;
      label55:
      Object localObject1 = a.Fv(paramString);
      paramString = ES(paramString);
      try
      {
        if (paramString.moveToFirst()) {
          while (!paramString.isAfterLast())
          {
            ((ArrayList)localObject1).add(paramString.getString(paramString.getColumnIndex("contactId")));
            paramString.moveToNext();
          }
        }
        String str2;
        str1 = paramString;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.IPCallAddressStorage", "getContactIdList error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
        for (;;)
        {
          localObject1 = ((ArrayList)localObject1).iterator();
          for (paramString = ""; ((Iterator)localObject1).hasNext(); paramString = paramString + str2 + ",") {
            str2 = (String)((Iterator)localObject1).next();
          }
          if (paramString != null) {
            paramString.close();
          }
        }
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
      String str1;
      if (paramString.lastIndexOf(",") >= 0) {
        str1 = paramString.substring(0, paramString.lastIndexOf(","));
      }
      paramString = "(" + str1 + ")";
    }
  }
  
  public final ArrayList<c> aXX()
  {
    Object localObject1 = null;
    localCursor = this.diF.a("IPCallAddressItem", ksz, null, null, null, null, null, 2);
    if (localCursor != null) {}
    while (localCursor == null)
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          continue;
        }
        ArrayList localArrayList = new ArrayList();
        boolean bool;
        do
        {
          c localc = new c();
          localc.d(localCursor);
          localArrayList.add(localc);
          bool = localCursor.moveToNext();
        } while (bool);
        if (localCursor != null) {
          localCursor.close();
        }
        localObject1 = localArrayList;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.IPCallAddressStorage", "getAllAddress, error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (localCursor == null) {
          break;
        }
        localCursor.close();
      }
      return (ArrayList<c>)localObject1;
    }
    localCursor.close();
    return null;
  }
  
  public final c dN(long paramLong)
  {
    Object localObject1 = null;
    localCursor = this.diF.a("IPCallAddressItem", ksz, "rowid=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    do
    {
      try
      {
        if (!localCursor.moveToFirst()) {
          continue;
        }
        c localc = new c();
        localc.d(localCursor);
        if (localCursor != null) {
          localCursor.close();
        }
        localObject1 = localc;
      }
      catch (Exception localException)
      {
        x.d("MicroMsg.IPCallAddressStorage", "getByLocalId error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (localCursor == null) {
          break;
        }
        localCursor.close();
      }
      return (c)localObject1;
    } while (localCursor == null);
    localCursor.close();
    return null;
  }
  
  public final long dO(long paramLong)
  {
    if ((this.diF instanceof h)) {
      return ((h)this.diF).dO(paramLong);
    }
    return -1L;
  }
  
  public final void dP(long paramLong)
  {
    if (((this.diF instanceof h)) && (paramLong != -1L)) {
      ((h)this.diF).gp(paramLong);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */