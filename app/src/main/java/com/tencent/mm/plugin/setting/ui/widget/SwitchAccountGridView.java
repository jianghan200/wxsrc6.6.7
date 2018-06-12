package com.tencent.mm.plugin.setting.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.mm.a.e;
import com.tencent.mm.aa.f;
import com.tencent.mm.plugin.setting.a.d;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SwitchAccountGridView
  extends GridLayout
{
  private static int mVV;
  private String eSe;
  private boolean mVW;
  private boolean mVX;
  private boolean mVY;
  public String mVZ;
  public boolean mWa;
  public AnimatorSet mWb;
  public List<String> mWc = new ArrayList();
  public List<d> mWd = new ArrayList();
  public List<View> mWe = new ArrayList();
  private b mWf;
  private a mWg;
  private c mWh;
  
  public SwitchAccountGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    mVV = getResources().getDimensionPixelOffset(a.d.BigAvatarSize) * 2;
  }
  
  public final void L(Map<String, SwitchAccountModel> paramMap)
  {
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      this.mWc.addAll(paramMap.keySet());
      Collections.sort(this.mWc);
    }
    x.i("MicroMsg.SwitchAccountGridView", "account count %d", new Object[] { Integer.valueOf(this.mWc.size()) });
    int i = 0;
    d locald;
    if (i < this.mWc.size())
    {
      localObject1 = ((Activity)getContext()).getLayoutInflater().inflate(a.g.settings_switch_account_item, null);
      localImageView = (ImageView)((View)localObject1).findViewById(a.f.account_avatar);
      localObject2 = (ImageView)((View)localObject1).findViewById(a.f.account_del_btn);
      Object localObject4 = ((View)localObject1).findViewById(a.f.current_account);
      localObject3 = (String)this.mWc.get(i);
      TextView localTextView = (TextView)((View)localObject1).findViewById(a.f.account_username);
      locald = new d((byte)0);
      locald.eDn = localImageView;
      locald.mUo = ((ImageView)localObject2);
      locald.kbU = localTextView;
      locald.mWl = ((View)localObject4);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      localObject4 = ((SwitchAccountModel)paramMap.get(localObject3)).jed;
      for (;;)
      {
        try
        {
          if (!bi.oW((String)localObject4))
          {
            if (!this.mVY) {
              continue;
            }
            x.i("MicroMsg.SwitchAccountGridView", "use system decoder!");
            localObject4 = e.e((String)localObject4, 0, e.cm((String)localObject4));
            if (localObject4 != null)
            {
              localObject4 = BitmapFactory.decodeByteArray((byte[])localObject4, 0, localObject4.length);
              if (localObject4 != null) {
                localImageView.setImageBitmap((Bitmap)localObject4);
              }
            }
          }
        }
        catch (Exception localException)
        {
          x.printErrStackTrace("MicroMsg.SwitchAccountGridView", localException, "get avatar error", new Object[0]);
          continue;
          a.b.a(locald.eDn, (String)localObject3);
          continue;
        }
        localTextView.setText(j.a(getContext(), ((SwitchAccountModel)paramMap.get(localObject3)).username, localTextView.getTextSize()));
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            x.i("MicroMsg.SwitchAccountGridView", "click %s", new Object[] { localObject3 });
            if ((!SwitchAccountGridView.a(SwitchAccountGridView.this)) && (SwitchAccountGridView.b(SwitchAccountGridView.this) != null)) {
              SwitchAccountGridView.b(SwitchAccountGridView.this).KY(localObject3);
            }
          }
        });
        ((ImageView)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            if (SwitchAccountGridView.c(SwitchAccountGridView.this) != null) {
              SwitchAccountGridView.c(SwitchAccountGridView.this).KZ(localObject3);
            }
          }
        });
        this.mWd.add(locald);
        this.mWe.add(localObject1);
        i += 1;
        break;
        localObject4 = f.jW((String)localObject4);
        if (localObject4 == null) {
          continue;
        }
        localImageView.setImageBitmap((Bitmap)localObject4);
      }
    }
    paramMap = ((Activity)getContext()).getLayoutInflater().inflate(a.g.settings_switch_account_item, null);
    Object localObject1 = (ImageView)paramMap.findViewById(a.f.account_avatar);
    ImageView localImageView = (ImageView)paramMap.findViewById(a.f.account_del_btn);
    Object localObject2 = (TextView)paramMap.findViewById(a.f.account_username);
    final Object localObject3 = new d((byte)0);
    ((d)localObject3).eDn = ((ImageView)localObject1);
    ((d)localObject3).mUo = localImageView;
    ((d)localObject3).kbU = ((TextView)localObject2);
    ((ImageView)localObject1).setScaleType(ImageView.ScaleType.FIT_XY);
    ((ImageView)localObject1).setImageResource(a.e.big_add_selector);
    ((TextView)localObject2).setText(getContext().getResources().getString(a.i.settings_switch_account));
    ((ImageView)localObject1).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        x.i("MicroMsg.SwitchAccountGridView", "click addBtn");
        if (SwitchAccountGridView.b(SwitchAccountGridView.this) != null) {
          SwitchAccountGridView.b(SwitchAccountGridView.this).KY(null);
        }
      }
    });
    this.mWd.add(localObject3);
    this.mWe.add(paramMap);
  }
  
  public final void bum()
  {
    if (this.mWa) {
      x.i("MicroMsg.SwitchAccountGridView", "playing animation");
    }
    label91:
    label182:
    label513:
    label547:
    do
    {
      return;
      removeAllViews();
      int j = Math.min(2, this.mWc.size());
      int i = 0;
      if (i < j)
      {
        if ((this.mVW) && (!((String)this.mWc.get(i)).equals(this.eSe)))
        {
          ((d)this.mWd.get(i)).mUo.setVisibility(0);
          ((d)this.mWd.get(i)).mWl.setVisibility(4);
          if ((!bi.oW(this.eSe)) && (((String)this.mWc.get(i)).equals(this.eSe)))
          {
            if (!this.mVX) {
              break label513;
            }
            ((ImageView)((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_dot)).setImageResource(a.e.grey_dot_shape);
            if (!this.mVX) {
              break label547;
            }
            ((TextView)((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_tip)).setText(getContext().getResources().getString(a.i.wx_logout_processing_txt));
          }
        }
        for (;;)
        {
          ((d)this.mWd.get(i)).mWl.findViewById(a.f.account_login_progress).setVisibility(8);
          ((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_dot).setVisibility(0);
          ((d)this.mWd.get(i)).mWl.setVisibility(0);
          if ((!bi.oW(this.mVZ)) && (((String)this.mWc.get(i)).equals(this.mVZ)))
          {
            ((TextView)((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_tip)).setText(getContext().getResources().getString(a.i.login_logining));
            ((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_dot).setVisibility(8);
            ((d)this.mWd.get(i)).mWl.findViewById(a.f.account_login_progress).setVisibility(0);
            ((d)this.mWd.get(i)).mWl.setVisibility(0);
          }
          localLayoutParams = new GridLayout.LayoutParams();
          localLayoutParams.width = mVV;
          addView((View)this.mWe.get(i), localLayoutParams);
          i += 1;
          break;
          ((d)this.mWd.get(i)).mUo.setVisibility(4);
          break label91;
          ((ImageView)((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_dot)).setImageResource(a.e.green_dot_shape);
          break label182;
          ((TextView)((d)this.mWd.get(i)).mWl.findViewById(a.f.current_account_tip)).setText(getContext().getResources().getString(a.i.settings_switch_account_current_tip));
        }
      }
    } while (getChildCount() >= 2);
    ((d)this.mWd.get(this.mWd.size() - 1)).mUo.setVisibility(4);
    GridLayout.LayoutParams localLayoutParams = new GridLayout.LayoutParams();
    localLayoutParams.width = mVV;
    addView((View)this.mWe.get(this.mWe.size() - 1), localLayoutParams);
  }
  
  public int getAccountCount()
  {
    return this.mWc.size();
  }
  
  public void setDeleteState(boolean paramBoolean)
  {
    this.mVW = paramBoolean;
  }
  
  public void setLastLoginWxUsername(String paramString)
  {
    this.eSe = paramString;
  }
  
  public void setLogoutState(boolean paramBoolean)
  {
    this.mVX = paramBoolean;
  }
  
  public void setOnAnimatorEndListener(a parama)
  {
    this.mWg = parama;
  }
  
  public void setOnClickAvatarListener(b paramb)
  {
    this.mWf = paramb;
  }
  
  public void setOnDeleteAvatarListener(c paramc)
  {
    this.mWh = paramc;
  }
  
  public void setSwitchToWxUsername(String paramString)
  {
    this.mVZ = paramString;
  }
  
  public void setUseSystemDecoder(boolean paramBoolean)
  {
    this.mVY = paramBoolean;
  }
  
  public static abstract interface a
  {
    public abstract void btZ();
  }
  
  public static abstract interface b
  {
    public abstract void KY(String paramString);
  }
  
  public static abstract interface c
  {
    public abstract void KZ(String paramString);
  }
  
  private final class d
  {
    public ImageView eDn;
    public TextView kbU;
    public ImageView mUo;
    public View mWl;
    
    private d() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */