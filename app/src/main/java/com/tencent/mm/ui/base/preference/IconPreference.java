package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class IconPreference
  extends Preference
{
  private Context context;
  private String desc = "";
  public Drawable drawable;
  private TextView fAK;
  private int height = -1;
  public ImageView kYT = null;
  private String mQi = "";
  private int mQj = -1;
  private int mQk = 8;
  private int tBS = 8;
  private int tBT = 0;
  private int tBU = 8;
  private ImageView tBV = null;
  private ViewGroup tBW = null;
  private TextView tBX;
  private int tBZ = 8;
  private String tCa = "";
  private int tCb = -1;
  private int tCc = 8;
  private int tCd = -1;
  private int tCe = 8;
  private int tCf = 8;
  private View tCg = null;
  private View tCh = null;
  RelativeLayout.LayoutParams tCi;
  private TextView tCj;
  private TextView tCk;
  private ImageView tCl;
  private boolean tCm = false;
  public boolean tCn = false;
  private int tCo = -1;
  public boolean tCp = false;
  public int tgw = -1;
  private Bitmap tiW = null;
  
  public IconPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(a.h.mm_preference);
  }
  
  public final void Er(int paramInt)
  {
    this.mQk = paramInt;
    if (this.tCk != null) {
      this.tCk.setVisibility(paramInt);
    }
  }
  
  public final void Es(int paramInt)
  {
    this.tCc = paramInt;
    if (this.tCj != null) {
      this.tCj.setVisibility(paramInt);
    }
  }
  
  public final void Et(int paramInt)
  {
    this.tBS = paramInt;
    if (this.tBV != null) {
      this.tBV.setVisibility(paramInt);
    }
  }
  
  public final void Eu(int paramInt)
  {
    this.tgw = paramInt;
    this.tiW = null;
    if (this.kYT != null) {
      this.kYT.setImageResource(paramInt);
    }
  }
  
  public final void Ev(int paramInt)
  {
    this.tCe = paramInt;
    if (this.kYT != null) {
      this.kYT.setVisibility(this.tCe);
    }
  }
  
  public final void Ew(int paramInt)
  {
    this.tBT = paramInt;
    if (this.tBW != null) {
      this.tBW.setVisibility(this.tBT);
    }
  }
  
  public final void Ex(int paramInt)
  {
    this.tBU = paramInt;
    if (this.tCg != null) {
      this.tCg.setVisibility(this.tBU);
    }
  }
  
  public final void V(Bitmap paramBitmap)
  {
    this.tiW = paramBitmap;
    this.tgw = -1;
    if (this.kYT != null) {
      this.kYT.setImageBitmap(paramBitmap);
    }
  }
  
  public final void ao(String paramString, int paramInt1, int paramInt2)
  {
    this.tCa = paramString;
    this.tCb = paramInt1;
    this.tCd = paramInt2;
    if (this.tCj != null)
    {
      this.tCj.setText(paramString);
      if (paramInt1 != -1) {
        this.tCj.setBackgroundDrawable(a.f(this.context, paramInt1));
      }
      if (paramInt2 != -1) {
        this.tCj.setTextColor(paramInt2);
      }
    }
  }
  
  public final void csj()
  {
    this.tBZ = 0;
    if (this.fAK != null) {
      this.fAK.setVisibility(0);
    }
  }
  
  public final void dk(String paramString, int paramInt)
  {
    this.mQi = paramString;
    this.mQj = paramInt;
  }
  
  public final void dl(String paramString, int paramInt)
  {
    ao(paramString, paramInt, this.tCd);
  }
  
  public final void eV(int paramInt1, int paramInt2)
  {
    this.tBS = paramInt1;
    this.tCo = paramInt2;
  }
  
  public final void eW(int paramInt1, int paramInt2)
  {
    this.tCi = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    this.tCi.addRule(13);
    if (this.kYT == null) {
      return;
    }
    this.kYT.setLayoutParams(this.tCi);
  }
  
  public final void lN(boolean paramBoolean)
  {
    this.tCm = paramBoolean;
    if (this.tCj != null)
    {
      if (paramBoolean)
      {
        this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.f.unread_dot_shape, 0);
        this.tCj.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.SmallPadding));
      }
    }
    else {
      return;
    }
    this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }
  
  public void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.tCl = ((ImageView)paramView.findViewById(a.g.image_iv));
    Object localObject;
    if (this.tCl != null)
    {
      if (this.drawable != null)
      {
        this.tCl.setImageDrawable(this.drawable);
        this.tCl.setVisibility(0);
      }
    }
    else
    {
      localObject = (LinearLayout)paramView.findViewById(a.g.mm_preference_ll_id);
      ((LinearLayout)localObject).setMinimumHeight((int)(paramView.getResources().getDimensionPixelSize(a.e.SmallListHeight) * a.fh(this.context)));
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      this.tCk = ((TextView)paramView.findViewById(a.g.text_tv_one));
      if (this.tCk != null)
      {
        if (!this.tCn) {
          break label722;
        }
        this.tCk.setCompoundDrawablesWithIntrinsicBounds(a.f.unread_dot_shape, 0, 0, 0);
        this.tCk.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.SmallPadding));
        label165:
        this.tCk.setVisibility(this.mQk);
        this.tCk.setText(this.mQi);
        if (this.mQj != -1) {
          this.tCk.setBackgroundDrawable(a.f(this.context, this.mQj));
        }
      }
      this.tCj = ((TextView)paramView.findViewById(a.g.text_tv_two));
      if (this.tCj != null)
      {
        this.tCj.setVisibility(this.tCc);
        this.tCj.setText(this.tCa);
        if (this.tCb != -1) {
          this.tCj.setBackgroundDrawable(a.f(this.context, this.tCb));
        }
        if (this.tCd != -1) {
          this.tCj.setTextColor(this.tCd);
        }
        if (!this.tCm) {
          break label736;
        }
        this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.f.unread_dot_shape, 0);
        this.tCj.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.e.SmallPadding));
      }
      label342:
      this.tBV = ((ImageView)paramView.findViewById(a.g.text_prospect));
      this.tBV.setVisibility(this.tBS);
      if (this.tCo != -1) {
        this.tBV.setImageResource(this.tCo);
      }
      this.kYT = ((ImageView)paramView.findViewById(a.g.image_right_iv));
      this.kYT.setScaleType(ImageView.ScaleType.CENTER_CROP);
      this.tBW = ((ViewGroup)paramView.findViewById(a.g.right_rl));
      this.tCh = paramView.findViewById(a.g.right_center_prospect);
      this.tCh.setVisibility(this.tCf);
      this.tCg = paramView.findViewById(a.g.right_prospect);
      this.tCg.setVisibility(this.tBU);
      if (this.tiW == null) {
        break label750;
      }
      this.kYT.setImageBitmap(this.tiW);
      label486:
      this.kYT.setVisibility(this.tCe);
      this.tBW.setVisibility(this.tBT);
      if (this.tCi != null) {
        this.kYT.setLayoutParams(this.tCi);
      }
      this.tBX = ((TextView)paramView.findViewById(16908310));
      this.fAK = ((TextView)paramView.findViewById(a.g.desc));
      if (this.fAK != null)
      {
        this.fAK.setVisibility(this.tBZ);
        this.fAK.setText(this.desc);
        if (!this.tCp) {
          break label772;
        }
        this.fAK.setTextColor(this.context.getResources().getColor(a.d.disable_text_color));
      }
      label610:
      if (this.tBX != null)
      {
        if (!this.tCp) {
          break label795;
        }
        this.tBX.setTextColor(this.context.getResources().getColor(a.d.disable_text_color));
      }
      label644:
      if (this.tCp) {
        break label818;
      }
    }
    label722:
    label736:
    label750:
    label772:
    label795:
    label818:
    for (boolean bool = true;; bool = false)
    {
      paramView.setEnabled(bool);
      return;
      if (this.Hu != 0)
      {
        localObject = this.tCl;
        Drawable localDrawable = this.mContext.getResources().getDrawable(this.Hu);
        this.drawable = localDrawable;
        ((ImageView)localObject).setImageDrawable(localDrawable);
        this.tCl.setVisibility(0);
        break;
      }
      this.tCl.setVisibility(8);
      break;
      this.tCk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label165;
      this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label342;
      if (this.tgw == -1) {
        break label486;
      }
      this.kYT.setImageResource(this.tgw);
      break label486;
      this.fAK.setTextColor(this.context.getResources().getColor(a.d.hint_text_color));
      break label610;
      this.tBX.setTextColor(this.context.getResources().getColor(a.d.normal_text_color));
      break label644;
    }
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.mm_preference_content_icon, localViewGroup);
    return paramViewGroup;
  }
  
  public final void setDesc(String paramString)
  {
    this.desc = paramString;
    if (this.fAK != null) {
      this.fAK.setText(paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/preference/IconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */