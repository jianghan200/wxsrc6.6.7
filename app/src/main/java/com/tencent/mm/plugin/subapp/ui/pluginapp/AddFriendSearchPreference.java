package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.InputPreference.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendSearchPreference
  extends Preference
{
  private Context context;
  private TextView eSV = null;
  private String otc = "";
  String otd = "";
  private View.OnClickListener ote = null;
  View.OnClickListener otf = null;
  private InputPreference.a otg = null;
  private TextView oth = null;
  private View.OnClickListener oti = new AddFriendSearchPreference.1(this);
  
  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(R.i.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    paramView.setOnTouchListener(new AddFriendSearchPreference.2(this));
    this.oth = ((TextView)paramView.findViewById(R.h.edittext));
    this.eSV = ((TextView)paramView.findViewById(R.h.sepical_hint));
    this.eSV.setText(this.otd);
    if (this.otf != null) {
      this.eSV.setOnTouchListener(new AddFriendSearchPreference.3(this));
    }
    if (this.otg != null)
    {
      paramView = (Button)paramView.findViewById(R.h.button);
      paramView.setOnClickListener(this.oti);
      paramView.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.mm_preference_content_add_friend_search_item, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), 0, localViewGroup.getPaddingBottom());
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */