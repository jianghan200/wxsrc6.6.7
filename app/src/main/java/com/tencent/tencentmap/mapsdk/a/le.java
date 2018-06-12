package com.tencent.tencentmap.mapsdk.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class le
  implements AdapterView.OnItemClickListener, ld, lf.a
{
  private static final int p = Color.argb(200, 56, 56, 56);
  public boolean a = false;
  private RelativeLayout b;
  private lf c;
  private TextView d;
  private View e;
  private View f;
  private View g;
  private Bitmap h;
  private Bitmap i;
  private float j = 1.0F;
  private final int k = 45;
  private final int l = 4;
  private final int m = 50;
  private final int n = 8;
  private int o = 0;
  private a q;
  private Context r;
  private aa s;
  private int t = -1;
  private int u = 0;
  private ov v;
  private String w;
  private boolean x = false;
  private oj y;
  private le.a.a z = null;
  
  public le(Context paramContext, aa paramaa)
  {
    this.s = paramaa;
    this.r = paramContext;
    this.x = true;
  }
  
  private void a(Context paramContext)
  {
    this.j = paramContext.getApplicationContext().getResources().getDisplayMetrics().density;
    this.o = ((int)(234.0D * this.j));
  }
  
  @TargetApi(9)
  private void a(Context paramContext, a parama)
  {
    this.b = new RelativeLayout(paramContext);
    this.d = new TextView(paramContext);
    this.e = new View(paramContext);
    this.c = new lf(paramContext);
    this.f = new View(paramContext);
    this.g = new View(paramContext);
    this.c.setChoiceMode(1);
    this.c.setAdapter(parama);
    this.c.setOnItemClickListener(this);
    this.c.setVerticalScrollBarEnabled(false);
    this.c.setHorizontalScrollBarEnabled(false);
    this.c.setOverScrollMode(2);
    this.c.setDivider(null);
    this.c.setDividerHeight(0);
    this.c.setOnDataChangedListener(this);
    paramContext = new RelativeLayout.LayoutParams((int)(30.0F * this.j), -2);
    paramContext.addRule(14, -1);
    paramContext.topMargin = ((int)(this.j * 6.0F));
    this.d.setId(this.d.hashCode());
    this.d.setText("楼层");
    this.d.setTextSize(12.0F);
    this.d.setGravity(17);
    this.d.setTextColor(Color.argb(200, 56, 56, 56));
    this.b.addView(this.d, paramContext);
    paramContext = new RelativeLayout.LayoutParams((int)(30.0F * this.j), (int)(1.0F * this.j));
    paramContext.addRule(3, this.d.getId());
    paramContext.addRule(14, -1);
    paramContext.topMargin = ((int)(this.j * 6.0F));
    this.e.setBackgroundColor(-3355444);
    this.e.setId(this.e.hashCode());
    this.b.addView(this.e, paramContext);
    if (this.h != null)
    {
      parama = this.h.getNinePatchChunk();
      jo localjo = jo.a(parama);
      paramContext = new Rect();
      if (localjo != null) {
        paramContext = localjo.a;
      }
      paramContext = new NinePatchDrawable(this.r.getResources(), this.h, parama, paramContext, null);
      this.b.setBackgroundDrawable(paramContext);
    }
    paramContext = new RelativeLayout.LayoutParams((int)(25.0F * this.j), (int)(180.0F * this.j));
    paramContext.addRule(3, this.e.getId());
    paramContext.addRule(14, -1);
    this.b.addView(this.c, paramContext);
    a(this.s);
    this.b.measure(0, 0);
    this.b.setVisibility(4);
  }
  
  private void a(List<ow> paramList)
  {
    FrameLayout.LayoutParams localLayoutParams;
    if ((paramList.size() < 4) && (paramList.size() != this.u))
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      localLayoutParams.height -= (4 - paramList.size()) * 45;
      this.s.updateViewLayout(this.b, localLayoutParams);
    }
    for (;;)
    {
      this.u = paramList.size();
      if (this.q != null) {
        this.q.a(paramList);
      }
      return;
      if ((paramList.size() != this.u) && (this.u < 4))
      {
        localLayoutParams = (FrameLayout.LayoutParams)this.b.getLayoutParams();
        localLayoutParams.height = this.o;
        this.s.updateViewLayout(this.b, localLayoutParams);
      }
    }
  }
  
  private void b(Context paramContext)
  {
    this.h = kh.b(paramContext, "indoor_background.9.png");
    this.i = kh.b(paramContext, "item_selected_background.png");
  }
  
  private void e()
  {
    if (this.b == null)
    {
      this.q = new a(this.s.getContext(), new ArrayList());
      a(this.r);
      b(this.r);
      a(this.r, this.q);
      if ((this.s.getMap() != null) && (this.s.getMap().c() != null) && (this.s.getMap().c().i() != null)) {
        this.y = this.s.getMap().c().i().getIndoorMapControl();
      }
    }
  }
  
  private FrameLayout.LayoutParams f()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, this.o);
    localLayoutParams.gravity = 19;
    localLayoutParams.leftMargin = ((int)(8.0F * this.j));
    return localLayoutParams;
  }
  
  private void g()
  {
    int i1 = this.v.c();
    if ((this.w != null) && (this.a) && (this.w.equals(this.v.a())))
    {
      this.c.setItemChecked(i1, true);
      this.a = false;
    }
    for (;;)
    {
      this.t = i1;
      this.w = this.v.a();
      return;
      this.c.setSelectionFromTop(i1, (int)(45.0F * this.j + 0.5D) * 2);
    }
  }
  
  public void a()
  {
    if (this.h != null) {
      this.h.recycle();
    }
    if (this.i != null) {
      this.i.recycle();
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.x) && (paramInt2 < this.o + 100.0F * this.j))
    {
      this.b.setVisibility(8);
      return;
    }
    this.b.setVisibility(0);
  }
  
  public void a(ov paramov)
  {
    if (paramov == null) {
      return;
    }
    if (this.b == null) {
      e();
    }
    this.v = paramov;
    a(paramov.b());
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.s == null) || (this.s.getMap() == null)) {}
    do
    {
      ac localac;
      or localor;
      do
      {
        return;
        if (this.b == null) {
          e();
        }
        localac = this.s.getMap();
        localor = localac.d();
        if ((!this.x) || (!paramBoolean) || (localor == null) || (this.y == null) || (!this.y.a()) || (localor.b < 18.0F)) {
          break;
        }
      } while (this.b.getVisibility() == 0);
      this.b.setVisibility(0);
      a(localac.c().c(localor.a));
      return;
    } while (this.b.getVisibility() != 0);
    this.b.setVisibility(8);
  }
  
  public boolean a(ViewGroup paramViewGroup)
  {
    if (paramViewGroup.indexOfChild(this.b) < 0) {
      paramViewGroup.addView(this.b, f());
    }
    return true;
  }
  
  public boolean b()
  {
    return this.x;
  }
  
  public void c()
  {
    g();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.s.getMap() == null) {
      return;
    }
    if (this.z != null)
    {
      this.z.a.setTextColor(-16777216);
      this.z.b.setVisibility(4);
    }
    paramAdapterView = (le.a.a)paramView.getTag();
    paramAdapterView.a.setTextColor(-1);
    paramAdapterView.b.setVisibility(0);
    this.z = paramAdapterView;
    this.t = paramInt;
    this.a = true;
  }
  
  private class a
    extends BaseAdapter
  {
    private Context b;
    private List<ow> c;
    
    public a(List<ow> paramList)
    {
      this.b = paramList;
      List localList;
      this.c = localList;
    }
    
    public void a(List<ow> paramList)
    {
      this.c = paramList;
      notifyDataSetChanged();
    }
    
    public int getCount()
    {
      if (this.c == null) {
        return 0;
      }
      return this.c.size();
    }
    
    public Object getItem(int paramInt)
    {
      if (this.c == null) {
        return null;
      }
      return this.c.get(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if ((this.c == null) || (this.c.size() == 0)) {
        return null;
      }
      Object localObject1;
      Object localObject2;
      if (paramView != null)
      {
        localObject1 = (a)paramView.getTag();
        paramViewGroup = ((a)localObject1).a;
        localObject2 = ((a)localObject1).b;
        localObject1 = paramView;
        paramView = (View)localObject2;
      }
      for (;;)
      {
        paramViewGroup.setText(((ow)this.c.get(paramInt)).a());
        if (paramInt == le.d(le.this)) {
          break;
        }
        paramViewGroup.setTextColor(le.d());
        paramView.setVisibility(4);
        return (View)localObject1;
        localObject1 = new FrameLayout(this.b);
        paramView = new ImageView(this.b);
        if (le.a(le.this) != null) {
          paramView.setImageBitmap(le.a(le.this));
        }
        paramViewGroup = new FrameLayout.LayoutParams(le.b(le.this).getMeasuredWidth(), (int)(le.c(le.this) * 45.0F));
        paramViewGroup.gravity = 17;
        ((FrameLayout)localObject1).addView(paramView, paramViewGroup);
        paramViewGroup = new TextView(this.b);
        paramViewGroup.setGravity(17);
        localObject2 = new FrameLayout.LayoutParams(-2, (int)(le.c(le.this) * 45.0F));
        ((FrameLayout.LayoutParams)localObject2).gravity = 17;
        ((FrameLayout)localObject1).addView(paramViewGroup, (ViewGroup.LayoutParams)localObject2);
        ((FrameLayout)localObject1).setTag(new a(paramViewGroup, paramView));
      }
      paramViewGroup.setTextColor(-1);
      paramView.setVisibility(0);
      return (View)localObject1;
    }
    
    public class a
    {
      public TextView a;
      public ImageView b;
      
      public a(TextView paramTextView, ImageView paramImageView)
      {
        this.a = paramTextView;
        this.b = paramImageView;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/le.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */