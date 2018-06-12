package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;

public class LanguagePreference
  extends Preference
{
  public a eQG;
  
  public LanguagePreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference);
  }
  
  public final void a(a parama)
  {
    if ((parama == null) || (bi.oW(parama.eQJ)))
    {
      x.e("MicroMsg.LanguagePreference", "setInfo info error");
      return;
    }
    this.eQG = parama;
    setKey(parama.eQJ);
  }
  
  protected final void onBindView(View paramView)
  {
    int j = 1;
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(a.f.languagename);
    paramView = (CheckBox)paramView.findViewById(a.f.state_icon);
    int i;
    if (localTextView != null)
    {
      i = 1;
      if (paramView == null) {
        break label76;
      }
    }
    for (;;)
    {
      if ((j & i) != 0)
      {
        localTextView.setText(this.eQG.eQH);
        paramView.setChecked(this.eQG.eQK);
      }
      return;
      i = 0;
      break;
      label76:
      j = 0;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(a.g.mm_preference_content_language, localViewGroup);
    return paramViewGroup;
  }
  
  public static final class a
  {
    String eQH;
    private String eQI;
    public String eQJ;
    public boolean eQK;
    
    public a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
    {
      this.eQH = paramString1;
      this.eQI = paramString2;
      this.eQJ = paramString3;
      this.eQK = paramBoolean;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LanguagePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */