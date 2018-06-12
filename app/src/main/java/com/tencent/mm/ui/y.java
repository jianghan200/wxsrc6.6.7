package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.bq.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMNeatTextView;

public final class y
{
  public static final int[] tnN = { 16843087, 16843088, 16843379 };
  public static final int[] tnO = { 16843379 };
  
  public static LayoutInflater b(LayoutInflater paramLayoutInflater)
  {
    a.fe(paramLayoutInflater.getContext());
    paramLayoutInflater = paramLayoutInflater.cloneInContext(paramLayoutInflater.getContext());
    a locala = new a((byte)0);
    locala.layoutInflater = paramLayoutInflater;
    paramLayoutInflater.setFactory(locala);
    return paramLayoutInflater;
  }
  
  public static LayoutInflater gq(Context paramContext)
  {
    a.fe(paramContext);
    paramContext = LayoutInflater.from(paramContext).cloneInContext(paramContext);
    a locala = new a((byte)0);
    locala.layoutInflater = paramContext;
    paramContext.setFactory(locala);
    return paramContext;
  }
  
  private static final class a
    implements LayoutInflater.Factory
  {
    LayoutInflater layoutInflater;
    
    private View createView(String paramString1, String paramString2, AttributeSet paramAttributeSet)
    {
      try
      {
        paramString1 = this.layoutInflater.createView(paramString1, paramString2, paramAttributeSet);
        return paramString1;
      }
      catch (ClassNotFoundException paramString1)
      {
        return null;
      }
      catch (InflateException paramString1) {}
      return null;
    }
    
    public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      Object localObject5 = null;
      Object localObject4 = null;
      Object localObject2 = localObject4;
      Object localObject3 = localObject5;
      Object localObject1;
      label113:
      float f;
      label752:
      label895:
      int j;
      label1059:
      label1103:
      label1118:
      label1244:
      label1647:
      label1931:
      do
      {
        do
        {
          do
          {
            do
            {
              try
              {
                if (paramString.indexOf(".") == -1)
                {
                  localObject2 = localObject4;
                  localObject3 = localObject5;
                  if (!paramString.equals("WebView")) {
                    break label2428;
                  }
                  localObject2 = localObject4;
                  localObject3 = localObject5;
                  localObject1 = createView(paramString, "android.webkit.", paramAttributeSet);
                  localObject2 = localObject1;
                  if (localObject1 == null)
                  {
                    localObject2 = localObject4;
                    localObject3 = localObject5;
                    localObject1 = createView(paramString, "android.widget.", paramAttributeSet);
                    localObject2 = localObject1;
                  }
                  if (localObject2 != null) {
                    break label2421;
                  }
                  localObject2 = localObject4;
                  localObject3 = localObject5;
                }
                for (localObject1 = createView(paramString, "android.view.", paramAttributeSet);; localObject1 = this.layoutInflater.createView(paramString, null, paramAttributeSet))
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if ((localObject1 instanceof ViewStub))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (Build.VERSION.SDK_INT >= 21)
                    {
                      localObject2 = localObject1;
                      localObject3 = localObject1;
                      ((ViewStub)localObject1).setLayoutInflater(this.layoutInflater);
                    }
                  }
                  if (localObject1 == null) {
                    break label2386;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (!paramString.equals("TextView"))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (!paramString.equals("Button"))
                    {
                      localObject2 = localObject1;
                      localObject3 = localObject1;
                      if (!paramString.equals("EditText"))
                      {
                        localObject2 = localObject1;
                        localObject3 = localObject1;
                        if (!paramString.equals("CheckBox"))
                        {
                          localObject2 = localObject1;
                          localObject3 = localObject1;
                          if (!paramString.equals("ImageView"))
                          {
                            localObject2 = localObject1;
                            localObject3 = localObject1;
                            if (!paramString.equals("CheckedTextView"))
                            {
                              localObject2 = localObject1;
                              localObject3 = localObject1;
                              if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView"))
                              {
                                localObject2 = localObject1;
                                localObject3 = localObject1;
                                if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
                                {
                                  localObject2 = localObject1;
                                  localObject3 = localObject1;
                                  if (!paramString.equals("com.tencent.mm.ui.widget.MMNeatTextView"))
                                  {
                                    localObject2 = localObject1;
                                    localObject3 = localObject1;
                                    if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                                    {
                                      localObject2 = localObject1;
                                      localObject3 = localObject1;
                                      if (!paramString.equals("com.tencent.mm.ui.widget.edittext.PasterEditText"))
                                      {
                                        localObject2 = localObject1;
                                        localObject3 = localObject1;
                                        if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                                        {
                                          localObject2 = localObject1;
                                          localObject3 = localObject1;
                                          if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                                          {
                                            localObject2 = localObject1;
                                            localObject3 = localObject1;
                                            if (!paramString.equals("com.tencent.mm.ui.tools.MMTruncTextView"))
                                            {
                                              localObject2 = localObject1;
                                              localObject3 = localObject1;
                                              if (!paramString.equals("com.tencent.mm.plugin.brandservice.ui.base.CatalogView"))
                                              {
                                                localObject2 = localObject1;
                                                localObject3 = localObject1;
                                                if (!paramString.equals("com.tencent.mm.ui.tools.CustomFitTextView"))
                                                {
                                                  localObject2 = localObject1;
                                                  localObject3 = localObject1;
                                                  if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                                                  {
                                                    localObject2 = localObject1;
                                                    localObject3 = localObject1;
                                                    if (!paramString.equals("com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView"))
                                                    {
                                                      localObject2 = localObject1;
                                                      localObject3 = localObject1;
                                                      if (!paramString.equals("com.tencent.mm.plugin.game.ui.GameDropdownView"))
                                                      {
                                                        localObject2 = localObject1;
                                                        localObject3 = localObject1;
                                                        if (!paramString.equals("com.tencent.mm.ui.ScrollAlwaysTextView"))
                                                        {
                                                          localObject2 = localObject1;
                                                          localObject3 = localObject1;
                                                          if (!paramString.equals("com.tencent.mm.ui.base.MMAutoSizeTextView"))
                                                          {
                                                            localObject2 = localObject1;
                                                            localObject3 = localObject1;
                                                            if (!paramString.equals("com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView"))
                                                            {
                                                              localObject2 = localObject1;
                                                              localObject3 = localObject1;
                                                              if (!paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView"))
                                                              {
                                                                localObject2 = localObject1;
                                                                localObject3 = localObject1;
                                                                if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView"))
                                                                {
                                                                  localObject2 = localObject1;
                                                                  localObject3 = localObject1;
                                                                  if (!paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView"))
                                                                  {
                                                                    localObject2 = localObject1;
                                                                    localObject3 = localObject1;
                                                                    if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText"))
                                                                    {
                                                                      localObject2 = localObject1;
                                                                      localObject4 = localObject1;
                                                                      localObject3 = localObject1;
                                                                      if (!paramString.equals("com.tencent.mm.kiss.widget.textview.PLSysTextView")) {
                                                                        break label1059;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  f = a.fe(paramContext);
                  if ((f != 1.875F) && (f != 2.025F)) {
                    break label2418;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (paramString.equals("com.tencent.mm.ui.widget.MMTextView")) {
                    break label2418;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView")) {
                    break label2418;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView")) {
                    break label2418;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView")) {
                    break label2418;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (paramString.equals("com.tencent.mm.ui.widget.MMNeatTextView")) {
                    break label2418;
                  }
                  f = 1.625F;
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (!paramString.equals("TextView"))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView")) {
                      break label1118;
                    }
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  localObject5 = (TextView)localObject1;
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((TextView)localObject5).setTextSize(1, f * ((TextView)localObject5).getTextSize() / a.getDensity(((TextView)localObject5).getContext()));
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  paramContext.getAssets();
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  e.cgF();
                  localObject2 = localObject1;
                  localObject4 = localObject1;
                  localObject3 = localObject1;
                  if (!e.cgG()) {
                    break label1059;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, y.tnN);
                  i = 0;
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (i >= y.tnN.length) {
                    break label1103;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  j = paramAttributeSet.getResourceId(i, 0);
                  if (j == 0) {
                    break label2434;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (y.tnN[i] != 16843379) {
                    break;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((TextView)localObject5).setContentDescription(paramContext.getString(j));
                  break label2434;
                  localObject2 = localObject4;
                  localObject3 = localObject5;
                }
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (y.tnN[i] == 16843088)
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((TextView)localObject5).setHint(paramContext.getString(j));
                }
              }
              catch (ClassNotFoundException paramContext)
              {
                x.w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate.", new Object[] { paramString });
                localObject4 = localObject2;
                return (View)localObject4;
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((TextView)localObject5).setText(paramContext.getString(j));
              }
              catch (InflateException paramContext)
              {
                x.w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate.", new Object[] { paramString });
                return (View)localObject3;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramAttributeSet.recycle();
              return (View)localObject1;
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("Button")) {
                break;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              localObject5 = (Button)localObject1;
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((Button)localObject5).setTextSize(1, f * ((Button)localObject5).getTextSize() / a.getDensity(((Button)localObject5).getContext()));
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramContext.getAssets();
              localObject2 = localObject1;
              localObject3 = localObject1;
              e.cgF();
              localObject2 = localObject1;
              localObject4 = localObject1;
              localObject3 = localObject1;
            } while (!e.cgG());
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, y.tnN);
            i = 0;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (i < y.tnN.length)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              j = paramAttributeSet.getResourceId(i, 0);
              if (j == 0) {
                break label2443;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (y.tnN[i] == 16843379)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((Button)localObject5).setContentDescription(paramContext.getString(j));
                break label2443;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (y.tnN[i] == 16843088)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((Button)localObject5).setHint(paramContext.getString(j));
                break label2443;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((Button)localObject5).setText(paramContext.getString(j));
              break label2443;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramAttributeSet.recycle();
            return (View)localObject1;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (!paramString.equals("EditText"))
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (!paramString.equals("com.tencent.mm.ui.widget.edittext.PasterEditText"))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                    {
                      localObject2 = localObject1;
                      localObject3 = localObject1;
                      if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                      {
                        localObject2 = localObject1;
                        localObject3 = localObject1;
                        if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                        {
                          localObject2 = localObject1;
                          localObject3 = localObject1;
                          if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText")) {
                            break;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            localObject5 = (EditText)localObject1;
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((EditText)localObject5).setTextSize(1, f * ((EditText)localObject5).getTextSize() / a.getDensity(((EditText)localObject5).getContext()));
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramContext.getAssets();
            localObject2 = localObject1;
            localObject3 = localObject1;
            e.cgF();
            localObject2 = localObject1;
            localObject4 = localObject1;
            localObject3 = localObject1;
          } while (!e.cgG());
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, y.tnN);
          i = 0;
          localObject2 = localObject1;
          localObject3 = localObject1;
          if (i < y.tnN.length)
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            j = paramAttributeSet.getResourceId(i, 0);
            if (j == 0) {
              break label2452;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (y.tnN[i] == 16843379)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((EditText)localObject5).setContentDescription(paramContext.getString(j));
              break label2452;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (y.tnN[i] == 16843088)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((EditText)localObject5).setHint(paramContext.getString(j));
              break label2452;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((EditText)localObject5).setText(paramContext.getString(j));
            break label2452;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramAttributeSet.recycle();
          return (View)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          if (!paramString.equals("CheckBox")) {
            break;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject5 = (CheckBox)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          ((CheckBox)localObject5).setTextSize(1, f * ((CheckBox)localObject5).getTextSize() / a.getDensity(((CheckBox)localObject5).getContext()));
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext.getAssets();
          localObject2 = localObject1;
          localObject3 = localObject1;
          e.cgF();
          localObject2 = localObject1;
          localObject4 = localObject1;
          localObject3 = localObject1;
        } while (!e.cgG());
        localObject2 = localObject1;
        localObject3 = localObject1;
        paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, y.tnN);
        i = 0;
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (i < y.tnN.length)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          j = paramAttributeSet.getResourceId(i, 0);
          if (j == 0) {
            break label2461;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          if (y.tnN[i] == 16843379)
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((CheckBox)localObject5).setContentDescription(paramContext.getString(j));
            break label2461;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          if (y.tnN[i] == 16843088)
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((CheckBox)localObject5).setHint(paramContext.getString(j));
            break label2461;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          ((CheckBox)localObject5).setText(paramContext.getString(j));
          break label2461;
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        paramAttributeSet.recycle();
        return (View)localObject1;
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (!paramString.equals("ImageView")) {
          break;
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        localObject5 = (ImageView)localObject1;
        localObject2 = localObject1;
        localObject3 = localObject1;
        paramContext.getAssets();
        localObject2 = localObject1;
        localObject3 = localObject1;
        e.cgF();
        localObject2 = localObject1;
        localObject4 = localObject1;
        localObject3 = localObject1;
      } while (!e.cgG());
      localObject2 = localObject1;
      localObject3 = localObject1;
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, y.tnO);
      int i = 0;
      for (;;)
      {
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (i < y.tnO.length)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          j = paramAttributeSet.getResourceId(i, 0);
          if (j != 0)
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (y.tnO[i] == 16843379)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((ImageView)localObject5).setContentDescription(paramContext.getString(j));
            }
          }
        }
        else
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramAttributeSet.recycle();
          return (View)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          if (paramString.equals("com.tencent.mm.ui.widget.MMNeatTextView"))
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramContext = (MMNeatTextView)localObject1;
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramContext.setTextSize(1, f * paramContext.getTextSize() / a.getDensity(paramContext.getContext()));
            return (View)localObject1;
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext = (TextView)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext.setTextSize(1, f * paramContext.getTextSize() / a.getDensity(paramContext.getContext()));
          return (View)localObject1;
          label2386:
          localObject2 = localObject1;
          localObject3 = localObject1;
          x.w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound " + paramString);
          return (View)localObject1;
          label2418:
          break label752;
          label2421:
          localObject1 = localObject2;
          break label113;
          label2428:
          localObject1 = null;
          break;
          label2434:
          i += 1;
          break label895;
          label2443:
          i += 1;
          break label1244;
          label2452:
          i += 1;
          break label1647;
          label2461:
          i += 1;
          break label1931;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */