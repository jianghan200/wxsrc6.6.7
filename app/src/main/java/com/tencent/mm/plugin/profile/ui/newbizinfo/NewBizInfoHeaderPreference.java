package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.m.a.a;
import com.tencent.mm.ac.z;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoHeaderPreference
  extends Preference
  implements f.c, m.a.a, m.b
{
  private MMActivity bGc;
  private ImageView eBM;
  private TextView eBO;
  private TextView fAK;
  ab guS;
  private boolean iAc;
  String lUr;
  d lUs;
  
  public NewBizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public NewBizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      x.d("MicroMsg.NewBizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      return;
      paramm = (String)paramObject;
    } while ((bi.oV(paramm).length() <= 0) || (this.guS == null) || (!this.guS.field_username.equals(paramm)));
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(paramm);
  }
  
  final void initView()
  {
    boolean bool = true;
    if ((!this.iAc) || (this.guS == null))
    {
      x.w("MicroMsg.NewBizInfoHeaderPreference", "initView contact is null, return");
      return;
    }
    this.eBO.setText(j.a(this.bGc, bi.oV(this.guS.BK()), this.eBO.getTextSize()));
    if (this.lUs == null) {
      this.lUs = com.tencent.mm.ac.f.kH(this.guS.field_username);
    }
    Object localObject2;
    if (this.lUs != null)
    {
      this.lUr = this.lUs.field_brandIconURL;
      localObject2 = com.tencent.mm.ac.m.d(this.lUs.field_username, this.lUs.field_brandIconURL, R.g.nosdcard_headimg);
      if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
        break label258;
      }
      this.eBM.setImageBitmap((Bitmap)localObject2);
    }
    for (;;)
    {
      this.eBM.setOnClickListener(new NewBizInfoHeaderPreference.1(this));
      if (bi.oV(this.guS.signature).trim().length() > 0) {
        break label304;
      }
      this.fAK.setVisibility(8);
      return;
      localObject2 = com.tencent.mm.aa.c.a(this.guS.field_username, true, -1);
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!((Bitmap)localObject2).isRecycled()) {
          localObject1 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject2, false, ((Bitmap)localObject2).getWidth() / 2);
        }
      }
      localObject2 = localObject1;
      if (localObject1 != null) {
        break;
      }
      localObject2 = localObject1;
      if (bi.oW(this.lUr)) {
        break;
      }
      localObject2 = com.tencent.mm.ac.m.d(this.guS.field_username, this.lUr, R.g.nosdcard_headimg);
      break;
      label258:
      localObject1 = new c.a();
      ((c.a)localObject1).dXR = R.g.brand_default_head;
      ((c.a)localObject1).dXx = false;
      ((c.a)localObject1).dXW = true;
      o.Pj().a(this.lUr, this.eBM, ((c.a)localObject1).Pt());
    }
    label304:
    this.fAK.setText(j.a(this.bGc, this.guS.signature));
    this.fAK.setVisibility(0);
    if (am.a.dBt != null)
    {
      localObject1 = BackwardSupportUtil.b.e(am.a.dBt.gX(this.guS.field_verifyFlag), 2.0F);
      if (localObject1 != null) {
        break label419;
      }
      label363:
      x.i("MicroMsg.NewBizInfoHeaderPreference", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
      if (localObject1 == null) {
        break label424;
      }
    }
    label419:
    label424:
    for (Object localObject1 = new BitmapDrawable(this.bGc.getResources(), (Bitmap)localObject1);; localObject1 = null)
    {
      this.fAK.setCompoundDrawables((Drawable)localObject1, null, null, null);
      return;
      localObject1 = null;
      break;
      bool = false;
      break label363;
    }
  }
  
  public final void jX(String paramString)
  {
    x.i("MicroMsg.NewBizInfoHeaderPreference", "notifyChanged user:%s", new Object[] { paramString });
    if (bi.oW(paramString)) {
      x.i("MicroMsg.NewBizInfoHeaderPreference", "notifyChanged err, user is null");
    }
    while ((this.guS == null) || (!paramString.equals(this.guS.field_username))) {
      return;
    }
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
    this.eBM = ((ImageView)paramView.findViewById(R.h.bizinfo_avatar));
    this.eBO = ((TextView)paramView.findViewById(R.h.bizinfo_title));
    this.fAK = ((TextView)paramView.findViewById(R.h.bizinfo_desc));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */