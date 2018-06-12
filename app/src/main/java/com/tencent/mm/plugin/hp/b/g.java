package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.protocal.c.bsw;
import com.tencent.mm.protocal.c.bsy;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 2)
    {
      x.d("MicroMsg.Tinker.TinkerBootsCommand", "no args input.");
      return false;
    }
    paramContext = paramArrayOfString[1];
    int i;
    if (com.tencent.mm.sdk.a.b.chp())
    {
      i = -1;
      switch (paramContext.hashCode())
      {
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        x.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a debugger command.", new Object[] { paramContext });
        i = -1;
        switch (paramContext.hashCode())
        {
        default: 
          switch (i)
          {
          default: 
            x.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a release command.", new Object[] { paramContext });
            return false;
            if (paramContext.equals("update"))
            {
              i = 0;
              continue;
              if (paramContext.equals("show"))
              {
                i = 1;
                continue;
                if (paramContext.equals("diff"))
                {
                  i = 2;
                  continue;
                  if (paramContext.equals("down"))
                  {
                    i = 3;
                    continue;
                    if (paramContext.equals("nd"))
                    {
                      i = 4;
                      continue;
                      if (paramContext.equals("clear"))
                      {
                        i = 5;
                        continue;
                        if (paramContext.equals("process")) {
                          i = 6;
                        }
                      }
                    }
                  }
                }
              }
            }
            break;
          }
          break;
        }
        break;
      }
    }
    x.d("MicroMsg.Tinker.TinkerBootsCommand", "command checkout update.");
    LinkedList localLinkedList = new LinkedList();
    String str = "";
    if (paramArrayOfString.length >= 3) {}
    for (paramContext = paramArrayOfString[2];; paramContext = "tinker_id_d1ddc930233f0ec33f573e365038b6d979b6ebde")
    {
      if (paramArrayOfString.length >= 4) {
        str = paramArrayOfString[3];
      }
      Object localObject;
      if (paramArrayOfString.length >= 5)
      {
        localObject = new bsw();
        ((bsw)localObject).aAL = "sdk";
        ((bsw)localObject).value = paramArrayOfString[4];
        localLinkedList.add(localObject);
      }
      for (;;)
      {
        paramArrayOfString = new StringBuilder();
        localObject = localLinkedList.iterator();
        while (((Iterator)localObject).hasNext())
        {
          bsw localbsw = (bsw)((Iterator)localObject).next();
          paramArrayOfString.append(localbsw.aAL).append(":").append(localbsw.value).append("\n");
        }
        paramArrayOfString = new bsw();
        paramArrayOfString.aAL = "sdk";
        paramArrayOfString.value = String.valueOf(Build.VERSION.SDK_INT);
        localLinkedList.add(paramArrayOfString);
      }
      x.d("MicroMsg.Tinker.TinkerBootsCommand", "BaseID:%s PatchID:%s %s", new Object[] { paramContext, str, paramArrayOfString.toString() });
      paramContext = new com.tencent.mm.plugin.hp.c.a(paramContext, str, localLinkedList);
      au.DF().a(paramContext, 0);
      return true;
      i.a(ad.getContext().getString(R.l.fmt_update), ad.getContext().getString(R.l.fmt_update), ad.getContext().getString(R.l.install_now), new g.1(this), ad.getContext().getString(R.l.update_cancel), null);
      return true;
      au.Em().H(new g.2(this, paramArrayOfString));
      return true;
      paramContext = new bta();
      paramContext.sqw = 1000;
      paramContext.sqt = 2;
      paramContext.squ = 2;
      paramContext.state = 2;
      paramContext.rsQ = "android_tinker_id_123123131231231";
      paramArrayOfString = new bhl();
      paramArrayOfString.rwt = "c3282ad2467fad9561227bc9b5b6712c";
      paramArrayOfString.ruE = 118617;
      paramArrayOfString.jPK = "http://dldir1.qq.com/weixin/checkresupdate/0x2605136d.3144f5.0x26051334.bf52fb_1510754399.apk";
      paramContext.sqt = 3;
      paramArrayOfString.rwt = "3ba62fdbd98df2bdf5da7d726010d867";
      paramArrayOfString.ruE = 33338711;
      paramArrayOfString.jPK = "http://dldir1.qq.com/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
      paramContext.sqv = paramArrayOfString;
      new e(new com.tencent.mm.plugin.hp.d.b(paramContext)).fL(false);
      return true;
      if (paramArrayOfString.length >= 6) {
        bi.WV(paramArrayOfString[5]);
      }
      return true;
      com.tencent.mm.plugin.hp.tinker.g.as(ad.getContext(), "");
      com.tencent.mm.plugin.hp.tinker.g.at(ad.getContext(), "");
      com.tencent.mm.plugin.hp.tinker.g.G(ad.getContext(), 0);
      com.tencent.mm.pluginsdk.f.i.ccl();
      return true;
      paramContext = new bta();
      paramContext.sqw = 1000;
      paramContext.sqt = 3;
      paramContext.squ = 2;
      paramContext.state = 2;
      paramContext.rsQ = "android_tinker_id_123123131231231";
      paramArrayOfString = new bhl();
      paramArrayOfString.rwt = "3ba62fdbd98df2bdf5da7d726010d867";
      paramArrayOfString.ruE = 33338711;
      paramArrayOfString.jPK = "http://dldir1.qq.com/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
      paramContext.sqv = paramArrayOfString;
      paramArrayOfString = new bsy();
      paramArrayOfString.aAL = "clientVersion";
      paramArrayOfString.value = "0x26060510";
      paramContext.sqx.add(paramArrayOfString);
      paramArrayOfString = new bsy();
      paramArrayOfString.aAL = "alphaTitle";
      paramArrayOfString.value = "叫你更新你就更新";
      paramContext.sqx.add(paramArrayOfString);
      paramArrayOfString = new bsy();
      paramArrayOfString.aAL = "alphaContent";
      paramArrayOfString.value = "这个包可以抢到的红包最大，抢红包速度最快。";
      paramContext.sqx.add(paramArrayOfString);
      paramArrayOfString = new bsy();
      paramArrayOfString.aAL = "alphaUrl";
      paramArrayOfString.value = "www.qq.com";
      paramContext.sqx.add(paramArrayOfString);
      new e(new com.tencent.mm.plugin.hp.d.b(paramContext)).fL(true);
      return true;
      if (!paramContext.equals("check")) {
        break;
      }
      i = 0;
      break;
      try
      {
        com.tinkerboots.sdk.a.cJC().na(true);
        return true;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Tinker.TinkerBootsCommand", paramContext, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/hp/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */