package com.tencent.mm.plugin.extqlauncher.ui;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.contact.s;
import java.util.List;

public class QLauncherCreateShortcutUI
  extends MMBaseActivity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onActivityResult resultCode = %s", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      finish();
      return;
    }
    switch (paramInt1)
    {
    }
    do
    {
      finish();
      return;
    } while (paramIntent == null);
    if (!au.HX())
    {
      x.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
      Toast.makeText(this, R.l.extqlauncher_add_shortcut_failed, 0).show();
      finish();
      return;
    }
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (!bi.oW(paramIntent)) {}
    for (paramIntent = bi.F(paramIntent.split(","));; paramIntent = null)
    {
      if ((paramIntent == null) || (paramIntent.size() <= 0))
      {
        x.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
        break;
      }
      x.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames count " + paramIntent.size());
      String str1 = com.tencent.mm.model.q.GF();
      ContentValues[] arrayOfContentValues;
      for (;;)
      {
        try
        {
          arrayOfContentValues = new ContentValues[paramIntent.size()];
          paramInt1 = 0;
          if (paramInt1 >= paramIntent.size()) {
            break label502;
          }
          au.HU();
          localObject = c.FR().Yg((String)paramIntent.get(paramInt1));
          if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).dhP > 0)) {
            break label290;
          }
          x.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
          finish();
          return;
        }
        catch (Exception paramIntent)
        {
          x.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "bulkInsert shortcut failed, %s", new Object[] { paramIntent.getMessage() });
          x.printErrStackTrace("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", paramIntent, "", new Object[0]);
          Toast.makeText(this, R.l.extqlauncher_add_shortcut_failed, 0).show();
        }
        break;
        label290:
        String str2 = com.tencent.mm.plugin.base.model.b.wM((String)paramIntent.get(paramInt1));
        if (bi.oW(str2))
        {
          x.e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
          finish();
          return;
        }
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("source_key", com.tencent.mm.plugin.base.model.b.hdt);
        localContentValues.put("owner_id", com.tencent.mm.plugin.base.model.b.wM(str1));
        localContentValues.put("unique_id", str2);
        localContentValues.put("container", Integer.valueOf(1));
        localContentValues.put("item_type", Integer.valueOf(com.tencent.mm.plugin.base.model.b.z((ab)localObject)));
        localContentValues.put("name", r.a((ab)localObject, (String)paramIntent.get(paramInt1)));
        localContentValues.put("icon_path", com.tencent.mm.aa.q.Kp().c((String)paramIntent.get(paramInt1), false, false));
        Object localObject = new Intent("com.tencent.mm.action.BIZSHORTCUT");
        ((Intent)localObject).putExtra("LauncherUI.Shortcut.Username", str2);
        ((Intent)localObject).putExtra("LauncherUI.From.Biz.Shortcut", true);
        ((Intent)localObject).addFlags(67108864);
        localContentValues.put("intent", ((Intent)localObject).toUri(0));
        arrayOfContentValues[paramInt1] = localContentValues;
        paramInt1 += 1;
      }
      label502:
      getContentResolver().bulkInsert(a.iLP, arrayOfContentValues);
      Toast.makeText(this, R.l.extqlauncher_add_shortcut_success, 0).show();
      com.tencent.mm.plugin.extqlauncher.b.aJl().aJn();
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onCreate");
    requestWindowFeature(1);
    setContentView(R.i.create_shortcut);
    paramBundle = new Intent();
    int i = s.s(new int[] { s.ukE, 64, 16384 });
    s.fc(i, 1);
    paramBundle.putExtra("list_attr", i);
    paramBundle.putExtra("list_type", 12);
    paramBundle.putExtra("stay_in_wechat", false);
    paramBundle.putExtra("titile", getString(R.l.address_title_select_contact));
    paramBundle.putExtra("block_contact", com.tencent.mm.model.q.GF());
    d.b(this, ".ui.contact.SelectContactUI", paramBundle, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/extqlauncher/ui/QLauncherCreateShortcutUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */