package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.m;
import java.util.HashMap;
import junit.framework.Assert;

public final class ChoicePreference
  extends Preference
{
  private int lSy = -1;
  private RadioGroup tBH;
  private CharSequence[] tBI;
  private CharSequence[] tBJ;
  public Preference.a tBK;
  String value;
  private final HashMap<CharSequence, b> values = new HashMap();
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.ChoicePreference, paramInt, 0);
    this.tBI = paramContext.getTextArray(a.m.ChoicePreference_entries);
    this.tBJ = paramContext.getTextArray(a.m.ChoicePreference_entryValues);
    paramContext.recycle();
    csh();
  }
  
  private void csh()
  {
    int i = 0;
    if (this.tBI == null) {
      this.tBI = new CharSequence[0];
    }
    if (this.tBJ == null) {
      this.tBJ = new CharSequence[0];
    }
    if (this.tBI.length == this.tBJ.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.tBJ.length)
      {
        b localb = new b(this.tBI[i], 1048576 + i);
        this.values.put(this.tBJ[i], localb);
        i += 1;
      }
    }
  }
  
  public final void a(Preference.a parama)
  {
    this.tBK = parama;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.tBH != null) {
      this.tBH.check(this.lSy);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    Object localObject = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    ((ViewGroup)localObject).removeAllViews();
    localLayoutInflater.inflate(a.h.mm_preference_content_choice, (ViewGroup)localObject);
    this.tBH = ((RadioGroup)paramViewGroup.findViewById(a.g.group));
    int i = 0;
    if (i < this.tBJ.length)
    {
      localObject = this.tBJ[i];
      localObject = (b)this.values.get(localObject);
      RadioButton localRadioButton;
      if (localObject != null)
      {
        if (i != 0) {
          break label138;
        }
        localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.mm_choice_btn_left, null);
        ((b)localObject).a(localRadioButton);
        this.tBH.addView(localRadioButton);
      }
      for (;;)
      {
        i += 1;
        break;
        label138:
        if (i == this.tBJ.length - 1)
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.mm_choice_btn_right, null);
          ((b)localObject).a(localRadioButton);
          this.tBH.addView(localRadioButton);
        }
        else
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.mm_choice_btn_middle, null);
          ((b)localObject).a(localRadioButton);
          this.tBH.addView(localRadioButton);
        }
      }
    }
    this.tBH.setOnCheckedChangeListener(new ChoicePreference.1(this));
    return paramViewGroup;
  }
  
  public final void setValue(String paramString)
  {
    this.value = paramString;
    paramString = (b)this.values.get(paramString);
    if (paramString == null)
    {
      this.lSy = -1;
      return;
    }
    this.lSy = paramString.id;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/ChoicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */