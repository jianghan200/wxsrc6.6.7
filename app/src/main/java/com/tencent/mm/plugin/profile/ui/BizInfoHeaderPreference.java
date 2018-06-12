package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.m.a.a;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class BizInfoHeaderPreference
  extends Preference
  implements f.c, m.a.a, m.b
{
  private MMActivity bGc;
  ab guS;
  private boolean iAc = false;
  private TextView jYA;
  private TextView kkF;
  private ImageView lUo;
  private ImageView lUp;
  private View lUq;
  String lUr;
  d lUs;
  
  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  private boolean bnm()
  {
    return (this.iAc) && (this.guS != null);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      x.d("MicroMsg.BizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      return;
      if (!bnm())
      {
        x.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.iAc + "contact = " + this.guS);
        return;
      }
      paramm = (String)paramObject;
    } while ((bi.oV(paramm).length() <= 0) || (this.guS == null) || (!this.guS.field_username.equals(paramm)));
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(paramm);
  }
  
  final void initView()
  {
    boolean bool = true;
    if (!bnm())
    {
      x.w("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.iAc + "contact = " + this.guS);
      return;
    }
    this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.BK()) + " ", this.jYA.getTextSize()));
    if (this.lUs == null) {
      this.lUs = com.tencent.mm.ac.f.kH(this.guS.field_username);
    }
    Object localObject1;
    Object localObject2;
    if (this.lUs != null)
    {
      this.lUr = this.lUs.field_brandIconURL;
      localObject1 = com.tencent.mm.ac.m.d(this.lUs.field_username, this.lUs.field_brandIconURL, R.g.nosdcard_headimg);
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = BitmapFactory.decodeResource(this.bGc.getResources(), R.g.brand_default_head);
      }
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
        this.lUo.setImageBitmap((Bitmap)localObject2);
      }
      this.lUo.setTag(this.guS.field_username);
      this.lUq.setOnClickListener(new BizInfoHeaderPreference.1(this));
      if (!a.gd(this.guS.field_type)) {
        break label512;
      }
      if (this.lUs != null) {
        break label407;
      }
      label243:
      if (!bool) {
        break label512;
      }
      if (bi.oW(this.guS.wM())) {
        break label418;
      }
      this.kkF.setVisibility(0);
      this.kkF.setText(this.mContext.getString(R.l.app_field_username) + this.guS.wM());
    }
    for (;;)
    {
      if (!this.guS.BC()) {
        break label524;
      }
      this.lUp.setVisibility(0);
      return;
      localObject1 = com.tencent.mm.aa.c.a(this.guS.field_username, true, -1);
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!((Bitmap)localObject1).isRecycled()) {
          localObject2 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject1, false, ((Bitmap)localObject1).getWidth() / 2);
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      localObject1 = localObject2;
      if (TextUtils.isEmpty(this.lUr)) {
        break;
      }
      localObject1 = com.tencent.mm.ac.m.d(this.guS.field_username, this.lUr, R.g.nosdcard_headimg);
      break;
      label407:
      bool = this.lUs.Me();
      break label243;
      label418:
      if ((!ab.XT(this.guS.field_username)) && (!s.hd(this.guS.field_username)))
      {
        localObject1 = bi.oV(this.guS.BM());
        this.kkF.setText(this.mContext.getString(R.l.app_field_username) + (String)localObject1);
        this.kkF.setVisibility(0);
      }
      else
      {
        this.kkF.setVisibility(8);
        continue;
        label512:
        this.kkF.setVisibility(8);
      }
    }
    label524:
    this.lUp.setVisibility(8);
  }
  
  public final void jX(String paramString)
  {
    if (!bnm()) {
      x.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.iAc + "contact = " + this.guS);
    }
    do
    {
      return;
      if (bi.oV(paramString).length() <= 0)
      {
        x.e("MicroMsg.BizInfoHeaderPreference", "notifyChanged: user = " + paramString);
        return;
      }
    } while (!paramString.equals(this.guS.field_username));
    initView();
  }
  
  public final void kX(String paramString)
  {
    if ((this.guS != null) && (paramString != null) && (paramString.equals(this.guS.field_username))) {
      initView();
    }
  }
  
  public final void onBindView(View paramView)
  {
    x.d("MicroMsg.BizInfoHeaderPreference", "onBindView");
    this.jYA = ((TextView)paramView.findViewById(R.h.contact_info_nickname_tv));
    this.kkF = ((TextView)paramView.findViewById(R.h.contact_info_username_tv));
    this.lUp = ((ImageView)paramView.findViewById(R.h.biz_favor));
    this.lUo = ((ImageView)paramView.findViewById(R.h.contact_info_avatar_iv));
    this.lUq = paramView.findViewById(R.h.contact_info_avatar_iv_mask);
    this.iAc = true;
    initView();
    super.onBindView(paramView);
  }
  
  public final void onDetach()
  {
    au.HU();
    com.tencent.mm.model.c.FR().b(this);
    q.Kp().e(this);
    z.Ni().b(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */