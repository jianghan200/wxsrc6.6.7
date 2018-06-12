package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class ServicePreference
  extends Preference
{
  private Context context;
  List<f> mSx;
  AdapterView.OnItemClickListener osG = null;
  private AdapterView.OnItemClickListener osH = null;
  private View.OnClickListener osI = null;
  private int osJ;
  private boolean osK = false;
  private int osL = 0;
  b ota;
  
  public ServicePreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(R.i.app_preference);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.AppPreference);
    this.osJ = paramContext.getInt(R.n.AppPreference_btn_visibility, 8);
    this.osK = paramContext.getBoolean(R.n.AppPreference_can_delete, false);
    this.osL = paramContext.getResourceId(R.n.AppPreference_empty_wording, 0);
    paramContext.recycle();
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(R.h.gridview);
    if (localMMGridView == null) {
      return;
    }
    this.ota = new b(this.context, this.mSx);
    ao.bmf().d(this.ota);
    ao.bmf().c(this.ota);
    localMMGridView.setAdapter(this.ota);
    localMMGridView.setOnItemClickListener(new ServicePreference.1(this));
    if (this.osK) {
      localMMGridView.setOnItemLongClickListener(new ServicePreference.2(this));
    }
    TextView localTextView = (TextView)paramView.findViewById(R.h.empty_tv);
    if (this.ota.getCount() == 0)
    {
      localTextView.setVisibility(0);
      localTextView.setText(this.osL);
      localMMGridView.setVisibility(8);
    }
    for (;;)
    {
      paramView = (Button)paramView.findViewById(R.h.btn);
      paramView.setVisibility(this.osJ);
      paramView.setOnClickListener(this.osI);
      return;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }
  
  public final void onPause()
  {
    if (this.ota != null) {
      ao.bmf().d(this.ota);
    }
  }
  
  public final void onResume()
  {
    if (this.ota != null) {
      ao.bmf().c(this.ota);
    }
  }
  
  public final f xV(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.ota.getCount())) {
      return null;
    }
    return (f)this.ota.getItem(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */