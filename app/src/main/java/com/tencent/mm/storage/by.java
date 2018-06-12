package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class by
  extends i<bx>
  implements g.a
{
  public static final String[] diD = { i.a(bx.dhO, "VoiceTransText") };
  public e diF;
  
  public by(e parame)
  {
    this(parame, bx.dhO, "VoiceTransText");
  }
  
  private by(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.diF = parame;
  }
  
  public final bx Zs(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    bx localbx = new bx();
    paramString = this.diF.a("VoiceTransText", null, "cmsgId=?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbx.d(paramString);
    }
    paramString.close();
    return localbx;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final boolean a(bx parambx)
  {
    if (parambx == null) {}
    do
    {
      return false;
      parambx = parambx.wH();
    } while (this.diF.replace("VoiceTransText", "msgId", parambx) < 0L);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */