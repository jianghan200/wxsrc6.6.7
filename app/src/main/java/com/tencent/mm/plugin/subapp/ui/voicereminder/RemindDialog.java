package com.tencent.mm.plugin.subapp.ui.voicereminder;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.am.d;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.subapp.c.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@a(3)
public class RemindDialog
  extends Activity
{
  private static boolean bIq = false;
  private static List<String> otR = new ArrayList();
  private c eIW;
  private ag handler = new ag();
  private List<String> otQ = new ArrayList();
  private am.d otS = new RemindDialog.1(this);
  private String talker = "";
  
  private void bGB()
  {
    this.handler.post(new RemindDialog.5(this));
  }
  
  public static void w(Context paramContext, String paramString1, String paramString2)
  {
    x.d("MicroMsg.RemindDialog", "show " + bIq + " remind " + paramString2);
    if (bIq)
    {
      otR.add(paramString2);
      return;
    }
    otR.clear();
    bIq = true;
    if (au.DF().foreground)
    {
      localIntent = new Intent(paramContext, RemindDialog.class);
      localIntent.putExtra("_RemindDialog_User", paramString1);
      localIntent.putExtra("_RemindDialog_Remind", paramString2);
      localIntent.setFlags(603979776);
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      return;
    }
    Intent localIntent = new Intent(paramContext, RemindDialog.class);
    localIntent.putExtra("_RemindDialog_User", paramString1);
    localIntent.putExtra("_RemindDialog_Remind", paramString2);
    localIntent.setFlags(604012544);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = new c.a(this);
    paramBundle.Gq(R.l.voice_reminder_dialog_title);
    paramBundle.abu(" ");
    paramBundle.Gt(R.l.voice_reminder_dialog_check).a(new RemindDialog.2(this));
    paramBundle.Gu(R.l.voice_reminder_dialog_ignore).b(new RemindDialog.3(this));
    paramBundle.a(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        RemindDialog.this.finish();
      }
    });
    this.talker = getIntent().getStringExtra("_RemindDialog_User");
    Object localObject = getIntent().getStringExtra("_RemindDialog_Remind");
    this.otQ.clear();
    this.otQ.add(localObject);
    localObject = otR.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      this.otQ.add(str);
    }
    this.eIW = paramBundle.anj();
    this.eIW.setCanceledOnTouchOutside(false);
    this.eIW.show();
    bGB();
  }
  
  public void onPause()
  {
    bIq = false;
    d locald = d.bGs();
    if (locald != null) {
      locald.b(this.otS);
    }
    super.onPause();
  }
  
  public void onResume()
  {
    bIq = true;
    d locald = d.bGs();
    if (locald != null) {
      locald.a(this.otS);
    }
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */