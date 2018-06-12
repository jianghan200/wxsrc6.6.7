package com.tencent.mm.plugin.nearby.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c;

public class NearbyFriendsIntroUI
  extends MMActivity
{
  private Button eGn;
  private View lBE;
  private CheckBox lBF;
  private c lBH = null;
  
  protected final int getLayoutId()
  {
    return R.i.nearby_friend_intro;
  }
  
  protected final void initView()
  {
    this.lBE = View.inflate(this, R.i.lbs_open_dialog_view, null);
    this.lBF = ((CheckBox)this.lBE.findViewById(R.h.lbs_open_dialog_cb));
    this.lBF.setChecked(false);
    this.eGn = ((Button)findViewById(R.h.nearby_friend_intro_start_btn));
    this.eGn.setOnClickListener(new NearbyFriendsIntroUI.1(this));
    setBackBtn(new NearbyFriendsIntroUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.nearby_friend_title);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/nearby/ui/NearbyFriendsIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */