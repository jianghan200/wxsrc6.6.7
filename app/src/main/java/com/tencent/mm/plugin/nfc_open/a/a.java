package com.tencent.mm.plugin.nfc_open.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.a.j.a;
import com.tencent.mm.plugin.nfc.c.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  extends com.tencent.mm.sdk.b.c<j>
{
  public a()
  {
    this.sFo = j.class.getName().hashCode();
  }
  
  private static boolean a(j paramj)
  {
    if (!(paramj instanceof j)) {}
    while (paramj.bGo == null) {
      return false;
    }
    int i = paramj.bGo.actionCode;
    Object localObject1 = paramj.bGo.context;
    Bundle localBundle = new Bundle();
    switch (i)
    {
    }
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      paramj.bGp.bGt = localBundle;
      return false;
      localBundle.putString("id", com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.c.a.a.bjr().lFh));
      continue;
      localBundle.putString("info", com.tencent.mm.plugin.nfc.c.a.a.bjr().getInfo());
      continue;
      localBundle.putInt("status", com.tencent.mm.plugin.nfc.c.a.a.bjr().dW((Context)localObject1));
      continue;
      localBundle.putInt("status", com.tencent.mm.plugin.nfc.c.a.a.bjr().dX((Context)localObject1));
      continue;
      localObject1 = paramj.bGo.bGq;
      if (bi.oW((String)localObject1))
      {
        x.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
      }
      else
      {
        try
        {
          localObject1 = new com.tencent.mm.plugin.nfc.a.a((String)localObject1);
          localBundle.putString("result", com.tencent.mm.plugin.nfc.c.a.a.bjr().a((com.tencent.mm.plugin.nfc.a.a)localObject1).toString());
        }
        catch (Exception localException1)
        {
          x.e("MicroMsg.ApduEngineFuncListener", "alex: exec nfc command exception");
          x.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException1, "", new Object[0]);
          localBundle.putString("result", null);
        }
        continue;
        try
        {
          String str = paramj.bGo.bGq;
          bool1 = paramj.bGo.bGr;
          bool2 = paramj.bGo.bGs;
          if (!bi.oW(str)) {
            break;
          }
          x.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
        }
        catch (Exception localException2)
        {
          x.e("MicroMsg.ApduEngineFuncListener", "alex: exec nfc command exception");
          x.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException2, "", new Object[0]);
          localBundle.putString("result", null);
        }
      }
    }
    Object localObject3 = localException2.split("\\|");
    Object localObject2 = new ArrayList();
    int j = localObject3.length;
    i = 0;
    for (;;)
    {
      Object localObject4;
      if (i < j)
      {
        localObject4 = localObject3[i];
        if (bi.oW((String)localObject4))
        {
          x.w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
        }
        else
        {
          localObject4 = ((String)localObject4).split(":");
          if ((localObject4 == null) || (localObject4.length < 2))
          {
            x.w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
          }
          else
          {
            int k = bi.getInt(localObject4[0], 0);
            ((List)localObject2).add(new com.tencent.mm.plugin.nfc.c.a(k, String.valueOf(k), new com.tencent.mm.plugin.nfc.a.a(localObject4[1])));
          }
        }
      }
      else
      {
        com.tencent.mm.plugin.nfc.c.a.a.bjr().a((List)localObject2, bool1, bool2);
        localObject3 = new StringBuilder();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = (com.tencent.mm.plugin.nfc.c.a)((Iterator)localObject2).next();
          if (((com.tencent.mm.plugin.nfc.c.a)localObject4).lFf == null) {
            break;
          }
          ((StringBuilder)localObject3).append(((com.tencent.mm.plugin.nfc.c.a)localObject4).id);
          ((StringBuilder)localObject3).append(":");
          ((StringBuilder)localObject3).append(((com.tencent.mm.plugin.nfc.c.a)localObject4).lFf.toString());
          ((StringBuilder)localObject3).append("|");
        }
        localBundle.putString("result", ((StringBuilder)localObject3).toString());
        break;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc_open/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */