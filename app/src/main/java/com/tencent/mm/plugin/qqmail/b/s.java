package com.tencent.mm.plugin.qqmail.b;

import android.content.Context;
import android.util.Base64;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.IOException;
import java.util.LinkedList;

public final class s
{
  r mds;
  
  public s()
  {
    au.HU();
    String str = (String)c.DT().get(282625, "");
    try
    {
      this.mds = new r();
      this.mds.aG(Base64.decode(str, 0));
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
      this.mds = new r();
    }
  }
  
  static void JW(String paramString)
  {
    com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
    localbd.ep("qqmail");
    localbd.ay(com.tencent.mm.model.bd.iD("qqmail"));
    localbd.eX(0);
    localbd.setContent(String.format(ad.getContext().getString(R.l.send_mail_fail_prompt), new Object[] { paramString }));
    localbd.setType(1);
    localbd.setStatus(3);
    au.HU();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareMailInfoMgr", "send mail fail, publish fail message, id: %d", new Object[] { Long.valueOf(c.FT().T(localbd)) });
  }
  
  public final void JV(String paramString)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShareMailInfoMgr", "remove info fail, info is null");
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < this.mds.lap.size())
      {
        if (((q)this.mds.lap.get(i)).mck.equals(paramString)) {
          this.mds.lap.remove(i);
        }
      }
      else
      {
        save();
        return;
      }
      i += 1;
    }
  }
  
  final void save()
  {
    try
    {
      String str = Base64.encodeToString(this.mds.toByteArray(), 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareMailInfoMgr", "save %s", new Object[] { str });
      au.HU();
      c.DT().set(282625, str);
      return;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localIOException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */