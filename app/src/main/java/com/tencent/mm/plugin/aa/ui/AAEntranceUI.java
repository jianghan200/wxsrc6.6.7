package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(1)
public class AAEntranceUI
  extends MMActivity
{
  private Button eBJ;
  private TextView eBK;
  
  protected final int getLayoutId()
  {
    return a.g.aa_entrance_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      return;
    }
    if (paramInt1 == 1)
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      x.i("MicroMsg.AAEntranceUI", "select chatroom：%s", new Object[] { str });
      if (!bi.oW(str))
      {
        Intent localIntent = new Intent(this.mController.tml, LaunchAAUI.class);
        localIntent.putExtra("enter_scene", 2);
        localIntent.putExtra("chatroom_name", str);
        startActivity(localIntent);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.launch_aa_title);
    this.eBJ = ((Button)findViewById(a.f.launch_btn));
    this.eBK = ((TextView)findViewById(a.f.check_aa_record_tv));
    this.eBJ.setOnClickListener(new AAEntranceUI.1(this));
    this.eBK.setClickable(true);
    this.eBK.setOnTouchListener(new m(this));
    paramBundle = new SpannableStringBuilder(getString(a.i.check_aa_record));
    paramBundle.setSpan(new a(new AAEntranceUI.2(this)), 0, paramBundle.length(), 18);
    this.eBK.setText(paramBundle);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AAEntranceUI.this.finish();
        return false;
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/AAEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */