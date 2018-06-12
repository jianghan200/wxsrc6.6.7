package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.q;
import com.tencent.mm.bp.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.MaskLayout;

public class BizContactEntranceView
  extends RelativeLayout
{
  private View icZ = null;
  private Context mContext;
  View uih;
  private TextView uii;
  private boolean uij = true;
  private boolean uik;
  
  public BizContactEntranceView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
    cyc();
  }
  
  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
    cyc();
  }
  
  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
    cyc();
  }
  
  private void init()
  {
    this.uik = false;
    View.inflate(getContext(), R.i.biz_contact_entrance_view, this);
    this.icZ = findViewById(R.h.container);
    this.uih = this.icZ.findViewById(R.h.biz_contact_entrance_normal);
    Object localObject = this.uih.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject).height = ((int)(a.ae(getContext(), R.f.ContactListHeight) * a.fh(getContext())));
    this.uih.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.icZ.setOnClickListener(new BizContactEntranceView.1(this));
    this.uih.setOnTouchListener(new BizContactEntranceView.2(this));
    localObject = (MaskLayout)this.uih.findViewById(R.h.biz_contact_entrance_avatar_iv);
    ImageView localImageView = (ImageView)((MaskLayout)localObject).getContentView();
    q.Kp();
    localImageView.setImageBitmap(f.jV("service_officialaccounts"));
    this.uii = ((TextView)((MaskLayout)localObject).findViewById(R.h.tipcnt_tv));
  }
  
  final void cyc()
  {
    long l = System.currentTimeMillis();
    au.HU();
    int j = c.FR().clo();
    View localView;
    if (j > 0)
    {
      this.uij = true;
      localView = this.uih;
      if (!this.uij) {
        break label117;
      }
    }
    label117:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      if (this.uij) {
        au.Em().H(new BizContactEntranceView.3(this));
      }
      x.i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.uij), Long.valueOf(System.currentTimeMillis() - l) });
      return;
      this.uij = false;
      break;
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    int i = 0;
    x.i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.uij) });
    View localView = this.icZ;
    if ((paramBoolean) && (this.uij)) {}
    for (;;)
    {
      localView.setVisibility(i);
      return;
      i = 8;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/contact/BizContactEntranceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */