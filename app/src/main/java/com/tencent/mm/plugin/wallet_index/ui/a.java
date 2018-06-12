package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
  implements b
{
  public static long pDd = 0L;
  BroadcastReceiver hiJ = new a.1(this);
  String iiv;
  private String pCK;
  String pCL;
  private d pDa = null;
  private d pDb = null;
  private c pDc;
  private d pDe;
  private com.tencent.mm.plugin.wallet_index.b.a.a pDf;
  private com.tencent.mm.plugin.wallet_index.b.a.b pDg;
  String pDh;
  
  public a(Activity paramActivity, c paramc, d paramd)
  {
    this.pDe = paramd;
    pDd = 0L;
    this.pDc = paramc;
    paramc = new IntentFilter();
    paramc.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
    paramc.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
    paramActivity.registerReceiver(this.hiJ, paramc);
    this.pDf = new com.tencent.mm.plugin.wallet_index.b.a.a();
  }
  
  private static void b(MMActivity paramMMActivity, int paramInt)
  {
    com.tencent.mm.plugin.wallet_index.c.a locala = com.tencent.mm.plugin.wallet_index.c.a.aN(paramInt, "");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", locala.kjf);
    localIntent.putExtra("key_err_msg", locala.kjg);
    localIntent.putExtra("key_launch_ts", pDd);
    paramMMActivity.setResult(-1, localIntent);
    paramMMActivity.finish();
  }
  
  public final void a(MMActivity paramMMActivity, d paramd)
  {
    this.pDa = paramd;
    this.iiv = this.pDc.pCP.lRl;
    this.pCL = this.pDc.pCP.lPj;
    this.pCK = this.pDc.pCP.rFe;
    Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
    localIntent.setPackage("com.tencent.mm");
    localIntent.putExtra("product_id", this.iiv);
    this.pDh = this.pDc.pCP.rQh;
    Object localObject1 = this.pDh;
    Object localObject2 = this.pCL;
    String str = this.pCK;
    paramd = (d)localObject1;
    if (bi.oW((String)localObject1)) {
      paramd = "";
    }
    localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = "";
    }
    localObject2 = str;
    if (bi.oW(str)) {
      localObject2 = "";
    }
    localIntent.putExtra("developer_pay_load", paramd + "[#]" + (String)localObject1 + "[#]" + (String)localObject2);
    if (!paramMMActivity.getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty())
    {
      pDd = bi.VF();
      x.i("MicroMsg.GoogleWallet", "GWallet Found!");
      paramMMActivity.startActivityForResult(localIntent, 10001);
    }
    do
    {
      return;
      x.i("MicroMsg.GoogleWallet", "Try to downloading GWallet Moudle!");
      paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(3, "");
    } while (this.pDa == null);
    this.pDa.a(paramMMActivity, null);
  }
  
  public final void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean)
  {
    this.pDb = paramd;
    x.d("MicroMsg.GoogleWallet", "consumePurchase. consume...");
    com.tencent.mm.plugin.wallet_index.b.a.b localb = this.pDg;
    paramd = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject = (String)paramArrayList.next();
      localObject = (com.tencent.mm.plugin.wallet_index.b.a.c)localb.pCD.get(localObject);
      if (localObject != null) {
        paramd.add(((com.tencent.mm.plugin.wallet_index.b.a.c)localObject).eIe);
      }
    }
    if (paramd.size() > 0)
    {
      paramArrayList = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
      paramArrayList.setPackage("com.tencent.mm");
      paramArrayList.putStringArrayListExtra("tokens", paramd);
      paramArrayList.putExtra("IS_FAILED_CONSUME", paramBoolean);
      paramMMActivity.sendBroadcast(paramArrayList);
    }
    do
    {
      return;
      paramMMActivity = com.tencent.mm.plugin.wallet_index.c.a.aN(0, "");
    } while (this.pDb == null);
    this.pDb.a(paramMMActivity, null);
  }
  
  public final boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 10001)
    {
      x.i("MicroMsg.GoogleWallet", "purchase flow!result_code: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramIntent != null)
      {
        paramInt1 = paramIntent.getIntExtra("RESPONSE_CODE", 0);
        if ((paramInt1 == 3) || (paramInt1 == 105))
        {
          q.c(this.pDh, this.iiv, this.pCL, paramInt1, "");
          b(paramMMActivity, paramInt1);
        }
      }
    }
    do
    {
      return true;
      if (paramInt1 == 100000001)
      {
        b(paramMMActivity, paramInt1);
        return true;
        b(paramMMActivity, 1);
        return true;
      }
      paramMMActivity = this.pDb;
      String str1 = this.pDh;
      String str2 = this.iiv;
      String str3 = this.pCL;
      paramInt1 = com.tencent.mm.plugin.wallet_index.b.a.a.ae(paramIntent);
      x.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(paramInt1));
      paramIntent = com.tencent.mm.plugin.wallet_index.c.a.aN(paramInt1, "");
      q.c(str1, str2, str3, paramInt1, paramIntent.kjg);
    } while (paramMMActivity == null);
    paramMMActivity.a(paramIntent, null);
    return true;
  }
  
  public final void b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    x.d("MicroMsg.GoogleWallet", "restorePurchase. Querying inventory.");
    x.d("MicroMsg.GoogleWallet", "is direct? " + paramBoolean);
    Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
    localIntent.setPackage("com.tencent.mm");
    localIntent.putExtra("is_direct", paramBoolean);
    paramMMActivity.startActivityForResult(localIntent, 10001);
  }
  
  public final int bRd()
  {
    return 3;
  }
  
  public final void j(MMActivity paramMMActivity)
  {
    try
    {
      paramMMActivity.unregisterReceiver(this.hiJ);
      if (!bi.ci(paramMMActivity))
      {
        x.d("MicroMsg.GoogleWallet", "close front UI.");
        Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        localIntent.setPackage("com.tencent.mm");
        paramMMActivity.sendBroadcast(localIntent);
      }
      x.d("MicroMsg.GoogleWallet", "Destroying helper.");
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        x.e("MicroMsg.GoogleWallet", localIllegalArgumentException.toString());
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */