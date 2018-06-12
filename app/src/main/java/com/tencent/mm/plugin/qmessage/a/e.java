package com.tencent.mm.plugin.qmessage.a;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import junit.framework.Assert;

public final class e
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS qcontact ( username text  PRIMARY KEY , qq long  , extinfo text  , needupdate int  , extupdateseq long  , imgupdateseq long  , reserved1 int  , reserved2 int  , reserved3 int  , reserved4 int  , reserved5 text  , reserved6 text  , reserved7 text  , reserved8 text  ) " };
  private h dCZ;
  
  public e(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final d JM(String paramString)
  {
    Object localObject = null;
    paramString = "select qcontact.username,qcontact.qq,qcontact.extinfo,qcontact.needupdate,qcontact.extupdateseq,qcontact.imgupdateseq,qcontact.reserved1,qcontact.reserved2,qcontact.reserved3,qcontact.reserved4,qcontact.reserved5,qcontact.reserved6,qcontact.reserved7,qcontact.reserved8 from qcontact   where qcontact.username = \"" + bi.oU(paramString) + "\"";
    Cursor localCursor = this.dCZ.b(paramString, null, 2);
    if (localCursor == null) {
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new d();
      paramString.username = localCursor.getString(0);
      paramString.eLw = localCursor.getLong(1);
      paramString.extInfo = localCursor.getString(2);
      paramString.mbv = localCursor.getInt(3);
      paramString.mbw = localCursor.getLong(4);
      paramString.mbx = localCursor.getLong(5);
      paramString.dCV = localCursor.getInt(6);
      paramString.dSJ = localCursor.getInt(7);
      paramString.dHN = localCursor.getInt(8);
      paramString.dHO = localCursor.getInt(9);
      paramString.mby = localCursor.getString(10);
      paramString.mbz = localCursor.getString(11);
      paramString.mbA = localCursor.getString(12);
      paramString.mbB = localCursor.getString(13);
    }
    localCursor.close();
    return paramString;
  }
  
  public final boolean a(d paramd)
  {
    paramd.bWA = -1;
    paramd = paramd.wH();
    return (int)this.dCZ.insert("qcontact", "username", paramd) != -1;
  }
  
  public final boolean a(String paramString, d paramd)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramd != null) {
        break label28;
      }
    }
    label28:
    while (this.dCZ.update("qcontact", paramd.wH(), "username=?", new String[] { paramString }) <= 0)
    {
      return false;
      bool = false;
      break;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */