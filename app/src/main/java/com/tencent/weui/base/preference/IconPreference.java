package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bw.a.c;
import com.tencent.mm.bw.a.d;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.g;

public class IconPreference
  extends Preference
{
  private Context context;
  private String desc = "";
  private Drawable drawable;
  private TextView fAK;
  private int height = -1;
  protected ImageView kYT = null;
  private String mQi = "";
  private int mQj = -1;
  private int mQk = 8;
  private ImageView nDe = null;
  private int tBS = 8;
  private int tBT = 8;
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
  private boolean tCn = false;
  private int tCo = -1;
  private boolean tCp = false;
  protected int tgw = -1;
  private Bitmap tiW = null;
  private int vzy = 8;
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(a.g.mm_preference);
  }
  
  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.tCl = ((ImageView)paramView.findViewById(a.f.image_iv));
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
      localObject = (LinearLayout)paramView.findViewById(a.f.mm_preference_ll_id);
      ((LinearLayout)localObject).setMinimumHeight(paramView.getResources().getDimensionPixelSize(a.d.SmallListHeight));
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      this.tCk = ((TextView)paramView.findViewById(a.f.text_tv_one));
      if (this.tCk != null)
      {
        if (!this.tCn) {
          break label723;
        }
        this.tCk.setCompoundDrawablesWithIntrinsicBounds(a.e.unread_dot_shape, 0, 0, 0);
        this.tCk.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.d.SmallPadding));
        label155:
        this.tCk.setVisibility(this.mQk);
        this.tCk.setText(this.mQi);
        if (this.mQj != -1) {
          this.tCk.setBackgroundDrawable(this.context.getResources().getDrawable(this.mQj));
        }
      }
      this.tCj = ((TextView)paramView.findViewById(a.f.text_tv_two));
      if (this.tCj != null)
      {
        this.tCj.setVisibility(this.tCc);
        this.tCj.setText(this.tCa);
        if (this.tCb != -1) {
          this.tCj.setBackgroundDrawable(this.context.getResources().getDrawable(this.tCb));
        }
        if (this.tCd != -1) {
          this.tCj.setTextColor(this.tCd);
        }
        if (!this.tCm) {
          break label737;
        }
        this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.e.unread_dot_shape, 0);
        this.tCj.setCompoundDrawablePadding((int)this.context.getResources().getDimension(a.d.SmallPadding));
      }
      label338:
      this.tBV = ((ImageView)paramView.findViewById(a.f.text_prospect));
      this.tBV.setVisibility(this.tBS);
      if (this.tCo != -1) {
        this.tBV.setImageResource(this.tCo);
      }
      this.kYT = ((ImageView)paramView.findViewById(a.f.image_right_iv));
      this.tBW = ((ViewGroup)paramView.findViewById(a.f.right_rl));
      this.tCh = paramView.findViewById(a.f.right_center_prospect);
      this.tCh.setVisibility(this.tCf);
      this.tCg = paramView.findViewById(a.f.right_prospect);
      this.tCg.setVisibility(this.tBU);
      this.nDe = ((ImageView)paramView.findViewById(a.f.right_arrow));
      this.nDe.setVisibility(this.vzy);
      if (this.tiW == null) {
        break label751;
      }
      this.kYT.setImageBitmap(this.tiW);
      label497:
      this.kYT.setVisibility(this.tCe);
      this.tBW.setVisibility(this.tBT);
      if (this.tCi != null) {
        this.kYT.setLayoutParams(this.tCi);
      }
      this.tBX = ((TextView)paramView.findViewById(16908310));
      this.fAK = ((TextView)paramView.findViewById(a.f.desc));
      if (this.fAK != null)
      {
        this.fAK.setVisibility(this.tBZ);
        this.fAK.setText(this.desc);
        if (!this.tCp) {
          break label773;
        }
        this.fAK.setTextColor(this.context.getResources().getColor(a.c.disable_text_color));
      }
      label621:
      if (this.tBX != null)
      {
        if (!this.tCp) {
          break label796;
        }
        this.tBX.setTextColor(this.context.getResources().getColor(a.c.disable_text_color));
      }
      label655:
      if (this.tCp) {
        break label819;
      }
    }
    label723:
    label737:
    label751:
    label773:
    label796:
    label819:
    for (boolean bool = true;; bool = false)
    {
      paramView.setEnabled(bool);
      return;
      if (getIcon() != null)
      {
        localObject = this.tCl;
        Drawable localDrawable = getIcon();
        this.drawable = localDrawable;
        ((ImageView)localObject).setImageDrawable(localDrawable);
        this.tCl.setVisibility(0);
        break;
      }
      this.tCl.setVisibility(8);
      break;
      this.tCk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label155;
      this.tCj.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label338;
      if (this.tgw == -1) {
        break label497;
      }
      this.kYT.setImageResource(this.tgw);
      break label497;
      this.fAK.setTextColor(this.context.getResources().getColor(a.c.hint_text_color));
      break label621;
      this.tBX.setTextColor(this.context.getResources().getColor(a.c.normal_text_color));
      break label655;
    }
  }
  
  protected View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), a.g.preference_content_icon, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/weui/base/preference/IconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */