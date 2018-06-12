package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.az.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.MMActivity;

public class NearbyFriendShowSayHiUI
  extends MMActivity
{
  ImageView eCl;
  String lBK = "";
  View lBL = null;
  
  protected final int getLayoutId()
  {
    return R.i.nearby_friend_show_sayhi;
  }
  
  protected final void initView()
  {
    setBackBtn(new NearbyFriendShowSayHiUI.1(this));
    ((Button)findViewById(R.h.nearby_friend_intro_start_btn)).setOnClickListener(new NearbyFriendShowSayHiUI.2(this));
    this.lBL = findViewById(R.h.goto_sayhi_btn);
    this.lBL.setVisibility(0);
    this.lBL.setOnClickListener(new NearbyFriendShowSayHiUI.3(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 2009) && (paramInt2 == -1)) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.nearby_friend_title);
    initView();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject = (TextView)findViewById(R.h.say_hi_count);
    int i = d.SG().axd();
    if (i == 0) {
      this.lBL.setVisibility(4);
    }
    do
    {
      return;
      ((TextView)localObject).setText(getResources().getQuantityString(R.j.say_hi_count_text_quantity, i, new Object[] { Integer.valueOf(i) }));
      this.eCl = ((ImageView)findViewById(R.h.match_dlg_img));
      localObject = d.SG().clZ();
    } while (localObject == null);
    this.lBK = ((ba)localObject).field_sayhiuser;
    a.b.a(this.eCl, this.lBK);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nearby/ui/NearbyFriendShowSayHiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */