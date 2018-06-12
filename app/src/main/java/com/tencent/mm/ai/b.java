package com.tencent.mm.ai;

import android.content.ContentValues;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;

public final class b
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  h dCZ;
  
  public b(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(a parama)
  {
    parama.bWA = -1;
    ContentValues localContentValues = new ContentValues();
    if ((parama.bWA & 0x1) != 0) {
      localContentValues.put("username", parama.getUsername());
    }
    if ((parama.bWA & 0x2) != 0) {
      localContentValues.put("inserttime", Long.valueOf(parama.dSH));
    }
    if ((parama.bWA & 0x4) != 0) {
      localContentValues.put("type", Integer.valueOf(parama.type));
    }
    if ((parama.bWA & 0x8) != 0) {
      localContentValues.put("lastgettime", Integer.valueOf(parama.dSI));
    }
    if ((parama.bWA & 0x10) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(parama.dCV));
    }
    if ((parama.bWA & 0x20) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(parama.dSJ));
    }
    if ((parama.bWA & 0x40) != 0) {
      localContentValues.put("reserved3", parama.IB());
    }
    if ((parama.bWA & 0x80) != 0) {
      localContentValues.put("reserved4", parama.OG());
    }
    if ((int)this.dCZ.replace("getcontactinfov2", "username", localContentValues) != -1)
    {
      Xp(parama.getUsername());
      return true;
    }
    return false;
  }
  
  public final boolean lE(String paramString)
  {
    if (this.dCZ.delete("getcontactinfov2", "username= ?", new String[] { paramString }) > 0)
    {
      Xp(paramString);
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ai/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */