package com.tencent.mm.plugin.webview.modeltools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  public static Intent a(MMActivity paramMMActivity, Intent paramIntent, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("targeturl", paramString);
    localBundle.putParcelable("targetintent", paramIntent);
    paramString = new Intent();
    paramString.setClass(paramMMActivity, AppChooserUI.class);
    paramString.putExtra("scene", 4);
    paramString.putExtra("type", 0);
    paramString.putExtra("title", paramMMActivity.getString(R.l.choose_browser));
    paramString.putExtra("targetintent", paramIntent);
    paramString.putExtra("transferback", localBundle);
    return paramString;
  }
  
  public static boolean b(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (2 == paramInt1)
    {
      String str;
      Bundle localBundle;
      boolean bool;
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("selectpkg");
        localBundle = paramIntent.getBundleExtra("transferback");
        bool = paramIntent.getBooleanExtra("isalways", false);
        x.i("MicroMsg.BrowserChooserHelper", "App Chooser Browser is %s", new Object[] { str });
        s.cbA();
        paramIntent = (o)s.v(0, null);
        if (!paramIntent.SK(str)) {
          break label201;
        }
        if (!paramIntent.eM(paramMMActivity)) {
          break label131;
        }
        o.bf(paramMMActivity, localBundle.getString("targeturl"));
        if (!bool) {
          break label171;
        }
        h.mEJ.h(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
      }
      for (;;)
      {
        return true;
        label131:
        paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        paramMMActivity.startActivity(paramIntent);
        break;
        label171:
        h.mEJ.h(10998, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
        continue;
        label201:
        paramIntent = new Intent((Intent)localBundle.getParcelable("targetintent"));
        paramIntent.setPackage(str);
        paramIntent.addFlags(524288);
        paramMMActivity.startActivity(paramIntent);
        h.mEJ.h(10998, new Object[] { Integer.valueOf(5) });
        if (bool) {
          h.mEJ.h(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
        } else {
          h.mEJ.h(10998, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
        }
      }
    }
    return false;
  }
  
  public static void d(MMActivity paramMMActivity, String paramString)
  {
    if ((paramMMActivity == null) || (paramMMActivity.isFinishing()) || (bi.oW(paramString))) {
      return;
    }
    String str = paramString;
    if (!paramString.startsWith("http://"))
    {
      str = paramString;
      if (!paramString.startsWith("https://")) {
        str = "http://" + paramString;
      }
    }
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(str));
    try
    {
      if (bi.fU(paramMMActivity))
      {
        paramMMActivity.startActivity(paramString);
        return;
      }
    }
    catch (Exception paramMMActivity)
    {
      x.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", new Object[] { paramMMActivity.getMessage() });
      return;
    }
    paramMMActivity.startActivityForResult(a(paramMMActivity, paramString, str), 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */