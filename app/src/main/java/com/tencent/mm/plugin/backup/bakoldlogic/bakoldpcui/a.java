package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends b
  implements e.d
{
  private static String TAG = "MicroMsg.BakChatBanner";
  private View gYR = null;
  private int gZU = -1;
  private ag handler = new ag(Looper.getMainLooper());
  private int hay = 0;
  private c haz;
  
  public a(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.gYR = this.view.findViewById(R.h.bakchat_banner_view);
      this.gYR.setOnClickListener(new a.2(this));
    }
    anR();
    this.haz = new a.1(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.haz);
  }
  
  private boolean dE(boolean paramBoolean)
  {
    this.gZU = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU;
    x.d(TAG, "dealwithPCBakBanner PCBannerStatus:%d, setCallBack:%b", new Object[] { Integer.valueOf(this.gZU), Boolean.valueOf(paramBoolean) });
    if ((this.gZU >= 2) && (this.gZU <= 6))
    {
      this.gYR.setVisibility(0);
      if ((paramBoolean) && (!com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().asV())) {
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().a(this);
      }
      if (2 == this.gZU)
      {
        ((ImageView)this.view.findViewById(R.h.bakchat_icon)).setImageResource(R.k.chatting_backup_computer);
        ((TextView)this.view.findViewById(R.h.bakchat_info)).setText(ad.getContext().getString(R.l.bak_chat_banner_preparing, new Object[] { Integer.valueOf(this.hay) }));
      }
      for (;;)
      {
        return true;
        if (3 == this.gZU)
        {
          ((ImageView)this.view.findViewById(R.h.bakchat_icon)).setImageResource(R.k.chatting_backup_computer);
          ((TextView)this.view.findViewById(R.h.bakchat_info)).setText(ad.getContext().getString(R.l.bak_chat_banner_uploading, new Object[] { Integer.valueOf(this.hay) }));
        }
        else if (4 == this.gZU)
        {
          ((TextView)this.view.findViewById(R.h.bakchat_info)).setText(ad.getContext().getString(R.l.bak_chat_banner_upload_success));
          ((ImageView)this.view.findViewById(R.h.bakchat_icon)).setImageResource(R.k.chatting_backup_comfirm);
        }
        else if (5 == this.gZU)
        {
          ((ImageView)this.view.findViewById(R.h.bakchat_icon)).setImageResource(R.k.chatting_backup_computer);
          ((TextView)this.view.findViewById(R.h.bakchat_info)).setText(ad.getContext().getString(R.l.bak_chat_banner_downloading, new Object[] { Integer.valueOf(this.hay) }));
        }
        else if (6 == this.gZU)
        {
          ((TextView)this.view.findViewById(R.h.bakchat_info)).setText(ad.getContext().getString(R.l.bak_chat_banner_recover_wait));
          ((ImageView)this.view.findViewById(R.h.bakchat_icon)).setImageResource(R.k.chatting_backup_comfirm);
        }
      }
    }
    this.gYR.setVisibility(8);
    return false;
  }
  
  public final boolean anR()
  {
    this.hay = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().asY();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().a(this);
    return dE(true);
  }
  
  public final void aqO() {}
  
  public final void atb()
  {
    x.d(TAG, "onNetFinish PCBannerStatus:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU) });
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO();
    e.mP(17);
    this.handler.post(new a.4(this));
  }
  
  public final void atc() {}
  
  public final void destroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.haz);
  }
  
  public final int getLayoutId()
  {
    return R.i.bakchat_banner_view;
  }
  
  public final int getOrder()
  {
    return 3;
  }
  
  public final void mT(int paramInt)
  {
    x.d(TAG, "onNetProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU), Integer.valueOf(paramInt) });
    this.hay = paramInt;
    this.handler.post(new a.3(this));
  }
  
  public final void mU(int paramInt)
  {
    x.d(TAG, "onMergeProgress PCBannerStatus:%d, percent:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU), Integer.valueOf(paramInt) });
  }
  
  public final void onError(int paramInt) {}
  
  public final void release()
  {
    this.gZU = -1;
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().asW();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */