package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class t
{
  ArrayList<u> mdt = new ArrayList();
  v mdu = w.box();
  s mdv = null;
  boolean mdw = false;
  v.f mdx = new v.f()
  {
    public final void ab(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (paramAnonymousInt1 == paramAnonymousInt2)
      {
        x.i("MicroMsg.ShareMailQueue", "finished one job, queue.size = %d", new Object[] { Integer.valueOf(t.this.mdt.size()) });
        if (t.this.mdv != null) {
          t.this.mdv.JV(paramAnonymousString);
        }
        if (t.this.mdt.size() > 0)
        {
          x.i("MicroMsg.ShareMailQueue", "continue to send next mail");
          paramAnonymousString = (u)t.this.mdt.remove(0);
          t.this.b(paramAnonymousString);
          t.this.mdu.a(this, t.this.mdy);
        }
      }
      else
      {
        return;
      }
      x.i("MicroMsg.ShareMailQueue", "finished sent all mails");
      t.this.mdw = false;
    }
  };
  v.e mdy = new v.e()
  {
    public final void JX(String paramAnonymousString)
    {
      s locals;
      if (t.this.mdv != null)
      {
        locals = t.this.mdv;
        if (!bi.oW(paramAnonymousString)) {
          break label94;
        }
        x.w("MicroMsg.ShareMailInfoMgr", "notify fail error, subject is null");
      }
      while (t.this.mdt.size() > 0)
      {
        x.i("MicroMsg.ShareMailQueue", "continue to send next mail");
        paramAnonymousString = (u)t.this.mdt.remove(0);
        t.this.b(paramAnonymousString);
        t.this.mdu.a(t.this.mdx, this);
        return;
        label94:
        s.JW(paramAnonymousString);
        locals.JV(paramAnonymousString);
      }
      x.i("MicroMsg.ShareMailQueue", "final job fail");
      t.this.mdw = false;
    }
  };
  
  public final void a(u paramu)
  {
    if (!au.HX()) {
      return;
    }
    if (this.mdv == null) {
      this.mdv = new s();
    }
    s locals = this.mdv;
    String str = paramu.mck;
    if (bi.oW(str)) {
      x.w("MicroMsg.ShareMailInfoMgr", "add info fail, info is null");
    }
    for (;;)
    {
      this.mdt.add(paramu);
      x.d("MicroMsg.ShareMailQueue", "add a new job, queue.size: %d", new Object[] { Integer.valueOf(this.mdt.size()) });
      if (this.mdw) {
        break;
      }
      x.d("MicroMsg.ShareMailQueue", "start execute");
      if (this.mdt.size() <= 0) {
        break;
      }
      this.mdw = true;
      b((u)this.mdt.remove(0));
      this.mdu.a(this.mdx, this.mdy);
      return;
      q localq = new q();
      localq.mck = str;
      locals.mds.lap.add(localq);
      locals.save();
    }
  }
  
  final void b(u paramu)
  {
    v localv = this.mdu;
    localv.mdJ.clear();
    localv.mcP = null;
    localv.mdL = 0;
    localv.mdN = null;
    localv.mdO = null;
    localv.mdP.clear();
    localv.mdM.clear();
    localv.bSS = null;
    localv.mdI.clear();
    localv.mdB.clear();
    localv.mdA = null;
    localv.mck = null;
    localv.mdS = 0;
    localv.mcN = null;
    localv.mdC.clear();
    localv.mdG.clear();
    localv.mdK.clear();
    localv.mdH = null;
    localv.mdy = null;
    this.mdu.bSS = paramu.bSS;
    this.mdu.mck = paramu.mck;
    this.mdu.mcN = paramu.mcN;
    this.mdu.mcO = paramu.mcO;
    this.mdu.mdA = paramu.mdA;
    localv = this.mdu;
    Map localMap = paramu.mdB;
    localv.mdB = new HashMap();
    localv.mdB.putAll(localMap);
    localv = this.mdu;
    localMap = paramu.mdC;
    localv.mdC = new LinkedHashMap();
    localv.mdC.putAll(localMap);
    localv = this.mdu;
    paramu = paramu.mdD;
    localv.mdD = new LinkedHashMap();
    localv.mdD.putAll(paramu);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */