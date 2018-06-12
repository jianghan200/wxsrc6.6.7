package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ag;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class IPCallDynamicTextView
  extends TextView
{
  private double kvA;
  private double kvB;
  private double kvC;
  private boolean kvD;
  private int kvE = 4000;
  private int kvF = 50;
  DecimalFormat kvG = new DecimalFormat("0.00");
  private String kvH = "";
  private String kvI = "";
  private int kvz;
  private ag mHandler = new IPCallDynamicTextView.1(this);
  private int mHeight;
  private String mValue;
  
  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public IPCallDynamicTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public static String Fd(String paramString)
  {
    String str1 = "";
    int i = 0;
    while ((i < paramString.length()) && (!Character.isDigit(paramString.charAt(i))))
    {
      str1 = str1 + paramString.charAt(i);
      i += 1;
    }
    String str2 = "";
    i = paramString.length() - 1;
    while ((i > 0) && (!Character.isDigit(paramString.charAt(i))))
    {
      str2 = str2 + paramString.charAt(i);
      i -= 1;
    }
    return paramString.substring(str1.length(), paramString.length() - str2.length());
  }
  
  private void init()
  {
    getViewTreeObserver().addOnGlobalLayoutListener(new IPCallDynamicTextView.2(this));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.mHeight = getMeasuredHeight();
  }
  
  public void setLocHeight(int paramInt)
  {
    this.kvz = paramInt;
  }
  
  public final void setValue(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0) || (paramString2 == null) || (paramString2.length() <= 0)) {
      setText(paramString2);
    }
    do
    {
      return;
      try
      {
        this.kvB = Double.parseDouble(Fd(paramString1));
        this.kvH = "";
        i = 0;
        while ((i < paramString2.length()) && (!Character.isDigit(paramString2.charAt(i))))
        {
          this.kvH += paramString2.charAt(i);
          i += 1;
        }
        this.kvI = "";
      }
      catch (NumberFormatException paramString1)
      {
        setText(paramString2);
        return;
      }
      int i = paramString2.length() - 1;
      while ((i > 0) && (!Character.isDigit(paramString2.charAt(i))))
      {
        this.kvI += paramString2.charAt(i);
        i -= 1;
      }
      paramString1 = paramString2.substring(this.kvH.length(), paramString2.length() - this.kvI.length());
      try
      {
        this.kvC = Double.parseDouble(paramString1);
        this.mValue = paramString2;
        this.kvA = ((this.kvC - this.kvB) / (this.kvE / this.kvF));
        if (this.kvA == 0.0D)
        {
          setText(paramString2);
          return;
        }
      }
      catch (NumberFormatException paramString1)
      {
        setText(paramString2);
        return;
      }
      this.kvA = new BigDecimal(this.kvA).setScale(2, 4).doubleValue();
    } while (!isShown());
    this.mHandler.sendEmptyMessage(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallDynamicTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */