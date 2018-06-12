package com.tenpay.android.wechat;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MyKeyboardWindow
  extends LinearLayout
{
  public static final int X_MODE_CHARACTER = 1;
  public static final int X_MODE_DOT = 2;
  public static final int X_MODE_NONE = 0;
  private Context mContext;
  private EditText mInputEditText;
  private Button mKey0;
  private Button mKey1;
  private Button mKey2;
  private Button mKey3;
  private Button mKey4;
  private Button mKey5;
  private Button mKey6;
  private Button mKey7;
  private Button mKey8;
  private Button mKey9;
  private ImageButton mKeyD;
  private Button mKeyX;
  private int mXMode = 0;
  
  public MyKeyboardWindow(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public MyKeyboardWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    TenpayTTSUtil.init(paramContext);
    paramContext = LayoutInflater.from(paramContext).inflate(this.mContext.getResources().getIdentifier("tenpay_number_keyboard", "layout", this.mContext.getPackageName()), this, true);
    this.mKey1 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_1")));
    this.mKey2 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_2")));
    this.mKey3 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_3")));
    this.mKey4 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_4")));
    this.mKey5 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_5")));
    this.mKey6 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_6")));
    this.mKey7 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_7")));
    this.mKey8 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_8")));
    this.mKey9 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_9")));
    this.mKeyX = ((Button)paramContext.findViewById(getId("tenpay_keyboard_x")));
    this.mKey0 = ((Button)paramContext.findViewById(getId("tenpay_keyboard_0")));
    this.mKeyD = ((ImageButton)paramContext.findViewById(getId("tenpay_keyboard_d")));
    paramContext = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (MyKeyboardWindow.this.mInputEditText == null) {
          return;
        }
        if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_x"))
        {
          switch (MyKeyboardWindow.this.mXMode)
          {
          case 0: 
          default: 
            return;
          case 1: 
            MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 59));
            MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 52));
            MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, 59));
            return;
          }
          MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 56));
          return;
        }
        int i;
        if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_1")) {
          i = 8;
        }
        for (;;)
        {
          MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, i));
          MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, i));
          return;
          if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_2")) {
            i = 9;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_3")) {
            i = 10;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_4")) {
            i = 11;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_5")) {
            i = 12;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_6")) {
            i = 13;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_7")) {
            i = 14;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_8")) {
            i = 15;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_9")) {
            i = 16;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_0")) {
            i = 7;
          } else if (paramAnonymousView.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_d")) {
            i = 67;
          } else {
            i = 0;
          }
        }
      }
    };
    if (Build.VERSION.SDK_INT >= 14)
    {
      this.mKey1.setContentDescription("1");
      this.mKey2.setContentDescription("2");
      this.mKey3.setContentDescription("3");
      this.mKey4.setContentDescription("4");
      this.mKey5.setContentDescription("5");
      this.mKey6.setContentDescription("6");
      this.mKey7.setContentDescription("7");
      this.mKey8.setContentDescription("8");
      this.mKey9.setContentDescription("9");
      this.mKey0.setContentDescription("0");
      this.mKeyX.setContentDescription("字母X");
      this.mKeyD.setContentDescription("删除");
    }
    this.mKey1.setOnClickListener(paramContext);
    this.mKey2.setOnClickListener(paramContext);
    this.mKey3.setOnClickListener(paramContext);
    this.mKey4.setOnClickListener(paramContext);
    this.mKey5.setOnClickListener(paramContext);
    this.mKey6.setOnClickListener(paramContext);
    this.mKey7.setOnClickListener(paramContext);
    this.mKey8.setOnClickListener(paramContext);
    this.mKey9.setOnClickListener(paramContext);
    this.mKeyX.setOnClickListener(paramContext);
    this.mKey0.setOnClickListener(paramContext);
    this.mKeyD.setOnClickListener(paramContext);
  }
  
  protected int getDrawableId(String paramString)
  {
    return this.mContext.getResources().getIdentifier(paramString, "drawable", this.mContext.getPackageName());
  }
  
  public int getId(String paramString)
  {
    return this.mContext.getResources().getIdentifier(paramString, "id", this.mContext.getPackageName());
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    TenpayTTSUtil.destroy();
  }
  
  public void resetSecureAccessibility()
  {
    this.mKey0.setAccessibilityDelegate(null);
    this.mKey1.setAccessibilityDelegate(null);
    this.mKey2.setAccessibilityDelegate(null);
    this.mKey3.setAccessibilityDelegate(null);
    this.mKey4.setAccessibilityDelegate(null);
    this.mKey5.setAccessibilityDelegate(null);
    this.mKey6.setAccessibilityDelegate(null);
    this.mKey7.setAccessibilityDelegate(null);
    this.mKey8.setAccessibilityDelegate(null);
    this.mKey9.setAccessibilityDelegate(null);
    this.mKeyX.setAccessibilityDelegate(null);
    this.mKeyD.setAccessibilityDelegate(null);
  }
  
  public void setInputEditText(EditText paramEditText)
  {
    if (paramEditText != null)
    {
      this.mInputEditText = paramEditText;
      int i = this.mInputEditText.getImeOptions();
      paramEditText = this.mInputEditText.getImeActionLabel();
      if (!TextUtils.isEmpty(paramEditText)) {
        this.mKeyX.setText(paramEditText);
      }
      switch (i)
      {
      }
    }
    do
    {
      return;
      this.mXMode = 0;
    } while (!TextUtils.isEmpty(paramEditText));
    this.mKeyX.setText("");
  }
  
  public void setSecureAccessibility(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    this.mKey0.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey1.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey2.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey3.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey4.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey5.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey6.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey7.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey8.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKey9.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKeyX.setAccessibilityDelegate(paramAccessibilityDelegate);
    this.mKeyD.setAccessibilityDelegate(paramAccessibilityDelegate);
  }
  
  public void setXMode(int paramInt)
  {
    this.mXMode = paramInt;
    switch (paramInt)
    {
    default: 
      this.mXMode = 0;
      return;
    case 0: 
      this.mKeyX.setText("");
      this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keyitem_bottom"));
      return;
    case 1: 
      this.mKeyX.setText("X");
      this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom"));
      return;
    }
    this.mKeyX.setText(".");
    this.mKeyX.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tenpay/android/wechat/MyKeyboardWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */