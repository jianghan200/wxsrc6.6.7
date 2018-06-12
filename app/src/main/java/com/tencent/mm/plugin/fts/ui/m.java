package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.d.c.a;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class m
{
  public static int a(JSONObject paramJSONObject, String paramString, Context paramContext)
  {
    if (paramJSONObject == null) {}
    for (int i = 0;; i = paramJSONObject.optInt("businessType"))
    {
      int j = i;
      if (i == 0)
      {
        if (!paramString.equals(paramContext.getString(n.g.search_education_article))) {
          break;
        }
        j = 2;
      }
      return j;
    }
    if (paramString.equals(paramContext.getString(n.g.search_education_timeline))) {
      return 8;
    }
    if (paramString.equals(paramContext.getString(n.g.search_education_biz_contact))) {
      return 1;
    }
    x.i("MicroMsg.FTS.FTSUIApiLogic", "option " + paramString + " no type");
    return i;
  }
  
  public static CharSequence a(Context paramContext, List<com.tencent.mm.plugin.fts.a.a.f> paramList, String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.g paramg, TextPaint paramTextPaint)
  {
    Arrays.sort(paramArrayOfString, new m.1((n)com.tencent.mm.kernel.g.n(n.class)));
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = 0;
    Object localObject1;
    Object localObject2;
    if (i < paramList.size())
    {
      localObject1 = (com.tencent.mm.plugin.fts.a.a.f)paramList.get(i);
      String str1;
      String str2;
      if (((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrP < paramArrayOfString.length)
      {
        localObject2 = paramArrayOfString[localObject1.jrP];
        if (!bi.oW((String)localObject2))
        {
          localObject2 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg((String)localObject2);
          if (localObject2 != null)
          {
            str1 = ((ai)localObject2).field_username;
            str2 = s.a((ab)localObject2, str1);
            switch (((com.tencent.mm.plugin.fts.a.a.f)localObject1).jru)
            {
            }
          }
        }
      }
      for (;;)
      {
        if ((!bi.oW(((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR)) && (((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR.contains(paramg.jrV))) {
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrT += 10;
        }
        i += 1;
        break;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR = com.tencent.mm.plugin.fts.a.d.cS(str1, ((ab)localObject2).wM());
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrS = str2;
        continue;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrU = true;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jry = true;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR = ((ai)localObject2).field_nickname;
        if (!((ai)localObject2).field_nickname.equals(str2))
        {
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrS = str2;
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrU = true;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jry = true;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR = str2;
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR = ((com.tencent.mm.plugin.fts.a.a.f)localObject1).content;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrS = str2;
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrR = ((ai)localObject2).csT;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).jrS = str2;
        }
      }
    }
    Collections.sort(paramList, new m.2());
    i = 0;
    float f = 0.0F;
    while ((i < paramList.size()) && (i < paramg.jrX.length))
    {
      f = b.a.jvq - 100 - f;
      if (f <= 100.0F) {
        break;
      }
      paramArrayOfString = (com.tencent.mm.plugin.fts.a.a.f)paramList.get(i);
      localObject1 = j.a(paramContext, paramArrayOfString.jrR, paramTextPaint.getTextSize());
      if (localSpannableStringBuilder.length() > 0) {
        localSpannableStringBuilder.append(", ");
      }
      localObject2 = new com.tencent.mm.plugin.fts.a.a.d();
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrw = ((CharSequence)localObject1);
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrx = paramg;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jry = paramArrayOfString.jry;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrz = paramArrayOfString.jrU;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrC = f;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject2).dug = paramTextPaint;
      if (!bi.oW(paramArrayOfString.jrS))
      {
        ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrD = TextUtils.concat(new CharSequence[] { j.a(paramContext, paramArrayOfString.jrS, paramTextPaint.getTextSize()), "(" });
        ((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrE = ")";
      }
      localSpannableStringBuilder.append(com.tencent.mm.plugin.fts.a.f.a((com.tencent.mm.plugin.fts.a.a.d)localObject2).jrO);
      f = paramTextPaint.measureText(localSpannableStringBuilder.toString());
      i += 1;
    }
    return localSpannableStringBuilder;
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt)
  {
    a(paramContext, paramImageView, paramString1, paramString2, paramInt, true, 0, 0);
  }
  
  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader().a(paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
    if ((!bi.oW(paramString1)) || (!bi.oW(paramString2)))
    {
      Bitmap localBitmap = ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader().a(paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        c.a.a(paramContext.getResources(), localBitmap, paramImageView);
        paramImageView.setVisibility(0);
        return;
      }
      if (paramInt1 > 0) {
        paramImageView.setImageResource(paramInt1);
      }
      for (;;)
      {
        ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader().a(paramContext, paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
        break;
        paramImageView.setImageResource(n.a.transparent);
      }
    }
    if ((paramInt1 > 0) && ((!bi.oW(paramString1)) || (!bi.oW(paramString2))))
    {
      paramImageView.setImageResource(paramInt1);
      return;
    }
    paramImageView.setVisibility(8);
  }
  
  public static boolean a(CharSequence paramCharSequence, TextView paramTextView)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
    {
      paramTextView.setText(paramCharSequence, TextView.BufferType.SPANNABLE);
      paramTextView.setVisibility(0);
      return true;
    }
    paramTextView.setVisibility(8);
    return false;
  }
  
  public static boolean a(String paramString, TextView paramTextView)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      return true;
    }
    paramTextView.setVisibility(8);
    return false;
  }
  
  public static final void h(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramView.setBackgroundResource(n.c.comm_list_item_selector);
      return;
    }
    paramView.setBackgroundResource(n.c.comm_list_item_selector_no_divider);
  }
  
  public static final void i(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramView.setBackgroundResource(n.c.list_item_normal);
      return;
    }
    paramView.setBackgroundResource(n.c.mm_trans);
  }
  
  public static String qm(int paramInt)
  {
    int j = 0;
    int i = j;
    switch (paramInt)
    {
    default: 
      i = j;
    }
    while (i == 0)
    {
      return null;
      i = n.g.fts_header_top_hits;
      continue;
      i = n.g.fts_header_favorite;
      continue;
      i = n.g.fts_header_message;
      continue;
      i = n.g.fts_header_chatroom;
      continue;
      i = n.g.fts_header_contact;
      continue;
      i = n.g.fts_header_game;
      continue;
      i = n.g.fts_header_feature;
      continue;
      i = n.g.fts_header_focus_biz;
      continue;
      i = n.g.fts_header_mobile_friend;
      continue;
      i = n.g.fts_header_we_app;
      continue;
      i = n.g.fts_header_mini_game;
    }
    return ad.getContext().getString(i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */