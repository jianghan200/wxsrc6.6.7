package com.tencent.mm.plugin.gwallet;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.3;
import com.tencent.mm.plugin.gwallet.a.b.b;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=31, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK, com.jg.EType.RECEIVERCHECK})
public class GWalletUI
  extends Activity
{
  BroadcastReceiver hiJ = new GWalletUI.3(this);
  private b kiB = null;
  
  public final void fC(boolean paramBoolean)
  {
    b localb = this.kiB;
    GWalletUI.4 local4 = new GWalletUI.4(this, paramBoolean);
    ag localag = new ag();
    localb.EC("queryInventory");
    e.post(new b.3(localb, "inapp", localag, local4), "IabHelper_queryInventoryAsync");
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    b localb = this.kiB;
    if (paramInt1 == localb.bNZ)
    {
      localb.EC("handleActivityResult");
      if (paramIntent != null) {
        break label65;
      }
      b.ED("Null data in IAB activity result.");
      paramIntent = new c(64534, "Null data in IAB result");
      if (localb.kiS != null) {
        localb.kiS.b(paramIntent, null);
      }
    }
    return;
    label65:
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    if (localObject == null)
    {
      b.ED("Intent with no response code, assuming OK (known issue)");
      paramInt1 = 0;
    }
    for (;;)
    {
      localObject = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      String str = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      x.d("MicroMsg.IabHelper", "Purchase data: " + (String)localObject);
      x.d("MicroMsg.IabHelper", "Data signature: " + str);
      x.d("MicroMsg.IabHelper", "Extras: " + paramIntent.getExtras());
      x.d("MicroMsg.IabHelper", "Expected item type: " + localb.kiT);
      localObject = new c(paramInt1, "Null data in IAB result");
      if (localb.kiS == null) {
        break;
      }
      localb.kiS.b((c)localObject, paramIntent);
      return;
      if ((localObject instanceof Integer))
      {
        paramInt1 = ((Integer)localObject).intValue();
      }
      else
      {
        if (!(localObject instanceof Long)) {
          break label280;
        }
        paramInt1 = (int)((Long)localObject).longValue();
      }
    }
    label280:
    b.ED("Unexpected type for intent response code.");
    b.ED(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + localObject.getClass().getName());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    x.d("MicroMsg.GWalletUI", "Creating IAB helper.");
    this.kiB = new b(this);
    x.d("MicroMsg.GWalletUI", "Starting setup.");
    this.kiB.a(new GWalletUI.1(this));
  }
  
  protected void onDestroy()
  {
    x.d("MicroMsg.GWalletUI", "Destroying helper.");
    if (this.kiB != null) {
      this.kiB.dispose();
    }
    this.kiB = null;
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(paramIntent.getAction())) {
      fC(paramIntent.getBooleanExtra("is_direct", true));
    }
    super.onNewIntent(paramIntent);
  }
  
  public void onStart()
  {
    super.onStart();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
    registerReceiver(this.hiJ, localIntentFilter);
  }
  
  protected void onStop()
  {
    super.onStop();
    unregisterReceiver(this.hiJ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/gwallet/GWalletUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */