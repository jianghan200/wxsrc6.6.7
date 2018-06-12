package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class DisasterUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return a.g.disaster_ui;
  }
  
  public final boolean needShowIdcError()
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_disaster_content");
    String str = getIntent().getStringExtra("key_disaster_url");
    x.i("MicroMsg.DisasterUI", "summerdiz onCreate :%d, content[%s], url[%s]", new Object[] { Integer.valueOf(hashCode()), paramBundle, str });
    ((TextView)findViewById(a.f.notify_text)).setText(paramBundle);
    findViewById(a.f.notify_link).setOnClickListener(new DisasterUI.1(this, str));
    setMMTitle(getString(a.j.disaster_tips));
    setBackBtn(new DisasterUI.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/DisasterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */