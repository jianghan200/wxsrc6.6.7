package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aa.c;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.ui.MMActivity;

public class ShowNonWeixinFriendUI
  extends MMActivity
  implements f.c
{
  private long eXi = 0L;
  private String eXj = "";
  
  protected final int getLayoutId()
  {
    return a.g.facebookapp_show_non_weixin_friend;
  }
  
  protected final void initView()
  {
    ImageView localImageView = (ImageView)findViewById(a.f.invite_friend_avatar_iv);
    TextView localTextView1 = (TextView)findViewById(a.f.invite_friend_nickname_tv);
    TextView localTextView2 = (TextView)findViewById(a.f.invite_friend_not_reg);
    localImageView.setBackgroundDrawable(a.f(this, a.i.default_mobile_avatar));
    localImageView.setImageBitmap(c.jI(this.eXi));
    localTextView1.setText(this.eXj);
    localTextView2.setText(getString(a.j.invite_friend_not_reg, new Object[] { this.eXj }));
    setBackBtn(new ShowNonWeixinFriendUI.1(this));
    ((Button)findViewById(a.f.invite_friend_invite_btn)).setOnClickListener(new ShowNonWeixinFriendUI.2(this));
  }
  
  public final void jX(String paramString)
  {
    initView();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.invite_friend_title);
    this.eXi = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.eXj = getIntent().getStringExtra("Contact_KFacebookName");
    initView();
  }
  
  protected void onPause()
  {
    super.onPause();
    q.Kp().e(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    q.Kp().d(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/ShowNonWeixinFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */