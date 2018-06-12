package com.tencent.mm.plugin.bottle.a;

import android.content.ContentValues;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.j;

public final class b
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS bottleinfo1 ( parentclientid text  , childcount int  , bottleid text  PRIMARY KEY , bottletype int  , msgtype int  , voicelen int  , content text  , createtime long  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
  public h dCZ;
  
  public b(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(a parama)
  {
    parama.bWA = -1;
    ContentValues localContentValues = new ContentValues();
    String str;
    if ((parama.bWA & 0x1) != 0)
    {
      if (parama.hjN == null)
      {
        str = "";
        localContentValues.put("parentclientid", str);
      }
    }
    else
    {
      if ((parama.bWA & 0x2) != 0) {
        localContentValues.put("childcount", Integer.valueOf(parama.hjO));
      }
      if ((parama.bWA & 0x4) != 0) {
        localContentValues.put("bottleid", parama.aub());
      }
      if ((parama.bWA & 0x8) != 0) {
        localContentValues.put("bottletype", Integer.valueOf(parama.hjQ));
      }
      if ((parama.bWA & 0x10) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(parama.msgType));
      }
      if ((parama.bWA & 0x20) != 0) {
        localContentValues.put("voicelen", Integer.valueOf(parama.hjR));
      }
      if ((parama.bWA & 0x40) != 0) {
        localContentValues.put("content", parama.getContent());
      }
      if ((parama.bWA & 0x80) != 0) {
        localContentValues.put("createtime", Long.valueOf(parama.hjS));
      }
      if ((parama.bWA & 0x100) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(parama.dCV));
      }
      if ((parama.bWA & 0x200) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(parama.dSJ));
      }
      if ((parama.bWA & 0x400) != 0)
      {
        if (parama.dCX != null) {
          break label324;
        }
        str = "";
        label262:
        localContentValues.put("reserved3", str);
      }
      if ((parama.bWA & 0x800) != 0) {
        if (parama.dCY != null) {
          break label332;
        }
      }
    }
    label324:
    label332:
    for (parama = "";; parama = parama.dCY)
    {
      localContentValues.put("reserved4", parama);
      if ((int)this.dCZ.insert("bottleinfo1", "bottleid", localContentValues) == -1) {
        break label340;
      }
      return true;
      str = parama.hjN;
      break;
      str = parama.dCX;
      break label262;
    }
    label340:
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */