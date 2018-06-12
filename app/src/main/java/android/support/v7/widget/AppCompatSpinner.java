package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.support.v4.view.x;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner
  extends Spinner
  implements x
{
  private static final boolean MO;
  private static final boolean MP;
  private static final int[] MQ;
  private ListPopupWindow.b Hx;
  private Context Jn;
  private SpinnerAdapter MR;
  private boolean MS;
  private b MT;
  private int MU;
  private h Mb;
  private f Mc;
  private final Rect bJ;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      MO = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      MP = bool;
      MQ = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.spinnerStyle);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }
  
  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  /* Error */
  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 76	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 78	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 80	android/graphics/Rect:<init>	()V
    //   15: putfield 82	android/support/v7/widget/AppCompatSpinner:bJ	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 87	android/support/v7/a/a$k:Spinner	[I
    //   23: iload_3
    //   24: invokestatic 92	android/support/v7/widget/ap:a	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/widget/ap;
    //   27: astore 8
    //   29: aload_0
    //   30: invokestatic 98	android/support/v7/widget/h:eJ	()Landroid/support/v7/widget/h;
    //   33: putfield 100	android/support/v7/widget/AppCompatSpinner:Mb	Landroid/support/v7/widget/h;
    //   36: aload_0
    //   37: new 102	android/support/v7/widget/f
    //   40: dup
    //   41: aload_0
    //   42: aload_0
    //   43: getfield 100	android/support/v7/widget/AppCompatSpinner:Mb	Landroid/support/v7/widget/h;
    //   46: invokespecial 105	android/support/v7/widget/f:<init>	(Landroid/view/View;Landroid/support/v7/widget/h;)V
    //   49: putfield 107	android/support/v7/widget/AppCompatSpinner:Mc	Landroid/support/v7/widget/f;
    //   52: aload 8
    //   54: getstatic 110	android/support/v7/a/a$k:Spinner_popupTheme	I
    //   57: iconst_0
    //   58: invokevirtual 114	android/support/v7/widget/ap:getResourceId	(II)I
    //   61: istore 5
    //   63: iload 5
    //   65: ifeq +290 -> 355
    //   68: new 116	android/support/v7/view/d
    //   71: dup
    //   72: aload_1
    //   73: iload 5
    //   75: invokespecial 119	android/support/v7/view/d:<init>	(Landroid/content/Context;I)V
    //   78: astore 7
    //   80: aload_0
    //   81: aload 7
    //   83: putfield 121	android/support/v7/widget/AppCompatSpinner:Jn	Landroid/content/Context;
    //   86: aload_0
    //   87: getfield 121	android/support/v7/widget/AppCompatSpinner:Jn	Landroid/content/Context;
    //   90: ifnull +175 -> 265
    //   93: getstatic 49	android/os/Build$VERSION:SDK_INT	I
    //   96: bipush 11
    //   98: if_icmplt +314 -> 412
    //   101: aload_1
    //   102: aload_2
    //   103: getstatic 56	android/support/v7/widget/AppCompatSpinner:MQ	[I
    //   106: iload_3
    //   107: iconst_0
    //   108: invokevirtual 127	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   111: astore 7
    //   113: iload 4
    //   115: istore 5
    //   117: aload 7
    //   119: iconst_0
    //   120: invokevirtual 133	android/content/res/TypedArray:hasValue	(I)Z
    //   123: ifeq +12 -> 135
    //   126: aload 7
    //   128: iconst_0
    //   129: iconst_0
    //   130: invokevirtual 136	android/content/res/TypedArray:getInt	(II)I
    //   133: istore 5
    //   135: iload 5
    //   137: istore 6
    //   139: aload 7
    //   141: ifnull +12 -> 153
    //   144: aload 7
    //   146: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   149: iload 5
    //   151: istore 6
    //   153: iload 6
    //   155: iconst_1
    //   156: if_icmpne +109 -> 265
    //   159: new 13	android/support/v7/widget/AppCompatSpinner$b
    //   162: dup
    //   163: aload_0
    //   164: aload_0
    //   165: getfield 121	android/support/v7/widget/AppCompatSpinner:Jn	Landroid/content/Context;
    //   168: aload_2
    //   169: iload_3
    //   170: invokespecial 142	android/support/v7/widget/AppCompatSpinner$b:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   173: astore 7
    //   175: aload_0
    //   176: getfield 121	android/support/v7/widget/AppCompatSpinner:Jn	Landroid/content/Context;
    //   179: aload_2
    //   180: getstatic 87	android/support/v7/a/a$k:Spinner	[I
    //   183: iload_3
    //   184: invokestatic 92	android/support/v7/widget/ap:a	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/widget/ap;
    //   187: astore 9
    //   189: aload_0
    //   190: aload 9
    //   192: getstatic 145	android/support/v7/a/a$k:Spinner_android_dropDownWidth	I
    //   195: bipush -2
    //   197: invokevirtual 148	android/support/v7/widget/ap:getLayoutDimension	(II)I
    //   200: putfield 150	android/support/v7/widget/AppCompatSpinner:MU	I
    //   203: aload 7
    //   205: aload 9
    //   207: getstatic 153	android/support/v7/a/a$k:Spinner_android_popupBackground	I
    //   210: invokevirtual 157	android/support/v7/widget/ap:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   213: invokevirtual 161	android/support/v7/widget/AppCompatSpinner$b:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   216: getstatic 164	android/support/v7/a/a$k:Spinner_android_prompt	I
    //   219: istore 4
    //   221: aload 7
    //   223: aload 8
    //   225: getfield 168	android/support/v7/widget/ap:Ww	Landroid/content/res/TypedArray;
    //   228: iload 4
    //   230: invokevirtual 172	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   233: putfield 176	android/support/v7/widget/AppCompatSpinner$b:MZ	Ljava/lang/CharSequence;
    //   236: aload 9
    //   238: getfield 168	android/support/v7/widget/ap:Ww	Landroid/content/res/TypedArray;
    //   241: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   244: aload_0
    //   245: aload 7
    //   247: putfield 178	android/support/v7/widget/AppCompatSpinner:MT	Landroid/support/v7/widget/AppCompatSpinner$b;
    //   250: aload_0
    //   251: new 8	android/support/v7/widget/AppCompatSpinner$1
    //   254: dup
    //   255: aload_0
    //   256: aload_0
    //   257: aload 7
    //   259: invokespecial 181	android/support/v7/widget/AppCompatSpinner$1:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$b;)V
    //   262: putfield 183	android/support/v7/widget/AppCompatSpinner:Hx	Landroid/support/v7/widget/ListPopupWindow$b;
    //   265: getstatic 186	android/support/v7/a/a$k:Spinner_android_entries	I
    //   268: istore 4
    //   270: aload 8
    //   272: getfield 168	android/support/v7/widget/ap:Ww	Landroid/content/res/TypedArray;
    //   275: iload 4
    //   277: invokevirtual 190	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   280: astore 7
    //   282: aload 7
    //   284: ifnull +28 -> 312
    //   287: new 192	android/widget/ArrayAdapter
    //   290: dup
    //   291: aload_1
    //   292: ldc -63
    //   294: aload 7
    //   296: invokespecial 196	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   299: astore_1
    //   300: aload_1
    //   301: getstatic 201	android/support/v7/a/a$h:support_simple_spinner_dropdown_item	I
    //   304: invokevirtual 205	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   307: aload_0
    //   308: aload_1
    //   309: invokevirtual 209	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   312: aload 8
    //   314: getfield 168	android/support/v7/widget/ap:Ww	Landroid/content/res/TypedArray;
    //   317: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   320: aload_0
    //   321: iconst_1
    //   322: putfield 211	android/support/v7/widget/AppCompatSpinner:MS	Z
    //   325: aload_0
    //   326: getfield 213	android/support/v7/widget/AppCompatSpinner:MR	Landroid/widget/SpinnerAdapter;
    //   329: ifnull +16 -> 345
    //   332: aload_0
    //   333: aload_0
    //   334: getfield 213	android/support/v7/widget/AppCompatSpinner:MR	Landroid/widget/SpinnerAdapter;
    //   337: invokevirtual 209	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   340: aload_0
    //   341: aconst_null
    //   342: putfield 213	android/support/v7/widget/AppCompatSpinner:MR	Landroid/widget/SpinnerAdapter;
    //   345: aload_0
    //   346: getfield 107	android/support/v7/widget/AppCompatSpinner:Mc	Landroid/support/v7/widget/f;
    //   349: aload_2
    //   350: iload_3
    //   351: invokevirtual 216	android/support/v7/widget/f:b	(Landroid/util/AttributeSet;I)V
    //   354: return
    //   355: getstatic 51	android/support/v7/widget/AppCompatSpinner:MO	Z
    //   358: ifne +9 -> 367
    //   361: aload_1
    //   362: astore 7
    //   364: goto -284 -> 80
    //   367: aconst_null
    //   368: astore 7
    //   370: goto -290 -> 80
    //   373: astore 7
    //   375: aconst_null
    //   376: astore 7
    //   378: iload 4
    //   380: istore 6
    //   382: aload 7
    //   384: ifnull -231 -> 153
    //   387: aload 7
    //   389: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   392: iload 4
    //   394: istore 6
    //   396: goto -243 -> 153
    //   399: astore_1
    //   400: aconst_null
    //   401: astore_2
    //   402: aload_2
    //   403: ifnull +7 -> 410
    //   406: aload_2
    //   407: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   410: aload_1
    //   411: athrow
    //   412: iconst_1
    //   413: istore 6
    //   415: goto -262 -> 153
    //   418: astore_1
    //   419: aload 7
    //   421: astore_2
    //   422: goto -20 -> 402
    //   425: astore 9
    //   427: goto -49 -> 378
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	430	0	this	AppCompatSpinner
    //   0	430	1	paramContext	Context
    //   0	430	2	paramAttributeSet	AttributeSet
    //   0	430	3	paramInt1	int
    //   0	430	4	paramInt2	int
    //   61	89	5	i	int
    //   137	277	6	j	int
    //   78	291	7	localObject1	Object
    //   373	1	7	localException1	Exception
    //   376	44	7	localObject2	Object
    //   27	286	8	localap1	ap
    //   187	50	9	localap2	ap
    //   425	1	9	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   101	113	373	java/lang/Exception
    //   101	113	399	finally
    //   117	135	418	finally
    //   117	135	425	java/lang/Exception
  }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i2 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int j = Math.max(0, i - (15 - (i2 - i)));
    i = 0;
    View localView = null;
    int k = 0;
    if (j < i2)
    {
      int m = paramSpinnerAdapter.getItemViewType(j);
      if (m == i) {
        break label204;
      }
      localView = null;
      i = m;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(j, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.bJ);
        return this.bJ.left + this.bJ.right + k;
      }
      return k;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Mc != null) {
      this.Mc.eG();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    if (this.MT != null) {
      return this.MT.PN;
    }
    if (MP) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public int getDropDownVerticalOffset()
  {
    if (this.MT != null)
    {
      localb = this.MT;
      if (localb.PQ) {}
    }
    while (!MP)
    {
      b localb;
      return 0;
      return localb.PO;
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    if (this.MT != null) {
      return this.MU;
    }
    if (MP) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public Drawable getPopupBackground()
  {
    if (this.MT != null) {
      return this.MT.PK.getBackground();
    }
    if (MP) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public Context getPopupContext()
  {
    if (this.MT != null) {
      return this.Jn;
    }
    if (MO) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public CharSequence getPrompt()
  {
    if (this.MT != null) {
      return this.MT.MZ;
    }
    return super.getPrompt();
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintList();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.MT != null) && (this.MT.PK.isShowing())) {
      this.MT.dismiss();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.MT != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.Hx != null) && (this.Hx.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    if (this.MT != null)
    {
      if (!this.MT.PK.isShowing()) {
        this.MT.show();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.MS) {
      this.MR = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.MT == null);
    if (this.Jn == null) {}
    for (Context localContext = getContext();; localContext = this.Jn)
    {
      this.MT.setAdapter(new a(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.Mc != null) {
      this.Mc.b(null);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.Mc != null) {
      this.Mc.aT(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.MT != null) {
      this.MT.PN = paramInt;
    }
    while (!MP) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.MT != null) {
      this.MT.setVerticalOffset(paramInt);
    }
    while (!MP) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (this.MT != null) {
      this.MU = paramInt;
    }
    while (!MP) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.MT != null) {
      this.MT.setBackgroundDrawable(paramDrawable);
    }
    while (!MP) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(a.f(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.MT != null)
    {
      this.MT.MZ = paramCharSequence;
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  private static final class a
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter MX;
    private ListAdapter MY;
    
    public a(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
    {
      this.MX = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        this.MY = ((ListAdapter)paramSpinnerAdapter);
      }
      if ((paramTheme != null) && (AppCompatSpinner.MO) && ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter)))
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
    }
    
    public final boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = this.MY;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public final int getCount()
    {
      if (this.MX == null) {
        return 0;
      }
      return this.MX.getCount();
    }
    
    public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (this.MX == null) {
        return null;
      }
      return this.MX.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final Object getItem(int paramInt)
    {
      if (this.MX == null) {
        return null;
      }
      return this.MX.getItem(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      if (this.MX == null) {
        return -1L;
      }
      return this.MX.getItemId(paramInt);
    }
    
    public final int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final int getViewTypeCount()
    {
      return 1;
    }
    
    public final boolean hasStableIds()
    {
      return (this.MX != null) && (this.MX.hasStableIds());
    }
    
    public final boolean isEmpty()
    {
      return getCount() == 0;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = this.MY;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.MX != null) {
        this.MX.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.MX != null) {
        this.MX.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  private final class b
    extends ListPopupWindow
  {
    private ListAdapter Do;
    CharSequence MZ;
    private final Rect Na = new Rect();
    
    public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      this.PW = AppCompatSpinner.this;
      setModal(true);
      this.PV = 0;
      this.PY = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppCompatSpinner.this.setSelection(paramAnonymousInt);
          if (AppCompatSpinner.this.getOnItemClickListener() != null) {
            AppCompatSpinner.this.performItemClick(paramAnonymousView, paramAnonymousInt, AppCompatSpinner.b.a(AppCompatSpinner.b.this).getItemId(paramAnonymousInt));
          }
          AppCompatSpinner.b.this.dismiss();
        }
      };
    }
    
    final void eK()
    {
      Object localObject = this.PK.getBackground();
      int i;
      int m;
      int n;
      int i1;
      int j;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(AppCompatSpinner.b(AppCompatSpinner.this));
        if (at.bv(AppCompatSpinner.this))
        {
          i = AppCompatSpinner.b(AppCompatSpinner.this).right;
          m = AppCompatSpinner.this.getPaddingLeft();
          n = AppCompatSpinner.this.getPaddingRight();
          i1 = AppCompatSpinner.this.getWidth();
          if (AppCompatSpinner.c(AppCompatSpinner.this) != -2) {
            break label246;
          }
          j = AppCompatSpinner.a(AppCompatSpinner.this, (SpinnerAdapter)this.Do, this.PK.getBackground());
          int k = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(AppCompatSpinner.this).left - AppCompatSpinner.b(AppCompatSpinner.this).right;
          if (j <= k) {
            break label294;
          }
          j = k;
        }
      }
      label171:
      label246:
      label294:
      for (;;)
      {
        setContentWidth(Math.max(j, i1 - m - n));
        if (at.bv(AppCompatSpinner.this)) {
          i = i1 - n - this.MU + i;
        }
        for (;;)
        {
          this.PN = i;
          return;
          i = -AppCompatSpinner.b(AppCompatSpinner.this).left;
          break;
          localObject = AppCompatSpinner.b(AppCompatSpinner.this);
          AppCompatSpinner.b(AppCompatSpinner.this).right = 0;
          ((Rect)localObject).left = 0;
          i = 0;
          break;
          if (AppCompatSpinner.c(AppCompatSpinner.this) == -1)
          {
            setContentWidth(i1 - m - n);
            break label171;
          }
          setContentWidth(AppCompatSpinner.c(AppCompatSpinner.this));
          break label171;
          i += m;
        }
      }
    }
    
    public final void setAdapter(ListAdapter paramListAdapter)
    {
      super.setAdapter(paramListAdapter);
      this.Do = paramListAdapter;
    }
    
    public final void show()
    {
      boolean bool = this.PK.isShowing();
      eK();
      fo();
      super.show();
      this.PL.setChoiceMode(1);
      int i = AppCompatSpinner.this.getSelectedItemPosition();
      Object localObject = this.PL;
      if ((this.PK.isShowing()) && (localObject != null))
      {
        ListPopupWindow.a.a((ListPopupWindow.a)localObject, false);
        ((ListPopupWindow.a)localObject).setSelection(i);
        if ((Build.VERSION.SDK_INT >= 11) && (((ListPopupWindow.a)localObject).getChoiceMode() != 0)) {
          ((ListPopupWindow.a)localObject).setItemChecked(i, true);
        }
      }
      if (bool) {}
      do
      {
        return;
        localObject = AppCompatSpinner.this.getViewTreeObserver();
      } while (localObject == null);
      final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          if (!AppCompatSpinner.b.a(AppCompatSpinner.b.this, AppCompatSpinner.this))
          {
            AppCompatSpinner.b.this.dismiss();
            return;
          }
          AppCompatSpinner.b.this.eK();
          AppCompatSpinner.b.b(AppCompatSpinner.b.this);
        }
      };
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
      setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          ViewTreeObserver localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
          if (localViewTreeObserver != null) {
            localViewTreeObserver.removeGlobalOnLayoutListener(local2);
          }
        }
      });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */