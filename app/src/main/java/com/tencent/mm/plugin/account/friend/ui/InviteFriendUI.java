package com.tencent.mm.plugin.account.friend.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.a.o;
import com.tencent.mm.aa.c;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.ui.tools.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;

public class InviteFriendUI
  extends MMActivity
  implements f.c
{
  private ImageView eKk;
  private String eMl;
  private int eMm;
  private String eMn;
  private String eMo;
  private String eMp;
  private Button eMq;
  private int eMr;
  private int eMs;
  private String eMt = null;
  private String eMu = null;
  
  protected final int getLayoutId()
  {
    return a.g.invite_friend;
  }
  
  protected final void initView()
  {
    this.eKk = ((ImageView)findViewById(a.f.invite_friend_avatar_iv));
    TextView localTextView1 = (TextView)findViewById(a.f.invite_friend_nickname_tv);
    TextView localTextView3 = (TextView)findViewById(a.f.invite_friend_num_tv);
    TextView localTextView2 = (TextView)findViewById(a.f.invite_friend_not_reg);
    this.eMq = ((Button)findViewById(a.f.invite_friend_invite_btn));
    Button localButton = (Button)findViewById(a.f.invite_friend_send_qq_message);
    localTextView1.setText(this.eMn);
    localTextView2.setText(getString(a.j.invite_friend_not_reg, new Object[] { this.eMn }));
    label204:
    long l;
    if (this.eMm == 1)
    {
      this.eKk.setBackgroundDrawable(com.tencent.mm.bp.a.f(this, a.i.default_mobile_avatar));
      localTextView3.setText(getString(a.j.app_field_mobile) + this.eMl);
      localObject = com.tencent.mm.a.g.u(this.eMl.getBytes());
      if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
      {
        localObject = q.Kp().bJ(ad.getContext());
        if (localObject == null) {
          break label584;
        }
        this.eKk.setImageBitmap((Bitmap)localObject);
      }
    }
    else if (this.eMm == 0)
    {
      this.eKk.setBackgroundDrawable(com.tencent.mm.bp.a.f(this, a.i.default_qq_avatar));
      localTextView3.setText(getString(a.j.app_field_qquin) + this.eMl);
      l = o.cx(this.eMl);
      if (l == 0L) {
        break label653;
      }
    }
    label295:
    label384:
    label396:
    label584:
    label612:
    label623:
    label640:
    label653:
    for (Object localObject = c.aY(l);; localObject = null)
    {
      if (localObject == null)
      {
        this.eKk.setImageDrawable(com.tencent.mm.bp.a.f(this, a.i.default_qq_avatar));
        localButton.setVisibility(0);
        if (this.eMm == 2)
        {
          this.eMq.setText(a.j.gcontact_send_invite);
          this.eKk.setBackgroundDrawable(com.tencent.mm.bp.a.f(this, a.e.default_google_avatar));
          localTextView3.setText(getString(a.j.app_field_email) + this.eMl);
          if (com.tencent.mm.kernel.g.Ei().isSDCardAvailable()) {
            break label612;
          }
          localObject = q.Kp().bJ(ad.getContext());
          if (localObject == null) {
            break label623;
          }
          this.eKk.setImageBitmap((Bitmap)localObject);
          if (TextUtils.isEmpty(this.eMn))
          {
            localTextView1.setText(bi.Xe(this.eMl));
            localTextView2.setText(getString(a.j.invite_friend_not_reg, new Object[] { bi.Xe(this.eMl) }));
          }
        }
        if (this.eMm == 3)
        {
          this.eMq.setText(a.j.invite_friend_linkedin_invite);
          localObject = y.a(new d(this.eMu, this.eMu));
          if (localObject == null) {
            break label640;
          }
          this.eKk.setImageBitmap((Bitmap)localObject);
        }
      }
      for (;;)
      {
        localButton.setVisibility(8);
        this.eMq.setOnClickListener(new InviteFriendUI.1(this));
        localButton.setOnClickListener(new InviteFriendUI.2(this));
        setBackBtn(new InviteFriendUI.3(this));
        return;
        localObject = ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).pq((String)localObject);
        if (localObject != null)
        {
          localObject = l.b(((com.tencent.mm.plugin.account.friend.a.a)localObject).Xi(), this);
          break;
        }
        localObject = null;
        break;
        this.eKk.setImageDrawable(com.tencent.mm.bp.a.f(this, a.i.default_mobile_avatar));
        break label204;
        this.eKk.setImageBitmap((Bitmap)localObject);
        break label295;
        localObject = c.jF(this.eMo);
        break label384;
        this.eKk.setImageDrawable(com.tencent.mm.bp.a.f(this, a.e.default_google_avatar));
        break label396;
        this.eKk.setImageResource(a.i.default_avatar);
      }
    }
  }
  
  public final void jX(String paramString)
  {
    if ((this.eMl == null) || (this.eMl.equals(""))) {}
    long l;
    do
    {
      return;
      l = c.jK(paramString);
    } while ((l <= 0L) || (!this.eMl.equals(String.valueOf(l))) || (this.eMm != 0));
    this.eKk.setImageBitmap(c.a(paramString, false, -1));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.invite_friend_title);
    paramBundle = getIntent();
    this.eMm = paramBundle.getIntExtra("friend_type", -1);
    this.eMn = paramBundle.getStringExtra("friend_nick");
    this.eMl = paramBundle.getStringExtra("friend_num");
    this.eMo = paramBundle.getStringExtra("friend_googleID");
    this.eMp = paramBundle.getStringExtra("friend_googleItemID");
    this.eMl = bi.oV(this.eMl);
    this.eMt = paramBundle.getStringExtra("friend_linkedInID");
    this.eMu = paramBundle.getStringExtra("friend_linkedInPicUrl");
    initView();
    this.eMr = paramBundle.getIntExtra("search_kvstat_scene", 0);
    this.eMs = paramBundle.getIntExtra("search_kvstat_position", 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/ui/InviteFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */