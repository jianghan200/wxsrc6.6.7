package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;

public class NoRomSpaceDexUI
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    w.initLanguage(ad.getContext());
    setContentView(R.i.no_space_dex);
    String str = getString(R.l.check_db_size_tip_dangerous_message);
    paramBundle = new q(this);
    paramBundle.setTitle(R.l.check_db_size_tip_dangerous_title);
    paramBundle.tlz.setVisibility(0);
    paramBundle.tlx.setVisibility(0);
    paramBundle.tlx.setText(str);
    str = getString(R.l.check_db_size_btn_dangerous_message);
    DialogInterface.OnClickListener local1 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Process.killProcess(Process.myPid());
      }
    };
    if (paramBundle.pxh != null)
    {
      paramBundle.pxh.setVisibility(0);
      paramBundle.pxh.setText(str);
      paramBundle.pxh.setOnClickListener(new q.1(paramBundle, local1));
    }
    paramBundle.setCancelable(false);
    paramBundle.cpX();
    paramBundle.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/NoRomSpaceDexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */