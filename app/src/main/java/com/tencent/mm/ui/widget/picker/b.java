package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.g;
import com.tencent.mm.ui.ap;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Button eGn;
  private Button haQ;
  private View ilW;
  private Context mContext;
  private c tYZ;
  private int tZa;
  private BottomSheetBehavior tZb;
  private String[] uLg;
  private ArrayList<List<String>> uLh = null;
  private int uLi;
  private OptionPicker uLj;
  private OptionPicker uLk;
  public a uLl;
  
  public b(Context paramContext, ArrayList<String> paramArrayList)
  {
    this.mContext = paramContext;
    if (paramArrayList != null) {
      this.uLg = ((String[])paramArrayList.toArray(new String[paramArrayList.size()]));
    }
    initView();
  }
  
  public b(Context paramContext, String[] paramArrayOfString)
  {
    this.mContext = paramContext;
    this.uLg = paramArrayOfString;
    initView();
  }
  
  private String[] GD(int paramInt)
  {
    if (this.uLh != null)
    {
      ArrayList localArrayList = (ArrayList)this.uLh.get(paramInt);
      if (localArrayList != null) {
        return (String[])localArrayList.toArray(new String[localArrayList.size()]);
      }
    }
    return null;
  }
  
  private void initView()
  {
    this.tYZ = new c(this.mContext);
    this.ilW = View.inflate(this.mContext, a.g.option_picker_panel, null);
    this.uLj = ((OptionPicker)this.ilW.findViewById(a.f.option_picker));
    this.uLj.setOptionsArray(this.uLg);
    this.uLk = ((OptionPicker)this.ilW.findViewById(a.f.option_second_picker));
    if (this.uLh != null)
    {
      this.uLk.setVisibility(0);
      this.uLk.setOptionsArray(GD(this.uLj.getValue()));
      this.uLj.setOnValueChangedListener(new b.1(this));
    }
    for (;;)
    {
      this.uLi = ap.fromDPToPix(this.mContext, 288);
      this.eGn = ((Button)this.ilW.findViewById(a.f.ok_btn));
      this.eGn.setOnClickListener(new b.2(this));
      this.haQ = ((Button)this.ilW.findViewById(a.f.cancel_btn));
      this.haQ.setOnClickListener(new b.3(this));
      this.tYZ.setContentView(this.ilW);
      this.tZa = ap.fromDPToPix(this.mContext, 350);
      this.tZb = BottomSheetBehavior.h((View)this.ilW.getParent());
      if (this.tZb != null)
      {
        this.tZb.q(this.tZa);
        this.tZb.cv = false;
      }
      this.tYZ.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          b.c(b.this);
        }
      });
      return;
      this.uLk.setVisibility(8);
    }
  }
  
  public final void GB(int paramInt)
  {
    if (paramInt != 0) {
      this.uLi = paramInt;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ilW.getLayoutParams();
    localLayoutParams.height = this.uLi;
    this.ilW.setLayoutParams(localLayoutParams);
    this.ilW.invalidate();
  }
  
  public final void GC(int paramInt)
  {
    if (this.uLj != null) {
      this.uLj.setValue(paramInt);
    }
  }
  
  public final int cAP()
  {
    int i = 0;
    if (this.uLj != null) {
      i = this.uLj.getValue();
    }
    return i;
  }
  
  public final void hide()
  {
    if (this.tYZ != null) {
      this.tYZ.dismiss();
    }
  }
  
  public final void onGlobalLayout() {}
  
  public final void show()
  {
    if (this.tYZ != null) {
      this.tYZ.show();
    }
  }
  
  public static abstract interface a<T>
  {
    public abstract void h(boolean paramBoolean, T paramT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/widget/picker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */