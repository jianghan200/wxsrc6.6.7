package com.tencent.mm.ar;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import junit.framework.Assert;

public final class b
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  public h dCZ;
  
  public b(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(a parama)
  {
    parama.bWA = -1;
    ContentValues localContentValues = parama.wH();
    if ((int)this.dCZ.insert("chattingbginfo", "username", localContentValues) != -1)
    {
      Xp(parama.getUsername());
      return true;
    }
    return false;
  }
  
  public final boolean b(a parama)
  {
    if (parama != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ContentValues localContentValues = parama.wH();
      if (localContentValues.size() <= 0) {
        break;
      }
      if (this.dCZ.update("chattingbginfo", localContentValues, "username= ?", new String[] { parama.getUsername() }) <= 0) {
        break;
      }
      Xp(parama.getUsername());
      return true;
    }
    return false;
  }
  
  public final a mw(String paramString)
  {
    Object localObject = null;
    paramString = "select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"" + bi.oU(paramString) + "\"";
    Cursor localCursor = this.dCZ.b(paramString, null, 2);
    if (localCursor == null) {
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new a();
      paramString.d(localCursor);
    }
    localCursor.close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */