package android.support.v7.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.i;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class g
  extends MenuInflater
{
  private static final Class<?>[] GA;
  private static final Class<?>[] Gz;
  private final Object[] GB;
  private final Object[] GC;
  private Object GD;
  private Context mContext;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    Gz = arrayOfClass;
    GA = arrayOfClass;
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.GB = new Object[] { paramContext };
    this.GC = this.GB;
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    label49:
    int j;
    int k;
    if (i == 2)
    {
      paramMenu = paramXmlPullParser.getName();
      if (paramMenu.equals("menu"))
      {
        i = paramXmlPullParser.next();
        int m = 0;
        paramMenu = null;
        j = 0;
        k = i;
        i = m;
        label65:
        if (i != 0) {
          return;
        }
      }
    }
    switch (k)
    {
    default: 
    case 2: 
    case 3: 
      for (;;)
      {
        k = paramXmlPullParser.next();
        break label65;
        throw new RuntimeException("Expecting menu, got " + paramMenu);
        j = paramXmlPullParser.next();
        i = j;
        if (j != 1) {
          break;
        }
        i = j;
        break label49;
        if (j == 0)
        {
          Object localObject = paramXmlPullParser.getName();
          if (((String)localObject).equals("group"))
          {
            localObject = localb.He.mContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuGroup);
            localb.GG = ((TypedArray)localObject).getResourceId(a.k.MenuGroup_android_id, 0);
            localb.GH = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_menuCategory, 0);
            localb.GI = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_orderInCategory, 0);
            localb.GJ = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_checkableBehavior, 0);
            localb.GK = ((TypedArray)localObject).getBoolean(a.k.MenuGroup_android_visible, true);
            localb.GL = ((TypedArray)localObject).getBoolean(a.k.MenuGroup_android_enabled, true);
            ((TypedArray)localObject).recycle();
          }
          else
          {
            if (((String)localObject).equals("item"))
            {
              localObject = localb.He.mContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuItem);
              localb.GN = ((TypedArray)localObject).getResourceId(a.k.MenuItem_android_id, 0);
              localb.GO = (((TypedArray)localObject).getInt(a.k.MenuItem_android_menuCategory, localb.GH) & 0xFFFF0000 | ((TypedArray)localObject).getInt(a.k.MenuItem_android_orderInCategory, localb.GI) & 0xFFFF);
              localb.GP = ((TypedArray)localObject).getText(a.k.MenuItem_android_title);
              localb.GQ = ((TypedArray)localObject).getText(a.k.MenuItem_android_titleCondensed);
              localb.GR = ((TypedArray)localObject).getResourceId(a.k.MenuItem_android_icon, 0);
              localb.GS = b.N(((TypedArray)localObject).getString(a.k.MenuItem_android_alphabeticShortcut));
              localb.GT = b.N(((TypedArray)localObject).getString(a.k.MenuItem_android_numericShortcut));
              if (((TypedArray)localObject).hasValue(a.k.MenuItem_android_checkable)) {
                if (((TypedArray)localObject).getBoolean(a.k.MenuItem_android_checkable, false))
                {
                  k = 1;
                  label469:
                  localb.GU = k;
                  label476:
                  localb.GV = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_checked, false);
                  localb.GW = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_visible, localb.GK);
                  localb.GX = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_enabled, localb.GL);
                  localb.GY = ((TypedArray)localObject).getInt(a.k.MenuItem_showAsAction, -1);
                  localb.Hc = ((TypedArray)localObject).getString(a.k.MenuItem_android_onClick);
                  localb.GZ = ((TypedArray)localObject).getResourceId(a.k.MenuItem_actionLayout, 0);
                  localb.Ha = ((TypedArray)localObject).getString(a.k.MenuItem_actionViewClass);
                  localb.Hb = ((TypedArray)localObject).getString(a.k.MenuItem_actionProviderClass);
                  if (localb.Hb == null) {
                    break label687;
                  }
                  k = 1;
                  label604:
                  if ((k == 0) || (localb.GZ != 0) || (localb.Ha != null)) {
                    break label693;
                  }
                }
              }
              label687:
              label693:
              for (localb.Hd = ((d)localb.newInstance(localb.Hb, GA, localb.He.GC));; localb.Hd = null)
              {
                ((TypedArray)localObject).recycle();
                localb.GM = false;
                break;
                k = 0;
                break label469;
                localb.GU = localb.GJ;
                break label476;
                k = 0;
                break label604;
              }
            }
            if (((String)localObject).equals("menu"))
            {
              a(paramXmlPullParser, paramAttributeSet, localb.dw());
            }
            else
            {
              paramMenu = (Menu)localObject;
              j = 1;
              continue;
              localObject = paramXmlPullParser.getName();
              if ((j != 0) && (((String)localObject).equals(paramMenu)))
              {
                paramMenu = null;
                j = 0;
              }
              else if (((String)localObject).equals("group"))
              {
                localb.dv();
              }
              else if (((String)localObject).equals("item"))
              {
                if (!localb.GM) {
                  if ((localb.Hd != null) && (localb.Hd.hasSubMenu()))
                  {
                    localb.dw();
                  }
                  else
                  {
                    localb.GM = true;
                    localb.e(localb.GF.add(localb.GG, localb.GN, localb.GO, localb.GP));
                  }
                }
              }
              else if (((String)localObject).equals("menu"))
              {
                i = 1;
              }
            }
          }
        }
      }
    }
    throw new RuntimeException("Unexpected end of document");
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 347
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 349	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 5
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 38	android/support/v7/view/g:mContext	Landroid/content/Context;
    //   26: invokevirtual 353	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 359	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 4
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 5
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 365	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 301	android/support/v7/view/g:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 370 1 0
    //   70: return
    //   71: astore_2
    //   72: aload 4
    //   74: astore_3
    //   75: new 372	android/view/InflateException
    //   78: dup
    //   79: ldc_w 374
    //   82: aload_2
    //   83: invokespecial 377	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: athrow
    //   87: astore_2
    //   88: aload_3
    //   89: ifnull +9 -> 98
    //   92: aload_3
    //   93: invokeinterface 370 1 0
    //   98: aload_2
    //   99: athrow
    //   100: astore_2
    //   101: aload 5
    //   103: astore_3
    //   104: new 372	android/view/InflateException
    //   107: dup
    //   108: ldc_w 374
    //   111: aload_2
    //   112: invokespecial 377	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	g
    //   0	116	1	paramInt	int
    //   0	116	2	paramMenu	Menu
    //   15	89	3	localObject1	Object
    //   20	53	4	localObject2	Object
    //   17	85	5	localObject3	Object
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	71	org/xmlpull/v1/XmlPullParserException
    //   46	58	71	org/xmlpull/v1/XmlPullParserException
    //   22	35	87	finally
    //   46	58	87	finally
    //   75	87	87	finally
    //   104	116	87	finally
    //   22	35	100	java/io/IOException
    //   46	58	100	java/io/IOException
  }
  
  private static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    private static final Class<?>[] GE = { MenuItem.class };
    private Object GD;
    private Method mMethod;
    
    public a(Object paramObject, String paramString)
    {
      this.GD = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        this.mMethod = localClass.getMethod(paramString, GE);
        return;
      }
      catch (Exception paramObject)
      {
        paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (this.mMethod.getReturnType() == Boolean.TYPE) {
          return ((Boolean)this.mMethod.invoke(this.GD, new Object[] { paramMenuItem })).booleanValue();
        }
        this.mMethod.invoke(this.GD, new Object[] { paramMenuItem });
        return true;
      }
      catch (Exception paramMenuItem)
      {
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  private final class b
  {
    Menu GF;
    int GG;
    int GH;
    int GI;
    int GJ;
    boolean GK;
    boolean GL;
    boolean GM;
    int GN;
    int GO;
    CharSequence GP;
    CharSequence GQ;
    int GR;
    char GS;
    char GT;
    int GU;
    boolean GV;
    boolean GW;
    boolean GX;
    int GY;
    int GZ;
    String Ha;
    String Hb;
    String Hc;
    d Hd;
    
    public b(Menu paramMenu)
    {
      this.GF = paramMenu;
      dv();
    }
    
    static char N(String paramString)
    {
      if (paramString == null) {
        return '\000';
      }
      return paramString.charAt(0);
    }
    
    public final void dv()
    {
      this.GG = 0;
      this.GH = 0;
      this.GI = 0;
      this.GJ = 0;
      this.GK = true;
      this.GL = true;
    }
    
    public final SubMenu dw()
    {
      this.GM = true;
      SubMenu localSubMenu = this.GF.addSubMenu(this.GG, this.GN, this.GO, this.GP);
      e(localSubMenu.getItem());
      return localSubMenu;
    }
    
    final void e(MenuItem paramMenuItem)
    {
      int i = 1;
      Object localObject = paramMenuItem.setChecked(this.GV).setVisible(this.GW).setEnabled(this.GX);
      if (this.GU > 0) {}
      for (boolean bool = true;; bool = false)
      {
        ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.GQ).setIcon(this.GR).setAlphabeticShortcut(this.GS).setNumericShortcut(this.GT);
        if (this.GY >= 0) {
          m.a(paramMenuItem, this.GY);
        }
        if (this.Hc == null) {
          break label161;
        }
        if (!g.a(g.this).isRestricted()) {
          break;
        }
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
      paramMenuItem.setOnMenuItemClickListener(new g.a(g.b(g.this), this.Hc));
      label161:
      if (this.GU >= 2)
      {
        if ((paramMenuItem instanceof h)) {
          ((h)paramMenuItem).K(true);
        }
      }
      else
      {
        if (this.Ha == null) {
          break label339;
        }
        m.a(paramMenuItem, (View)newInstance(this.Ha, g.du(), g.c(g.this)));
      }
      for (;;)
      {
        if ((this.GZ > 0) && (i == 0)) {
          m.b(paramMenuItem, this.GZ);
        }
        if (this.Hd != null) {
          m.a(paramMenuItem, this.Hd);
        }
        return;
        if (!(paramMenuItem instanceof i)) {
          break;
        }
        localObject = (i)paramMenuItem;
        try
        {
          if (((i)localObject).IQ == null) {
            ((i)localObject).IQ = ((b)((i)localObject).HM).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
          }
          ((i)localObject).IQ.invoke(((i)localObject).HM, new Object[] { Boolean.valueOf(true) });
        }
        catch (Exception localException) {}
        break;
        label339:
        i = 0;
      }
    }
    
    final <T> T newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramString = g.a(g.this).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
        paramString.setAccessible(true);
        paramString = paramString.newInstance(paramArrayOfObject);
        return paramString;
      }
      catch (Exception paramString) {}
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */