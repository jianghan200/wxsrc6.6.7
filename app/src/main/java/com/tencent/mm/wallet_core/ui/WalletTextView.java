package com.tencent.mm.wallet_core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Selection;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.plugin.secinforeport.a.d;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.f.a;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"AppCompatCustomView"})
public class WalletTextView
  extends TextView
{
  private static final String TAG = "MicroMsg." + new StringBuilder("weiVtxeTtellaW").reverse().toString();
  private String mPrefix;
  private Object sHv = "";
  private Object uZh = "";
  private int uZi;
  
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.WalletTextViewAttrs, paramInt, 0);
    this.uZi = paramContext.getInteger(a.k.WalletTextViewAttrs_walletTypeFace, 4);
    this.mPrefix = paramContext.getString(a.k.WalletTextViewAttrs_walletPrefix);
    paramContext.recycle();
    cDQ();
  }
  
  private void cDQ()
  {
    String str = e.Hc(this.uZi);
    setTypeface(Typeface.createFromAsset(getContext().getAssets(), str));
  }
  
  public int getSelectionEnd()
  {
    return Selection.getSelectionEnd((CharSequence)this.sHv);
  }
  
  public int getSelectionStart()
  {
    return Selection.getSelectionStart((CharSequence)this.sHv);
  }
  
  @Deprecated
  public CharSequence getText()
  {
    int i = 1;
    Object localObject = a.cDt();
    if (com.tencent.mm.plugin.normsg.a.b.lFJ.bI(this)) {
      if (!((a)localObject).uXQ.containsKey(this)) {
        break label41;
      }
    }
    for (i = 0; i != 0; i = 0)
    {
      return (CharSequence)this.sHv;
      label41:
      ((a)localObject).uXQ.put(this, Boolean.valueOf(true));
      f.mDy.a(715L, 0L, 1L, false);
      if (((com.tencent.mm.wallet_core.f.b.cDw()) || (h.Ae())) && (com.tencent.mm.wallet_core.f.b.cDu())) {
        d.mOw.vJ(Integer.MIN_VALUE);
      }
    }
    x.printErrStackTrace(TAG, new Throwable(), "check point 0.", new Object[0]);
    if ((com.tencent.mm.wallet_core.f.b.cDw()) || (h.Ae()))
    {
      if (com.tencent.mm.wallet_core.f.b.cDv()) {}
      for (localObject = this.uZh;; localObject = this.sHv) {
        return (CharSequence)localObject;
      }
    }
    return (CharSequence)this.sHv;
  }
  
  public void setPrefix(String paramString)
  {
    this.mPrefix = paramString;
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    this.sHv = paramCharSequence;
    Object localObject = paramCharSequence.toString();
    if ((localObject == null) || (((String)localObject).length() == 0)) {}
    StringBuilder localStringBuilder;
    String str;
    for (localObject = "";; localObject = ((String)localObject).replaceAll(str, localStringBuilder.toString()))
    {
      this.uZh = localObject;
      localObject = paramCharSequence;
      if (!bi.oW(this.mPrefix)) {
        localObject = this.mPrefix + paramCharSequence;
      }
      if ((this.uZi != 4) && (!bi.K((CharSequence)localObject)) && (Pattern.compile(".*?[a-zA-Z]+.*?").matcher((CharSequence)localObject).matches()))
      {
        x.i(TAG, "force use std font");
        this.uZi = 4;
        cDQ();
      }
      super.setText((CharSequence)localObject, paramBufferType);
      return;
      localStringBuilder = new StringBuilder(7);
      int i = 0;
      while (i < 7)
      {
        localStringBuilder.append((char)(int)(6222620280936476253L >> (6 - i) * 8 & 0xFF));
        i += 1;
      }
      str = localStringBuilder.toString();
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public void setTypeface(int paramInt)
  {
    this.uZi = paramInt;
    String str = e.Hc(paramInt);
    setTypeface(Typeface.createFromAsset(getContext().getAssets(), str));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */